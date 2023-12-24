/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pets.and.vet;

/**
 *
 * @author abdelrhmankrm
 */
import java.util.regex.*;

public class Validator {

    private static final String EMAIL_REGEX = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,7}\\b";

    public static boolean emailCheck(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean phoneNumValidate(String s) {
        int c = 0;
        for (char i : s.toCharArray()) {
            if (i >= '0' && i <= '9') {
                c++;
            }
        }
        return c == 11;
    }

    public static String fix(String username) {
        StringBuilder result = new StringBuilder();
        int space = 0;
        for (char i : username.toCharArray()) {
            if (i == ' ') {
                if (space < 1) {
                    space++;
                    result.append(i);
                }
            } else {
                space = 0;
                result.append(i);
            }
        }
        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        return result.toString();
    }

    public static boolean nameValidate(String username) {
        int c = 0;
        for (char i : username.toCharArray()) {
            if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z') || i == ' ') {
                c++;
            }
        }
        return c == username.length();
    }

    public static void main(String[] args) {
        String email = "example@email.com";
        String phone = "12345678901";
        String username = "john doe";
        
        System.out.println("Email Check: " + emailCheck(email));
        System.out.println("Phone Number Validation: " + phoneNumValidate(phone));
        System.out.println("Fixed Username: " + fix(username));
        System.out.println("Username Validation: " + nameValidate(username));
    }
}