package com.hneu.model.scedule;

/**
 * @author malex
 */
public class MetaData {

    private long id;

    private String name;

    private String shortName;

    private String description;

    private String type;

    private String year;

    private String yearDisplayName;

    private String startDate;

    private String endDate;


    public MetaData() {
    }

    public MetaData(long id, String name, String shortName, String description, String type, String year, String yearDisplayName, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.type = type;
        this.year = year;
        this.yearDisplayName = yearDisplayName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYearDisplayName() {
        return yearDisplayName;
    }

    public void setYearDisplayName(String yearDisplayName) {
        this.yearDisplayName = yearDisplayName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
