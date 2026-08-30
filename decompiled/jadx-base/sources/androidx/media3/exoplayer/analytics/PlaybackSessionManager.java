package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public interface PlaybackSessionManager {

    public interface Listener {
        void onAdPlaybackStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2);

        void onSessionActive(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str);

        void onSessionCreated(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str);

        void onSessionFinished(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, boolean z);
    }

    boolean belongsToSession(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str);

    void finishAllSessions(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime);

    java.lang.String getActiveSessionId();

    java.lang.String getSessionForMediaPeriodId(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);

    void setListener(androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener listener);

    void updateSessions(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime);

    void updateSessionsWithDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i);

    void updateSessionsWithTimelineChange(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime);
}
