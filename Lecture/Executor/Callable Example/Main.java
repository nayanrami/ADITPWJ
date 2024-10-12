import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableExample implements Callable<String>{

    private String msg;

    public CallableExample(String msg){
        this.msg = msg;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+msg;
    }
    
}

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<String> future =  service.submit(new CallableExample("Nayan"));
        System.out.println(future.get());
        service.shutdown();
    }
}
