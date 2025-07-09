package main.designPatterns.abstractFactory2.domain.product.dao.mysql;

import main.designPatterns.abstractFactory2.domain.product.Product;
import main.designPatterns.abstractFactory2.domain.product.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {

  @Override
  public void insertProduct(Product product) {
    System.out.println("insert into MySql DB (productId, productName) values ( "
        + product.getProductId() + "," + product.getProductName() + ")");
  }

  @Override
  public void updateProduct(Product product) {
    System.out.println("update MySql DB set productName = " + product.getProductName()
        + " where productId = " + product.getProductId());
  }

  @Override
  public void deleteProduct(Product product) {
    System.out.println("delete from MySql DB where productId = " + product.getProductId());
  }

}
