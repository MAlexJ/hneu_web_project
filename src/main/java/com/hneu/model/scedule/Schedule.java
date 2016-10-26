package com.hneu.model.scedule;

import java.util.List;

/**
 * @author malex
 */
public class Schedule {

    private long weekNumber;

    private MetaData metaData;

    private List<Week> weeks;

    private List<ScheduleElement> scheduleElements;

    public Schedule() {
    }

    public long getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(long weekNumber) {
        this.weekNumber = weekNumber;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public List<Week> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<Week> weeks) {
        this.weeks = weeks;
    }

    public List<ScheduleElement> getScheduleElements() {
        return scheduleElements;
    }

    public void setScheduleElements(List<ScheduleElement> scheduleElements) {
        this.scheduleElements = scheduleElements;
    }
}
