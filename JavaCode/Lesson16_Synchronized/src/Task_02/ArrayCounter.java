package Task_02;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;


public class ArrayCounter {

    public static int getSum(int[] array, int numberOfThreads) {

        AtomicInteger result = new AtomicInteger(0);
        CountDownLatch count = new CountDownLatch(numberOfThreads);

        final int arrayLength = array.length;
        int remainder = arrayLength % numberOfThreads;
        int lengthBlock;
        for(int i = 0, startIndex = 0; i < numberOfThreads; i++) {

            lengthBlock = arrayLength / numberOfThreads;

            if(remainder > 0) {
                lengthBlock++;
                remainder--;
            }

            sumPartOfArray(array, startIndex, lengthBlock, result, count);

            startIndex += lengthBlock;
        }

        try {
            count.await();
        } catch (InterruptedException e) {
             e.printStackTrace();
        }

        return result.get();
    }

    private static void sumPartOfArray(final int array[], final int startIndex, final int length,
                                       final AtomicInteger result, final CountDownLatch count) {
        new Thread() {
            @Override
            public void run() {
                int tempResult = 0;
                int upperBound = startIndex + length;

                for(int i = startIndex; i < upperBound; i++) {
                    tempResult += array[i];
                }

                result.addAndGet(tempResult);
                count.countDown();
            }
        }.start();
    }

}

