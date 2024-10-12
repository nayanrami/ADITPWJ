import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{
    private String msg;
    public CallableTask(String msg){
        this.msg = msg;
    }
    public String call(){
        return "Hello "+ msg;
    }
}


public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        List<CallableTask> tasklist = List.of(new CallableTask("Nayan"),
        new CallableTask("Vikali"), new CallableTask("Het"));

        ExecutorService service = Executors.newFixedThreadPool(1);
        List<Future<String>> results =  service.invokeAll(tasklist);
        for (Future<String> future : results) {
            System.out.println(future.get());
        }
        service.shutdown();

    }    
}
