package fab.Sar.pattern.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fab.Sar.pattern.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
