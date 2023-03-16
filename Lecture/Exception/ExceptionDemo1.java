class MyException extends Exception {
    String msg;

    public MyException() {
    }

    public MyException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}

class ExceptionDemo1 {
    public static void main(String args[]) throws MyException {
        String username = "adit";
        String password = "adit1";

        if (username.equals(password)) {
            System.out.println("Welcome " + username);
        } else {
            throw new MyException("Invalid Username / Password");
        }
    }
}