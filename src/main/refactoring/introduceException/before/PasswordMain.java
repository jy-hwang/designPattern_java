package main.refactoring.introduceException.before;

public class PasswordMain {

  public static void main(String[] args) {
    Password passwordInstance = new Password();

    String password = null;
    passwordInstance.setPassword(password);

    password = "abcd";
    passwordInstance.setPassword(password);

    password = "abcde";
    passwordInstance.setPassword(password);

    password = "abcde1!";
    passwordInstance.setPassword(password);

  }

}
