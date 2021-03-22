package com.cts.flight;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.flight.dao.AirlineInfoDao;
import com.cts.flight.dao.FlightDao;
import com.cts.flight.entity.AirlineInfo;
import com.cts.flight.entity.FlightInfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		FlightDao flightDao = ac.getBean(FlightDao.class);
		AirlineInfoDao airlineInfoDao = ac.getBean(AirlineInfoDao.class);

		/*
		
		flightDao.findAll().forEach(flight -> {
			System.out.println(flight.getId());
			System.out.println(flight.getFlightNumber());
			System.out.println(flight.getOrigin());
			System.out.println(flight.getDestination());
			System.out.println(flight.getDuration());
			System.out.println(flight.getFlightDate());
			System.out.println(flight.getFlightTime());
			System.out.println(flight.getFare().getCurrency() + "." + flight.getFare().getFare());
			System.out.println(flight.getInventory().getCount());
			System.out.println("--------------------------------------------------------");
		});
		*/
		
		
		/*
		
		flightDao.findFlightByOriginAndDestinationAndFlightDate("Delhi", "Chennai", LocalDate.of(2021, 02, 26)).forEach(flight->{
			System.out.println(flight.getId());
			System.out.println(flight.getFlightNumber());
			System.out.println(flight.getOrigin());
			System.out.println(flight.getDestination());
			System.out.println(flight.getDuration());
			System.out.println(flight.getFlightDate());
			System.out.println(flight.getFlightTime());
			System.out.println(flight.getFare().getCurrency() + "." + flight.getFare().getFare());
			System.out.println(flight.getInventory().getCount());
			System.out.println("--------------------------------------------------------");
		});
		
		*/
		
		
		
		
		AirlineInfo airlineInfo= airlineInfoDao.findById(4).orElse(null);
		
		System.out.println(airlineInfo.getAirlineId());
		System.out.println(airlineInfo.getAirlineName());
		System.out.println(airlineInfo.getAirlineLogo());
		
		for(FlightInfo fi:airlineInfo.getFlightInfo()) {
			System.out.println(fi.getFlightInfoid());
			System.out.println(fi.getFlightNumber());
			System.out.println(fi.getFlightType());
			System.out.println(fi.getSeatCapacity());
			System.out.println(fi.getAirlineInfo().getAirlineName());
			System.out.println("------------------------------------------------");
		}
		
		
		
	}

}
