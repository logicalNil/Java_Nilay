package HW;

public class ValidateStackSequences_946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0, j = 0;
        for (int num : pushed) {
            pushed[i++] = num;
            while (i > 0 && pushed[i - 1] == popped[j]) {
                i--;
                j++;
            }
        }
        return i == 0;
    }

    public static void main(String[] args) {
        ValidateStackSequences_946 vs = new ValidateStackSequences_946();
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        System.out.println(vs.validateStackSequences(pushed, popped));
    }
}
