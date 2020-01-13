package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int low = array1[0];
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length; j++){

                int diff = Math.abs(array1[i]-array2[j]);
                if(diff<low)
                { low = diff;
                }
            }
        }
        System.out.println(low);
    }





}
