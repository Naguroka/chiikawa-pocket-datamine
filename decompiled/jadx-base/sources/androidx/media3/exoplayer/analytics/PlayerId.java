package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerId {
    public static final androidx.media3.exoplayer.analytics.PlayerId UNSET;
    private final java.lang.Object equalityToken;
    private final androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31 logSessionIdApi31;
    public final java.lang.String name;

    static {
        androidx.media3.exoplayer.analytics.PlayerId playerId;
        if (androidx.media3.common.util.Util.SDK_INT < 31) {
            playerId = new androidx.media3.exoplayer.analytics.PlayerId("");
        } else {
            playerId = new androidx.media3.exoplayer.analytics.PlayerId(androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31.UNSET, "");
        }
        UNSET = playerId;
    }

    public PlayerId(java.lang.String str) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.SDK_INT < 31);
        this.name = str;
        this.logSessionIdApi31 = null;
        this.equalityToken = new java.lang.Object();
    }

    public PlayerId(android.media.metrics.LogSessionId logSessionId, java.lang.String str) {
        this(new androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31(logSessionId), str);
    }

    private PlayerId(androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31 logSessionIdApi31, java.lang.String str) {
        this.logSessionIdApi31 = logSessionIdApi31;
        this.name = str;
        this.equalityToken = new java.lang.Object();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.exoplayer.analytics.PlayerId)) {
            return false;
        }
        androidx.media3.exoplayer.analytics.PlayerId playerId = (androidx.media3.exoplayer.analytics.PlayerId) obj;
        return java.util.Objects.equals(this.name, playerId.name) && java.util.Objects.equals(this.logSessionIdApi31, playerId.logSessionIdApi31) && java.util.Objects.equals(this.equalityToken, playerId.equalityToken);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.name, this.logSessionIdApi31, this.equalityToken);
    }

    public android.media.metrics.LogSessionId getLogSessionId() {
        return ((androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31) androidx.media3.common.util.Assertions.checkNotNull(this.logSessionIdApi31)).logSessionId;
    }

    private static final class LogSessionIdApi31 {
        public static final androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31 UNSET = new androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE);
        public final android.media.metrics.LogSessionId logSessionId;

        public LogSessionIdApi31(android.media.metrics.LogSessionId logSessionId) {
            this.logSessionId = logSessionId;
        }
    }
}
