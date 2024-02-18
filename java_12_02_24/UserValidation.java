package java_12_02_24;


public class UserValidation {
    public boolean validateUsername(String username) {
        // Проверка на длину имени
        if (username.length() < 6 || username.length() > 20) {
            return false;
        }
        
        // Проверка на наличие специальных символов
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }
        
        return true;
    }
    
    public boolean validateEmail(String email) {
        // Проверка на длину email
        if (email.length() < 6 || email.length() > 50) {
            return false;
        }
        
        // Проверка на наличие символа '@'
        if (!email.contains("@")) {
            return false;
        }
        
        return true;
    }
}


//Тут однозначно помог GPT
class UserValidation1 {
    public boolean validateUsername(String username) {
        // Проверка длины и наличия специальных символов
        return validateLength(username, 6, 20) && username.matches("^[a-zA-Z0-9]+$");
    }

    public boolean validateEmail(String email) {
        // Проверка длины и наличия символа '@'
        return validateLength(email, 6, 50) && email.contains("@");
    }

    // Приватный метод для проверки длины строки
    private boolean validateLength(String str, int minLength, int maxLength) {
        return str.length() >= minLength && str.length() <= maxLength;
    }
}

