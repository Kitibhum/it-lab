package src;
import java.util.Random;

public class RandomExpression implements Expression<Integer> {
    private Expression<Integer> SmallExpression;
    private Expression<Integer> BigExpression;

    public RandomExpression(Expression<Integer> SmallExpression, Expression<Integer> BigExpression) {
        this.SmallExpression = SmallExpression;
        this.BigExpression = BigExpression;
    }

    public RandomExpression(Expression<Integer> BigExpression) {
        this.SmallExpression = new NumberExpression(0);
        this.BigExpression = BigExpression;
    }

    public RandomExpression() {
        this.SmallExpression = new NumberExpression(0);
        this.BigExpression = new NumberExpression(Integer.MAX_VALUE);
    }

    @Override
    public Integer interpret(Context context) {
        Random rand = new Random();
        int leftValue = SmallExpression.interpret(context);
        int rightValue = BigExpression.interpret(context);
        int minValue = Math.min(leftValue, rightValue);
        int maxValue = Math.max(leftValue, rightValue);
        
        return minValue + rand.nextInt(maxValue-minValue);
        // return (int) SmallExpression.interpret(context) + (int) (Math.random()
        //         * ((int) BigExpression.interpret(context) - (int) SmallExpression.interpret(context)));
    }

}