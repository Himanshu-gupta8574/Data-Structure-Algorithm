
package Strings;

public class Problem1 {

    public static void main(String[] args) {

        String s = "AbZd";
        char[] arr = s.toCharArray();
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                System.out.println("error");
                return;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            char ch = arr[i];

            if (i % 2 == 0) {

                if (ch == 'Z') {
                    arr[i] = 'B';
                } else if (ch == 'z') {
                    arr[i] = 'b';
                } else {
                    arr[i] = (char) (ch + 2);
                }

            } else {

                if (ch == 'A') {
                    arr[i] = 'Z';
                } else if (ch == 'a') {
                    arr[i] = 'z';
                } else if (ch == 'O') {
                    arr[i] = '9';
                } else {
                    arr[i] = (char) (ch - 1);
                }
            }
        }

        s = new String(arr);

        System.out.println(s);
    }
}

