package datastructures;


public class ArrayStack<E> implements IStack<E>
{
    private E[] elements;
    private int top_e;
    private static final int MAX = 10;

    public ArrayStack()
    {
        this(MAX);
        top_e = -1;
    }

    public ArrayStack(int initsize)
    {
        elements = (E[]) new Object[initsize];
        top_e = -1;
    }

    @Override
    public boolean isEmpty()
    {
        if(top_e == -1)
        {
            return true;
        }
        else return false;
    }

    @Override
    public Object[] push(E elem)
    {
        elements[++top_e] = elem;
        return elements;
    }

    @Override
    public Object[] pop()
    {
        --top_e;
        return elements;
    }

    @Override
    public E top()
    {
        return elements[top_e];
    }

    @Override
    public int size()
    {
        return top_e+1;
    }

    public Object[] output()
    {
        return elements;
    }
}


