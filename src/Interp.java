import java.util.ArrayList;
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
        Scanner user_Input = new Scanner(System.in);
        System.out.println("Welcome to your Arithmetic Interpreter! V1.0");
        while(run){
            System.out.print(PROMPT);
            String str = user_Input.nextLine();
            instruction = new Scanner(str);

            if (instruction.hasNext("quit")){
                run = false;
                break;
            }
            Expression root = helper(instruction);
            System.out.println("Value: " + root.evaluate());
            System.out.println("Infix: " + root.emit());
            }
    }

    private Expression helper(Scanner instruction){
        Expression operation = null;
        Expression left;
        Expression right;

        if (instruction.hasNextInt()) { //needed
            int x = instruction.nextInt();
            operation = new IntExp(x);
            return operation; //needed
        } else {
            switch (instruction.next().trim()) {
                case "+":
                    left = helper(instruction);
                    right = helper(instruction);
                    operation = new AddExp(left, right);
                    break;
                case "-":
                    left = helper(instruction);
                    right = helper(instruction);
                    operation = new SubExp(left, right);
                    break;
                case "*":
                    left = helper(instruction);
                    right = helper(instruction);
                    operation = new MulExp(left, right);
                    break;
                case "/":
                    left = helper(instruction);
                    right = helper(instruction);
                    operation = new DivExp(left, right);
                    break;
                case "%":
                    left = helper(instruction);
                    right = helper(instruction);
                    operation = new ModExp(left, right);
                    break;
            }
        }
        return operation;
    }

    public static void main(String[] args) {
        Interp interp = new Interp();
    }
}