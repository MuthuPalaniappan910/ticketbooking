package com.travels.busbooking.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travels.busbooking.entity.Bus;
import com.travels.busbooking.repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {
	@Autowired
	BusRepository busRepository;

	@Override
	public List<Bus> displayAvailableBuses(String source, String destination,
			LocalDate journeyDate) {
		return null;
	}

}
