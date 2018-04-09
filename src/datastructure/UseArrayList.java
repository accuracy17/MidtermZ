package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

				ArrayList<Integer> myArrList = new ArrayList<Integer>(5);
				myArrList.add(1);
				myArrList.add(3);
				myArrList.add(5);
				myArrList.add(7);
				myArrList.add(9);

				Iterator iter = myArrList.iterator();

				while(iter.hasNext()) {
					System.out.println(iter.next());

					myArrList.add(12);
				}

				//Store results in the database
				ConnectDB db = new ConnectDB();



			}

}
