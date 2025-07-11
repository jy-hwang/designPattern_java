package main.designPatterns.factory_gameItem;

public class Sword extends GameItem {
  public Sword(GameItemGrade grade) {
    this.name = "엑스칼리버";
    this.type = GameItemType.WEAPON;
    this.grade = grade;
    this.baseValue = 1000;
    this.description = "전설적인 기사들이 사용했던 신성한 검";

    int attackPower = (int) (50 * grade.getMultiplier());
    stats.put("공격력", attackPower);
    stats.put("치명타율", Math.min(30, grade.ordinal() * 5));

    if (grade.ordinal() >= GameItemGrade.EPIC.ordinal()) {
      effects.add("신성한 빛: 언데드에게 추가 피해");
    }
    if (grade == GameItemGrade.MYTHIC) {
      effects.add("진정한 왕: 모든 능력치 +10%");
      tradeable = false;
    }
  }

  @Override
  public void use() {
    System.out.println("⚔️ " + name + "를 장착했습니다!");
    System.out.println("공격력이 " + stats.get("공격력") + " 증가합니다.");
  }
}
