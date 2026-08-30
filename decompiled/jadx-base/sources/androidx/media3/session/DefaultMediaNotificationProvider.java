package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public class DefaultMediaNotificationProvider implements androidx.media3.session.MediaNotification.Provider {
    public static final java.lang.String COMMAND_KEY_COMPACT_VIEW_INDEX = "androidx.media3.session.command.COMPACT_VIEW_INDEX";
    public static final java.lang.String DEFAULT_CHANNEL_ID = "default_channel_id";
    public static final int DEFAULT_CHANNEL_NAME_RESOURCE_ID = androidx.media3.session.R.string.default_notification_channel_name;
    public static final int DEFAULT_NOTIFICATION_ID = 1001;
    public static final java.lang.String GROUP_KEY = "media3_group_key";
    private static final java.lang.String TAG = "NotificationProvider";
    private final java.lang.String channelId;
    private final int channelNameResourceId;
    private final android.content.Context context;
    private final androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider notificationIdProvider;
    private final android.app.NotificationManager notificationManager;
    private androidx.media3.session.DefaultMediaNotificationProvider.OnBitmapLoadedFutureCallback pendingOnBitmapLoadedFutureCallback;
    private int smallIconResourceId;

    public interface NotificationIdProvider {
        int getNotificationId(androidx.media3.session.MediaSession mediaSession);
    }

    static /* synthetic */ int lambda$new$0(androidx.media3.session.MediaSession mediaSession) {
        return 1001;
    }

    @Override // androidx.media3.session.MediaNotification.Provider
    public final boolean handleCustomCommand(androidx.media3.session.MediaSession mediaSession, java.lang.String str, android.os.Bundle bundle) {
        return false;
    }

    public static final class Builder {
        private boolean built;
        private final android.content.Context context;
        private androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider notificationIdProvider = new androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider() { // from class: androidx.media3.session.DefaultMediaNotificationProvider$Builder$$ExternalSyntheticLambda1
            @Override // androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider
            public final int getNotificationId(androidx.media3.session.MediaSession mediaSession) {
                return androidx.media3.session.DefaultMediaNotificationProvider.Builder.lambda$new$0(mediaSession);
            }
        };
        private java.lang.String channelId = androidx.media3.session.DefaultMediaNotificationProvider.DEFAULT_CHANNEL_ID;
        private int channelNameResourceId = androidx.media3.session.DefaultMediaNotificationProvider.DEFAULT_CHANNEL_NAME_RESOURCE_ID;

        static /* synthetic */ int lambda$new$0(androidx.media3.session.MediaSession mediaSession) {
            return 1001;
        }

        static /* synthetic */ int lambda$setNotificationId$1(int i, androidx.media3.session.MediaSession mediaSession) {
            return i;
        }

        public Builder(android.content.Context context) {
            this.context = context;
        }

        public androidx.media3.session.DefaultMediaNotificationProvider.Builder setNotificationId(final int i) {
            this.notificationIdProvider = new androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider() { // from class: androidx.media3.session.DefaultMediaNotificationProvider$Builder$$ExternalSyntheticLambda0
                @Override // androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider
                public final int getNotificationId(androidx.media3.session.MediaSession mediaSession) {
                    return androidx.media3.session.DefaultMediaNotificationProvider.Builder.lambda$setNotificationId$1(i, mediaSession);
                }
            };
            return this;
        }

        public androidx.media3.session.DefaultMediaNotificationProvider.Builder setNotificationIdProvider(androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider notificationIdProvider) {
            this.notificationIdProvider = notificationIdProvider;
            return this;
        }

        public androidx.media3.session.DefaultMediaNotificationProvider.Builder setChannelId(java.lang.String str) {
            this.channelId = str;
            return this;
        }

        public androidx.media3.session.DefaultMediaNotificationProvider.Builder setChannelName(int i) {
            this.channelNameResourceId = i;
            return this;
        }

        public androidx.media3.session.DefaultMediaNotificationProvider build() {
            androidx.media3.common.util.Assertions.checkState(!this.built);
            androidx.media3.session.DefaultMediaNotificationProvider defaultMediaNotificationProvider = new androidx.media3.session.DefaultMediaNotificationProvider(this);
            this.built = true;
            return defaultMediaNotificationProvider;
        }
    }

    public DefaultMediaNotificationProvider(android.content.Context context) {
        this(context, new androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider() { // from class: androidx.media3.session.DefaultMediaNotificationProvider$$ExternalSyntheticLambda0
            @Override // androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider
            public final int getNotificationId(androidx.media3.session.MediaSession mediaSession) {
                return androidx.media3.session.DefaultMediaNotificationProvider.lambda$new$0(mediaSession);
            }
        }, DEFAULT_CHANNEL_ID, DEFAULT_CHANNEL_NAME_RESOURCE_ID);
    }

    public DefaultMediaNotificationProvider(android.content.Context context, androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider notificationIdProvider, java.lang.String str, int i) {
        this.context = context;
        this.notificationIdProvider = notificationIdProvider;
        this.channelId = str;
        this.channelNameResourceId = i;
        this.notificationManager = (android.app.NotificationManager) androidx.media3.common.util.Assertions.checkStateNotNull((android.app.NotificationManager) context.getSystemService("notification"));
        this.smallIconResourceId = androidx.media3.session.R.drawable.media3_notification_small_icon;
    }

    private DefaultMediaNotificationProvider(androidx.media3.session.DefaultMediaNotificationProvider.Builder builder) {
        this(builder.context, builder.notificationIdProvider, builder.channelId, builder.channelNameResourceId);
    }

    @Override // androidx.media3.session.MediaNotification.Provider
    public final androidx.media3.session.MediaNotification createNotification(androidx.media3.session.MediaSession mediaSession, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.MediaNotification.ActionFactory actionFactory, androidx.media3.session.MediaNotification.Provider.Callback callback) {
        ensureNotificationChannel();
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < immutableList.size(); i++) {
            androidx.media3.session.CommandButton commandButton = immutableList.get(i);
            if (commandButton.sessionCommand != null && commandButton.sessionCommand.commandCode == 0 && commandButton.isEnabled) {
                builder.add(immutableList.get(i));
            }
        }
        androidx.media3.common.Player player = mediaSession.getPlayer();
        androidx.core.app.NotificationCompat.Builder builder2 = new androidx.core.app.NotificationCompat.Builder(this.context, this.channelId);
        int notificationId = this.notificationIdProvider.getNotificationId(mediaSession);
        androidx.media3.session.MediaStyleNotificationHelper.MediaStyle mediaStyle = new androidx.media3.session.MediaStyleNotificationHelper.MediaStyle(mediaSession);
        mediaStyle.setShowActionsInCompactView(addNotificationActions(mediaSession, getMediaButtons(mediaSession, player.getAvailableCommands(), builder.build(), !androidx.media3.common.util.Util.shouldShowPlayButton(player, mediaSession.getShowPlayButtonIfPlaybackIsSuppressed())), builder2, actionFactory));
        if (player.isCommandAvailable(18)) {
            androidx.media3.common.MediaMetadata mediaMetadata = player.getMediaMetadata();
            builder2.setContentTitle(getNotificationContentTitle(mediaMetadata)).setContentText(getNotificationContentText(mediaMetadata));
            com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFutureLoadBitmapFromMetadata = mediaSession.getBitmapLoader().loadBitmapFromMetadata(mediaMetadata);
            if (listenableFutureLoadBitmapFromMetadata != null) {
                androidx.media3.session.DefaultMediaNotificationProvider.OnBitmapLoadedFutureCallback onBitmapLoadedFutureCallback = this.pendingOnBitmapLoadedFutureCallback;
                if (onBitmapLoadedFutureCallback != null) {
                    onBitmapLoadedFutureCallback.discardIfPending();
                }
                if (listenableFutureLoadBitmapFromMetadata.isDone()) {
                    try {
                        builder2.setLargeIcon((android.graphics.Bitmap) com.google.common.util.concurrent.Futures.getDone(listenableFutureLoadBitmapFromMetadata));
                    } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
                        androidx.media3.common.util.Log.w(TAG, getBitmapLoadErrorMessage(e));
                    }
                } else {
                    androidx.media3.session.DefaultMediaNotificationProvider.OnBitmapLoadedFutureCallback onBitmapLoadedFutureCallback2 = new androidx.media3.session.DefaultMediaNotificationProvider.OnBitmapLoadedFutureCallback(notificationId, builder2, callback);
                    this.pendingOnBitmapLoadedFutureCallback = onBitmapLoadedFutureCallback2;
                    final android.os.Handler applicationHandler = mediaSession.getImpl().getApplicationHandler();
                    java.util.Objects.requireNonNull(applicationHandler);
                    com.google.common.util.concurrent.Futures.addCallback(listenableFutureLoadBitmapFromMetadata, onBitmapLoadedFutureCallback2, new java.util.concurrent.Executor() { // from class: androidx.media3.session.DefaultMediaNotificationProvider$$ExternalSyntheticLambda1
                        @Override // java.util.concurrent.Executor
                        public final void execute(java.lang.Runnable runnable) {
                            applicationHandler.post(runnable);
                        }
                    });
                }
            }
        }
        if (player.isCommandAvailable(3) || androidx.media3.common.util.Util.SDK_INT < 21) {
            mediaStyle.setCancelButtonIntent(actionFactory.createMediaActionPendingIntent(mediaSession, 3L));
        }
        long playbackStartTimeEpochMs = getPlaybackStartTimeEpochMs(player);
        boolean z = playbackStartTimeEpochMs != androidx.media3.common.C.TIME_UNSET;
        if (!z) {
            playbackStartTimeEpochMs = 0;
        }
        builder2.setWhen(playbackStartTimeEpochMs).setShowWhen(z).setUsesChronometer(z);
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            androidx.media3.session.DefaultMediaNotificationProvider.Api31.setForegroundServiceBehavior(builder2);
        }
        return new androidx.media3.session.MediaNotification(notificationId, builder2.setContentIntent(mediaSession.getSessionActivity()).setDeleteIntent(actionFactory.createMediaActionPendingIntent(mediaSession, 3L)).setOnlyAlertOnce(true).setSmallIcon(this.smallIconResourceId).setStyle(mediaStyle).setVisibility(1).setOngoing(false).setGroup(GROUP_KEY).build());
    }

    public final void setSmallIcon(int i) {
        this.smallIconResourceId = i;
    }

    protected com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> getMediaButtons(androidx.media3.session.MediaSession mediaSession, androidx.media3.common.Player.Commands commands, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, boolean z) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        if (commands.containsAny(7, 6)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(COMMAND_KEY_COMPACT_VIEW_INDEX, -1);
            builder.add(new androidx.media3.session.CommandButton.Builder(androidx.media3.session.CommandButton.ICON_PREVIOUS).setPlayerCommand(6).setDisplayName(this.context.getString(androidx.media3.session.R.string.media3_controls_seek_to_previous_description)).setExtras(bundle).build());
        }
        if (commands.contains(1)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt(COMMAND_KEY_COMPACT_VIEW_INDEX, -1);
            if (z) {
                builder.add(new androidx.media3.session.CommandButton.Builder(androidx.media3.session.CommandButton.ICON_PAUSE).setPlayerCommand(1).setExtras(bundle2).setDisplayName(this.context.getString(androidx.media3.session.R.string.media3_controls_pause_description)).build());
            } else {
                builder.add(new androidx.media3.session.CommandButton.Builder(androidx.media3.session.CommandButton.ICON_PLAY).setPlayerCommand(1).setExtras(bundle2).setDisplayName(this.context.getString(androidx.media3.session.R.string.media3_controls_play_description)).build());
            }
        }
        if (commands.containsAny(9, 8)) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt(COMMAND_KEY_COMPACT_VIEW_INDEX, -1);
            builder.add(new androidx.media3.session.CommandButton.Builder(androidx.media3.session.CommandButton.ICON_NEXT).setPlayerCommand(8).setExtras(bundle3).setDisplayName(this.context.getString(androidx.media3.session.R.string.media3_controls_seek_to_next_description)).build());
        }
        for (int i = 0; i < immutableList.size(); i++) {
            androidx.media3.session.CommandButton commandButton = immutableList.get(i);
            if (commandButton.sessionCommand != null && commandButton.sessionCommand.commandCode == 0) {
                builder.add(commandButton);
            }
        }
        return builder.build();
    }

    protected int[] addNotificationActions(androidx.media3.session.MediaSession mediaSession, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.core.app.NotificationCompat.Builder builder, androidx.media3.session.MediaNotification.ActionFactory actionFactory) {
        int[] iArr = new int[3];
        int[] iArr2 = new int[3];
        java.util.Arrays.fill(iArr, -1);
        java.util.Arrays.fill(iArr2, -1);
        int i = 0;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            androidx.media3.session.CommandButton commandButton = immutableList.get(i2);
            if (commandButton.sessionCommand != null) {
                builder.addAction(actionFactory.createCustomActionFromCustomCommandButton(mediaSession, commandButton));
            } else {
                androidx.media3.common.util.Assertions.checkState(commandButton.playerCommand != -1);
                builder.addAction(actionFactory.createMediaAction(mediaSession, androidx.core.graphics.drawable.IconCompat.createWithResource(this.context, commandButton.iconResId), commandButton.displayName, commandButton.playerCommand));
            }
            if (i != 3) {
                int i3 = commandButton.extras.getInt(COMMAND_KEY_COMPACT_VIEW_INDEX, -1);
                if (i3 >= 0 && i3 < 3) {
                    i++;
                    iArr[i3] = i2;
                } else if (commandButton.playerCommand == 7 || commandButton.playerCommand == 6) {
                    iArr2[0] = i2;
                } else if (commandButton.playerCommand == 1) {
                    iArr2[1] = i2;
                } else if (commandButton.playerCommand == 9 || commandButton.playerCommand == 8) {
                    iArr2[2] = i2;
                }
            }
        }
        if (i == 0) {
            int i4 = 0;
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                if (i6 != -1) {
                    iArr[i4] = i6;
                    i4++;
                }
            }
        }
        for (int i7 = 0; i7 < 3; i7++) {
            if (iArr[i7] == -1) {
                return java.util.Arrays.copyOf(iArr, i7);
            }
        }
        return iArr;
    }

    protected java.lang.CharSequence getNotificationContentTitle(androidx.media3.common.MediaMetadata mediaMetadata) {
        return mediaMetadata.title;
    }

    protected java.lang.CharSequence getNotificationContentText(androidx.media3.common.MediaMetadata mediaMetadata) {
        return mediaMetadata.artist;
    }

    private void ensureNotificationChannel() {
        if (androidx.media3.common.util.Util.SDK_INT < 26 || this.notificationManager.getNotificationChannel(this.channelId) != null) {
            return;
        }
        androidx.media3.session.DefaultMediaNotificationProvider.Api26.createNotificationChannel(this.notificationManager, this.channelId, this.context.getString(this.channelNameResourceId));
    }

    private static long getPlaybackStartTimeEpochMs(androidx.media3.common.Player player) {
        return (androidx.media3.common.util.Util.SDK_INT < 21 || !player.isPlaying() || player.isPlayingAd() || player.isCurrentMediaItemDynamic() || player.getPlaybackParameters().speed != 1.0f) ? androidx.media3.common.C.TIME_UNSET : java.lang.System.currentTimeMillis() - player.getContentPosition();
    }

    private static class OnBitmapLoadedFutureCallback implements com.google.common.util.concurrent.FutureCallback<android.graphics.Bitmap> {
        private final androidx.core.app.NotificationCompat.Builder builder;
        private boolean discarded;
        private final int notificationId;
        private final androidx.media3.session.MediaNotification.Provider.Callback onNotificationChangedCallback;

        public OnBitmapLoadedFutureCallback(int i, androidx.core.app.NotificationCompat.Builder builder, androidx.media3.session.MediaNotification.Provider.Callback callback) {
            this.notificationId = i;
            this.builder = builder;
            this.onNotificationChangedCallback = callback;
        }

        public void discardIfPending() {
            this.discarded = true;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onSuccess(android.graphics.Bitmap bitmap) {
            if (this.discarded) {
                return;
            }
            this.builder.setLargeIcon(bitmap);
            this.onNotificationChangedCallback.onNotificationChanged(new androidx.media3.session.MediaNotification(this.notificationId, this.builder.build()));
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(java.lang.Throwable th) {
            if (this.discarded) {
                return;
            }
            androidx.media3.common.util.Log.w(androidx.media3.session.DefaultMediaNotificationProvider.TAG, androidx.media3.session.DefaultMediaNotificationProvider.getBitmapLoadErrorMessage(th));
        }
    }

    private static class Api26 {
        private Api26() {
        }

        public static void createNotificationChannel(android.app.NotificationManager notificationManager, java.lang.String str, java.lang.String str2) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(str, str2, 2);
            if (androidx.media3.common.util.Util.SDK_INT <= 27) {
                notificationChannel.setShowBadge(false);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private static class Api31 {
        private Api31() {
        }

        public static void setForegroundServiceBehavior(androidx.core.app.NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getBitmapLoadErrorMessage(java.lang.Throwable th) {
        return "Failed to load bitmap: " + th.getMessage();
    }
}
