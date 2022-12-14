package com.LamaTeam.MyBeersArt.Beers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@RequiredArgsConstructor(staticName="of")
@Data
public class Beer {

    private final UUID id;
    private String name;

}
