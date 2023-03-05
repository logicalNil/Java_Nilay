package HW;

public class Maximum69Number_1323 {
    public int maximum69Number (int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }

    public static void main(String[] args) {
        Maximum69Number_1323 s = new Maximum69Number_1323();
        System.out.println(s.maximum69Number(9669));
    }
}
