package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println(findMissing(array, 10));

    }

    public static int findMissing(int[] array, int n){
        int total = 0;
        int sum = 0;
        for(int i=0; i < n; i++){
            sum += i;
        }

        for(int i=0; i < array.length; i++){
            total += i;
        }

        return(sum - total);
    }

    public static class LowestNumber {

        public static void main(String[] args) {
            /*
             * Write java solution to find the lowest number from this array.
             * Use one of the databases from mysql or mongodb to store and to retrieve.
             */
            int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

    //		ConnectDB connectDB = new ConnectDB();
    //
    //		List<String> lowestValue = new ArrayList<String>();
    //		try {
    //			connectDB.InsertDataFromArryToMySql(array, "tbl_lowestNumber", "column_lowestNumber");
    //			lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
    //
    //		} catch (Exception e) {
    //			e.printStackTrace();
    //		}
    //		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
    //		for(String st:lowestValue){
    //			System.out.println(st);
    //		}

            System.out.println(findLowestNum(array));
        }

        public static int findLowestNum(int[] arr){
            int min = arr[0];
            for(int i =1; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            return min;
        }

    }
}