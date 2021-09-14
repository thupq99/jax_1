package exception;

public class StudentNotFound extends Exception {

    public StudentNotFound() {
        super("The specified employee does not exist");
    }

    public StudentNotFound(String str) {
        super(str);
    }

}
