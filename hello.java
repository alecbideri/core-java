class Human {
  private int age;
  private String Name;

  public int getAge() {
    return age;

  }

  public String getName() {
    return Name;
  }

  public void setName(String a) {
    Name = a;
  }

  public void setAge(int a) {
    age = a;
  }

}

class hello {
  public static void main(String[] args) {

    Human obj = new Human();

    obj.setAge(12);
    obj.setName("Alec");

    String newName = obj.getName();
    int newAge = obj.getAge();

    System.out.println("The Name is " + newName + " And am " + newAge);

  }
}