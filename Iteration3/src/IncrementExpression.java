package src;


class IncrementExpression implements Expression<Integer> {
    private Expression<Integer> expression;

    public IncrementExpression(Expression<Integer> expression) {
        this.expression = expression;
    }

    @Override
    public Integer interpret(Context context) {
       
        return (int) expression.interpret(context) + 1;
    }
}