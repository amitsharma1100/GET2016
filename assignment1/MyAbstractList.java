package session1.assignment1;

public abstract class MyAbstractList<P> {

	public abstract boolean add(P p);
	public abstract P get(int index);
	public abstract int size();
	public abstract boolean add(P p,int index);
	public abstract boolean remove(P p);
	public abstract boolean remove(int index);
	public abstract void clear();
	public abstract MyAbstractList<P> reverse();
	public abstract MyAbstractList<P> sort();
	public abstract MyArrayList<P> concate(MyArrayList<P> list2);
}
