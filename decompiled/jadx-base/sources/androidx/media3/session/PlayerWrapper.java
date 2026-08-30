package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class PlayerWrapper extends androidx.media3.common.ForwardingPlayer {
    private androidx.media3.common.Player.Commands availablePlayerCommands;
    private androidx.media3.session.SessionCommands availableSessionCommands;
    private com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayout;
    private androidx.media3.session.PlayerWrapper.LegacyError legacyError;
    private android.os.Bundle legacyExtras;
    private final boolean playIfSuppressed;

    private static long convertCommandToPlaybackStateActions(int i) {
        if (i == 1) {
            return 518L;
        }
        if (i == 2) {
            return 16384L;
        }
        if (i == 3) {
            return 1L;
        }
        if (i == 31) {
            return 240640L;
        }
        switch (i) {
            case 5:
                return 256L;
            case 6:
            case 7:
                return 16L;
            case 8:
            case 9:
                return 32L;
            case 10:
                return 4096L;
            case 11:
                return 8L;
            case 12:
                return 64L;
            case 13:
                return 4194304L;
            case 14:
                return 2621440L;
            case 15:
                return 262144L;
            default:
                return 0L;
        }
    }

    public static final class LegacyError {
        public final int code;
        public final android.os.Bundle extras;
        public final boolean isFatal;
        public final java.lang.String message;

        /* synthetic */ LegacyError(boolean z, int i, java.lang.String str, android.os.Bundle bundle, androidx.media3.session.PlayerWrapper.AnonymousClass1 anonymousClass1) {
            this(z, i, str, bundle);
        }

        private LegacyError(boolean z, int i, java.lang.String str, android.os.Bundle bundle) {
            this.isFatal = z;
            this.code = i;
            this.message = str;
            this.extras = bundle == null ? android.os.Bundle.EMPTY : bundle;
        }
    }

    public PlayerWrapper(androidx.media3.common.Player player, boolean z, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands, android.os.Bundle bundle) {
        super(player);
        this.playIfSuppressed = z;
        this.customLayout = immutableList;
        this.availableSessionCommands = sessionCommands;
        this.availablePlayerCommands = commands;
        this.legacyExtras = bundle;
    }

    public void setAvailableCommands(androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        this.availableSessionCommands = sessionCommands;
        this.availablePlayerCommands = commands;
    }

    public androidx.media3.session.SessionCommands getAvailableSessionCommands() {
        return this.availableSessionCommands;
    }

    public androidx.media3.common.Player.Commands getAvailablePlayerCommands() {
        return this.availablePlayerCommands;
    }

    public void setCustomLayout(com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList) {
        this.customLayout = immutableList;
    }

    com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> getCustomLayout() {
        return this.customLayout;
    }

    public void setLegacyExtras(android.os.Bundle bundle) {
        if (bundle != null) {
            androidx.media3.common.util.Assertions.checkArgument(!bundle.containsKey(androidx.media3.session.MediaConstants.EXTRAS_KEY_PLAYBACK_SPEED_COMPAT));
            androidx.media3.common.util.Assertions.checkArgument(!bundle.containsKey("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"));
        }
        this.legacyExtras = bundle;
    }

    public android.os.Bundle getLegacyExtras() {
        return this.legacyExtras;
    }

    public void setLegacyError(boolean z, int i, java.lang.String str, android.os.Bundle bundle) {
        this.legacyError = new androidx.media3.session.PlayerWrapper.LegacyError(z, i, str, bundle, null);
    }

    public androidx.media3.session.PlayerWrapper.LegacyError getLegacyError() {
        return this.legacyError;
    }

    public void clearLegacyErrorStatus() {
        this.legacyError = null;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThread();
        super.addListener(listener);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThread();
        super.removeListener(listener);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.PlaybackException getPlayerError() {
        verifyApplicationThread();
        return super.getPlayerError();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void play() {
        verifyApplicationThread();
        super.play();
    }

    public void playIfCommandAvailable() {
        if (isCommandAvailable(1)) {
            play();
        }
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void pause() {
        verifyApplicationThread();
        super.pause();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void prepare() {
        verifyApplicationThread();
        super.prepare();
    }

    public void prepareIfCommandAvailable() {
        if (isCommandAvailable(2)) {
            prepare();
        }
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void stop() {
        verifyApplicationThread();
        super.stop();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void release() {
        verifyApplicationThread();
        super.release();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToDefaultPosition(int i) {
        verifyApplicationThread();
        super.seekToDefaultPosition(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToDefaultPosition() {
        verifyApplicationThread();
        super.seekToDefaultPosition();
    }

    public void seekToDefaultPositionIfCommandAvailable() {
        if (isCommandAvailable(4)) {
            seekToDefaultPosition();
        }
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekTo(long j) {
        verifyApplicationThread();
        super.seekTo(j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekTo(int i, long j) {
        verifyApplicationThread();
        super.seekTo(i, j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return super.getSeekBackIncrement();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekBack() {
        verifyApplicationThread();
        super.seekBack();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return super.getSeekForwardIncrement();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekForward() {
        verifyApplicationThread();
        super.seekForward();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        super.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlaybackSpeed(float f) {
        verifyApplicationThread();
        super.setPlaybackSpeed(f);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getCurrentPosition() {
        verifyApplicationThread();
        return super.getCurrentPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getDuration() {
        verifyApplicationThread();
        return super.getDuration();
    }

    public long getDurationWithCommandCheck() {
        return isCommandAvailable(16) ? getDuration() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getBufferedPosition() {
        verifyApplicationThread();
        return super.getBufferedPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getBufferedPercentage() {
        verifyApplicationThread();
        return super.getBufferedPercentage();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return super.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getCurrentLiveOffset() {
        verifyApplicationThread();
        return super.getCurrentLiveOffset();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getContentDuration() {
        verifyApplicationThread();
        return super.getContentDuration();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getContentPosition() {
        verifyApplicationThread();
        return super.getContentPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        return super.getContentBufferedPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return super.isPlayingAd();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        return super.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        return super.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return super.getPlaybackParameters();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.VideoSize getVideoSize() {
        verifyApplicationThread();
        return super.getVideoSize();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurface() {
        verifyApplicationThread();
        super.clearVideoSurface();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        super.clearVideoSurface(surface);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        super.setVideoSurface(surface);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        super.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        super.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        super.setVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        super.clearVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        super.setVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        super.clearVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return super.getAudioAttributes();
    }

    public androidx.media3.common.AudioAttributes getAudioAttributesWithCommandCheck() {
        if (isCommandAvailable(21)) {
            return getAudioAttributes();
        }
        return androidx.media3.common.AudioAttributes.DEFAULT;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem, j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem, z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        super.setMediaItems(list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z) {
        verifyApplicationThread();
        super.setMediaItems(list, z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        verifyApplicationThread();
        super.setMediaItems(list, i, j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        super.addMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        super.addMediaItem(i, mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        super.addMediaItems(list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        super.addMediaItems(i, list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearMediaItems() {
        verifyApplicationThread();
        super.clearMediaItems();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void removeMediaItem(int i) {
        verifyApplicationThread();
        super.removeMediaItem(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void removeMediaItems(int i, int i2) {
        verifyApplicationThread();
        super.removeMediaItems(i, i2);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void moveMediaItem(int i, int i2) {
        verifyApplicationThread();
        super.moveMediaItem(i, i2);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void moveMediaItems(int i, int i2, int i3) {
        verifyApplicationThread();
        super.moveMediaItems(i, i2, i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void replaceMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        super.replaceMediaItem(i, mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        super.replaceMediaItems(i, i2, list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean hasPrevious() {
        verifyApplicationThread();
        return super.hasPrevious();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean hasNext() {
        verifyApplicationThread();
        return super.hasNext();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean hasPreviousWindow() {
        verifyApplicationThread();
        return super.hasPreviousWindow();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean hasNextWindow() {
        verifyApplicationThread();
        return super.hasNextWindow();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean hasPreviousMediaItem() {
        verifyApplicationThread();
        return super.hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean hasNextMediaItem() {
        verifyApplicationThread();
        return super.hasNextMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void previous() {
        verifyApplicationThread();
        super.previous();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void next() {
        verifyApplicationThread();
        super.next();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void seekToPreviousWindow() {
        verifyApplicationThread();
        super.seekToPreviousWindow();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void seekToNextWindow() {
        verifyApplicationThread();
        super.seekToNextWindow();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToPreviousMediaItem() {
        verifyApplicationThread();
        super.seekToPreviousMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToNextMediaItem() {
        verifyApplicationThread();
        super.seekToNextMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        super.setPlaylistMetadata(mediaMetadata);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setRepeatMode(int i) {
        verifyApplicationThread();
        super.setRepeatMode(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z) {
        verifyApplicationThread();
        super.setShuffleModeEnabled(z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return super.getCurrentTimeline();
    }

    public androidx.media3.common.Timeline getCurrentTimelineWithCommandCheck() {
        if (isCommandAvailable(17)) {
            return getCurrentTimeline();
        }
        if (isCommandAvailable(16)) {
            return new androidx.media3.session.PlayerWrapper.CurrentMediaItemOnlyTimeline(this);
        }
        return androidx.media3.common.Timeline.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return super.getPlaylistMetadata();
    }

    public androidx.media3.common.MediaMetadata getPlaylistMetadataWithCommandCheck() {
        if (isCommandAvailable(18)) {
            return getPlaylistMetadata();
        }
        return androidx.media3.common.MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getRepeatMode() {
        verifyApplicationThread();
        return super.getRepeatMode();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return super.getShuffleModeEnabled();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.MediaItem getCurrentMediaItem() {
        verifyApplicationThread();
        return super.getCurrentMediaItem();
    }

    public androidx.media3.common.MediaItem getCurrentMediaItemWithCommandCheck() {
        if (isCommandAvailable(16)) {
            return getCurrentMediaItem();
        }
        return null;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getMediaItemCount() {
        verifyApplicationThread();
        return super.getMediaItemCount();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.MediaItem getMediaItemAt(int i) {
        verifyApplicationThread();
        return super.getMediaItemAt(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public int getCurrentWindowIndex() {
        verifyApplicationThread();
        return super.getCurrentWindowIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        return super.getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public int getPreviousWindowIndex() {
        verifyApplicationThread();
        return super.getPreviousWindowIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getPreviousMediaItemIndex() {
        verifyApplicationThread();
        return super.getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public int getNextWindowIndex() {
        verifyApplicationThread();
        return super.getNextWindowIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getNextMediaItemIndex() {
        verifyApplicationThread();
        return super.getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public float getVolume() {
        verifyApplicationThread();
        return super.getVolume();
    }

    public float getVolumeWithCommandCheck() {
        if (isCommandAvailable(22)) {
            return getVolume();
        }
        return 0.0f;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVolume(float f) {
        verifyApplicationThread();
        super.setVolume(f);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        verifyApplicationThread();
        return super.getCurrentCues();
    }

    public androidx.media3.common.text.CueGroup getCurrentCuesWithCommandCheck() {
        return isCommandAvailable(28) ? getCurrentCues() : androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return super.getDeviceInfo();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getDeviceVolume() {
        verifyApplicationThread();
        return super.getDeviceVolume();
    }

    public int getDeviceVolumeWithCommandCheck() {
        if (isCommandAvailable(23)) {
            return getDeviceVolume();
        }
        return 0;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        return super.isDeviceMuted();
    }

    public boolean isDeviceMutedWithCommandCheck() {
        return isCommandAvailable(23) && isDeviceMuted();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceVolume(int i) {
        verifyApplicationThread();
        super.setDeviceVolume(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setDeviceVolume(int i, int i2) {
        verifyApplicationThread();
        super.setDeviceVolume(i, i2);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        super.increaseDeviceVolume();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void increaseDeviceVolume(int i) {
        verifyApplicationThread();
        super.increaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        super.decreaseDeviceVolume();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void decreaseDeviceVolume(int i) {
        verifyApplicationThread();
        super.decreaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceMuted(boolean z) {
        verifyApplicationThread();
        super.setDeviceMuted(z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setDeviceMuted(boolean z, int i) {
        verifyApplicationThread();
        super.setDeviceMuted(z, i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlayWhenReady(boolean z) {
        verifyApplicationThread();
        super.setPlayWhenReady(z);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return super.getPlayWhenReady();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return super.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getPlaybackState() {
        verifyApplicationThread();
        return super.getPlaybackState();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isPlaying() {
        verifyApplicationThread();
        return super.isPlaying();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isLoading() {
        verifyApplicationThread();
        return super.isLoading();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return super.getMediaMetadata();
    }

    public androidx.media3.common.MediaMetadata getMediaMetadataWithCommandCheck() {
        return isCommandAvailable(18) ? getMediaMetadata() : androidx.media3.common.MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCommandAvailable(int i) {
        verifyApplicationThread();
        return super.isCommandAvailable(i);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return super.getAvailableCommands();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return super.getTrackSelectionParameters();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        super.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToPrevious() {
        verifyApplicationThread();
        super.seekToPrevious();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return super.getMaxSeekToPreviousPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToNext() {
        verifyApplicationThread();
        super.seekToNext();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.Tracks getCurrentTracks() {
        verifyApplicationThread();
        return super.getCurrentTracks();
    }

    public androidx.media3.common.Tracks getCurrentTracksWithCommandCheck() {
        return isCommandAvailable(30) ? getCurrentTracks() : androidx.media3.common.Tracks.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public java.lang.Object getCurrentManifest() {
        verifyApplicationThread();
        return super.getCurrentManifest();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        return super.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCurrentMediaItemDynamic() {
        verifyApplicationThread();
        return super.isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCurrentMediaItemLive() {
        verifyApplicationThread();
        return super.isCurrentMediaItemLive();
    }

    public boolean isCurrentMediaItemLiveWithCommandCheck() {
        return isCommandAvailable(16) && isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCurrentMediaItemSeekable() {
        verifyApplicationThread();
        return super.isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.util.Size getSurfaceSize() {
        verifyApplicationThread();
        return super.getSurfaceSize();
    }

    public androidx.media3.session.legacy.PlaybackStateCompat createPlaybackStateCompat() {
        androidx.media3.session.PlayerWrapper.LegacyError legacyError = this.legacyError;
        if (legacyError != null && legacyError.isFatal) {
            android.os.Bundle bundle = new android.os.Bundle(legacyError.extras);
            android.os.Bundle bundle2 = this.legacyExtras;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            return new androidx.media3.session.legacy.PlaybackStateCompat.Builder().setState(7, -1L, 0.0f, android.os.SystemClock.elapsedRealtime()).setActions(0L).setBufferedPosition(0L).setExtras(bundle).setErrorMessage(legacyError.code, (java.lang.CharSequence) androidx.media3.common.util.Assertions.checkNotNull(legacyError.message)).setExtras(legacyError.extras).build();
        }
        androidx.media3.common.PlaybackException playerError = getPlayerError();
        int iConvertToPlaybackStateCompatState = androidx.media3.session.LegacyConversions.convertToPlaybackStateCompatState(this, this.playIfSuppressed);
        androidx.media3.common.Player.Commands commandsIntersect = androidx.media3.session.MediaUtils.intersect(this.availablePlayerCommands, getAvailableCommands());
        long jConvertCommandToPlaybackStateActions = 128;
        for (int i = 0; i < commandsIntersect.size(); i++) {
            jConvertCommandToPlaybackStateActions |= convertCommandToPlaybackStateActions(commandsIntersect.get(i));
        }
        long jConvertToQueueItemId = isCommandAvailable(17) ? androidx.media3.session.LegacyConversions.convertToQueueItemId(getCurrentMediaItemIndex()) : -1L;
        float f = getPlaybackParameters().speed;
        float f2 = isPlaying() ? f : 0.0f;
        android.os.Bundle bundle3 = legacyError != null ? new android.os.Bundle(legacyError.extras) : new android.os.Bundle();
        android.os.Bundle bundle4 = this.legacyExtras;
        if (bundle4 != null && !bundle4.isEmpty()) {
            bundle3.putAll(this.legacyExtras);
        }
        bundle3.putFloat(androidx.media3.session.MediaConstants.EXTRAS_KEY_PLAYBACK_SPEED_COMPAT, f);
        androidx.media3.common.MediaItem currentMediaItemWithCommandCheck = getCurrentMediaItemWithCommandCheck();
        if (currentMediaItemWithCommandCheck != null && !"".equals(currentMediaItemWithCommandCheck.mediaId)) {
            bundle3.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", currentMediaItemWithCommandCheck.mediaId);
        }
        boolean zIsCommandAvailable = isCommandAvailable(16);
        androidx.media3.session.legacy.PlaybackStateCompat.Builder extras = new androidx.media3.session.legacy.PlaybackStateCompat.Builder().setState(iConvertToPlaybackStateCompatState, zIsCommandAvailable ? getCurrentPosition() : -1L, f2, android.os.SystemClock.elapsedRealtime()).setActions(jConvertCommandToPlaybackStateActions).setActiveQueueItemId(jConvertToQueueItemId).setBufferedPosition(zIsCommandAvailable ? getBufferedPosition() : 0L).setExtras(bundle3);
        for (int i2 = 0; i2 < this.customLayout.size(); i2++) {
            androidx.media3.session.CommandButton commandButton = this.customLayout.get(i2);
            androidx.media3.session.SessionCommand sessionCommand = commandButton.sessionCommand;
            if (sessionCommand != null && commandButton.isEnabled && sessionCommand.commandCode == 0 && androidx.media3.session.CommandButton.isButtonCommandAvailable(commandButton, this.availableSessionCommands, this.availablePlayerCommands)) {
                android.os.Bundle bundle5 = sessionCommand.customExtras;
                if (commandButton.icon != 0) {
                    bundle5 = new android.os.Bundle(sessionCommand.customExtras);
                    bundle5.putInt(androidx.media3.session.MediaConstants.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT, commandButton.icon);
                }
                extras.addCustomAction(new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.Builder(sessionCommand.customAction, commandButton.displayName, commandButton.iconResId).setExtras(bundle5).build());
            }
        }
        if (playerError != null) {
            extras.setErrorMessage(androidx.media3.session.LegacyConversions.convertToLegacyErrorCode(playerError), playerError.getMessage());
        } else if (legacyError != null) {
            extras.setErrorMessage(legacyError.code, legacyError.message);
        }
        return extras.build();
    }

    public androidx.media3.session.legacy.VolumeProviderCompat createVolumeProviderCompat() {
        if (getDeviceInfo().playbackType == 0) {
            return null;
        }
        androidx.media3.common.Player.Commands availableCommands = getAvailableCommands();
        int i = 2;
        if (!availableCommands.containsAny(26, 34)) {
            i = 0;
        } else if (!availableCommands.containsAny(25, 33)) {
            i = 1;
        }
        android.os.Handler handler = new android.os.Handler(getApplicationLooper());
        int deviceVolumeWithCommandCheck = getDeviceVolumeWithCommandCheck();
        androidx.media3.common.DeviceInfo deviceInfo = getDeviceInfo();
        return new androidx.media3.session.PlayerWrapper.AnonymousClass1(i, deviceInfo.maxVolume, deviceVolumeWithCommandCheck, deviceInfo.routingControllerId, handler, 1);
    }

    /* JADX INFO: renamed from: androidx.media3.session.PlayerWrapper$1, reason: invalid class name */
    class AnonymousClass1 extends androidx.media3.session.legacy.VolumeProviderCompat {
        final /* synthetic */ android.os.Handler val$handler;
        final /* synthetic */ int val$legacyVolumeFlag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i, int i2, int i3, java.lang.String str, android.os.Handler handler, int i4) {
            super(i, i2, i3, str);
            this.val$handler = handler;
            this.val$legacyVolumeFlag = i4;
        }

        @Override // androidx.media3.session.legacy.VolumeProviderCompat
        public void onSetVolumeTo(final int i) {
            android.os.Handler handler = this.val$handler;
            final int i2 = this.val$legacyVolumeFlag;
            androidx.media3.common.util.Util.postOrRun(handler, new java.lang.Runnable() { // from class: androidx.media3.session.PlayerWrapper$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m427lambda$onSetVolumeTo$0$androidxmedia3sessionPlayerWrapper$1(i, i2);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onSetVolumeTo$0$androidx-media3-session-PlayerWrapper$1, reason: not valid java name */
        /* synthetic */ void m427lambda$onSetVolumeTo$0$androidxmedia3sessionPlayerWrapper$1(int i, int i2) {
            if (androidx.media3.session.PlayerWrapper.this.isCommandAvailable(25) || androidx.media3.session.PlayerWrapper.this.isCommandAvailable(33)) {
                if (androidx.media3.session.PlayerWrapper.this.isCommandAvailable(33)) {
                    androidx.media3.session.PlayerWrapper.this.setDeviceVolume(i, i2);
                } else {
                    androidx.media3.session.PlayerWrapper.this.setDeviceVolume(i);
                }
            }
        }

        @Override // androidx.media3.session.legacy.VolumeProviderCompat
        public void onAdjustVolume(final int i) {
            android.os.Handler handler = this.val$handler;
            final int i2 = this.val$legacyVolumeFlag;
            androidx.media3.common.util.Util.postOrRun(handler, new java.lang.Runnable() { // from class: androidx.media3.session.PlayerWrapper$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m426lambda$onAdjustVolume$1$androidxmedia3sessionPlayerWrapper$1(i, i2);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdjustVolume$1$androidx-media3-session-PlayerWrapper$1, reason: not valid java name */
        /* synthetic */ void m426lambda$onAdjustVolume$1$androidxmedia3sessionPlayerWrapper$1(int i, int i2) {
            if (androidx.media3.session.PlayerWrapper.this.isCommandAvailable(26) || androidx.media3.session.PlayerWrapper.this.isCommandAvailable(34)) {
                if (i == -100) {
                    if (androidx.media3.session.PlayerWrapper.this.isCommandAvailable(34)) {
                        androidx.media3.session.PlayerWrapper.this.setDeviceMuted(true, i2);
                        return;
                    } else {
                        androidx.media3.session.PlayerWrapper.this.setDeviceMuted(true);
                        return;
                    }
                }
                if (i == -1) {
                    if (androidx.media3.session.PlayerWrapper.this.isCommandAvailable(34)) {
                        androidx.media3.session.PlayerWrapper.this.decreaseDeviceVolume(i2);
                        return;
                    } else {
                        androidx.media3.session.PlayerWrapper.this.decreaseDeviceVolume();
                        return;
                    }
                }
                if (i == 1) {
                    if (androidx.media3.session.PlayerWrapper.this.isCommandAvailable(34)) {
                        androidx.media3.session.PlayerWrapper.this.increaseDeviceVolume(i2);
                        return;
                    } else {
                        androidx.media3.session.PlayerWrapper.this.increaseDeviceVolume();
                        return;
                    }
                }
                if (i == 100) {
                    if (androidx.media3.session.PlayerWrapper.this.isCommandAvailable(34)) {
                        androidx.media3.session.PlayerWrapper.this.setDeviceMuted(false, i2);
                        return;
                    } else {
                        androidx.media3.session.PlayerWrapper.this.setDeviceMuted(false);
                        return;
                    }
                }
                if (i == 101) {
                    if (androidx.media3.session.PlayerWrapper.this.isCommandAvailable(34)) {
                        androidx.media3.session.PlayerWrapper playerWrapper = androidx.media3.session.PlayerWrapper.this;
                        playerWrapper.setDeviceMuted(!playerWrapper.isDeviceMutedWithCommandCheck(), i2);
                        return;
                    } else {
                        androidx.media3.session.PlayerWrapper playerWrapper2 = androidx.media3.session.PlayerWrapper.this;
                        playerWrapper2.setDeviceMuted(!playerWrapper2.isDeviceMutedWithCommandCheck());
                        return;
                    }
                }
                androidx.media3.common.util.Log.w("VolumeProviderCompat", "onAdjustVolume: Ignoring unknown direction: " + i);
            }
        }
    }

    public androidx.media3.common.Player.PositionInfo createPositionInfoForBundling() {
        boolean zIsCommandAvailable = isCommandAvailable(16);
        boolean zIsCommandAvailable2 = isCommandAvailable(17);
        return new androidx.media3.common.Player.PositionInfo(null, zIsCommandAvailable2 ? getCurrentMediaItemIndex() : 0, zIsCommandAvailable ? getCurrentMediaItem() : null, null, zIsCommandAvailable2 ? getCurrentPeriodIndex() : 0, zIsCommandAvailable ? getCurrentPosition() : 0L, zIsCommandAvailable ? getContentPosition() : 0L, zIsCommandAvailable ? getCurrentAdGroupIndex() : -1, zIsCommandAvailable ? getCurrentAdIndexInAdGroup() : -1);
    }

    public androidx.media3.session.SessionPositionInfo createSessionPositionInfoForBundling() {
        boolean zIsCommandAvailable = isCommandAvailable(16);
        androidx.media3.common.Player.PositionInfo positionInfoCreatePositionInfoForBundling = createPositionInfoForBundling();
        boolean z = zIsCommandAvailable && isPlayingAd();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long contentDuration = androidx.media3.common.C.TIME_UNSET;
        long duration = zIsCommandAvailable ? getDuration() : -9223372036854775807L;
        long bufferedPosition = zIsCommandAvailable ? getBufferedPosition() : 0L;
        int bufferedPercentage = zIsCommandAvailable ? getBufferedPercentage() : 0;
        long totalBufferedDuration = zIsCommandAvailable ? getTotalBufferedDuration() : 0L;
        long currentLiveOffset = zIsCommandAvailable ? getCurrentLiveOffset() : -9223372036854775807L;
        if (zIsCommandAvailable) {
            contentDuration = getContentDuration();
        }
        return new androidx.media3.session.SessionPositionInfo(positionInfoCreatePositionInfoForBundling, z, jElapsedRealtime, duration, bufferedPosition, bufferedPercentage, totalBufferedDuration, currentLiveOffset, contentDuration, zIsCommandAvailable ? getContentBufferedPosition() : 0L);
    }

    public androidx.media3.session.PlayerInfo createPlayerInfoForBundling() {
        return new androidx.media3.session.PlayerInfo(getPlayerError(), 0, createSessionPositionInfoForBundling(), createPositionInfoForBundling(), createPositionInfoForBundling(), 0, getPlaybackParameters(), getRepeatMode(), getShuffleModeEnabled(), getVideoSize(), getCurrentTimelineWithCommandCheck(), 0, getPlaylistMetadataWithCommandCheck(), getVolumeWithCommandCheck(), getAudioAttributesWithCommandCheck(), getCurrentCuesWithCommandCheck(), getDeviceInfo(), getDeviceVolumeWithCommandCheck(), isDeviceMutedWithCommandCheck(), getPlayWhenReady(), 1, getPlaybackSuppressionReason(), getPlaybackState(), isPlaying(), isLoading(), getMediaMetadataWithCommandCheck(), getSeekBackIncrement(), getSeekForwardIncrement(), getMaxSeekToPreviousPosition(), getCurrentTracksWithCommandCheck(), getTrackSelectionParameters());
    }

    private void verifyApplicationThread() {
        androidx.media3.common.util.Assertions.checkState(android.os.Looper.myLooper() == getApplicationLooper());
    }

    private static final class CurrentMediaItemOnlyTimeline extends androidx.media3.common.Timeline {
        private static final java.lang.Object UID = new java.lang.Object();
        private final long durationUs;
        private final boolean isDynamic;
        private final boolean isSeekable;
        private final androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
        private final androidx.media3.common.MediaItem mediaItem;

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        public CurrentMediaItemOnlyTimeline(androidx.media3.session.PlayerWrapper playerWrapper) {
            this.mediaItem = playerWrapper.getCurrentMediaItem();
            this.isSeekable = playerWrapper.isCurrentMediaItemSeekable();
            this.isDynamic = playerWrapper.isCurrentMediaItemDynamic();
            this.liveConfiguration = playerWrapper.isCurrentMediaItemLive() ? androidx.media3.common.MediaItem.LiveConfiguration.UNSET : null;
            this.durationUs = androidx.media3.common.util.Util.msToUs(playerWrapper.getContentDuration());
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            window.set(UID, this.mediaItem, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, this.isSeekable, this.isDynamic, this.liveConfiguration, 0L, this.durationUs, 0, 0, 0L);
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            java.lang.Object obj = UID;
            period.set(obj, obj, 0, this.durationUs, 0L);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            return UID.equals(obj) ? 0 : -1;
        }

        @Override // androidx.media3.common.Timeline
        public java.lang.Object getUidOfPeriod(int i) {
            return UID;
        }
    }
}
