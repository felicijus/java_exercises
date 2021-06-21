package datastructures;

public interface IStack<E>
{
    boolean isEmpty();
    void push(E elem);
    E pop();
    E top();
    int size();

}

