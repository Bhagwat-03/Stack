package Stack;
public class Main {

    public static void main(String[] args) {
        Stacks newStacks = new Stacks(23);
        boolean result = newStacks.isEmpty();
        boolean result1 = newStacks.isFull();
        System.out.println(result);
        System.out.println(result1);
    }
}