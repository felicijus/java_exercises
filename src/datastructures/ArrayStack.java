package datastructures;


public class ArrayStack<E> implements IStack<E>
{
    private E[] elements;
    private int top;
    private static final int MAX = 10;

    public ArrayStack()
    {
        this(MAX);
    }

    public ArrayStack(int initsize)
    {
        elements = (E[]) new Object[initsize];
        top = -1;
    }

    @Override
    public boolean isEmpty()
    {
        return (top == -1);
    }

    @Override
    public void push(E elem) {
        elements[++top]= elem;
    }

    @Override
    public E pop() {
        if(top == -1) return null;
        return elements[top--];
    }

    @Override
    public E top() {
        if(top == -1) return null;
        return elements[top];
    }

    @Override
    public int size() {
        return (top+1);
    }

    public void output()
    {
        for(int i = top; i >= 0;i--)
        {
            if(elements[i] == null)
            {
                continue;
            }
            System.out.println(elements[i]);
        }
    }

}


