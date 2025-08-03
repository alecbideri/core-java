class calculator {
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public int add(int num1, int num2, int num3) {
    return num1 + num2 + num3;

  }

  public double add(double num1, int num2) {
    return num1 + num2;
  }
}

class hello {
  public static void main(String[] args) {

    calculator calc = new calculator();

    int result1 = calc.add(10, 20);
    System.out.println(result1);

    int result2 = calc.add(10, 20, 30);
    System.out.println(result2);

    double result3 = calc.add(10.5, 20);
    System.out.println(result3);

  }

}
