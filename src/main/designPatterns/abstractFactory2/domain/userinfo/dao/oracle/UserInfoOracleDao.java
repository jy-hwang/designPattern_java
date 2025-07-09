package main.designPatterns.abstractFactory2.domain.userinfo.dao.oracle;

import main.designPatterns.abstractFactory2.domain.userinfo.UserInfo;
import main.designPatterns.abstractFactory2.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println("insert into ORACLE DB (userId, password, userName) values ( "
        + userInfo.getUserId() + "," + userInfo.getPassword() + "," + userInfo.getUserName() + ")");
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println("update ORACLE DB set userName = " + userInfo.getUserName()
        + " where userId = " + userInfo.getUserId());
  }

  @Override
  public void deleteUserInfo(UserInfo userInfo) {
    System.out.println("delete from ORACLE DB where userId = " + userInfo.getUserId());
  }

}
