package com.zsg.huawei._2_21;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _39_∂‡œﬂ≥Ã {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        ExecutorService threadPoolhreadPol = Executors.newSingleThreadExecutor();
		        while (scanner.hasNext()) {
		            int n = scanner.nextInt();
		            for (int i = 0; i < n; i++) {
		                threadPoolhreadPol.execute(new Task("A"));
		                threadPoolhreadPol.execute(new Task("B"));
		                threadPoolhreadPol.execute(new Task("C"));
		                threadPoolhreadPol.execute(new Task("D"));
		            }
		             try {
		                Thread.sleep(100);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		            System.out.println();
		        }
		        threadPoolhreadPol.shutdown();
		        scanner.close();
		    }
}

class Task implements Runnable{
    public String output;
    public Task(String output){
        this.output = output;
    }
    @Override 
    public void run() {
        // System.out.println("give me offer.");
        System.out.print(output);
    }
}
