public class Main {
    public static void main(String[] args) {
        //task 1
        int [] intArray = {1, 2, 3};
        double [] doubles = {1.57, 7.654, 9.986};
        String [] strings = {"I", "know", "this", "things"};

        //task 2
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i != intArray.length - 1){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i != doubles.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
            if (i != strings.length - 1){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        //task 3
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i != 0){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i != 0){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.print(strings[i]);
            if (i != 0){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        //task 4
        for (int element : intArray) {
            if (element % 2 != 0){
                element++;
            }
            System.out.print(element + " ");
        }
    }
}