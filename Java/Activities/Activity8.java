package activities;
class CustomException extends Exception {
    private String message1 = null;

    public CustomException(String message) {
        this.message1 = message;
    }

    @Override
    public String getMessage() {
        return message1;
    }

}
public class Activity8 {
    public static void main(String[] args) {
        try {
            // Method call with correct input
            Activity8.exceptionTest("This Will print to console");
            Activity8.exceptionTest("Will execute before exception");
            // Method call with incorrect input
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute after exception");

        } catch(CustomException mes) {
            System.out.println("Inside catch block: " + mes.getMessage());
        }
    }

    private static void exceptionTest(String err) throws CustomException{
        if(err == null) {
            throw new CustomException("Error- String value is null");
        } else {
            System.out.println(err);
        }
    }

}

