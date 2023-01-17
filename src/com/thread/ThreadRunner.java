package com.thread;

import java.util.concurrent.*;

public class ThreadRunner {
    public void runRunnableThread() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable runnable = new RunnablePrac(new MessageListener());
        new Thread(runnable).start();
        System.out.println(Thread.currentThread().getName());

        executorService.execute(runnable);
    }

    public void runCallableThread() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<Boolean> callable = new CallablePrac("dip");

        Future<Boolean> submit = executorService.submit(callable);
        System.out.println(Thread.currentThread().getName());

        try {
            System.out.println(submit.get().booleanValue());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("*****************");
        System.out.println("NumOfCPU:" + Runtime.getRuntime().availableProcessors());
        ThreadRunner threadRunner = new ThreadRunner();
        threadRunner.runCallableThread();
        threadRunner.runRunnableThread();
    }

}