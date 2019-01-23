package design_pattern.abstract_factory;

public class TerranUnitFactory implements UnitFactory{
  
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
    unit.setName("테란: 군인식당");
    unit.setArea(50);
    unit.setType(Unit.GENERAL_BUILDING);
    return unit;
  }
  private Unit createTrainingCenter() {
    Unit unit = new TrainingCenter();
    unit.setName("테란: 훈련소");
    unit.setArea(500);
    unit.setType(Unit.GENERAL_BUILDING);
    return unit;
  }
}
