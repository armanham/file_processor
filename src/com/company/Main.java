package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        File folder = new File("src/com/company/files");
        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            return;
        }
        for (File file : files){
            TxtFileProcessorThread txtFileProcessorThread = new TxtFileProcessorThread(file.getAbsolutePath());
            txtFileProcessorThread.start();
        }
        System.out.println((System.currentTimeMillis() - start) / 1000.0);



//        long start = System.currentTimeMillis();
//        File folder = new File("src/com/company/files");
//        File[] files = folder.listFiles();
//        if (files == null || files.length == 0) {
//            return;
//        }
//        for (File file : files) {
//            FileProcessor fileProcessor = new TxtFileProcessor(file.getAbsolutePath());
//            fileProcessor.process();
//        }
//        System.out.println((System.currentTimeMillis() - start) / 1000.0);
    }

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Run");
//            }
//        };
//        runnable.run();
//
//        Callable<String> callable = new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return null;
//            }
//        };
//        try {
//            System.out.println(callable.call());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

}

