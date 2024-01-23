import java.util.regex.Pattern;

public class YourModel {
    private String name;
    private int age;

    // Constructor
    public YourModel(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Setters with validation
    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public void setAge(int age) {
        if (isValidAge(age)) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    // Validation methods
    private boolean isValidName(String name) {
        // name validation logic
        return name != null && !name.isEmpty();
    }

    private boolean isValidAge(int age) {
        // validation logic 
        return age >= 0 && age <= 120;  
    }

    
}
