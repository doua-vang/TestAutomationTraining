import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class ReadFile {
    public static void printArrayList(ArrayList<String> ids) {
        for(String id : ids) {
            System.out.println(id);
        }
    }
    public static String rightTrim(String word) {
        return word.replaceAll("\\s+$", "");
    }

    public static ArrayList<String> getMemberIds(String line) {
        ArrayList<String> ids = new ArrayList<String>();
        ids.add(rightTrim(line.substring(7,14)));
        ids.add(rightTrim(line.substring(15,34)));
        ids.add(rightTrim(line.substring(35,45)));
        ids.add(rightTrim(line.substring(46,57)));

        return ids;
    }


    public static String getName(String line) {
        String firstName = rightTrim(line.substring(118,152));
        String lastName = rightTrim(line.substring(58,117));
        String middleName = rightTrim(line.substring(153,177));

        if (middleName.equalsIgnoreCase("")) {
            return firstName + " " + lastName;
        }

        return firstName + " " + middleName + " " + lastName;
    }
    public static void main(String args[]) throws FileNotFoundException {
        String file = "UCARE_DHS_TRANSEND_20201102.txt";
        String filename = "C:\\Users\\dvang\\Desktop\\";
        filename = filename + file;

        File dhsFile = new File(filename);
        Scanner s = new Scanner(dhsFile);

        while(s.hasNextLine()) {
            String line = s.nextLine();
            printArrayList(getMemberIds(line));
            System.out.println(getName(line));
        }
    }

}
