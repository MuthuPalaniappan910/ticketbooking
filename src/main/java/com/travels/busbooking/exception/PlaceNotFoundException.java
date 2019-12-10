package com.travels.busbooking.exception;

public class PlaceNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public PlaceNotFoundException(String exception) {
		super(exception);
	}
}