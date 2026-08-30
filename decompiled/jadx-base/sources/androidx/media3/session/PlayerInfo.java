package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class PlayerInfo {
    public static final int DISCONTINUITY_REASON_DEFAULT = 0;
    public static final int MEDIA_ITEM_TRANSITION_REASON_DEFAULT = 0;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_DEFAULT = 1;
    public static final int TIMELINE_CHANGE_REASON_DEFAULT = 0;
    public final androidx.media3.common.AudioAttributes audioAttributes;
    public final androidx.media3.common.text.CueGroup cueGroup;
    public final androidx.media3.common.Tracks currentTracks;
    public final androidx.media3.common.DeviceInfo deviceInfo;
    public final boolean deviceMuted;
    public final int deviceVolume;
    public final int discontinuityReason;
    public final boolean isLoading;
    public final boolean isPlaying;
    public final long maxSeekToPreviousPositionMs;
    public final int mediaItemTransitionReason;
    public final androidx.media3.common.MediaMetadata mediaMetadata;
    public final androidx.media3.common.Player.PositionInfo newPositionInfo;
    public final androidx.media3.common.Player.PositionInfo oldPositionInfo;
    public final boolean playWhenReady;
    public final int playWhenReadyChangeReason;
    public final androidx.media3.common.PlaybackParameters playbackParameters;
    public final int playbackState;
    public final int playbackSuppressionReason;
    public final androidx.media3.common.PlaybackException playerError;
    public final androidx.media3.common.MediaMetadata playlistMetadata;
    public final int repeatMode;
    public final long seekBackIncrementMs;
    public final long seekForwardIncrementMs;
    public final androidx.media3.session.SessionPositionInfo sessionPositionInfo;
    public final boolean shuffleModeEnabled;
    public final androidx.media3.common.Timeline timeline;
    public final int timelineChangeReason;
    public final androidx.media3.common.TrackSelectionParameters trackSelectionParameters;
    public final androidx.media3.common.VideoSize videoSize;
    public final float volume;
    public static final androidx.media3.session.PlayerInfo DEFAULT = new androidx.media3.session.PlayerInfo(null, 0, androidx.media3.session.SessionPositionInfo.DEFAULT, androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO, androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO, 0, androidx.media3.common.PlaybackParameters.DEFAULT, 0, false, androidx.media3.common.VideoSize.UNKNOWN, androidx.media3.common.Timeline.EMPTY, 0, androidx.media3.common.MediaMetadata.EMPTY, 1.0f, androidx.media3.common.AudioAttributes.DEFAULT, androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO, androidx.media3.common.DeviceInfo.UNKNOWN, 0, false, false, 1, 0, 1, false, false, androidx.media3.common.MediaMetadata.EMPTY, 5000, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, androidx.media3.common.Tracks.EMPTY, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT);
    private static final java.lang.String FIELD_PLAYBACK_PARAMETERS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_REPEAT_MODE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_SHUFFLE_MODE_ENABLED = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_TIMELINE = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_VIDEO_SIZE = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String FIELD_PLAYLIST_METADATA = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String FIELD_VOLUME = androidx.media3.common.util.Util.intToStringMaxRadix(7);
    private static final java.lang.String FIELD_AUDIO_ATTRIBUTES = androidx.media3.common.util.Util.intToStringMaxRadix(8);
    private static final java.lang.String FIELD_DEVICE_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    private static final java.lang.String FIELD_DEVICE_VOLUME = androidx.media3.common.util.Util.intToStringMaxRadix(10);
    private static final java.lang.String FIELD_DEVICE_MUTED = androidx.media3.common.util.Util.intToStringMaxRadix(11);
    private static final java.lang.String FIELD_PLAY_WHEN_READY = androidx.media3.common.util.Util.intToStringMaxRadix(12);
    private static final java.lang.String FIELD_PLAY_WHEN_READY_CHANGE_REASON = androidx.media3.common.util.Util.intToStringMaxRadix(13);
    private static final java.lang.String FIELD_PLAYBACK_SUPPRESSION_REASON = androidx.media3.common.util.Util.intToStringMaxRadix(14);
    private static final java.lang.String FIELD_PLAYBACK_STATE = androidx.media3.common.util.Util.intToStringMaxRadix(15);
    private static final java.lang.String FIELD_IS_PLAYING = androidx.media3.common.util.Util.intToStringMaxRadix(16);
    private static final java.lang.String FIELD_IS_LOADING = androidx.media3.common.util.Util.intToStringMaxRadix(17);
    private static final java.lang.String FIELD_PLAYBACK_ERROR = androidx.media3.common.util.Util.intToStringMaxRadix(18);
    static final java.lang.String FIELD_SESSION_POSITION_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(19);
    private static final java.lang.String FIELD_MEDIA_ITEM_TRANSITION_REASON = androidx.media3.common.util.Util.intToStringMaxRadix(20);
    static final java.lang.String FIELD_OLD_POSITION_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(21);
    static final java.lang.String FIELD_NEW_POSITION_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(22);
    private static final java.lang.String FIELD_DISCONTINUITY_REASON = androidx.media3.common.util.Util.intToStringMaxRadix(23);
    private static final java.lang.String FIELD_CUE_GROUP = androidx.media3.common.util.Util.intToStringMaxRadix(24);
    private static final java.lang.String FIELD_MEDIA_METADATA = androidx.media3.common.util.Util.intToStringMaxRadix(25);
    static final java.lang.String FIELD_SEEK_BACK_INCREMENT_MS = androidx.media3.common.util.Util.intToStringMaxRadix(26);
    static final java.lang.String FIELD_SEEK_FORWARD_INCREMENT_MS = androidx.media3.common.util.Util.intToStringMaxRadix(27);
    static final java.lang.String FIELD_MAX_SEEK_TO_PREVIOUS_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(28);
    private static final java.lang.String FIELD_TRACK_SELECTION_PARAMETERS = androidx.media3.common.util.Util.intToStringMaxRadix(29);
    private static final java.lang.String FIELD_CURRENT_TRACKS = androidx.media3.common.util.Util.intToStringMaxRadix(30);
    private static final java.lang.String FIELD_TIMELINE_CHANGE_REASON = androidx.media3.common.util.Util.intToStringMaxRadix(31);
    private static final java.lang.String FIELD_IN_PROCESS_BINDER = androidx.media3.common.util.Util.intToStringMaxRadix(32);

    private boolean isPlaying(int i, boolean z, int i2) {
        return i == 3 && z && i2 == 0;
    }

    public static class BundlingExclusions {
        public final boolean areCurrentTracksExcluded;
        public final boolean isTimelineExcluded;
        public static final androidx.media3.session.PlayerInfo.BundlingExclusions NONE = new androidx.media3.session.PlayerInfo.BundlingExclusions(false, false);
        private static final java.lang.String FIELD_IS_TIMELINE_EXCLUDED = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_ARE_CURRENT_TRACKS_EXCLUDED = androidx.media3.common.util.Util.intToStringMaxRadix(1);

        public BundlingExclusions(boolean z, boolean z2) {
            this.isTimelineExcluded = z;
            this.areCurrentTracksExcluded = z2;
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean(FIELD_IS_TIMELINE_EXCLUDED, this.isTimelineExcluded);
            bundle.putBoolean(FIELD_ARE_CURRENT_TRACKS_EXCLUDED, this.areCurrentTracksExcluded);
            return bundle;
        }

        public static androidx.media3.session.PlayerInfo.BundlingExclusions fromBundle(android.os.Bundle bundle) {
            return new androidx.media3.session.PlayerInfo.BundlingExclusions(bundle.getBoolean(FIELD_IS_TIMELINE_EXCLUDED, false), bundle.getBoolean(FIELD_ARE_CURRENT_TRACKS_EXCLUDED, false));
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.session.PlayerInfo.BundlingExclusions)) {
                return false;
            }
            androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions = (androidx.media3.session.PlayerInfo.BundlingExclusions) obj;
            return this.isTimelineExcluded == bundlingExclusions.isTimelineExcluded && this.areCurrentTracksExcluded == bundlingExclusions.areCurrentTracksExcluded;
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(java.lang.Boolean.valueOf(this.isTimelineExcluded), java.lang.Boolean.valueOf(this.areCurrentTracksExcluded));
        }
    }

    public static class Builder {
        private androidx.media3.common.AudioAttributes audioAttributes;
        private androidx.media3.common.text.CueGroup cueGroup;
        private androidx.media3.common.Tracks currentTracks;
        private androidx.media3.common.DeviceInfo deviceInfo;
        private boolean deviceMuted;
        private int deviceVolume;
        private int discontinuityReason;
        private boolean isLoading;
        private boolean isPlaying;
        private long maxSeekToPreviousPositionMs;
        private int mediaItemTransitionReason;
        private androidx.media3.common.MediaMetadata mediaMetadata;
        private androidx.media3.common.Player.PositionInfo newPositionInfo;
        private androidx.media3.common.Player.PositionInfo oldPositionInfo;
        private boolean playWhenReady;
        private int playWhenReadyChangeReason;
        private androidx.media3.common.PlaybackParameters playbackParameters;
        private int playbackState;
        private int playbackSuppressionReason;
        private androidx.media3.common.PlaybackException playerError;
        private androidx.media3.common.MediaMetadata playlistMetadata;
        private int repeatMode;
        private long seekBackIncrementMs;
        private long seekForwardIncrementMs;
        private androidx.media3.session.SessionPositionInfo sessionPositionInfo;
        private boolean shuffleModeEnabled;
        private androidx.media3.common.Timeline timeline;
        private int timelineChangeReason;
        private androidx.media3.common.TrackSelectionParameters trackSelectionParameters;
        private androidx.media3.common.VideoSize videoSize;
        private float volume;

        public Builder(androidx.media3.session.PlayerInfo playerInfo) {
            this.playerError = playerInfo.playerError;
            this.mediaItemTransitionReason = playerInfo.mediaItemTransitionReason;
            this.sessionPositionInfo = playerInfo.sessionPositionInfo;
            this.oldPositionInfo = playerInfo.oldPositionInfo;
            this.newPositionInfo = playerInfo.newPositionInfo;
            this.discontinuityReason = playerInfo.discontinuityReason;
            this.playbackParameters = playerInfo.playbackParameters;
            this.repeatMode = playerInfo.repeatMode;
            this.shuffleModeEnabled = playerInfo.shuffleModeEnabled;
            this.timeline = playerInfo.timeline;
            this.timelineChangeReason = playerInfo.timelineChangeReason;
            this.videoSize = playerInfo.videoSize;
            this.playlistMetadata = playerInfo.playlistMetadata;
            this.volume = playerInfo.volume;
            this.audioAttributes = playerInfo.audioAttributes;
            this.cueGroup = playerInfo.cueGroup;
            this.deviceInfo = playerInfo.deviceInfo;
            this.deviceVolume = playerInfo.deviceVolume;
            this.deviceMuted = playerInfo.deviceMuted;
            this.playWhenReady = playerInfo.playWhenReady;
            this.playWhenReadyChangeReason = playerInfo.playWhenReadyChangeReason;
            this.isPlaying = playerInfo.isPlaying;
            this.isLoading = playerInfo.isLoading;
            this.playbackSuppressionReason = playerInfo.playbackSuppressionReason;
            this.playbackState = playerInfo.playbackState;
            this.mediaMetadata = playerInfo.mediaMetadata;
            this.seekBackIncrementMs = playerInfo.seekBackIncrementMs;
            this.seekForwardIncrementMs = playerInfo.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = playerInfo.maxSeekToPreviousPositionMs;
            this.currentTracks = playerInfo.currentTracks;
            this.trackSelectionParameters = playerInfo.trackSelectionParameters;
        }

        public androidx.media3.session.PlayerInfo.Builder setPlayerError(androidx.media3.common.PlaybackException playbackException) {
            this.playerError = playbackException;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setMediaItemTransitionReason(int i) {
            this.mediaItemTransitionReason = i;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setSessionPositionInfo(androidx.media3.session.SessionPositionInfo sessionPositionInfo) {
            this.sessionPositionInfo = sessionPositionInfo;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setOldPositionInfo(androidx.media3.common.Player.PositionInfo positionInfo) {
            this.oldPositionInfo = positionInfo;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setNewPositionInfo(androidx.media3.common.Player.PositionInfo positionInfo) {
            this.newPositionInfo = positionInfo;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setDiscontinuityReason(int i) {
            this.discontinuityReason = i;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
            this.playbackParameters = playbackParameters;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setRepeatMode(int i) {
            this.repeatMode = i;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setShuffleModeEnabled(boolean z) {
            this.shuffleModeEnabled = z;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setTimeline(androidx.media3.common.Timeline timeline) {
            this.timeline = timeline;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setTimelineChangeReason(int i) {
            this.timelineChangeReason = i;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setVideoSize(androidx.media3.common.VideoSize videoSize) {
            this.videoSize = videoSize;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.playlistMetadata = mediaMetadata;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setVolume(float f) {
            this.volume = f;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setCues(androidx.media3.common.text.CueGroup cueGroup) {
            this.cueGroup = cueGroup;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setDeviceInfo(androidx.media3.common.DeviceInfo deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setDeviceVolume(int i) {
            this.deviceVolume = i;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setDeviceMuted(boolean z) {
            this.deviceMuted = z;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setPlayWhenReady(boolean z) {
            this.playWhenReady = z;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setPlayWhenReadyChangeReason(int i) {
            this.playWhenReadyChangeReason = i;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setIsPlaying(boolean z) {
            this.isPlaying = z;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setIsLoading(boolean z) {
            this.isLoading = z;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setPlaybackSuppressionReason(int i) {
            this.playbackSuppressionReason = i;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setPlaybackState(int i) {
            this.playbackState = i;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setMediaMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setSeekBackIncrement(long j) {
            this.seekBackIncrementMs = j;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setSeekForwardIncrement(long j) {
            this.seekForwardIncrementMs = j;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setMaxSeekToPreviousPositionMs(long j) {
            this.maxSeekToPreviousPositionMs = j;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setCurrentTracks(androidx.media3.common.Tracks tracks) {
            this.currentTracks = tracks;
            return this;
        }

        public androidx.media3.session.PlayerInfo.Builder setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.trackSelectionParameters = trackSelectionParameters;
            return this;
        }

        public androidx.media3.session.PlayerInfo build() {
            androidx.media3.common.util.Assertions.checkState(this.timeline.isEmpty() || this.sessionPositionInfo.positionInfo.mediaItemIndex < this.timeline.getWindowCount());
            return new androidx.media3.session.PlayerInfo(this.playerError, this.mediaItemTransitionReason, this.sessionPositionInfo, this.oldPositionInfo, this.newPositionInfo, this.discontinuityReason, this.playbackParameters, this.repeatMode, this.shuffleModeEnabled, this.videoSize, this.timeline, this.timelineChangeReason, this.playlistMetadata, this.volume, this.audioAttributes, this.cueGroup, this.deviceInfo, this.deviceVolume, this.deviceMuted, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackState, this.isPlaying, this.isLoading, this.mediaMetadata, this.seekBackIncrementMs, this.seekForwardIncrementMs, this.maxSeekToPreviousPositionMs, this.currentTracks, this.trackSelectionParameters);
        }
    }

    public androidx.media3.session.PlayerInfo copyWithPlayWhenReady(boolean z, int i, int i2) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setPlayWhenReady(z).setPlayWhenReadyChangeReason(i).setPlaybackSuppressionReason(i2).setIsPlaying(isPlaying(this.playbackState, z, i2)).build();
    }

    public androidx.media3.session.PlayerInfo copyWithMediaItemTransitionReason(int i) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setMediaItemTransitionReason(i).build();
    }

    public androidx.media3.session.PlayerInfo copyWithPlayerError(androidx.media3.common.PlaybackException playbackException) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setPlayerError(playbackException).build();
    }

    public androidx.media3.session.PlayerInfo copyWithPlaybackState(int i, androidx.media3.common.PlaybackException playbackException) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setPlayerError(playbackException).setPlaybackState(i).setIsPlaying(isPlaying(i, this.playWhenReady, this.playbackSuppressionReason)).build();
    }

    public androidx.media3.session.PlayerInfo copyWithIsPlaying(boolean z) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setIsPlaying(z).build();
    }

    public androidx.media3.session.PlayerInfo copyWithIsLoading(boolean z) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setIsLoading(z).build();
    }

    public androidx.media3.session.PlayerInfo copyWithPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setPlaybackParameters(playbackParameters).build();
    }

    public androidx.media3.session.PlayerInfo copyWithPositionInfos(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setOldPositionInfo(positionInfo).setNewPositionInfo(positionInfo2).setDiscontinuityReason(i).build();
    }

    public androidx.media3.session.PlayerInfo copyWithSessionPositionInfo(androidx.media3.session.SessionPositionInfo sessionPositionInfo) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setSessionPositionInfo(sessionPositionInfo).build();
    }

    public androidx.media3.session.PlayerInfo copyWithTimeline(androidx.media3.common.Timeline timeline) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setTimeline(timeline).build();
    }

    public androidx.media3.session.PlayerInfo copyWithTimelineAndSessionPositionInfo(androidx.media3.common.Timeline timeline, androidx.media3.session.SessionPositionInfo sessionPositionInfo, int i) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setTimeline(timeline).setSessionPositionInfo(sessionPositionInfo).setTimelineChangeReason(i).build();
    }

    public androidx.media3.session.PlayerInfo copyWithTimelineAndMediaItemIndex(androidx.media3.common.Timeline timeline, int i, int i2) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setTimeline(timeline).setTimelineChangeReason(i2).setSessionPositionInfo(new androidx.media3.session.SessionPositionInfo(new androidx.media3.common.Player.PositionInfo(this.sessionPositionInfo.positionInfo.windowUid, i, this.sessionPositionInfo.positionInfo.mediaItem, this.sessionPositionInfo.positionInfo.periodUid, this.sessionPositionInfo.positionInfo.periodIndex, this.sessionPositionInfo.positionInfo.positionMs, this.sessionPositionInfo.positionInfo.contentPositionMs, this.sessionPositionInfo.positionInfo.adGroupIndex, this.sessionPositionInfo.positionInfo.adIndexInAdGroup), this.sessionPositionInfo.isPlayingAd, this.sessionPositionInfo.eventTimeMs, this.sessionPositionInfo.durationMs, this.sessionPositionInfo.bufferedPositionMs, this.sessionPositionInfo.bufferedPercentage, this.sessionPositionInfo.totalBufferedDurationMs, this.sessionPositionInfo.currentLiveOffsetMs, this.sessionPositionInfo.contentDurationMs, this.sessionPositionInfo.contentBufferedPositionMs)).build();
    }

    public androidx.media3.session.PlayerInfo copyWithPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setPlaylistMetadata(mediaMetadata).build();
    }

    public androidx.media3.session.PlayerInfo copyWithRepeatMode(int i) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setRepeatMode(i).build();
    }

    public androidx.media3.session.PlayerInfo copyWithShuffleModeEnabled(boolean z) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setShuffleModeEnabled(z).build();
    }

    public androidx.media3.session.PlayerInfo copyWithAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setAudioAttributes(audioAttributes).build();
    }

    public androidx.media3.session.PlayerInfo copyWithVideoSize(androidx.media3.common.VideoSize videoSize) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setVideoSize(videoSize).build();
    }

    public androidx.media3.session.PlayerInfo copyWithVolume(float f) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setVolume(f).build();
    }

    public androidx.media3.session.PlayerInfo copyWithDeviceInfo(androidx.media3.common.DeviceInfo deviceInfo) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setDeviceInfo(deviceInfo).build();
    }

    public androidx.media3.session.PlayerInfo copyWithDeviceVolume(int i, boolean z) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setDeviceVolume(i).setDeviceMuted(z).build();
    }

    public androidx.media3.session.PlayerInfo copyWithMediaMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setMediaMetadata(mediaMetadata).build();
    }

    public androidx.media3.session.PlayerInfo copyWithSeekBackIncrement(long j) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setSeekBackIncrement(j).build();
    }

    public androidx.media3.session.PlayerInfo copyWithSeekForwardIncrement(long j) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setSeekForwardIncrement(j).build();
    }

    public androidx.media3.session.PlayerInfo copyWithMaxSeekToPreviousPositionMs(long j) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setMaxSeekToPreviousPositionMs(j).build();
    }

    public androidx.media3.session.PlayerInfo copyWithCurrentTracks(androidx.media3.common.Tracks tracks) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setCurrentTracks(tracks).build();
    }

    public androidx.media3.session.PlayerInfo copyWithTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        return new androidx.media3.session.PlayerInfo.Builder(this).setTrackSelectionParameters(trackSelectionParameters).build();
    }

    public PlayerInfo(androidx.media3.common.PlaybackException playbackException, int i, androidx.media3.session.SessionPositionInfo sessionPositionInfo, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i2, androidx.media3.common.PlaybackParameters playbackParameters, int i3, boolean z, androidx.media3.common.VideoSize videoSize, androidx.media3.common.Timeline timeline, int i4, androidx.media3.common.MediaMetadata mediaMetadata, float f, androidx.media3.common.AudioAttributes audioAttributes, androidx.media3.common.text.CueGroup cueGroup, androidx.media3.common.DeviceInfo deviceInfo, int i5, boolean z2, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, androidx.media3.common.MediaMetadata mediaMetadata2, long j, long j2, long j3, androidx.media3.common.Tracks tracks, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        this.playerError = playbackException;
        this.mediaItemTransitionReason = i;
        this.sessionPositionInfo = sessionPositionInfo;
        this.oldPositionInfo = positionInfo;
        this.newPositionInfo = positionInfo2;
        this.discontinuityReason = i2;
        this.playbackParameters = playbackParameters;
        this.repeatMode = i3;
        this.shuffleModeEnabled = z;
        this.videoSize = videoSize;
        this.timeline = timeline;
        this.timelineChangeReason = i4;
        this.playlistMetadata = mediaMetadata;
        this.volume = f;
        this.audioAttributes = audioAttributes;
        this.cueGroup = cueGroup;
        this.deviceInfo = deviceInfo;
        this.deviceVolume = i5;
        this.deviceMuted = z2;
        this.playWhenReady = z3;
        this.playWhenReadyChangeReason = i6;
        this.playbackSuppressionReason = i7;
        this.playbackState = i8;
        this.isPlaying = z4;
        this.isLoading = z5;
        this.mediaMetadata = mediaMetadata2;
        this.seekBackIncrementMs = j;
        this.seekForwardIncrementMs = j2;
        this.maxSeekToPreviousPositionMs = j3;
        this.currentTracks = tracks;
        this.trackSelectionParameters = trackSelectionParameters;
    }

    public androidx.media3.common.MediaItem getCurrentMediaItem() {
        if (this.timeline.isEmpty()) {
            return null;
        }
        return this.timeline.getWindow(this.sessionPositionInfo.positionInfo.mediaItemIndex, new androidx.media3.common.Timeline.Window()).mediaItem;
    }

    public androidx.media3.session.PlayerInfo filterByAvailableCommands(androidx.media3.common.Player.Commands commands, boolean z, boolean z2) {
        androidx.media3.session.PlayerInfo.Builder builder = new androidx.media3.session.PlayerInfo.Builder(this);
        boolean zContains = commands.contains(16);
        boolean zContains2 = commands.contains(17);
        builder.setSessionPositionInfo(this.sessionPositionInfo.filterByAvailableCommands(zContains, zContains2));
        builder.setOldPositionInfo(this.oldPositionInfo.filterByAvailableCommands(zContains, zContains2));
        builder.setNewPositionInfo(this.newPositionInfo.filterByAvailableCommands(zContains, zContains2));
        if (!zContains2 && zContains && !this.timeline.isEmpty()) {
            builder.setTimeline(this.timeline.copyWithSingleWindow(this.sessionPositionInfo.positionInfo.mediaItemIndex));
        } else if (z || !zContains2) {
            builder.setTimeline(androidx.media3.common.Timeline.EMPTY);
        }
        if (!commands.contains(18)) {
            builder.setPlaylistMetadata(androidx.media3.common.MediaMetadata.EMPTY);
        }
        if (!commands.contains(22)) {
            builder.setVolume(1.0f);
        }
        if (!commands.contains(21)) {
            builder.setAudioAttributes(androidx.media3.common.AudioAttributes.DEFAULT);
        }
        if (!commands.contains(28)) {
            builder.setCues(androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO);
        }
        if (!commands.contains(23)) {
            builder.setDeviceVolume(0).setDeviceMuted(false);
        }
        if (!commands.contains(18)) {
            builder.setMediaMetadata(androidx.media3.common.MediaMetadata.EMPTY);
        }
        if (z2 || !commands.contains(30)) {
            builder.setCurrentTracks(androidx.media3.common.Tracks.EMPTY);
        }
        return builder.build();
    }

    public android.os.Bundle toBundleInProcess() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBinder(FIELD_IN_PROCESS_BINDER, new androidx.media3.session.PlayerInfo.InProcessBinder());
        return bundle;
    }

    public android.os.Bundle toBundleForRemoteProcess(int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        androidx.media3.common.PlaybackException playbackException = this.playerError;
        if (playbackException != null) {
            bundle.putBundle(FIELD_PLAYBACK_ERROR, playbackException.toBundle());
        }
        int i2 = this.mediaItemTransitionReason;
        if (i2 != 0) {
            bundle.putInt(FIELD_MEDIA_ITEM_TRANSITION_REASON, i2);
        }
        if (i < 3 || !this.sessionPositionInfo.equals(androidx.media3.session.SessionPositionInfo.DEFAULT)) {
            bundle.putBundle(FIELD_SESSION_POSITION_INFO, this.sessionPositionInfo.toBundle(i));
        }
        if (i < 3 || !androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO.equalsForBundling(this.oldPositionInfo)) {
            bundle.putBundle(FIELD_OLD_POSITION_INFO, this.oldPositionInfo.toBundle(i));
        }
        if (i < 3 || !androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO.equalsForBundling(this.newPositionInfo)) {
            bundle.putBundle(FIELD_NEW_POSITION_INFO, this.newPositionInfo.toBundle(i));
        }
        int i3 = this.discontinuityReason;
        if (i3 != 0) {
            bundle.putInt(FIELD_DISCONTINUITY_REASON, i3);
        }
        if (!this.playbackParameters.equals(androidx.media3.common.PlaybackParameters.DEFAULT)) {
            bundle.putBundle(FIELD_PLAYBACK_PARAMETERS, this.playbackParameters.toBundle());
        }
        int i4 = this.repeatMode;
        if (i4 != 0) {
            bundle.putInt(FIELD_REPEAT_MODE, i4);
        }
        boolean z = this.shuffleModeEnabled;
        if (z) {
            bundle.putBoolean(FIELD_SHUFFLE_MODE_ENABLED, z);
        }
        if (!this.timeline.equals(androidx.media3.common.Timeline.EMPTY)) {
            bundle.putBundle(FIELD_TIMELINE, this.timeline.toBundle());
        }
        int i5 = this.timelineChangeReason;
        if (i5 != 0) {
            bundle.putInt(FIELD_TIMELINE_CHANGE_REASON, i5);
        }
        if (!this.videoSize.equals(androidx.media3.common.VideoSize.UNKNOWN)) {
            bundle.putBundle(FIELD_VIDEO_SIZE, this.videoSize.toBundle());
        }
        if (!this.playlistMetadata.equals(androidx.media3.common.MediaMetadata.EMPTY)) {
            bundle.putBundle(FIELD_PLAYLIST_METADATA, this.playlistMetadata.toBundle());
        }
        float f = this.volume;
        if (f != 1.0f) {
            bundle.putFloat(FIELD_VOLUME, f);
        }
        if (!this.audioAttributes.equals(androidx.media3.common.AudioAttributes.DEFAULT)) {
            bundle.putBundle(FIELD_AUDIO_ATTRIBUTES, this.audioAttributes.toBundle());
        }
        if (!this.cueGroup.equals(androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO)) {
            bundle.putBundle(FIELD_CUE_GROUP, this.cueGroup.toBundle());
        }
        if (!this.deviceInfo.equals(androidx.media3.common.DeviceInfo.UNKNOWN)) {
            bundle.putBundle(FIELD_DEVICE_INFO, this.deviceInfo.toBundle());
        }
        int i6 = this.deviceVolume;
        if (i6 != 0) {
            bundle.putInt(FIELD_DEVICE_VOLUME, i6);
        }
        boolean z2 = this.deviceMuted;
        if (z2) {
            bundle.putBoolean(FIELD_DEVICE_MUTED, z2);
        }
        boolean z3 = this.playWhenReady;
        if (z3) {
            bundle.putBoolean(FIELD_PLAY_WHEN_READY, z3);
        }
        int i7 = this.playWhenReadyChangeReason;
        if (i7 != 1) {
            bundle.putInt(FIELD_PLAY_WHEN_READY_CHANGE_REASON, i7);
        }
        int i8 = this.playbackSuppressionReason;
        if (i8 != 0) {
            bundle.putInt(FIELD_PLAYBACK_SUPPRESSION_REASON, i8);
        }
        int i9 = this.playbackState;
        if (i9 != 1) {
            bundle.putInt(FIELD_PLAYBACK_STATE, i9);
        }
        boolean z4 = this.isPlaying;
        if (z4) {
            bundle.putBoolean(FIELD_IS_PLAYING, z4);
        }
        boolean z5 = this.isLoading;
        if (z5) {
            bundle.putBoolean(FIELD_IS_LOADING, z5);
        }
        if (!this.mediaMetadata.equals(androidx.media3.common.MediaMetadata.EMPTY)) {
            bundle.putBundle(FIELD_MEDIA_METADATA, this.mediaMetadata.toBundle());
        }
        long j = i < 6 ? 0L : 5000L;
        long j2 = this.seekBackIncrementMs;
        if (j2 != j) {
            bundle.putLong(FIELD_SEEK_BACK_INCREMENT_MS, j2);
        }
        long j3 = i < 6 ? 0L : androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
        long j4 = this.seekForwardIncrementMs;
        if (j4 != j3) {
            bundle.putLong(FIELD_SEEK_FORWARD_INCREMENT_MS, j4);
        }
        long j5 = i >= 6 ? androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS : 0L;
        long j6 = this.maxSeekToPreviousPositionMs;
        if (j6 != j5) {
            bundle.putLong(FIELD_MAX_SEEK_TO_PREVIOUS_POSITION_MS, j6);
        }
        if (!this.currentTracks.equals(androidx.media3.common.Tracks.EMPTY)) {
            bundle.putBundle(FIELD_CURRENT_TRACKS, this.currentTracks.toBundle());
        }
        if (!this.trackSelectionParameters.equals(androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT)) {
            bundle.putBundle(FIELD_TRACK_SELECTION_PARAMETERS, this.trackSelectionParameters.toBundle());
        }
        return bundle;
    }

    public static androidx.media3.session.PlayerInfo fromBundle(android.os.Bundle bundle, int i) {
        androidx.media3.session.SessionPositionInfo sessionPositionInfoFromBundle;
        androidx.media3.common.Player.PositionInfo positionInfoFromBundle;
        androidx.media3.common.Player.PositionInfo positionInfoFromBundle2;
        androidx.media3.common.PlaybackParameters playbackParametersFromBundle;
        androidx.media3.common.MediaMetadata mediaMetadataFromBundle;
        androidx.media3.common.AudioAttributes audioAttributesFromBundle;
        androidx.media3.common.MediaMetadata mediaMetadataFromBundle2;
        androidx.media3.common.TrackSelectionParameters trackSelectionParametersFromBundle;
        android.os.IBinder binder = bundle.getBinder(FIELD_IN_PROCESS_BINDER);
        if (binder instanceof androidx.media3.session.PlayerInfo.InProcessBinder) {
            return ((androidx.media3.session.PlayerInfo.InProcessBinder) binder).getPlayerInfo();
        }
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_PLAYBACK_ERROR);
        androidx.media3.common.PlaybackException playbackExceptionFromBundle = bundle2 == null ? null : androidx.media3.common.PlaybackException.fromBundle(bundle2);
        int i2 = bundle.getInt(FIELD_MEDIA_ITEM_TRANSITION_REASON, 0);
        android.os.Bundle bundle3 = bundle.getBundle(FIELD_SESSION_POSITION_INFO);
        if (bundle3 == null) {
            sessionPositionInfoFromBundle = androidx.media3.session.SessionPositionInfo.DEFAULT;
        } else {
            sessionPositionInfoFromBundle = androidx.media3.session.SessionPositionInfo.fromBundle(bundle3);
        }
        androidx.media3.session.SessionPositionInfo sessionPositionInfo = sessionPositionInfoFromBundle;
        android.os.Bundle bundle4 = bundle.getBundle(FIELD_OLD_POSITION_INFO);
        if (bundle4 == null) {
            positionInfoFromBundle = androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO;
        } else {
            positionInfoFromBundle = androidx.media3.common.Player.PositionInfo.fromBundle(bundle4);
        }
        androidx.media3.common.Player.PositionInfo positionInfo = positionInfoFromBundle;
        android.os.Bundle bundle5 = bundle.getBundle(FIELD_NEW_POSITION_INFO);
        if (bundle5 == null) {
            positionInfoFromBundle2 = androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO;
        } else {
            positionInfoFromBundle2 = androidx.media3.common.Player.PositionInfo.fromBundle(bundle5);
        }
        androidx.media3.common.Player.PositionInfo positionInfo2 = positionInfoFromBundle2;
        int i3 = bundle.getInt(FIELD_DISCONTINUITY_REASON, 0);
        android.os.Bundle bundle6 = bundle.getBundle(FIELD_PLAYBACK_PARAMETERS);
        if (bundle6 == null) {
            playbackParametersFromBundle = androidx.media3.common.PlaybackParameters.DEFAULT;
        } else {
            playbackParametersFromBundle = androidx.media3.common.PlaybackParameters.fromBundle(bundle6);
        }
        androidx.media3.common.PlaybackParameters playbackParameters = playbackParametersFromBundle;
        int i4 = bundle.getInt(FIELD_REPEAT_MODE, 0);
        boolean z = bundle.getBoolean(FIELD_SHUFFLE_MODE_ENABLED, false);
        android.os.Bundle bundle7 = bundle.getBundle(FIELD_TIMELINE);
        androidx.media3.common.Timeline timelineFromBundle = bundle7 == null ? androidx.media3.common.Timeline.EMPTY : androidx.media3.common.Timeline.fromBundle(bundle7);
        int i5 = bundle.getInt(FIELD_TIMELINE_CHANGE_REASON, 0);
        android.os.Bundle bundle8 = bundle.getBundle(FIELD_VIDEO_SIZE);
        androidx.media3.common.VideoSize videoSizeFromBundle = bundle8 == null ? androidx.media3.common.VideoSize.UNKNOWN : androidx.media3.common.VideoSize.fromBundle(bundle8);
        android.os.Bundle bundle9 = bundle.getBundle(FIELD_PLAYLIST_METADATA);
        if (bundle9 == null) {
            mediaMetadataFromBundle = androidx.media3.common.MediaMetadata.EMPTY;
        } else {
            mediaMetadataFromBundle = androidx.media3.common.MediaMetadata.fromBundle(bundle9);
        }
        androidx.media3.common.MediaMetadata mediaMetadata = mediaMetadataFromBundle;
        float f = bundle.getFloat(FIELD_VOLUME, 1.0f);
        android.os.Bundle bundle10 = bundle.getBundle(FIELD_AUDIO_ATTRIBUTES);
        if (bundle10 == null) {
            audioAttributesFromBundle = androidx.media3.common.AudioAttributes.DEFAULT;
        } else {
            audioAttributesFromBundle = androidx.media3.common.AudioAttributes.fromBundle(bundle10);
        }
        androidx.media3.common.AudioAttributes audioAttributes = audioAttributesFromBundle;
        android.os.Bundle bundle11 = bundle.getBundle(FIELD_CUE_GROUP);
        androidx.media3.common.text.CueGroup cueGroupFromBundle = bundle11 == null ? androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO : androidx.media3.common.text.CueGroup.fromBundle(bundle11);
        android.os.Bundle bundle12 = bundle.getBundle(FIELD_DEVICE_INFO);
        androidx.media3.common.DeviceInfo deviceInfoFromBundle = bundle12 == null ? androidx.media3.common.DeviceInfo.UNKNOWN : androidx.media3.common.DeviceInfo.fromBundle(bundle12);
        int i6 = bundle.getInt(FIELD_DEVICE_VOLUME, 0);
        boolean z2 = bundle.getBoolean(FIELD_DEVICE_MUTED, false);
        boolean z3 = bundle.getBoolean(FIELD_PLAY_WHEN_READY, false);
        int i7 = bundle.getInt(FIELD_PLAY_WHEN_READY_CHANGE_REASON, 1);
        int i8 = bundle.getInt(FIELD_PLAYBACK_SUPPRESSION_REASON, 0);
        int i9 = bundle.getInt(FIELD_PLAYBACK_STATE, 1);
        boolean z4 = bundle.getBoolean(FIELD_IS_PLAYING, false);
        boolean z5 = bundle.getBoolean(FIELD_IS_LOADING, false);
        android.os.Bundle bundle13 = bundle.getBundle(FIELD_MEDIA_METADATA);
        if (bundle13 == null) {
            mediaMetadataFromBundle2 = androidx.media3.common.MediaMetadata.EMPTY;
        } else {
            mediaMetadataFromBundle2 = androidx.media3.common.MediaMetadata.fromBundle(bundle13);
        }
        androidx.media3.common.MediaMetadata mediaMetadata2 = mediaMetadataFromBundle2;
        long j = bundle.getLong(FIELD_SEEK_BACK_INCREMENT_MS, i < 4 ? 0L : 5000L);
        long j2 = bundle.getLong(FIELD_SEEK_FORWARD_INCREMENT_MS, i < 4 ? 0L : androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        long j3 = bundle.getLong(FIELD_MAX_SEEK_TO_PREVIOUS_POSITION_MS, i >= 4 ? androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS : 0L);
        android.os.Bundle bundle14 = bundle.getBundle(FIELD_CURRENT_TRACKS);
        androidx.media3.common.Tracks tracksFromBundle = bundle14 == null ? androidx.media3.common.Tracks.EMPTY : androidx.media3.common.Tracks.fromBundle(bundle14);
        android.os.Bundle bundle15 = bundle.getBundle(FIELD_TRACK_SELECTION_PARAMETERS);
        if (bundle15 == null) {
            trackSelectionParametersFromBundle = androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT;
        } else {
            trackSelectionParametersFromBundle = androidx.media3.common.TrackSelectionParameters.fromBundle(bundle15);
        }
        return new androidx.media3.session.PlayerInfo(playbackExceptionFromBundle, i2, sessionPositionInfo, positionInfo, positionInfo2, i3, playbackParameters, i4, z, videoSizeFromBundle, timelineFromBundle, i5, mediaMetadata, f, audioAttributes, cueGroupFromBundle, deviceInfoFromBundle, i6, z2, z3, i7, i8, i9, z4, z5, mediaMetadata2, j, j2, j3, tracksFromBundle, trackSelectionParametersFromBundle);
    }

    private final class InProcessBinder extends android.os.Binder {
        private InProcessBinder() {
        }

        public androidx.media3.session.PlayerInfo getPlayerInfo() {
            return androidx.media3.session.PlayerInfo.this;
        }
    }
}
