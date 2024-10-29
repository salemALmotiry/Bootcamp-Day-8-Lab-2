import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //kindly reminder 2th,3th and 4th questions add on to 5th questions menu driven
        Scanner input = new Scanner(System.in);
        /*
        * 1.Write a program to find all of the longest word in a given dictionary.
         * */

        String [] arr = { "cat", "dog", "red", "is", "am" };
        print_longest(arr);

        /*
        * 2. Write a program that displays the number of occurrences of an element in the array.
        * */

//        int [] arr = {1,1,1,3,3,5};
//        System.out.print("please enter num count occurrences numbers in given array"+ Arrays.toString(arr) +" :");
//        int x = input.nextInt();
//
//        print_occurrences(arr,x);

        /*
        * 3.Write a program to find the k largest elements in a given array. Elements in the array can be in
            any order.
        * */

//        int [] arr = {1,4, 17, 7, 25, 3, 100};
//        System.out.println("please enter k value: ");
//        int k = input.nextInt();
//        print_largest(arr,k);

        /*
        * 4. Create a method to reverse an array of integers. Implement the method without creating a new
            array.
        * */

//        int [] arr = {5,4,3,2,1};
//        arr = reverse_array(arr);
//        System.out.println(Arrays.toString(arr));

        /*
        * 5. Write a menu driven Java program with following option:
         * */

//        System.out.print("please enter size of the array: ");
//        int size = input.nextInt();
//        int [] arr = new int [size];
//
//
//        int choice = 0 ;
//        while (choice!=8){
//            System.out.println("---------------------------------");
//            System.out.println("1 to insert the array" +
//                    "\n2 to display elements of an array" +
//                    "\n3 to search the element within array" +
//                    "\n4 to sort the array" +
//                    "\n5 to displays the number of occurrences of an element in the array" +
//                    "\n6 to find the k largest elements in the array" +
//                    "\n7 to reverse the array" +
//                    "\n8 to stop");
//            choice = input.nextInt();
//            System.out.println("-----------------------------------");
//
//            switch (choice){
//                case 1:
//                    arr = insert(arr);
//                    break;
//                case 2:
//                    display_array(arr);
//                    break;
//                case 3:
//                    System.out.println("Please enter target: ");
//                    int target = input.nextInt();
//                    display_array(arr);
//                    System.out.println("searing in array for "+target);
//                    if(search(arr,target)!=-1 )
//                        System.out.println("target found "+ target+" ...");
//                    else
//                        System.out.println("target not found");
//                    break;
//                case 4:
//                    arr = sort_arr(arr);
//                    break;
//                case 5:
//                    System.out.print("please enter element to count occurrences number in given array"+ Arrays.toString(arr) +": ");
//                    int x = input.nextInt();
//                    print_occurrences(arr,x);
//                    break;
//                case 6:
//                    System.out.println("please enter k value: ");
//                    int k = input.nextInt();
//                    print_largest(arr,k);
//                    break;
//                case 7:
//                    arr = reverse_array(arr);
//                    break;
//                default:
//                    break;
//
//
//
//            }
//
//        }

        /*
        * 6. Create a method that generates a random number within a given range. Allow the user to
            specify the range and call the method to display random numbers
        * */
//
//        System.out.print("Enter the minimum value of the range: ");
//        int min  = input.nextInt();
//
//        System.out.print("Enter the maximum value of the range: ");
//        int max  = input.nextInt();
//
//        System.out.print("Enter the number of random numbers to generate: ");
//        int range  = input.nextInt();
//
//        int [] arr = generate_array(min,max,range);
//
//        System.out.println(Arrays.toString(arr));

        /*
        * 7. Write a program that checks the strength of a password. Create a method that evaluates a
            password based on criteria like length, inclusion of special characters, an uppercase/lowercase letters.

        * */


//        System.out.print("Please enter your password : ");
//        String password = input.nextLine();
//
//        int length = check_length(password);
//        int upper_lower = check_uppercase_lowercase(password);
//        int special = check_special_characters(password);
//        int evaluate = length+upper_lower+special;
//
//        if(evaluate>=8)
//            System.out.println("password is strong");
//        else if(evaluate>=5)
//            System.out.println("password is moderately ");
//        else
//            System.out.println("password is week ");

        /*
        * 8. Create a method that generates the Fibonacci sequence up to a specified number of terms
        *
        * */

//        System.out.println(Arrays.toString(fibonacci(10)));















    }


    public static void print_longest(String [] arr){


        int counter = 0;
        String longest= "";

        // For-each loop
        for (String item : arr) {
            // process item
            if(counter<item.length())
                counter=item.length();
        }



        for (String item : arr) {

            if(counter <= item.length()) {
                longest = longest + " " + item;

            }
        }
        System.out.println(longest+" is the longest word");

    }

    public static void print_occurrences(int [] arr, int x ) {


        int counter = 0 ;
        for (int item : arr) {
            // process item
            if(item == x)
                counter++;
        }

        System.out.println(x+" occurs "+counter+" times");
    }


    public static void print_largest(int [] arr, int k ) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {

                if(arr[i] > arr[j] ) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }


        System.out.println("3 largest elements of the said array are:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static int []  reverse_array(int [] arr ) {


        int x = 0 ;
        for (int i = arr.length-1; i > arr.length/2; i--) {

            int temp = arr[x];
            arr[x] = arr[i];
            arr[i] = temp;
            x++;

        }

        //{5,4,3,2,1};
       return arr;
    }


    public static int []  insert(int [] arr ) {
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < arr.length; i++){

            System.out.print("Please enter number: ");
            arr[i]= input.nextInt();

        }

        return arr;
    }


    public static void  display_array(int [] arr ) {


            // For-each loop
        System.out.println("++++++++Display++++++++");

            for (int item : arr) {
                // process item
                System.out.print(item+" ");
            }
        System.out.println("\n+++++++++++++++++++++++");


    }

    public static int [] sort_arr(int [] arr ) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {

                if(arr[i] < arr[j] ) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        return arr;




    }


    public static int search(int [] arr, int target ) {


        // For-each loop
        for (int item : arr) {
            // process item
            if(target == item)
                return item;
        }

        return -1;
    }

    public static int [] generate_array(int min, int max, int range) {
        int [] arr = new int[range];

        Random random = new Random();



      for (int i = 0; i < arr.length; i++) {
          arr[i] = random.nextInt(min,max);
      }


        return arr;
    }

    public static int check_length(String password ) {

        if(password.length() <=5)
            return 0;
        else if(password.length() <=7)
            return 2;
        else
            return 3;

    }

    public static int check_special_characters(String password ) {

        if(password.matches(".*[!,@,#,$,%,&,*].*"))
            return 2;
        else
            return 0;

    }


    public static int check_uppercase_lowercase(String password ) {

        if(password.matches(".*[A-Z].*") && password.matches(".*[a-z].*"))
            return 3;
        else if(password.matches(".*[A-Z].*") || password.matches(".*[a-z].*"))
            return 1;
        else
            return 0;

    }


    public static int [] fibonacci(int fibonacci_num ) {

        int [] arr = new int [fibonacci_num] ;
        for (int i = 0; i < arr.length; i++) {

            if (i == 0 )
                arr[i] = 0 ;
            else if(i == 1)
                arr[i] = 1;
            else if(i == 2)
                arr[i] = 1;
            else
                arr[i] = arr[i-2]+arr[i-1];
        }

        return arr;

    }

}
