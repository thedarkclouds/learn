import java.util.concurrent.*;

public class FutureTaskExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> call = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 10;
            }
        };
        ExecutorService exe = Executors.newCachedThreadPool();
        Future<Integer> future = exe.submit(call);
        Integer t = future.get();
        System.out.println(t);
    }


}
