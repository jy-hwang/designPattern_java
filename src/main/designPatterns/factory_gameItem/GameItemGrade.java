package main.designPatterns.factory_gameItem;

public enum GameItemGrade {
  COMMON("일반", "⚪", 1.0), UNCOMMON("고급", "🟢", 1.5), RARE("희귀", "🔵", 2.0), EPIC("에픽", "🟣", 3.0), LEGENDARY("전설", "🟡", 5.0), MYTHIC("신화", "🔴", 10.0);

  private final String name;
  private final String emoji;
  private final double multiplier;

  GameItemGrade(String name, String emoji, double multiplier) {
      this.name = name;
      this.emoji = emoji;
      this.multiplier = multiplier;
  }

  public String getName() {
    return name;
  }

  public String getEmoji() {
    return emoji;
  }

  public double getMultiplier() {
    return multiplier;
  }
}
