package main.designPatterns.abstractFactory2.domain.userinfo.dao.mysql;

import main.designPatterns.abstractFactory2.domain.userinfo.UserInfo;
import main.designPatterns.abstractFactory2.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println("insert into MySql DB (userId, password, userName) values ( "
        + userInfo.getUserId() + "," + userInfo.getPassword() + "," + userInfo.getUserName() + ")");
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println("update MySql DB set userName = " + userInfo.getUserName()
        + " where userId = " + userInfo.getUserId());
  }

  @Override
  public void deleteUserInfo(UserInfo userInfo) {
    System.out.println("delete from MySql DB where userId = " + userInfo.getUserId());
  }

}
