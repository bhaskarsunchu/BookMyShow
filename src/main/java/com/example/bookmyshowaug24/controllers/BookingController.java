package com.example.bookmyshowaug24.controllers;

import com.example.bookmyshowaug24.dtos.BookMovieRequestDto;
import com.example.bookmyshowaug24.dtos.BookMovieResponseDto;
import com.example.bookmyshowaug24.exceptions.InvalidShowException;
import com.example.bookmyshowaug24.exceptions.InvalidUserIdException;
import com.example.bookmyshowaug24.exceptions.ShowSeatNotAvailableException;
import com.example.bookmyshowaug24.models.Booking;
import com.example.bookmyshowaug24.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public Booking bookMovie(BookMovieRequestDto requestDto) throws InvalidUserIdException, ShowSeatNotAvailableException, InvalidShowException {
        return bookingService.bookMovie(requestDto.getUserId(), requestDto.getShowId(), requestDto.getShowSeatIds());
    }
}
