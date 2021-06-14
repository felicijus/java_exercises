package datastructures;

public class Test {

    public static void out(ArrayStack a)
    {
        System.out.println("ArrayStack:");
        for (int i = a.size()-1; i >= 0; i--)
        {
            System.out.println(a.output()[i]);
        }
    }

    public static void main(String[] args) {

        System.out.println("\nNew Stack of Type Integer");
        IStack<Integer> i = new ArrayStack<Integer>();

        System.out.println("Empty?: "+i.isEmpty());

        for (int k = 9; k >= 0; k--)
        {
            i.push(k);
        }

        Test.out((ArrayStack) i);

        System.out.println();
        System.out.println("Empty?: "+i.isEmpty());
        System.out.println("Size: "+i.size());
        i.pop();
        System.out.println("Top: "+i.top());

        Test.out((ArrayStack) i);



        System.out.println("\nNew Stack of Type String");
        IStack<String> s = new ArrayStack<String>();

        System.out.println("Empty?: "+s.isEmpty());
        s.push("A");
        s.push("B");
        s.push("Hallo");
        Test.out((ArrayStack) s);

        System.out.println();
        System.out.println("Empty?: "+s.isEmpty());
        System.out.println("Size: "+s.size());
        s.pop();
        System.out.println("Top: "+s.top());

        Test.out((ArrayStack) s);
    }
}
