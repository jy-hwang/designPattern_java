package main.designPatterns.factory_gameItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GameItem {
  protected String name;
  protected GameItemType type;
  protected GameItemGrade grade;
  protected int baseValue;
  protected String description;
  protected Map<String, Integer> stats = new HashMap<>();
  protected List<String> effects = new ArrayList<>();
  protected boolean tradeable = true;
  protected int durability = 100;

  // 아이템 생성 과정
  public void craft() {
    System.out.println("🔨 " + name + " 제작 시작...");

    gatherMaterials();
    processItem();
    enchantItem();
    finalizeItem();

    System.out.println("✨ " + getDisplayName() + " 제작 완료!");
  }

  protected void gatherMaterials() {
    System.out.println("📦 재료 수집 중...");
  }

  protected void processItem() {
    System.out.println("⚙️ 아이템 가공 중...");
  }

  protected void enchantItem() {
    if (grade.ordinal() >= GameItemGrade.RARE.ordinal()) {
      System.out.println("✨ 마법 부여 중...");
    }
  }

  protected void finalizeItem() {
    System.out.println("🔍 최종 검수 완료");
  }

  // 아이템 정보 출력
  public void displayInfo() {
    System.out.println("\n" + "=".repeat(40));
    System.out.println(getDisplayName());
    System.out.println("=".repeat(40));
    System.out.println("타입: " + type.getEmoji() + " " + type.getName());
    System.out.println("등급: " + grade.getEmoji() + " " + grade.getName());
    System.out.println("가치: " + String.format("%,d", getValue()) + " 골드");
    System.out.println("내구도: " + durability + "/100");
    System.out.println("거래 가능: " + (tradeable ? "예" : "아니오"));

    if (!stats.isEmpty()) {
      System.out.println("\n📊 능력치:");
      stats.forEach((stat, value) -> System.out.println("  " + stat + ": +" + value));
    }

    if (!effects.isEmpty()) {
      System.out.println("\n🎭 특수 효과:");
      effects.forEach(effect -> System.out.println("  • " + effect));
    }

    System.out.println("\n📝 설명: " + description);
    System.out.println("=".repeat(40));
  }

  public String getDisplayName() {
    return grade.getEmoji() + " " + name + " " + type.getEmoji();
  }

  public int getValue() {
    return (int) (baseValue * grade.getMultiplier());
  }

  // 아이템 사용
  public abstract void use();

  // getter들
  public String getName() {
    return name;
  }

  public GameItemType getType() {
    return type;
  }

  public GameItemGrade getGrade() {
    return grade;
  }

  public boolean isTradeable() {
    return tradeable;
  }
}
