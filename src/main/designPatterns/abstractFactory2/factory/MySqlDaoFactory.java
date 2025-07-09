package main.designPatterns.abstractFactory2.factory;

import main.designPatterns.abstractFactory2.domain.product.dao.ProductDao;
import main.designPatterns.abstractFactory2.domain.product.dao.mysql.ProductMySqlDao;
import main.designPatterns.abstractFactory2.domain.userinfo.dao.UserInfoDao;
import main.designPatterns.abstractFactory2.domain.userinfo.dao.mysql.UserInfoMySqlDao;

public class MySqlDaoFactory implements DaoFactory {

  @Override
  public UserInfoDao createUserInfoDao() {
    return new UserInfoMySqlDao();
  }

  @Override
  public ProductDao createProductDao() {
    return new ProductMySqlDao();
  }

}
