package com.neftxx.evaluator;

import java.io.File;

public class Source {
    private File sourceFile;

    public Source(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getName() {
        return sourceFile.getName();
    }

    public String getPath() {
        return sourceFile.getPath();
    }

    public File getFile(){
        return sourceFile;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Source){
            Source source = (Source) obj;
            return source.getPath().equals(getPath());
        }
        return false;
    }
}
