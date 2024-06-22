package threading;

class MyThread extends Thread {
    Counter c;
   MyThread(Counter c)
   {
       this.c=c;
   }
    @Override
    public void run()
    {
        c.increment();
    }
}
