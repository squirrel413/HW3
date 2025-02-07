import java.util.List;

public class DivExp implements Expression{
    private Expression left;
    private Expression right;


    public DivExp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(){
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String emit(){
        return "nah";
    }
}
