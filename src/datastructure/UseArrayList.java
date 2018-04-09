package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Rose");
		myList.add("SunFlower");
		myList.add("Lilly");
		myList.add("California Poppy");

		for(String list : myList){
			System.out.println(list);
		}

		int typesOfFlowers = myList.size();


		//ConnectDB connectDB = new ConnectDB();
		//connectDB.insertDataFromStringToMySql(myList,"List","Name");


		}




}