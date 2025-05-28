package com.nestor.markethubconnect.services;

import com.nestor.markethubconnect.repositories.*;
import com.nestor.markethubconnect.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {

    @Autowired
    private MarketRepository repository;

    public List<Market> getAllMarkets() {
        return repository.findAll();
    }

    public Market saveMarket(Market market) {
        return repository.save(market);
    }
}
