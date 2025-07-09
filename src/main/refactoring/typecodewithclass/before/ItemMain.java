package main.refactoring.typecodewithclass.before;

public class ItemMain {

  public static void main(String[] args) {

    Item bookItem = new Item(Item.TYPECODE_BOOK, "토지", 10000);
    Item dvdItem = new Item(Item.TYPECODE_DVD, "라라랜드", 20000);
    Item softwareItem = new Item(Item.TYPECODE_SOFTWARE, "사이버펑크2077", 30000);

    System.out.println(bookItem);
    System.out.println(dvdItem);
    System.out.println(softwareItem);

  }

}
