package java_12_02_24;


public class ValidationUtils {
//    public boolean isEmailValid(String email) {
//        String emailRegex = "^[A-Za-z0-9+_.-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$";
//        boolean b = checker(emailRegex);
//        return b;
//    }
    
    public boolean isPhoneNumberValid(String phoneNumber) {
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        // Проверка на допустимую длину номера (например, 10 цифр)
        if (digitsOnly.length() != 10) {
            return false;
        }

        // Проверка кода страны (например, должен начинаться с +1.txt для США)
        if (!digitsOnly.startsWith("+1.txt")) {
            return false;
        }

        return true;
    }
    
    public boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }

        // Пароль должен содержать хотя бы одну заглавную букву (A-Z)
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Пароль должен содержать хотя бы одну строчную букву (a-z)
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Пароль должен содержать хотя бы одну цифру (0-9)
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Пароль должен содержать хотя бы один специальный символ (например, !, @, #, $, %)
        if (!password.matches(".*[!@#$%].*")) {
            return false;
        }

        // Пароль не должен содержать пробелов
        if (password.contains(" ")) {
            return false;
        }

        // Все правила выполнены
        return true;
    }
}


//Тут тоже помог GPT)))
class ValidationUtils1 {
    public boolean isPhoneNumberValid(String phoneNumber) {
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");
        return isLengthValid(digitsOnly, 10) && digitsOnly.startsWith("+1");
    }

    public boolean isPasswordValid(String password) {
        return isLengthValid(password, 8) &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@#$%].*") &&
                !password.contains(" ");
    }

    private boolean isLengthValid(String str, int length) {
        return str.length() == length;
    }

}
