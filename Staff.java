package lambda;

public class Staff {
    private String firstName;
    private String secondName;
    private int yearOfBirth;
    private Position position;

    public Staff(String firstName, String secondName, int yearOfBirth, Position position) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Position getPosition() {
        return position;
    }
}
