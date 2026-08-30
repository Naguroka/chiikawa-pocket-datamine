package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class SeekParameters {
    public static final androidx.media3.exoplayer.SeekParameters CLOSEST_SYNC;
    public static final androidx.media3.exoplayer.SeekParameters DEFAULT;
    public static final androidx.media3.exoplayer.SeekParameters EXACT;
    public static final androidx.media3.exoplayer.SeekParameters NEXT_SYNC;
    public static final androidx.media3.exoplayer.SeekParameters PREVIOUS_SYNC;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    static {
        androidx.media3.exoplayer.SeekParameters seekParameters = new androidx.media3.exoplayer.SeekParameters(0L, 0L);
        EXACT = seekParameters;
        CLOSEST_SYNC = new androidx.media3.exoplayer.SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        PREVIOUS_SYNC = new androidx.media3.exoplayer.SeekParameters(Long.MAX_VALUE, 0L);
        NEXT_SYNC = new androidx.media3.exoplayer.SeekParameters(0L, Long.MAX_VALUE);
        DEFAULT = seekParameters;
    }

    public SeekParameters(long j, long j2) {
        androidx.media3.common.util.Assertions.checkArgument(j >= 0);
        androidx.media3.common.util.Assertions.checkArgument(j2 >= 0);
        this.toleranceBeforeUs = j;
        this.toleranceAfterUs = j2;
    }

    public long resolveSeekPositionUs(long j, long j2, long j3) {
        long j4 = this.toleranceBeforeUs;
        if (j4 == 0 && this.toleranceAfterUs == 0) {
            return j;
        }
        long jSubtractWithOverflowDefault = androidx.media3.common.util.Util.subtractWithOverflowDefault(j, j4, Long.MIN_VALUE);
        long jAddWithOverflowDefault = androidx.media3.common.util.Util.addWithOverflowDefault(j, this.toleranceAfterUs, Long.MAX_VALUE);
        boolean z = jSubtractWithOverflowDefault <= j2 && j2 <= jAddWithOverflowDefault;
        boolean z2 = jSubtractWithOverflowDefault <= j3 && j3 <= jAddWithOverflowDefault;
        if (z && z2) {
            return java.lang.Math.abs(j2 - j) <= java.lang.Math.abs(j3 - j) ? j2 : j3;
        }
        if (z) {
            return j2;
        }
        return z2 ? j3 : jSubtractWithOverflowDefault;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.exoplayer.SeekParameters seekParameters = (androidx.media3.exoplayer.SeekParameters) obj;
        return this.toleranceBeforeUs == seekParameters.toleranceBeforeUs && this.toleranceAfterUs == seekParameters.toleranceAfterUs;
    }

    public int hashCode() {
        return (((int) this.toleranceBeforeUs) * 31) + ((int) this.toleranceAfterUs);
    }
}
