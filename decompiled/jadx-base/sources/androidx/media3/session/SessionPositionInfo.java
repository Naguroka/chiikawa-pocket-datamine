package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class SessionPositionInfo {
    public static final androidx.media3.session.SessionPositionInfo DEFAULT;
    public static final androidx.media3.common.Player.PositionInfo DEFAULT_POSITION_INFO;
    private static final java.lang.String FIELD_BUFFERED_PERCENTAGE;
    static final java.lang.String FIELD_BUFFERED_POSITION_MS;
    static final java.lang.String FIELD_CONTENT_BUFFERED_POSITION_MS;
    private static final java.lang.String FIELD_CONTENT_DURATION_MS;
    private static final java.lang.String FIELD_CURRENT_LIVE_OFFSET_MS;
    private static final java.lang.String FIELD_DURATION_MS;
    private static final java.lang.String FIELD_EVENT_TIME_MS;
    private static final java.lang.String FIELD_IS_PLAYING_AD;
    static final java.lang.String FIELD_POSITION_INFO;
    private static final java.lang.String FIELD_TOTAL_BUFFERED_DURATION_MS;
    public final int bufferedPercentage;
    public final long bufferedPositionMs;
    public final long contentBufferedPositionMs;
    public final long contentDurationMs;
    public final long currentLiveOffsetMs;
    public final long durationMs;
    public final long eventTimeMs;
    public final boolean isPlayingAd;
    public final androidx.media3.common.Player.PositionInfo positionInfo;
    public final long totalBufferedDurationMs;

    static {
        androidx.media3.common.Player.PositionInfo positionInfo = new androidx.media3.common.Player.PositionInfo(null, 0, null, null, 0, 0L, 0L, -1, -1);
        DEFAULT_POSITION_INFO = positionInfo;
        DEFAULT = new androidx.media3.session.SessionPositionInfo(positionInfo, false, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, 0L, 0, 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, 0L);
        FIELD_POSITION_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        FIELD_IS_PLAYING_AD = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        FIELD_EVENT_TIME_MS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        FIELD_DURATION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        FIELD_BUFFERED_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        FIELD_BUFFERED_PERCENTAGE = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        FIELD_TOTAL_BUFFERED_DURATION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        FIELD_CURRENT_LIVE_OFFSET_MS = androidx.media3.common.util.Util.intToStringMaxRadix(7);
        FIELD_CONTENT_DURATION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(8);
        FIELD_CONTENT_BUFFERED_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    }

    public SessionPositionInfo(androidx.media3.common.Player.PositionInfo positionInfo, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        androidx.media3.common.util.Assertions.checkArgument(z == (positionInfo.adGroupIndex != -1));
        this.positionInfo = positionInfo;
        this.isPlayingAd = z;
        this.eventTimeMs = j;
        this.durationMs = j2;
        this.bufferedPositionMs = j3;
        this.bufferedPercentage = i;
        this.totalBufferedDurationMs = j4;
        this.currentLiveOffsetMs = j5;
        this.contentDurationMs = j6;
        this.contentBufferedPositionMs = j7;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.session.SessionPositionInfo sessionPositionInfo = (androidx.media3.session.SessionPositionInfo) obj;
        return this.eventTimeMs == sessionPositionInfo.eventTimeMs && this.positionInfo.equals(sessionPositionInfo.positionInfo) && this.isPlayingAd == sessionPositionInfo.isPlayingAd && this.durationMs == sessionPositionInfo.durationMs && this.bufferedPositionMs == sessionPositionInfo.bufferedPositionMs && this.bufferedPercentage == sessionPositionInfo.bufferedPercentage && this.totalBufferedDurationMs == sessionPositionInfo.totalBufferedDurationMs && this.currentLiveOffsetMs == sessionPositionInfo.currentLiveOffsetMs && this.contentDurationMs == sessionPositionInfo.contentDurationMs && this.contentBufferedPositionMs == sessionPositionInfo.contentBufferedPositionMs;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.positionInfo, java.lang.Boolean.valueOf(this.isPlayingAd));
    }

    public java.lang.String toString() {
        return "SessionPositionInfo {PositionInfo {mediaItemIndex=" + this.positionInfo.mediaItemIndex + ", periodIndex=" + this.positionInfo.periodIndex + ", positionMs=" + this.positionInfo.positionMs + ", contentPositionMs=" + this.positionInfo.contentPositionMs + ", adGroupIndex=" + this.positionInfo.adGroupIndex + ", adIndexInAdGroup=" + this.positionInfo.adIndexInAdGroup + "}, isPlayingAd=" + this.isPlayingAd + ", eventTimeMs=" + this.eventTimeMs + ", durationMs=" + this.durationMs + ", bufferedPositionMs=" + this.bufferedPositionMs + ", bufferedPercentage=" + this.bufferedPercentage + ", totalBufferedDurationMs=" + this.totalBufferedDurationMs + ", currentLiveOffsetMs=" + this.currentLiveOffsetMs + ", contentDurationMs=" + this.contentDurationMs + ", contentBufferedPositionMs=" + this.contentBufferedPositionMs + "}";
    }

    public androidx.media3.session.SessionPositionInfo filterByAvailableCommands(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new androidx.media3.session.SessionPositionInfo(this.positionInfo.filterByAvailableCommands(z, z2), z && this.isPlayingAd, this.eventTimeMs, z ? this.durationMs : androidx.media3.common.C.TIME_UNSET, z ? this.bufferedPositionMs : 0L, z ? this.bufferedPercentage : 0, z ? this.totalBufferedDurationMs : 0L, z ? this.currentLiveOffsetMs : androidx.media3.common.C.TIME_UNSET, z ? this.contentDurationMs : androidx.media3.common.C.TIME_UNSET, z ? this.contentBufferedPositionMs : 0L);
    }

    public android.os.Bundle toBundle(int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (i < 3 || !DEFAULT_POSITION_INFO.equalsForBundling(this.positionInfo)) {
            bundle.putBundle(FIELD_POSITION_INFO, this.positionInfo.toBundle(i));
        }
        boolean z = this.isPlayingAd;
        if (z) {
            bundle.putBoolean(FIELD_IS_PLAYING_AD, z);
        }
        long j = this.eventTimeMs;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            bundle.putLong(FIELD_EVENT_TIME_MS, j);
        }
        long j2 = this.durationMs;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            bundle.putLong(FIELD_DURATION_MS, j2);
        }
        if (i < 3 || this.bufferedPositionMs != 0) {
            bundle.putLong(FIELD_BUFFERED_POSITION_MS, this.bufferedPositionMs);
        }
        int i2 = this.bufferedPercentage;
        if (i2 != 0) {
            bundle.putInt(FIELD_BUFFERED_PERCENTAGE, i2);
        }
        long j3 = this.totalBufferedDurationMs;
        if (j3 != 0) {
            bundle.putLong(FIELD_TOTAL_BUFFERED_DURATION_MS, j3);
        }
        long j4 = this.currentLiveOffsetMs;
        if (j4 != androidx.media3.common.C.TIME_UNSET) {
            bundle.putLong(FIELD_CURRENT_LIVE_OFFSET_MS, j4);
        }
        long j5 = this.contentDurationMs;
        if (j5 != androidx.media3.common.C.TIME_UNSET) {
            bundle.putLong(FIELD_CONTENT_DURATION_MS, j5);
        }
        if (i < 3 || this.contentBufferedPositionMs != 0) {
            bundle.putLong(FIELD_CONTENT_BUFFERED_POSITION_MS, this.contentBufferedPositionMs);
        }
        return bundle;
    }

    public static androidx.media3.session.SessionPositionInfo fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.Player.PositionInfo positionInfoFromBundle;
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_POSITION_INFO);
        if (bundle2 == null) {
            positionInfoFromBundle = DEFAULT_POSITION_INFO;
        } else {
            positionInfoFromBundle = androidx.media3.common.Player.PositionInfo.fromBundle(bundle2);
        }
        return new androidx.media3.session.SessionPositionInfo(positionInfoFromBundle, bundle.getBoolean(FIELD_IS_PLAYING_AD, false), bundle.getLong(FIELD_EVENT_TIME_MS, androidx.media3.common.C.TIME_UNSET), bundle.getLong(FIELD_DURATION_MS, androidx.media3.common.C.TIME_UNSET), bundle.getLong(FIELD_BUFFERED_POSITION_MS, 0L), bundle.getInt(FIELD_BUFFERED_PERCENTAGE, 0), bundle.getLong(FIELD_TOTAL_BUFFERED_DURATION_MS, 0L), bundle.getLong(FIELD_CURRENT_LIVE_OFFSET_MS, androidx.media3.common.C.TIME_UNSET), bundle.getLong(FIELD_CONTENT_DURATION_MS, androidx.media3.common.C.TIME_UNSET), bundle.getLong(FIELD_CONTENT_BUFFERED_POSITION_MS, 0L));
    }
}
