package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultLivePlaybackSpeedControl implements androidx.media3.exoplayer.LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    private float adjustedPlaybackSpeed;
    private long currentTargetLiveOffsetUs;
    private final float fallbackMaxPlaybackSpeed;
    private final float fallbackMinPlaybackSpeed;
    private long idealTargetLiveOffsetUs;
    private long lastPlaybackSpeedUpdateMs;
    private final long maxLiveOffsetErrorUsForUnitSpeed;
    private float maxPlaybackSpeed;
    private long maxTargetLiveOffsetUs;
    private long mediaConfigurationTargetLiveOffsetUs;
    private float minPlaybackSpeed;
    private final float minPossibleLiveOffsetSmoothingFactor;
    private long minTargetLiveOffsetUs;
    private final long minUpdateIntervalMs;
    private final float proportionalControlFactor;
    private long smoothedMinPossibleLiveOffsetDeviationUs;
    private long smoothedMinPossibleLiveOffsetUs;
    private long targetLiveOffsetOverrideUs;
    private final long targetLiveOffsetRebufferDeltaUs;

    private static long smooth(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    public static final class Builder {
        private float fallbackMinPlaybackSpeed = 0.97f;
        private float fallbackMaxPlaybackSpeed = 1.03f;
        private long minUpdateIntervalMs = 1000;
        private float proportionalControlFactorUs = 1.0E-7f;
        private long maxLiveOffsetErrorUsForUnitSpeed = androidx.media3.common.util.Util.msToUs(20);
        private long targetLiveOffsetIncrementOnRebufferUs = androidx.media3.common.util.Util.msToUs(500);
        private float minPossibleLiveOffsetSmoothingFactor = 0.999f;

        public androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder setFallbackMinPlaybackSpeed(float f) {
            androidx.media3.common.util.Assertions.checkArgument(0.0f < f && f <= 1.0f);
            this.fallbackMinPlaybackSpeed = f;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder setFallbackMaxPlaybackSpeed(float f) {
            androidx.media3.common.util.Assertions.checkArgument(f >= 1.0f);
            this.fallbackMaxPlaybackSpeed = f;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder setMinUpdateIntervalMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j > 0);
            this.minUpdateIntervalMs = j;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder setProportionalControlFactor(float f) {
            androidx.media3.common.util.Assertions.checkArgument(f > 0.0f);
            this.proportionalControlFactorUs = f / 1000000.0f;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder setMaxLiveOffsetErrorMsForUnitSpeed(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j > 0);
            this.maxLiveOffsetErrorUsForUnitSpeed = androidx.media3.common.util.Util.msToUs(j);
            return this;
        }

        public androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder setTargetLiveOffsetIncrementOnRebufferMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j >= 0);
            this.targetLiveOffsetIncrementOnRebufferUs = androidx.media3.common.util.Util.msToUs(j);
            return this;
        }

        public androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder setMinPossibleLiveOffsetSmoothingFactor(float f) {
            androidx.media3.common.util.Assertions.checkArgument(f >= 0.0f && f < 1.0f);
            this.minPossibleLiveOffsetSmoothingFactor = f;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl build() {
            return new androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl(this.fallbackMinPlaybackSpeed, this.fallbackMaxPlaybackSpeed, this.minUpdateIntervalMs, this.proportionalControlFactorUs, this.maxLiveOffsetErrorUsForUnitSpeed, this.targetLiveOffsetIncrementOnRebufferUs, this.minPossibleLiveOffsetSmoothingFactor);
        }
    }

    private DefaultLivePlaybackSpeedControl(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.fallbackMinPlaybackSpeed = f;
        this.fallbackMaxPlaybackSpeed = f2;
        this.minUpdateIntervalMs = j;
        this.proportionalControlFactor = f3;
        this.maxLiveOffsetErrorUsForUnitSpeed = j2;
        this.targetLiveOffsetRebufferDeltaUs = j3;
        this.minPossibleLiveOffsetSmoothingFactor = f4;
        this.mediaConfigurationTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.targetLiveOffsetOverrideUs = androidx.media3.common.C.TIME_UNSET;
        this.minTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.maxTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.minPlaybackSpeed = f;
        this.maxPlaybackSpeed = f2;
        this.adjustedPlaybackSpeed = 1.0f;
        this.lastPlaybackSpeedUpdateMs = androidx.media3.common.C.TIME_UNSET;
        this.idealTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.currentTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setLiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
        float f;
        float f2;
        this.mediaConfigurationTargetLiveOffsetUs = androidx.media3.common.util.Util.msToUs(liveConfiguration.targetOffsetMs);
        this.minTargetLiveOffsetUs = androidx.media3.common.util.Util.msToUs(liveConfiguration.minOffsetMs);
        this.maxTargetLiveOffsetUs = androidx.media3.common.util.Util.msToUs(liveConfiguration.maxOffsetMs);
        if (liveConfiguration.minPlaybackSpeed != -3.4028235E38f) {
            f = liveConfiguration.minPlaybackSpeed;
        } else {
            f = this.fallbackMinPlaybackSpeed;
        }
        this.minPlaybackSpeed = f;
        if (liveConfiguration.maxPlaybackSpeed != -3.4028235E38f) {
            f2 = liveConfiguration.maxPlaybackSpeed;
        } else {
            f2 = this.fallbackMaxPlaybackSpeed;
        }
        this.maxPlaybackSpeed = f2;
        if (this.minPlaybackSpeed == 1.0f && f2 == 1.0f) {
            this.mediaConfigurationTargetLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        }
        maybeResetTargetLiveOffsetUs();
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long j) {
        this.targetLiveOffsetOverrideUs = j;
        maybeResetTargetLiveOffsetUs();
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        long j = this.currentTargetLiveOffsetUs;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.targetLiveOffsetRebufferDeltaUs;
        this.currentTargetLiveOffsetUs = j2;
        long j3 = this.maxTargetLiveOffsetUs;
        if (j3 != androidx.media3.common.C.TIME_UNSET && j2 > j3) {
            this.currentTargetLiveOffsetUs = j3;
        }
        this.lastPlaybackSpeedUpdateMs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long j, long j2) {
        if (this.mediaConfigurationTargetLiveOffsetUs == androidx.media3.common.C.TIME_UNSET) {
            return 1.0f;
        }
        updateSmoothedMinPossibleLiveOffsetUs(j, j2);
        if (this.lastPlaybackSpeedUpdateMs != androidx.media3.common.C.TIME_UNSET && android.os.SystemClock.elapsedRealtime() - this.lastPlaybackSpeedUpdateMs < this.minUpdateIntervalMs) {
            return this.adjustedPlaybackSpeed;
        }
        this.lastPlaybackSpeedUpdateMs = android.os.SystemClock.elapsedRealtime();
        adjustTargetLiveOffsetUs(j);
        long j3 = j - this.currentTargetLiveOffsetUs;
        if (java.lang.Math.abs(j3) < this.maxLiveOffsetErrorUsForUnitSpeed) {
            this.adjustedPlaybackSpeed = 1.0f;
        } else {
            this.adjustedPlaybackSpeed = androidx.media3.common.util.Util.constrainValue((this.proportionalControlFactor * j3) + 1.0f, this.minPlaybackSpeed, this.maxPlaybackSpeed);
        }
        return this.adjustedPlaybackSpeed;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.currentTargetLiveOffsetUs;
    }

    private void maybeResetTargetLiveOffsetUs() {
        long j;
        long j2 = this.mediaConfigurationTargetLiveOffsetUs;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            j = this.targetLiveOffsetOverrideUs;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                long j3 = this.minTargetLiveOffsetUs;
                if (j3 != androidx.media3.common.C.TIME_UNSET && j2 < j3) {
                    j2 = j3;
                }
                j = this.maxTargetLiveOffsetUs;
                if (j == androidx.media3.common.C.TIME_UNSET || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.idealTargetLiveOffsetUs == j) {
            return;
        }
        this.idealTargetLiveOffsetUs = j;
        this.currentTargetLiveOffsetUs = j;
        this.smoothedMinPossibleLiveOffsetUs = androidx.media3.common.C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = androidx.media3.common.C.TIME_UNSET;
        this.lastPlaybackSpeedUpdateMs = androidx.media3.common.C.TIME_UNSET;
    }

    private void updateSmoothedMinPossibleLiveOffsetUs(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.smoothedMinPossibleLiveOffsetUs;
        if (j4 == androidx.media3.common.C.TIME_UNSET) {
            this.smoothedMinPossibleLiveOffsetUs = j3;
            this.smoothedMinPossibleLiveOffsetDeviationUs = 0L;
        } else {
            long jMax = java.lang.Math.max(j3, smooth(j4, j3, this.minPossibleLiveOffsetSmoothingFactor));
            this.smoothedMinPossibleLiveOffsetUs = jMax;
            this.smoothedMinPossibleLiveOffsetDeviationUs = smooth(this.smoothedMinPossibleLiveOffsetDeviationUs, java.lang.Math.abs(j3 - jMax), this.minPossibleLiveOffsetSmoothingFactor);
        }
    }

    private void adjustTargetLiveOffsetUs(long j) {
        long j2 = this.smoothedMinPossibleLiveOffsetUs + (this.smoothedMinPossibleLiveOffsetDeviationUs * 3);
        if (this.currentTargetLiveOffsetUs > j2) {
            float fMsToUs = androidx.media3.common.util.Util.msToUs(this.minUpdateIntervalMs);
            this.currentTargetLiveOffsetUs = com.google.common.primitives.Longs.max(j2, this.idealTargetLiveOffsetUs, this.currentTargetLiveOffsetUs - (((long) ((this.adjustedPlaybackSpeed - 1.0f) * fMsToUs)) + ((long) ((this.maxPlaybackSpeed - 1.0f) * fMsToUs))));
            return;
        }
        long jConstrainValue = androidx.media3.common.util.Util.constrainValue(j - ((long) (java.lang.Math.max(0.0f, this.adjustedPlaybackSpeed - 1.0f) / this.proportionalControlFactor)), this.currentTargetLiveOffsetUs, j2);
        this.currentTargetLiveOffsetUs = jConstrainValue;
        long j3 = this.maxTargetLiveOffsetUs;
        if (j3 == androidx.media3.common.C.TIME_UNSET || jConstrainValue <= j3) {
            return;
        }
        this.currentTargetLiveOffsetUs = j3;
    }
}
