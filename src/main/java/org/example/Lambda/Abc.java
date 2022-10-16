package org.example.Lambda;

public class Abc {
    public static void main(String[] args) {
        // Using Interface using Anonymous class

        LambdaExpression lambda = new LambdaExpression(){
            @Override
            public void print(){
                System.out.println("This is by anonymous class");
            }
        };

        // Using Interface using Lambda Expression

        LambdaExpression lambda2 = ()->{
            System.out.println("This is by Lambda Expression");  // We can remove curly braces also
        };

        lambda.print();
        lambda2.print();

        Addition lambda3= (int a, int b)-> {
            return a + b;
        };
        // Or can be written as (a,b)-> a + b;
        System.out.println("Sum is " + lambda3.Sum(10, 20));
    }
}