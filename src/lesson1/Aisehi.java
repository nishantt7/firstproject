package lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.openqa.selenium.Keys;

public class Aisehi {
	public static void main(String[] args) 
	{
	    Collection<Integer> l = new ArrayList<Integer>();
	    for (int i=0; i < 10; ++i) 
	    {
	        l.add(new Integer(4));
	        l.add(new Integer(5));
	        l.add(new Integer(6));
	    }
	    Iterator<Integer> abc = l.iterator();
	    while(abc.hasNext())
	    {
	    	if (abc.next()==5)
	    	{
	    		abc.remove();
	    	}	
	    }
	    /*for (Integer i : l) {
	        if (i.intValue() == 5) {
	            l.remove(i);///its problematic since we are iterating as well as modifying the list
	        }
	    }*/
	    System.out.println(l);
	}
}
