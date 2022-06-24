package org.fungover.casinogame;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.naming.Name;

@Repository
public interface HighscoreRepository extends CrudRepository <Name, Long> {
    Name findNameBy(String name);

    @Query("select u.name from")
    Iterable<String> getNameOnly;

}
