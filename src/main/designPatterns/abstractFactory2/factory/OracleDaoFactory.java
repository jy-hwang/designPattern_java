package main.designPatterns.abstractFactory2.factory;

import main.designPatterns.abstractFactory2.domain.product.dao.ProductDao;
import main.designPatterns.abstractFactory2.domain.product.dao.oracle.ProductOracleDao;
import main.designPatterns.abstractFactory2.domain.userinfo.dao.UserInfoDao;
import main.designPatterns.abstractFactory2.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class OracleDaoFactory implements DaoFactory {

  @Override
  public UserInfoDao createUserInfoDao() {
    return new UserInfoOracleDao();
  }

  @Override
  public ProductDao createProductDao() {
    return new ProductOracleDao();
  }



}
