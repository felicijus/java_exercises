package datastructures;

public class Test {

    public static void main(String[] args) {

        System.out.println("\nNew Stack of Type Integer");
        IStack<Integer> s = new ArrayStack<Integer>();
        s.push(20);
        s.push(28);
        s.push(2);

        System.out.println(s.size());

        System.out.println("Following items pushed to Stack as of now:");
        s.output();

        System.out.println("\nNew Stack of Type String");
        IStack<String> string = new ArrayStack<String>(9);
        string.push("Aas");
        string.push("B");
        string.push("Ds");

        System.out.println(string.size());

        System.out.println("Following items pushed to Stack as of now:");
        string.output();

        System.out.println("\nTop String:"+string.top());

        System.out.println("\nPop String:"+string.top());
        string.pop();
        string.output();
    }
}
