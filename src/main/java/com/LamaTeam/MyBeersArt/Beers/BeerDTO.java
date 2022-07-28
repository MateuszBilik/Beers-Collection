package com.LamaTeam.MyBeersArt.Beers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@RequiredArgsConstructor(staticName="of")
public class BeerDTO {

    private final UUID id;
    private String name;
}
