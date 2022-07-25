package lt.bit.products.store.service.domain;

import lt.bit.products.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
