package com.ifi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ifi.service.AirportsService;

@SpringBootApplication
public class FlightBookingFresher18Application implements CommandLineRunner{
	@Autowired
	AirportsService airportsService;
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FlightBookingFresher18Application.class);
		app.run(args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(airportsService.findAll());
	}
}
