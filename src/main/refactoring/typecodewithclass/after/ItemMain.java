package main.refactoring.typecodewithclass.after;

public class ItemMain {

  public static void main(String[] args) {

    Item bookItem = new Item(ItemType.BOOK, "토지", 10000);
    Item dvdItem = new Item(ItemType.DVD, "라라랜드", 20000);
    Item softwareItem = new Item(ItemType.SOFTWARE, "사이버펑크2077", 30000);

    System.out.println(bookItem);
    System.out.println(dvdItem);
    System.out.println(softwareItem);

  }

}
