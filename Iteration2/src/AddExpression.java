package src;
class AddExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public Integer interpret(Context context) {
        return (int) leftExpression.interpret(context) + (int) rightExpression.interpret(context);
    }
}