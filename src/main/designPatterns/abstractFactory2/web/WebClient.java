package main.designPatterns.abstractFactory2.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import main.designPatterns.abstractFactory2.domain.product.Product;
import main.designPatterns.abstractFactory2.domain.product.dao.ProductDao;
import main.designPatterns.abstractFactory2.domain.userinfo.UserInfo;
import main.designPatterns.abstractFactory2.domain.userinfo.dao.UserInfoDao;
import main.designPatterns.abstractFactory2.factory.DaoFactory;
import main.designPatterns.abstractFactory2.factory.MySqlDaoFactory;
import main.designPatterns.abstractFactory2.factory.OracleDaoFactory;

public class WebClient {

  public static void main(String[] args) throws IOException {

    FileInputStream fis =
        new FileInputStream("src/main/designPatterns/abstractFactory2/db.properties");
    Properties prop = new Properties();

    prop.load(fis);

    String dbType = prop.getProperty("DBTYPE");
    System.out.println(dbType);

    UserInfo userInfo = new UserInfo();
    userInfo.setUserId("user11");
    userInfo.setPassword("12!@");
    userInfo.setUserName("이순신");

    Product product = new Product();
    product.setProductId("product11");
    product.setProductName("TV");

    DaoFactory daoFactory = null;

    if (dbType.equals("MYSQL")) {
      daoFactory = new MySqlDaoFactory();
    } else if (dbType.equals("ORACLE")) {
      daoFactory = new OracleDaoFactory();
    } else {
      System.out.println("error");
    }

    UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
    System.out.println("======UserInfo Transaction======");
    userInfoDao.insertUserInfo(userInfo);
    userInfoDao.updateUserInfo(userInfo);
    userInfoDao.deleteUserInfo(userInfo);

    ProductDao productDao = daoFactory.createProductDao();
    System.out.println("======Product Transaction======");
    productDao.insertProduct(product);
    productDao.updateProduct(product);
    productDao.deleteProduct(product);

  }

}
