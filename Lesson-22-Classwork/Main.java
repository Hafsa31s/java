class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
       String[] friends = {"Ali", "John", "Ahmed", "Sarah", "David"};

    for (int i = 0; i < friends.length; i++) {
        System.out.println(friends[i]);
    }

    
  }

  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;

  }
  public static double[] convert(double[] temperatures) {

    double[] result = new double[temperatures.length];

    for (int i = 0; i < temperatures.length; i++) {

        result[i] = CelsiusToFarhenheit(temperatures[i]);

    }

    return result;
}
}