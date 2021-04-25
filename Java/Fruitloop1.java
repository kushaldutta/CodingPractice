public class Fruitloop1 {
    public static void main(String[] args) {
        String[] fruits= {"apple","orange","banana","mango","grape","peach"};
        for (String i : fruits) { 
            System.out.println(i);
        }
        for (int n = 0; n < fruits.length; n++) {
            System.out.println(fruits[n]);
        }
    }
}