package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface Player {

    @java.lang.Deprecated
    public static final int COMMAND_ADJUST_DEVICE_VOLUME = 26;
    public static final int COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS = 34;
    public static final int COMMAND_CHANGE_MEDIA_ITEMS = 20;
    public static final int COMMAND_GET_AUDIO_ATTRIBUTES = 21;
    public static final int COMMAND_GET_CURRENT_MEDIA_ITEM = 16;
    public static final int COMMAND_GET_DEVICE_VOLUME = 23;

    @java.lang.Deprecated
    public static final int COMMAND_GET_MEDIA_ITEMS_METADATA = 18;
    public static final int COMMAND_GET_METADATA = 18;
    public static final int COMMAND_GET_TEXT = 28;
    public static final int COMMAND_GET_TIMELINE = 17;
    public static final int COMMAND_GET_TRACKS = 30;
    public static final int COMMAND_GET_VOLUME = 22;
    public static final int COMMAND_INVALID = -1;
    public static final int COMMAND_PLAY_PAUSE = 1;
    public static final int COMMAND_PREPARE = 2;
    public static final int COMMAND_RELEASE = 32;
    public static final int COMMAND_SEEK_BACK = 11;
    public static final int COMMAND_SEEK_FORWARD = 12;
    public static final int COMMAND_SEEK_IN_CURRENT_MEDIA_ITEM = 5;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_IN_CURRENT_WINDOW = 5;
    public static final int COMMAND_SEEK_TO_DEFAULT_POSITION = 4;
    public static final int COMMAND_SEEK_TO_MEDIA_ITEM = 10;
    public static final int COMMAND_SEEK_TO_NEXT = 9;
    public static final int COMMAND_SEEK_TO_NEXT_MEDIA_ITEM = 8;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_TO_NEXT_WINDOW = 8;
    public static final int COMMAND_SEEK_TO_PREVIOUS = 7;
    public static final int COMMAND_SEEK_TO_PREVIOUS_MEDIA_ITEM = 6;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_TO_PREVIOUS_WINDOW = 6;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_TO_WINDOW = 10;
    public static final int COMMAND_SET_AUDIO_ATTRIBUTES = 35;

    @java.lang.Deprecated
    public static final int COMMAND_SET_DEVICE_VOLUME = 25;
    public static final int COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS = 33;
    public static final int COMMAND_SET_MEDIA_ITEM = 31;

    @java.lang.Deprecated
    public static final int COMMAND_SET_MEDIA_ITEMS_METADATA = 19;
    public static final int COMMAND_SET_PLAYLIST_METADATA = 19;
    public static final int COMMAND_SET_REPEAT_MODE = 15;
    public static final int COMMAND_SET_SHUFFLE_MODE = 14;
    public static final int COMMAND_SET_SPEED_AND_PITCH = 13;
    public static final int COMMAND_SET_TRACK_SELECTION_PARAMETERS = 29;
    public static final int COMMAND_SET_VIDEO_SURFACE = 27;
    public static final int COMMAND_SET_VOLUME = 24;
    public static final int COMMAND_STOP = 3;
    public static final int DISCONTINUITY_REASON_AUTO_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_INTERNAL = 5;
    public static final int DISCONTINUITY_REASON_REMOVE = 4;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int DISCONTINUITY_REASON_SILENCE_SKIP = 6;
    public static final int DISCONTINUITY_REASON_SKIP = 3;
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;
    public static final int EVENT_AUDIO_SESSION_ID = 21;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;
    public static final int EVENT_CUES = 27;
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;
    public static final int EVENT_IS_LOADING_CHANGED = 3;
    public static final int EVENT_IS_PLAYING_CHANGED = 7;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;
    public static final int EVENT_METADATA = 28;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;
    public static final int EVENT_PLAYER_ERROR = 10;
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
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;
    public static final int EVENT_VOLUME_CHANGED = 22;
    public static final int MEDIA_ITEM_TRANSITION_REASON_AUTO = 1;
    public static final int MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED = 3;
    public static final int MEDIA_ITEM_TRANSITION_REASON_REPEAT = 0;
    public static final int MEDIA_ITEM_TRANSITION_REASON_SEEK = 2;
    public static final int PLAYBACK_SUPPRESSION_REASON_NONE = 0;
    public static final int PLAYBACK_SUPPRESSION_REASON_TRANSIENT_AUDIO_FOCUS_LOSS = 1;
    public static final int PLAYBACK_SUPPRESSION_REASON_UNSUITABLE_AUDIO_OUTPUT = 3;

    @java.lang.Deprecated
    public static final int PLAYBACK_SUPPRESSION_REASON_UNSUITABLE_AUDIO_ROUTE = 2;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_BECOMING_NOISY = 3;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_FOCUS_LOSS = 2;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_END_OF_MEDIA_ITEM = 5;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_REMOTE = 4;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_SUPPRESSED_TOO_LONG = 6;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_USER_REQUEST = 1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_PLAYLIST_CHANGED = 0;
    public static final int TIMELINE_CHANGE_REASON_SOURCE_UPDATE = 1;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Command {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Event {
    }

    public interface Listener {
        default void onAudioAttributesChanged(androidx.media3.common.AudioAttributes audioAttributes) {
        }

        default void onAudioSessionIdChanged(int i) {
        }

        default void onAvailableCommandsChanged(androidx.media3.common.Player.Commands commands) {
        }

        default void onCues(androidx.media3.common.text.CueGroup cueGroup) {
        }

        @java.lang.Deprecated
        default void onCues(java.util.List<androidx.media3.common.text.Cue> list) {
        }

        default void onDeviceInfoChanged(androidx.media3.common.DeviceInfo deviceInfo) {
        }

        default void onDeviceVolumeChanged(int i, boolean z) {
        }

        default void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
        }

        default void onIsLoadingChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        @java.lang.Deprecated
        default void onLoadingChanged(boolean z) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j) {
        }

        default void onMediaItemTransition(androidx.media3.common.MediaItem mediaItem, int i) {
        }

        default void onMediaMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
        }

        default void onMetadata(androidx.media3.common.Metadata metadata) {
        }

        default void onPlayWhenReadyChanged(boolean z, int i) {
        }

        default void onPlaybackParametersChanged(androidx.media3.common.PlaybackParameters playbackParameters) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onPlayerError(androidx.media3.common.PlaybackException playbackException) {
        }

        default void onPlayerErrorChanged(androidx.media3.common.PlaybackException playbackException) {
        }

        @java.lang.Deprecated
        default void onPlayerStateChanged(boolean z, int i) {
        }

        default void onPlaylistMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
        }

        @java.lang.Deprecated
        default void onPositionDiscontinuity(int i) {
        }

        default void onPositionDiscontinuity(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onRepeatModeChanged(int i) {
        }

        default void onSeekBackIncrementChanged(long j) {
        }

        default void onSeekForwardIncrementChanged(long j) {
        }

        default void onShuffleModeEnabledChanged(boolean z) {
        }

        default void onSkipSilenceEnabledChanged(boolean z) {
        }

        default void onSurfaceSizeChanged(int i, int i2) {
        }

        default void onTimelineChanged(androidx.media3.common.Timeline timeline, int i) {
        }

        default void onTrackSelectionParametersChanged(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        }

        default void onTracksChanged(androidx.media3.common.Tracks tracks) {
        }

        default void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
        }

        default void onVolumeChanged(float f) {
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    void addListener(androidx.media3.common.Player.Listener listener);

    void addMediaItem(int i, androidx.media3.common.MediaItem mediaItem);

    void addMediaItem(androidx.media3.common.MediaItem mediaItem);

    void addMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list);

    void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list);

    boolean canAdvertiseSession();

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(android.view.Surface surface);

    void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(android.view.SurfaceView surfaceView);

    void clearVideoTextureView(android.view.TextureView textureView);

    @java.lang.Deprecated
    void decreaseDeviceVolume();

    void decreaseDeviceVolume(int i);

    android.os.Looper getApplicationLooper();

    androidx.media3.common.AudioAttributes getAudioAttributes();

    androidx.media3.common.Player.Commands getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    androidx.media3.common.text.CueGroup getCurrentCues();

    long getCurrentLiveOffset();

    java.lang.Object getCurrentManifest();

    androidx.media3.common.MediaItem getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    androidx.media3.common.Timeline getCurrentTimeline();

    androidx.media3.common.Tracks getCurrentTracks();

    @java.lang.Deprecated
    int getCurrentWindowIndex();

    androidx.media3.common.DeviceInfo getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    androidx.media3.common.MediaItem getMediaItemAt(int i);

    int getMediaItemCount();

    androidx.media3.common.MediaMetadata getMediaMetadata();

    int getNextMediaItemIndex();

    @java.lang.Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    androidx.media3.common.PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    androidx.media3.common.PlaybackException getPlayerError();

    androidx.media3.common.MediaMetadata getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    @java.lang.Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    androidx.media3.common.util.Size getSurfaceSize();

    long getTotalBufferedDuration();

    androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters();

    androidx.media3.common.VideoSize getVideoSize();

    float getVolume();

    @java.lang.Deprecated
    boolean hasNext();

    boolean hasNextMediaItem();

    @java.lang.Deprecated
    boolean hasNextWindow();

    @java.lang.Deprecated
    boolean hasPrevious();

    boolean hasPreviousMediaItem();

    @java.lang.Deprecated
    boolean hasPreviousWindow();

    @java.lang.Deprecated
    void increaseDeviceVolume();

    void increaseDeviceVolume(int i);

    boolean isCommandAvailable(int i);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    @java.lang.Deprecated
    boolean isCurrentWindowDynamic();

    @java.lang.Deprecated
    boolean isCurrentWindowLive();

    @java.lang.Deprecated
    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i, int i2);

    void moveMediaItems(int i, int i2, int i3);

    @java.lang.Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    @java.lang.Deprecated
    void previous();

    void release();

    void removeListener(androidx.media3.common.Player.Listener listener);

    void removeMediaItem(int i);

    void removeMediaItems(int i, int i2);

    void replaceMediaItem(int i, androidx.media3.common.MediaItem mediaItem);

    void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void seekToNext();

    void seekToNextMediaItem();

    @java.lang.Deprecated
    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    @java.lang.Deprecated
    void seekToPreviousWindow();

    void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z);

    @java.lang.Deprecated
    void setDeviceMuted(boolean z);

    void setDeviceMuted(boolean z, int i);

    @java.lang.Deprecated
    void setDeviceVolume(int i);

    void setDeviceVolume(int i, int i2);

    void setMediaItem(androidx.media3.common.MediaItem mediaItem);

    void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j);

    void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z);

    void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list);

    void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j);

    void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters);

    void setPlaybackSpeed(float f);

    void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters);

    void setVideoSurface(android.view.Surface surface);

    void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(android.view.SurfaceView surfaceView);

    void setVideoTextureView(android.view.TextureView textureView);

    void setVolume(float f);

    void stop();

    public static final class Events {
        private final androidx.media3.common.FlagSet flags;

        public Events(androidx.media3.common.FlagSet flagSet) {
            this.flags = flagSet;
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

        public int hashCode() {
            return this.flags.hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.media3.common.Player.Events) {
                return this.flags.equals(((androidx.media3.common.Player.Events) obj).flags);
            }
            return false;
        }
    }

    public static final class PositionInfo {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final long contentPositionMs;
        public final androidx.media3.common.MediaItem mediaItem;
        public final int mediaItemIndex;
        public final int periodIndex;
        public final java.lang.Object periodUid;
        public final long positionMs;

        @java.lang.Deprecated
        public final int windowIndex;
        public final java.lang.Object windowUid;
        static final java.lang.String FIELD_MEDIA_ITEM_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_MEDIA_ITEM = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        static final java.lang.String FIELD_PERIOD_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        static final java.lang.String FIELD_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        static final java.lang.String FIELD_CONTENT_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String FIELD_AD_GROUP_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String FIELD_AD_INDEX_IN_AD_GROUP = androidx.media3.common.util.Util.intToStringMaxRadix(6);

        @java.lang.Deprecated
        public PositionInfo(java.lang.Object obj, int i, java.lang.Object obj2, int i2, long j, long j2, int i3, int i4) {
            this(obj, i, androidx.media3.common.MediaItem.EMPTY, obj2, i2, j, j2, i3, i4);
        }

        public PositionInfo(java.lang.Object obj, int i, androidx.media3.common.MediaItem mediaItem, java.lang.Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.windowUid = obj;
            this.windowIndex = i;
            this.mediaItemIndex = i;
            this.mediaItem = mediaItem;
            this.periodUid = obj2;
            this.periodIndex = i2;
            this.positionMs = j;
            this.contentPositionMs = j2;
            this.adGroupIndex = i3;
            this.adIndexInAdGroup = i4;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.common.Player.PositionInfo positionInfo = (androidx.media3.common.Player.PositionInfo) obj;
            return equalsForBundling(positionInfo) && com.google.common.base.Objects.equal(this.windowUid, positionInfo.windowUid) && com.google.common.base.Objects.equal(this.periodUid, positionInfo.periodUid);
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.windowUid, java.lang.Integer.valueOf(this.mediaItemIndex), this.mediaItem, this.periodUid, java.lang.Integer.valueOf(this.periodIndex), java.lang.Long.valueOf(this.positionMs), java.lang.Long.valueOf(this.contentPositionMs), java.lang.Integer.valueOf(this.adGroupIndex), java.lang.Integer.valueOf(this.adIndexInAdGroup));
        }

        public boolean equalsForBundling(androidx.media3.common.Player.PositionInfo positionInfo) {
            return this.mediaItemIndex == positionInfo.mediaItemIndex && this.periodIndex == positionInfo.periodIndex && this.positionMs == positionInfo.positionMs && this.contentPositionMs == positionInfo.contentPositionMs && this.adGroupIndex == positionInfo.adGroupIndex && this.adIndexInAdGroup == positionInfo.adIndexInAdGroup && com.google.common.base.Objects.equal(this.mediaItem, positionInfo.mediaItem);
        }

        public androidx.media3.common.Player.PositionInfo filterByAvailableCommands(boolean z, boolean z2) {
            if (z && z2) {
                return this;
            }
            return new androidx.media3.common.Player.PositionInfo(this.windowUid, z2 ? this.mediaItemIndex : 0, z ? this.mediaItem : null, this.periodUid, z2 ? this.periodIndex : 0, z ? this.positionMs : 0L, z ? this.contentPositionMs : 0L, z ? this.adGroupIndex : -1, z ? this.adIndexInAdGroup : -1);
        }

        public android.os.Bundle toBundle(int i) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (i < 3 || this.mediaItemIndex != 0) {
                bundle.putInt(FIELD_MEDIA_ITEM_INDEX, this.mediaItemIndex);
            }
            androidx.media3.common.MediaItem mediaItem = this.mediaItem;
            if (mediaItem != null) {
                bundle.putBundle(FIELD_MEDIA_ITEM, mediaItem.toBundle());
            }
            if (i < 3 || this.periodIndex != 0) {
                bundle.putInt(FIELD_PERIOD_INDEX, this.periodIndex);
            }
            if (i < 3 || this.positionMs != 0) {
                bundle.putLong(FIELD_POSITION_MS, this.positionMs);
            }
            if (i < 3 || this.contentPositionMs != 0) {
                bundle.putLong(FIELD_CONTENT_POSITION_MS, this.contentPositionMs);
            }
            int i2 = this.adGroupIndex;
            if (i2 != -1) {
                bundle.putInt(FIELD_AD_GROUP_INDEX, i2);
            }
            int i3 = this.adIndexInAdGroup;
            if (i3 != -1) {
                bundle.putInt(FIELD_AD_INDEX_IN_AD_GROUP, i3);
            }
            return bundle;
        }

        @java.lang.Deprecated
        public android.os.Bundle toBundle() {
            return toBundle(Integer.MAX_VALUE);
        }

        public static androidx.media3.common.Player.PositionInfo fromBundle(android.os.Bundle bundle) {
            int i = bundle.getInt(FIELD_MEDIA_ITEM_INDEX, 0);
            android.os.Bundle bundle2 = bundle.getBundle(FIELD_MEDIA_ITEM);
            return new androidx.media3.common.Player.PositionInfo(null, i, bundle2 == null ? null : androidx.media3.common.MediaItem.fromBundle(bundle2), null, bundle.getInt(FIELD_PERIOD_INDEX, 0), bundle.getLong(FIELD_POSITION_MS, 0L), bundle.getLong(FIELD_CONTENT_POSITION_MS, 0L), bundle.getInt(FIELD_AD_GROUP_INDEX, -1), bundle.getInt(FIELD_AD_INDEX_IN_AD_GROUP, -1));
        }
    }

    public static final class Commands {
        public static final androidx.media3.common.Player.Commands EMPTY = new androidx.media3.common.Player.Commands.Builder().build();
        private static final java.lang.String FIELD_COMMANDS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private final androidx.media3.common.FlagSet flags;

        public static final class Builder {
            private static final int[] SUPPORTED_COMMANDS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
            private final androidx.media3.common.FlagSet.Builder flagsBuilder;

            public Builder() {
                this.flagsBuilder = new androidx.media3.common.FlagSet.Builder();
            }

            private Builder(androidx.media3.common.Player.Commands commands) {
                androidx.media3.common.FlagSet.Builder builder = new androidx.media3.common.FlagSet.Builder();
                this.flagsBuilder = builder;
                builder.addAll(commands.flags);
            }

            public androidx.media3.common.Player.Commands.Builder add(int i) {
                this.flagsBuilder.add(i);
                return this;
            }

            public androidx.media3.common.Player.Commands.Builder addIf(int i, boolean z) {
                this.flagsBuilder.addIf(i, z);
                return this;
            }

            public androidx.media3.common.Player.Commands.Builder addAll(int... iArr) {
                this.flagsBuilder.addAll(iArr);
                return this;
            }

            public androidx.media3.common.Player.Commands.Builder addAll(androidx.media3.common.Player.Commands commands) {
                this.flagsBuilder.addAll(commands.flags);
                return this;
            }

            public androidx.media3.common.Player.Commands.Builder addAllCommands() {
                this.flagsBuilder.addAll(SUPPORTED_COMMANDS);
                return this;
            }

            public androidx.media3.common.Player.Commands.Builder remove(int i) {
                this.flagsBuilder.remove(i);
                return this;
            }

            public androidx.media3.common.Player.Commands.Builder removeIf(int i, boolean z) {
                this.flagsBuilder.removeIf(i, z);
                return this;
            }

            public androidx.media3.common.Player.Commands.Builder removeAll(int... iArr) {
                this.flagsBuilder.removeAll(iArr);
                return this;
            }

            public androidx.media3.common.Player.Commands build() {
                return new androidx.media3.common.Player.Commands(this.flagsBuilder.build());
            }
        }

        private Commands(androidx.media3.common.FlagSet flagSet) {
            this.flags = flagSet;
        }

        public androidx.media3.common.Player.Commands.Builder buildUpon() {
            return new androidx.media3.common.Player.Commands.Builder();
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

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.media3.common.Player.Commands) {
                return this.flags.equals(((androidx.media3.common.Player.Commands) obj).flags);
            }
            return false;
        }

        public int hashCode() {
            return this.flags.hashCode();
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            for (int i = 0; i < this.flags.size(); i++) {
                arrayList.add(java.lang.Integer.valueOf(this.flags.get(i)));
            }
            bundle.putIntegerArrayList(FIELD_COMMANDS, arrayList);
            return bundle;
        }

        public static androidx.media3.common.Player.Commands fromBundle(android.os.Bundle bundle) {
            java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList(FIELD_COMMANDS);
            if (integerArrayList == null) {
                return EMPTY;
            }
            androidx.media3.common.Player.Commands.Builder builder = new androidx.media3.common.Player.Commands.Builder();
            for (int i = 0; i < integerArrayList.size(); i++) {
                builder.add(integerArrayList.get(i).intValue());
            }
            return builder.build();
        }
    }
}
