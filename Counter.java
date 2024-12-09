package InterviewPrograms;

public class Counter {
    public static int count = 0;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println("Count: " + Counter.count); // Output: Count: 2
    }
}
