package com.p3soft.fileupload.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {
    // storage location
    private String loc = "upload-dir";

    public String getLocation() {
        return loc;
    };

    public void setLocation(String loc) {
        this.loc = loc;
    }
    
}
