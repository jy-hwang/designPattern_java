package main.refactoring.controlFlag.after2;

import java.io.FileReader;
import java.util.Iterator;

public class SimpleDataBaseMain {

  public static void main(String[] args) throws Exception {
    SimpleDataBase dataBase =
        new SimpleDataBase(new FileReader("src/main/refactoring/controlFlag/data.txt"));
    Iterator<String> ir = dataBase.iterator();
    while (ir.hasNext()) {
      String key = ir.next();
      System.out.println("key : " + key);
      System.out.println("value : " + dataBase.getValue(key));
      System.out.println();
    }
  }

}
