package HW;

public class OwnException {
    public static class Newexception extends Exception {
        public Newexception(String s)
        {
            super(s);
        }
        public static void check(int[] time, int value, long mid) throws Newexception {
            if (value != 0) {
                System.out.println("Go Ahead");}
            else
                throw new Newexception("You can't go ahead");
        }
    }
    public static void main(String[] args) {
        try {
            int[] time = new int[0];
            long mid = 0;
            Newexception.check(time, 20/0, mid);
        } catch (Newexception e) {
            System.out.println(e + " Arithmetic Exception");
        }
    }
}
