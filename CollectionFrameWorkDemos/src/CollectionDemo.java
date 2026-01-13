import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		System.out.println("------------------List Types-----------------");
		System.out.println("-------------------Array List----------------");
		List<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(new Integer(20));
		arraylist.add(10);
		arraylist.add(5);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(15);
		arraylist.add(23);
		System.out.println("Array List Is :"+arraylist);
		System.out.println("Search :"+arraylist.contains(5));
		System.out.println("Get element :"+arraylist.get(2));
		System.out.println("First Element :"+arraylist.getFirst());
		arraylist.remove(3);
		System.out.println("After Delete :"+arraylist);
		
		System.out.println("-------------------Linked List----------------");
		List<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(20);
		linkedlist.add(10);
		linkedlist.add(5);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(15);
		linkedlist.add(23);
		System.out.println("Linked List Is :"+linkedlist);
		System.out.println("Search :"+linkedlist.contains(5));
		System.out.println("Get element :"+linkedlist.get(2));
		System.out.println("First Element :"+linkedlist.getFirst());
		linkedlist.remove(3);
		System.out.println("After Delete :"+linkedlist);
		
		System.out.println("---------------------Set Types----------------");
		System.out.println("------------------- Tree Set ----------------");
		Set<Integer> treeset = new TreeSet<Integer>();
		treeset.add(20);
		treeset.add(10);
		treeset.add(5);
		treeset.add(20);
		treeset.add(30);
		treeset.add(15);
		treeset.add(23);
		System.out.println("Tree Set Is :"+treeset);
		
		System.out.println("------------------- Hash Set ----------------");
		Set<Integer> hashset = new HashSet<Integer>();
		hashset.add(20);
		hashset.add(10);
		hashset.add(5);
		hashset.add(20);
		hashset.add(30);
		hashset.add(15);
		hashset.add(23);
		System.out.println("Hash Set Is :"+hashset);

	}

}
