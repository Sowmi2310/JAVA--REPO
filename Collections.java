package FullStack;
import java.util.Deque;
import java.util.ArrayDeque;
public class CollArrayDe {
public static void main(String arg[]) {
	Deque <Integer> d=new ArrayDeque<>();
	d.add(234);
	d.add(230);
	d.add(237);
	d.add(235);
	d.add(874);
	System.out.println(d);
	System.out.println(d.removeFirst());
	System.out.println(d.removeLast());
	System.out.println(d);
	System.out.println(d.peekFirst());
	System.out.println(d.peekLast());

List<Integer>myarr=new ArrayList<>();
		myarr.add(100);
		myarr.add(800);
		myarr.add(100);
		myarr.add(500);
		myarr.add(200);
		myarr.add(600);
		System.out.println(myarr);
		System.out.println("-------------");
		ArrayList <Object> my=new ArrayList<>();
		my.add("hi");
		my.add("welcome");
		my.add("hi");
		my.add("go");
		my.add("come");
		my.add("stop");
		System.out.println(my);
		System.out.println(my.size());
		System.out.println(my.remove(1));
		System.out.println(my);
		System.out.println(my.get(3));
		System.out.println(my.set(0, "Bangalore"));
		System.out.println(my);
		System.out.println("-------------");
		
		ArrayList<String>str=new ArrayList<>();
		str.add("pink");
		str.add("black");
		str.add("red");
		str.add("yellow");
		str.add("grey");
		System.out.println(str);
		System.out.println("-------------");
		
		Iterator<String> st=str.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		System.out.println("-------------");
		Iterator<Integer>itr=myarr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	HashSet<String> s=new HashSet<String>();
	s.add("ant");
	s.add("nice");
	s.add("ball");
	s.add("come");
	s.add("zebra");
	s.add(null);
	s.add(null);
//	s.add("come"); duplicate not allow
	System.out.println(s);
	Iterator<String> se=s.iterator();
	while(se.hasNext()) {
		System.out.println(se.next()); //print in ASCII code format
	}
//	HashSet<Integer> i=new HashSet<Integer>();
//	i.add(12);
//	i.add(23);
//	i.add(11);
//	i.add(10);
//	i.add(7);
//	i.add(88);
//	i.add(99);
//	i.add(null);
//	System.out.println(i);
	HashSet<Integer> i=new LinkedHashSet<Integer>();
	i.add(12);
	i.add(23);
	i.add(11);
	i.add(10);
	i.add(7);
	i.add(88);
	i.add(99);
//	i.add(null);
	System.out.println(i);
	Set<String> l=new LinkedHashSet<String>();
	l.add("ant");
	l.add("nice");
	l.add("ball");
	l.add("come");
	l.add("zebra");
	System.out.println(l);
	LinkedList<String>str=new LinkedList<String>();
	str.add("pink");
	str.add("black");
	str.add("red");
	str.add("yellow");
	str.add("grey");
	System.out.println(str);
	System.out.println("----------");
	str.addFirst("grey");
	str.addLast("orange");
	System.out.println(str);
	System.out.println("----------");
	 str.removeFirst();
	 str.removeLast();


	 System.out.println(str);
	 System.out.println("----------");
	 System.out.println( str.getFirst());
	 System.out.println( str.getLast());
	 System.out.println("----------");
	 
//	 str.addAll(arr);
	 
	LinkedList <Integer>arr=new LinkedList<Integer>();
	arr.add(122);
	arr.add(300);
	arr.add(400);
	arr.add(299);
	arr.add(786);
	arr.add(177);
	System.out.println(arr);
	
	
	System.out.println("----------");
	Iterator<String> st=str.iterator();
	while(st.hasNext()) {
		System.out.println(st.next());
	}
	System.out.println("-------------");
	Iterator<Integer>itr=arr.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
Queue<Integer>q=new LinkedList<>();
		q.add(100);
		q.add(200);
		q.add(400);
		q.add(900);
		q.add(900);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		
		Queue <String> st=new PriorityQueue<>();
		st.add("black");
		st.add("apple");
		st.add("cat");
		st.add("man");
		st.add("egg");
		st.add("dog");
		st.add("long");
		st.add("hot");
		st.add("nice");
		st.add("rabbit");
		st.add("green");
		st.add("queen");
		st.add("x-ray");
		st.add("wall");
		st.add("kill");
		st.add("pen");
		st.add("yellow");
		st.add("violet");
		st.add("fish");
		st.add("ice");
		st.add("oil");
		st.add("sweet");
		st.add("tiger");
		st.add("unique");
		st.add("jam");
		st.add("zebra");
		System.out.println(st);
//		Iterator<String>str=st.iterator();
		while(!st.isEmpty()) {
			System.out.println(st.poll());
		}
		System.out.println(st);
		
	}
Stack <String> sta=new Stack <String>();
	sta.push("pink");
	sta.push("white");
	sta.push("green");
	sta.push("gray");
	sta.push("black");
	System.out.println(sta);
	System.out.println(sta.pop()); //delete the last assigned element and print
	System.out.println(sta);
	System.out.println(sta.peek()); //return last assigned element 
	System.out.println(sta);
	System.out.println(sta.empty());
	System.out.println(sta.search("white")); //length in reverse LIFO(stack)
	System.out.println("-----------");
	System.out.println(sta.remove(1));
	System.out.println(sta);
	Iterator<String> ft=sta.iterator();
	while(ft.hasNext()){
		System.out.println(ft.next());
	}
TreeSet<String>s=new TreeSet<String>();
		s.add("apple");
		s.add("big");
		s.add("Zebra");
		s.add("cat");
		s.add("doll");
		s.add("sing");
		s.add("null");
		System.out.println(s);
		TreeSet<Integer> d=new TreeSet<Integer>();
		d.add(23);
		d.add(45);
		d.add(88);
		d.add(12);
		d.add(10);
		System.out.println(d);
	Vector<String>str=new Vector<String>(18);
	str.add("pink");
	str.add("black");
	str.add("red");
	str.add("yellow");
	str.add("grey");
	System.out.println(str);
	System.out.println("----------");
	str.add(2,"grey");
	System.out.println(str);
	System.out.println(str.capacity());
	System.out.println(str.get(1));
	System.out.println(str.firstElement());
	System.out.println(str.lastElement());
	System.out.println(str.isEmpty());
	System.out.println("----------");
	
	 
	Vector <Integer>in=new Vector<Integer>();
	in.add(122);
	in.add(300);
	in.add(400);
	in.add(299);
	in.add(786);
	in.add(177);
	System.out.println(in);
	
	
	
}
}