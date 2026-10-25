interface LamdaExpression {

    void switchOn();
}


public class LamdaExpressionDemo {

    public static void main(String args[])
    {


LamdaExpression lm = ()-> System.out.println("SWITCHED ON");

lm.switchOn();


    }
}
