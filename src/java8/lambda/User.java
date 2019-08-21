package java8.lambda;

public class User {

    public static String name;

    public static String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }
}
