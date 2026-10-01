class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }

        print("Hello, World!");
        print("The print function is working successfully.");

   double ftoc(double fahrenheit){
	double result =5./9 * (fahrenheit - 32) ;
	
   }
  double sphereVolume(double radius){
	double result = 4/3.*Math.PI * Math.pow(radius,3);
	
  }
   double coneVolume(double radius, double height){
	double result = 1/3.*Math.PI * Math.pow(radius,2)*height;
	}
	double disten(double x1,
                double x2,
				double y1,
				double y2){
	return Math.sqrt(Math.pow(x1-x2,2)
	                 Math.pow(y1-y2,2) );
				}
}