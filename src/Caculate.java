public class Caculate {
    void caculateNumber(int a, int b){
        try {
            int add =  a + b;
            int sub = a - b;
            int multi = a * b;
            int div = a / b;
            System.out.println("addition " + a + " "+ b + " is: "+ add);
            System.out.println("subtraction of " + a + " "+ b + " is: "+ sub);
            System.out.println("multiplication of " + a + " "+ b + " is: "+ multi);
            System.out.println("division of " + a + " "+ b + " is: "+ div);
        }
        catch (Exception e){
            System.err.println("Have an exeption "+ e.getMessage());
        }
    }
}
