package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleBasePlayer extends androidx.media3.common.BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final androidx.media3.common.util.HandlerWrapper applicationHandler;
    private final android.os.Looper applicationLooper;
    private final androidx.media3.common.util.ListenerSet<androidx.media3.common.Player.Listener> listeners;
    private final java.util.HashSet<com.google.common.util.concurrent.ListenableFuture<?>> pendingOperations;
    private final androidx.media3.common.Timeline.Period period;
    private boolean released;
    private androidx.media3.common.SimpleBasePlayer.State state;

    static /* synthetic */ com.google.common.util.concurrent.ListenableFuture lambda$handleReplaceMediaItems$31(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Object obj) throws java.lang.Exception {
        return listenableFuture;
    }

    static /* synthetic */ androidx.media3.common.SimpleBasePlayer.State lambda$release$13(androidx.media3.common.SimpleBasePlayer.State state) {
        return state;
    }

    protected androidx.media3.common.SimpleBasePlayer.State getPlaceholderState(androidx.media3.common.SimpleBasePlayer.State state) {
        return state;
    }

    protected abstract androidx.media3.common.SimpleBasePlayer.State getState();

    protected static final class State {
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier adBufferedPositionMsSupplier;
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier adPositionMsSupplier;
        public final androidx.media3.common.AudioAttributes audioAttributes;
        public final androidx.media3.common.Player.Commands availableCommands;
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier contentBufferedPositionMsSupplier;
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final androidx.media3.common.text.CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final androidx.media3.common.DeviceInfo deviceInfo;
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final androidx.media3.common.PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;
        public final androidx.media3.common.PlaybackException playerError;
        public final com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> playlist;
        public final androidx.media3.common.MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final androidx.media3.common.util.Size surfaceSize;
        public final androidx.media3.common.Metadata timedMetadata;
        public final androidx.media3.common.Timeline timeline;
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier totalBufferedDurationMsSupplier;
        public final androidx.media3.common.TrackSelectionParameters trackSelectionParameters;
        public final androidx.media3.common.VideoSize videoSize;
        public final float volume;

        public static final class Builder {
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier adBufferedPositionMsSupplier;
            private java.lang.Long adPositionMs;
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier adPositionMsSupplier;
            private androidx.media3.common.AudioAttributes audioAttributes;
            private androidx.media3.common.Player.Commands availableCommands;
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier contentBufferedPositionMsSupplier;
            private java.lang.Long contentPositionMs;
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private androidx.media3.common.text.CueGroup currentCues;
            private int currentMediaItemIndex;
            private androidx.media3.common.DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private androidx.media3.common.PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;
            private androidx.media3.common.PlaybackException playerError;
            private com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> playlist;
            private androidx.media3.common.MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private androidx.media3.common.util.Size surfaceSize;
            private androidx.media3.common.Metadata timedMetadata;
            private androidx.media3.common.Timeline timeline;
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier totalBufferedDurationMsSupplier;
            private androidx.media3.common.TrackSelectionParameters trackSelectionParameters;
            private androidx.media3.common.VideoSize videoSize;
            private float volume;

            public Builder() {
                this.availableCommands = androidx.media3.common.Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
                this.playbackState = 1;
                this.playbackSuppressionReason = 0;
                this.playerError = null;
                this.repeatMode = 0;
                this.shuffleModeEnabled = false;
                this.isLoading = false;
                this.seekBackIncrementMs = 5000L;
                this.seekForwardIncrementMs = androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
                this.maxSeekToPreviousPositionMs = androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
                this.playbackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
                this.trackSelectionParameters = androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT;
                this.audioAttributes = androidx.media3.common.AudioAttributes.DEFAULT;
                this.volume = 1.0f;
                this.videoSize = androidx.media3.common.VideoSize.UNKNOWN;
                this.currentCues = androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
                this.deviceInfo = androidx.media3.common.DeviceInfo.UNKNOWN;
                this.deviceVolume = 0;
                this.isDeviceMuted = false;
                this.surfaceSize = androidx.media3.common.util.Size.UNKNOWN;
                this.newlyRenderedFirstFrame = false;
                this.timedMetadata = new androidx.media3.common.Metadata(androidx.media3.common.C.TIME_UNSET, new androidx.media3.common.Metadata.Entry[0]);
                this.playlist = com.google.common.collect.ImmutableList.of();
                this.timeline = androidx.media3.common.Timeline.EMPTY;
                this.playlistMetadata = androidx.media3.common.MediaMetadata.EMPTY;
                this.currentMediaItemIndex = -1;
                this.currentAdGroupIndex = -1;
                this.currentAdIndexInAdGroup = -1;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(androidx.media3.common.C.TIME_UNSET);
                this.adPositionMs = null;
                this.adPositionMsSupplier = androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO;
                this.contentBufferedPositionMsSupplier = androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(androidx.media3.common.C.TIME_UNSET);
                this.adBufferedPositionMsSupplier = androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO;
                this.totalBufferedDurationMsSupplier = androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO;
                this.hasPositionDiscontinuity = false;
                this.positionDiscontinuityReason = 5;
                this.discontinuityPositionMs = 0L;
            }

            private Builder(androidx.media3.common.SimpleBasePlayer.State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
                this.playbackState = state.playbackState;
                this.playbackSuppressionReason = state.playbackSuppressionReason;
                this.playerError = state.playerError;
                this.repeatMode = state.repeatMode;
                this.shuffleModeEnabled = state.shuffleModeEnabled;
                this.isLoading = state.isLoading;
                this.seekBackIncrementMs = state.seekBackIncrementMs;
                this.seekForwardIncrementMs = state.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = state.maxSeekToPreviousPositionMs;
                this.playbackParameters = state.playbackParameters;
                this.trackSelectionParameters = state.trackSelectionParameters;
                this.audioAttributes = state.audioAttributes;
                this.volume = state.volume;
                this.videoSize = state.videoSize;
                this.currentCues = state.currentCues;
                this.deviceInfo = state.deviceInfo;
                this.deviceVolume = state.deviceVolume;
                this.isDeviceMuted = state.isDeviceMuted;
                this.surfaceSize = state.surfaceSize;
                this.newlyRenderedFirstFrame = state.newlyRenderedFirstFrame;
                this.timedMetadata = state.timedMetadata;
                this.playlist = state.playlist;
                this.timeline = state.timeline;
                this.playlistMetadata = state.playlistMetadata;
                this.currentMediaItemIndex = state.currentMediaItemIndex;
                this.currentAdGroupIndex = state.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = state.currentAdIndexInAdGroup;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = state.contentPositionMsSupplier;
                this.adPositionMs = null;
                this.adPositionMsSupplier = state.adPositionMsSupplier;
                this.contentBufferedPositionMsSupplier = state.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = state.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = state.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = state.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = state.positionDiscontinuityReason;
                this.discontinuityPositionMs = state.discontinuityPositionMs;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setAvailableCommands(androidx.media3.common.Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setPlayWhenReady(boolean z, int i) {
                this.playWhenReady = z;
                this.playWhenReadyChangeReason = i;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setPlaybackState(int i) {
                this.playbackState = i;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setPlaybackSuppressionReason(int i) {
                this.playbackSuppressionReason = i;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setPlayerError(androidx.media3.common.PlaybackException playbackException) {
                this.playerError = playbackException;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setRepeatMode(int i) {
                this.repeatMode = i;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setShuffleModeEnabled(boolean z) {
                this.shuffleModeEnabled = z;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setIsLoading(boolean z) {
                this.isLoading = z;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setSeekBackIncrementMs(long j) {
                this.seekBackIncrementMs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setSeekForwardIncrementMs(long j) {
                this.seekForwardIncrementMs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setMaxSeekToPreviousPositionMs(long j) {
                this.maxSeekToPreviousPositionMs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
                this.playbackParameters = playbackParameters;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
                this.trackSelectionParameters = trackSelectionParameters;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setVolume(float f) {
                androidx.media3.common.util.Assertions.checkArgument(f >= 0.0f && f <= 1.0f);
                this.volume = f;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setVideoSize(androidx.media3.common.VideoSize videoSize) {
                this.videoSize = videoSize;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setCurrentCues(androidx.media3.common.text.CueGroup cueGroup) {
                this.currentCues = cueGroup;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setDeviceInfo(androidx.media3.common.DeviceInfo deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setDeviceVolume(int i) {
                androidx.media3.common.util.Assertions.checkArgument(i >= 0);
                this.deviceVolume = i;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setIsDeviceMuted(boolean z) {
                this.isDeviceMuted = z;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setSurfaceSize(androidx.media3.common.util.Size size) {
                this.surfaceSize = size;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setNewlyRenderedFirstFrame(boolean z) {
                this.newlyRenderedFirstFrame = z;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setTimedMetadata(androidx.media3.common.Metadata metadata) {
                this.timedMetadata = metadata;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setPlaylist(java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list) {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (int i = 0; i < list.size(); i++) {
                    androidx.media3.common.util.Assertions.checkArgument(hashSet.add(list.get(i).uid), "Duplicate MediaItemData UID in playlist");
                }
                this.playlist = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                this.timeline = new androidx.media3.common.SimpleBasePlayer.PlaylistTimeline(this.playlist);
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
                this.playlistMetadata = mediaMetadata;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setCurrentMediaItemIndex(int i) {
                this.currentMediaItemIndex = i;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setCurrentAd(int i, int i2) {
                androidx.media3.common.util.Assertions.checkArgument((i == -1) == (i2 == -1));
                this.currentAdGroupIndex = i;
                this.currentAdIndexInAdGroup = i2;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setContentPositionMs(long j) {
                this.contentPositionMs = java.lang.Long.valueOf(j);
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setContentPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = positionSupplier;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setAdPositionMs(long j) {
                this.adPositionMs = java.lang.Long.valueOf(j);
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setAdPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.adPositionMs = null;
                this.adPositionMsSupplier = positionSupplier;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.contentBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setAdBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.adBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.totalBufferedDurationMsSupplier = positionSupplier;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder setPositionDiscontinuity(int i, long j) {
                this.hasPositionDiscontinuity = true;
                this.positionDiscontinuityReason = i;
                this.discontinuityPositionMs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State.Builder clearPositionDiscontinuity() {
                this.hasPositionDiscontinuity = false;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.State build() {
                return new androidx.media3.common.SimpleBasePlayer.State(this);
            }
        }

        private State(androidx.media3.common.SimpleBasePlayer.State.Builder builder) {
            int i;
            if (!builder.timeline.isEmpty()) {
                int i2 = builder.currentMediaItemIndex;
                if (i2 == -1) {
                    i = 0;
                } else {
                    androidx.media3.common.util.Assertions.checkArgument(builder.currentMediaItemIndex < builder.timeline.getWindowCount(), "currentMediaItemIndex must be less than playlist.size()");
                    i = i2;
                }
                if (builder.currentAdGroupIndex != -1) {
                    androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
                    builder.timeline.getPeriod(androidx.media3.common.SimpleBasePlayer.getPeriodIndexFromWindowPosition(builder.timeline, i, builder.contentPositionMs != null ? builder.contentPositionMs.longValue() : builder.contentPositionMsSupplier.get(), new androidx.media3.common.Timeline.Window(), period), period);
                    androidx.media3.common.util.Assertions.checkArgument(builder.currentAdGroupIndex < period.getAdGroupCount(), "PeriodData has less ad groups than adGroupIndex");
                    int adCountInAdGroup = period.getAdCountInAdGroup(builder.currentAdGroupIndex);
                    if (adCountInAdGroup != -1) {
                        androidx.media3.common.util.Assertions.checkArgument(builder.currentAdIndexInAdGroup < adCountInAdGroup, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
            } else {
                androidx.media3.common.util.Assertions.checkArgument(builder.playbackState == 1 || builder.playbackState == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
                androidx.media3.common.util.Assertions.checkArgument(builder.currentAdGroupIndex == -1 && builder.currentAdIndexInAdGroup == -1, "Ads not allowed if playlist is empty");
            }
            if (builder.playerError != null) {
                androidx.media3.common.util.Assertions.checkArgument(builder.playbackState == 1, "Player error only allowed in STATE_IDLE");
            }
            if (builder.playbackState == 1 || builder.playbackState == 4) {
                androidx.media3.common.util.Assertions.checkArgument(!builder.isLoading, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            }
            androidx.media3.common.SimpleBasePlayer.PositionSupplier extrapolating = builder.contentPositionMs != null ? (builder.currentAdGroupIndex == -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0 && builder.contentPositionMs.longValue() != androidx.media3.common.C.TIME_UNSET) ? androidx.media3.common.SimpleBasePlayer.PositionSupplier.getExtrapolating(builder.contentPositionMs.longValue(), builder.playbackParameters.speed) : androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(builder.contentPositionMs.longValue()) : builder.contentPositionMsSupplier;
            androidx.media3.common.SimpleBasePlayer.PositionSupplier extrapolating2 = builder.adPositionMs != null ? (builder.currentAdGroupIndex != -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0) ? androidx.media3.common.SimpleBasePlayer.PositionSupplier.getExtrapolating(builder.adPositionMs.longValue(), 1.0f) : androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(builder.adPositionMs.longValue()) : builder.adPositionMsSupplier;
            this.availableCommands = builder.availableCommands;
            this.playWhenReady = builder.playWhenReady;
            this.playWhenReadyChangeReason = builder.playWhenReadyChangeReason;
            this.playbackState = builder.playbackState;
            this.playbackSuppressionReason = builder.playbackSuppressionReason;
            this.playerError = builder.playerError;
            this.repeatMode = builder.repeatMode;
            this.shuffleModeEnabled = builder.shuffleModeEnabled;
            this.isLoading = builder.isLoading;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.playbackParameters = builder.playbackParameters;
            this.trackSelectionParameters = builder.trackSelectionParameters;
            this.audioAttributes = builder.audioAttributes;
            this.volume = builder.volume;
            this.videoSize = builder.videoSize;
            this.currentCues = builder.currentCues;
            this.deviceInfo = builder.deviceInfo;
            this.deviceVolume = builder.deviceVolume;
            this.isDeviceMuted = builder.isDeviceMuted;
            this.surfaceSize = builder.surfaceSize;
            this.newlyRenderedFirstFrame = builder.newlyRenderedFirstFrame;
            this.timedMetadata = builder.timedMetadata;
            this.playlist = builder.playlist;
            this.timeline = builder.timeline;
            this.playlistMetadata = builder.playlistMetadata;
            this.currentMediaItemIndex = builder.currentMediaItemIndex;
            this.currentAdGroupIndex = builder.currentAdGroupIndex;
            this.currentAdIndexInAdGroup = builder.currentAdIndexInAdGroup;
            this.contentPositionMsSupplier = extrapolating;
            this.adPositionMsSupplier = extrapolating2;
            this.contentBufferedPositionMsSupplier = builder.contentBufferedPositionMsSupplier;
            this.adBufferedPositionMsSupplier = builder.adBufferedPositionMsSupplier;
            this.totalBufferedDurationMsSupplier = builder.totalBufferedDurationMsSupplier;
            this.hasPositionDiscontinuity = builder.hasPositionDiscontinuity;
            this.positionDiscontinuityReason = builder.positionDiscontinuityReason;
            this.discontinuityPositionMs = builder.discontinuityPositionMs;
        }

        public androidx.media3.common.SimpleBasePlayer.State.Builder buildUpon() {
            return new androidx.media3.common.SimpleBasePlayer.State.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.SimpleBasePlayer.State)) {
                return false;
            }
            androidx.media3.common.SimpleBasePlayer.State state = (androidx.media3.common.SimpleBasePlayer.State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands) && this.playbackState == state.playbackState && this.playbackSuppressionReason == state.playbackSuppressionReason && androidx.media3.common.util.Util.areEqual(this.playerError, state.playerError) && this.repeatMode == state.repeatMode && this.shuffleModeEnabled == state.shuffleModeEnabled && this.isLoading == state.isLoading && this.seekBackIncrementMs == state.seekBackIncrementMs && this.seekForwardIncrementMs == state.seekForwardIncrementMs && this.maxSeekToPreviousPositionMs == state.maxSeekToPreviousPositionMs && this.playbackParameters.equals(state.playbackParameters) && this.trackSelectionParameters.equals(state.trackSelectionParameters) && this.audioAttributes.equals(state.audioAttributes) && this.volume == state.volume && this.videoSize.equals(state.videoSize) && this.currentCues.equals(state.currentCues) && this.deviceInfo.equals(state.deviceInfo) && this.deviceVolume == state.deviceVolume && this.isDeviceMuted == state.isDeviceMuted && this.surfaceSize.equals(state.surfaceSize) && this.newlyRenderedFirstFrame == state.newlyRenderedFirstFrame && this.timedMetadata.equals(state.timedMetadata) && this.playlist.equals(state.playlist) && this.playlistMetadata.equals(state.playlistMetadata) && this.currentMediaItemIndex == state.currentMediaItemIndex && this.currentAdGroupIndex == state.currentAdGroupIndex && this.currentAdIndexInAdGroup == state.currentAdIndexInAdGroup && this.contentPositionMsSupplier.equals(state.contentPositionMsSupplier) && this.adPositionMsSupplier.equals(state.adPositionMsSupplier) && this.contentBufferedPositionMsSupplier.equals(state.contentBufferedPositionMsSupplier) && this.adBufferedPositionMsSupplier.equals(state.adBufferedPositionMsSupplier) && this.totalBufferedDurationMsSupplier.equals(state.totalBufferedDurationMsSupplier) && this.hasPositionDiscontinuity == state.hasPositionDiscontinuity && this.positionDiscontinuityReason == state.positionDiscontinuityReason && this.discontinuityPositionMs == state.discontinuityPositionMs;
        }

        public int hashCode() {
            int iHashCode = (((((((((217 + this.availableCommands.hashCode()) * 31) + (this.playWhenReady ? 1 : 0)) * 31) + this.playWhenReadyChangeReason) * 31) + this.playbackState) * 31) + this.playbackSuppressionReason) * 31;
            androidx.media3.common.PlaybackException playbackException = this.playerError;
            int iHashCode2 = (((((((iHashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.repeatMode) * 31) + (this.shuffleModeEnabled ? 1 : 0)) * 31) + (this.isLoading ? 1 : 0)) * 31;
            long j = this.seekBackIncrementMs;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.seekForwardIncrementMs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.maxSeekToPreviousPositionMs;
            int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.playbackParameters.hashCode()) * 31) + this.trackSelectionParameters.hashCode()) * 31) + this.audioAttributes.hashCode()) * 31) + java.lang.Float.floatToRawIntBits(this.volume)) * 31) + this.videoSize.hashCode()) * 31) + this.currentCues.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31) + this.deviceVolume) * 31) + (this.isDeviceMuted ? 1 : 0)) * 31) + this.surfaceSize.hashCode()) * 31) + (this.newlyRenderedFirstFrame ? 1 : 0)) * 31) + this.timedMetadata.hashCode()) * 31) + this.playlist.hashCode()) * 31) + this.playlistMetadata.hashCode()) * 31) + this.currentMediaItemIndex) * 31) + this.currentAdGroupIndex) * 31) + this.currentAdIndexInAdGroup) * 31) + this.contentPositionMsSupplier.hashCode()) * 31) + this.adPositionMsSupplier.hashCode()) * 31) + this.contentBufferedPositionMsSupplier.hashCode()) * 31) + this.adBufferedPositionMsSupplier.hashCode()) * 31) + this.totalBufferedDurationMsSupplier.hashCode()) * 31) + (this.hasPositionDiscontinuity ? 1 : 0)) * 31) + this.positionDiscontinuityReason) * 31;
            long j4 = this.discontinuityPositionMs;
            return iHashCode3 + ((int) (j4 ^ (j4 >>> 32)));
        }
    }

    private static final class PlaylistTimeline extends androidx.media3.common.Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final java.util.HashMap<java.lang.Object, java.lang.Integer> periodIndexByUid;
        private final com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> playlist;
        private final int[] windowIndexByPeriodIndex;

        public PlaylistTimeline(com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> immutableList) {
            int size = immutableList.size();
            this.playlist = immutableList;
            this.firstPeriodIndexByWindowIndex = new int[size];
            int periodCountInMediaItem = 0;
            for (int i = 0; i < size; i++) {
                androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData = immutableList.get(i);
                this.firstPeriodIndexByWindowIndex[i] = periodCountInMediaItem;
                periodCountInMediaItem += getPeriodCountInMediaItem(mediaItemData);
            }
            this.windowIndexByPeriodIndex = new int[periodCountInMediaItem];
            this.periodIndexByUid = new java.util.HashMap<>();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData2 = immutableList.get(i3);
                for (int i4 = 0; i4 < getPeriodCountInMediaItem(mediaItemData2); i4++) {
                    this.periodIndexByUid.put(mediaItemData2.getPeriodUid(i4), java.lang.Integer.valueOf(i2));
                    this.windowIndexByPeriodIndex[i2] = i3;
                    i2++;
                }
            }
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.playlist.size();
        }

        @Override // androidx.media3.common.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
            return super.getNextWindowIndex(i, i2, z);
        }

        @Override // androidx.media3.common.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            return super.getPreviousWindowIndex(i, i2, z);
        }

        @Override // androidx.media3.common.Timeline
        public int getLastWindowIndex(boolean z) {
            return super.getLastWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public int getFirstWindowIndex(boolean z) {
            return super.getFirstWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            return this.playlist.get(i).getWindow(this.firstPeriodIndexByWindowIndex[i], window);
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.windowIndexByPeriodIndex.length;
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriodByUid(java.lang.Object obj, androidx.media3.common.Timeline.Period period) {
            return getPeriod(((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(this.periodIndexByUid.get(obj))).intValue(), period, true);
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            int i2 = this.windowIndexByPeriodIndex[i];
            return this.playlist.get(i2).getPeriod(i2, i - this.firstPeriodIndexByWindowIndex[i2], period);
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            java.lang.Integer num = this.periodIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.common.Timeline
        public java.lang.Object getUidOfPeriod(int i) {
            int i2 = this.windowIndexByPeriodIndex[i];
            return this.playlist.get(i2).getPeriodUid(i - this.firstPeriodIndexByWindowIndex[i2]);
        }

        private static int getPeriodCountInMediaItem(androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData) {
            if (mediaItemData.periods.isEmpty()) {
                return 1;
            }
            return mediaItemData.periods.size();
        }
    }

    protected static final class MediaItemData {
        private final androidx.media3.common.MediaMetadata combinedMediaMetadata;
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;
        public final androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
        public final java.lang.Object manifest;
        public final androidx.media3.common.MediaItem mediaItem;
        public final androidx.media3.common.MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.PeriodData> periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final androidx.media3.common.Tracks tracks;
        public final java.lang.Object uid;
        public final long windowStartTimeMs;

        public static final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;
            private androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
            private java.lang.Object manifest;
            private androidx.media3.common.MediaItem mediaItem;
            private androidx.media3.common.MediaMetadata mediaMetadata;
            private com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.PeriodData> periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private androidx.media3.common.Tracks tracks;
            private java.lang.Object uid;
            private long windowStartTimeMs;

            public Builder(java.lang.Object obj) {
                this.uid = obj;
                this.tracks = androidx.media3.common.Tracks.EMPTY;
                this.mediaItem = androidx.media3.common.MediaItem.EMPTY;
                this.mediaMetadata = null;
                this.manifest = null;
                this.liveConfiguration = null;
                this.presentationStartTimeMs = androidx.media3.common.C.TIME_UNSET;
                this.windowStartTimeMs = androidx.media3.common.C.TIME_UNSET;
                this.elapsedRealtimeEpochOffsetMs = androidx.media3.common.C.TIME_UNSET;
                this.isSeekable = false;
                this.isDynamic = false;
                this.defaultPositionUs = 0L;
                this.durationUs = androidx.media3.common.C.TIME_UNSET;
                this.positionInFirstPeriodUs = 0L;
                this.isPlaceholder = false;
                this.periods = com.google.common.collect.ImmutableList.of();
            }

            private Builder(androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData) {
                this.uid = mediaItemData.uid;
                this.tracks = mediaItemData.tracks;
                this.mediaItem = mediaItemData.mediaItem;
                this.mediaMetadata = mediaItemData.mediaMetadata;
                this.manifest = mediaItemData.manifest;
                this.liveConfiguration = mediaItemData.liveConfiguration;
                this.presentationStartTimeMs = mediaItemData.presentationStartTimeMs;
                this.windowStartTimeMs = mediaItemData.windowStartTimeMs;
                this.elapsedRealtimeEpochOffsetMs = mediaItemData.elapsedRealtimeEpochOffsetMs;
                this.isSeekable = mediaItemData.isSeekable;
                this.isDynamic = mediaItemData.isDynamic;
                this.defaultPositionUs = mediaItemData.defaultPositionUs;
                this.durationUs = mediaItemData.durationUs;
                this.positionInFirstPeriodUs = mediaItemData.positionInFirstPeriodUs;
                this.isPlaceholder = mediaItemData.isPlaceholder;
                this.periods = mediaItemData.periods;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setUid(java.lang.Object obj) {
                this.uid = obj;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setTracks(androidx.media3.common.Tracks tracks) {
                this.tracks = tracks;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setMediaItem(androidx.media3.common.MediaItem mediaItem) {
                this.mediaItem = mediaItem;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setMediaMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
                this.mediaMetadata = mediaMetadata;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setManifest(java.lang.Object obj) {
                this.manifest = obj;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setLiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
                this.liveConfiguration = liveConfiguration;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setPresentationStartTimeMs(long j) {
                this.presentationStartTimeMs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setWindowStartTimeMs(long j) {
                this.windowStartTimeMs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setElapsedRealtimeEpochOffsetMs(long j) {
                this.elapsedRealtimeEpochOffsetMs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setIsSeekable(boolean z) {
                this.isSeekable = z;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setIsDynamic(boolean z) {
                this.isDynamic = z;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setDefaultPositionUs(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j >= 0);
                this.defaultPositionUs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setDurationUs(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j == androidx.media3.common.C.TIME_UNSET || j >= 0);
                this.durationUs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setPositionInFirstPeriodUs(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j >= 0);
                this.positionInFirstPeriodUs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setPeriods(java.util.List<androidx.media3.common.SimpleBasePlayer.PeriodData> list) {
                int size = list.size();
                int i = 0;
                while (i < size - 1) {
                    androidx.media3.common.util.Assertions.checkArgument(list.get(i).durationUs != androidx.media3.common.C.TIME_UNSET, "Periods other than last need a duration");
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < size; i3++) {
                        androidx.media3.common.util.Assertions.checkArgument(!list.get(i).uid.equals(list.get(i3).uid), "Duplicate PeriodData UIDs in period list");
                    }
                    i = i2;
                }
                this.periods = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.MediaItemData build() {
                return new androidx.media3.common.SimpleBasePlayer.MediaItemData(this);
            }
        }

        private MediaItemData(androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder builder) {
            int i = 0;
            if (builder.liveConfiguration == null) {
                androidx.media3.common.util.Assertions.checkArgument(builder.presentationStartTimeMs == androidx.media3.common.C.TIME_UNSET, "presentationStartTimeMs can only be set if liveConfiguration != null");
                androidx.media3.common.util.Assertions.checkArgument(builder.windowStartTimeMs == androidx.media3.common.C.TIME_UNSET, "windowStartTimeMs can only be set if liveConfiguration != null");
                androidx.media3.common.util.Assertions.checkArgument(builder.elapsedRealtimeEpochOffsetMs == androidx.media3.common.C.TIME_UNSET, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (builder.presentationStartTimeMs != androidx.media3.common.C.TIME_UNSET && builder.windowStartTimeMs != androidx.media3.common.C.TIME_UNSET) {
                androidx.media3.common.util.Assertions.checkArgument(builder.windowStartTimeMs >= builder.presentationStartTimeMs, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = builder.periods.size();
            if (builder.durationUs != androidx.media3.common.C.TIME_UNSET) {
                androidx.media3.common.util.Assertions.checkArgument(builder.defaultPositionUs <= builder.durationUs, "defaultPositionUs can't be greater than durationUs");
            }
            this.uid = builder.uid;
            this.tracks = builder.tracks;
            this.mediaItem = builder.mediaItem;
            this.mediaMetadata = builder.mediaMetadata;
            this.manifest = builder.manifest;
            this.liveConfiguration = builder.liveConfiguration;
            this.presentationStartTimeMs = builder.presentationStartTimeMs;
            this.windowStartTimeMs = builder.windowStartTimeMs;
            this.elapsedRealtimeEpochOffsetMs = builder.elapsedRealtimeEpochOffsetMs;
            this.isSeekable = builder.isSeekable;
            this.isDynamic = builder.isDynamic;
            this.defaultPositionUs = builder.defaultPositionUs;
            this.durationUs = builder.durationUs;
            long j = builder.positionInFirstPeriodUs;
            this.positionInFirstPeriodUs = j;
            this.isPlaceholder = builder.isPlaceholder;
            com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.PeriodData> immutableList = builder.periods;
            this.periods = immutableList;
            long[] jArr = new long[immutableList.size()];
            this.periodPositionInWindowUs = jArr;
            if (!immutableList.isEmpty()) {
                jArr[0] = -j;
                while (i < size - 1) {
                    long[] jArr2 = this.periodPositionInWindowUs;
                    int i2 = i + 1;
                    jArr2[i2] = jArr2[i] + this.periods.get(i).durationUs;
                    i = i2;
                }
            }
            androidx.media3.common.MediaMetadata mediaMetadata = this.mediaMetadata;
            this.combinedMediaMetadata = mediaMetadata == null ? getCombinedMediaMetadata(this.mediaItem, this.tracks) : mediaMetadata;
        }

        public androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder buildUpon() {
            return new androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.SimpleBasePlayer.MediaItemData)) {
                return false;
            }
            androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData = (androidx.media3.common.SimpleBasePlayer.MediaItemData) obj;
            return this.uid.equals(mediaItemData.uid) && this.tracks.equals(mediaItemData.tracks) && this.mediaItem.equals(mediaItemData.mediaItem) && androidx.media3.common.util.Util.areEqual(this.mediaMetadata, mediaItemData.mediaMetadata) && androidx.media3.common.util.Util.areEqual(this.manifest, mediaItemData.manifest) && androidx.media3.common.util.Util.areEqual(this.liveConfiguration, mediaItemData.liveConfiguration) && this.presentationStartTimeMs == mediaItemData.presentationStartTimeMs && this.windowStartTimeMs == mediaItemData.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == mediaItemData.elapsedRealtimeEpochOffsetMs && this.isSeekable == mediaItemData.isSeekable && this.isDynamic == mediaItemData.isDynamic && this.defaultPositionUs == mediaItemData.defaultPositionUs && this.durationUs == mediaItemData.durationUs && this.positionInFirstPeriodUs == mediaItemData.positionInFirstPeriodUs && this.isPlaceholder == mediaItemData.isPlaceholder && this.periods.equals(mediaItemData.periods);
        }

        public int hashCode() {
            int iHashCode = (((((217 + this.uid.hashCode()) * 31) + this.tracks.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            androidx.media3.common.MediaMetadata mediaMetadata = this.mediaMetadata;
            int iHashCode2 = (iHashCode + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
            java.lang.Object obj = this.manifest;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode4 = (iHashCode3 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j = this.presentationStartTimeMs;
            int i = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.windowStartTimeMs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            int i3 = (((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31;
            long j4 = this.defaultPositionUs;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.durationUs;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.positionInFirstPeriodUs;
            return ((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.periods.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window) {
            window.set(this.uid, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, this.defaultPositionUs, this.durationUs, i, (i + (this.periods.isEmpty() ? 1 : this.periods.size())) - 1, this.positionInFirstPeriodUs);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.media3.common.Timeline.Period getPeriod(int i, int i2, androidx.media3.common.Timeline.Period period) {
            if (this.periods.isEmpty()) {
                java.lang.Object obj = this.uid;
                period.set(obj, obj, i, this.positionInFirstPeriodUs + this.durationUs, 0L, androidx.media3.common.AdPlaybackState.NONE, this.isPlaceholder);
            } else {
                androidx.media3.common.SimpleBasePlayer.PeriodData periodData = this.periods.get(i2);
                java.lang.Object obj2 = periodData.uid;
                period.set(obj2, android.util.Pair.create(this.uid, obj2), i, periodData.durationUs, this.periodPositionInWindowUs[i2], periodData.adPlaybackState, periodData.isPlaceholder);
            }
            return period;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.Object getPeriodUid(int i) {
            if (this.periods.isEmpty()) {
                return this.uid;
            }
            return android.util.Pair.create(this.uid, this.periods.get(i).uid);
        }

        private static androidx.media3.common.MediaMetadata getCombinedMediaMetadata(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.Tracks tracks) {
            androidx.media3.common.MediaMetadata.Builder builder = new androidx.media3.common.MediaMetadata.Builder();
            int size = tracks.getGroups().size();
            for (int i = 0; i < size; i++) {
                androidx.media3.common.Tracks.Group group = tracks.getGroups().get(i);
                for (int i2 = 0; i2 < group.length; i2++) {
                    if (group.isTrackSelected(i2)) {
                        androidx.media3.common.Format trackFormat = group.getTrackFormat(i2);
                        if (trackFormat.metadata != null) {
                            for (int i3 = 0; i3 < trackFormat.metadata.length(); i3++) {
                                trackFormat.metadata.get(i3).populateMediaMetadata(builder);
                            }
                        }
                    }
                }
            }
            return builder.populate(mediaItem.mediaMetadata).build();
        }
    }

    protected static final class PeriodData {
        public final androidx.media3.common.AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final java.lang.Object uid;

        public static final class Builder {
            private androidx.media3.common.AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private java.lang.Object uid;

            public Builder(java.lang.Object obj) {
                this.uid = obj;
                this.durationUs = 0L;
                this.adPlaybackState = androidx.media3.common.AdPlaybackState.NONE;
                this.isPlaceholder = false;
            }

            private Builder(androidx.media3.common.SimpleBasePlayer.PeriodData periodData) {
                this.uid = periodData.uid;
                this.durationUs = periodData.durationUs;
                this.adPlaybackState = periodData.adPlaybackState;
                this.isPlaceholder = periodData.isPlaceholder;
            }

            public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder setUid(java.lang.Object obj) {
                this.uid = obj;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder setDurationUs(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j == androidx.media3.common.C.TIME_UNSET || j >= 0);
                this.durationUs = j;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder setAdPlaybackState(androidx.media3.common.AdPlaybackState adPlaybackState) {
                this.adPlaybackState = adPlaybackState;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            public androidx.media3.common.SimpleBasePlayer.PeriodData build() {
                return new androidx.media3.common.SimpleBasePlayer.PeriodData(this);
            }
        }

        private PeriodData(androidx.media3.common.SimpleBasePlayer.PeriodData.Builder builder) {
            this.uid = builder.uid;
            this.durationUs = builder.durationUs;
            this.adPlaybackState = builder.adPlaybackState;
            this.isPlaceholder = builder.isPlaceholder;
        }

        public androidx.media3.common.SimpleBasePlayer.PeriodData.Builder buildUpon() {
            return new androidx.media3.common.SimpleBasePlayer.PeriodData.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.SimpleBasePlayer.PeriodData)) {
                return false;
            }
            androidx.media3.common.SimpleBasePlayer.PeriodData periodData = (androidx.media3.common.SimpleBasePlayer.PeriodData) obj;
            return this.uid.equals(periodData.uid) && this.durationUs == periodData.durationUs && this.adPlaybackState.equals(periodData.adPlaybackState) && this.isPlaceholder == periodData.isPlaceholder;
        }

        public int hashCode() {
            int iHashCode = (217 + this.uid.hashCode()) * 31;
            long j = this.durationUs;
            return ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.adPlaybackState.hashCode()) * 31) + (this.isPlaceholder ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface PositionSupplier {
        public static final androidx.media3.common.SimpleBasePlayer.PositionSupplier ZERO = getConstant(0);

        static /* synthetic */ long lambda$getConstant$0(long j) {
            return j;
        }

        long get();

        static androidx.media3.common.SimpleBasePlayer.PositionSupplier getConstant(final long j) {
            return new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return androidx.media3.common.SimpleBasePlayer.PositionSupplier.lambda$getConstant$0(j);
                }
            };
        }

        static androidx.media3.common.SimpleBasePlayer.PositionSupplier getExtrapolating(final long j, final float f) {
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            return new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return androidx.media3.common.SimpleBasePlayer.PositionSupplier.lambda$getExtrapolating$1(j, jElapsedRealtime, f);
                }
            };
        }

        static /* synthetic */ long lambda$getExtrapolating$1(long j, long j2, float f) {
            return j + ((long) ((android.os.SystemClock.elapsedRealtime() - j2) * f));
        }
    }

    protected SimpleBasePlayer(android.os.Looper looper) {
        this(looper, androidx.media3.common.util.Clock.DEFAULT);
    }

    protected SimpleBasePlayer(android.os.Looper looper, androidx.media3.common.util.Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = new java.util.HashSet<>();
        this.period = new androidx.media3.common.Timeline.Period();
        this.listeners = new androidx.media3.common.util.ListenerSet<>(looper, clock, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda47
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                this.f$0.m52lambda$new$0$androidxmedia3commonSimpleBasePlayer((androidx.media3.common.Player.Listener) obj, flagSet);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-common-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ void m52lambda$new$0$androidxmedia3commonSimpleBasePlayer(androidx.media3.common.Player.Listener listener, androidx.media3.common.FlagSet flagSet) {
        listener.onEvents(this, new androidx.media3.common.Player.Events(flagSet));
    }

    @Override // androidx.media3.common.Player
    public final void addListener(androidx.media3.common.Player.Listener listener) {
        this.listeners.add((androidx.media3.common.Player.Listener) androidx.media3.common.util.Assertions.checkNotNull(listener));
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThreadAndInitState();
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public final android.os.Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(final boolean z) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(1)) {
            updateStateForPendingOperation(handleSetPlayWhenReady(z), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda40
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setPlayWhenReady(z, 1).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z ? -1 : this.state.currentMediaItemIndex, z ? androidx.media3.common.C.TIME_UNSET : this.state.contentPositionMsSupplier.get());
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        verifyApplicationThreadAndInitState();
        if (i == -1) {
            i = this.state.currentMediaItemIndex;
            j = this.state.contentPositionMsSupplier.get();
        }
        setMediaItemsInternal(list, i, j);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void setMediaItemsInternal(final java.util.List<androidx.media3.common.MediaItem> list, final int i, final long j) {
        androidx.media3.common.util.Assertions.checkArgument(i == -1 || i >= 0);
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(handleSetMediaItems(list, i, j), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda62
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return this.f$0.m55x396b5ff4(list, state, i, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$setMediaItemsInternal$2$androidx-media3-common-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ androidx.media3.common.SimpleBasePlayer.State m55x396b5ff4(java.util.List list, androidx.media3.common.SimpleBasePlayer.State state, int i, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(getPlaceholderMediaItemData((androidx.media3.common.MediaItem) list.get(i2)));
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, i, j);
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i, final java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThreadAndInitState();
        androidx.media3.common.util.Assertions.checkArgument(i >= 0);
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        int size = state.playlist.size();
        if (!shouldHandleCommand(20) || list.isEmpty()) {
            return;
        }
        final int iMin = java.lang.Math.min(i, size);
        updateStateForPendingOperation(handleAddMediaItems(iMin, list), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda56
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return this.f$0.m50lambda$addMediaItems$3$androidxmedia3commonSimpleBasePlayer(state, list, iMin);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$addMediaItems$3$androidx-media3-common-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ androidx.media3.common.SimpleBasePlayer.State m50lambda$addMediaItems$3$androidxmedia3commonSimpleBasePlayer(androidx.media3.common.SimpleBasePlayer.State state, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(state.playlist);
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(i2 + i, getPlaceholderMediaItemData((androidx.media3.common.MediaItem) list.get(i2)));
        }
        if (!state.playlist.isEmpty()) {
            return getStateWithNewPlaylist(state, arrayList, this.period);
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, state.currentMediaItemIndex, state.contentPositionMsSupplier.get());
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(final int i, int i2, int i3) {
        verifyApplicationThreadAndInitState();
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i2 >= i && i3 >= 0);
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        int size = state.playlist.size();
        if (!shouldHandleCommand(20) || size == 0 || i >= size) {
            return;
        }
        final int iMin = java.lang.Math.min(i2, size);
        final int iMin2 = java.lang.Math.min(i3, state.playlist.size() - (iMin - i));
        if (i == iMin || iMin2 == i) {
            return;
        }
        updateStateForPendingOperation(handleMoveMediaItems(i, iMin, iMin2), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda51
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return this.f$0.m51lambda$moveMediaItems$4$androidxmedia3commonSimpleBasePlayer(state, i, iMin, iMin2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$moveMediaItems$4$androidx-media3-common-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ androidx.media3.common.SimpleBasePlayer.State m51lambda$moveMediaItems$4$androidxmedia3commonSimpleBasePlayer(androidx.media3.common.SimpleBasePlayer.State state, int i, int i2, int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList(state.playlist);
        androidx.media3.common.util.Util.moveItems(arrayList, i, i2, i3);
        return getStateWithNewPlaylist(state, arrayList, this.period);
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(final int i, int i2, final java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThreadAndInitState();
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= i2);
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        int size = state.playlist.size();
        if (!shouldHandleCommand(20) || i > size) {
            return;
        }
        final int iMin = java.lang.Math.min(i2, size);
        updateStateForPendingOperation(handleReplaceMediaItems(i, iMin, list), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda33
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return this.f$0.m54x7bc5132c(state, list, iMin, i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$replaceMediaItems$5$androidx-media3-common-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ androidx.media3.common.SimpleBasePlayer.State m54x7bc5132c(androidx.media3.common.SimpleBasePlayer.State state, java.util.List list, int i, int i2) {
        androidx.media3.common.SimpleBasePlayer.State stateWithNewPlaylistAndPosition;
        java.util.ArrayList arrayList = new java.util.ArrayList(state.playlist);
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(i3 + i, getPlaceholderMediaItemData((androidx.media3.common.MediaItem) list.get(i3)));
        }
        if (!state.playlist.isEmpty()) {
            stateWithNewPlaylistAndPosition = getStateWithNewPlaylist(state, arrayList, this.period);
        } else {
            stateWithNewPlaylistAndPosition = getStateWithNewPlaylistAndPosition(state, arrayList, state.currentMediaItemIndex, state.contentPositionMsSupplier.get());
        }
        if (i2 >= i) {
            return stateWithNewPlaylistAndPosition;
        }
        androidx.media3.common.util.Util.removeRange(arrayList, i2, i);
        return getStateWithNewPlaylist(stateWithNewPlaylistAndPosition, arrayList, this.period);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(final int i, int i2) {
        final int iMin;
        verifyApplicationThreadAndInitState();
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i2 >= i);
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        int size = state.playlist.size();
        if (!shouldHandleCommand(20) || size == 0 || i >= size || i == (iMin = java.lang.Math.min(i2, size))) {
            return;
        }
        updateStateForPendingOperation(handleRemoveMediaItems(i, iMin), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda57
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return this.f$0.m53x3b22ba57(state, i, iMin);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$removeMediaItems$6$androidx-media3-common-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ androidx.media3.common.SimpleBasePlayer.State m53x3b22ba57(androidx.media3.common.SimpleBasePlayer.State state, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(state.playlist);
        androidx.media3.common.util.Util.removeRange(arrayList, i, i2);
        return getStateWithNewPlaylist(state, arrayList, this.period);
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(2)) {
            updateStateForPendingOperation(handlePrepare(), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda53
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setPlayerError(null).setPlaybackState(state2.timeline.isEmpty() ? 4 : 2).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackState;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.PlaybackException getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.state.playerError;
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(final int i) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(15)) {
            updateStateForPendingOperation(handleSetRepeatMode(i), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda42
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setRepeatMode(i).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.state.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(final boolean z) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(14)) {
            updateStateForPendingOperation(handleSetShuffleModeEnabled(z), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda59
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setShuffleModeEnabled(z).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.state.shuffleModeEnabled;
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.state.isLoading;
    }

    @Override // androidx.media3.common.BasePlayer
    public final void seekTo(final int i, final long j, int i2, boolean z) {
        verifyApplicationThreadAndInitState();
        boolean z2 = false;
        androidx.media3.common.util.Assertions.checkArgument(i == -1 || i >= 0);
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(i2)) {
            if (i == -1 || isPlayingAd() || (!state.playlist.isEmpty() && i >= state.playlist.size())) {
                z2 = true;
            }
            final boolean z3 = z2;
            updateStateForPendingOperation(handleSeek(i, j, i2), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda11
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.common.SimpleBasePlayer.lambda$seekTo$10(z3, state, i, j);
                }
            }, !z2, z);
        }
    }

    static /* synthetic */ androidx.media3.common.SimpleBasePlayer.State lambda$seekTo$10(boolean z, androidx.media3.common.SimpleBasePlayer.State state, int i, long j) {
        return z ? state : getStateWithNewPlaylistAndPosition(state, state.playlist, i, j);
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekForwardIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.state.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(final androidx.media3.common.PlaybackParameters playbackParameters) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(13)) {
            updateStateForPendingOperation(handleSetPlaybackParameters(playbackParameters), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda64
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setPlaybackParameters(playbackParameters).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(3)) {
            updateStateForPendingOperation(handleStop(), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda22
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO).setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(androidx.media3.common.SimpleBasePlayer.getContentPositionMsInternal(state2))).setAdBufferedPositionMs(state2.adPositionMsSupplier).setIsLoading(false).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(32)) {
            updateStateForPendingOperation(handleRelease(), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda54
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.common.SimpleBasePlayer.lambda$release$13(state);
                }
            });
            this.released = true;
            this.listeners.release();
            this.state = this.state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO).setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(getContentPositionMsInternal(state))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Tracks getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return getCurrentTracksInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.trackSelectionParameters;
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(final androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(29)) {
            updateStateForPendingOperation(handleSetTrackSelectionParameters(trackSelectionParameters), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda60
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setTrackSelectionParameters(trackSelectionParameters).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaMetadata getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return getMediaMetadataInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.playlistMetadata;
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(final androidx.media3.common.MediaMetadata mediaMetadata) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(19)) {
            updateStateForPendingOperation(handleSetPlaylistMetadata(mediaMetadata), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda4
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setPlaylistMetadata(mediaMetadata).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Timeline getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.state.timeline;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.state, this.window, this.period);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            this.state.timeline.getPeriod(getCurrentPeriodIndex(), this.period);
            return androidx.media3.common.util.Util.usToMs(this.period.getAdDurationUs(this.state.currentAdGroupIndex, this.state.currentAdIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? this.state.adPositionMsSupplier.get() : getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            return java.lang.Math.max(this.state.adBufferedPositionMsSupplier.get(), this.state.adPositionMsSupplier.get());
        }
        return getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.state.totalBufferedDurationMsSupplier.get();
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex != -1;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdIndexInAdGroup;
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return java.lang.Math.max(getContentBufferedPositionMsInternal(this.state), getContentPositionMsInternal(this.state));
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.AudioAttributes getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.state.audioAttributes;
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(final float f) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(24)) {
            updateStateForPendingOperation(handleSetVolume(f), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda48
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setVolume(f).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.volume;
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(android.view.Surface surface) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surface == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surface), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda63
                    @Override // com.google.common.base.Supplier
                    public final java.lang.Object get() {
                        return state.buildUpon().setSurfaceSize(androidx.media3.common.util.Size.UNKNOWN).build();
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(final android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceHolder), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda3
                    @Override // com.google.common.base.Supplier
                    public final java.lang.Object get() {
                        return state.buildUpon().setSurfaceSize(androidx.media3.common.SimpleBasePlayer.getSurfaceHolderSize(surfaceHolder)).build();
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(final android.view.SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceView), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda58
                    @Override // com.google.common.base.Supplier
                    public final java.lang.Object get() {
                        return state.buildUpon().setSurfaceSize(androidx.media3.common.SimpleBasePlayer.getSurfaceHolderSize(surfaceView.getHolder())).build();
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(android.view.TextureView textureView) {
        final androidx.media3.common.util.Size size;
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(27)) {
            if (textureView == null) {
                clearVideoSurface();
                return;
            }
            if (textureView.isAvailable()) {
                size = new androidx.media3.common.util.Size(textureView.getWidth(), textureView.getHeight());
            } else {
                size = androidx.media3.common.util.Size.ZERO;
            }
            updateStateForPendingOperation(handleSetVideoOutput(textureView), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda39
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setSurfaceSize(size).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(android.view.Surface surface) {
        clearVideoOutput(surface);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(android.view.TextureView textureView) {
        clearVideoOutput(textureView);
    }

    private void clearVideoOutput(java.lang.Object obj) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(27)) {
            updateStateForPendingOperation(handleClearVideoOutput(obj), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda52
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setSurfaceSize(androidx.media3.common.util.Size.ZERO).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.VideoSize getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.state.videoSize;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.util.Size getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.state.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.text.CueGroup getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.state.currentCues;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.DeviceInfo getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceVolume;
    }

    @Override // androidx.media3.common.Player
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.state.isDeviceMuted;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void setDeviceVolume(final int i) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i, 1), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setDeviceVolume(i).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(final int i, int i2) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i, i2), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda61
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setDeviceVolume(i).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(1), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda55
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(state2.deviceVolume + 1).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(i), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(state2.deviceVolume + 1).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(1), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda49
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(java.lang.Math.max(0, state2.deviceVolume - 1)).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(i), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda44
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(java.lang.Math.max(0, state2.deviceVolume - 1)).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void setDeviceMuted(final boolean z) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, 1), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda41
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setIsDeviceMuted(z).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(final boolean z, int i) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, i), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda50
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setIsDeviceMuted(z).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(final androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        verifyApplicationThreadAndInitState();
        final androidx.media3.common.SimpleBasePlayer.State state = this.state;
        if (shouldHandleCommand(35)) {
            updateStateForPendingOperation(handleSetAudioAttributes(audioAttributes, z), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return state.buildUpon().setAudioAttributes(audioAttributes).build();
                }
            });
        }
    }

    protected final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    protected androidx.media3.common.SimpleBasePlayer.MediaItemData getPlaceholderMediaItemData(androidx.media3.common.MediaItem mediaItem) {
        return new androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder(new androidx.media3.common.SimpleBasePlayer.PlaceholderUid()).setMediaItem(mediaItem).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlayWhenReady(boolean z) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handlePrepare() {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleStop() {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleRelease() {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetRepeatMode(int i) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetShuffleModeEnabled(boolean z) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetVolume(float f) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetDeviceVolume(int i, int i2) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleIncreaseDeviceVolume(int i) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleDecreaseDeviceVolume(int i) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetDeviceMuted(boolean z, int i) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetVideoOutput(java.lang.Object obj) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleClearVideoOutput(java.lang.Object obj) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleAddMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleMoveMediaItems(int i, int i2, int i3) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleReplaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        com.google.common.util.concurrent.ListenableFuture<?> listenableFutureHandleAddMediaItems = handleAddMediaItems(i2, list);
        final com.google.common.util.concurrent.ListenableFuture<?> listenableFutureHandleRemoveMediaItems = handleRemoveMediaItems(i, i2);
        return androidx.media3.common.util.Util.transformFutureAsync(listenableFutureHandleAddMediaItems, new com.google.common.util.concurrent.AsyncFunction() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda43
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return androidx.media3.common.SimpleBasePlayer.lambda$handleReplaceMediaItems$31(listenableFutureHandleRemoveMediaItems, obj);
            }
        });
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleRemoveMediaItems(int i, int i2) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSeek(int i, long j, int i2) {
        throw new java.lang.IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    protected final void verifyApplicationThread() {
        if (java.lang.Thread.currentThread() != this.applicationLooper.getThread()) {
            throw new java.lang.IllegalStateException(androidx.media3.common.util.Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", java.lang.Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private boolean shouldHandleCommand(int i) {
        return !this.released && this.state.availableCommands.contains(i);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void updateStateAndInformListeners(final androidx.media3.common.SimpleBasePlayer.State state, boolean z, boolean z2) {
        androidx.media3.common.SimpleBasePlayer.State state2 = this.state;
        this.state = state;
        if (state.hasPositionDiscontinuity || state.newlyRenderedFirstFrame) {
            this.state = this.state.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        boolean z3 = state2.playWhenReady != state.playWhenReady;
        boolean z4 = state2.playbackState != state.playbackState;
        androidx.media3.common.Tracks currentTracksInternal = getCurrentTracksInternal(state2);
        final androidx.media3.common.Tracks currentTracksInternal2 = getCurrentTracksInternal(state);
        androidx.media3.common.MediaMetadata mediaMetadataInternal = getMediaMetadataInternal(state2);
        final androidx.media3.common.MediaMetadata mediaMetadataInternal2 = getMediaMetadataInternal(state);
        final int positionDiscontinuityReason = getPositionDiscontinuityReason(state2, state, z, this.window, this.period);
        boolean z5 = !state2.timeline.equals(state.timeline);
        final int mediaItemTransitionReason = getMediaItemTransitionReason(state2, state, positionDiscontinuityReason, z2, this.window);
        if (z5) {
            final int timelineChangeReason = getTimelineChangeReason(state2.playlist, state.playlist);
            this.listeners.queueEvent(0, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.Player.Listener listener = (androidx.media3.common.Player.Listener) obj;
                    listener.onTimelineChanged(state.timeline, timelineChangeReason);
                }
            });
        }
        if (positionDiscontinuityReason != -1) {
            final androidx.media3.common.Player.PositionInfo positionInfo = getPositionInfo(state2, false, this.window, this.period);
            final androidx.media3.common.Player.PositionInfo positionInfo2 = getPositionInfo(state, state.hasPositionDiscontinuity, this.window, this.period);
            this.listeners.queueEvent(11, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda17
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.SimpleBasePlayer.lambda$updateStateAndInformListeners$33(positionDiscontinuityReason, positionInfo, positionInfo2, (androidx.media3.common.Player.Listener) obj);
                }
            });
        }
        if (mediaItemTransitionReason != -1) {
            final androidx.media3.common.MediaItem mediaItem = state.timeline.isEmpty() ? null : state.playlist.get(getCurrentMediaItemIndexInternal(state)).mediaItem;
            this.listeners.queueEvent(1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda29
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMediaItemTransition(mediaItem, mediaItemTransitionReason);
                }
            });
        }
        if (!androidx.media3.common.util.Util.areEqual(state2.playerError, state.playerError)) {
            this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda31
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlayerErrorChanged(state.playerError);
                }
            });
            if (state.playerError != null) {
                this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda32
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onPlayerError((androidx.media3.common.PlaybackException) androidx.media3.common.util.Util.castNonNull(state.playerError));
                    }
                });
            }
        }
        if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
            this.listeners.queueEvent(19, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda34
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onTrackSelectionParametersChanged(state.trackSelectionParameters);
                }
            });
        }
        if (!currentTracksInternal.equals(currentTracksInternal2)) {
            this.listeners.queueEvent(2, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda35
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onTracksChanged(currentTracksInternal2);
                }
            });
        }
        if (!mediaMetadataInternal.equals(mediaMetadataInternal2)) {
            this.listeners.queueEvent(14, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda36
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMediaMetadataChanged(mediaMetadataInternal2);
                }
            });
        }
        if (state2.isLoading != state.isLoading) {
            this.listeners.queueEvent(3, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda37
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.SimpleBasePlayer.lambda$updateStateAndInformListeners$40(state, (androidx.media3.common.Player.Listener) obj);
                }
            });
        }
        if (z3 || z4) {
            this.listeners.queueEvent(-1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda38
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.SimpleBasePlayer.State state3 = state;
                    ((androidx.media3.common.Player.Listener) obj).onPlayerStateChanged(state3.playWhenReady, state3.playbackState);
                }
            });
        }
        if (z4) {
            this.listeners.queueEvent(4, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda6
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackStateChanged(state.playbackState);
                }
            });
        }
        if (z3 || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda7
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.SimpleBasePlayer.State state3 = state;
                    ((androidx.media3.common.Player.Listener) obj).onPlayWhenReadyChanged(state3.playWhenReady, state3.playWhenReadyChangeReason);
                }
            });
        }
        if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda8
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackSuppressionReasonChanged(state.playbackSuppressionReason);
                }
            });
        }
        if (isPlaying(state2) != isPlaying(state)) {
            this.listeners.queueEvent(7, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda9
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onIsPlayingChanged(androidx.media3.common.SimpleBasePlayer.isPlaying(state));
                }
            });
        }
        if (!state2.playbackParameters.equals(state.playbackParameters)) {
            this.listeners.queueEvent(12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda10
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackParametersChanged(state.playbackParameters);
                }
            });
        }
        if (state2.repeatMode != state.repeatMode) {
            this.listeners.queueEvent(8, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda12
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onRepeatModeChanged(state.repeatMode);
                }
            });
        }
        if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda13
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onShuffleModeEnabledChanged(state.shuffleModeEnabled);
                }
            });
        }
        if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
            this.listeners.queueEvent(16, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda14
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onSeekBackIncrementChanged(state.seekBackIncrementMs);
                }
            });
        }
        if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
            this.listeners.queueEvent(17, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda15
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onSeekForwardIncrementChanged(state.seekForwardIncrementMs);
                }
            });
        }
        if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
            this.listeners.queueEvent(18, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda16
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMaxSeekToPreviousPositionChanged(state.maxSeekToPreviousPositionMs);
                }
            });
        }
        if (!state2.audioAttributes.equals(state.audioAttributes)) {
            this.listeners.queueEvent(20, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda18
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onAudioAttributesChanged(state.audioAttributes);
                }
            });
        }
        if (!state2.videoSize.equals(state.videoSize)) {
            this.listeners.queueEvent(25, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda19
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onVideoSizeChanged(state.videoSize);
                }
            });
        }
        if (!state2.deviceInfo.equals(state.deviceInfo)) {
            this.listeners.queueEvent(29, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda20
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onDeviceInfoChanged(state.deviceInfo);
                }
            });
        }
        if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
            this.listeners.queueEvent(15, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda21
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaylistMetadataChanged(state.playlistMetadata);
                }
            });
        }
        if (state.newlyRenderedFirstFrame) {
            this.listeners.queueEvent(26, new androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda23());
        }
        if (!state2.surfaceSize.equals(state.surfaceSize)) {
            this.listeners.queueEvent(24, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda24
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.SimpleBasePlayer.State state3 = state;
                    ((androidx.media3.common.Player.Listener) obj).onSurfaceSizeChanged(state3.surfaceSize.getWidth(), state3.surfaceSize.getHeight());
                }
            });
        }
        if (state2.volume != state.volume) {
            this.listeners.queueEvent(22, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda25
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onVolumeChanged(state.volume);
                }
            });
        }
        if (state2.deviceVolume != state.deviceVolume || state2.isDeviceMuted != state.isDeviceMuted) {
            this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda26
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.SimpleBasePlayer.State state3 = state;
                    ((androidx.media3.common.Player.Listener) obj).onDeviceVolumeChanged(state3.deviceVolume, state3.isDeviceMuted);
                }
            });
        }
        if (!state2.currentCues.equals(state.currentCues)) {
            this.listeners.queueEvent(27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda27
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.SimpleBasePlayer.lambda$updateStateAndInformListeners$59(state, (androidx.media3.common.Player.Listener) obj);
                }
            });
        }
        if (!state2.timedMetadata.equals(state.timedMetadata) && state.timedMetadata.presentationTimeUs != androidx.media3.common.C.TIME_UNSET) {
            this.listeners.queueEvent(28, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda28
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMetadata(state.timedMetadata);
                }
            });
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            this.listeners.queueEvent(13, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda30
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onAvailableCommandsChanged(state.availableCommands);
                }
            });
        }
        this.listeners.flushEvents();
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$33(int i, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, androidx.media3.common.Player.Listener listener) {
        listener.onPositionDiscontinuity(i);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$40(androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.Player.Listener listener) {
        listener.onLoadingChanged(state.isLoading);
        listener.onIsLoadingChanged(state.isLoading);
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$59(androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.Player.Listener listener) {
        listener.onCues(state.currentCues.cues);
        listener.onCues(state.currentCues);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"state"})
    private void verifyApplicationThreadAndInitState() {
        verifyApplicationThread();
        if (this.state == null) {
            this.state = getState();
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void updateStateForPendingOperation(com.google.common.util.concurrent.ListenableFuture<?> listenableFuture, com.google.common.base.Supplier<androidx.media3.common.SimpleBasePlayer.State> supplier) {
        updateStateForPendingOperation(listenableFuture, supplier, false, false);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void updateStateForPendingOperation(final com.google.common.util.concurrent.ListenableFuture<?> listenableFuture, com.google.common.base.Supplier<androidx.media3.common.SimpleBasePlayer.State> supplier, boolean z, boolean z2) {
        if (listenableFuture.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState(), z, z2);
            return;
        }
        this.pendingOperations.add(listenableFuture);
        updateStateAndInformListeners(getPlaceholderState(supplier.get()), z, z2);
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m56x9bf3217a(listenableFuture);
            }
        }, new java.util.concurrent.Executor() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda46
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                this.f$0.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateStateForPendingOperation$62$androidx-media3-common-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ void m56x9bf3217a(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        androidx.media3.common.util.Util.castNonNull(this.state);
        this.pendingOperations.remove(listenableFuture);
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(java.lang.Runnable runnable) {
        if (this.applicationHandler.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    private static boolean isPlaying(androidx.media3.common.SimpleBasePlayer.State state) {
        return state.playWhenReady && state.playbackState == 3 && state.playbackSuppressionReason == 0;
    }

    private static androidx.media3.common.Tracks getCurrentTracksInternal(androidx.media3.common.SimpleBasePlayer.State state) {
        if (state.playlist.isEmpty()) {
            return androidx.media3.common.Tracks.EMPTY;
        }
        return state.playlist.get(getCurrentMediaItemIndexInternal(state)).tracks;
    }

    private static androidx.media3.common.MediaMetadata getMediaMetadataInternal(androidx.media3.common.SimpleBasePlayer.State state) {
        if (!state.playlist.isEmpty()) {
            return state.playlist.get(getCurrentMediaItemIndexInternal(state)).combinedMediaMetadata;
        }
        return androidx.media3.common.MediaMetadata.EMPTY;
    }

    private static int getCurrentMediaItemIndexInternal(androidx.media3.common.SimpleBasePlayer.State state) {
        if (state.currentMediaItemIndex != -1) {
            return state.currentMediaItemIndex;
        }
        return 0;
    }

    private static long getContentPositionMsInternal(androidx.media3.common.SimpleBasePlayer.State state) {
        return getPositionOrDefaultInMediaItem(state.contentPositionMsSupplier.get(), state);
    }

    private static long getContentBufferedPositionMsInternal(androidx.media3.common.SimpleBasePlayer.State state) {
        return getPositionOrDefaultInMediaItem(state.contentBufferedPositionMsSupplier.get(), state);
    }

    private static long getPositionOrDefaultInMediaItem(long j, androidx.media3.common.SimpleBasePlayer.State state) {
        if (j != androidx.media3.common.C.TIME_UNSET) {
            return j;
        }
        if (state.playlist.isEmpty()) {
            return 0L;
        }
        return androidx.media3.common.util.Util.usToMs(state.playlist.get(getCurrentMediaItemIndexInternal(state)).defaultPositionUs);
    }

    private static int getCurrentPeriodIndexInternal(androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        return state.timeline.isEmpty() ? currentMediaItemIndexInternal : getPeriodIndexFromWindowPosition(state.timeline, currentMediaItemIndexInternal, getContentPositionMsInternal(state), window, period);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(androidx.media3.common.Timeline timeline, int i, long j, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i, androidx.media3.common.util.Util.msToUs(j)).first);
    }

    private static int getTimelineChangeReason(java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list, java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list2) {
        if (list.size() != list2.size()) {
            return 0;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                return 1;
            }
            java.lang.Object obj = list.get(i).uid;
            java.lang.Object obj2 = list2.get(i).uid;
            boolean z = (obj instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid) && !(obj2 instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid);
            if (!obj.equals(obj2) && !z) {
                return 0;
            }
            i++;
        }
    }

    private static int getPositionDiscontinuityReason(androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.SimpleBasePlayer.State state2, boolean z, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        if (state2.hasPositionDiscontinuity) {
            return state2.positionDiscontinuityReason;
        }
        if (z) {
            return 1;
        }
        if (state.playlist.isEmpty()) {
            return -1;
        }
        if (state2.playlist.isEmpty()) {
            return 4;
        }
        java.lang.Object uidOfPeriod = state.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state, window, period));
        java.lang.Object uidOfPeriod2 = state2.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state2, window, period));
        if ((uidOfPeriod instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid) && !(uidOfPeriod2 instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid)) {
            return -1;
        }
        if (!uidOfPeriod2.equals(uidOfPeriod) || state.currentAdGroupIndex != state2.currentAdGroupIndex || state.currentAdIndexInAdGroup != state2.currentAdIndexInAdGroup) {
            if (state2.timeline.getIndexOfPeriod(uidOfPeriod) == -1) {
                return 4;
            }
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period);
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
            return (periodOrAdDurationMs == androidx.media3.common.C.TIME_UNSET || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 3 : 0;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period);
        if (java.lang.Math.abs(currentPeriodOrAdPositionMs2 - getCurrentPeriodOrAdPositionMs(state2, uidOfPeriod2, period)) < 1000) {
            return -1;
        }
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
        return (periodOrAdDurationMs2 == androidx.media3.common.C.TIME_UNSET || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 5 : 0;
    }

    private static long getCurrentPeriodOrAdPositionMs(androidx.media3.common.SimpleBasePlayer.State state, java.lang.Object obj, androidx.media3.common.Timeline.Period period) {
        if (state.currentAdGroupIndex != -1) {
            return state.adPositionMsSupplier.get();
        }
        return getContentPositionMsInternal(state) - state.timeline.getPeriodByUid(obj, period).getPositionInWindowMs();
    }

    private static long getPeriodOrAdDurationMs(androidx.media3.common.SimpleBasePlayer.State state, java.lang.Object obj, androidx.media3.common.Timeline.Period period) {
        long adDurationUs;
        state.timeline.getPeriodByUid(obj, period);
        if (state.currentAdGroupIndex == -1) {
            adDurationUs = period.durationUs;
        } else {
            adDurationUs = period.getAdDurationUs(state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
        }
        return androidx.media3.common.util.Util.usToMs(adDurationUs);
    }

    private static androidx.media3.common.Player.PositionInfo getPositionInfo(androidx.media3.common.SimpleBasePlayer.State state, boolean z, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        java.lang.Object obj;
        androidx.media3.common.MediaItem mediaItem;
        java.lang.Object obj2;
        int i;
        long j;
        long contentPositionMsInternal;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        if (state.timeline.isEmpty()) {
            obj = null;
            mediaItem = null;
            obj2 = null;
            i = -1;
        } else {
            int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(state, window, period);
            java.lang.Object obj3 = state.timeline.getPeriod(currentPeriodIndexInternal, period, true).uid;
            java.lang.Object obj4 = state.timeline.getWindow(currentMediaItemIndexInternal, window).uid;
            i = currentPeriodIndexInternal;
            mediaItem = window.mediaItem;
            obj = obj4;
            obj2 = obj3;
        }
        if (z) {
            j = state.discontinuityPositionMs;
            contentPositionMsInternal = state.currentAdGroupIndex == -1 ? j : getContentPositionMsInternal(state);
        } else {
            long contentPositionMsInternal2 = getContentPositionMsInternal(state);
            j = state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : contentPositionMsInternal2;
            contentPositionMsInternal = contentPositionMsInternal2;
        }
        return new androidx.media3.common.Player.PositionInfo(obj, currentMediaItemIndexInternal, mediaItem, obj2, i, j, contentPositionMsInternal, state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
    }

    private static int getMediaItemTransitionReason(androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.SimpleBasePlayer.State state2, int i, boolean z, androidx.media3.common.Timeline.Window window) {
        androidx.media3.common.Timeline timeline = state.timeline;
        androidx.media3.common.Timeline timeline2 = state2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return -1;
        }
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return 3;
        }
        java.lang.Object obj = state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid;
        java.lang.Object obj2 = state2.timeline.getWindow(getCurrentMediaItemIndexInternal(state2), window).uid;
        if ((obj instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid) && !(obj2 instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i == 0) {
                return 1;
            }
            return i == 1 ? 2 : 3;
        }
        if (i != 0 || getContentPositionMsInternal(state) <= getContentPositionMsInternal(state2)) {
            return (i == 1 && z) ? 2 : -1;
        }
        return 0;
    }

    private static androidx.media3.common.util.Size getSurfaceHolderSize(android.view.SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return androidx.media3.common.util.Size.ZERO;
        }
        android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new androidx.media3.common.util.Size(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getMediaItemIndexInNewPlaylist(java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list, androidx.media3.common.Timeline timeline, int i, androidx.media3.common.Timeline.Period period) {
        if (!list.isEmpty()) {
            java.lang.Object periodUid = list.get(i).getPeriodUid(0);
            if (timeline.getIndexOfPeriod(periodUid) == -1) {
                return -1;
            }
            return timeline.getPeriodByUid(periodUid, period).windowIndex;
        }
        if (i < timeline.getWindowCount()) {
            return i;
        }
        return -1;
    }

    private static androidx.media3.common.SimpleBasePlayer.State getStateWithNewPlaylist(androidx.media3.common.SimpleBasePlayer.State state, java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list, androidx.media3.common.Timeline.Period period) {
        androidx.media3.common.SimpleBasePlayer.State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setPlaylist(list);
        androidx.media3.common.Timeline timeline = builderBuildUpon.timeline;
        long j = state.contentPositionMsSupplier.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(state.playlist, timeline, currentMediaItemIndexInternal, period);
        long j2 = mediaItemIndexInNewPlaylist == -1 ? androidx.media3.common.C.TIME_UNSET : j;
        for (int i = currentMediaItemIndexInternal + 1; mediaItemIndexInNewPlaylist == -1 && i < state.playlist.size(); i++) {
            mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(state.playlist, timeline, i, period);
        }
        if (state.playbackState != 1 && mediaItemIndexInNewPlaylist == -1) {
            builderBuildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return buildStateForNewPosition(builderBuildUpon, state, j, list, mediaItemIndexInNewPlaylist, j2, true);
    }

    private static androidx.media3.common.SimpleBasePlayer.State getStateWithNewPlaylistAndPosition(androidx.media3.common.SimpleBasePlayer.State state, java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list, int i, long j) {
        androidx.media3.common.SimpleBasePlayer.State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setPlaylist(list);
        if (state.playbackState != 1) {
            if (list.isEmpty() || (i != -1 && i >= list.size())) {
                builderBuildUpon.setPlaybackState(4).setIsLoading(false);
            } else {
                builderBuildUpon.setPlaybackState(2);
            }
        }
        return buildStateForNewPosition(builderBuildUpon, state, state.contentPositionMsSupplier.get(), list, i, j, false);
    }

    private static androidx.media3.common.SimpleBasePlayer.State buildStateForNewPosition(androidx.media3.common.SimpleBasePlayer.State.Builder builder, androidx.media3.common.SimpleBasePlayer.State state, long j, java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list, int i, long j2, boolean z) {
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j, state);
        boolean z2 = false;
        if (!list.isEmpty() && (i == -1 || i >= list.size())) {
            j2 = -9223372036854775807L;
            i = 0;
        }
        if (!list.isEmpty() && j2 == androidx.media3.common.C.TIME_UNSET) {
            j2 = androidx.media3.common.util.Util.usToMs(list.get(i).defaultPositionUs);
        }
        boolean z3 = state.playlist.isEmpty() || list.isEmpty();
        if (!z3 && !state.playlist.get(getCurrentMediaItemIndexInternal(state)).uid.equals(list.get(i).uid)) {
            z2 = true;
        }
        if (z3 || z2 || j2 < positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i).setCurrentAd(-1, -1).setContentPositionMs(j2).setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(j2)).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO);
        } else if (j2 == positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i);
            if (state.currentAdGroupIndex != -1 && z) {
                builder.setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(state.adBufferedPositionMsSupplier.get() - state.adPositionMsSupplier.get()));
            } else {
                builder.setCurrentAd(-1, -1).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(getContentBufferedPositionMsInternal(state) - positionOrDefaultInMediaItem));
            }
        } else {
            builder.setCurrentMediaItemIndex(i).setCurrentAd(-1, -1).setContentPositionMs(j2).setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(java.lang.Math.max(getContentBufferedPositionMsInternal(state), j2))).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(java.lang.Math.max(0L, state.totalBufferedDurationMsSupplier.get() - (j2 - positionOrDefaultInMediaItem))));
        }
        return builder.build();
    }

    private static final class PlaceholderUid {
        private PlaceholderUid() {
        }
    }
}
