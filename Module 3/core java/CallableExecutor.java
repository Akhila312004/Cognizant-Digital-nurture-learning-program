import java.util.concurrent.*;

public class CallableExecutor{
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Callable<String> task = () -> "Task completed!";
        Future<String> future = ex.submit(task);
        System.out.println(future.get());
        ex.shutdown();
    }
}
