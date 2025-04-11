public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
         return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
       double baseSalary = 1000.00;
        double adjustedSalary = baseSalary * salaryMultiplier(daysSkipped);
        double bonus = bonusForProductsSold(productsSold);
        double totalSalary = adjustedSalary + bonus;

        return totalSalary > 2000.00 ? 2000.00 : totalSalary;
    } 
}
