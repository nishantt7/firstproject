package lesson1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_Interator {
	public static void main(String[] args) {
			List <String> li=new ArrayList<String>();
			li.add("abc");
			li.add("def");
			li.add("ghi");
			li.add("jkl");
			li.add(0,"123");
			List<String> li1=new ArrayList<String>(li);///this line has made li1 to contain li
			li1.addAll(li);//this will add li to li1 again
			System.out.println("here");
			System.out.println(li);//list can be printed as is also
			System.out.println("here");
			System.out.println(li1);
			System.out.println("here");
			System.out.println("any letters with def" +" "+li.contains("def"));
			System.out.println("here");
			//iterator to be used in case we want to do something with few records
			Iterator<String> it=li.iterator();
			System.out.println("here");
			while(it.hasNext())
			{
			      if(it.next().equalsIgnoreCase("def"))
			      {
			      it.remove();
			      }
			    //System.out.println(it.next()); //this will not work since we are using a counter inside another 
			      //counter and it.next() counter does not have any updates of the modification
			      //performed above ---my understanding
				//System.out.println(li);
			}
			System.out.println("here");
			//System.out.println(it.next());
			System.out.println(li);
			Iterator<String> it1=li1.iterator();
			while(it1.hasNext())
			{
				System.out.println(it1.next());
			}
	}
}
