package exception;

import javax.xml.ws.WebFault;

@WebFault
public class StudentAlreadyExists extends Exception {

    public StudentAlreadyExists() {
        super("This student already exists");
    }

    public StudentAlreadyExists(String str) {
        super(str);
    }

}
