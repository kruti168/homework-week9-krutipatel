package calculate;

public class Calculator {
 //instance method
    public void addition(int a,int b){

        int result = a + b;
        System.out.println("Addition of" + a + " And " + b + " is :" + result);
    }
    public void subtraction(int a,int b){
        int result = a -b;
        System.out.println("Subtraction of " + a + "  And " + b + " is :" +result);
    }
    public void division(int a ,int b){
        int result = a/b;
        System.out.println("DIvision of "+a + " And "+ b + " is :"+ result);

    }
    public void multiplication(int a ,int b){
        int result = a * b;
        System.out.println("Multiplication of" + a + " And " + b + " is :" + result);

    }
    public void calculateResult(int a,int b ,char symbol){
//for each loop
        if(symbol == '+'){

            addition(a,b);
        }
        else if(symbol == '-'){

            subtraction(a,b);
        }else if(symbol =='/'){
            division(a,b);

        }else if(symbol == '*') {
            multiplication(a,b);
        }
        else {
            System.out.println("Invalid Symbol");
        }

        }


    }


