package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public interface AnalyticsListener {
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;
    public static final int EVENT_AUDIO_CODEC_ERROR = 1029;
    public static final int EVENT_AUDIO_DECODER_INITIALIZED = 1008;
    public static final int EVENT_AUDIO_DECODER_RELEASED = 1012;
    public static final int EVENT_AUDIO_DISABLED = 1013;
    public static final int EVENT_AUDIO_ENABLED = 1007;
    public static final int EVENT_AUDIO_INPUT_FORMAT_CHANGED = 1009;
    public static final int EVENT_AUDIO_POSITION_ADVANCING = 1010;
    public static final int EVENT_AUDIO_SESSION_ID = 21;
    public static final int EVENT_AUDIO_SINK_ERROR = 1014;
    public static final int EVENT_AUDIO_TRACK_INITIALIZED = 1031;
    public static final int EVENT_AUDIO_TRACK_RELEASED = 1032;
    public static final int EVENT_AUDIO_UNDERRUN = 1011;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;
    public static final int EVENT_BANDWIDTH_ESTIMATE = 1006;
    public static final int EVENT_CUES = 27;
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;
    public static final int EVENT_DOWNSTREAM_FORMAT_CHANGED = 1004;
    public static final int EVENT_DRM_KEYS_LOADED = 1023;
    public static final int EVENT_DRM_KEYS_REMOVED = 1026;
    public static final int EVENT_DRM_KEYS_RESTORED = 1025;
    public static final int EVENT_DRM_SESSION_ACQUIRED = 1022;
    public static final int EVENT_DRM_SESSION_MANAGER_ERROR = 1024;
    public static final int EVENT_DRM_SESSION_RELEASED = 1027;
    public static final int EVENT_DROPPED_VIDEO_FRAMES = 1018;
    public static final int EVENT_IS_LOADING_CHANGED = 3;
    public static final int EVENT_IS_PLAYING_CHANGED = 7;
    public static final int EVENT_LOAD_CANCELED = 1002;
    public static final int EVENT_LOAD_COMPLETED = 1001;
    public static final int EVENT_LOAD_ERROR = 1003;
    public static final int EVENT_LOAD_STARTED = 1000;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;
    public static final int EVENT_METADATA = 28;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;
    public static final int EVENT_PLAYER_ERROR = 10;
    public static final int EVENT_PLAYER_RELEASED = 1028;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 15;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 5;
    public static final int EVENT_POSITION_DISCONTINUITY = 11;
    public static final int EVENT_RENDERED_FIRST_FRAME = 26;
    public static final int EVENT_REPEAT_MODE_CHANGED = 8;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 16;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 17;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 9;
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 23;
    public static final int EVENT_SURFACE_SIZE_CHANGED = 24;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int EVENT_TRACK_SELECTION_PARAMETERS_CHANGED = 19;
    public static final int EVENT_UPSTREAM_DISCARDED = 1005;
    public static final int EVENT_VIDEO_CODEC_ERROR = 1030;
    public static final int EVENT_VIDEO_DECODER_INITIALIZED = 1016;
    public static final int EVENT_VIDEO_DECODER_RELEASED = 1019;
    public static final int EVENT_VIDEO_DISABLED = 1020;
    public static final int EVENT_VIDEO_ENABLED = 1015;
    public static final int EVENT_VIDEO_FRAME_PROCESSING_OFFSET = 1021;
    public static final int EVENT_VIDEO_INPUT_FORMAT_CHANGED = 1017;
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;
    public static final int EVENT_VOLUME_CHANGED = 22;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    default void onAudioAttributesChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.AudioAttributes audioAttributes) {
    }

    default void onAudioCodecError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
    }

    @java.lang.Deprecated
    default void onAudioDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j) {
    }

    default void onAudioDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
    }

    default void onAudioDecoderReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
    }

    default void onAudioDisabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onAudioEnabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onAudioInputFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onAudioPositionAdvancing(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j) {
    }

    default void onAudioSessionIdChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
    }

    default void onAudioSinkError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
    }

    default void onAudioTrackInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioTrackReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioUnderrun(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    default void onAvailableCommandsChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Player.Commands commands) {
    }

    default void onBandwidthEstimate(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    default void onCues(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.text.CueGroup cueGroup) {
    }

    @java.lang.Deprecated
    default void onCues(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.util.List<androidx.media3.common.text.Cue> list) {
    }

    default void onDeviceInfoChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.DeviceInfo deviceInfo) {
    }

    default void onDeviceVolumeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, boolean z) {
    }

    default void onDownstreamFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    default void onDrmKeysLoaded(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
    }

    default void onDrmKeysRemoved(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
    }

    default void onDrmKeysRestored(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
    }

    @java.lang.Deprecated
    default void onDrmSessionAcquired(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
    }

    default void onDrmSessionAcquired(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
    }

    default void onDrmSessionManagerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
    }

    default void onDrmSessionReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
    }

    default void onDroppedVideoFrames(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j) {
    }

    default void onEvents(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener.Events events) {
    }

    default void onIsLoadingChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
    }

    default void onIsPlayingChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
    }

    default void onLoadCanceled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    default void onLoadError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
    }

    default void onLoadStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    @java.lang.Deprecated
    default void onLoadingChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
    }

    default void onMaxSeekToPreviousPositionChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j) {
    }

    default void onMediaItemTransition(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.MediaItem mediaItem, int i) {
    }

    default void onMediaMetadataChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.MediaMetadata mediaMetadata) {
    }

    default void onMetadata(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Metadata metadata) {
    }

    default void onPlayWhenReadyChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    default void onPlaybackParametersChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackParameters playbackParameters) {
    }

    default void onPlaybackStateChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
    }

    default void onPlaybackSuppressionReasonChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
    }

    default void onPlayerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackException playbackException) {
    }

    default void onPlayerErrorChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackException playbackException) {
    }

    default void onPlayerReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
    }

    @java.lang.Deprecated
    default void onPlayerStateChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    default void onPlaylistMetadataChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.MediaMetadata mediaMetadata) {
    }

    @java.lang.Deprecated
    default void onPositionDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
    }

    default void onPositionDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
    }

    default void onRenderedFirstFrame(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Object obj, long j) {
    }

    default void onRepeatModeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
    }

    default void onSeekBackIncrementChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j) {
    }

    default void onSeekForwardIncrementChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j) {
    }

    @java.lang.Deprecated
    default void onSeekStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
    }

    default void onShuffleModeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
    }

    default void onSkipSilenceEnabledChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
    }

    default void onSurfaceSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, int i2) {
    }

    default void onTimelineChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
    }

    default void onTrackSelectionParametersChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
    }

    default void onTracksChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Tracks tracks) {
    }

    default void onUpstreamDiscarded(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    default void onVideoCodecError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
    }

    @java.lang.Deprecated
    default void onVideoDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j) {
    }

    default void onVideoDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
    }

    default void onVideoDecoderReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
    }

    default void onVideoDisabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onVideoFrameProcessingOffset(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j, int i) {
    }

    default void onVideoInputFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @java.lang.Deprecated
    default void onVideoSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
    }

    default void onVideoSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.VideoSize videoSize) {
    }

    default void onVolumeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, float f) {
    }

    public static final class Events {
        private final android.util.SparseArray<androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime> eventTimes;
        private final androidx.media3.common.FlagSet flags;

        public Events(androidx.media3.common.FlagSet flagSet, android.util.SparseArray<androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime> sparseArray) {
            this.flags = flagSet;
            android.util.SparseArray<androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime> sparseArray2 = new android.util.SparseArray<>(flagSet.size());
            for (int i = 0; i < flagSet.size(); i++) {
                int i2 = flagSet.get(i);
                sparseArray2.append(i2, (androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) androidx.media3.common.util.Assertions.checkNotNull(sparseArray.get(i2)));
            }
            this.eventTimes = sparseArray2;
        }

        public androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime getEventTime(int i) {
            return (androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) androidx.media3.common.util.Assertions.checkNotNull(this.eventTimes.get(i));
        }

        public boolean contains(int i) {
            return this.flags.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.flags.containsAny(iArr);
        }

        public int size() {
            return this.flags.size();
        }

        public int get(int i) {
            return this.flags.get(i);
        }
    }

    public static final class EventTime {
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final androidx.media3.common.Timeline currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final androidx.media3.common.Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long j, androidx.media3.common.Timeline timeline, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j2, androidx.media3.common.Timeline timeline2, int i2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2, long j3, long j4) {
            this.realtimeMs = j;
            this.timeline = timeline;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
            this.eventPlaybackPositionMs = j2;
            this.currentTimeline = timeline2;
            this.currentWindowIndex = i2;
            this.currentMediaPeriodId = mediaPeriodId2;
            this.currentPlaybackPositionMs = j3;
            this.totalBufferedDurationMs = j4;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime = (androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) obj;
            return this.realtimeMs == eventTime.realtimeMs && this.windowIndex == eventTime.windowIndex && this.eventPlaybackPositionMs == eventTime.eventPlaybackPositionMs && this.currentWindowIndex == eventTime.currentWindowIndex && this.currentPlaybackPositionMs == eventTime.currentPlaybackPositionMs && this.totalBufferedDurationMs == eventTime.totalBufferedDurationMs && com.google.common.base.Objects.equal(this.timeline, eventTime.timeline) && com.google.common.base.Objects.equal(this.mediaPeriodId, eventTime.mediaPeriodId) && com.google.common.base.Objects.equal(this.currentTimeline, eventTime.currentTimeline) && com.google.common.base.Objects.equal(this.currentMediaPeriodId, eventTime.currentMediaPeriodId);
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(java.lang.Long.valueOf(this.realtimeMs), this.timeline, java.lang.Integer.valueOf(this.windowIndex), this.mediaPeriodId, java.lang.Long.valueOf(this.eventPlaybackPositionMs), this.currentTimeline, java.lang.Integer.valueOf(this.currentWindowIndex), this.currentMediaPeriodId, java.lang.Long.valueOf(this.currentPlaybackPositionMs), java.lang.Long.valueOf(this.totalBufferedDurationMs));
        }
    }
}
