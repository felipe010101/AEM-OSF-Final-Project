package com.project.osf.core.models.classes;

import com.project.osf.core.models.Impl.HeaderImpl;

public class Links {
    private String title;
    private String link;

    public Links() {}

    public Links(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }
    

}