package main.designPatterns.factory_gameItem;

public class Shield extends GameItem {
  public Shield(GameItemGrade grade) {
    this.name = "이지스 방패";
    this.type = GameItemType.ARMOR;
    this.grade = grade;
    this.baseValue = 800;
    this.description = "신들의 축복을 받은 불멸의 방패";

    int defense = (int) (40 * grade.getMultiplier());
    stats.put("방어력", defense);
    stats.put("블록률", Math.min(25, grade.ordinal() * 4));

    if (grade.ordinal() >= GameItemGrade.RARE.ordinal()) {
      effects.add("마법 저항: 마법 피해 20% 감소");
    }
    if (grade == GameItemGrade.LEGENDARY) {
      effects.add("반사: 받은 피해의 10%를 반사");
    }
  }

  @Override
  public void use() {
    System.out.println("🛡️ " + name + "를 장착했습니다!");
    System.out.println("방어력이 " + stats.get("방어력") + " 증가합니다.");
  }
}
