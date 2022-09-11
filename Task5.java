import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        Integer[] ints = {1,2, null,3,4,null};
        checkArray(ints);
    }

    public static void checkArray(Integer[] arr){

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == null){
                list.add(i);
            }
        }
        if (list.size()>0){
            throw new RuntimeException("Индексы массива, где значение равно null: " + printList(list));
        }
    }

    public static List<Integer> printList(List<Integer> list){

        for(int i = 0; i<list.size(); i++){
            list.get(i);
        }
        return list;
    }
}
