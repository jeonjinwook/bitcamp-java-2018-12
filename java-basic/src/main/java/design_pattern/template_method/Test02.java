package design_pattern.template_method;

public class Test02 {

  public static void main(String[] args) {
    
    UnitFactory unitFactory = new UnitFactory();
    
    Unit u1 = unitFactory.createUnit(UnitFactory.RESTAURANT);
    u1.build();
    
    System.out.println("-------------------------------");
    Unit u2 = unitFactory.createUnit(UnitFactory.TRAINING_CENTER);
    u2.build();
  }
}
