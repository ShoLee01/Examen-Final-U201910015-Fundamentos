package upc.edu.pe.finalexamen.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.finalexamen.entity.Hotel;
import upc.edu.pe.finalexamen.repository.HotelRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
       Hotel hotel1 = new Hotel();
         hotel1.setName(hotel.getName());
         hotel1.setPrice(hotel.getPrice());
         hotel1.setStartDate(hotel.getStartDate());
         hotel1.setEndDate(hotel.getEndDate());

        hotelRepository.save(hotel1);
        return hotel1;
    }

    @Override
    public List<Hotel> findByLowerPrice(double price) {
        return hotelRepository.findByLowerPrice(price);
    }

    @Override
    public Hotel findById(Long id) {
       return hotelRepository.findById(id).orElse(null);
    }

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }
}
