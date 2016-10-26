package com.hneu.model.scedule;

import java.util.Date;

/**
 * @author malex
 */
public class ScheduleElement {

    private int day;
    private Date date;
    private long startEpoch;
    private String start;
    private int pair;
    private long endEpoch;
    private String end;
    private long breakStartEpoch;
    private String breakStart;
    private long breakEndEpoch;
    private String breakEnd;


    public ScheduleElement() {
    }

    public ScheduleElement(int day, Date date, long startEpoch, String start, int pair, long endEpoch, String end, long breakStartEpoch, String breakStart, long breakEndEpoch, String breakEnd) {
        this.day = day;
        this.date = date;
        this.startEpoch = startEpoch;
        this.start = start;
        this.pair = pair;
        this.endEpoch = endEpoch;
        this.end = end;
        this.breakStartEpoch = breakStartEpoch;
        this.breakStart = breakStart;
        this.breakEndEpoch = breakEndEpoch;
        this.breakEnd = breakEnd;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getStartEpoch() {
        return startEpoch;
    }

    public void setStartEpoch(long startEpoch) {
        this.startEpoch = startEpoch;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getPair() {
        return pair;
    }

    public void setPair(int pair) {
        this.pair = pair;
    }

    public long getEndEpoch() {
        return endEpoch;
    }

    public void setEndEpoch(long endEpoch) {
        this.endEpoch = endEpoch;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public long getBreakStartEpoch() {
        return breakStartEpoch;
    }

    public void setBreakStartEpoch(long breakStartEpoch) {
        this.breakStartEpoch = breakStartEpoch;
    }

    public String getBreakStart() {
        return breakStart;
    }

    public void setBreakStart(String breakStart) {
        this.breakStart = breakStart;
    }

    public long getBreakEndEpoch() {
        return breakEndEpoch;
    }

    public void setBreakEndEpoch(long breakEndEpoch) {
        this.breakEndEpoch = breakEndEpoch;
    }

    public String getBreakEnd() {
        return breakEnd;
    }

    public void setBreakEnd(String breakEnd) {
        this.breakEnd = breakEnd;
    }
}
