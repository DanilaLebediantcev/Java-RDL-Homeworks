import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        //Task 5
        List<String> arrayListForTask5 = new ArrayList<>();
        List<String> linkedListForTask5 = new LinkedList<>();


        //Сравниваем ArrayList и LinkedList
        //Операция добавления
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayListForTask5.add("Number:" + random.nextInt(10000));
        }
        long finishTime = System.currentTimeMillis();
        double timeOfExecute = (double) (finishTime - startTime);
        System.out.println("Execution time for arrayList to add 1kk element:" + timeOfExecute / 1000 + " sec");


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedListForTask5.add("Number:" + random.nextInt(10000));
        }
        finishTime = System.currentTimeMillis();
        timeOfExecute = (double) (finishTime - startTime);
        System.out.println("Execution time for linkedList to add 1kk element \"Number:500\":" + timeOfExecute / 1000 + " sec");

        //Операция удаления
        //Удаляем элемент, если он равен 500 (тк изначально записываются значения от 0 до 1000)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayListForTask5.size(); i++) {
            if (arrayListForTask5.get(i).equals("Number:500")) {
                arrayListForTask5.remove(i);
            }
        }
        finishTime = System.currentTimeMillis();
        timeOfExecute = (double) (finishTime - startTime);
        System.out.println("Execution time for arrayList to delete element \"Number:500\":" + timeOfExecute / 1000 + " sec");


        startTime = System.currentTimeMillis();
        for (int i = 0; i < linkedListForTask5.size(); i++) {
            if (linkedListForTask5.get(i).equals("Number:500")) {
                linkedListForTask5.remove(i);
            }
        }
        finishTime = System.currentTimeMillis();
        timeOfExecute = (double) (finishTime - startTime);
        System.out.println("Execution time for linkedList to delete elements equals \"Number:500\":" + timeOfExecute/1000 + " sec\"");

//        Result:
//        Execution time for arrayList to add 10kk element:0.021 sec
//        Execution time for linkedList to add 1kk element "Number:500":0.023 sec
//        Execution time for arrayList to delete elements equals "Number:500:0.005 sec
//        Execution time for linkedList to delete elements equals "Number:500" :10.437 sec"

    }
}
