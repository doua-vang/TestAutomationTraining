import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;


public class ReadFile {
    static String newLine = "\n";
    static String tabLine = "\t";
    public static void printArrayList(ArrayList<String> ids) {
        for(String id : ids) {
            System.out.println(id);
        }
    }
    public static String rightTrim(String word) {
        return word.replaceAll("\\s+$", "");
    }

    public static String getAddressInformation(String line) {

        return "";
    }


    public static String getMemberIds(String line) {
        String ids = "";
        ids += "HealthRulesId: " + rightTrim(line.substring(15,34)) + newLine;
        ids += "AmisysId: " + rightTrim(line.substring(35,45)) + newLine;
        ids += "PMI: " + rightTrim(line.substring(7,14)) + newLine;
        ids += "CaseNumber: " + rightTrim(line.substring(237,245)) + newLine;
        ids += "TuplNUmber: " + rightTrim(line.substring(245,264)) + newLine;
        ids += "MBI: " + rightTrim(line.substring(46,57)) + newLine;

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

    public static String getBirthDate(String line) {
        return rightTrim(line.substring(178,185));
    }

    public static String getAddress(String line) {
        String addressInformation = "";
        String residentialAddressLineOne = rightTrim(line.substring(333,388));
        String residentialAddressLineTwo = rightTrim(line.substring(388,443));
        String residentialCityLine = rightTrim(line.substring(443,473));
        String residentialStateLine = rightTrim(line.substring(473,476));
        String residentialZipCodeLine = rightTrim(line.substring(476,490));
        String correspondenceAddressLineOne = rightTrim(line.substring(701,756));
        String correspondenceAddressLineTwo = rightTrim(line.substring(756,811));
        String correspondenceCityLine = rightTrim(line.substring(811,841));
        String correspondenceStateLine = rightTrim(line.substring(841,843));
        String correspondenceZipCodeLine = rightTrim(line.substring(843,858));

        String residentialAddress = "";
        String correspondenceAddress = "";

        if(residentialAddressLineTwo.equalsIgnoreCase("")) {
            residentialAddress += tabLine + residentialAddressLineOne + newLine + tabLine + residentialCityLine + ", " + residentialStateLine + " " + residentialZipCodeLine;
        }
        else {
            residentialAddress += tabLine + residentialAddressLineOne + newLine + tabLine + residentialAddressLineTwo + newLine + residentialCityLine + ", " + residentialStateLine + " " + residentialZipCodeLine;
        }

        if(correspondenceAddressLineOne.equals("")) {
            correspondenceAddress = residentialAddress;
        }
        else {
            if (correspondenceAddressLineTwo.equalsIgnoreCase("")) {
                correspondenceAddress += tabLine + correspondenceAddressLineOne + newLine + tabLine + correspondenceCityLine + ", " + correspondenceStateLine + " " + correspondenceZipCodeLine;
            } else {
                correspondenceAddress += tabLine + correspondenceAddressLineOne + newLine + tabLine + correspondenceAddressLineTwo + newLine + correspondenceCityLine + ", " + correspondenceStateLine + " " + correspondenceZipCodeLine;
            }
        }

        addressInformation = "Residential Address:" + newLine + residentialAddress + newLine + "Correspondence Address:" + newLine + correspondenceAddress;

        return addressInformation;
    }

    public static void main(String args[]) throws FileNotFoundException {
        String file = "UCARE_DHS_TRANSEND_20201102.txt";
        String filename = "C:\\Users\\dvang\\Desktop\\";
        filename = filename + file;

        File dhsFile = new File(filename);
        Scanner s = new Scanner(dhsFile);
        ArrayList<Person> members = new ArrayList<>();

        while(s.hasNextLine()) {
            String line = s.nextLine();

            members.add(new Person(line));

        }

        for(Person member : members) {
            System.out.println(member.getFirstName());
            System.out.println(member.getLastName());
        }


    }

}
