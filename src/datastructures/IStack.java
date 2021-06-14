package datastructures;

public interface IStack<E>
{
    boolean isEmpty();

    Object[] push(E elem);
    Object[] pop();
    E top();
    int size();
    Object[] output();

}

