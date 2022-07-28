package com.LamaTeam.MyBeersArt.Beers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor(staticName="of")
@Data
public class Beer {

    private final long id;
    private String name;

}
