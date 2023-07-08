package com.example.cinema_tickets.screens.BookingMovie

import androidx.lifecycle.ViewModel
import com.example.cinema_tickets.screens.BookingMovie.composables.Seat
import com.example.cinema_tickets.screens.BookingMovie.composables.SeatState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class CinemaViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(listOf<Seat>())
    val state = _state.asStateFlow()

    init {
        getCinemaSeats()
    }

    private fun getCinemaSeats() {
        val random = Random.Default
        for (i in 1..30) {
            _state.update {
                val seatState =
                    if (random.nextBoolean()) SeatState.Available else SeatState.Busy
                it + Seat(i, seatState)
            }
        }

    }

    fun onSeatClick(seat: Seat) {
        if (seat.state == SeatState.Available) {
            reserveSeat(seat)
        }
        if (seat.state == SeatState.Selected) {
            cancelReservation(seat)
        }
    }

    private fun cancelReservation(seat: Seat) {
        _state.update {
            it.map { s ->
                if (s.id == seat.id) {
                    s.copy(state = SeatState.Available)
                } else {
                    s
                }
            }
        }
    }

    private fun reserveSeat(seat: Seat) {
        _state.update {
            it.map { s ->
                if (s.id == seat.id) {
                    s.copy(state = SeatState.Selected)
                } else {
                    s
                }
            }
        }
    }
}
