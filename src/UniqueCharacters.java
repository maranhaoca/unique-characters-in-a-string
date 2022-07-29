import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println("Welcome to UniqueCharacters!!\nEnter a string!!");

        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        boolean response = isUniqueCharacters(userInput);
        if (response) {
            System.out.println("It's " + response + ", this string has unique characters.");
        } else {
            System.out.println("It's " + response + ", this string has no unique characters.");
        }
    }

    public static boolean isUniqueCharacters(String userInput) {
        char[] array = userInput.toCharArray();
        boolean status = true;

        for (int i = 0; i < array.length; i++) {
            if(status) {
                for (int k = i + 1; k < array.length; k++) {
                    //System.out.print(array[i] + " -> " + array[k] + " ");
                    if (array[i] == array[k]) {
                        status = false;
                        //System.out.println(false);
                        break;
                    } else {
                        status = true;
                        //System.out.println(true);
                    }
                }
            }
        }
        return status;
    }
}
