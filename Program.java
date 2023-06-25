import java.util.ArrayList;
import java.util.Random;

 class Program {
    public static void maxim(ArrayList<Integer> list) {
        int max = list.get(0);
        for(int i = 1; i < list.size() - 1; i++) {
            if(list.get(i) > list.get(i + 1)) {
                max = list.get(i);
            }
        }
        System.out.printf("Max = %d \n", max);   
    }

    public static void minimum(ArrayList<Integer> list) {
        int min = list.get(0);
        for(int i = 1; i < list.size() - 1; i++) {
            if(list.get(i) < list.get(i + 1)) {
                min = list.get(i);
            }
        }
        System.out.printf("Min = %d \n", min);
    }

    public static void average(ArrayList<Integer> list) {
        int sum = 0;
        for(int i = 1; i < list.size(); i++) {
            sum += list.get(i);
        }
        double res = (double)sum / (double)list.size();
        System.out.printf("Average = %f \n", res);    
    }
    
    public static void deleteEven(ArrayList<Integer> list) {
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) % 2 > 0) {
                list.remove(i);
                i--;
            }          
        }
        System.out.println("Even was deleted " + list.toString() + "\n");    
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> randomList = new ArrayList<>(15);
        Random rand = new Random();
        for(int i = 0; i < 15; i++) {
            randomList.add(rand.nextInt(100));
        }
        maxim(randomList);
        minimum(randomList);
        average(randomList);
        deleteEven(randomList);
    }
}