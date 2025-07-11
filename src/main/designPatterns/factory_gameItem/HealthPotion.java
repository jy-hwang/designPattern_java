package main.designPatterns.factory_gameItem;

public class HealthPotion extends GameItem {
  public HealthPotion(GameItemGrade grade) {
    this.name = "생명의 물약";
    this.type = GameItemType.CONSUMABLE;
    this.grade = grade;
    this.baseValue = 50;
    this.description = "즉시 체력을 회복시켜주는 신비한 물약";

    int healAmount = (int) (100 * grade.getMultiplier());
    stats.put("회복량", healAmount);

    if (grade.ordinal() >= GameItemGrade.RARE.ordinal()) {
      effects.add("지속 회복: 10초간 초당 체력 회복");
    }
    if (grade == GameItemGrade.LEGENDARY) {
      effects.add("완전 회복: 모든 상태이상 제거");
    }
  }

  @Override
  public void use() {
    System.out.println("🧪 " + name + "를 사용했습니다!");
    System.out.println("체력이 " + stats.get("회복량") + " 회복됩니다!");
    System.out.println("💀 아이템이 소모되었습니다.");
  }
}
