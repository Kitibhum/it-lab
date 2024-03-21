package src;
class AddExpression implements Expression<Integer> {
    private Expression<Integer> leftExpression;
    private Expression<Integer> rightExpression;

    public AddExpression(Expression<Integer> leftExpression, Expression<Integer> rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public Integer interpret(Context context) {
        return (int) leftExpression.interpret(context) + (int) rightExpression.interpret(context);
    }
}