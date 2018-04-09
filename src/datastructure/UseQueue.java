package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> Que = new LinkedList<>();

		Que.add(150);
		Que.add(200);
		Que.add(250);

		System.out.println(Que);

		int head = Que.peek();
		System.out.println(head);

		//Store results in the database
		//ConnectDB db = new ConnectDB();
		//db.InsertDataFromArrayListToMySql(myArrList, "queuetable", "ID");

	}



}
