package src;
//Terminal Expression

public class NumberExpression implements Expression<Integer>{
    private Integer number;
    public NumberExpression(Integer number) {
        this.number = number;
    }
    @Override
    public Integer interpret(Context context) {
       
       return number;
    }
    
}
