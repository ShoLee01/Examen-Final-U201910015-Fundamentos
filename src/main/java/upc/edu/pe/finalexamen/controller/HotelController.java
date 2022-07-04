package upc.edu.pe.finalexamen.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.finalexamen.entity.Hotel;
import upc.edu.pe.finalexamen.service.HotelService;

import java.util.List;

@Slf4j
@Controller
@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping(value = "/getAllHotels")
    public List<Hotel> getAllProducts(){
        List<Hotel> products = hotelService.findAll();
        if (products == null) {
            return null;
        }
        return products;
    }

    @GetMapping(value = "/getHotelById/{id}")
    public Hotel getProductById(@PathVariable("id") Long id){
        Hotel product = hotelService.findById(id);
        if (product == null) {
            return null;
        }
        return product;
    }

    @GetMapping(value = "/getByLowerPrice/{price}")
    public List<Hotel> getByLowerPrice(@PathVariable("price") double price){
        List<Hotel> products = hotelService.findByLowerPrice(price);
        if (products == null) {
            return null;
        }
        return products;
    }
    @PostMapping(value = "/createHotel")
    public Hotel createProduct(@RequestBody Hotel product){
        Hotel product1 = hotelService.createHotel(product);
        if (product1 == null) {
            return null;
        }
        return product1;
    }

}
