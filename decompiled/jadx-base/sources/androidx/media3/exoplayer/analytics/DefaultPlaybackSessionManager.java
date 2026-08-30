package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultPlaybackSessionManager implements androidx.media3.exoplayer.analytics.PlaybackSessionManager {
    public static final com.google.common.base.Supplier<java.lang.String> DEFAULT_SESSION_ID_GENERATOR = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Supplier
        public final java.lang.Object get() {
            return androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.generateDefaultSessionId();
        }
    };
    private static final java.util.Random RANDOM = new java.util.Random();
    private static final int SESSION_ID_LENGTH = 12;
    private java.lang.String currentSessionId;
    private androidx.media3.common.Timeline currentTimeline;
    private long lastRemovedCurrentWindowSequenceNumber;
    private androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener listener;
    private final androidx.media3.common.Timeline.Period period;
    private final com.google.common.base.Supplier<java.lang.String> sessionIdGenerator;
    private final java.util.HashMap<java.lang.String, androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor> sessions;
    private final androidx.media3.common.Timeline.Window window;

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    public DefaultPlaybackSessionManager(com.google.common.base.Supplier<java.lang.String> supplier) {
        this.sessionIdGenerator = supplier;
        this.window = new androidx.media3.common.Timeline.Window();
        this.period = new androidx.media3.common.Timeline.Period();
        this.sessions = new java.util.HashMap<>();
        this.currentTimeline = androidx.media3.common.Timeline.EMPTY;
        this.lastRemovedCurrentWindowSequenceNumber = -1L;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void setListener(androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized java.lang.String getSessionForMediaPeriodId(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(str);
        if (sessionDescriptor == null) {
            return false;
        }
        sessionDescriptor.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return sessionDescriptor.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessions(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime2;
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor;
        androidx.media3.common.util.Assertions.checkNotNull(this.listener);
        if (eventTime.timeline.isEmpty()) {
            return;
        }
        if (eventTime.mediaPeriodId != null) {
            if (eventTime.mediaPeriodId.windowSequenceNumber < getMinWindowSequenceNumber()) {
                return;
            }
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor2 = this.sessions.get(this.currentSessionId);
            if (sessionDescriptor2 != null && sessionDescriptor2.windowSequenceNumber == -1 && sessionDescriptor2.windowIndex != eventTime.windowIndex) {
                return;
            }
        }
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        if (this.currentSessionId == null) {
            this.currentSessionId = orAddSession.sessionId;
        }
        if (eventTime.mediaPeriodId != null && eventTime.mediaPeriodId.isAd()) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(eventTime.mediaPeriodId.periodUid, eventTime.mediaPeriodId.windowSequenceNumber, eventTime.mediaPeriodId.adGroupIndex);
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor orAddSession2 = getOrAddSession(eventTime.windowIndex, mediaPeriodId);
            if (!orAddSession2.isCreated) {
                orAddSession2.isCreated = true;
                eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period);
                this.listener.onSessionCreated(new androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime(eventTime.realtimeMs, eventTime.timeline, eventTime.windowIndex, mediaPeriodId, java.lang.Math.max(0L, androidx.media3.common.util.Util.usToMs(this.period.getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex)) + this.period.getPositionInWindowMs()), eventTime.currentTimeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs), orAddSession2.sessionId);
            }
        }
        if (orAddSession.isCreated) {
            eventTime2 = eventTime;
            sessionDescriptor = orAddSession;
        } else {
            sessionDescriptor = orAddSession;
            sessionDescriptor.isCreated = true;
            eventTime2 = eventTime;
            this.listener.onSessionCreated(eventTime2, sessionDescriptor.sessionId);
        }
        if (sessionDescriptor.sessionId.equals(this.currentSessionId) && !sessionDescriptor.isActive) {
            sessionDescriptor.isActive = true;
            this.listener.onSessionActive(eventTime2, sessionDescriptor.sessionId);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        androidx.media3.common.util.Assertions.checkNotNull(this.listener);
        androidx.media3.common.Timeline timeline = this.currentTimeline;
        this.currentTimeline = eventTime.timeline;
        java.util.Iterator<androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor next = it.next();
            if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline) || next.isFinishedAtEventTime(eventTime)) {
                it.remove();
                if (next.isCreated) {
                    if (next.sessionId.equals(this.currentSessionId)) {
                        clearCurrentSession(next);
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.common.util.Assertions.checkNotNull(this.listener);
        boolean z = i == 0;
        java.util.Iterator<androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor next = it.next();
            if (next.isFinishedAtEventTime(eventTime)) {
                it.remove();
                if (next.isCreated) {
                    boolean zEquals = next.sessionId.equals(this.currentSessionId);
                    boolean z2 = z && zEquals && next.isActive;
                    if (zEquals) {
                        clearCurrentSession(next);
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, z2);
                }
            }
        }
        updateCurrentSession(eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized java.lang.String getActiveSessionId() {
        return this.currentSessionId;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener listener;
        java.lang.String str = this.currentSessionId;
        if (str != null) {
            clearCurrentSession((androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor) androidx.media3.common.util.Assertions.checkNotNull(this.sessions.get(str)));
        }
        java.util.Iterator<androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor next = it.next();
            it.remove();
            if (next.isCreated && (listener = this.listener) != null) {
                listener.onSessionFinished(eventTime, next.sessionId, false);
            }
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private void updateCurrentSession(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            java.lang.String str = this.currentSessionId;
            if (str != null) {
                clearCurrentSession((androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor) androidx.media3.common.util.Assertions.checkNotNull(this.sessions.get(str)));
                return;
            }
            return;
        }
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.sessionId;
        updateSessions(eventTime);
        if (eventTime.mediaPeriodId == null || !eventTime.mediaPeriodId.isAd()) {
            return;
        }
        if (sessionDescriptor != null && sessionDescriptor.windowSequenceNumber == eventTime.mediaPeriodId.windowSequenceNumber && sessionDescriptor.adMediaPeriodId != null && sessionDescriptor.adMediaPeriodId.adGroupIndex == eventTime.mediaPeriodId.adGroupIndex && sessionDescriptor.adMediaPeriodId.adIndexInAdGroup == eventTime.mediaPeriodId.adIndexInAdGroup) {
            return;
        }
        this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(eventTime.mediaPeriodId.periodUid, eventTime.mediaPeriodId.windowSequenceNumber)).sessionId, orAddSession.sessionId);
    }

    private void clearCurrentSession(androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor) {
        if (sessionDescriptor.windowSequenceNumber != -1) {
            this.lastRemovedCurrentWindowSequenceNumber = sessionDescriptor.windowSequenceNumber;
        }
        this.currentSessionId = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMinWindowSequenceNumber() {
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
        if (sessionDescriptor == null || sessionDescriptor.windowSequenceNumber == -1) {
            return this.lastRemovedCurrentWindowSequenceNumber + 1;
        }
        return sessionDescriptor.windowSequenceNumber;
    }

    private androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor getOrAddSession(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = null;
        long j = Long.MAX_VALUE;
        for (androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor2 : this.sessions.values()) {
            sessionDescriptor2.maybeSetWindowSequenceNumber(i, mediaPeriodId);
            if (sessionDescriptor2.belongsToSession(i, mediaPeriodId)) {
                long j2 = sessionDescriptor2.windowSequenceNumber;
                if (j2 == -1 || j2 < j) {
                    sessionDescriptor = sessionDescriptor2;
                    j = j2;
                } else if (j2 == j && ((androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor) androidx.media3.common.util.Util.castNonNull(sessionDescriptor)).adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId != null) {
                    sessionDescriptor = sessionDescriptor2;
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        java.lang.String str = this.sessionIdGenerator.get();
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor3 = new androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor(str, i, mediaPeriodId);
        this.sessions.put(str, sessionDescriptor3);
        return sessionDescriptor3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 10);
    }

    private final class SessionDescriptor {
        private androidx.media3.exoplayer.source.MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final java.lang.String sessionId;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(java.lang.String str, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        public boolean tryResolvingToNewTimeline(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2) {
            int iResolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = iResolveWindowIndexToNewTimeline;
            if (iResolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }

        public boolean belongsToSession(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId == null) {
                return i == this.windowIndex;
            }
            if (this.adMediaPeriodId == null) {
                return !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.windowSequenceNumber;
            }
            return mediaPeriodId.windowSequenceNumber == this.adMediaPeriodId.windowSequenceNumber && mediaPeriodId.adGroupIndex == this.adMediaPeriodId.adGroupIndex && mediaPeriodId.adIndexInAdGroup == this.adMediaPeriodId.adIndexInAdGroup;
        }

        public void maybeSetWindowSequenceNumber(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber != -1 || i != this.windowIndex || mediaPeriodId == null || mediaPeriodId.windowSequenceNumber < androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.getMinWindowSequenceNumber()) {
                return;
            }
            this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
        }

        public boolean isFinishedAtEventTime(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
            if (eventTime.mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            if (this.windowSequenceNumber == -1) {
                return false;
            }
            if (eventTime.mediaPeriodId.windowSequenceNumber > this.windowSequenceNumber) {
                return true;
            }
            if (this.adMediaPeriodId == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
            if (eventTime.mediaPeriodId.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!eventTime.mediaPeriodId.isAd()) {
                return eventTime.mediaPeriodId.nextAdGroupIndex == -1 || eventTime.mediaPeriodId.nextAdGroupIndex > this.adMediaPeriodId.adGroupIndex;
            }
            int i = eventTime.mediaPeriodId.adGroupIndex;
            int i2 = eventTime.mediaPeriodId.adIndexInAdGroup;
            if (i <= this.adMediaPeriodId.adGroupIndex) {
                return i == this.adMediaPeriodId.adGroupIndex && i2 > this.adMediaPeriodId.adIndexInAdGroup;
            }
            return true;
        }

        private int resolveWindowIndexToNewTimeline(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2, int i) {
            if (i < timeline.getWindowCount()) {
                timeline.getWindow(i, androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.window);
                for (int i2 = androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i2 <= androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i2++) {
                    int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
                    if (indexOfPeriod != -1) {
                        return timeline2.getPeriod(indexOfPeriod, androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.period).windowIndex;
                    }
                }
                return -1;
            }
            if (i < timeline2.getWindowCount()) {
                return i;
            }
            return -1;
        }
    }
}
