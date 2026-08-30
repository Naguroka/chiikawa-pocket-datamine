package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public class SpeedProviderUtil {
    private SpeedProviderUtil() {
    }

    public static long getDurationAfterSpeedProviderApplied(androidx.media3.common.audio.SpeedProvider speedProvider, long j) {
        long j2 = 0;
        double dMin = 0.0d;
        while (j2 < j) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j2);
            if (nextSpeedChangeTimeUs == androidx.media3.common.C.TIME_UNSET) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            dMin += (java.lang.Math.min(nextSpeedChangeTimeUs, j) - j2) / ((double) speedProvider.getSpeed(j2));
            j2 = nextSpeedChangeTimeUs;
        }
        return java.lang.Math.round(dMin);
    }
}
