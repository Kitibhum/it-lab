package src;


class IncrementExpression implements Expression<Integer> {
    private Expression<Integer> expression;

    public IncrementExpression(Expression<Integer> expression) {
        this.expression = expression;
    }

    @Override
    public Integer interpret(Context context) {
        if(context.isReverse() == ContextType.REVERSE){
            return expression.interpret(context) - 1;
        }
        return (int) expression.interpret(context) + 1;
    }
}