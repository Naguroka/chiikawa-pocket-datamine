package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerImplLegacy implements androidx.media3.session.MediaController.MediaControllerImpl {
    private static final long AGGREGATES_CALLBACKS_WITHIN_TIMEOUT_MS = 500;
    private static final java.lang.String TAG = "MCImplLegacy";
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private androidx.media3.session.legacy.MediaBrowserCompat browserCompat;
    private boolean connected;
    final android.content.Context context;
    private androidx.media3.session.legacy.MediaControllerCompat controllerCompat;
    private final androidx.media3.session.MediaControllerImplLegacy.ControllerCompatCallback controllerCompatCallback;
    private final androidx.media3.session.MediaController instance;
    private final androidx.media3.common.util.ListenerSet<androidx.media3.common.Player.Listener> listeners;
    private boolean released;
    private final androidx.media3.session.SessionToken token;
    private androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo legacyPlayerInfo = new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo();
    private androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo pendingLegacyPlayerInfo = new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo();
    private androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo = new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo();
    private long currentPositionMs = androidx.media3.common.C.TIME_UNSET;
    private long lastSetPlayWhenReadyCalledTimeMs = androidx.media3.common.C.TIME_UNSET;

    private static int calculateCurrentItemIndexAfterAddItems(int i, int i2, int i3) {
        return i < i2 ? i : i + i3;
    }

    private static int calculateCurrentItemIndexAfterRemoveItems(int i, int i2, int i3) {
        int i4 = i3 - i2;
        if (i < i2) {
            return i;
        }
        if (i < i3) {
            return -1;
        }
        return i - i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void ignoreFuture(java.util.concurrent.Future<T> future) {
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.IMediaController getBinder() {
        return null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdGroupIndex() {
        return -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdIndexInAdGroup() {
        return -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentLiveOffset() {
        return androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getNextMediaItemIndex() {
        return -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackSuppressionReason() {
        return 0;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPreviousMediaItemIndex() {
        return -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public float getVolume() {
        return 1.0f;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isLoading() {
        return false;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
    }

    public MediaControllerImplLegacy(android.content.Context context, androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionToken sessionToken, android.os.Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader) {
        this.listeners = new androidx.media3.common.util.ListenerSet<>(looper, androidx.media3.common.util.Clock.DEFAULT, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                this.f$0.m325lambda$new$0$androidxmedia3sessionMediaControllerImplLegacy((androidx.media3.common.Player.Listener) obj, flagSet);
            }
        });
        this.context = context;
        this.instance = mediaController;
        this.controllerCompatCallback = new androidx.media3.session.MediaControllerImplLegacy.ControllerCompatCallback(looper);
        this.token = sessionToken;
        this.bitmapLoader = bitmapLoader;
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m325lambda$new$0$androidxmedia3sessionMediaControllerImplLegacy(androidx.media3.common.Player.Listener listener, androidx.media3.common.FlagSet flagSet) {
        listener.onEvents(getInstance(), new androidx.media3.common.Player.Events(flagSet));
    }

    androidx.media3.session.MediaController getInstance() {
        return this.instance;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void connect() {
        if (this.token.getType() == 0) {
            connectToSession((androidx.media3.session.legacy.MediaSessionCompat.Token) androidx.media3.common.util.Assertions.checkStateNotNull(this.token.getBinder()));
        } else {
            connectToService();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addListener(androidx.media3.common.Player.Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void stop() {
        if (this.controllerInfo.playerInfo.playbackState == 1) {
            return;
        }
        androidx.media3.session.PlayerInfo playerInfoCopyWithSessionPositionInfo = this.controllerInfo.playerInfo.copyWithSessionPositionInfo(createSessionPositionInfo(this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo, false, this.controllerInfo.playerInfo.sessionPositionInfo.durationMs, this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo.positionMs, androidx.media3.session.MediaUtils.calculateBufferedPercentage(this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo.positionMs, this.controllerInfo.playerInfo.sessionPositionInfo.durationMs), 0L));
        if (this.controllerInfo.playerInfo.playbackState != 1) {
            playerInfoCopyWithSessionPositionInfo = playerInfoCopyWithSessionPositionInfo.copyWithPlaybackState(1, this.controllerInfo.playerInfo.playerError);
        }
        updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(playerInfoCopyWithSessionPositionInfo, this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        this.controllerCompat.getTransportControls().stop();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        androidx.media3.session.legacy.MediaBrowserCompat mediaBrowserCompat = this.browserCompat;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.disconnect();
            this.browserCompat = null;
        }
        androidx.media3.session.legacy.MediaControllerCompat mediaControllerCompat = this.controllerCompat;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.controllerCompatCallback);
            this.controllerCompatCallback.release();
            this.controllerCompat = null;
        }
        this.connected = false;
        this.listeners.release();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.SessionToken getConnectedToken() {
        if (this.connected) {
            return this.token;
        }
        return null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isConnected() {
        return this.connected;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void play() {
        setPlayWhenReady(true);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void pause() {
        setPlayWhenReady(false);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void prepare() {
        if (this.controllerInfo.playerInfo.playbackState != 1) {
            return;
        }
        updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithPlaybackState(this.controllerInfo.playerInfo.timeline.isEmpty() ? 4 : 2, null), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        if (hasMedia()) {
            initializeLegacyPlaylist();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition() {
        seekToInternal(getCurrentMediaItemIndex(), 0L);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition(int i) {
        seekToInternal(i, 0L);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(long j) {
        seekToInternal(getCurrentMediaItemIndex(), j);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(int i, long j) {
        seekToInternal(i, j);
    }

    private void seekToInternal(int i, long j) {
        java.lang.Integer num;
        java.lang.Integer num2;
        int i2;
        long j2;
        long j3;
        long j4;
        int i3 = i;
        long j5 = j;
        androidx.media3.common.util.Assertions.checkArgument(i3 >= 0);
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        androidx.media3.common.Timeline timeline = this.controllerInfo.playerInfo.timeline;
        if ((timeline.isEmpty() || i3 < timeline.getWindowCount()) && !isPlayingAd()) {
            if (i3 != currentMediaItemIndex) {
                long queueId = ((androidx.media3.session.QueueTimeline) this.controllerInfo.playerInfo.timeline).getQueueId(i3);
                if (queueId != -1) {
                    this.controllerCompat.getTransportControls().skipToQueueItem(queueId);
                    num = 2;
                } else {
                    androidx.media3.common.util.Log.w(TAG, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=" + i3);
                    i3 = currentMediaItemIndex;
                    num = null;
                }
            } else {
                i3 = currentMediaItemIndex;
                num = null;
            }
            long currentPosition = getCurrentPosition();
            if (j5 == androidx.media3.common.C.TIME_UNSET) {
                j5 = currentPosition;
                num2 = null;
            } else {
                this.controllerCompat.getTransportControls().seekTo(j5);
                num2 = 1;
            }
            if (num == null) {
                long bufferedPosition = getBufferedPosition();
                long duration = getDuration();
                long jMax = j5 < currentPosition ? j5 : java.lang.Math.max(j5, bufferedPosition);
                j2 = jMax;
                i2 = duration == androidx.media3.common.C.TIME_UNSET ? 0 : (int) ((100 * jMax) / duration);
                j3 = jMax - j5;
                j4 = duration;
            } else {
                i2 = 0;
                j2 = 0;
                j3 = 0;
                j4 = -9223372036854775807L;
            }
            androidx.media3.session.PlayerInfo playerInfoCopyWithSessionPositionInfo = this.controllerInfo.playerInfo.copyWithSessionPositionInfo(createSessionPositionInfo(createPositionInfo(i3, !timeline.isEmpty() ? timeline.getWindow(i3, new androidx.media3.common.Timeline.Window()).mediaItem : null, j5, false), false, j4, j2, i2, j3));
            if (playerInfoCopyWithSessionPositionInfo.playbackState != 1) {
                playerInfoCopyWithSessionPositionInfo = playerInfoCopyWithSessionPositionInfo.copyWithPlaybackState(2, null);
            }
            updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(playerInfoCopyWithSessionPositionInfo, this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), num2, num);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekBackIncrement() {
        return this.controllerInfo.playerInfo.seekBackIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekBack() {
        this.controllerCompat.getTransportControls().rewind();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekForwardIncrement() {
        return this.controllerInfo.playerInfo.seekForwardIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekForward() {
        this.controllerCompat.getTransportControls().fastForward();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.app.PendingIntent getSessionActivity() {
        return this.controllerCompat.getSessionActivity();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> getCustomLayout() {
        return this.controllerInfo.customLayout;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.os.Bundle getSessionExtras() {
        return this.controllerInfo.sessionExtras;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.PlaybackException getPlayerError() {
        return this.controllerInfo.playerInfo.playerError;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getDuration() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.durationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentPosition() {
        long updatedCurrentPositionMs = androidx.media3.session.MediaUtils.getUpdatedCurrentPositionMs(this.controllerInfo.playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.currentPositionMs = updatedCurrentPositionMs;
        return updatedCurrentPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getBufferedPosition() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.bufferedPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getBufferedPercentage() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.bufferedPercentage;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getTotalBufferedDuration() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.totalBufferedDurationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentDuration() {
        return getDuration();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentPosition() {
        return getCurrentPosition();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentBufferedPosition() {
        return getBufferedPosition();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlayingAd() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.isPlayingAd;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.controllerInfo.playerInfo.playbackParameters;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.controllerInfo.playerInfo.audioAttributes;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setRating(java.lang.String str, androidx.media3.common.Rating rating) {
        if (str.equals(this.legacyPlayerInfo.mediaMetadataCompat.getString("android.media.metadata.MEDIA_ID"))) {
            this.controllerCompat.getTransportControls().setRating(androidx.media3.session.LegacyConversions.convertToRatingCompat(rating));
        }
        return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(0));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setRating(androidx.media3.common.Rating rating) {
        this.controllerCompat.getTransportControls().setRating(androidx.media3.session.LegacyConversions.convertToRatingCompat(rating));
        return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(0));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        if (!playbackParameters.equals(getPlaybackParameters())) {
            updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithPlaybackParameters(playbackParameters), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.getTransportControls().setPlaybackSpeed(playbackParameters.speed);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackSpeed(float f) {
        if (f != getPlaybackParameters().speed) {
            updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithPlaybackParameters(new androidx.media3.common.PlaybackParameters(f)), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.getTransportControls().setPlaybackSpeed(f);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        if (this.controllerInfo.availableSessionCommands.contains(sessionCommand)) {
            this.controllerCompat.getTransportControls().sendCustomAction(sessionCommand.customAction, bundle);
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(0));
        }
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        this.controllerCompat.sendCommand(sessionCommand.customAction, bundle, new android.os.ResultReceiver(getInstance().applicationHandler) { // from class: androidx.media3.session.MediaControllerImplLegacy.1
            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, android.os.Bundle bundle2) {
                com.google.common.util.concurrent.SettableFuture settableFuture = settableFutureCreate;
                if (bundle2 == null) {
                    bundle2 = android.os.Bundle.EMPTY;
                }
                settableFuture.set(new androidx.media3.session.SessionResult(i, bundle2));
            }
        });
        return settableFutureCreate;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.Timeline getCurrentTimeline() {
        return this.controllerInfo.playerInfo.timeline;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        setMediaItem(mediaItem, androidx.media3.common.C.TIME_UNSET);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        setMediaItems(com.google.common.collect.ImmutableList.of(mediaItem), 0, j);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z) {
        setMediaItem(mediaItem);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        setMediaItems(list, 0, androidx.media3.common.C.TIME_UNSET);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z) {
        setMediaItems(list);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        if (list.isEmpty()) {
            clearMediaItems();
            return;
        }
        updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithTimelineAndSessionPositionInfo(androidx.media3.session.QueueTimeline.DEFAULT.copyWithNewMediaItems(0, list), createSessionPositionInfo(createPositionInfo(i, list.get(i), j == androidx.media3.common.C.TIME_UNSET ? 0L : j, false), false, androidx.media3.common.C.TIME_UNSET, 0L, 0, 0L), 0), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        if (isPrepared()) {
            initializeLegacyPlaylist();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support setting playlist metadata");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        return this.controllerInfo.playerInfo.playlistMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        addMediaItems(Integer.MAX_VALUE, java.util.Collections.singletonList(mediaItem));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        addMediaItems(i, java.util.Collections.singletonList(mediaItem));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0);
        if (list.isEmpty()) {
            return;
        }
        androidx.media3.session.QueueTimeline queueTimeline = (androidx.media3.session.QueueTimeline) this.controllerInfo.playerInfo.timeline;
        if (queueTimeline.isEmpty()) {
            setMediaItems(list);
            return;
        }
        int iMin = java.lang.Math.min(i, getCurrentTimeline().getWindowCount());
        updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithTimelineAndMediaItemIndex(queueTimeline.copyWithNewMediaItems(iMin, list), calculateCurrentItemIndexAfterAddItems(getCurrentMediaItemIndex(), iMin, list.size()), 0), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        if (isPrepared()) {
            addQueueItems(list, iMin);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItem(int i) {
        removeMediaItems(i, i + 1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItems(int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i2 >= i);
        int windowCount = getCurrentTimeline().getWindowCount();
        int iMin = java.lang.Math.min(i2, windowCount);
        if (i >= windowCount || i == iMin) {
            return;
        }
        androidx.media3.session.QueueTimeline queueTimelineCopyWithRemovedMediaItems = ((androidx.media3.session.QueueTimeline) this.controllerInfo.playerInfo.timeline).copyWithRemovedMediaItems(i, iMin);
        int iCalculateCurrentItemIndexAfterRemoveItems = calculateCurrentItemIndexAfterRemoveItems(getCurrentMediaItemIndex(), i, iMin);
        if (iCalculateCurrentItemIndexAfterRemoveItems == -1) {
            iCalculateCurrentItemIndexAfterRemoveItems = androidx.media3.common.util.Util.constrainValue(i, 0, queueTimelineCopyWithRemovedMediaItems.getWindowCount() - 1);
            androidx.media3.common.util.Log.w(TAG, "Currently playing item is removed. Assumes item at " + iCalculateCurrentItemIndexAfterRemoveItems + " is the new current item");
        }
        updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithTimelineAndMediaItemIndex(queueTimelineCopyWithRemovedMediaItems, iCalculateCurrentItemIndexAfterRemoveItems, 0), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        if (isPrepared()) {
            while (i < iMin && i < this.legacyPlayerInfo.queue.size()) {
                this.controllerCompat.removeQueueItem(this.legacyPlayerInfo.queue.get(i).getDescription());
                i++;
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItem(int i, int i2) {
        moveMediaItems(i, i + 1, i2);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItems(int i, int i2, int i3) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= i2 && i3 >= 0);
        androidx.media3.session.QueueTimeline queueTimeline = (androidx.media3.session.QueueTimeline) this.controllerInfo.playerInfo.timeline;
        int windowCount = queueTimeline.getWindowCount();
        int iMin = java.lang.Math.min(i2, windowCount);
        int i4 = iMin - i;
        int i5 = (windowCount - i4) - 1;
        int iMin2 = java.lang.Math.min(i3, i5 + 1);
        if (i >= windowCount || i == iMin || i == iMin2) {
            return;
        }
        int iCalculateCurrentItemIndexAfterRemoveItems = calculateCurrentItemIndexAfterRemoveItems(getCurrentMediaItemIndex(), i, iMin);
        if (iCalculateCurrentItemIndexAfterRemoveItems == -1) {
            iCalculateCurrentItemIndexAfterRemoveItems = androidx.media3.common.util.Util.constrainValue(i, 0, i5);
            androidx.media3.common.util.Log.w(TAG, "Currently playing item will be removed and added back to mimic move. Assumes item at " + iCalculateCurrentItemIndexAfterRemoveItems + " would be the new current item");
        }
        updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithTimelineAndMediaItemIndex(queueTimeline.copyWithMovedMediaItems(i, iMin, iMin2), calculateCurrentItemIndexAfterAddItems(iCalculateCurrentItemIndexAfterRemoveItems, iMin2, i4), 0), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        if (isPrepared()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(this.legacyPlayerInfo.queue.get(i));
                this.controllerCompat.removeQueueItem(this.legacyPlayerInfo.queue.get(i).getDescription());
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                this.controllerCompat.addQueueItem(((androidx.media3.session.legacy.MediaSessionCompat.QueueItem) arrayList.get(i7)).getDescription(), i7 + iMin2);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        replaceMediaItems(i, i + 1, com.google.common.collect.ImmutableList.of(mediaItem));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= i2);
        int windowCount = ((androidx.media3.session.QueueTimeline) this.controllerInfo.playerInfo.timeline).getWindowCount();
        if (i > windowCount) {
            return;
        }
        int iMin = java.lang.Math.min(i2, windowCount);
        addMediaItems(iMin, list);
        removeMediaItems(i, iMin);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentPeriodIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentMediaItemIndex() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasPreviousMediaItem() {
        return this.connected;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasNextMediaItem() {
        return this.connected;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPreviousMediaItem() {
        this.controllerCompat.getTransportControls().skipToPrevious();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNextMediaItem() {
        this.controllerCompat.getTransportControls().skipToNext();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPrevious() {
        this.controllerCompat.getTransportControls().skipToPrevious();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNext() {
        this.controllerCompat.getTransportControls().skipToNext();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getMaxSeekToPreviousPosition() {
        return this.controllerInfo.playerInfo.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getRepeatMode() {
        return this.controllerInfo.playerInfo.repeatMode;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setRepeatMode(int i) {
        if (i != getRepeatMode()) {
            updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithRepeatMode(i), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.getTransportControls().setRepeatMode(androidx.media3.session.LegacyConversions.convertToPlaybackStateCompatRepeatMode(i));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getShuffleModeEnabled() {
        return this.controllerInfo.playerInfo.shuffleModeEnabled;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setShuffleModeEnabled(boolean z) {
        if (z != getShuffleModeEnabled()) {
            updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithShuffleModeEnabled(z), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.getTransportControls().setShuffleMode(androidx.media3.session.LegacyConversions.convertToPlaybackStateCompatShuffleMode(z));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.VideoSize getVideoSize() {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support getting VideoSize");
        return androidx.media3.common.VideoSize.UNKNOWN;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.util.Size getSurfaceSize() {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support getting VideoSurfaceSize");
        return androidx.media3.common.util.Size.UNKNOWN;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface() {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support clearing Surface");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface(android.view.Surface surface) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support clearing Surface");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurface(android.view.Surface surface) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support setting Surface");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support setting SurfaceHolder");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support clearing SurfaceHolder");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support setting SurfaceView");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support clearing SurfaceView");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoTextureView(android.view.TextureView textureView) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support setting TextureView");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoTextureView(android.view.TextureView textureView) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support clearing TextureView");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support getting Cue");
        return androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVolume(float f) {
        androidx.media3.common.util.Log.w(TAG, "Session doesn't support setting player volume");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        return this.controllerInfo.playerInfo.deviceInfo;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getDeviceVolume() {
        if (this.controllerInfo.playerInfo.deviceInfo.playbackType == 1) {
            return this.controllerInfo.playerInfo.deviceVolume;
        }
        androidx.media3.session.legacy.MediaControllerCompat mediaControllerCompat = this.controllerCompat;
        if (mediaControllerCompat != null) {
            return androidx.media3.session.LegacyConversions.convertToDeviceVolume(mediaControllerCompat.getPlaybackInfo());
        }
        return 0;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isDeviceMuted() {
        if (this.controllerInfo.playerInfo.deviceInfo.playbackType == 1) {
            return this.controllerInfo.playerInfo.deviceMuted;
        }
        androidx.media3.session.legacy.MediaControllerCompat mediaControllerCompat = this.controllerCompat;
        return mediaControllerCompat != null && androidx.media3.session.LegacyConversions.convertToIsDeviceMuted(mediaControllerCompat.getPlaybackInfo());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void setDeviceVolume(int i) {
        setDeviceVolume(i, 1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceVolume(int i, int i2) {
        androidx.media3.common.DeviceInfo deviceInfo = getDeviceInfo();
        int i3 = deviceInfo.minVolume;
        int i4 = deviceInfo.maxVolume;
        if (i3 <= i && (i4 == 0 || i <= i4)) {
            updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithDeviceVolume(i, isDeviceMuted()), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.setVolumeTo(i, i2);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        increaseDeviceVolume(1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void increaseDeviceVolume(int i) {
        int deviceVolume = getDeviceVolume();
        int i2 = getDeviceInfo().maxVolume;
        if (i2 == 0 || deviceVolume + 1 <= i2) {
            updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithDeviceVolume(deviceVolume + 1, isDeviceMuted()), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.adjustVolume(1, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        decreaseDeviceVolume(1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void decreaseDeviceVolume(int i) {
        int deviceVolume = getDeviceVolume() - 1;
        if (deviceVolume >= getDeviceInfo().minVolume) {
            updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithDeviceVolume(deviceVolume, isDeviceMuted()), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.adjustVolume(-1, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void setDeviceMuted(boolean z) {
        setDeviceMuted(z, 1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceMuted(boolean z, int i) {
        if (androidx.media3.common.util.Util.SDK_INT < 23) {
            androidx.media3.common.util.Log.w(TAG, "Session doesn't support setting mute state at API level less than 23");
            return;
        }
        if (z != isDeviceMuted()) {
            updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithDeviceVolume(getDeviceVolume(), z), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.adjustVolume(z ? -100 : 100, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        androidx.media3.common.util.Log.w(TAG, "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlayWhenReady(boolean z) {
        if (this.controllerInfo.playerInfo.playWhenReady == z) {
            return;
        }
        this.currentPositionMs = androidx.media3.session.MediaUtils.getUpdatedCurrentPositionMs(this.controllerInfo.playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.lastSetPlayWhenReadyCalledTimeMs = android.os.SystemClock.elapsedRealtime();
        updateStateMaskedControllerInfo(new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(this.controllerInfo.playerInfo.copyWithPlayWhenReady(z, 1, 0), this.controllerInfo.availableSessionCommands, this.controllerInfo.availablePlayerCommands, this.controllerInfo.customLayout, this.controllerInfo.sessionExtras, null), null, null);
        if (isPrepared() && hasMedia()) {
            if (z) {
                this.controllerCompat.getTransportControls().play();
            } else {
                this.controllerCompat.getTransportControls().pause();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getPlayWhenReady() {
        return this.controllerInfo.playerInfo.playWhenReady;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackState() {
        return this.controllerInfo.playerInfo.playbackState;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlaying() {
        return this.controllerInfo.playerInfo.isPlaying;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        androidx.media3.common.MediaItem currentMediaItem = this.controllerInfo.playerInfo.getCurrentMediaItem();
        return currentMediaItem == null ? androidx.media3.common.MediaMetadata.EMPTY : currentMediaItem.mediaMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        return this.controllerInfo.availablePlayerCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.Tracks getCurrentTracks() {
        return androidx.media3.common.Tracks.EMPTY;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        return androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.SessionCommands getAvailableSessionCommands() {
        return this.controllerInfo.availableSessionCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.content.Context getContext() {
        return this.context;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.legacy.MediaBrowserCompat getBrowserCompat() {
        return this.browserCompat;
    }

    void onConnected() {
        if (this.released || this.connected) {
            return;
        }
        this.connected = true;
        handleNewLegacyParameters(true, new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(this.controllerCompat.getPlaybackInfo(), convertToSafePlaybackStateCompat(this.controllerCompat.getPlaybackState()), this.controllerCompat.getMetadata(), convertToNonNullQueueItemList(this.controllerCompat.getQueue()), this.controllerCompat.getQueueTitle(), this.controllerCompat.getRepeatMode(), this.controllerCompat.getShuffleMode(), this.controllerCompat.getExtras()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectToSession(final androidx.media3.session.legacy.MediaSessionCompat.Token token) {
        getInstance().runOnApplicationLooper(new java.lang.Runnable() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m323xd2b261cf(token);
            }
        });
        getInstance().applicationHandler.post(new java.lang.Runnable() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m324x163d7f90();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$connectToSession$1$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m323xd2b261cf(androidx.media3.session.legacy.MediaSessionCompat.Token token) {
        androidx.media3.session.legacy.MediaControllerCompat mediaControllerCompat = new androidx.media3.session.legacy.MediaControllerCompat(this.context, token);
        this.controllerCompat = mediaControllerCompat;
        mediaControllerCompat.registerCallback(this.controllerCompatCallback, getInstance().applicationHandler);
    }

    /* JADX INFO: renamed from: lambda$connectToSession$2$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m324x163d7f90() {
        if (this.controllerCompat.isSessionReady()) {
            return;
        }
        onConnected();
    }

    private void connectToService() {
        getInstance().runOnApplicationLooper(new java.lang.Runnable() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m322x77d5ff0();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$connectToService$3$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m322x77d5ff0() {
        androidx.media3.session.legacy.MediaBrowserCompat mediaBrowserCompat = new androidx.media3.session.legacy.MediaBrowserCompat(this.context, this.token.getComponentName(), new androidx.media3.session.MediaControllerImplLegacy.ConnectionCallback(), null);
        this.browserCompat = mediaBrowserCompat;
        mediaBrowserCompat.connect();
    }

    private boolean isPrepared() {
        return this.controllerInfo.playerInfo.playbackState != 1;
    }

    private boolean hasMedia() {
        return !this.controllerInfo.playerInfo.timeline.isEmpty();
    }

    private void initializeLegacyPlaylist() {
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.util.Assertions.checkState(isPrepared() && hasMedia());
        androidx.media3.session.QueueTimeline queueTimeline = (androidx.media3.session.QueueTimeline) this.controllerInfo.playerInfo.timeline;
        int i = this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
        androidx.media3.common.MediaItem mediaItem = queueTimeline.getWindow(i, window).mediaItem;
        if (queueTimeline.getQueueId(i) != -1) {
            if (this.controllerInfo.playerInfo.playWhenReady) {
                this.controllerCompat.getTransportControls().play();
            } else {
                this.controllerCompat.getTransportControls().prepare();
            }
        } else if (mediaItem.requestMetadata.mediaUri != null) {
            if (this.controllerInfo.playerInfo.playWhenReady) {
                this.controllerCompat.getTransportControls().playFromUri(mediaItem.requestMetadata.mediaUri, getOrEmptyBundle(mediaItem.requestMetadata.extras));
            } else {
                this.controllerCompat.getTransportControls().prepareFromUri(mediaItem.requestMetadata.mediaUri, getOrEmptyBundle(mediaItem.requestMetadata.extras));
            }
        } else if (mediaItem.requestMetadata.searchQuery != null) {
            if (this.controllerInfo.playerInfo.playWhenReady) {
                this.controllerCompat.getTransportControls().playFromSearch(mediaItem.requestMetadata.searchQuery, getOrEmptyBundle(mediaItem.requestMetadata.extras));
            } else {
                this.controllerCompat.getTransportControls().prepareFromSearch(mediaItem.requestMetadata.searchQuery, getOrEmptyBundle(mediaItem.requestMetadata.extras));
            }
        } else if (this.controllerInfo.playerInfo.playWhenReady) {
            this.controllerCompat.getTransportControls().playFromMediaId(mediaItem.mediaId, getOrEmptyBundle(mediaItem.requestMetadata.extras));
        } else {
            this.controllerCompat.getTransportControls().prepareFromMediaId(mediaItem.mediaId, getOrEmptyBundle(mediaItem.requestMetadata.extras));
        }
        if (this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo.positionMs != 0) {
            this.controllerCompat.getTransportControls().seekTo(this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo.positionMs);
        }
        if (getAvailableCommands().contains(20)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 = 0; i2 < queueTimeline.getWindowCount(); i2++) {
                if (i2 != i && queueTimeline.getQueueId(i2) == -1) {
                    arrayList.add(queueTimeline.getWindow(i2, window).mediaItem);
                }
            }
            addQueueItems(arrayList, 0);
        }
    }

    private void addQueueItems(final java.util.List<androidx.media3.common.MediaItem> list, final int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m321x7d622417(atomicInteger, list, arrayList, i);
            }
        };
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.common.MediaMetadata mediaMetadata = list.get(i2).mediaMetadata;
            if (mediaMetadata.artworkData == null) {
                arrayList.add(null);
                runnable.run();
            } else {
                com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFutureDecodeBitmap = this.bitmapLoader.decodeBitmap(mediaMetadata.artworkData);
                arrayList.add(listenableFutureDecodeBitmap);
                final android.os.Handler handler = getInstance().applicationHandler;
                java.util.Objects.requireNonNull(handler);
                listenableFutureDecodeBitmap.addListener(runnable, new java.util.concurrent.Executor() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda19
                    @Override // java.util.concurrent.Executor
                    public final void execute(java.lang.Runnable runnable2) {
                        handler.post(runnable2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: lambda$addQueueItems$4$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m321x7d622417(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.List list, java.util.List list2, int i) {
        if (atomicInteger.incrementAndGet() == list.size()) {
            handleBitmapFuturesAllCompletedAndAddQueueItems(list2, list, i);
        }
    }

    private void handleBitmapFuturesAllCompletedAndAddQueueItems(java.util.List<com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap>> list, java.util.List<androidx.media3.common.MediaItem> list2, int i) {
        android.graphics.Bitmap bitmap;
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFuture = list.get(i2);
            if (listenableFuture != null) {
                try {
                    bitmap = (android.graphics.Bitmap) com.google.common.util.concurrent.Futures.getDone(listenableFuture);
                } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
                    androidx.media3.common.util.Log.d(TAG, "Failed to get bitmap", e);
                    bitmap = null;
                }
            } else {
                bitmap = null;
            }
            this.controllerCompat.addQueueItem(androidx.media3.session.LegacyConversions.convertToMediaDescriptionCompat(list2.get(i2), bitmap), i + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleNewLegacyParameters(boolean z, androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo legacyPlayerInfo) {
        if (this.released || !this.connected) {
            return;
        }
        androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfoBuildNewControllerInfo = buildNewControllerInfo(z, this.legacyPlayerInfo, this.controllerInfo, legacyPlayerInfo, this.controllerCompat.getPackageName(), this.controllerCompat.getFlags(), this.controllerCompat.isSessionReady(), this.controllerCompat.getRatingType(), getInstance().getTimeDiffMs(), getRoutingControllerId(this.controllerCompat), this.context);
        android.util.Pair<java.lang.Integer, java.lang.Integer> pairCalculateDiscontinuityAndTransitionReason = calculateDiscontinuityAndTransitionReason(this.legacyPlayerInfo, this.controllerInfo, legacyPlayerInfo, controllerInfoBuildNewControllerInfo, getInstance().getTimeDiffMs());
        updateControllerInfo(z, legacyPlayerInfo, controllerInfoBuildNewControllerInfo, (java.lang.Integer) pairCalculateDiscontinuityAndTransitionReason.first, (java.lang.Integer) pairCalculateDiscontinuityAndTransitionReason.second);
    }

    private void updateStateMaskedControllerInfo(androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo, java.lang.Integer num, java.lang.Integer num2) {
        updateControllerInfo(false, this.legacyPlayerInfo, controllerInfo, num, num2);
    }

    private void updateControllerInfo(boolean z, androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo legacyPlayerInfo, final androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo, final java.lang.Integer num, final java.lang.Integer num2) {
        androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo legacyPlayerInfo2 = this.legacyPlayerInfo;
        final androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo2 = this.controllerInfo;
        if (legacyPlayerInfo2 != legacyPlayerInfo) {
            this.legacyPlayerInfo = new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(legacyPlayerInfo);
        }
        this.pendingLegacyPlayerInfo = this.legacyPlayerInfo;
        this.controllerInfo = controllerInfo;
        if (z) {
            getInstance().notifyAccepted();
            if (controllerInfo2.customLayout.equals(controllerInfo.customLayout)) {
                return;
            }
            getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda22
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m330x2ebacb15(controllerInfo, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
            return;
        }
        if (!controllerInfo2.playerInfo.timeline.equals(controllerInfo.playerInfo.timeline)) {
            this.listeners.queueEvent(0, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda7
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo3 = controllerInfo;
                    ((androidx.media3.common.Player.Listener) obj).onTimelineChanged(controllerInfo3.playerInfo.timeline, controllerInfo3.playerInfo.timelineChangeReason);
                }
            });
        }
        if (!androidx.media3.common.util.Util.areEqual(legacyPlayerInfo2.queueTitle, legacyPlayerInfo.queueTitle)) {
            this.listeners.queueEvent(15, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda9
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaylistMetadataChanged(controllerInfo.playerInfo.playlistMetadata);
                }
            });
        }
        if (num != null) {
            this.listeners.queueEvent(11, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda10
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPositionDiscontinuity(controllerInfo2.playerInfo.sessionPositionInfo.positionInfo, controllerInfo.playerInfo.sessionPositionInfo.positionInfo, num.intValue());
                }
            });
        }
        if (num2 != null) {
            this.listeners.queueEvent(1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda12
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMediaItemTransition(controllerInfo.playerInfo.getCurrentMediaItem(), num2.intValue());
                }
            });
        }
        if (!androidx.media3.session.MediaUtils.areEqualError(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo.playbackStateCompat)) {
            final androidx.media3.common.PlaybackException playbackExceptionConvertToPlaybackException = androidx.media3.session.LegacyConversions.convertToPlaybackException(legacyPlayerInfo.playbackStateCompat);
            this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda13
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlayerErrorChanged(playbackExceptionConvertToPlaybackException);
                }
            });
            if (playbackExceptionConvertToPlaybackException != null) {
                this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda14
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onPlayerError(playbackExceptionConvertToPlaybackException);
                    }
                });
            }
        }
        if (legacyPlayerInfo2.mediaMetadataCompat != legacyPlayerInfo.mediaMetadataCompat) {
            this.listeners.queueEvent(14, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda15
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    this.f$0.m326xa9c99029((androidx.media3.common.Player.Listener) obj);
                }
            });
        }
        if (controllerInfo2.playerInfo.playbackState != controllerInfo.playerInfo.playbackState) {
            this.listeners.queueEvent(4, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda16
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackStateChanged(controllerInfo.playerInfo.playbackState);
                }
            });
        }
        if (controllerInfo2.playerInfo.playWhenReady != controllerInfo.playerInfo.playWhenReady) {
            this.listeners.queueEvent(5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda17
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlayWhenReadyChanged(controllerInfo.playerInfo.playWhenReady, 4);
                }
            });
        }
        if (controllerInfo2.playerInfo.isPlaying != controllerInfo.playerInfo.isPlaying) {
            this.listeners.queueEvent(7, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda23
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onIsPlayingChanged(controllerInfo.playerInfo.isPlaying);
                }
            });
        }
        if (!controllerInfo2.playerInfo.playbackParameters.equals(controllerInfo.playerInfo.playbackParameters)) {
            this.listeners.queueEvent(12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda24
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackParametersChanged(controllerInfo.playerInfo.playbackParameters);
                }
            });
        }
        if (controllerInfo2.playerInfo.repeatMode != controllerInfo.playerInfo.repeatMode) {
            this.listeners.queueEvent(8, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda25
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onRepeatModeChanged(controllerInfo.playerInfo.repeatMode);
                }
            });
        }
        if (controllerInfo2.playerInfo.shuffleModeEnabled != controllerInfo.playerInfo.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda26
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onShuffleModeEnabledChanged(controllerInfo.playerInfo.shuffleModeEnabled);
                }
            });
        }
        if (!controllerInfo2.playerInfo.audioAttributes.equals(controllerInfo.playerInfo.audioAttributes)) {
            this.listeners.queueEvent(20, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onAudioAttributesChanged(controllerInfo.playerInfo.audioAttributes);
                }
            });
        }
        if (!controllerInfo2.playerInfo.deviceInfo.equals(controllerInfo.playerInfo.deviceInfo)) {
            this.listeners.queueEvent(29, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onDeviceInfoChanged(controllerInfo.playerInfo.deviceInfo);
                }
            });
        }
        if (controllerInfo2.playerInfo.deviceVolume != controllerInfo.playerInfo.deviceVolume || controllerInfo2.playerInfo.deviceMuted != controllerInfo.playerInfo.deviceMuted) {
            this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda3
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo3 = controllerInfo;
                    ((androidx.media3.common.Player.Listener) obj).onDeviceVolumeChanged(controllerInfo3.playerInfo.deviceVolume, controllerInfo3.playerInfo.deviceMuted);
                }
            });
        }
        if (!controllerInfo2.availablePlayerCommands.equals(controllerInfo.availablePlayerCommands)) {
            this.listeners.queueEvent(13, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onAvailableCommandsChanged(controllerInfo.availablePlayerCommands);
                }
            });
        }
        if (!controllerInfo2.availableSessionCommands.equals(controllerInfo.availableSessionCommands)) {
            getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m327x1b2d4849(controllerInfo, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }
        if (!controllerInfo2.customLayout.equals(controllerInfo.customLayout)) {
            getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda6
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m328x5eb8660a(controllerInfo, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }
        if (controllerInfo.sessionError != null) {
            getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplLegacy$$ExternalSyntheticLambda8
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m329xa24383cb(controllerInfo, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }
        this.listeners.flushEvents();
    }

    /* JADX INFO: renamed from: lambda$updateControllerInfo$5$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m330x2ebacb15(androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo, androidx.media3.session.MediaController.Listener listener) {
        ignoreFuture(listener.onSetCustomLayout(getInstance(), controllerInfo.customLayout));
        listener.onCustomLayoutChanged(getInstance(), controllerInfo.customLayout);
    }

    /* JADX INFO: renamed from: lambda$updateControllerInfo$12$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m326xa9c99029(androidx.media3.common.Player.Listener listener) {
        listener.onMediaMetadataChanged(this.controllerInfo.playerInfo.mediaMetadata);
    }

    /* JADX INFO: renamed from: lambda$updateControllerInfo$23$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m327x1b2d4849(androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo, androidx.media3.session.MediaController.Listener listener) {
        listener.onAvailableSessionCommandsChanged(getInstance(), controllerInfo.availableSessionCommands);
    }

    /* JADX INFO: renamed from: lambda$updateControllerInfo$24$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m328x5eb8660a(androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo, androidx.media3.session.MediaController.Listener listener) {
        ignoreFuture(listener.onSetCustomLayout(getInstance(), controllerInfo.customLayout));
        listener.onCustomLayoutChanged(getInstance(), controllerInfo.customLayout);
    }

    /* JADX INFO: renamed from: lambda$updateControllerInfo$25$androidx-media3-session-MediaControllerImplLegacy, reason: not valid java name */
    /* synthetic */ void m329xa24383cb(androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo, androidx.media3.session.MediaController.Listener listener) {
        listener.onError(getInstance(), controllerInfo.sessionError);
    }

    private static java.lang.String getRoutingControllerId(androidx.media3.session.legacy.MediaControllerCompat mediaControllerCompat) {
        android.media.session.MediaController.PlaybackInfo playbackInfo;
        if (androidx.media3.common.util.Util.SDK_INT >= 30 && (playbackInfo = ((android.media.session.MediaController) mediaControllerCompat.getMediaController()).getPlaybackInfo()) != null) {
            return playbackInfo.getVolumeControlId();
        }
        return null;
    }

    private class ConnectionCallback extends androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback {
        private ConnectionCallback() {
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            androidx.media3.session.legacy.MediaBrowserCompat browserCompat = androidx.media3.session.MediaControllerImplLegacy.this.getBrowserCompat();
            if (browserCompat != null) {
                androidx.media3.session.MediaControllerImplLegacy.this.connectToSession(browserCompat.getSessionToken());
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            androidx.media3.session.MediaControllerImplLegacy.this.getInstance().release();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            androidx.media3.session.MediaControllerImplLegacy.this.getInstance().release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ControllerCompatCallback extends androidx.media3.session.legacy.MediaControllerCompat.Callback {
        private static final int MSG_HANDLE_PENDING_UPDATES = 1;
        private final android.os.Handler pendingChangesHandler;

        public ControllerCompatCallback(android.os.Looper looper) {
            this.pendingChangesHandler = new android.os.Handler(looper, new android.os.Handler.Callback() { // from class: androidx.media3.session.MediaControllerImplLegacy$ControllerCompatCallback$$ExternalSyntheticLambda3
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(android.os.Message message) {
                    return this.f$0.m331x38d58084(message);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$new$0$androidx-media3-session-MediaControllerImplLegacy$ControllerCompatCallback, reason: not valid java name */
        /* synthetic */ boolean m331x38d58084(android.os.Message message) {
            if (message.what == 1) {
                androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this;
                mediaControllerImplLegacy.handleNewLegacyParameters(false, mediaControllerImplLegacy.pendingLegacyPlayerInfo);
            }
            return true;
        }

        public void release() {
            this.pendingChangesHandler.removeCallbacksAndMessages(null);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onSessionReady() {
            if (!androidx.media3.session.MediaControllerImplLegacy.this.connected) {
                androidx.media3.session.MediaControllerImplLegacy.this.onConnected();
                return;
            }
            androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithExtraBinderGetters(androidx.media3.session.MediaControllerImplLegacy.convertToSafePlaybackStateCompat(androidx.media3.session.MediaControllerImplLegacy.this.controllerCompat.getPlaybackState()), androidx.media3.session.MediaControllerImplLegacy.this.controllerCompat.getRepeatMode(), androidx.media3.session.MediaControllerImplLegacy.this.controllerCompat.getShuffleMode());
            onCaptioningEnabledChanged(androidx.media3.session.MediaControllerImplLegacy.this.controllerCompat.isCaptioningEnabled());
            this.pendingChangesHandler.removeMessages(1);
            androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy2 = androidx.media3.session.MediaControllerImplLegacy.this;
            mediaControllerImplLegacy2.handleNewLegacyParameters(false, mediaControllerImplLegacy2.pendingLegacyPlayerInfo);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            androidx.media3.session.MediaControllerImplLegacy.this.getInstance().release();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onSessionEvent(final java.lang.String str, final android.os.Bundle bundle) {
            if (str == null) {
                return;
            }
            androidx.media3.session.MediaControllerImplLegacy.this.getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplLegacy$ControllerCompatCallback$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m334x2abd04a6(str, bundle, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onSessionEvent$1$androidx-media3-session-MediaControllerImplLegacy$ControllerCompatCallback, reason: not valid java name */
        /* synthetic */ void m334x2abd04a6(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.MediaController.Listener listener) {
            androidx.media3.session.MediaController mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this.getInstance();
            androidx.media3.session.SessionCommand sessionCommand = new androidx.media3.session.SessionCommand(str, android.os.Bundle.EMPTY);
            if (bundle == null) {
                bundle = android.os.Bundle.EMPTY;
            }
            androidx.media3.session.MediaControllerImplLegacy.ignoreFuture(listener.onCustomCommand(mediaControllerImplLegacy, sessionCommand, bundle));
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
            androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithPlaybackStateCompat(androidx.media3.session.MediaControllerImplLegacy.convertToSafePlaybackStateCompat(playbackStateCompat));
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onMetadataChanged(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
            androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithMediaMetadataCompat(mediaMetadataCompat);
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onQueueChanged(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) {
            androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithQueue(androidx.media3.session.MediaControllerImplLegacy.convertToNonNullQueueItemList(list));
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onQueueTitleChanged(java.lang.CharSequence charSequence) {
            androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithQueueTitle(charSequence);
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onExtrasChanged(final android.os.Bundle bundle) {
            androidx.media3.session.MediaControllerImplLegacy.this.controllerInfo = new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(androidx.media3.session.MediaControllerImplLegacy.this.controllerInfo.playerInfo, androidx.media3.session.MediaControllerImplLegacy.this.controllerInfo.availableSessionCommands, androidx.media3.session.MediaControllerImplLegacy.this.controllerInfo.availablePlayerCommands, androidx.media3.session.MediaControllerImplLegacy.this.controllerInfo.customLayout, bundle, null);
            androidx.media3.session.MediaControllerImplLegacy.this.getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplLegacy$ControllerCompatCallback$$ExternalSyntheticLambda2
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m333x9a6b3370(bundle, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onExtrasChanged$2$androidx-media3-session-MediaControllerImplLegacy$ControllerCompatCallback, reason: not valid java name */
        /* synthetic */ void m333x9a6b3370(android.os.Bundle bundle, androidx.media3.session.MediaController.Listener listener) {
            listener.onExtrasChanged(androidx.media3.session.MediaControllerImplLegacy.this.getInstance(), bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onAudioInfoChanged(androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfo) {
            androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithPlaybackInfoCompat(playbackInfo);
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onCaptioningEnabledChanged(final boolean z) {
            androidx.media3.session.MediaControllerImplLegacy.this.getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplLegacy$ControllerCompatCallback$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m332xceb86159(z, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onCaptioningEnabledChanged$3$androidx-media3-session-MediaControllerImplLegacy$ControllerCompatCallback, reason: not valid java name */
        /* synthetic */ void m332xceb86159(boolean z, androidx.media3.session.MediaController.Listener listener) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
            androidx.media3.session.MediaControllerImplLegacy.ignoreFuture(listener.onCustomCommand(androidx.media3.session.MediaControllerImplLegacy.this.getInstance(), new androidx.media3.session.SessionCommand("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", android.os.Bundle.EMPTY), bundle));
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onRepeatModeChanged(int i) {
            androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithRepeatMode(i);
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onShuffleModeChanged(int i) {
            androidx.media3.session.MediaControllerImplLegacy mediaControllerImplLegacy = androidx.media3.session.MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithShuffleMode(i);
            startWaitingForPendingChanges();
        }

        private void startWaitingForPendingChanges() {
            if (this.pendingChangesHandler.hasMessages(1)) {
                return;
            }
            this.pendingChangesHandler.sendEmptyMessageDelayed(1, 500L);
        }
    }

    private static androidx.media3.session.MediaControllerImplLegacy.ControllerInfo buildNewControllerInfo(boolean z, androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo legacyPlayerInfo, androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo, androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo legacyPlayerInfo2, java.lang.String str, long j, boolean z2, int i, long j2, java.lang.String str2, android.content.Context context) {
        androidx.media3.session.QueueTimeline queueTimelineCopy;
        androidx.media3.common.MediaMetadata mediaMetadataConvertToMediaMetadata;
        int i2;
        androidx.media3.common.MediaMetadata mediaMetadata;
        androidx.media3.common.MediaMetadata mediaMetadataConvertToMediaMetadata2;
        androidx.media3.session.SessionCommands sessionCommandsConvertToSessionCommands;
        com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableListConvertToCustomLayout;
        int iConvertToPlaybackState;
        boolean z3 = legacyPlayerInfo.queue != legacyPlayerInfo2.queue;
        if (z3) {
            queueTimelineCopy = androidx.media3.session.QueueTimeline.create(legacyPlayerInfo2.queue);
        } else {
            queueTimelineCopy = ((androidx.media3.session.QueueTimeline) controllerInfo.playerInfo.timeline).copy();
        }
        boolean z4 = legacyPlayerInfo.mediaMetadataCompat != legacyPlayerInfo2.mediaMetadataCompat || z;
        long activeQueueId = getActiveQueueId(legacyPlayerInfo.playbackStateCompat);
        long activeQueueId2 = getActiveQueueId(legacyPlayerInfo2.playbackStateCompat);
        boolean z5 = activeQueueId != activeQueueId2 || z;
        long jConvertToDurationMs = androidx.media3.session.LegacyConversions.convertToDurationMs(legacyPlayerInfo2.mediaMetadataCompat);
        if (z4 || z5 || z3) {
            int iFindQueueItemIndex = findQueueItemIndex(legacyPlayerInfo2.queue, activeQueueId2);
            boolean z6 = legacyPlayerInfo2.mediaMetadataCompat != null;
            if (z6 && z4) {
                mediaMetadataConvertToMediaMetadata = androidx.media3.session.LegacyConversions.convertToMediaMetadata(legacyPlayerInfo2.mediaMetadataCompat, i);
            } else if (z6 || !z5) {
                mediaMetadataConvertToMediaMetadata = controllerInfo.playerInfo.mediaMetadata;
            } else if (iFindQueueItemIndex == -1) {
                mediaMetadataConvertToMediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
            } else {
                mediaMetadataConvertToMediaMetadata = androidx.media3.session.LegacyConversions.convertToMediaMetadata(legacyPlayerInfo2.queue.get(iFindQueueItemIndex).getDescription(), i);
            }
            if (iFindQueueItemIndex == -1 && z4) {
                if (z6) {
                    androidx.media3.common.util.Log.w(TAG, "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                    queueTimelineCopy = queueTimelineCopy.copyWithFakeMediaItem(androidx.media3.session.LegacyConversions.convertToMediaItem(legacyPlayerInfo2.mediaMetadataCompat, i), jConvertToDurationMs);
                    iFindQueueItemIndex = queueTimelineCopy.getWindowCount() - 1;
                } else {
                    queueTimelineCopy = queueTimelineCopy.copyWithClearedFakeMediaItem();
                    iFindQueueItemIndex = 0;
                }
            } else if (iFindQueueItemIndex != -1) {
                queueTimelineCopy = queueTimelineCopy.copyWithClearedFakeMediaItem();
                if (z6) {
                    queueTimelineCopy = queueTimelineCopy.copyWithNewMediaItem(iFindQueueItemIndex, androidx.media3.session.LegacyConversions.convertToMediaItem(((androidx.media3.common.MediaItem) androidx.media3.common.util.Assertions.checkNotNull(queueTimelineCopy.getMediaItemAt(iFindQueueItemIndex))).mediaId, legacyPlayerInfo2.mediaMetadataCompat, i), jConvertToDurationMs);
                }
            } else {
                iFindQueueItemIndex = 0;
            }
            i2 = iFindQueueItemIndex;
            mediaMetadata = mediaMetadataConvertToMediaMetadata;
        } else {
            int i3 = controllerInfo.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
            mediaMetadata = controllerInfo.playerInfo.mediaMetadata;
            i2 = i3;
        }
        if (legacyPlayerInfo.queueTitle == legacyPlayerInfo2.queueTitle) {
            mediaMetadataConvertToMediaMetadata2 = controllerInfo.playerInfo.playlistMetadata;
        } else {
            mediaMetadataConvertToMediaMetadata2 = androidx.media3.session.LegacyConversions.convertToMediaMetadata(legacyPlayerInfo2.queueTitle);
        }
        androidx.media3.common.MediaMetadata mediaMetadata2 = mediaMetadataConvertToMediaMetadata2;
        int iConvertToRepeatMode = androidx.media3.session.LegacyConversions.convertToRepeatMode(legacyPlayerInfo2.repeatMode);
        boolean zConvertToShuffleModeEnabled = androidx.media3.session.LegacyConversions.convertToShuffleModeEnabled(legacyPlayerInfo2.shuffleMode);
        if (legacyPlayerInfo.playbackStateCompat != legacyPlayerInfo2.playbackStateCompat) {
            sessionCommandsConvertToSessionCommands = androidx.media3.session.LegacyConversions.convertToSessionCommands(legacyPlayerInfo2.playbackStateCompat, z2);
            immutableListConvertToCustomLayout = androidx.media3.session.LegacyConversions.convertToCustomLayout(legacyPlayerInfo2.playbackStateCompat);
        } else {
            sessionCommandsConvertToSessionCommands = controllerInfo.availableSessionCommands;
            immutableListConvertToCustomLayout = controllerInfo.customLayout;
        }
        androidx.media3.session.SessionCommands sessionCommands = sessionCommandsConvertToSessionCommands;
        com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList = immutableListConvertToCustomLayout;
        androidx.media3.common.Player.Commands commandsConvertToPlayerCommands = androidx.media3.session.LegacyConversions.convertToPlayerCommands(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.playbackInfoCompat != null ? legacyPlayerInfo2.playbackInfoCompat.getVolumeControl() : 0, j, z2);
        androidx.media3.common.PlaybackException playbackExceptionConvertToPlaybackException = androidx.media3.session.LegacyConversions.convertToPlaybackException(legacyPlayerInfo2.playbackStateCompat);
        androidx.media3.session.SessionError sessionErrorConvertToSessionError = androidx.media3.session.LegacyConversions.convertToSessionError(legacyPlayerInfo2.playbackStateCompat, context);
        long jConvertToCurrentPositionMs = androidx.media3.session.LegacyConversions.convertToCurrentPositionMs(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        long jConvertToBufferedPositionMs = androidx.media3.session.LegacyConversions.convertToBufferedPositionMs(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        int iConvertToBufferedPercentage = androidx.media3.session.LegacyConversions.convertToBufferedPercentage(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        long jConvertToTotalBufferedDurationMs = androidx.media3.session.LegacyConversions.convertToTotalBufferedDurationMs(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        boolean zConvertToIsPlayingAd = androidx.media3.session.LegacyConversions.convertToIsPlayingAd(legacyPlayerInfo2.mediaMetadataCompat);
        androidx.media3.common.PlaybackParameters playbackParametersConvertToPlaybackParameters = androidx.media3.session.LegacyConversions.convertToPlaybackParameters(legacyPlayerInfo2.playbackStateCompat);
        androidx.media3.common.AudioAttributes audioAttributesConvertToAudioAttributes = androidx.media3.session.LegacyConversions.convertToAudioAttributes(legacyPlayerInfo2.playbackInfoCompat);
        boolean zConvertToPlayWhenReady = androidx.media3.session.LegacyConversions.convertToPlayWhenReady(legacyPlayerInfo2.playbackStateCompat);
        try {
            iConvertToPlaybackState = androidx.media3.session.LegacyConversions.convertToPlaybackState(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        } catch (androidx.media3.session.LegacyConversions.ConversionException unused) {
            androidx.media3.common.util.Log.e(TAG, java.lang.String.format("Received invalid playback state %s from package %s. Keeping the previous state.", java.lang.Integer.valueOf(legacyPlayerInfo2.playbackStateCompat.getState()), str));
            iConvertToPlaybackState = controllerInfo.playerInfo.playbackState;
        }
        return createControllerInfo(queueTimelineCopy, mediaMetadata, i2, mediaMetadata2, iConvertToRepeatMode, zConvertToShuffleModeEnabled, sessionCommands, commandsConvertToPlayerCommands, immutableList, legacyPlayerInfo2.sessionExtras, playbackExceptionConvertToPlaybackException, sessionErrorConvertToSessionError, jConvertToDurationMs, jConvertToCurrentPositionMs, jConvertToBufferedPositionMs, iConvertToBufferedPercentage, jConvertToTotalBufferedDurationMs, zConvertToIsPlayingAd, playbackParametersConvertToPlaybackParameters, audioAttributesConvertToAudioAttributes, zConvertToPlayWhenReady, iConvertToPlaybackState, androidx.media3.session.LegacyConversions.convertToIsPlaying(legacyPlayerInfo2.playbackStateCompat), androidx.media3.session.LegacyConversions.convertToDeviceInfo(legacyPlayerInfo2.playbackInfoCompat, str2), androidx.media3.session.LegacyConversions.convertToDeviceVolume(legacyPlayerInfo2.playbackInfoCompat), androidx.media3.session.LegacyConversions.convertToIsDeviceMuted(legacyPlayerInfo2.playbackInfoCompat), controllerInfo.playerInfo.seekBackIncrementMs, controllerInfo.playerInfo.seekForwardIncrementMs, controllerInfo.playerInfo.maxSeekToPreviousPositionMs);
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> calculateDiscontinuityAndTransitionReason(androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo legacyPlayerInfo, androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo, androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo legacyPlayerInfo2, androidx.media3.session.MediaControllerImplLegacy.ControllerInfo controllerInfo2, long j) {
        java.lang.Integer num;
        java.lang.Integer num2;
        int i;
        boolean zIsEmpty = controllerInfo.playerInfo.timeline.isEmpty();
        boolean zIsEmpty2 = controllerInfo2.playerInfo.timeline.isEmpty();
        java.lang.Integer num3 = null;
        if (zIsEmpty && zIsEmpty2) {
            num = null;
        } else if (zIsEmpty && !zIsEmpty2) {
            num3 = 0;
            num = 3;
        } else {
            androidx.media3.common.MediaItem mediaItem = (androidx.media3.common.MediaItem) androidx.media3.common.util.Assertions.checkStateNotNull(controllerInfo.playerInfo.getCurrentMediaItem());
            if (!((androidx.media3.session.QueueTimeline) controllerInfo2.playerInfo.timeline).contains(mediaItem)) {
                num3 = 4;
                num = 3;
            } else if (mediaItem.equals(controllerInfo2.playerInfo.getCurrentMediaItem())) {
                long jConvertToCurrentPositionMs = androidx.media3.session.LegacyConversions.convertToCurrentPositionMs(legacyPlayerInfo.playbackStateCompat, legacyPlayerInfo.mediaMetadataCompat, j);
                long jConvertToCurrentPositionMs2 = androidx.media3.session.LegacyConversions.convertToCurrentPositionMs(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j);
                if (jConvertToCurrentPositionMs2 == 0 && controllerInfo2.playerInfo.repeatMode == 1) {
                    i = 0;
                    num2 = 0;
                } else {
                    if (java.lang.Math.abs(jConvertToCurrentPositionMs - jConvertToCurrentPositionMs2) > 100) {
                        i = 5;
                        num2 = null;
                    } else {
                        num2 = null;
                    }
                    num = num2;
                }
                num3 = i;
                num = num2;
            } else {
                num3 = 0;
                num = 1;
            }
        }
        return android.util.Pair.create(num3, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> convertToNonNullQueueItemList(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) {
        return list == null ? java.util.Collections.emptyList() : androidx.media3.session.MediaUtils.removeNullElements(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.session.legacy.PlaybackStateCompat convertToSafePlaybackStateCompat(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return null;
        }
        if (playbackStateCompat.getPlaybackSpeed() > 0.0f) {
            return playbackStateCompat;
        }
        androidx.media3.common.util.Log.w(TAG, "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        return new androidx.media3.session.legacy.PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), playbackStateCompat.getPosition(), 1.0f, playbackStateCompat.getLastPositionUpdateTime()).build();
    }

    private static android.os.Bundle getOrEmptyBundle(android.os.Bundle bundle) {
        return bundle == null ? android.os.Bundle.EMPTY : bundle;
    }

    private static long getActiveQueueId(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return -1L;
        }
        return playbackStateCompat.getActiveQueueItemId();
    }

    private static int findQueueItemIndex(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list, long j) {
        if (list != null && j != -1) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getQueueId() == j) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static androidx.media3.session.MediaControllerImplLegacy.ControllerInfo createControllerInfo(androidx.media3.session.QueueTimeline queueTimeline, androidx.media3.common.MediaMetadata mediaMetadata, int i, androidx.media3.common.MediaMetadata mediaMetadata2, int i2, boolean z, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, android.os.Bundle bundle, androidx.media3.common.PlaybackException playbackException, androidx.media3.session.SessionError sessionError, long j, long j2, long j3, int i3, long j4, boolean z2, androidx.media3.common.PlaybackParameters playbackParameters, androidx.media3.common.AudioAttributes audioAttributes, boolean z3, int i4, boolean z4, androidx.media3.common.DeviceInfo deviceInfo, int i5, boolean z5, long j5, long j6, long j7) {
        return new androidx.media3.session.MediaControllerImplLegacy.ControllerInfo(new androidx.media3.session.PlayerInfo(playbackException, 0, new androidx.media3.session.SessionPositionInfo(createPositionInfo(i, queueTimeline.getMediaItemAt(i), j2, z2), z2, android.os.SystemClock.elapsedRealtime(), j, j3, i3, j4, androidx.media3.common.C.TIME_UNSET, j, j3), androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO, androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO, 0, playbackParameters, i2, z, androidx.media3.common.VideoSize.UNKNOWN, queueTimeline, 0, mediaMetadata2, 1.0f, audioAttributes, androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO, deviceInfo, i5, z5, z3, 1, 0, i4, z4, false, mediaMetadata, j5, j6, j7, androidx.media3.common.Tracks.EMPTY, androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT), sessionCommands, commands, immutableList, bundle, sessionError);
    }

    private static androidx.media3.common.Player.PositionInfo createPositionInfo(int i, androidx.media3.common.MediaItem mediaItem, long j, boolean z) {
        return new androidx.media3.common.Player.PositionInfo(null, i, mediaItem, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    private static androidx.media3.session.SessionPositionInfo createSessionPositionInfo(androidx.media3.common.Player.PositionInfo positionInfo, boolean z, long j, long j2, int i, long j3) {
        return new androidx.media3.session.SessionPositionInfo(positionInfo, z, android.os.SystemClock.elapsedRealtime(), j, j2, i, j3, androidx.media3.common.C.TIME_UNSET, j, j2);
    }

    private static final class LegacyPlayerInfo {
        public final androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat;
        public final androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfoCompat;
        public final androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat;
        public final java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> queue;
        public final java.lang.CharSequence queueTitle;
        public final int repeatMode;
        public final android.os.Bundle sessionExtras;
        public final int shuffleMode;

        public LegacyPlayerInfo() {
            this.playbackInfoCompat = null;
            this.playbackStateCompat = null;
            this.mediaMetadataCompat = null;
            this.queue = java.util.Collections.emptyList();
            this.queueTitle = null;
            this.repeatMode = 0;
            this.shuffleMode = 0;
            this.sessionExtras = android.os.Bundle.EMPTY;
        }

        public LegacyPlayerInfo(androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfo, androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list, java.lang.CharSequence charSequence, int i, int i2, android.os.Bundle bundle) {
            this.playbackInfoCompat = playbackInfo;
            this.playbackStateCompat = playbackStateCompat;
            this.mediaMetadataCompat = mediaMetadataCompat;
            this.queue = (java.util.List) androidx.media3.common.util.Assertions.checkNotNull(list);
            this.queueTitle = charSequence;
            this.repeatMode = i;
            this.shuffleMode = i2;
            this.sessionExtras = bundle == null ? android.os.Bundle.EMPTY : bundle;
        }

        public LegacyPlayerInfo(androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo legacyPlayerInfo) {
            this.playbackInfoCompat = legacyPlayerInfo.playbackInfoCompat;
            this.playbackStateCompat = legacyPlayerInfo.playbackStateCompat;
            this.mediaMetadataCompat = legacyPlayerInfo.mediaMetadataCompat;
            this.queue = legacyPlayerInfo.queue;
            this.queueTitle = legacyPlayerInfo.queueTitle;
            this.repeatMode = legacyPlayerInfo.repeatMode;
            this.shuffleMode = legacyPlayerInfo.shuffleMode;
            this.sessionExtras = legacyPlayerInfo.sessionExtras;
        }

        public androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo copyWithExtraBinderGetters(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, int i, int i2) {
            return new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(this.playbackInfoCompat, playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, i, i2, this.sessionExtras);
        }

        public androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo copyWithPlaybackStateCompat(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
            return new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(this.playbackInfoCompat, playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        public androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo copyWithMediaMetadataCompat(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
            return new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, mediaMetadataCompat, this.queue, this.queueTitle, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        public androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo copyWithQueue(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) {
            return new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, this.mediaMetadataCompat, list, this.queueTitle, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        public androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo copyWithQueueTitle(java.lang.CharSequence charSequence) {
            return new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, this.mediaMetadataCompat, this.queue, charSequence, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        public androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo copyWithPlaybackInfoCompat(androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfo) {
            return new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(playbackInfo, this.playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        public androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo copyWithRepeatMode(int i) {
            return new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, i, this.shuffleMode, this.sessionExtras);
        }

        public androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo copyWithShuffleMode(int i) {
            return new androidx.media3.session.MediaControllerImplLegacy.LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, this.repeatMode, i, this.sessionExtras);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class ControllerInfo {
        public final androidx.media3.common.Player.Commands availablePlayerCommands;
        public final androidx.media3.session.SessionCommands availableSessionCommands;
        public final com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayout;
        public final androidx.media3.session.PlayerInfo playerInfo;
        public final androidx.media3.session.SessionError sessionError;
        public final android.os.Bundle sessionExtras;

        public ControllerInfo() {
            this.playerInfo = androidx.media3.session.PlayerInfo.DEFAULT.copyWithTimeline(androidx.media3.session.QueueTimeline.DEFAULT);
            this.availableSessionCommands = androidx.media3.session.SessionCommands.EMPTY;
            this.availablePlayerCommands = androidx.media3.common.Player.Commands.EMPTY;
            this.customLayout = com.google.common.collect.ImmutableList.of();
            this.sessionExtras = android.os.Bundle.EMPTY;
            this.sessionError = null;
        }

        public ControllerInfo(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, android.os.Bundle bundle, androidx.media3.session.SessionError sessionError) {
            this.playerInfo = playerInfo;
            this.availableSessionCommands = sessionCommands;
            this.availablePlayerCommands = commands;
            this.customLayout = immutableList;
            this.sessionExtras = bundle == null ? android.os.Bundle.EMPTY : bundle;
            this.sessionError = sessionError;
        }
    }
}
