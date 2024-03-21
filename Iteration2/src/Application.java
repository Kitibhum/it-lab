package src;
// Client
public class Application {
    public static void main(String[] args) {
        // Create the expression: (2 + 3) + 4
        Expression AddExpr = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4));

        Expression IncreaseExpr = new IncrementExpression(new NumberExpression(10));

        Expression randExpr = new RandomExpression(new NumberExpression(5), new NumberExpression(10));
        Expression randExpr2 = new RandomExpression(new NumberExpression(10));
        Expression randExpr3 = new RandomExpression();

       
                Context context1 = new Context();
                System.out.println(("Normal"));
                System.out.println("Sum Result: " + AddExpr.interpret(context1)); // Output: Result: 9

                System.out.println("Increase Result: " + IncreaseExpr.interpret(context1)); // Output: Result: 5
        
                System.out.println("Random: " + randExpr.interpret(context1));
                System.out.println("Random2: " + randExpr2.interpret(context1));
                System.out.println("Random3: " + randExpr3.interpret(context1));
        
        // Create the context, if needed
    }
}