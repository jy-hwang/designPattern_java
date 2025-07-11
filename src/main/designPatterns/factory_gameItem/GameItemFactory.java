package main.designPatterns.factory_gameItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameItemFactory {
  private static final Random random = new Random();

  // 기본 아이템 생성
  public static GameItem createItem(String itemType, GameItemGrade grade) {
    switch (itemType.toLowerCase()) {
      case "검":
      case "sword":
        return new Sword(grade);
      case "방패":
      case "shield":
        return new Shield(grade);
      case "반지":
      case "ring":
        return new Ring(grade);
      case "물약":
      case "potion":
        return new HealthPotion(grade);
      case "비늘":
      case "scale":
        return new DragonScale(grade);
      default:
        System.out.println("❌ 알 수 없는 아이템 타입입니다. 기본 검을 생성합니다.");
        return new Sword(GameItemGrade.COMMON);
    }
  }

  // 랜덤 아이템 생성
  public static GameItem createRandomItem() {
    String[] itemTypes = {"검", "방패", "반지", "물약", "비늘"};
    String randomType = itemTypes[random.nextInt(itemTypes.length)];
    GameItemGrade randomGrade = getRandomGrade();

    System.out.println("🎲 랜덤 아이템 생성: " + randomType + " (" + randomGrade.getName() + ")");
    return createItem(randomType, randomGrade);
  }

  // 확률 기반 등급 결정
  private static GameItemGrade getRandomGrade() {
    int roll = random.nextInt(1000);

    if (roll < 1)
      return GameItemGrade.MYTHIC; // 0.1%
    else if (roll < 10)
      return GameItemGrade.LEGENDARY; // 0.9%
    else if (roll < 50)
      return GameItemGrade.EPIC; // 4%
    else if (roll < 150)
      return GameItemGrade.RARE; // 10%
    else if (roll < 400)
      return GameItemGrade.UNCOMMON; // 25%
    else
      return GameItemGrade.COMMON; // 60%
  }

  // 보상 상자 열기
  public static List<GameItem> openTreasureChest(String chestType) {
    List<GameItem> items = new ArrayList<>();

    switch (chestType.toLowerCase()) {
      case "나무":
      case "wooden":
        items.add(createItemWithMinGrade(GameItemGrade.COMMON));
        if (random.nextDouble() < 0.3) {
          items.add(createRandomItem());
        }
        break;
      case "은":
      case "silver":
        items.add(createItemWithMinGrade(GameItemGrade.UNCOMMON));
        items.add(createRandomItem());
        if (random.nextDouble() < 0.5) {
          items.add(createRandomItem());
        }
        break;
      case "금":
      case "golden":
        items.add(createItemWithMinGrade(GameItemGrade.RARE));
        items.add(createItemWithMinGrade(GameItemGrade.UNCOMMON));
        items.add(createRandomItem());
        break;
      case "다이아":
      case "diamond":
        items.add(createItemWithMinGrade(GameItemGrade.EPIC));
        items.add(createItemWithMinGrade(GameItemGrade.RARE));
        items.add(createRandomItem());
        items.add(createRandomItem());
        break;
    }

    return items;
  }

  // 최소 등급 보장 아이템 생성
  private static GameItem createItemWithMinGrade(GameItemGrade minGrade) {
    GameItemGrade grade;
    do {
      grade = getRandomGrade();
    } while (grade.ordinal() < minGrade.ordinal());

    return createRandomItem();
  }

  // 특정 직업용 아이템 세트 생성
  public static List<GameItem> createJobSet(String job) {
    List<GameItem> jobSet = new ArrayList<>();
    GameItemGrade setGrade = GameItemGrade.UNCOMMON;

    switch (job.toLowerCase()) {
      case "전사":
      case "warrior":
        jobSet.add(createItem("검", setGrade));
        jobSet.add(createItem("방패", setGrade));
        break;
      case "마법사":
      case "mage":
        jobSet.add(createItem("반지", setGrade));
        jobSet.add(createItem("물약", setGrade));
        jobSet.add(createItem("물약", GameItemGrade.COMMON));
        break;
      case "연금술사":
      case "alchemist":
        jobSet.add(createItem("비늘", setGrade));
        jobSet.add(createItem("물약", GameItemGrade.RARE));
        break;
    }

    return jobSet;
  }

  // 아이템 카탈로그 출력
  public static void printCatalog() {
    System.out.println("\n🎒 아이템 카탈로그 🎒");
    System.out.println("=".repeat(30));
    System.out.println("🗡️ 무기류:");
    System.out.println("  - 검 (Sword)");
    System.out.println("🛡️ 방어구:");
    System.out.println("  - 방패 (Shield)");
    System.out.println("💍 장신구:");
    System.out.println("  - 반지 (Ring)");
    System.out.println("🧪 소비품:");
    System.out.println("  - 물약 (Potion)");
    System.out.println("⚡ 재료:");
    System.out.println("  - 비늘 (Scale)");
    System.out.println("=".repeat(30));

    System.out.println("\n🌟 아이템 등급 🌟");
    System.out.println("=".repeat(30));
    for (GameItemGrade grade : GameItemGrade.values()) {
      System.out.println(grade.getEmoji() + " " + grade.getName() + " (배율: " + grade.getMultiplier() + "x)");
    }
    System.out.println("=".repeat(30));
  }
}
