package session1.assignment1;


public class MyListCreator {

	public static void main(String[] args) {

	    MyArrayList<String> mylist=new MyArrayList<String>();
	    mylist.add("1");
		mylist.add("2");
		mylist.add("3");
		mylist.add("4");
		mylist.add("5");
		mylist.add("6");
		System.out.println("size:"+mylist.size());
		for(int i=0;i<mylist.size();i++)
		  {
			System.out.println(mylist.get(i));
		   }
		
		mylist.remove(3);
		mylist.remove("5");
		MyArrayList< String> myList2=new MyArrayList<String>();
		myList2=mylist.reverse();
		myList2=mylist.concate(myList2);
		System.out.println("size2  "+myList2.size());
		for(int i=0;i<myList2.size();i++)
	  {
		System.out.println("value : "+myList2.get(i));
	   }
	
	}

}
