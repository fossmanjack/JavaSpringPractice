package com.p3soft.fileupload.storage;

public class StorageFileNotFoundException extends StorageException {
    public StorageFileNotFoundException(String msg) {
        super(msg);
    }

    public StorageFileNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
    
}
