package session1.assignment1;


public class MyArrayList<P> extends MyAbstractList<P> {

	private P[] a;
	static int sizeOfArray = 10;

	MyArrayList(P[] array) {
		a = array;
	}

	MyArrayList() {
		a = (P[]) new Object[sizeOfArray];
	}

	@Override
	public int size() {
		int size = 0;
		for (int i = 0; i < sizeOfArray; i++) {
			if (a[i] == null) {
				break;
			} else {
				size++;
			}
		}
		return size;
	}

	@Override
	public boolean add(P p) {
		int nextIndex = size();
		checkSize();
		a[nextIndex] = p;
		return true;
	}

	@Override
	public boolean add(P object, int index) {
		a[index] = object;
		return true;
	}

	@Override
	public P get(int index) {
		return a[index];
	}

	public void checkSize() {
		if (size() >= sizeOfArray) {
			copyToNew();
		}
	}

	public void copyToNew() {
		int newSize = sizeOfArray + (sizeOfArray / 2);
		P[] temp = a;
		int oldSize = temp.length;
		a = (P[]) new Object[newSize];
		for (int index = 0; index < oldSize; index++) {
			a[index] = temp[index];
		}
		sizeOfArray = newSize;
	}

	@Override
	public boolean remove(P p) {
		boolean status=true;
		int size=size();
		for(int index=0;index<size;index++)
		{
			if(a[index]==p)
			{
				status=remove(index);
			}
		}
		
			return status;
	}

	@Override
	public boolean remove(int index) throws ArrayIndexOutOfBoundsException {
	   boolean status=true;
	   if(index>=size() || index<0)
	   {
		   status=false;
		   throw new ArrayIndexOutOfBoundsException();
		  }
	   else
	   {
		   P[] temp =(P[]) new Object[sizeOfArray-1];
		   int tempindex=0;
		    for(int pos=0;pos<size();pos++)
		   {
			   if(pos==index)
			   {
				   continue;
			   }
			   else
			   {
				   temp[tempindex++]=a[pos];
			   }
			 
		   }
		    a=temp;
		   	   
	   }
		return status;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		sizeOfArray = 10;
		a = (P[]) new Object[sizeOfArray];
	}

	@Override
	public MyArrayList<P> reverse() {
		@SuppressWarnings("unchecked")
		MyArrayList<P> temp=new MyArrayList<P>();
		int size=size();
		int aIndex=0;
		for(int index=size-1;index>=0;index--)
		{
			temp.add(a[aIndex++],index);
		}
		return temp;
	}

	

	@Override
	public MyArrayList<P> concate(MyArrayList<P> list2) {
		int lengthOfList1=size();
		int lengthOfList2=list2.size();
		int totalSize=lengthOfList1+lengthOfList2;
		MyArrayList<P> temp=new MyArrayList<P>();
		//checkSize();
		for(int index1=0;index1<lengthOfList1;index1++)
		{
			temp.add(a[index1]);
		}
		for(int index2=0;index2<lengthOfList2;index2++)
		{
			temp.add(list2.get(index2));
		}
		sizeOfArray=totalSize;
		a=(P[]) new Object[totalSize];
		for(int index=0;index<totalSize;index++)
		{
			a[index]=temp.get(index);
		}
		return temp;
	}

	@Override
	public MyAbstractList<P> sort() {
		// TODO Auto-generated method stub
		return null;
	}

	
}