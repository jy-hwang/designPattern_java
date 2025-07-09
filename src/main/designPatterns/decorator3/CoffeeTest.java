package main.designPatterns.decorator3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CoffeeTest {

  public static void main(String[] args) throws IOException {
    Coffee kenyaCoffee = new KenyaCoffee();

    kenyaCoffee.brewing();
    System.out.println();
    Coffee kenyaLattee = new Latte(kenyaCoffee);
    kenyaLattee.brewing();


    System.out.println();
    Coffee mochaKenya = new MochaCoffee(new Latte(new KenyaCoffee()));

    mochaKenya.brewing();

    // sample
    Socket socket = new Socket();
    BufferedReader br1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br3 = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
    br1.readLine();
  }

}
