package org.example;

public class Job {
    private String title;
    private Identity identity;

    public Job(String title){
        this.title = title;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "org.example.Job{" +
                "title='" + title + '\'' +
                ", identity=" + identity +
                '}';
    }
}
