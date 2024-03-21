package src;
import java.util.Random;

public class RandomExpression implements Expression {
    private Expression SmallExpression;
    private Expression BigExpression;

    public RandomExpression(Expression SmallExpression, Expression BigExpression) {
        this.SmallExpression = SmallExpression;
        this.BigExpression = BigExpression;
    }

    public RandomExpression(Expression BigExpression) {
        this.SmallExpression = new NumberExpression(0);
        this.BigExpression = BigExpression;
    }

    public RandomExpression() {
        this.SmallExpression = new NumberExpression(0);
        this.BigExpression = new NumberExpression(Integer.MAX_VALUE);
    }

    @Override
    public Integer interpret(Context context) {
        return (int) SmallExpression.interpret(context) + (int) (Math.random()
                * ((int) BigExpression.interpret(context) - (int) SmallExpression.interpret(context)));
    }

}