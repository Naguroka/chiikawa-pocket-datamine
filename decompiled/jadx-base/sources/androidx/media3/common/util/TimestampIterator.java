package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public interface TimestampIterator {
    androidx.media3.common.util.TimestampIterator copyOf();

    default long getLastTimestampUs() {
        return androidx.media3.common.C.TIME_UNSET;
    }

    boolean hasNext();

    long next();
}
