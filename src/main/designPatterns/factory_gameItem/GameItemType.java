package main.designPatterns.factory_gameItem;

public enum GameItemType {
  WEAPON("무기", "⚔️"),
  ARMOR("방어구", "🛡️"),
  ACCESSORY("장신구", "💍"),
  CONSUMABLE("소비품", "🧪"),
  MATERIAL("재료", "⚡");

  private final String name;
  private final String emoji;

  GameItemType(String name, String emoji) {
      this.name = name;
      this.emoji = emoji;
  }

  public String getName() {
    return name;
  }

  public String getEmoji() {
    return emoji;
  }
}
