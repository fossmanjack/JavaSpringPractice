package com.p3soft.fileupload.storage;

public class StorageException extends RuntimeException {
    public StorageException(String msg) {
        super(msg);
    }

    public StorageException(String msg, Throwable cause) {
        super(msg, cause);
    }
    
}
