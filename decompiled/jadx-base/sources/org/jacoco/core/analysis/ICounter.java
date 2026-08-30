package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public interface ICounter {
    public static final int EMPTY = 0;
    public static final int FULLY_COVERED = 2;
    public static final int NOT_COVERED = 1;
    public static final int PARTLY_COVERED = 3;

    public enum CounterValue {
        TOTALCOUNT,
        MISSEDCOUNT,
        COVEREDCOUNT,
        MISSEDRATIO,
        COVEREDRATIO
    }

    int getCoveredCount();

    double getCoveredRatio();

    int getMissedCount();

    double getMissedRatio();

    int getStatus();

    int getTotalCount();

    double getValue(org.jacoco.core.analysis.ICounter.CounterValue counterValue);
}
