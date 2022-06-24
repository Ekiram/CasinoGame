package org.fungover.casinogame;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GameMenu {

    @Id
    @GeneratedValue
    private int gameId;
    private String games;


}
