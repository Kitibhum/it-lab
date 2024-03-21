package src;
// Client
public class Application {
    public static void main(String[] args) {
        // Create the expression: (2 + 3) + 4
        Expression AddExpr = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4));

       
                Context context1 = new Context();
                System.out.println(("Normal"));
                System.out.println("Sum Result: " + AddExpr.interpret(context1)); // Output: Result: 9

        // Create the context, if needed
    }
}