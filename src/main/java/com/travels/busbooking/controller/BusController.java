package com.travels.busbooking.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travels.busbooking.constants.ApplicationConstants;
import com.travels.busbooking.dto.AvailableBusResponseDto;
import com.travels.busbooking.entity.Bus;
import com.travels.busbooking.service.BusService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping
@Slf4j
@RestController
public class BusController {
	@Autowired
	BusService busService;

	@GetMapping()
	public ResponseEntity<AvailableBusResponseDto> displayAvailableBuses(@RequestParam String source,
			@RequestParam String destination, @RequestParam LocalDate journeyDate) {
		List<Bus> busList = busService.displayAvailableBuses(source, destination, journeyDate);
		AvailableBusResponseDto availableBusResponseDto = new AvailableBusResponseDto();
		if (busList.isEmpty()) {
			log.info("No busses found");
			availableBusResponseDto.setStatusCode(ApplicationConstants.AVAILABLE_BUS_FAILURE_CODE);
			availableBusResponseDto.setStatusMessage(ApplicationConstants.AVAILABLE_BUS_FAILURE_MESSAGE);
			return new ResponseEntity<>(availableBusResponseDto, HttpStatus.NOT_FOUND);
		}
		log.info("Busses available are displayed");
		availableBusResponseDto.setBusList(busList);
		availableBusResponseDto.setStatusCode(ApplicationConstants.AVAILABLE_BUS_SUCCESS_CODE);
		availableBusResponseDto.setStatusMessage(ApplicationConstants.AVAILABLE_BUS_SUCCESS_MESSAGE);
		return new ResponseEntity<>(availableBusResponseDto, HttpStatus.OK);
	}

}
