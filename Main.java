/**
 * Main
 */
 public class Main {

     public static void main(String[] args) {
        // creating a calculator object
         Calculator calcObj1 = new Calculator();

       System.out.println(  calcObj1.add(5, 10)  );
       System.out.println( calcObj1.add(5, 10, 15)  );

       System.out.println(  calcObj1.add(5, 10.7)  );
       System.out.println( calcObj1.add(5.3, 10)  );

       System.out.println(  calcObj1.subtract(10, 5)  );
       System.out.println(  calcObj1.subtract(10.5, 5.4)  );


     }
}