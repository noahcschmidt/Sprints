/*created by IntelliJ Idea
 *User:Noah Schmidt
 *Date:3/8/2018
 *contact:noahcschmidt@gmail.com,noahchristopher.schmidt@calbaptist.edu
*/

public class StringManipulationSprint {
    private String myString;

    private StringManipulationSprint(String newString) {
        myString = newString;
    }


    public String getString() {
        return myString;
    }

    public void reverse() {
        StringBuilder rev = new StringBuilder(myString);
        rev.reverse();
        myString = rev.toString();
    }


    public void decimate() {
        StringBuilder edit = new StringBuilder(myString);
        for(int i = 0; i < myString.length(); i += 5) {
            edit.deleteCharAt(i);
        }
        myString = edit.toString();
    }
}
