package day09_practice_tasks;



import java.util.Arrays;

public class CommonElement_ArrayShrink_doubt {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
        int[]  resultArr=getCommonElements(arr1,arr2);
        System.out.println("The value is common \t"+ Arrays.toString(resultArr));
    }
    public static int[] getCommonElements(int[] arr1,int[] arr2){
        int[] commonEleArr=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0,k=0;j<arr2.length;j++,k++){
                if(arr1[i]==arr2[j]){
                    commonEleArr[k]= arr1[i];
                }
            }
        }
        return commonEleArr;
    }
}
