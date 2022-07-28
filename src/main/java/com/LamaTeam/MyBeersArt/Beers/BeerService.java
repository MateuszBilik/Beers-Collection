package com.LamaTeam.MyBeersArt.Beers;

import org.springframework.stereotype.Service;

@Service
public class BeerService {

    public Beer getBeer (Beer oneBeer){
        return Beer.of(12423); //TODO get beer from DB
    }

    public String createNewBeer(){

    }
}
