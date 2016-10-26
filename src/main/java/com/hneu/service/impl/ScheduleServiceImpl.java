package com.hneu.service.impl;

import com.hneu.model.scedule.MetaData;
import com.hneu.model.scedule.Schedule;
import com.hneu.model.scedule.ScheduleElement;
import com.hneu.model.scedule.Week;
import com.hneu.service.ScheduleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Override
    public Schedule getSchedule() {

        Schedule schedule = new Schedule();

        // Week
        List<Week> weeks = new ArrayList<>();
        weeks.add(new Week("Понедельник", "24 октября 2016", 1, new Date()));
        weeks.add(new Week("Вторник", "25 октября 2016", 1, new Date()));
        weeks.add(new Week("Среда", "26 октября 2016", 1, new Date()));

        //
        List<ScheduleElement> scheduleElements = new ArrayList<>();

        ScheduleElement scheduleElement_01 = new ScheduleElement();
        scheduleElement_01.setDay(1);
        scheduleElement_01.setPair(1);
        scheduleElement_01.setDate(new Date());

        scheduleElement_01.setStartEpoch(1477466100L);
        scheduleElement_01.setBreakStartEpoch(23523523L);
        scheduleElement_01.setBreakEndEpoch(1412L);
        scheduleElement_01.setEndEpoch(1477469100L);

        scheduleElement_01.setStart("10:15");
        scheduleElement_01.setBreakStart("11:00");
        scheduleElement_01.setBreakEnd("11:05");
        scheduleElement_01.setEnd("11:50");

        //<schedule-element day="3"
        // date="26-10-2016"
        // start-epoch="1477466100"
        // start="10:15"
        // pair="2"
        // end-epoch="1477471800"
        // end="11:50"
        // break-start-epoch="1477468800"
        // break-start="11:00"
        // break-end-epoch="1477469100"
        // break-end="11:05">
        ScheduleElement scheduleElement_02 = new ScheduleElement();
        scheduleElement_02.setDay(2);
        scheduleElement_02.setPair(2);
        scheduleElement_02.setDate(new Date());

        scheduleElement_02.setStartEpoch(1477466100L);
        scheduleElement_02.setBreakStartEpoch(23523523L);
        scheduleElement_02.setBreakEndEpoch(1412L);
        scheduleElement_02.setEndEpoch(1477469100L);

        scheduleElement_02.setStart("10:15");
        scheduleElement_02.setBreakStart("11:00");
        scheduleElement_02.setBreakEnd("11:05");
        scheduleElement_02.setEnd("11:50");


        scheduleElements.add(scheduleElement_01);
        scheduleElements.add(scheduleElement_02);


        // MetaData
        MetaData metaData = new MetaData();
//        year-display-name="2016/2017"
        metaData.setYearDisplayName("2016/2017");
//        year="2016"
        metaData.setYear("2016");
//        type="teacher"
        metaData.setType("teacher");
//        start-date="24-10-2016"
        metaData.setStartDate("24-10-2016");
//        short-name="Канова О.А."
        metaData.setShortName("Канова О.А.");
//        name="Канова Олександра Андріївна"
        metaData.setName("Канова Олександра Андріївна");
//        id="364545"
        metaData.setId(364545);
//        end-date="30-10-2016"
        metaData.setEndDate("30-10-2016");
//        description="каф. менеджменту та бізнесу"/>
        metaData.setDescription("каф. менеджменту та бізнесу");

        schedule.setWeekNumber(9);
        schedule.setMetaData(metaData);
        schedule.setWeeks(weeks);
        schedule.setScheduleElements(scheduleElements);

        return schedule;
    }

}
