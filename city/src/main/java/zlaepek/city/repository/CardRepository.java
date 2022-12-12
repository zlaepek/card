package zlaepek.city.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import zlaepek.city.model.Card;

import java.util.List;


public interface CardRepository extends JpaRepository<Card, Integer> {

    @Override
    List<Card> findAll();
}