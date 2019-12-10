package com.travels.busbooking.service;

import java.time.LocalDate;
import java.util.List;

import com.travels.busbooking.entity.Bus;

public interface BusService {

	List<Bus> displayAvailableBuses(String source, String destination, LocalDate journeyDate);

}
