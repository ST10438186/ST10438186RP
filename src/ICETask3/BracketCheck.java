package ICETask3;

import java.util.Scanner;

public class BracketCheck {

   
    public static void main(String[] args) {

        Scanner MyScan = new Scanner(System.in);                                                            // Input for Brakcet Sequence.
        System.out.println("Enter a sequence of Brackets");
        String s = MyScan.nextLine();
        
        boolean Valid = isValid(s);
        if (Valid == true) {
            System.out.println("The Parenthesis Sequence is Valid");
        } else {
            System.out.println("The Parenthesis Sequence is Invalid");
        }

    }

    public static boolean isValid(String s) {
        if(s.trim().isEmpty())                                                                              //trims the leaading spaces in the input. if input is empty, returns false as that is an invalid input.
            return false;
        else{                                                                                               //if input is not empty, continues with the code.
        StringBuilder Br = new StringBuilder();                                                             //String Builder.
        for (int x = 0; x < s.length(); x++) {                                                              // For Loop to iterate through the string.
            char Pos = s.charAt(x);                                                                         // equates the character at Position(x) to Pos variable.
            if (Br.length() == 0) {
                Br.append(Pos);
                continue;                                                                                   // ends current loop and continues to the next iteration.
            }
            char Pos1 = Br.charAt(Br.length() - 1);                                                         // checks the position in the stringbuilder - 1.
            if (Pos1 == '(' && Pos == ')' || Pos1 == '{' && Pos == '}' || Pos1 == '[' && Pos == ']') {
                Br.deleteCharAt(Br.length() - 1);                                                           // Deletes the charcater at String length - 1. if it's a valid pair of parenthesis
            } else {
                Br.append(Pos);
            }
        }
        return Br.length() == 0;                                                                            //indicates that all the brackets have been successfuly paired and deleted, if the length equals 0.
    }
    }

}


