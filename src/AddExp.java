import java.util.List;

public class AddExp implements Expression {
    private Expression left;
    private Expression right;
    private String infix;


    public AddExp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(){
        return left.evaluate() + right.evaluate();
    }

    @Override
    public String emit(){
        return infix;
    }
}
