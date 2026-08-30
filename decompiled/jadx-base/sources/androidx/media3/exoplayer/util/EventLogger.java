package androidx.media3.exoplayer.util;

/* JADX INFO: loaded from: classes.dex */
public class EventLogger implements androidx.media3.exoplayer.analytics.AnalyticsListener {
    private static final java.lang.String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final java.text.NumberFormat TIME_FORMAT;
    private final androidx.media3.common.Timeline.Period period;
    private final long startTimeMs;
    private final java.lang.String tag;
    private final androidx.media3.common.Timeline.Window window;

    private static java.lang.String getDiscontinuityReasonString(int i) {
        switch (i) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return "SKIP";
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return "?";
        }
    }

    private static java.lang.String getMediaItemTransitionReasonString(int i) {
        if (i == 0) {
            return "REPEAT";
        }
        if (i == 1) {
            return "AUTO";
        }
        if (i != 2) {
            return i != 3 ? "?" : "PLAYLIST_CHANGED";
        }
        return "SEEK";
    }

    private static java.lang.String getPlayWhenReadyChangeReasonString(int i) {
        if (i == 1) {
            return "USER_REQUEST";
        }
        if (i == 2) {
            return "AUDIO_FOCUS_LOSS";
        }
        if (i == 3) {
            return "AUDIO_BECOMING_NOISY";
        }
        if (i != 4) {
            return i != 5 ? "?" : "END_OF_MEDIA_ITEM";
        }
        return "REMOTE";
    }

    private static java.lang.String getPlaybackSuppressionReasonString(int i) {
        if (i != 0) {
            return i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return "NONE";
    }

    private static java.lang.String getRepeatModeString(int i) {
        if (i == 0) {
            return "OFF";
        }
        if (i != 1) {
            return i != 2 ? "?" : "ALL";
        }
        return "ONE";
    }

    private static java.lang.String getStateString(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "BUFFERING";
        }
        if (i != 3) {
            return i != 4 ? "?" : "ENDED";
        }
        return "READY";
    }

    private static java.lang.String getTimelineChangeReasonString(int i) {
        if (i != 0) {
            return i != 1 ? "?" : "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    private static java.lang.String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadCanceled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadCompleted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    static {
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance(java.util.Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger() {
        this(DEFAULT_TAG);
    }

    public EventLogger(java.lang.String str) {
        this.tag = str;
        this.window = new androidx.media3.common.Timeline.Window();
        this.period = new androidx.media3.common.Timeline.Period();
        this.startTimeMs = android.os.SystemClock.elapsedRealtime();
    }

    @java.lang.Deprecated
    public EventLogger(androidx.media3.exoplayer.trackselection.MappingTrackSelector mappingTrackSelector) {
        this(DEFAULT_TAG);
    }

    @java.lang.Deprecated
    public EventLogger(androidx.media3.exoplayer.trackselection.MappingTrackSelector mappingTrackSelector, java.lang.String str) {
        this(str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onIsLoadingChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "loading", java.lang.Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackStateChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "state", getStateString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i) {
        logd(eventTime, "playWhenReady", z + ", " + getPlayWhenReadyChangeReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackSuppressionReasonChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onIsPlayingChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "isPlaying", java.lang.Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onRepeatModeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "repeatMode", getRepeatModeString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onShuffleModeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "shuffleModeEnabled", java.lang.Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("reason=");
        sb.append(getDiscontinuityReasonString(i)).append(", PositionInfo:old [mediaItem=").append(positionInfo.mediaItemIndex).append(", period=").append(positionInfo.periodIndex).append(", pos=").append(positionInfo.positionMs);
        if (positionInfo.adGroupIndex != -1) {
            sb.append(", contentPos=").append(positionInfo.contentPositionMs).append(", adGroup=").append(positionInfo.adGroupIndex).append(", ad=").append(positionInfo.adIndexInAdGroup);
        }
        sb.append("], PositionInfo:new [mediaItem=").append(positionInfo2.mediaItemIndex).append(", period=").append(positionInfo2.periodIndex).append(", pos=").append(positionInfo2.positionMs);
        if (positionInfo2.adGroupIndex != -1) {
            sb.append(", contentPos=").append(positionInfo2.contentPositionMs).append(", adGroup=").append(positionInfo2.adGroupIndex).append(", ad=").append(positionInfo2.adIndexInAdGroup);
        }
        sb.append(com.ironsource.y8.i.e);
        logd(eventTime, "positionDiscontinuity", sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onTimelineChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        logd("timeline [" + getEventTimeString(eventTime) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i));
        for (int i2 = 0; i2 < java.lang.Math.min(periodCount, 3); i2++) {
            eventTime.timeline.getPeriod(i2, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + com.ironsource.y8.i.e);
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i3 = 0; i3 < java.lang.Math.min(windowCount, 3); i3++) {
            eventTime.timeline.getWindow(i3, this.window);
            logd("  window [" + getTimeString(this.window.getDurationMs()) + ", seekable=" + this.window.isSeekable + ", dynamic=" + this.window.isDynamic + com.ironsource.y8.i.e);
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd(com.ironsource.y8.i.e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onMediaItemTransition(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.MediaItem mediaItem, int i) {
        logd("mediaItem [" + getEventTimeString(eventTime) + ", reason=" + getMediaItemTransitionReasonString(i) + com.ironsource.y8.i.e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackException playbackException) {
        loge(eventTime, "playerFailed", playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onTracksChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Tracks tracks) {
        androidx.media3.common.Metadata metadata;
        logd("tracks [" + getEventTimeString(eventTime));
        com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> groups = tracks.getGroups();
        for (int i = 0; i < groups.size(); i++) {
            androidx.media3.common.Tracks.Group group = groups.get(i);
            logd("  group [");
            for (int i2 = 0; i2 < group.length; i2++) {
                logd("    " + getTrackStatusString(group.isTrackSelected(i2)) + " Track:" + i2 + ", " + androidx.media3.common.Format.toLogString(group.getTrackFormat(i2)) + ", supported=" + androidx.media3.common.util.Util.getFormatSupportString(group.getTrackSupport(i2)));
            }
            logd("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < groups.size(); i3++) {
            androidx.media3.common.Tracks.Group group2 = groups.get(i3);
            for (int i4 = 0; !z && i4 < group2.length; i4++) {
                if (group2.isTrackSelected(i4) && (metadata = group2.getTrackFormat(i4).metadata) != null && metadata.length() > 0) {
                    logd("  Metadata [");
                    printMetadata(metadata, "    ");
                    logd("  ]");
                    z = true;
                }
            }
        }
        logd(com.ironsource.y8.i.e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onMetadata(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Metadata metadata) {
        logd("metadata [" + getEventTimeString(eventTime));
        printMetadata(metadata, "  ");
        logd(com.ironsource.y8.i.e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioEnabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        logd(eventTime, "audioEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
        logd(eventTime, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioInputFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "audioInputFormat", androidx.media3.common.Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioUnderrun(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        loge(eventTime, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDecoderReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        logd(eventTime, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDisabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        logd(eventTime, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioSessionIdChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "audioSessionId", java.lang.Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioAttributesChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.AudioAttributes audioAttributes) {
        logd(eventTime, "audioAttributes", audioAttributes.contentType + "," + audioAttributes.flags + "," + audioAttributes.usage + "," + audioAttributes.allowedCapturePolicy);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onSkipSilenceEnabledChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "skipSilenceEnabled", java.lang.Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVolumeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, float f) {
        logd(eventTime, "volume", java.lang.Float.toString(f));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioTrackInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackInit", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioTrackReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackReleased", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoEnabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        logd(eventTime, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
        logd(eventTime, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "videoInputFormat", androidx.media3.common.Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j) {
        logd(eventTime, "droppedFrames", java.lang.Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDecoderReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        logd(eventTime, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDisabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        logd(eventTime, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onRenderedFirstFrame(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Object obj, long j) {
        logd(eventTime, "renderedFirstFrame", java.lang.String.valueOf(obj));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.VideoSize videoSize) {
        logd(eventTime, "videoSize", videoSize.width + ", " + videoSize.height);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, int i2) {
        logd(eventTime, "surfaceSize", i + ", " + i2);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onUpstreamDiscarded(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", androidx.media3.common.Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", androidx.media3.common.Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionAcquired(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "drmSessionAcquired", "state=" + i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionManagerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmKeysRestored(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmKeysRemoved(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmKeysLoaded(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    protected void logd(java.lang.String str) {
        androidx.media3.common.util.Log.d(this.tag, str);
    }

    protected void loge(java.lang.String str) {
        androidx.media3.common.util.Log.e(this.tag, str);
    }

    private void logd(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        logd(getEventString(eventTime, str, null, null));
    }

    private void logd(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2) {
        logd(getEventString(eventTime, str, str2, null));
    }

    private void loge(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.Throwable th) {
        loge(getEventString(eventTime, str, null, th));
    }

    private void loge(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        loge(getEventString(eventTime, str, str2, th));
    }

    private void printInternalError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(androidx.media3.common.Metadata metadata, java.lang.String str) {
        for (int i = 0; i < metadata.length(); i++) {
            logd(str + metadata.get(i));
        }
    }

    private java.lang.String getEventString(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        java.lang.String str3 = str + " [" + getEventTimeString(eventTime);
        if (th instanceof androidx.media3.common.PlaybackException) {
            str3 = str3 + ", errorCode=" + ((androidx.media3.common.PlaybackException) th).getErrorCodeName();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        java.lang.String throwableString = androidx.media3.common.util.Log.getThrowableString(th);
        if (!android.text.TextUtils.isEmpty(throwableString)) {
            str3 = str3 + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str3 + com.ironsource.y8.i.e;
    }

    private java.lang.String getEventTimeString(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        java.lang.String str = "window=" + eventTime.windowIndex;
        if (eventTime.mediaPeriodId != null) {
            str = str + ", period=" + eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid);
            if (eventTime.mediaPeriodId.isAd()) {
                str = (str + ", adGroup=" + eventTime.mediaPeriodId.adGroupIndex) + ", ad=" + eventTime.mediaPeriodId.adIndexInAdGroup;
            }
        }
        return "eventTime=" + getTimeString(eventTime.realtimeMs - this.startTimeMs) + ", mediaPos=" + getTimeString(eventTime.eventPlaybackPositionMs) + ", " + str;
    }

    private static java.lang.String getTimeString(long j) {
        return j == androidx.media3.common.C.TIME_UNSET ? "?" : TIME_FORMAT.format(j / 1000.0f);
    }

    private static java.lang.String getAudioTrackConfigString(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        return audioTrackConfig.encoding + "," + audioTrackConfig.channelConfig + "," + audioTrackConfig.sampleRate + "," + audioTrackConfig.tunneling + "," + audioTrackConfig.offload + "," + audioTrackConfig.bufferSize;
    }
}
