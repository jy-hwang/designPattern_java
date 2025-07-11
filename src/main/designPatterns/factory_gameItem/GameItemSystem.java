package main.designPatterns.factory_gameItem;

import java.util.List;

public class GameItemSystem {
  public static void main(String[] args) {
    System.out.println("🎮 판타지 게임 아이템 시스템에 오신 것을 환영합니다!");
    
    // 카탈로그 출력
    GameItemFactory.printCatalog();
    
    // 1. 기본 아이템 생성
    System.out.println("\n" + "=".repeat(60));
    System.out.println("🔨 아이템 제작소");
    System.out.println("=".repeat(60));
    
    GameItem sword = GameItemFactory.createItem("검", GameItemGrade.EPIC);
    sword.craft();
    sword.displayInfo();
    sword.use();
    
    GameItem ring = GameItemFactory.createItem("반지", GameItemGrade.LEGENDARY);
    ring.craft();
    ring.displayInfo();
    ring.use();
    
    // 2. 랜덤 아이템 생성
    System.out.println("\n" + "=".repeat(60));
    System.out.println("🎲 랜덤 아이템 생성기");
    System.out.println("=".repeat(60));
    
    for (int i = 0; i < 3; i++) {
        GameItem randomItem = GameItemFactory.createRandomItem();
        randomItem.displayInfo();
    }
    
    // 3. 보물 상자 열기
    System.out.println("\n" + "=".repeat(60));
    System.out.println("📦 보물 상자 열기");
    System.out.println("=".repeat(60));
    
    List<GameItem> treasureItems = GameItemFactory.openTreasureChest("금");
    System.out.println("🎁 금 상자에서 " + treasureItems.size() + "개의 아이템 획득!");
    
    for (GameItem item : treasureItems) {
        System.out.println("  - " + item.getDisplayName());
    }
    
    // 4. 직업별 아이템 세트
    System.out.println("\n" + "=".repeat(60));
    System.out.println("⚔️ 전사 직업 세트");
    System.out.println("=".repeat(60));
    
    List<GameItem> warriorSet = GameItemFactory.createJobSet("전사");
    for (GameItem item : warriorSet) {
        item.displayInfo();
    }
    
    // 5. 상점 시스템
    System.out.println("\n" + "=".repeat(60));
    System.out.println("🏪 상점 시스템");
    System.out.println("=".repeat(60));
    
    GameItemShop shop = new GameItemShop("마법 아이템 상점");
    shop.displayInventory();
  }
}
