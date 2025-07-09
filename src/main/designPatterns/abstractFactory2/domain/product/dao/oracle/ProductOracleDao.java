package main.designPatterns.abstractFactory2.domain.product.dao.oracle;

import main.designPatterns.abstractFactory2.domain.product.Product;
import main.designPatterns.abstractFactory2.domain.product.dao.ProductDao;

public class ProductOracleDao implements ProductDao {

  @Override
  public void insertProduct(Product product) {
    System.out.println("insert into ORACLE DB (productId, productName) values ( "
        + product.getProductId() + "," + product.getProductName() + ")");
  }

  @Override
  public void updateProduct(Product product) {
    System.out.println("update ORACLE DB set productName = " + product.getProductName()
        + " where productId = " + product.getProductId());
  }

  @Override
  public void deleteProduct(Product product) {
    System.out.println("delete from ORACLE DB where productId = " + product.getProductId());
  }

}
