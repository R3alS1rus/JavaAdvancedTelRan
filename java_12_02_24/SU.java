package java_12_02_24;

public class SU {

    public static String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static String formatAddress(String street, String city, String zipCode) {
        return street + ", " + city + ", " + zipCode;
    }


    public static String formatString(String... parts) {
        StringBuilder builder = new StringBuilder();
        for (String part : parts) {
            builder.append(part).append(", ");
        }
        return builder.toString().trim();
    }
}

class PersonalData {
    public static String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    public static String formatAddress(String street, String city, String zipCode) {
        return formatString(street, city, zipCode);
    }


    public static String formatString(String... parts) {
        StringBuilder builder = new StringBuilder();
        for (String part : parts) {
            builder.append(part).append(", ");
        }
        return builder.toString().trim();
    }
}
