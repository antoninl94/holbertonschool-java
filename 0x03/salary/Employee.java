public class Employee {
  double fixedSalary;

  public Employee(double fixedSalary) {
    this.fixedSalary = fixedSalary;
  }

  public double getFixedSalary() {
    return fixedSalary;
  }

  public double calculateBonus(Department department) {
    if (department.reachedTarget() == true) {
      double result = fixedSalary * 10 / 100;
      return result;
    }
    return 0;
  }

  public double calculateTotalSalary(Department department) {
    return fixedSalary + calculateBonus(department);
  }
}
