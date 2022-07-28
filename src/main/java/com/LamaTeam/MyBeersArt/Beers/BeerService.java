package com.LamaTeam.MyBeersArt.Beers;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerService {

    public BeerDTO getBeer (Beer oneBeer){
        //return new BeerDTO();
        return BeerDTO.of(UUID.randomUUID()); //TODO get a beer from DB
    }

    public BeerDTO createNewBeer(String name){
        return new BeerDTO(UUID.randomUUID(), name);
    }
}
