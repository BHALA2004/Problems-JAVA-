import java.util.PriorityQueue;

public class StudyAboutPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> s = new PriorityQueue<>();
        s.add(2);
        s.add(4);
        s.add(3);
        s.add(10);
        System.out.println(s);
//        System.out.println(s.peek());
//        System.out.println(s.peek());
//        System.out.println(s.poll());
//        System.out.println(s);
//        s.remove();
//        System.out.println(s);
//       s.clear();
//        System.out.println(s);
//        System.out.println(s.poll());
//        System.out.println(s.remove(2));
//        System.out.println(s.peek());
//        System.out.println(s.contains(3));
        System.out.println(s.offer(5));
        System.out.println(s);
    }
}
