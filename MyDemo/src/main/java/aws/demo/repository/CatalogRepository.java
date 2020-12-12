package aws.demo.repository;

import org.springframework.stereotype.Repository;

import aws.demo.catalog.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CatalogRepository extends CrudRepository<Product, Integer> {

}
