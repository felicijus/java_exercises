package datastructures;


public class ArrayStack<E> implements IStack<E>
{
    private final E[] stack;
    private int top_e;
    private static final int MAX = 10;

    public ArrayStack()
    {
        this(MAX);
        top_e = -1;
    }

    public ArrayStack(int init)
    {
        stack = (E[]) new Object[init];
        top_e = -1;
    }

    protected Object[] output()
    {
        return stack;
    }


    @Override
    public boolean isEmpty()
    {
        return top_e == -1;
    }

    @Override
    public void push(E elem)
    {
        stack[++top_e] = elem;
    }

    @Override
    public E pop()
    {
        --top_e;
        return stack[top_e];
    }

    @Override
    public E top()
    {
        return stack[top_e];
    }

    @Override
    public int size()
    {
        return top_e+1;
    }
}


