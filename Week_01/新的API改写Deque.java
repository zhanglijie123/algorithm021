import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zhanglijie@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2020/12/8 0008 18:32
 */
public class DequeMy {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addLast("c");
        System.out.println(deque.getFirst());//b
        System.out.println(deque.getLast());//c
        while (deque.size() > 0) {
            System.out.println(deque.pop());//b a c
        }

    }

}
