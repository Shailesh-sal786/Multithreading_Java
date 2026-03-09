package workstealingPool;

import java.util.concurrent.RecursiveTask;

public class ComputeSumTask extends RecursiveTask<Integer> {

    int start;
    int end;


//Task is consume from front from stealing thread, but steal from, back.

    protected ComputeSumTask(int start , int end) {
        this.start = start;
        this.end  = end;
    }

    @Override
    protected Integer compute() {
        if(end - start <= 4){
            int totalSum = 0;
            for(int i= start; i<= end; i++){
                totalSum += i;
            }
            return totalSum;
        }
        else{
        int mid = (start + end)/2;
        ComputeSumTask leftTask = new ComputeSumTask(start , end);
        ComputeSumTask rightTask = new ComputeSumTask(mid + 1 , end);

        leftTask.fork();
        leftTask.fork();
        //Combine the result of subtasks
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            //Combine the result
             return  leftResult +rightResult;

    }


}}
