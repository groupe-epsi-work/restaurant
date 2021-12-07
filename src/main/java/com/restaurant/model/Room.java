package com.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Table> tables = new ArrayList<Table>(); 

    public Room(int nbOfTables){
        for(int i = 0; i < nbOfTables; i++){
            tables.add(new Table());
        }
    }
}
