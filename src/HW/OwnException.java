package HW;

public class OwnException {
    public static class Newexception extends Exception {
        public Newexception(String s)
        {
            super(s);
        }
        public static void check(int value) throws Newexception {
            if (value != 0) {
                System.out.println("Go Ahead");}
            else
                throw new Newexception("You can't go ahead");
        }
    }
    public static void main(String[] args) {
        try {
            Newexception.check(20/0);
        } catch (Newexception e) {
            System.out.println(e + " Arithmetic Exception");
        }
    }
}
