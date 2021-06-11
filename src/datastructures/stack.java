package datastructures;

public interface IStack<E>
{
    public boolean isEmpty();
    public IStack<E> push(E elem);
    public IStack<E> pop(E elem);

    public E top();

}
