package com.bean.leave;

public class LeavePO {
    //leave apply id.
    public int id;
    //leave apply title
    private String title;
    //default leave time is 0 days.
    private int duration = 0;
    //leave reason
    private String reason;

    public LeavePO() {}

    public LeavePO(String title, int duration, String reason) {
        this.title = title;
        this.duration = duration;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LeavePO{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", reason='" + reason + '\'' +
                '}';
    }
}
