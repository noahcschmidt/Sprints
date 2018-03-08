/*created by IntelliJ Idea
        *User:Noah Schmidt
        *Date:3/8/2018
        *contact:noahcschmidt@gmail.com,noahchristopher.schmidt@calbaptist.edu
 */

public class StarSprint {
    public static void main(String args[]) {
        printStars(5);
        System.out.println();
        printStars(9);
    }

    public static void printStars(int num) {
        printStars(num, num);    //max is number of characters per line
    }

    private static void printStars(int num, int max) {
        if (num == 0)
            return;
        printStars(num - 1, max);

        int charNum = (max * 2) - 1;    //number of chars per line
        int starNum = (num * 2) - 1;    //num of stars per line
        int spaceNum = (charNum - starNum) / 2; //number of spaces on sides of stars

        for (int i = 0; i < spaceNum; i++) {    //print leading spaces
            System.out.print(" ");
        }

        for (int i = 0; i < starNum; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < spaceNum; i++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}
