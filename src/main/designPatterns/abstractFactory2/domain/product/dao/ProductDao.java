package main.designPatterns.abstractFactory2.domain.product.dao;

import main.designPatterns.abstractFactory2.domain.product.Product;

public interface ProductDao {

  void insertProduct(Product product);

  void updateProduct(Product product);

  void deleteProduct(Product product);

}
