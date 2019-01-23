package design_pattern.abstract_factory;

public class ProtossUnitFactory implements UnitFactory{
  
  public Unit createUnit(int building) {
    switch (building) {
      case RESTAURANT:
        return createRestaurant();
      case TRAINING_CENTER:
        return createTrainingCenter();
    }
    return null;
  }

  private Unit createRestaurant() {
    Unit unit = new Restaurant();
    unit.setName("프로토스: 군인식당");
    unit.setArea(70);
    unit.setType(Unit.DEFENCE_BUILDING);
    return unit;
  }
  private Unit createTrainingCenter() {
    Unit unit = new TrainingCenter();
    unit.setName("프로토스: 훈련소");
    unit.setArea(300);
    unit.setType(Unit.ATTACK_BUILDING);
    return unit;
  }
}
