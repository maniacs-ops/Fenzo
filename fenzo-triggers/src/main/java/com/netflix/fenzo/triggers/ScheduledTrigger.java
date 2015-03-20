package com.netflix.fenzo.triggers;

import org.quartz.ScheduleBuilder;
import rx.functions.Action1;

/**
 * Placeholder super class for all the triggers that can be scheduled.
 *
 */
public abstract class ScheduledTrigger<T> extends Trigger<T> {

    protected ScheduledTrigger(String name, T data, Action1<T> action) {
        super(name, data, action);
    }

    public abstract ScheduleBuilder getScheduleBuilder();

    public abstract void setQuartzTrigger(org.quartz.Trigger quartzTrigger);
}
