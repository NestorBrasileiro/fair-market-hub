package com.nestor.markethubconnect.controllers;

import com.nestor.markethubconnect.repositories.*;
import com.nestor.markethubconnect.services.*;
import com.nestor.markethubconnect.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MarketController {

    @Autowired
    private MarketService service;

    @GetMapping('/markets')
    public List<Market> getAll() {
        return service.getAllMarkets();
    }

    @PostMapping('/markets')
    public Market create(@RequestBody Market market) {
        return service.saveMarket(market);
    }

}
