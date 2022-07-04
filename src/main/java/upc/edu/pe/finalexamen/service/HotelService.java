package upc.edu.pe.finalexamen.service;

import org.springframework.stereotype.Service;
import upc.edu.pe.finalexamen.entity.Hotel;

import java.util.List;

@Service
public interface HotelService {
        Hotel createHotel(Hotel hotel);

        List<Hotel> findByLowerPrice(double price);

        Hotel findById(Long id);

        List<Hotel> findAll();
}
