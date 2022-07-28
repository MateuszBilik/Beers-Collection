package com.LamaTeam.MyBeersArt.Beers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController (BeerService beerService){
        this.beerService = beerService;
    }

    @GetMapping("/beer")
    public BeerDTO getBeer (@RequestParam(value = "name") Beer oneBeer){
        return beerService.getBeer(oneBeer);
    }


    public BeerDTO addNewBeer (@RequestParam(value = "name") String nameOfBeer){
        return beerService.createNewBeer(nameOfBeer);
    }
}
