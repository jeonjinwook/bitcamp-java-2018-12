package ch15;

public class Student {
  String name;
  int age;
  boolean working;
  
  public Student(String name, int age, boolean working) {
    this.name = name;
    this.age = age;
    this.working = working;
  }

  @Override
  public String toString() {
    return "Strudent [name=" + name + ", age=" + age + ", working=" + working + "]";
  }
}
