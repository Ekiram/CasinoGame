package org.fungover.casinogame;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Highscore {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    public long getId(){return getId(); }

    public String getName(){return name;}

    public void setName(String name) {this.name = name;}







}
