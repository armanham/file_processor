package com.company;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;

public class TxtFileProcessor implements FileProcessor {

    private File file;

    public TxtFileProcessor(final String filePath) {
        this.file = new File(filePath);
    }


    @Override
    public void process() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("");
        } finally {
            close(fileReader);
            close(bufferedReader);
        }
    }

    public void validateFilePath(String filePath) {
        if (filePath == null || filePath.length() == 0) {
            throw new IllegalArgumentException();
        }
        if (!filePath.endsWith(".txt")) {
            throw new IllegalArgumentException("Invalid file type: ");
        }
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IllegalArgumentException();
        }
        this.file = file;
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {

            } finally {

            }
        }
    }
}
