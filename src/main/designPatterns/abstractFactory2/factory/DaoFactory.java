package main.designPatterns.abstractFactory2.factory;

import main.designPatterns.abstractFactory2.domain.product.dao.ProductDao;
import main.designPatterns.abstractFactory2.domain.userinfo.dao.UserInfoDao;

public interface DaoFactory {

  public UserInfoDao createUserInfoDao();

  public ProductDao createProductDao();

}
