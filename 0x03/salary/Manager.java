public class Manager extends Employee {

  public Manager(double baseSalary) {
    super(baseSalary);
  }

  @Override
  public double calculateBonus(Department department) {
    if (department.reachedTarget() == true) {
      double stdBonus = fixedSalary * 20 / 100;
      double managerBonus = (department.achievedTargetValue - department.targetValue) * 1 / 100;
      double result = stdBonus + managerBonus;
      return result;
    }
    return 0;
  }
}
