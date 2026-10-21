
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
  public static double gpa(double gpa) {
        if (gpa > 90) {
            return gpa * 1.1;
        }
        return gpa;
    }
	 public static boolean isGraduating(String gradeLevel, int creditsEarned) {
        return gradeLevel.equalsIgnoreCase("Senior") && creditsEarned >= 44;
    }
	 public static String BMI(double weight, double height) {
        double bmi = (weight * 703) / (height * height);

        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
	 public static double shippingCost(double weight) {
        if (weight <= 10) {
            return 0.00;
        } else if (weight <= 15) {
            return 5.00;
        } else if (weight <= 25) {
            return 10.00;
        } else {
            return 10.00 + (0.02 * (weight - 25));
        }
    }
	 public static boolean blueOrViolet(double frequency) {
        return (frequency >= 600 && frequency <= 670)
            || (frequency >= 700 && frequency <= 750);
    }
	 public static void init() {
        String gradeLevel = "Senior";
        int creditsEarned = 44;

        if (isGraduating(gradeLevel, creditsEarned)) {
            System.out.println("Student is Graduating");
        } else {
            System.out.println("Student is NOT Graduating");
        }
    }

   

  }

 
  
}