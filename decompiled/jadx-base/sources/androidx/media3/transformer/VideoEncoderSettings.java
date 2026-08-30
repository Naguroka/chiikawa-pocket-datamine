package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoEncoderSettings {
    public static final androidx.media3.transformer.VideoEncoderSettings DEFAULT = new androidx.media3.transformer.VideoEncoderSettings.Builder().build();
    public static final float DEFAULT_I_FRAME_INTERVAL_SECONDS = 1.0f;
    public static final int NO_VALUE = -1;
    public final int bitrate;
    public final int bitrateMode;
    public final boolean enableHighQualityTargeting;
    public final float iFrameIntervalSeconds;
    public final int level;
    public final int operatingRate;
    public final int priority;
    public final int profile;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BitrateMode {
    }

    public static final class Builder {
        private int bitrate;
        private int bitrateMode;
        private boolean enableHighQualityTargeting;
        private float iFrameIntervalSeconds;
        private int level;
        private int operatingRate;
        private int priority;
        private int profile;

        public Builder() {
            this.bitrate = -1;
            this.bitrateMode = 1;
            this.profile = -1;
            this.level = -1;
            this.iFrameIntervalSeconds = 1.0f;
            this.operatingRate = -1;
            this.priority = -1;
        }

        private Builder(androidx.media3.transformer.VideoEncoderSettings videoEncoderSettings) {
            this.bitrate = videoEncoderSettings.bitrate;
            this.bitrateMode = videoEncoderSettings.bitrateMode;
            this.profile = videoEncoderSettings.profile;
            this.level = videoEncoderSettings.level;
            this.iFrameIntervalSeconds = videoEncoderSettings.iFrameIntervalSeconds;
            this.operatingRate = videoEncoderSettings.operatingRate;
            this.priority = videoEncoderSettings.priority;
            this.enableHighQualityTargeting = videoEncoderSettings.enableHighQualityTargeting;
        }

        public androidx.media3.transformer.VideoEncoderSettings.Builder setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public androidx.media3.transformer.VideoEncoderSettings.Builder setBitrateMode(int i) {
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            androidx.media3.common.util.Assertions.checkArgument(z);
            this.bitrateMode = i;
            return this;
        }

        public androidx.media3.transformer.VideoEncoderSettings.Builder setEncodingProfileLevel(int i, int i2) {
            this.profile = i;
            this.level = i2;
            return this;
        }

        public androidx.media3.transformer.VideoEncoderSettings.Builder setiFrameIntervalSeconds(float f) {
            this.iFrameIntervalSeconds = f;
            return this;
        }

        public androidx.media3.transformer.VideoEncoderSettings.Builder setEncoderPerformanceParameters(int i, int i2) {
            this.operatingRate = i;
            this.priority = i2;
            return this;
        }

        public androidx.media3.transformer.VideoEncoderSettings.Builder experimentalSetEnableHighQualityTargeting(boolean z) {
            this.enableHighQualityTargeting = z;
            return this;
        }

        public androidx.media3.transformer.VideoEncoderSettings build() {
            androidx.media3.common.util.Assertions.checkState(!this.enableHighQualityTargeting || this.bitrate == -1, "Bitrate can not be set if enabling high quality targeting.");
            androidx.media3.common.util.Assertions.checkState(!this.enableHighQualityTargeting || this.bitrateMode == 1, "Bitrate mode must be VBR if enabling high quality targeting.");
            return new androidx.media3.transformer.VideoEncoderSettings(this.bitrate, this.bitrateMode, this.profile, this.level, this.iFrameIntervalSeconds, this.operatingRate, this.priority, this.enableHighQualityTargeting);
        }
    }

    private VideoEncoderSettings(int i, int i2, int i3, int i4, float f, int i5, int i6, boolean z) {
        this.bitrate = i;
        this.bitrateMode = i2;
        this.profile = i3;
        this.level = i4;
        this.iFrameIntervalSeconds = f;
        this.operatingRate = i5;
        this.priority = i6;
        this.enableHighQualityTargeting = z;
    }

    public androidx.media3.transformer.VideoEncoderSettings.Builder buildUpon() {
        return new androidx.media3.transformer.VideoEncoderSettings.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.transformer.VideoEncoderSettings)) {
            return false;
        }
        androidx.media3.transformer.VideoEncoderSettings videoEncoderSettings = (androidx.media3.transformer.VideoEncoderSettings) obj;
        return this.bitrate == videoEncoderSettings.bitrate && this.bitrateMode == videoEncoderSettings.bitrateMode && this.profile == videoEncoderSettings.profile && this.level == videoEncoderSettings.level && this.iFrameIntervalSeconds == videoEncoderSettings.iFrameIntervalSeconds && this.operatingRate == videoEncoderSettings.operatingRate && this.priority == videoEncoderSettings.priority && this.enableHighQualityTargeting == videoEncoderSettings.enableHighQualityTargeting;
    }

    public int hashCode() {
        return ((((((((((((((217 + this.bitrate) * 31) + this.bitrateMode) * 31) + this.profile) * 31) + this.level) * 31) + java.lang.Float.floatToIntBits(this.iFrameIntervalSeconds)) * 31) + this.operatingRate) * 31) + this.priority) * 31) + (this.enableHighQualityTargeting ? 1 : 0);
    }
}
