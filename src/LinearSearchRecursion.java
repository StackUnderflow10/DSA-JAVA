import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr ={5,6,1,3,88,73,61};
       findAllIndex(arr, 6, 0);
        System.out.println(list);
    }
    static int findIndex(int[] arr,int target, int index){
        if (arr.length -1 == index){
            return -1;
        }
        if(arr[index] == target ){
            return index;
        }
        else {
            return (findIndex(arr, target, index + 1));
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr,int target, int index){
        if (arr.length -1 == index){
            return ;
        }
        if(arr[index] == target ){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
