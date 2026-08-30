package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final java.lang.ThreadLocal<java.lang.Long> nextSampleTimestampUs = new java.lang.ThreadLocal<>();
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j, long j2) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        androidx.media3.common.util.Assertions.checkState(this.firstSampleTimestampUs == MODE_SHARED);
        if (isInitialized()) {
            return;
        }
        if (z) {
            this.nextSampleTimestampUs.set(java.lang.Long.valueOf(j));
        } else {
            long jElapsedRealtime = 0;
            long j3 = j2;
            while (!isInitialized()) {
                if (j2 == 0) {
                    wait();
                } else {
                    androidx.media3.common.util.Assertions.checkState(j3 > 0);
                    long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                    wait(j3);
                    jElapsedRealtime += android.os.SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    if (jElapsedRealtime >= j2 && !isInitialized()) {
                        throw new java.util.concurrent.TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                    }
                    j3 = j2 - jElapsedRealtime;
                }
            }
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.firstSampleTimestampUs;
        if (j == Long.MAX_VALUE || j == MODE_SHARED) {
            j = androidx.media3.common.C.TIME_UNSET;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long firstSampleTimestampUs;
        long j = this.lastUnadjustedTimestampUs;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            firstSampleTimestampUs = j + this.timestampOffsetUs;
        } else {
            firstSampleTimestampUs = getFirstSampleTimestampUs();
        }
        return firstSampleTimestampUs;
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = androidx.media3.common.C.TIME_UNSET;
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j2 = this.lastUnadjustedTimestampUs;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            long jUsToNonWrappedPts = usToNonWrappedPts(j2);
            long j3 = (4294967296L + jUsToNonWrappedPts) / MAX_PTS_PLUS_ONE;
            long j4 = ((j3 - 1) * MAX_PTS_PLUS_ONE) + j;
            j += j3 * MAX_PTS_PLUS_ONE;
            if (java.lang.Math.abs(j4 - jUsToNonWrappedPts) < java.lang.Math.abs(j - jUsToNonWrappedPts)) {
                j = j4;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j2 = this.lastUnadjustedTimestampUs;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            long jUsToNonWrappedPts = usToNonWrappedPts(j2);
            long j3 = jUsToNonWrappedPts / MAX_PTS_PLUS_ONE;
            long j4 = (j3 * MAX_PTS_PLUS_ONE) + j;
            j += (j3 + 1) * MAX_PTS_PLUS_ONE;
            if (j4 >= jUsToNonWrappedPts) {
                j = j4;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (!isInitialized()) {
            long jLongValue = this.firstSampleTimestampUs;
            if (jLongValue == MODE_SHARED) {
                jLongValue = ((java.lang.Long) androidx.media3.common.util.Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
            }
            this.timestampOffsetUs = jLongValue - j;
            notifyAll();
        }
        this.lastUnadjustedTimestampUs = j;
        return j + this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != androidx.media3.common.C.TIME_UNSET;
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % MAX_PTS_PLUS_ONE;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }
}
