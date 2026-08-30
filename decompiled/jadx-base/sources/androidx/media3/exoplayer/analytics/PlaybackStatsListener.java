package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStatsListener implements androidx.media3.exoplayer.analytics.AnalyticsListener, androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener {
    private androidx.media3.common.Format audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;
    private final androidx.media3.exoplayer.analytics.PlaybackStatsListener.Callback callback;
    private long discontinuityFromPositionMs;
    private java.lang.String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private androidx.media3.exoplayer.analytics.PlaybackStats finishedPlaybackStats;
    private final boolean keepHistory;
    private java.lang.Exception nonFatalException;
    private final androidx.media3.common.Timeline.Period period;
    private final java.util.Map<java.lang.String, androidx.media3.exoplayer.analytics.PlaybackStatsListener.PlaybackStatsTracker> playbackStatsTrackers;
    private final androidx.media3.exoplayer.analytics.PlaybackSessionManager sessionManager;
    private final java.util.Map<java.lang.String, androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime> sessionStartEventTimes;
    private androidx.media3.common.Format videoFormat;
    private androidx.media3.common.VideoSize videoSize;

    public interface Callback {
        void onPlaybackStatsReady(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.analytics.PlaybackStats playbackStats);
    }

    public PlaybackStatsListener(boolean z, androidx.media3.exoplayer.analytics.PlaybackStatsListener.Callback callback) {
        this.callback = callback;
        this.keepHistory = z;
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager defaultPlaybackSessionManager = new androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        this.playbackStatsTrackers = new java.util.HashMap();
        this.sessionStartEventTimes = new java.util.HashMap();
        this.finishedPlaybackStats = androidx.media3.exoplayer.analytics.PlaybackStats.EMPTY;
        this.period = new androidx.media3.common.Timeline.Period();
        this.videoSize = androidx.media3.common.VideoSize.UNKNOWN;
        defaultPlaybackSessionManager.setListener(this);
    }

    public androidx.media3.exoplayer.analytics.PlaybackStats getCombinedPlaybackStats() {
        int i = 1;
        androidx.media3.exoplayer.analytics.PlaybackStats[] playbackStatsArr = new androidx.media3.exoplayer.analytics.PlaybackStats[this.playbackStatsTrackers.size() + 1];
        playbackStatsArr[0] = this.finishedPlaybackStats;
        java.util.Iterator<androidx.media3.exoplayer.analytics.PlaybackStatsListener.PlaybackStatsTracker> it = this.playbackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            playbackStatsArr[i] = it.next().build(false);
            i++;
        }
        return androidx.media3.exoplayer.analytics.PlaybackStats.merge(playbackStatsArr);
    }

    public androidx.media3.exoplayer.analytics.PlaybackStats getPlaybackStats() {
        java.lang.String activeSessionId = this.sessionManager.getActiveSessionId();
        androidx.media3.exoplayer.analytics.PlaybackStatsListener.PlaybackStatsTracker playbackStatsTracker = activeSessionId == null ? null : this.playbackStatsTrackers.get(activeSessionId);
        if (playbackStatsTracker == null) {
            return null;
        }
        return playbackStatsTracker.build(false);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        this.playbackStatsTrackers.put(str, new androidx.media3.exoplayer.analytics.PlaybackStatsListener.PlaybackStatsTracker(this.keepHistory, eventTime));
        this.sessionStartEventTimes.put(str, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        ((androidx.media3.exoplayer.analytics.PlaybackStatsListener.PlaybackStatsTracker) androidx.media3.common.util.Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onForeground();
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2) {
        ((androidx.media3.exoplayer.analytics.PlaybackStatsListener.PlaybackStatsTracker) androidx.media3.common.util.Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onInterruptedByAd();
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, boolean z) {
        androidx.media3.exoplayer.analytics.PlaybackStatsListener.PlaybackStatsTracker playbackStatsTracker = (androidx.media3.exoplayer.analytics.PlaybackStatsListener.PlaybackStatsTracker) androidx.media3.common.util.Assertions.checkNotNull(this.playbackStatsTrackers.remove(str));
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime2 = (androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) androidx.media3.common.util.Assertions.checkNotNull(this.sessionStartEventTimes.remove(str));
        playbackStatsTracker.onFinished(eventTime, z, str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : androidx.media3.common.C.TIME_UNSET);
        androidx.media3.exoplayer.analytics.PlaybackStats playbackStatsBuild = playbackStatsTracker.build(true);
        this.finishedPlaybackStats = androidx.media3.exoplayer.analytics.PlaybackStats.merge(this.finishedPlaybackStats, playbackStatsBuild);
        androidx.media3.exoplayer.analytics.PlaybackStatsListener.Callback callback = this.callback;
        if (callback != null) {
            callback.onPlaybackStatsReady(eventTime2, playbackStatsBuild);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
        if (this.discontinuityFromSession == null) {
            this.discontinuityFromSession = this.sessionManager.getActiveSessionId();
            this.discontinuityFromPositionMs = positionInfo.positionMs;
        }
        this.discontinuityReason = i;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j) {
        this.droppedFrames = i;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        this.nonFatalException = iOException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionManagerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        this.bandwidthTimeMs = i;
        this.bandwidthBytes = j;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        if (mediaLoadData.trackType == 2 || mediaLoadData.trackType == 0) {
            this.videoFormat = mediaLoadData.trackFormat;
        } else if (mediaLoadData.trackType == 1) {
            this.audioFormat = mediaLoadData.trackFormat;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.VideoSize videoSize) {
        this.videoSize = videoSize;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        for (java.lang.String str : this.playbackStatsTrackers.keySet()) {
            android.util.Pair<androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime, java.lang.Boolean> pairFindBestEventTime = findBestEventTime(events, str);
            androidx.media3.exoplayer.analytics.PlaybackStatsListener.PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(str);
            boolean zHasEvent = hasEvent(events, str, 11);
            boolean zHasEvent2 = hasEvent(events, str, 1018);
            boolean zHasEvent3 = hasEvent(events, str, 1011);
            boolean zHasEvent4 = hasEvent(events, str, 1000);
            boolean zHasEvent5 = hasEvent(events, str, 10);
            boolean z = hasEvent(events, str, 1003) || hasEvent(events, str, 1024);
            boolean zHasEvent6 = hasEvent(events, str, 1006);
            boolean zHasEvent7 = hasEvent(events, str, 1004);
            playbackStatsTracker.onEvents(player, (androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) pairFindBestEventTime.first, ((java.lang.Boolean) pairFindBestEventTime.second).booleanValue(), str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : androidx.media3.common.C.TIME_UNSET, zHasEvent, zHasEvent2 ? this.droppedFrames : 0, zHasEvent3, zHasEvent4, zHasEvent5 ? player.getPlayerError() : null, z ? this.nonFatalException : null, zHasEvent6 ? this.bandwidthTimeMs : 0L, zHasEvent6 ? this.bandwidthBytes : 0L, zHasEvent7 ? this.videoFormat : null, zHasEvent7 ? this.audioFormat : null, hasEvent(events, str, 25) ? this.videoSize : null);
        }
        this.videoFormat = null;
        this.audioFormat = null;
        this.discontinuityFromSession = null;
        if (events.contains(1028)) {
            this.sessionManager.finishAllSessions(events.getEventTime(1028));
        }
    }

    private void maybeAddSessions(androidx.media3.exoplayer.analytics.AnalyticsListener.Events events) {
        for (int i = 0; i < events.size(); i++) {
            int i2 = events.get(i);
            androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime = events.getEventTime(i2);
            if (i2 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else if (i2 == 11) {
                this.sessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
            } else {
                this.sessionManager.updateSessions(eventTime);
            }
        }
    }

    private android.util.Pair<androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime, java.lang.Boolean> findBestEventTime(androidx.media3.exoplayer.analytics.AnalyticsListener.Events events, java.lang.String str) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime = null;
        boolean zBelongsToSession = false;
        for (int i = 0; i < events.size(); i++) {
            androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime2 = events.getEventTime(events.get(i));
            boolean zBelongsToSession2 = this.sessionManager.belongsToSession(eventTime2, str);
            if (eventTime == null || ((zBelongsToSession2 && !zBelongsToSession) || (zBelongsToSession2 == zBelongsToSession && eventTime2.realtimeMs > eventTime.realtimeMs))) {
                eventTime = eventTime2;
                zBelongsToSession = zBelongsToSession2;
            }
        }
        androidx.media3.common.util.Assertions.checkNotNull(eventTime);
        if (!zBelongsToSession && eventTime.mediaPeriodId != null && eventTime.mediaPeriodId.isAd()) {
            long adGroupTimeUs = eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period).getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                adGroupTimeUs = this.period.durationUs;
            }
            androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime3 = new androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime(eventTime.realtimeMs, eventTime.timeline, eventTime.windowIndex, new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(eventTime.mediaPeriodId.periodUid, eventTime.mediaPeriodId.windowSequenceNumber, eventTime.mediaPeriodId.adGroupIndex), androidx.media3.common.util.Util.usToMs(adGroupTimeUs + this.period.getPositionInWindowUs()), eventTime.timeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs);
            zBelongsToSession = this.sessionManager.belongsToSession(eventTime3, str);
            eventTime = eventTime3;
        }
        return android.util.Pair.create(eventTime, java.lang.Boolean.valueOf(zBelongsToSession));
    }

    private boolean hasEvent(androidx.media3.exoplayer.analytics.AnalyticsListener.Events events, java.lang.String str, int i) {
        return events.contains(i) && this.sessionManager.belongsToSession(events.getEventTime(i), str);
    }

    private static final class PlaybackStatsTracker {
        private long audioFormatBitrateTimeProduct;
        private final java.util.List<androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndFormat> audioFormatHistory;
        private long audioFormatTimeMs;
        private long audioUnderruns;
        private long bandwidthBytes;
        private long bandwidthTimeMs;
        private androidx.media3.common.Format currentAudioFormat;
        private float currentPlaybackSpeed;
        private int currentPlaybackState;
        private long currentPlaybackStateStartTimeMs;
        private androidx.media3.common.Format currentVideoFormat;
        private long droppedFrames;
        private int fatalErrorCount;
        private final java.util.List<androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndException> fatalErrorHistory;
        private long firstReportedTimeMs;
        private boolean hasBeenReady;
        private boolean hasEnded;
        private boolean hasFatalError;
        private long initialAudioFormatBitrate;
        private long initialVideoFormatBitrate;
        private int initialVideoFormatHeight;
        private final boolean isAd;
        private boolean isForeground;
        private boolean isInterruptedByAd;
        private boolean isJoinTimeInvalid;
        private boolean isSeeking;
        private final boolean keepHistory;
        private long lastAudioFormatStartTimeMs;
        private long lastRebufferStartTimeMs;
        private long lastVideoFormatStartTimeMs;
        private long maxRebufferTimeMs;
        private final java.util.List<long[]> mediaTimeHistory;
        private int nonFatalErrorCount;
        private final java.util.List<androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndException> nonFatalErrorHistory;
        private int pauseBufferCount;
        private int pauseCount;
        private final long[] playbackStateDurationsMs = new long[16];
        private final java.util.List<androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
        private int rebufferCount;
        private int seekCount;
        private boolean startedLoading;
        private long videoFormatBitrateTimeMs;
        private long videoFormatBitrateTimeProduct;
        private long videoFormatHeightTimeMs;
        private long videoFormatHeightTimeProduct;
        private final java.util.List<androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndFormat> videoFormatHistory;

        private static boolean isInvalidJoinTransition(int i, int i2) {
            return ((i != 1 && i != 2 && i != 14) || i2 == 1 || i2 == 2 || i2 == 14 || i2 == 3 || i2 == 4 || i2 == 9 || i2 == 11) ? false : true;
        }

        private static boolean isPausedState(int i) {
            return i == 4 || i == 7;
        }

        private static boolean isReadyState(int i) {
            return i == 3 || i == 4 || i == 9;
        }

        private static boolean isRebufferingState(int i) {
            return i == 6 || i == 7 || i == 10;
        }

        public PlaybackStatsTracker(boolean z, androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
            this.keepHistory = z;
            this.playbackStateHistory = z ? new java.util.ArrayList<>() : java.util.Collections.emptyList();
            this.mediaTimeHistory = z ? new java.util.ArrayList<>() : java.util.Collections.emptyList();
            this.videoFormatHistory = z ? new java.util.ArrayList<>() : java.util.Collections.emptyList();
            this.audioFormatHistory = z ? new java.util.ArrayList<>() : java.util.Collections.emptyList();
            this.fatalErrorHistory = z ? new java.util.ArrayList<>() : java.util.Collections.emptyList();
            this.nonFatalErrorHistory = z ? new java.util.ArrayList<>() : java.util.Collections.emptyList();
            boolean z2 = false;
            this.currentPlaybackState = 0;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            this.firstReportedTimeMs = androidx.media3.common.C.TIME_UNSET;
            this.maxRebufferTimeMs = androidx.media3.common.C.TIME_UNSET;
            if (eventTime.mediaPeriodId != null && eventTime.mediaPeriodId.isAd()) {
                z2 = true;
            }
            this.isAd = z2;
            this.initialAudioFormatBitrate = -1L;
            this.initialVideoFormatBitrate = -1L;
            this.initialVideoFormatHeight = -1;
            this.currentPlaybackSpeed = 1.0f;
        }

        public void onForeground() {
            this.isForeground = true;
        }

        public void onInterruptedByAd() {
            this.isInterruptedByAd = true;
            this.isSeeking = false;
        }

        public void onFinished(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z, long j) {
            int i = 11;
            if (this.currentPlaybackState != 11 && !z) {
                i = 15;
            }
            maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j);
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            updatePlaybackState(i, eventTime);
        }

        public void onEvents(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z, long j, boolean z2, int i, boolean z3, boolean z4, androidx.media3.common.PlaybackException playbackException, java.lang.Exception exc, long j2, long j3, androidx.media3.common.Format format, androidx.media3.common.Format format2, androidx.media3.common.VideoSize videoSize) {
            long j4 = androidx.media3.common.C.TIME_UNSET;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j);
                this.isSeeking = true;
            }
            if (player.getPlaybackState() != 2) {
                this.isSeeking = false;
            }
            int playbackState = player.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z2) {
                this.isInterruptedByAd = false;
            }
            if (playbackException != null) {
                this.hasFatalError = true;
                this.fatalErrorCount++;
                if (this.keepHistory) {
                    this.fatalErrorHistory.add(new androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndException(eventTime, playbackException));
                }
            } else if (player.getPlayerError() == null) {
                this.hasFatalError = false;
            }
            if (this.isForeground && !this.isInterruptedByAd) {
                androidx.media3.common.Tracks currentTracks = player.getCurrentTracks();
                if (!currentTracks.isTypeSelected(2)) {
                    maybeUpdateVideoFormat(eventTime, null);
                }
                if (!currentTracks.isTypeSelected(1)) {
                    maybeUpdateAudioFormat(eventTime, null);
                }
            }
            if (format != null) {
                maybeUpdateVideoFormat(eventTime, format);
            }
            if (format2 != null) {
                maybeUpdateAudioFormat(eventTime, format2);
            }
            androidx.media3.common.Format format3 = this.currentVideoFormat;
            if (format3 != null && format3.height == -1 && videoSize != null) {
                maybeUpdateVideoFormat(eventTime, this.currentVideoFormat.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build());
            }
            if (z4) {
                this.startedLoading = true;
            }
            if (z3) {
                this.audioUnderruns++;
            }
            this.droppedFrames += (long) i;
            this.bandwidthTimeMs += j2;
            this.bandwidthBytes += j3;
            if (exc != null) {
                this.nonFatalErrorCount++;
                if (this.keepHistory) {
                    this.nonFatalErrorHistory.add(new androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndException(eventTime, exc));
                }
            }
            int iResolveNewPlaybackState = resolveNewPlaybackState(player);
            float f = player.getPlaybackParameters().speed;
            if (this.currentPlaybackState != iResolveNewPlaybackState || this.currentPlaybackSpeed != f) {
                long j5 = eventTime.realtimeMs;
                if (z) {
                    j4 = eventTime.eventPlaybackPositionMs;
                }
                maybeUpdateMediaTimeHistory(j5, j4);
                maybeRecordVideoFormatTime(eventTime.realtimeMs);
                maybeRecordAudioFormatTime(eventTime.realtimeMs);
            }
            this.currentPlaybackSpeed = f;
            if (this.currentPlaybackState != iResolveNewPlaybackState) {
                updatePlaybackState(iResolveNewPlaybackState, eventTime);
            }
        }

        public androidx.media3.exoplayer.analytics.PlaybackStats build(boolean z) {
            long[] jArr;
            java.util.List<long[]> list;
            long[] jArr2 = this.playbackStateDurationsMs;
            java.util.List<long[]> list2 = this.mediaTimeHistory;
            if (z) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                long[] jArrCopyOf = java.util.Arrays.copyOf(this.playbackStateDurationsMs, 16);
                long jMax = java.lang.Math.max(0L, jElapsedRealtime - this.currentPlaybackStateStartTimeMs);
                int i = this.currentPlaybackState;
                jArrCopyOf[i] = jArrCopyOf[i] + jMax;
                maybeUpdateMaxRebufferTimeMs(jElapsedRealtime);
                maybeRecordVideoFormatTime(jElapsedRealtime);
                maybeRecordAudioFormatTime(jElapsedRealtime);
                java.util.ArrayList arrayList = new java.util.ArrayList(this.mediaTimeHistory);
                if (this.keepHistory && this.currentPlaybackState == 3) {
                    arrayList.add(guessMediaTimeBasedOnElapsedRealtime(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i2 = (this.isJoinTimeInvalid || !this.hasBeenReady) ? 1 : 0;
            long j = i2 != 0 ? androidx.media3.common.C.TIME_UNSET : jArr[2];
            int i3 = jArr[1] > 0 ? 1 : 0;
            java.util.List arrayList2 = z ? this.videoFormatHistory : new java.util.ArrayList(this.videoFormatHistory);
            java.util.List arrayList3 = z ? this.audioFormatHistory : new java.util.ArrayList(this.audioFormatHistory);
            java.util.List arrayList4 = z ? this.playbackStateHistory : new java.util.ArrayList(this.playbackStateHistory);
            long j2 = this.firstReportedTimeMs;
            boolean z2 = this.isForeground;
            int i4 = !this.hasBeenReady ? 1 : 0;
            boolean z3 = this.hasEnded;
            int i5 = i2 ^ 1;
            int i6 = this.pauseCount;
            int i7 = this.pauseBufferCount;
            int i8 = this.seekCount;
            int i9 = this.rebufferCount;
            long j3 = this.maxRebufferTimeMs;
            boolean z4 = this.isAd;
            long[] jArr3 = jArr;
            long j4 = this.videoFormatHeightTimeMs;
            long j5 = this.videoFormatHeightTimeProduct;
            long j6 = this.videoFormatBitrateTimeMs;
            long j7 = this.videoFormatBitrateTimeProduct;
            long j8 = this.audioFormatTimeMs;
            long j9 = this.audioFormatBitrateTimeProduct;
            int i10 = this.initialVideoFormatHeight;
            int i11 = i10 == -1 ? 0 : 1;
            long j10 = this.initialVideoFormatBitrate;
            int i12 = j10 == -1 ? 0 : 1;
            long j11 = this.initialAudioFormatBitrate;
            int i13 = j11 == -1 ? 0 : 1;
            long j12 = this.bandwidthTimeMs;
            long j13 = this.bandwidthBytes;
            long j14 = this.droppedFrames;
            long j15 = this.audioUnderruns;
            int i14 = this.fatalErrorCount;
            return new androidx.media3.exoplayer.analytics.PlaybackStats(1, jArr3, arrayList4, list, j2, z2 ? 1 : 0, i4, z3 ? 1 : 0, i3, j, i5, i6, i7, i8, i9, j3, z4 ? 1 : 0, arrayList2, arrayList3, j4, j5, j6, j7, j8, j9, i11, i12, i10, j10, i13, j11, j12, j13, j14, j15, i14 > 0 ? 1 : 0, i14, this.nonFatalErrorCount, this.fatalErrorHistory, this.nonFatalErrorHistory);
        }

        private void updatePlaybackState(int i, androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
            androidx.media3.common.util.Assertions.checkArgument(eventTime.realtimeMs >= this.currentPlaybackStateStartTimeMs);
            long j = eventTime.realtimeMs - this.currentPlaybackStateStartTimeMs;
            long[] jArr = this.playbackStateDurationsMs;
            int i2 = this.currentPlaybackState;
            jArr[i2] = jArr[i2] + j;
            if (this.firstReportedTimeMs == androidx.media3.common.C.TIME_UNSET) {
                this.firstReportedTimeMs = eventTime.realtimeMs;
            }
            this.isJoinTimeInvalid |= isInvalidJoinTransition(this.currentPlaybackState, i);
            this.hasBeenReady |= isReadyState(i);
            this.hasEnded |= i == 11;
            if (!isPausedState(this.currentPlaybackState) && isPausedState(i)) {
                this.pauseCount++;
            }
            if (i == 5) {
                this.seekCount++;
            }
            if (!isRebufferingState(this.currentPlaybackState) && isRebufferingState(i)) {
                this.rebufferCount++;
                this.lastRebufferStartTimeMs = eventTime.realtimeMs;
            }
            if (isRebufferingState(this.currentPlaybackState) && this.currentPlaybackState != 7 && i == 7) {
                this.pauseBufferCount++;
            }
            maybeUpdateMaxRebufferTimeMs(eventTime.realtimeMs);
            this.currentPlaybackState = i;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            if (this.keepHistory) {
                this.playbackStateHistory.add(new androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndPlaybackState(eventTime, this.currentPlaybackState));
            }
        }

        private int resolveNewPlaybackState(androidx.media3.common.Player player) {
            int playbackState = player.getPlaybackState();
            if (this.isSeeking && this.isForeground) {
                return 5;
            }
            if (this.hasFatalError) {
                return 13;
            }
            if (!this.isForeground) {
                return this.startedLoading ? 1 : 0;
            }
            if (this.isInterruptedByAd) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState != 2) {
                if (playbackState == 3) {
                    if (player.getPlayWhenReady()) {
                        return player.getPlaybackSuppressionReason() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (playbackState != 1 || this.currentPlaybackState == 0) {
                    return this.currentPlaybackState;
                }
                return 12;
            }
            int i = this.currentPlaybackState;
            if (i == 0 || i == 1 || i == 2 || i == 14) {
                return 2;
            }
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void maybeUpdateMaxRebufferTimeMs(long j) {
            if (isRebufferingState(this.currentPlaybackState)) {
                long j2 = j - this.lastRebufferStartTimeMs;
                long j3 = this.maxRebufferTimeMs;
                if (j3 == androidx.media3.common.C.TIME_UNSET || j2 > j3) {
                    this.maxRebufferTimeMs = j2;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j, long j2) {
            if (this.keepHistory) {
                if (this.currentPlaybackState != 3) {
                    if (j2 == androidx.media3.common.C.TIME_UNSET) {
                        return;
                    }
                    if (!this.mediaTimeHistory.isEmpty()) {
                        java.util.List<long[]> list = this.mediaTimeHistory;
                        long j3 = list.get(list.size() - 1)[1];
                        if (j3 != j2) {
                            this.mediaTimeHistory.add(new long[]{j, j3});
                        }
                    }
                }
                if (j2 != androidx.media3.common.C.TIME_UNSET) {
                    this.mediaTimeHistory.add(new long[]{j, j2});
                } else {
                    if (this.mediaTimeHistory.isEmpty()) {
                        return;
                    }
                    this.mediaTimeHistory.add(guessMediaTimeBasedOnElapsedRealtime(j));
                }
            }
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j) {
            java.util.List<long[]> list = this.mediaTimeHistory;
            long[] jArr = list.get(list.size() - 1);
            return new long[]{j, jArr[1] + ((long) ((j - jArr[0]) * this.currentPlaybackSpeed))};
        }

        private void maybeUpdateVideoFormat(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Format format) {
            if (androidx.media3.common.util.Util.areEqual(this.currentVideoFormat, format)) {
                return;
            }
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            if (format != null) {
                if (this.initialVideoFormatHeight == -1 && format.height != -1) {
                    this.initialVideoFormatHeight = format.height;
                }
                if (this.initialVideoFormatBitrate == -1 && format.bitrate != -1) {
                    this.initialVideoFormatBitrate = format.bitrate;
                }
            }
            this.currentVideoFormat = format;
            if (this.keepHistory) {
                this.videoFormatHistory.add(new androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndFormat(eventTime, this.currentVideoFormat));
            }
        }

        private void maybeUpdateAudioFormat(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Format format) {
            if (androidx.media3.common.util.Util.areEqual(this.currentAudioFormat, format)) {
                return;
            }
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            if (format != null && this.initialAudioFormatBitrate == -1 && format.bitrate != -1) {
                this.initialAudioFormatBitrate = format.bitrate;
            }
            this.currentAudioFormat = format;
            if (this.keepHistory) {
                this.audioFormatHistory.add(new androidx.media3.exoplayer.analytics.PlaybackStats.EventTimeAndFormat(eventTime, this.currentAudioFormat));
            }
        }

        private void maybeRecordVideoFormatTime(long j) {
            androidx.media3.common.Format format;
            if (this.currentPlaybackState == 3 && (format = this.currentVideoFormat) != null) {
                long j2 = (long) ((j - this.lastVideoFormatStartTimeMs) * this.currentPlaybackSpeed);
                if (format.height != -1) {
                    this.videoFormatHeightTimeMs += j2;
                    this.videoFormatHeightTimeProduct += ((long) this.currentVideoFormat.height) * j2;
                }
                if (this.currentVideoFormat.bitrate != -1) {
                    this.videoFormatBitrateTimeMs += j2;
                    this.videoFormatBitrateTimeProduct += j2 * ((long) this.currentVideoFormat.bitrate);
                }
            }
            this.lastVideoFormatStartTimeMs = j;
        }

        private void maybeRecordAudioFormatTime(long j) {
            androidx.media3.common.Format format;
            if (this.currentPlaybackState == 3 && (format = this.currentAudioFormat) != null && format.bitrate != -1) {
                long j2 = (long) ((j - this.lastAudioFormatStartTimeMs) * this.currentPlaybackSpeed);
                this.audioFormatTimeMs += j2;
                this.audioFormatBitrateTimeProduct += j2 * ((long) this.currentAudioFormat.bitrate);
            }
            this.lastAudioFormatStartTimeMs = j;
        }
    }
}
