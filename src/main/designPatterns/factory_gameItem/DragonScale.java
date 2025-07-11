package main.designPatterns.factory_gameItem;

public class DragonScale extends GameItem {
  public DragonScale(GameItemGrade grade) {
    this.name = "드래곤 비늘";
    this.type = GameItemType.MATERIAL;
    this.grade = grade;
    this.baseValue = 200;
    this.description = "고대 드래곤의 비늘로 만든 희귀한 제작 재료";

    if (grade == GameItemGrade.MYTHIC) {
      effects.add("드래곤의 축복: 제작 시 추가 효과 부여");
      tradeable = false;
    }
  }

  @Override
  public void use() {
    System.out.println("⚡ " + name + "를 제작 재료로 사용합니다!");
    System.out.println("강력한 아이템 제작이 가능합니다.");
  }
}
