public class Task2 {
    public static void main(String[] args) {
        int[][] array2D = {{1, 0, 1}, {0, 1, 1}, {0, 2, 0}};
        System.out.println(sumOfArray(array2D));
    }

    public static int sumOfArray(int [][] array2D){

        int sumOfArray = 0;
        if (array2D.length != array2D[0].length){
            throw new RuntimeException("Кол-во строк не равно кол-ву столбцов");
        }
        for(int i=0; i<array2D.length; i++){
            for(int j=0; j<array2D[i].length; j++){
                if(array2D[i][j] != 0 && array2D[i][j] != 1){
                    throw new RuntimeException("Неверное число");
                }
                else{
                    sumOfArray += array2D[i][j];
                }
            }
        }
        return sumOfArray;
    }
}
