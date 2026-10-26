interface LamdaExpression {

    //void switchOn();

   // void sum(int input);


    int subtract(int a, int b);
}


public class LamdaExpressionDemo {

    public static void main(String args[])
    {

//LamdaExpression lm = ()-> System.out.println("SWITCHED ON");
//
//
//lm.switchOn();


//LamdaExpression lm= (input)-> System.out.println("SUM : "+input);
//
//lm.sum(10);


        LamdaExpression subb= (a, b) -> a-b; ;


       System.out.println("RESULT OF THE SUBSTRACTION IS : "+subb.subtract(50,9)) ;





    }
}
