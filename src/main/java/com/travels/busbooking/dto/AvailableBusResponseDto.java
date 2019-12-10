package com.travels.busbooking.dto;

import java.util.List;

import com.travels.busbooking.entity.Bus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvailableBusResponseDto {
	private List<Bus> busList;
	private Integer statusCode;
	private String statusMessage;
}
