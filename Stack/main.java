import java.util.Stack;  

public class main {
    public static void main(String[] args) {
        //Stack Create

        //Declaring Stack
        Stack<String> stackk = new Stack<>();

        if(stackk.empty() == true) {
            System.out.println("The empty stack");
        } else {
            System.out.println("This is not empty");
        }


        //pushing items into Stack
        stackk.push("Hello");
        stackk.push("World");
        stackk.push("I am Seriously going to Crack DSA");
        stackk.push("Hello");
        stackk.push("Bue");
        stackk.pop();

        System.out.println(stackk.empty());
        System.out.println(stackk);

        System.out.println(stackk.search("Hello"));  //it returns int the order inside the stack, and if there isn't anything it returns-1
                                                        //in case there are a lot of same value, it is going to return nearest one
    }
}
