class Calculate {
  public static String bmi(double weight, double height) {
    double body = weight / (height * height);

    if (body <= 18.5) {
      return "Underweight";
    } else if (body <= 25.0) {
      return "Normal";
    } else if (body <= 30.0) {
      return "Overweight";
    } else {
      return "Obese";
    }
  }
}