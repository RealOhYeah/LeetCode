import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // 将新请求的时间加入队列
        queue.offer(t);
        // 移除所有超出 [t-3000, t] 范围的请求
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        // 返回队列中剩余请求的数量
        return queue.size();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));     
        System.out.println(recentCounter.ping(100));   
        System.out.println(recentCounter.ping(3001));  
        System.out.println(recentCounter.ping(3002));  
    }
}
