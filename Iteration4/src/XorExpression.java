package src;
class XorExpression implements Expression<Boolean>  {
    private Expression<Boolean> leftExpression;
    private Expression<Boolean> rightExpression;

    public XorExpression(Expression<Boolean> leftExpression, Expression<Boolean> rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public Boolean interpret(Context context) {
        if( context.isReverse() == ContextType.REVERSE){
            return  !((boolean) leftExpression.interpret(context) ^  (boolean) rightExpression.interpret(context)); // XOR operation
           }
        return  (boolean) leftExpression.interpret(context) ^  (boolean) rightExpression.interpret(context); // XOR operation
    }
}