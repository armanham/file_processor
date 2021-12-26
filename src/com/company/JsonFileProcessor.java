package com.company;

import java.io.File;

public class JsonFileProcessor implements FileProcessor{

    private final File file;

    public JsonFileProcessor(File file) {
        this.file = file;
    }

    @Override
    public void process() {

    }
}
