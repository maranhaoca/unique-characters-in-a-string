public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("caio"));
    }

    public static boolean uniqueCharacters(String input) {
        char[] array = input.toCharArray();
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