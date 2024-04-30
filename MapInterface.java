import java.awt.*;
import java.applet.*;

/*
<applet code="Demo.class" width="1000" height="1000"> </applet>
*/
public class Demo extends Applet {
	
	public void paint(Graphics g) {
		g.drawLine(10,10,300,300);
	}
}




Repository Link:
https://github.com/Sasi211104/Sasi211104/blob/main/Demo.java


Output:



Observation(s):
At first,  I tried to compile and run the applet, but it didn't work.
Then I saw a way and ran it in the linux. Well, this is a deprecated one so we don't have to care about that.
It's not just drawing, we can print the images using the applets.


Exp#
7
Week#
10
Date#
28/04/2024


Aim :
Demonstrate Collections (List, Queue & Hash) in java.


Classes,Constructors, Methods & Variables Used:
list
queue
hash
list: An ordered collection (also known as a sequence). The user of this interface has precise control over where in the list each element is inserted.
queue: A collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations.
hash: A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element.




Variables:  
ArrayList<Integer> obj
 Queue<Integer> obj
HashSet<Integer> obj


Program:
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;

class list{
    list(){
        ArrayList<Integer> obj=new ArrayList<Integer>();
        obj.add(1);
        obj.add(45);
        System.out.println(obj);
        System.out.println(obj.get(0));
    }
}

class queue{
    queue(){
        Queue<Integer> obj=new ArrayDeque<>();
        obj.add(23);
        obj.add(56);
        System.out.println(obj.peek());
        obj.remove();
        System.out.println(obj.peek());
    }
}

class hash{
    hash(){
        HashSet<Integer> obj=new HashSet<Integer>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        if(obj.contains(1)){
            System.out.println("Search found");
        }else{
            System.out.println("Search not found");
        }
        obj.remove(3);
        if(obj.contains(3)){
            System.out.println("Search found");
        }else{
            System.out.println("Search not found");
        }
    }
}
public class Collections{
    public static void main(String[] args) {
        list obj=new list();
        queue obj2=new queue();
        hash obj3=new hash();
    }
}


Repository Link:
https://github.com/Sasi211104/Sasi211104/blob/main/Collections.java








Output:



Observation(s):
It is the collections part where each set of interfaces has its own classes and methods.
Tried to add the same element in the set, but it didn't take it because of its unique properties.
Here the search method is defined in the hashSet class where we can search the element and it returns the boolean value.



Exp#
8
Week#
10
Date#
28/04/2024


Aim :
Demonstrate Map Interface using Java.


Classes,Constructors, Methods & Variables Used:
map interface
map interface: An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.




Variables:  
 Map<String,Integer> obj


Program:
import java.util.HashMap;
import java.util.Map;

public class mapInterface {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("sai", 1);
        obj.put("naidu", 2);
        obj.put("durga", 3);
        obj.put("karthik", 4);
        for(Map.Entry<String,Integer> m:obj.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}

