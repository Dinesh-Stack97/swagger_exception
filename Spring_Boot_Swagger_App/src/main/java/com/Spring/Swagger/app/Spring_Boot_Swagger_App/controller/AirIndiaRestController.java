package com.Spring.Swagger.app.Spring_Boot_Swagger_App.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Swagger.app.Spring_Boot_Swagger_App.bindings.PassengerInfo;
import com.Spring.Swagger.app.Spring_Boot_Swagger_App.response.TicketInfo;

@RestController
public class AirIndiaRestController {
	@ResponseBody
	@PostMapping("/bookFlightTicket")
	public ResponseEntity<TicketInfo> bookTicket(PassengerInfo pinfo)
	{
		//logic to book ticket
		
		
		//send ticket information
		TicketInfo ticket = new TicketInfo();
		ticket.setName(pinfo.getFirstName()+" "+pinfo.getLastName());
		ticket.setSource(pinfo.getSource());
		ticket.setDestination(pinfo.getDestination());
		ticket.setTicketStatus("confirmed");
		ticket.setTicketPrice("4500.000 INR");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}

}
