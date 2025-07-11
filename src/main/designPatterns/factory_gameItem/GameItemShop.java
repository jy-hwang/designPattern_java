package main.designPatterns.factory_gameItem;

import java.util.ArrayList;
import java.util.List;

public class GameItemShop {
  private String shopName;
  private List<GameItem> inventory = new ArrayList<>();
  
  public GameItemShop(String shopName) {
      this.shopName = shopName;
      restockInventory();
  }
  
  private void restockInventory() {
      System.out.println("📦 " + shopName + " 재고 보충 중...");
      inventory.clear();
      
      // 기본 아이템들 추가
      inventory.add(GameItemFactory.createItem("검", GameItemGrade.COMMON));
      inventory.add(GameItemFactory.createItem("방패", GameItemGrade.COMMON));
      inventory.add(GameItemFactory.createItem("물약", GameItemGrade.COMMON));
      inventory.add(GameItemFactory.createItem("물약", GameItemGrade.UNCOMMON));
      
      // 랜덤 아이템들 추가
      for (int i = 0; i < 3; i++) {
          inventory.add(GameItemFactory.createRandomItem());
      }
      
      System.out.println("✅ 재고 보충 완료!");
  }
  
  public void displayInventory() {
      System.out.println("\n🏪 " + shopName + " 상점");
      System.out.println("=".repeat(50));
      
      for (int i = 0; i < inventory.size(); i++) {
          GameItem item = inventory.get(i);
          System.out.println((i + 1) + ". " + item.getDisplayName() + 
                           " - " + String.format("%,d", item.getValue()) + " 골드");
      }
      System.out.println("=".repeat(50));
  }
}
