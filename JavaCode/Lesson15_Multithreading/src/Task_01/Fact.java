package Task_01;

public class Fact {

    public static interface IFinish {
        void done(long result);
    }

    public static class Finish implements IFinish {
        @Override
        public void done(long result) {
            System.out.println(result);
        }
    }

    public static class Task extends Thread {
        IFinish finish;
        int n;

        public Task(int n, IFinish finish) {
            this.n = n;
            this.finish = finish;
        }

        private long fact(int x) {
            return (x == 0) ? 1 : x * fact(x - 1);
        }

        public void run() {
            long res = fact(n);
            if (finish != null) finish.done(res);
        }
    }


}