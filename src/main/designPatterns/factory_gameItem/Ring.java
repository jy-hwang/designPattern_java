package main.designPatterns.factory_gameItem;

public class Ring extends GameItem {
  public Ring(GameItemGrade grade) {
    this.name = "현자의 반지";
    this.type = GameItemType.ACCESSORY;
    this.grade = grade;
    this.baseValue = 1200;
    this.description = "고대 현자들의 지혜가 깃든 신비로운 반지";

    int mana = (int) (30 * grade.getMultiplier());
    stats.put("마나", mana);
    stats.put("마법력", (int) (20 * grade.getMultiplier()));

    if (grade.ordinal() >= GameItemGrade.UNCOMMON.ordinal()) {
      effects.add("마나 재생: 5초마다 마나 회복");
    }
    if (grade == GameItemGrade.MYTHIC) {
      effects.add("시간 조작: 쿨다운 30% 감소");
    }
  }

  @Override
  public void use() {
    System.out.println("💍 " + name + "를 착용했습니다!");
    System.out.println("마법력이 " + stats.get("마법력") + " 증가합니다.");
  }
}
