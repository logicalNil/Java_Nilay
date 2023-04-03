package HW;

import java.util.Arrays;

public class BoatsSavePeople_881 {
    public int numRescueBoats(int[] people, int limit) {

    Arrays.sort(people);

        int boatCount = 0;
        int left = 0;
        int right = people.length - 1;

        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
                right--;
            }
            else{
                right--;
            }
            boatCount++;
        }
        return boatCount;
    }

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        BoatsSavePeople_881 bsp = new BoatsSavePeople_881();
        System.out.println(bsp.numRescueBoats(people, limit));
    }
}
