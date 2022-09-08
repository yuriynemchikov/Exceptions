import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] myArray = {};
        int minLen = 2;
        int result = findTheNumber(myArray, minLen);
        switch (result){
            case -3: System.err.println("Массив пуст");
                break;
            case -1: System.err.println("Длина массива меньше чем " + minLen);
                break;
            case -2: System.err.println("Искомый элемент не найден");
                break;
            default: System.out.println(result);
        }
    }

    public static int findTheNumber(int[] array, int minLen) {
        int numb = getData();
        if (array.equals(null) || array.length == 0) {
            return -3;
        } else if (array.length < minLen) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == numb) {
                    return i;
                }
            }
        }
        return -2;
    }

    public static int getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое хотите найти: ");
        int findNumber = scanner.nextInt();
        return findNumber;
    }
}
