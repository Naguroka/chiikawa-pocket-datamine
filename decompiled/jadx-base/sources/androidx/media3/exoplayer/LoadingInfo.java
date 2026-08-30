package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    public static final class Builder {
        private long lastRebufferRealtimeMs;
        private long playbackPositionUs;
        private float playbackSpeed;

        public Builder() {
            this.playbackPositionUs = androidx.media3.common.C.TIME_UNSET;
            this.playbackSpeed = -3.4028235E38f;
            this.lastRebufferRealtimeMs = androidx.media3.common.C.TIME_UNSET;
        }

        private Builder(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
            this.playbackPositionUs = loadingInfo.playbackPositionUs;
            this.playbackSpeed = loadingInfo.playbackSpeed;
            this.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        }

        public androidx.media3.exoplayer.LoadingInfo.Builder setPlaybackPositionUs(long j) {
            this.playbackPositionUs = j;
            return this;
        }

        public androidx.media3.exoplayer.LoadingInfo.Builder setPlaybackSpeed(float f) {
            androidx.media3.common.util.Assertions.checkArgument(f > 0.0f || f == -3.4028235E38f);
            this.playbackSpeed = f;
            return this;
        }

        public androidx.media3.exoplayer.LoadingInfo.Builder setLastRebufferRealtimeMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j >= 0 || j == androidx.media3.common.C.TIME_UNSET);
            this.lastRebufferRealtimeMs = j;
            return this;
        }

        public androidx.media3.exoplayer.LoadingInfo build() {
            return new androidx.media3.exoplayer.LoadingInfo(this);
        }
    }

    private LoadingInfo(androidx.media3.exoplayer.LoadingInfo.Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }

    public androidx.media3.exoplayer.LoadingInfo.Builder buildUpon() {
        return new androidx.media3.exoplayer.LoadingInfo.Builder();
    }

    public boolean rebufferedSince(long j) {
        long j2 = this.lastRebufferRealtimeMs;
        return (j2 == androidx.media3.common.C.TIME_UNSET || j == androidx.media3.common.C.TIME_UNSET || j2 < j) ? false : true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.exoplayer.LoadingInfo)) {
            return false;
        }
        androidx.media3.exoplayer.LoadingInfo loadingInfo = (androidx.media3.exoplayer.LoadingInfo) obj;
        return this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Long.valueOf(this.playbackPositionUs), java.lang.Float.valueOf(this.playbackSpeed), java.lang.Long.valueOf(this.lastRebufferRealtimeMs));
    }
}
