package java_12_02_24;
//
//import java.util.List;
//
//public class DA {
//    // Нарушение DRY: Дублирование кода
//    public void processData(List<Integer> data) {
//        int sum = 0;
//        for (int num : data) {
//            sum += num;
//        }
//        System.out.println("Sum: " + sum);
//
//        double average = (double) sum / data.size();
//        System.out.println("Average: " + average);
//    }
//
//    public void processUserData(List<User> users) {
//        int totalAge = 0;
//        for (User user : users) {
//            //totalAge += user.getAge();
//        }
//        System.out.println("Total Age: " + totalAge);
//
//        double averageAge = (double) totalAge / users.size();
//        System.out.println("Average Age: " + averageAge);
//    }
//}
//



//Solved
//class DataProcessor {
//
//    public void processData(List<Integer> data) {
//        int sum = calculateSum(data);
//        System.out.println("Sum: " + sum);
//
//        double average = (double) sum / data.size();
//        System.out.println("Average: " + average);
//    }
//
//    public void processUserData(List<User> users) {
//        List<Integer> ages = new ArrayList<>();
//        for (User user : users) {
//            ages.add(user.getAge());
//        }
//        int totalAge = calculateSum(ages);
//        System.out.println("Total Age: " + totalAge);
//
//        double averageAge = (double) totalAge / users.size();
//        System.out.println("Average Age: " + averageAge);
//    }

//private int calculateSum(List<Integer> data) {
//        int sum = 0;
//        for (int num : data) {
//        sum += num;
//        }
//        return sum;
//        }
//}
//