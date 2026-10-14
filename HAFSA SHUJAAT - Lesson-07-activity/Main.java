
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  System.out.println("enter x");
  double x = Input.readDouble();
  double y = Math.pow(x,7);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  System.out.println("enter z");
double z = Input.readDuoble();
double q = Math.pow(z,3) + 5;
/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
  System.out.println("enter t");
  System.out.println("enter r");
  double t = Input.readDuoble();
  double r = Input.readDuoble();
  double s = Math.pow(t,5)* Math.pow(r+2,4);
/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
  System.out.println("enter a");
  System.out.println("enter b");
double a = Input.readDuoble();
  double b = Input.readDuoble();
double c = Math.sqrt(a+b);
/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
  System.out.println("enter x1");
  System.out.println("enter x2");
  System.out.println("enter y1");
  System.out.println("enter y2");
  double x1 = Input.readDuoble();
  double x2 = Input.readDuoble();
  double y1 = Input.readDuoble();
  double y2 = Input.readDuoble();
  double d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
System.out.println("enter deg");
  double deg = Input.readDuoble();
double g = Math.sin(deg);



/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
 System.out.println("enter m");
  System.out.println("enter n");
  double m = Input.readDuoble();
  double n = Input.readDuoble();
   double k = Math.pow(m,5)/Math.sqrt(n+1);

/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}