package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingPlayer implements androidx.media3.common.Player {
    private final androidx.media3.common.Player player;

    public ForwardingPlayer(androidx.media3.common.Player player) {
        this.player = player;
    }

    @Override // androidx.media3.common.Player
    public android.os.Looper getApplicationLooper() {
        return this.player.getApplicationLooper();
    }

    @Override // androidx.media3.common.Player
    public void addListener(androidx.media3.common.Player.Listener listener) {
        this.player.addListener(new androidx.media3.common.ForwardingPlayer.ForwardingListener(this, listener));
    }

    @Override // androidx.media3.common.Player
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        this.player.removeListener(new androidx.media3.common.ForwardingPlayer.ForwardingListener(this, listener));
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        this.player.setMediaItems(list);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z) {
        this.player.setMediaItems(list, z);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        this.player.setMediaItems(list, i, j);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.player.setMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        this.player.setMediaItem(mediaItem, j);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z) {
        this.player.setMediaItem(mediaItem, z);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.player.addMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        this.player.addMediaItem(i, mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        this.player.addMediaItems(list);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        this.player.addMediaItems(i, list);
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItem(int i, int i2) {
        this.player.moveMediaItem(i, i2);
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItems(int i, int i2, int i3) {
        this.player.moveMediaItems(i, i2, i3);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        this.player.replaceMediaItem(i, mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        this.player.replaceMediaItems(i, i2, list);
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItem(int i) {
        this.player.removeMediaItem(i);
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItems(int i, int i2) {
        this.player.removeMediaItems(i, i2);
    }

    @Override // androidx.media3.common.Player
    public void clearMediaItems() {
        this.player.clearMediaItems();
    }

    @Override // androidx.media3.common.Player
    public boolean isCommandAvailable(int i) {
        return this.player.isCommandAvailable(i);
    }

    @Override // androidx.media3.common.Player
    public boolean canAdvertiseSession() {
        return this.player.canAdvertiseSession();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        return this.player.getAvailableCommands();
    }

    @Override // androidx.media3.common.Player
    public void prepare() {
        this.player.prepare();
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        return this.player.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.Player
    public boolean isPlaying() {
        return this.player.isPlaying();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.PlaybackException getPlayerError() {
        return this.player.getPlayerError();
    }

    @Override // androidx.media3.common.Player
    public void play() {
        this.player.play();
    }

    @Override // androidx.media3.common.Player
    public void pause() {
        this.player.pause();
    }

    @Override // androidx.media3.common.Player
    public void setPlayWhenReady(boolean z) {
        this.player.setPlayWhenReady(z);
    }

    @Override // androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    @Override // androidx.media3.common.Player
    public void setRepeatMode(int i) {
        this.player.setRepeatMode(i);
    }

    @Override // androidx.media3.common.Player
    public int getRepeatMode() {
        return this.player.getRepeatMode();
    }

    @Override // androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z) {
        this.player.setShuffleModeEnabled(z);
    }

    @Override // androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        return this.player.getShuffleModeEnabled();
    }

    @Override // androidx.media3.common.Player
    public boolean isLoading() {
        return this.player.isLoading();
    }

    @Override // androidx.media3.common.Player
    public void seekToDefaultPosition() {
        this.player.seekToDefaultPosition();
    }

    @Override // androidx.media3.common.Player
    public void seekToDefaultPosition(int i) {
        this.player.seekToDefaultPosition(i);
    }

    @Override // androidx.media3.common.Player
    public void seekTo(long j) {
        this.player.seekTo(j);
    }

    @Override // androidx.media3.common.Player
    public void seekTo(int i, long j) {
        this.player.seekTo(i, j);
    }

    @Override // androidx.media3.common.Player
    public long getSeekBackIncrement() {
        return this.player.getSeekBackIncrement();
    }

    @Override // androidx.media3.common.Player
    public void seekBack() {
        this.player.seekBack();
    }

    @Override // androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        return this.player.getSeekForwardIncrement();
    }

    @Override // androidx.media3.common.Player
    public void seekForward() {
        this.player.seekForward();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean hasPrevious() {
        return this.player.hasPrevious();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean hasPreviousWindow() {
        return this.player.hasPreviousWindow();
    }

    @Override // androidx.media3.common.Player
    public boolean hasPreviousMediaItem() {
        return this.player.hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void previous() {
        this.player.previous();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void seekToPreviousWindow() {
        this.player.seekToPreviousWindow();
    }

    @Override // androidx.media3.common.Player
    public void seekToPreviousMediaItem() {
        this.player.seekToPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    public void seekToPrevious() {
        this.player.seekToPrevious();
    }

    @Override // androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        return this.player.getMaxSeekToPreviousPosition();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean hasNext() {
        return this.player.hasNext();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean hasNextWindow() {
        return this.player.hasNextWindow();
    }

    @Override // androidx.media3.common.Player
    public boolean hasNextMediaItem() {
        return this.player.hasNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void next() {
        this.player.next();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void seekToNextWindow() {
        this.player.seekToNextWindow();
    }

    @Override // androidx.media3.common.Player
    public void seekToNextMediaItem() {
        this.player.seekToNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public void seekToNext() {
        this.player.seekToNext();
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackSpeed(float f) {
        this.player.setPlaybackSpeed(f);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.player.getPlaybackParameters();
    }

    @Override // androidx.media3.common.Player
    public void stop() {
        this.player.stop();
    }

    @Override // androidx.media3.common.Player
    public void release() {
        this.player.release();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Tracks getCurrentTracks() {
        return this.player.getCurrentTracks();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        return this.player.getTrackSelectionParameters();
    }

    @Override // androidx.media3.common.Player
    public void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        this.player.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        return this.player.getMediaMetadata();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        return this.player.getPlaylistMetadata();
    }

    @Override // androidx.media3.common.Player
    public void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        this.player.setPlaylistMetadata(mediaMetadata);
    }

    @Override // androidx.media3.common.Player
    public java.lang.Object getCurrentManifest() {
        return this.player.getCurrentManifest();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Timeline getCurrentTimeline() {
        return this.player.getCurrentTimeline();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        return this.player.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public int getCurrentWindowIndex() {
        return this.player.getCurrentWindowIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        return this.player.getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public int getNextWindowIndex() {
        return this.player.getNextWindowIndex();
    }

    @Override // androidx.media3.common.Player
    public int getNextMediaItemIndex() {
        return this.player.getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public int getPreviousWindowIndex() {
        return this.player.getPreviousWindowIndex();
    }

    @Override // androidx.media3.common.Player
    public int getPreviousMediaItemIndex() {
        return this.player.getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaItem getCurrentMediaItem() {
        return this.player.getCurrentMediaItem();
    }

    @Override // androidx.media3.common.Player
    public int getMediaItemCount() {
        return this.player.getMediaItemCount();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaItem getMediaItemAt(int i) {
        return this.player.getMediaItemAt(i);
    }

    @Override // androidx.media3.common.Player
    public long getDuration() {
        return this.player.getDuration();
    }

    @Override // androidx.media3.common.Player
    public long getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    @Override // androidx.media3.common.Player
    public long getBufferedPosition() {
        return this.player.getBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public int getBufferedPercentage() {
        return this.player.getBufferedPercentage();
    }

    @Override // androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        return this.player.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean isCurrentWindowDynamic() {
        return this.player.isCurrentWindowDynamic();
    }

    @Override // androidx.media3.common.Player
    public boolean isCurrentMediaItemDynamic() {
        return this.player.isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean isCurrentWindowLive() {
        return this.player.isCurrentWindowLive();
    }

    @Override // androidx.media3.common.Player
    public boolean isCurrentMediaItemLive() {
        return this.player.isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.Player
    public long getCurrentLiveOffset() {
        return this.player.getCurrentLiveOffset();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean isCurrentWindowSeekable() {
        return this.player.isCurrentWindowSeekable();
    }

    @Override // androidx.media3.common.Player
    public boolean isCurrentMediaItemSeekable() {
        return this.player.isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.Player
    public boolean isPlayingAd() {
        return this.player.isPlayingAd();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        return this.player.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        return this.player.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.Player
    public long getContentDuration() {
        return this.player.getContentDuration();
    }

    @Override // androidx.media3.common.Player
    public long getContentPosition() {
        return this.player.getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public long getContentBufferedPosition() {
        return this.player.getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.player.getAudioAttributes();
    }

    @Override // androidx.media3.common.Player
    public void setVolume(float f) {
        this.player.setVolume(f);
    }

    @Override // androidx.media3.common.Player
    public float getVolume() {
        return this.player.getVolume();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.VideoSize getVideoSize() {
        return this.player.getVideoSize();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.util.Size getSurfaceSize() {
        return this.player.getSurfaceSize();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface() {
        this.player.clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface(android.view.Surface surface) {
        this.player.clearVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurface(android.view.Surface surface) {
        this.player.setVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        this.player.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        this.player.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        this.player.setVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        this.player.clearVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void setVideoTextureView(android.view.TextureView textureView) {
        this.player.setVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoTextureView(android.view.TextureView textureView) {
        this.player.clearVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        return this.player.getCurrentCues();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        return this.player.getDeviceInfo();
    }

    @Override // androidx.media3.common.Player
    public int getDeviceVolume() {
        return this.player.getDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public boolean isDeviceMuted() {
        return this.player.isDeviceMuted();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceVolume(int i) {
        this.player.setDeviceVolume(i);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceVolume(int i, int i2) {
        this.player.setDeviceVolume(i, i2);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        this.player.increaseDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public void increaseDeviceVolume(int i) {
        this.player.increaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        this.player.decreaseDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public void decreaseDeviceVolume(int i) {
        this.player.decreaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceMuted(boolean z) {
        this.player.setDeviceMuted(z);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceMuted(boolean z, int i) {
        this.player.setDeviceMuted(z, i);
    }

    @Override // androidx.media3.common.Player
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        this.player.setAudioAttributes(audioAttributes, z);
    }

    public androidx.media3.common.Player getWrappedPlayer() {
        return this.player;
    }

    private static final class ForwardingListener implements androidx.media3.common.Player.Listener {
        private final androidx.media3.common.ForwardingPlayer forwardingPlayer;
        private final androidx.media3.common.Player.Listener listener;

        public ForwardingListener(androidx.media3.common.ForwardingPlayer forwardingPlayer, androidx.media3.common.Player.Listener listener) {
            this.forwardingPlayer = forwardingPlayer;
            this.listener = listener;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            this.listener.onEvents(this.forwardingPlayer, events);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(androidx.media3.common.Timeline timeline, int i) {
            this.listener.onTimelineChanged(timeline, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaItemTransition(androidx.media3.common.MediaItem mediaItem, int i) {
            this.listener.onMediaItemTransition(mediaItem, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTracksChanged(androidx.media3.common.Tracks tracks) {
            this.listener.onTracksChanged(tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.listener.onMediaMetadataChanged(mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaylistMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.listener.onPlaylistMetadataChanged(mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsLoadingChanged(boolean z) {
            this.listener.onIsLoadingChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onLoadingChanged(boolean z) {
            this.listener.onIsLoadingChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAvailableCommandsChanged(androidx.media3.common.Player.Commands commands) {
            this.listener.onAvailableCommandsChanged(commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTrackSelectionParametersChanged(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.listener.onTrackSelectionParametersChanged(trackSelectionParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerStateChanged(boolean z, int i) {
            this.listener.onPlayerStateChanged(z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            this.listener.onPlaybackStateChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            this.listener.onPlayWhenReadyChanged(z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackSuppressionReasonChanged(int i) {
            this.listener.onPlaybackSuppressionReasonChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z) {
            this.listener.onIsPlayingChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRepeatModeChanged(int i) {
            this.listener.onRepeatModeChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onShuffleModeEnabledChanged(boolean z) {
            this.listener.onShuffleModeEnabledChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(androidx.media3.common.PlaybackException playbackException) {
            this.listener.onPlayerError(playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerErrorChanged(androidx.media3.common.PlaybackException playbackException) {
            this.listener.onPlayerErrorChanged(playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(int i) {
            this.listener.onPositionDiscontinuity(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
            this.listener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackParametersChanged(androidx.media3.common.PlaybackParameters playbackParameters) {
            this.listener.onPlaybackParametersChanged(playbackParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekBackIncrementChanged(long j) {
            this.listener.onSeekBackIncrementChanged(j);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekForwardIncrementChanged(long j) {
            this.listener.onSeekForwardIncrementChanged(j);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long j) {
            this.listener.onMaxSeekToPreviousPositionChanged(j);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
            this.listener.onVideoSizeChanged(videoSize);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSurfaceSizeChanged(int i, int i2) {
            this.listener.onSurfaceSizeChanged(i, i2);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            this.listener.onRenderedFirstFrame();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAudioSessionIdChanged(int i) {
            this.listener.onAudioSessionIdChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAudioAttributesChanged(androidx.media3.common.AudioAttributes audioAttributes) {
            this.listener.onAudioAttributesChanged(audioAttributes);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVolumeChanged(float f) {
            this.listener.onVolumeChanged(f);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSkipSilenceEnabledChanged(boolean z) {
            this.listener.onSkipSilenceEnabledChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onCues(java.util.List<androidx.media3.common.text.Cue> list) {
            this.listener.onCues(list);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onCues(androidx.media3.common.text.CueGroup cueGroup) {
            this.listener.onCues(cueGroup);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMetadata(androidx.media3.common.Metadata metadata) {
            this.listener.onMetadata(metadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceInfoChanged(androidx.media3.common.DeviceInfo deviceInfo) {
            this.listener.onDeviceInfoChanged(deviceInfo);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceVolumeChanged(int i, boolean z) {
            this.listener.onDeviceVolumeChanged(i, z);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.ForwardingPlayer.ForwardingListener)) {
                return false;
            }
            androidx.media3.common.ForwardingPlayer.ForwardingListener forwardingListener = (androidx.media3.common.ForwardingPlayer.ForwardingListener) obj;
            if (this.forwardingPlayer.equals(forwardingListener.forwardingPlayer)) {
                return this.listener.equals(forwardingListener.listener);
            }
            return false;
        }

        public int hashCode() {
            return (this.forwardingPlayer.hashCode() * 31) + this.listener.hashCode();
        }
    }
}
