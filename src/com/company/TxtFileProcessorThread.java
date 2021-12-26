package com.company;

public class TxtFileProcessorThread extends Thread{
    public TxtFileProcessorThread(Runnable target) {
        super(target);
    }

    public TxtFileProcessorThread(String name) {
        super(name);
    }
}
