package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetricsListener implements androidx.media3.exoplayer.analytics.AnalyticsListener, androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener {
    private java.lang.String activeSessionId;
    private int audioUnderruns;
    private final android.content.Context context;
    private androidx.media3.common.Format currentAudioFormat;
    private androidx.media3.common.Format currentTextFormat;
    private androidx.media3.common.Format currentVideoFormat;
    private int discontinuityReason;
    private int droppedFrames;
    private boolean hasFatalError;
    private int ioErrorType;
    private boolean isSeeking;
    private android.media.metrics.PlaybackMetrics.Builder metricsBuilder;
    private androidx.media3.exoplayer.analytics.MediaMetricsListener.PendingFormatUpdate pendingAudioFormat;
    private androidx.media3.common.PlaybackException pendingPlayerError;
    private androidx.media3.exoplayer.analytics.MediaMetricsListener.PendingFormatUpdate pendingTextFormat;
    private androidx.media3.exoplayer.analytics.MediaMetricsListener.PendingFormatUpdate pendingVideoFormat;
    private final android.media.metrics.PlaybackSession playbackSession;
    private int playedFrames;
    private boolean reportedEventsForCurrentSession;
    private final androidx.media3.exoplayer.analytics.PlaybackSessionManager sessionManager;
    private final androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
    private final androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
    private final java.util.HashMap<java.lang.String, java.lang.Long> bandwidthBytes = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, java.lang.Long> bandwidthTimeMs = new java.util.HashMap<>();
    private final long startTimeMs = android.os.SystemClock.elapsedRealtime();
    private int currentPlaybackState = 0;
    private int currentNetworkType = 0;

    private static int getTrackChangeReason(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2) {
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
    }

    public static androidx.media3.exoplayer.analytics.MediaMetricsListener create(android.content.Context context) {
        android.media.metrics.MediaMetricsManager mediaMetricsManager = (android.media.metrics.MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new androidx.media3.exoplayer.analytics.MediaMetricsListener(context, mediaMetricsManager.createPlaybackSession());
    }

    private MediaMetricsListener(android.content.Context context, android.media.metrics.PlaybackSession playbackSession) {
        this.context = context.getApplicationContext();
        this.playbackSession = playbackSession;
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager defaultPlaybackSessionManager = new androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.setListener(this);
    }

    public android.media.metrics.LogSessionId getLogSessionId() {
        return this.playbackSession.getSessionId();
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        if (eventTime.mediaPeriodId == null || !eventTime.mediaPeriodId.isAd()) {
            finishCurrentSession();
            this.activeSessionId = str;
            this.metricsBuilder = new android.media.metrics.PlaybackMetrics.Builder().setPlayerName(androidx.media3.common.MediaLibraryInfo.TAG).setPlayerVersion(androidx.media3.common.MediaLibraryInfo.VERSION);
            maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, boolean z) {
        if ((eventTime.mediaPeriodId == null || !eventTime.mediaPeriodId.isAd()) && str.equals(this.activeSessionId)) {
            finishCurrentSession();
        }
        this.bandwidthTimeMs.remove(str);
        this.bandwidthBytes.remove(str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
        if (i == 1) {
            this.isSeeking = true;
        }
        this.discontinuityReason = i;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDisabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        this.droppedFrames += decoderCounters.droppedBufferCount;
        this.playedFrames += decoderCounters.renderedOutputBufferCount;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        if (eventTime.mediaPeriodId != null) {
            java.lang.String sessionForMediaPeriodId = this.sessionManager.getSessionForMediaPeriodId(eventTime.timeline, (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) androidx.media3.common.util.Assertions.checkNotNull(eventTime.mediaPeriodId));
            java.lang.Long l = this.bandwidthBytes.get(sessionForMediaPeriodId);
            java.lang.Long l2 = this.bandwidthTimeMs.get(sessionForMediaPeriodId);
            this.bandwidthBytes.put(sessionForMediaPeriodId, java.lang.Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.bandwidthTimeMs.put(sessionForMediaPeriodId, java.lang.Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        if (eventTime.mediaPeriodId == null) {
            return;
        }
        androidx.media3.exoplayer.analytics.MediaMetricsListener.PendingFormatUpdate pendingFormatUpdate = new androidx.media3.exoplayer.analytics.MediaMetricsListener.PendingFormatUpdate((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(mediaLoadData.trackFormat), mediaLoadData.trackSelectionReason, this.sessionManager.getSessionForMediaPeriodId(eventTime.timeline, (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) androidx.media3.common.util.Assertions.checkNotNull(eventTime.mediaPeriodId)));
        int i = mediaLoadData.trackType;
        if (i != 0) {
            if (i == 1) {
                this.pendingAudioFormat = pendingFormatUpdate;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.pendingTextFormat = pendingFormatUpdate;
                return;
            }
        }
        this.pendingVideoFormat = pendingFormatUpdate;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.VideoSize videoSize) {
        androidx.media3.exoplayer.analytics.MediaMetricsListener.PendingFormatUpdate pendingFormatUpdate = this.pendingVideoFormat;
        if (pendingFormatUpdate == null || pendingFormatUpdate.format.height != -1) {
            return;
        }
        this.pendingVideoFormat = new androidx.media3.exoplayer.analytics.MediaMetricsListener.PendingFormatUpdate(pendingFormatUpdate.format.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build(), pendingFormatUpdate.selectionReason, pendingFormatUpdate.sessionId);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        this.ioErrorType = mediaLoadData.dataType;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackException playbackException) {
        this.pendingPlayerError = playbackException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        maybeUpdateMetricsBuilderValues(player, events);
        maybeReportPlaybackError(jElapsedRealtime);
        maybeReportTrackChanges(player, events, jElapsedRealtime);
        maybeReportNetworkChange(jElapsedRealtime);
        maybeReportPlaybackStateChange(player, events, jElapsedRealtime);
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

    private void maybeUpdateMetricsBuilderValues(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener.Events events) {
        androidx.media3.common.DrmInitData drmInitData;
        if (events.contains(0)) {
            androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime = events.getEventTime(0);
            if (this.metricsBuilder != null) {
                maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
            }
        }
        if (events.contains(2) && this.metricsBuilder != null && (drmInitData = getDrmInitData(player.getCurrentTracks().getGroups())) != null) {
            ((android.media.metrics.PlaybackMetrics.Builder) androidx.media3.common.util.Util.castNonNull(this.metricsBuilder)).setDrmType(getDrmType(drmInitData));
        }
        if (events.contains(1011)) {
            this.audioUnderruns++;
        }
    }

    private void maybeReportPlaybackError(long j) {
        androidx.media3.common.PlaybackException playbackException = this.pendingPlayerError;
        if (playbackException == null) {
            return;
        }
        androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo errorInfo = getErrorInfo(playbackException, this.context, this.ioErrorType == 4);
        this.playbackSession.reportPlaybackErrorEvent(new android.media.metrics.PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j - this.startTimeMs).setErrorCode(errorInfo.errorCode).setSubErrorCode(errorInfo.subErrorCode).setException(playbackException).build());
        this.reportedEventsForCurrentSession = true;
        this.pendingPlayerError = null;
    }

    private void maybeReportTrackChanges(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener.Events events, long j) {
        if (events.contains(2)) {
            androidx.media3.common.Tracks currentTracks = player.getCurrentTracks();
            boolean zIsTypeSelected = currentTracks.isTypeSelected(2);
            boolean zIsTypeSelected2 = currentTracks.isTypeSelected(1);
            boolean zIsTypeSelected3 = currentTracks.isTypeSelected(3);
            if (zIsTypeSelected || zIsTypeSelected2 || zIsTypeSelected3) {
                if (!zIsTypeSelected) {
                    maybeUpdateVideoFormat(j, null, 0);
                }
                if (!zIsTypeSelected2) {
                    maybeUpdateAudioFormat(j, null, 0);
                }
                if (!zIsTypeSelected3) {
                    maybeUpdateTextFormat(j, null, 0);
                }
            }
        }
        if (canReportPendingFormatUpdate(this.pendingVideoFormat) && this.pendingVideoFormat.format.height != -1) {
            maybeUpdateVideoFormat(j, this.pendingVideoFormat.format, this.pendingVideoFormat.selectionReason);
            this.pendingVideoFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingAudioFormat)) {
            maybeUpdateAudioFormat(j, this.pendingAudioFormat.format, this.pendingAudioFormat.selectionReason);
            this.pendingAudioFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingTextFormat)) {
            maybeUpdateTextFormat(j, this.pendingTextFormat.format, this.pendingTextFormat.selectionReason);
            this.pendingTextFormat = null;
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    private boolean canReportPendingFormatUpdate(androidx.media3.exoplayer.analytics.MediaMetricsListener.PendingFormatUpdate pendingFormatUpdate) {
        return pendingFormatUpdate != null && pendingFormatUpdate.sessionId.equals(this.sessionManager.getActiveSessionId());
    }

    private void maybeReportNetworkChange(long j) {
        int networkType = getNetworkType(this.context);
        if (networkType != this.currentNetworkType) {
            this.currentNetworkType = networkType;
            this.playbackSession.reportNetworkEvent(new android.media.metrics.NetworkEvent.Builder().setNetworkType(networkType).setTimeSinceCreatedMillis(j - this.startTimeMs).build());
        }
    }

    private void maybeReportPlaybackStateChange(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener.Events events, long j) {
        if (player.getPlaybackState() != 2) {
            this.isSeeking = false;
        }
        if (player.getPlayerError() == null) {
            this.hasFatalError = false;
        } else if (events.contains(10)) {
            this.hasFatalError = true;
        }
        int iResolveNewPlaybackState = resolveNewPlaybackState(player);
        if (this.currentPlaybackState != iResolveNewPlaybackState) {
            this.currentPlaybackState = iResolveNewPlaybackState;
            this.reportedEventsForCurrentSession = true;
            this.playbackSession.reportPlaybackStateEvent(new android.media.metrics.PlaybackStateEvent.Builder().setState(this.currentPlaybackState).setTimeSinceCreatedMillis(j - this.startTimeMs).build());
        }
    }

    private int resolveNewPlaybackState(androidx.media3.common.Player player) {
        int playbackState = player.getPlaybackState();
        if (this.isSeeking) {
            return 5;
        }
        if (this.hasFatalError) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i = this.currentPlaybackState;
            if (i == 0 || i == 2 || i == 12) {
                return 2;
            }
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
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

    private void maybeUpdateVideoFormat(long j, androidx.media3.common.Format format, int i) {
        if (androidx.media3.common.util.Util.areEqual(this.currentVideoFormat, format)) {
            return;
        }
        if (this.currentVideoFormat == null && i == 0) {
            i = 1;
        }
        this.currentVideoFormat = format;
        reportTrackChangeEvent(1, j, format, i);
    }

    private void maybeUpdateAudioFormat(long j, androidx.media3.common.Format format, int i) {
        if (androidx.media3.common.util.Util.areEqual(this.currentAudioFormat, format)) {
            return;
        }
        if (this.currentAudioFormat == null && i == 0) {
            i = 1;
        }
        this.currentAudioFormat = format;
        reportTrackChangeEvent(0, j, format, i);
    }

    private void maybeUpdateTextFormat(long j, androidx.media3.common.Format format, int i) {
        if (androidx.media3.common.util.Util.areEqual(this.currentTextFormat, format)) {
            return;
        }
        if (this.currentTextFormat == null && i == 0) {
            i = 1;
        }
        this.currentTextFormat = format;
        reportTrackChangeEvent(2, j, format, i);
    }

    private void reportTrackChangeEvent(int i, long j, androidx.media3.common.Format format, int i2) {
        android.media.metrics.TrackChangeEvent.Builder timeSinceCreatedMillis = new android.media.metrics.TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.startTimeMs);
        if (format != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(getTrackChangeReason(i2));
            if (format.containerMimeType != null) {
                timeSinceCreatedMillis.setContainerMimeType(format.containerMimeType);
            }
            if (format.sampleMimeType != null) {
                timeSinceCreatedMillis.setSampleMimeType(format.sampleMimeType);
            }
            if (format.codecs != null) {
                timeSinceCreatedMillis.setCodecName(format.codecs);
            }
            if (format.bitrate != -1) {
                timeSinceCreatedMillis.setBitrate(format.bitrate);
            }
            if (format.width != -1) {
                timeSinceCreatedMillis.setWidth(format.width);
            }
            if (format.height != -1) {
                timeSinceCreatedMillis.setHeight(format.height);
            }
            if (format.channelCount != -1) {
                timeSinceCreatedMillis.setChannelCount(format.channelCount);
            }
            if (format.sampleRate != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(format.sampleRate);
            }
            if (format.language != null) {
                android.util.Pair<java.lang.String, java.lang.String> languageAndRegion = getLanguageAndRegion(format.language);
                timeSinceCreatedMillis.setLanguage((java.lang.String) languageAndRegion.first);
                if (languageAndRegion.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((java.lang.String) languageAndRegion.second);
                }
            }
            if (format.frameRate != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(format.frameRate);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.reportedEventsForCurrentSession = true;
        this.playbackSession.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"metricsBuilder"})
    private void maybeUpdateTimelineMetadata(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        int indexOfPeriod;
        android.media.metrics.PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (mediaPeriodId == null || (indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) == -1) {
            return;
        }
        timeline.getPeriod(indexOfPeriod, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        builder.setStreamType(getStreamType(this.window.mediaItem));
        if (this.window.durationUs != androidx.media3.common.C.TIME_UNSET && !this.window.isPlaceholder && !this.window.isDynamic && !this.window.isLive()) {
            builder.setMediaDurationMillis(this.window.getDurationMs());
        }
        builder.setPlaybackType(this.window.isLive() ? 2 : 1);
        this.reportedEventsForCurrentSession = true;
    }

    private void finishCurrentSession() {
        android.media.metrics.PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (builder != null && this.reportedEventsForCurrentSession) {
            builder.setAudioUnderrunCount(this.audioUnderruns);
            this.metricsBuilder.setVideoFramesDropped(this.droppedFrames);
            this.metricsBuilder.setVideoFramesPlayed(this.playedFrames);
            java.lang.Long l = this.bandwidthTimeMs.get(this.activeSessionId);
            this.metricsBuilder.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            java.lang.Long l2 = this.bandwidthBytes.get(this.activeSessionId);
            this.metricsBuilder.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.metricsBuilder.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.playbackSession.reportPlaybackMetrics(this.metricsBuilder.build());
        }
        this.metricsBuilder = null;
        this.activeSessionId = null;
        this.audioUnderruns = 0;
        this.droppedFrames = 0;
        this.playedFrames = 0;
        this.currentVideoFormat = null;
        this.currentAudioFormat = null;
        this.currentTextFormat = null;
        this.reportedEventsForCurrentSession = false;
    }

    private static android.util.Pair<java.lang.String, java.lang.String> getLanguageAndRegion(java.lang.String str) {
        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(str, "-");
        return android.util.Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
    }

    private static int getNetworkType(android.content.Context context) {
        switch (androidx.media3.common.util.NetworkTypeObserver.getInstance(context).getNetworkType()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int getStreamType(androidx.media3.common.MediaItem mediaItem) {
        if (mediaItem.localConfiguration == null) {
            return 0;
        }
        int iInferContentTypeForUriAndMimeType = androidx.media3.common.util.Util.inferContentTypeForUriAndMimeType(mediaItem.localConfiguration.uri, mediaItem.localConfiguration.mimeType);
        if (iInferContentTypeForUriAndMimeType == 0) {
            return 3;
        }
        if (iInferContentTypeForUriAndMimeType != 1) {
            return iInferContentTypeForUriAndMimeType != 2 ? 1 : 4;
        }
        return 5;
    }

    private static androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo getErrorInfo(androidx.media3.common.PlaybackException playbackException, android.content.Context context, boolean z) {
        int i;
        boolean z2;
        if (playbackException.errorCode == 1001) {
            return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(20, 0);
        }
        if (playbackException instanceof androidx.media3.exoplayer.ExoPlaybackException) {
            androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException = (androidx.media3.exoplayer.ExoPlaybackException) playbackException;
            z2 = exoPlaybackException.type == 1;
            i = exoPlaybackException.rendererFormatSupport;
        } else {
            i = 0;
            z2 = false;
        }
        java.lang.Throwable th = (java.lang.Throwable) androidx.media3.common.util.Assertions.checkNotNull(playbackException.getCause());
        if (!(th instanceof java.io.IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(35, 0);
            }
            if (z2 && i == 3) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(15, 0);
            }
            if (z2 && i == 2) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(23, 0);
            }
            if (th instanceof androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(13, androidx.media3.common.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(((androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException) th).diagnosticInfo));
            }
            if (th instanceof androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(14, ((androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException) th).errorCode);
            }
            if (th instanceof java.lang.OutOfMemoryError) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(14, 0);
            }
            if (th instanceof androidx.media3.exoplayer.audio.AudioSink.InitializationException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(17, ((androidx.media3.exoplayer.audio.AudioSink.InitializationException) th).audioTrackState);
            }
            if (th instanceof androidx.media3.exoplayer.audio.AudioSink.WriteException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(18, ((androidx.media3.exoplayer.audio.AudioSink.WriteException) th).errorCode);
            }
            if (th instanceof android.media.MediaCodec.CryptoException) {
                int errorCode = ((android.media.MediaCodec.CryptoException) th).getErrorCode();
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(getDrmErrorCode(errorCode), errorCode);
            }
            return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(22, 0);
        }
        if (th instanceof androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) {
            return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(5, ((androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) th).responseCode);
        }
        if ((th instanceof androidx.media3.datasource.HttpDataSource.InvalidContentTypeException) || (th instanceof androidx.media3.common.ParserException)) {
            return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof androidx.media3.datasource.HttpDataSource.HttpDataSourceException;
        if (z3 || (th instanceof androidx.media3.datasource.UdpDataSource.UdpDataSourceException)) {
            if (androidx.media3.common.util.NetworkTypeObserver.getInstance(context).getNetworkType() == 1) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(3, 0);
            }
            java.lang.Throwable cause = th.getCause();
            if (cause instanceof java.net.UnknownHostException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(6, 0);
            }
            if (cause instanceof java.net.SocketTimeoutException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(7, 0);
            }
            if (z3 && ((androidx.media3.datasource.HttpDataSource.HttpDataSourceException) th).type == 1) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(4, 0);
            }
            return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(21, 0);
        }
        if (th instanceof androidx.media3.exoplayer.drm.DrmSession.DrmSessionException) {
            java.lang.Throwable th2 = (java.lang.Throwable) androidx.media3.common.util.Assertions.checkNotNull(th.getCause());
            if (androidx.media3.common.util.Util.SDK_INT >= 21 && (th2 instanceof android.media.MediaDrm.MediaDrmStateException)) {
                int errorCodeFromPlatformDiagnosticsInfo = androidx.media3.common.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(((android.media.MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(getDrmErrorCode(errorCodeFromPlatformDiagnosticsInfo), errorCodeFromPlatformDiagnosticsInfo);
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 23 && (th2 instanceof android.media.MediaDrmResetException)) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(27, 0);
            }
            if (th2 instanceof android.media.NotProvisionedException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(24, 0);
            }
            if (th2 instanceof android.media.DeniedByServerException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(29, 0);
            }
            if (th2 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(23, 0);
            }
            if (th2 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(28, 0);
            }
            return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(30, 0);
        }
        if ((th instanceof androidx.media3.datasource.FileDataSource.FileDataSourceException) && (th.getCause() instanceof java.io.FileNotFoundException)) {
            java.lang.Throwable cause2 = ((java.lang.Throwable) androidx.media3.common.util.Assertions.checkNotNull(th.getCause())).getCause();
            if (androidx.media3.common.util.Util.SDK_INT >= 21 && (cause2 instanceof android.system.ErrnoException) && ((android.system.ErrnoException) cause2).errno == android.system.OsConstants.EACCES) {
                return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(32, 0);
            }
            return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(31, 0);
        }
        return new androidx.media3.exoplayer.analytics.MediaMetricsListener.ErrorInfo(9, 0);
    }

    private static androidx.media3.common.DrmInitData getDrmInitData(com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> immutableList) {
        androidx.media3.common.DrmInitData drmInitData;
        com.google.common.collect.UnmodifiableIterator<androidx.media3.common.Tracks.Group> it = immutableList.iterator();
        while (it.hasNext()) {
            androidx.media3.common.Tracks.Group next = it.next();
            for (int i = 0; i < next.length; i++) {
                if (next.isTrackSelected(i) && (drmInitData = next.getTrackFormat(i).drmInitData) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int getDrmType(androidx.media3.common.DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            java.util.UUID uuid = drmInitData.get(i).uuid;
            if (uuid.equals(androidx.media3.common.C.WIDEVINE_UUID)) {
                return 3;
            }
            if (uuid.equals(androidx.media3.common.C.PLAYREADY_UUID)) {
                return 2;
            }
            if (uuid.equals(androidx.media3.common.C.CLEARKEY_UUID)) {
                return 6;
            }
        }
        return 1;
    }

    private static int getDrmErrorCode(int i) {
        switch (androidx.media3.common.util.Util.getErrorCodeForMediaDrmErrorCode(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                return 25;
            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    private static final class ErrorInfo {
        public final int errorCode;
        public final int subErrorCode;

        public ErrorInfo(int i, int i2) {
            this.errorCode = i;
            this.subErrorCode = i2;
        }
    }

    private static final class PendingFormatUpdate {
        public final androidx.media3.common.Format format;
        public final int selectionReason;
        public final java.lang.String sessionId;

        public PendingFormatUpdate(androidx.media3.common.Format format, int i, java.lang.String str) {
            this.format = format;
            this.selectionReason = i;
            this.sessionId = str;
        }
    }
}
