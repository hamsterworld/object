package ch10;

import java.util.Properties;
import java.util.Stack;

public class TestCode {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1st");
        stack.push("2nd");
        stack.push("3rd");

        stack.add(0,"4th");

        System.out.println(stack.pop());

        Properties properties = new Properties();
        properties.setProperty("hamster1","c++");
        properties.setProperty("hamster2","java");

        properties.put("Dennis Ritchie",67);

        System.out.println(properties.get("Dennis Ritchie"));
    }
}
