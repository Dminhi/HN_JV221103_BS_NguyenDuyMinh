package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean isValidInput(String input) {
        // Kiểm tra xem giá trị không phải là null và không phải là chuỗi rỗng
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isValidString(String input) {
        // Mẫu biểu thức chính quy: B(\d{3})
        // Bắt đầu bằng B, sau đó là 3 chữ số
        String regex = "P\\d{3}";

        // Tạo Pattern
        Pattern pattern = Pattern.compile(regex);

        // Tạo Matcher
        Matcher matcher = pattern.matcher(input);

        // Kiểm tra xem chuỗi có khớp với biểu thức chính quy hay không
        return matcher.matches();
    }

    public static boolean isValidInterger(double input) {
        // Kiểm tra xem giá trị lớn hơn 0 hay không
        return input > 0;
    }
}
