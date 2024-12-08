public class PasswordValidator {

    public static String validatePassword(String password) {
        StringBuilder message = new StringBuilder();

        // Проверка длины пароля
        if (password.length() < 8 || password.length() > 20) {
            message.append("Пароль должен быть длиной от 8 до 20 символов. ");
        }

        // Проверка наличия заглавной буквы
        if (!password.matches(".*[A-Z].*")) {
            message.append("Пароль должен содержать хотя бы одну заглавную букву. ");
        }

        // Проверка наличия строчной буквы
        if (!password.matches(".*[a-z].*")) {
            message.append("Пароль должен содержать хотя бы одну строчную букву. ");
        }

        // Проверка наличия цифры
        if (!password.matches(".*\\d.*")) {
            message.append("Пароль должен содержать хотя бы одну цифру. ");
        }

        // Проверка наличия пробелов
        if (password.contains(" ")) {
            message.append("Пароль не должен содержать пробелов. ");
        }

        // Если сообщение пустое, пароль соответствует всем правилам
        if (message.length() == 0) {
            return "Пароль " + password + " соответствует всем правилам.";
        } else {
            return "Пароль " + password + " – " + message.toString().trim();
        }
    }
}