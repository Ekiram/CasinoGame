package org.fungover.casinogame;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameMenuRepository extends CrudRepository<GameMenu, Long>{



}
