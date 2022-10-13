import java.util.Scanner;
public class CustomStringMethods

{
    Scanner scan = new Scanner(System.in);

    /* this class has no instance variables */

    /* Constructor with no parameters, and since there are no instance variables to initialize,
              the constructor body is "empty" */

    public CustomStringMethods() {



    }

// WRITE AND TEST THE FOUR METHODS BELOW!

    /* Client provides searchFor and searchIn and method returns true if searchFor
              is located somewhere in searchIn , and returns false otherwise.

              For example, if searchFor is ple and searchIn is apples, this method returns true.
              If searchFor is hello and searchIn is apples, this method returns false.
     */
    public boolean foundIn(String searchFor, String searchIn) {

        if (searchFor.indexOf(searchIn)<0){
            return true;
        } else {
            return false;
        }





    }


    /* Client provides myString and maxLength and method returns true if the length of myString
              exceeds maxLength, and returns false otherwise.

              For example, if myString is apples and maxLength is 5, this method returns true.
              if myString is apples and maxLength is 6, this method returns false.
        */


    public boolean longerThan(String myString, int maxLength) {

        return myString.length()>maxLength;



    }


    /* Client provides str and idx and method returns a new String created by appending
              the character located at index idx of str to the beginning of str and the end of str

               For example, if str is apples and idx is 4, this method returns the string eapplese
               If str is apples and idx is 0, this method returns the string aapplesa
     */
    public String funnyString(String str, int idx) {
        return str.substring(idx,idx+1)+str + str.substring(idx,idx+1);

    }

    /* Client provides a single word as orig and the method returns a String that represents orig
              written in “Pig Latin”, which means that the first letter of the word is removed from the front and
              added to the end, and then “ay” is appended.

              For example, if orig is bananas, then the method returns the “Pig Latin” version, ananasbay
    */
    public String pigLatin(String orig) {
        return orig.substring(1)+orig.substring(0,1)+"ay";

    }


}

