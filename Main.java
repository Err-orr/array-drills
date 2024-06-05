import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int sum = 0;

        // Q1:Imagine you are creating a task management application. Declare an array called taskList with 3 items representing tasks you need to complete today.
        String[] taskList = {"Make food", "Clean my room", "Take a shower"};

        // Q2: In your task management application, you need to display the tasks in the taskList array to the user. Print the tasks in the taskList array to the console.
        for (String i : taskList) {
            System.out.println(i + " ");
        }
        // Use the following array for the next set of questions:
        String[] toLearn = {"Arrays", "ArrayLists", "2D Arrays", "Inheritense", "Recursion"};

        // Q5: Imagine you're a student learning web development. Determine the number of technologies you need to learn by printing the length of the toLearn array.
        System.out.println(toLearn.length);

        // Q6: As a learner, you want to focus on mastering one technology at a time. Print the second technology you need to learn from the toLearn array.
        System.out.println(toLearn[1]);

        // Q7: Your mentor advised you to prioritize learning Express for backend development. Print the technology you should focus on next from the toLearn array.
        System.out.println(toLearn[2]);

        // Q8: While reviewing your learning plan, you realize you misspelled one of the technologies. Correct the misspelled technology "Inheritense" to "Inheritance" and confirm the change by printing the updated toLearn array.
        toLearn[3] = "Inheritence";
        System.out.println(toLearn[3]);

        // Directions: Use the following arrays to complete the questions that follow.
        int[] tipsThursday = {12, 18, 26, 13, 44};
        int[] tipsFriday = {9, 14, 19, 17, 22, 38, 50, 22, 8};
        int[] tipsSaturday = {6, 25, 16, 15, 20, 34, 18};

        // Q14: You work as a waiter in a restaurant and need to calculate the total number of tables served on Thursday. Write a method to print the number of tables served, using the tipsThursday array as a reference.
        for (int j =0; j < tipsThursday.length; j++) {
            sum  += tipsThursday[j];
        }
        System.out.println(sum);
        // Q15: The restaurant manager wants to know if there were enough tables served on Friday to consider it a busy night. Write a method to check the number of tables served and print a suitable message based on the condition.
        sum = 0;
        for (int k = 0; k < tipsFriday.length; k++) {
            sum += tipsFriday[k];
        }
        System.out.println("There are " + sum + " tables for there to be a busy night.");

        // Q16: Create an array by combining two arrays
        // The algorithm for combining two arrays is actually quite simple:
        // 1. Create a new array with a size equal the combined length of the two arrays.
        // 2. Use a loop to assign elements from the first array to the new array using the same indexes until the end of the first loop.
        // 3. Use a second loop to assign elements from the second array to the new array offsetting the index in the new array by the length of the first array.
        // 4. Return the new array
        // Write the method below:
        String[] letters = {"A", "B", "C", "D"};
        String[] otherLetters = {"no", "noo", "nooo", "noooo", "E", "F", "G", "H"};
        String[] newArr = new String[8];
        for (int l = 0; l < letters.length; l++) {
            newArr[l] = letters[l];
        }
        for (int m = letters.length; m < letters.length + 4; m++) {
            newArr[m] = otherLetters[m];
        }
        System.out.println(Arrays.toString(newArr));

        // Q17: Swapping Values in an Array
        // To swap two elements of the array, a simple algorithm can be followed:
        // 1. Store the value of the first element in a temporary variable.
        // 2. Assign the value of the second element to the first element.
        // 3. Assign the value of the temporary variable to the second element.
        //
        // Consider the data set of the String array called animals:
        String[] animals = {"Dog", "Goat", "Cat", "T-rex", "Duck"};
        // Write code to swap “Goat” and “Duck”:
        String[] tempArr = new String[animals.length];
        for (int n = 0; n < 5; n++) {
            tempArr[n] = animals[n];
        }
        tempArr[1] = animals[4];
        tempArr[4] = animals[1];
        System.out.print(Arrays.toString(tempArr));
    }
}