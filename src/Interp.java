import java.util.List;
import java.util.Arrays;
import java.util.Scanner;


public class Interp {

    private static final String PROMPT = "> ";
    private static boolean run = true;
    Scanner instruction;

    public Interp() {
        read_Input();
    }

    private void read_Input(){
        instruction = new Scanner(System.in);
        System.out.println("Welcome to your Arithmetic Interpreter! V1.0");
        while(run){
            System.out.print(PROMPT);
            //instruction.nextLine();
            if (instruction.hasNext("quit")){
                run = false;
            }
            helper(instruction);
            }
    }

    private int helper(Scanner instruction){
        Expression operation = null;
        Expression left;
        Expression right;
        String infix = "";

        if (instruction.hasNextInt()) { //needed
            int x = instruction.nextInt();
            left = new IntExp(x);
            return left.evaluate(); //needed
        } else {
            switch (instruction.next().trim()) {
                case "+":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new AddExp(left, right);
                    break;
                case "-":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new SubExp(left, right);
                    break;
                case "*":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new MulExp(left, right);
                    break;
                case "/":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new DivExp(left, right);
                    break;
                case "%":
                    left = new IntExp(helper(instruction));
                    right = new IntExp(helper(instruction));
                    operation = new ModExp(left, right);
                    break;
            }
        }
        return operation.evaluate();
    }

    public static void main(String[] args) {
        Interp interp = new Interp();
    }
}