public class Consturctor {
     int i;

  // constructor with no parameter
  private Consturctor() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {

    // calling the constructor without any parameter
    Consturctor obj = new Consturctor();
    System.out.println("Value of i: " + obj.i);
  }
    
}
