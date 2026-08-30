package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerNotificationManager {
    private static final java.lang.String ACTION_DISMISS = "androidx.media3.ui.notification.dismiss";
    public static final java.lang.String ACTION_FAST_FORWARD = "androidx.media3.ui.notification.ffwd";
    public static final java.lang.String ACTION_NEXT = "androidx.media3.ui.notification.next";
    public static final java.lang.String ACTION_PAUSE = "androidx.media3.ui.notification.pause";
    public static final java.lang.String ACTION_PLAY = "androidx.media3.ui.notification.play";
    public static final java.lang.String ACTION_PREVIOUS = "androidx.media3.ui.notification.prev";
    public static final java.lang.String ACTION_REWIND = "androidx.media3.ui.notification.rewind";
    public static final java.lang.String ACTION_STOP = "androidx.media3.ui.notification.stop";
    public static final java.lang.String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 1;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 2;
    private static int instanceIdCounter;
    private int badgeIconType;
    private androidx.core.app.NotificationCompat.Builder builder;
    private java.util.List<androidx.core.app.NotificationCompat.Action> builderActions;
    private final java.lang.String channelId;
    private int color;
    private boolean colorized;
    private final android.content.Context context;
    private int currentNotificationTag;
    private final androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver;
    private final java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> customActions;
    private int defaults;
    private final android.app.PendingIntent dismissPendingIntent;
    private java.lang.String groupKey;
    private final int instanceId;
    private final android.content.IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final android.os.Handler mainHandler;
    private final androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter;
    private android.media.session.MediaSession.Token mediaSessionToken;
    private final androidx.media3.ui.PlayerNotificationManager.NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private final androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener;
    private final androidx.core.app.NotificationManagerCompat notificationManager;
    private final java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> playbackActions;
    private androidx.media3.common.Player player;
    private final androidx.media3.common.Player.Listener playerListener;
    private int priority;
    private boolean showPlayButtonIfSuppressed;
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    public interface CustomActionReceiver {
        java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> createCustomActions(android.content.Context context, int i);

        java.util.List<java.lang.String> getCustomActions(androidx.media3.common.Player player);

        void onCustomAction(androidx.media3.common.Player player, java.lang.String str, android.content.Intent intent);
    }

    public interface MediaDescriptionAdapter {
        android.app.PendingIntent createCurrentContentIntent(androidx.media3.common.Player player);

        java.lang.CharSequence getCurrentContentText(androidx.media3.common.Player player);

        java.lang.CharSequence getCurrentContentTitle(androidx.media3.common.Player player);

        android.graphics.Bitmap getCurrentLargeIcon(androidx.media3.common.Player player, androidx.media3.ui.PlayerNotificationManager.BitmapCallback bitmapCallback);

        default java.lang.CharSequence getCurrentSubText(androidx.media3.common.Player player) {
            return null;
        }
    }

    public interface NotificationListener {
        default void onNotificationCancelled(int i, boolean z) {
        }

        default void onNotificationPosted(int i, android.app.Notification notification, boolean z) {
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final java.lang.String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final android.content.Context context;
        protected androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;
        protected java.lang.String groupKey;
        protected androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;
        protected androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        @java.lang.Deprecated
        public Builder(android.content.Context context, int i, java.lang.String str, androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }

        public Builder(android.content.Context context, int i, java.lang.String str) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0);
            this.context = context;
            this.notificationId = i;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new androidx.media3.ui.DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = androidx.media3.ui.R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_next;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setChannelNameResourceId(int i) {
            this.channelNameResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setChannelDescriptionResourceId(int i) {
            this.channelDescriptionResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setChannelImportance(int i) {
            this.channelImportance = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setNotificationListener(androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setCustomActionReceiver(androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setSmallIconResourceId(int i) {
            this.smallIconResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setPlayActionIconResourceId(int i) {
            this.playActionIconResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setPauseActionIconResourceId(int i) {
            this.pauseActionIconResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setStopActionIconResourceId(int i) {
            this.stopActionIconResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setRewindActionIconResourceId(int i) {
            this.rewindActionIconResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setFastForwardActionIconResourceId(int i) {
            this.fastForwardActionIconResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setPreviousActionIconResourceId(int i) {
            this.previousActionIconResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setNextActionIconResourceId(int i) {
            this.nextActionIconResourceId = i;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setGroup(java.lang.String str) {
            this.groupKey = str;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setMediaDescriptionAdapter(androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager build() {
            int i = this.channelNameResourceId;
            if (i != 0) {
                androidx.media3.common.util.NotificationUtil.createNotificationChannel(this.context, this.channelId, i, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new androidx.media3.ui.PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }
    }

    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i) {
            this.notificationTag = i;
        }

        public void onBitmap(android.graphics.Bitmap bitmap) {
            if (bitmap != null) {
                androidx.media3.ui.PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }
    }

    protected PlayerNotificationManager(android.content.Context context, java.lang.String str, int i, androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter, androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener, androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, java.lang.String str2) {
        java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> mapEmptyMap;
        android.content.Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i2;
        this.groupKey = str2;
        int i10 = instanceIdCounter;
        instanceIdCounter = i10 + 1;
        this.instanceId = i10;
        this.mainHandler = androidx.media3.common.util.Util.createHandler(android.os.Looper.getMainLooper(), new android.os.Handler.Callback() { // from class: androidx.media3.ui.PlayerNotificationManager$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.f$0.handleMessage(message);
            }
        });
        this.notificationManager = androidx.core.app.NotificationManagerCompat.from(applicationContext);
        this.playerListener = new androidx.media3.ui.PlayerNotificationManager.PlayerListener();
        this.notificationBroadcastReceiver = new androidx.media3.ui.PlayerNotificationManager.NotificationBroadcastReceiver();
        this.intentFilter = new android.content.IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.showPlayButtonIfSuppressed = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i10, i3, i4, i5, i6, i7, i8, i9);
        this.playbackActions = mapCreatePlaybackActions;
        java.util.Iterator<java.lang.String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        if (customActionReceiver != null) {
            mapEmptyMap = customActionReceiver.createCustomActions(applicationContext, this.instanceId);
        } else {
            mapEmptyMap = java.util.Collections.emptyMap();
        }
        this.customActions = mapEmptyMap;
        java.util.Iterator<java.lang.String> it2 = mapEmptyMap.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    public final void setPlayer(androidx.media3.common.Player player) {
        boolean z = true;
        androidx.media3.common.util.Assertions.checkState(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != android.os.Looper.getMainLooper()) {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkArgument(z);
        androidx.media3.common.Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification(false);
            }
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.playerListener);
            postStartOrUpdateNotification();
        }
    }

    public final void setUseNextAction(boolean z) {
        if (this.useNextAction != z) {
            this.useNextAction = z;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z) {
        if (this.usePreviousAction != z) {
            this.usePreviousAction = z;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z) {
        if (this.useNextActionInCompactView != z) {
            this.useNextActionInCompactView = z;
            if (z) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z) {
        if (this.usePreviousActionInCompactView != z) {
            this.usePreviousActionInCompactView = z;
            if (z) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z) {
        if (this.useFastForwardAction != z) {
            this.useFastForwardAction = z;
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z) {
        if (this.useRewindAction != z) {
            this.useRewindAction = z;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z) {
        if (this.useFastForwardActionInCompactView != z) {
            this.useFastForwardActionInCompactView = z;
            if (z) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z) {
        if (this.useRewindActionInCompactView != z) {
            this.useRewindActionInCompactView = z;
            if (z) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.usePlayPauseActions != z) {
            this.usePlayPauseActions = z;
            invalidate();
        }
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        if (this.showPlayButtonIfSuppressed != z) {
            this.showPlayButtonIfSuppressed = z;
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z) {
        if (this.useStopAction == z) {
            return;
        }
        this.useStopAction = z;
        invalidate();
    }

    @java.lang.Deprecated
    public final void setMediaSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            setMediaSessionToken((android.media.session.MediaSession.Token) token.getToken());
        }
    }

    public final void setMediaSessionToken(android.media.session.MediaSession.Token token) {
        if (androidx.media3.common.util.Util.areEqual(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setBadgeIconType(int i) {
        if (this.badgeIconType == i) {
            return;
        }
        if (i == 0 || i == 1 || i == 2) {
            this.badgeIconType = i;
            invalidate();
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void setColorized(boolean z) {
        if (this.colorized != z) {
            this.colorized = z;
            invalidate();
        }
    }

    public final void setDefaults(int i) {
        if (this.defaults != i) {
            this.defaults = i;
            invalidate();
        }
    }

    public final void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            invalidate();
        }
    }

    public final void setPriority(int i) {
        if (this.priority == i) {
            return;
        }
        if (i == -2 || i == -1 || i == 0 || i == 1 || i == 2) {
            this.priority = i;
            invalidate();
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void setSmallIcon(int i) {
        if (this.smallIconResourceId != i) {
            this.smallIconResourceId = i;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.useChronometer != z) {
            this.useChronometer = z;
            invalidate();
        }
    }

    public final void setVisibility(int i) {
        if (this.visibility == i) {
            return;
        }
        if (i == -1 || i == 0 || i == 1) {
            this.visibility = i;
            invalidate();
            return;
        }
        throw new java.lang.IllegalStateException();
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    private void startOrUpdateNotification(androidx.media3.common.Player player, android.graphics.Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        androidx.core.app.NotificationCompat.Builder builderCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = builderCreateNotification;
        if (builderCreateNotification == null) {
            stopNotification(false);
            return;
        }
        android.app.Notification notificationBuild = builderCreateNotification.build();
        this.notificationManager.notify(this.notificationId, notificationBuild);
        if (!this.isNotificationStarted) {
            androidx.media3.common.util.Util.registerReceiverNotExported(this.context, this.notificationBroadcastReceiver, this.intentFilter);
        }
        androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            notificationListener.onNotificationPosted(this.notificationId, notificationBuild, ongoing || !this.isNotificationStarted);
        }
        this.isNotificationStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(1);
            this.notificationManager.cancel(this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z);
            }
        }
    }

    protected androidx.core.app.NotificationCompat.Builder createNotification(androidx.media3.common.Player player, androidx.core.app.NotificationCompat.Builder builder, boolean z, android.graphics.Bitmap bitmap) {
        androidx.core.app.NotificationCompat.Action action;
        if (player.getPlaybackState() == 1 && player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        java.util.List<java.lang.String> actions = getActions(player);
        java.util.ArrayList arrayList = new java.util.ArrayList(actions.size());
        for (int i = 0; i < actions.size(); i++) {
            java.lang.String str = actions.get(i);
            if (this.playbackActions.containsKey(str)) {
                action = this.playbackActions.get(str);
            } else {
                action = this.customActions.get(str);
            }
            if (action != null) {
                arrayList.add(action);
            }
        }
        if (builder == null || !arrayList.equals(this.builderActions)) {
            builder = new androidx.core.app.NotificationCompat.Builder(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                builder.addAction((androidx.core.app.NotificationCompat.Action) arrayList.get(i2));
            }
        }
        int[] actionIndicesForCompactView = getActionIndicesForCompactView(actions, player);
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            builder.setStyle(new androidx.media3.ui.PlayerNotificationManager.MediaStyle(this.mediaSessionToken, actionIndicesForCompactView));
        } else {
            androidx.media.app.NotificationCompat.MediaStyle mediaStyle = new androidx.media.app.NotificationCompat.MediaStyle();
            mediaStyle.setShowActionsInCompactView(actionIndicesForCompactView);
            mediaStyle.setShowCancelButton(!z);
            mediaStyle.setCancelButtonIntent(this.dismissPendingIntent);
            builder.setStyle(mediaStyle);
        }
        builder.setDeleteIntent(this.dismissPendingIntent);
        builder.setBadgeIconType(this.badgeIconType).setOngoing(z).setColor(this.color).setColorized(this.colorized).setSmallIcon(this.smallIconResourceId).setVisibility(this.visibility).setPriority(this.priority).setDefaults(this.defaults);
        if (androidx.media3.common.util.Util.SDK_INT >= 21 && this.useChronometer && player.isCommandAvailable(16) && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentMediaItemDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            builder.setWhen(java.lang.System.currentTimeMillis() - player.getContentPosition()).setShowWhen(true).setUsesChronometer(true);
        } else {
            builder.setShowWhen(false).setUsesChronometer(false);
        }
        builder.setContentTitle(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        builder.setContentText(this.mediaDescriptionAdapter.getCurrentContentText(player));
        builder.setSubText(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i3 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i3;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new androidx.media3.ui.PlayerNotificationManager.BitmapCallback(i3));
        }
        setLargeIcon(builder, bitmap);
        builder.setContentIntent(this.mediaDescriptionAdapter.createCurrentContentIntent(player));
        java.lang.String str2 = this.groupKey;
        if (str2 != null) {
            builder.setGroup(str2);
        }
        builder.setOnlyAlertOnce(true);
        return builder;
    }

    protected java.util.List<java.lang.String> getActions(androidx.media3.common.Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(7);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean zIsCommandAvailable4 = player.isCommandAvailable(9);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.usePreviousAction && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && zIsCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (androidx.media3.common.util.Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed)) {
                arrayList.add(ACTION_PLAY);
            } else {
                arrayList.add(ACTION_PAUSE);
            }
        }
        if (this.useFastForwardAction && zIsCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && zIsCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    protected int[] getActionIndicesForCompactView(java.util.List<java.lang.String> list, androidx.media3.common.Player player) {
        int iIndexOf;
        int iIndexOf2;
        int i;
        int iIndexOf3 = list.indexOf(ACTION_PAUSE);
        int iIndexOf4 = list.indexOf(ACTION_PLAY);
        if (this.usePreviousActionInCompactView) {
            iIndexOf = list.indexOf(ACTION_PREVIOUS);
        } else {
            iIndexOf = this.useRewindActionInCompactView ? list.indexOf(ACTION_REWIND) : -1;
        }
        if (this.useNextActionInCompactView) {
            iIndexOf2 = list.indexOf(ACTION_NEXT);
        } else {
            iIndexOf2 = this.useFastForwardActionInCompactView ? list.indexOf(ACTION_FAST_FORWARD) : -1;
        }
        int[] iArr = new int[3];
        int i2 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i2 = 1;
        }
        boolean zShouldShowPlayButton = androidx.media3.common.util.Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed);
        if (iIndexOf3 != -1 && !zShouldShowPlayButton) {
            i = i2 + 1;
            iArr[i2] = iIndexOf3;
        } else {
            if (iIndexOf4 != -1 && zShouldShowPlayButton) {
                i = i2 + 1;
                iArr[i2] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i2] = iIndexOf2;
                i2++;
            }
            return java.util.Arrays.copyOf(iArr, i2);
        }
        i2 = i;
        if (iIndexOf2 != -1) {
            iArr[i2] = iIndexOf2;
            i2++;
        }
        return java.util.Arrays.copyOf(iArr, i2);
    }

    protected boolean getOngoing(androidx.media3.common.Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(1)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(android.graphics.Bitmap bitmap, int i) {
        this.mainHandler.obtainMessage(2, i, -1, bitmap).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            androidx.media3.common.Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i != 2) {
                return false;
            }
            if (this.player != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(this.player, (android.graphics.Bitmap) message.obj);
            }
        }
        return true;
    }

    private static java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> createPlaybackActions(android.content.Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(ACTION_PLAY, new androidx.core.app.NotificationCompat.Action(i2, context.getString(androidx.media3.ui.R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i)));
        map.put(ACTION_PAUSE, new androidx.core.app.NotificationCompat.Action(i3, context.getString(androidx.media3.ui.R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i)));
        map.put(ACTION_STOP, new androidx.core.app.NotificationCompat.Action(i4, context.getString(androidx.media3.ui.R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i)));
        map.put(ACTION_REWIND, new androidx.core.app.NotificationCompat.Action(i5, context.getString(androidx.media3.ui.R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i)));
        map.put(ACTION_FAST_FORWARD, new androidx.core.app.NotificationCompat.Action(i6, context.getString(androidx.media3.ui.R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i)));
        map.put(ACTION_PREVIOUS, new androidx.core.app.NotificationCompat.Action(i7, context.getString(androidx.media3.ui.R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i)));
        map.put(ACTION_NEXT, new androidx.core.app.NotificationCompat.Action(i8, context.getString(androidx.media3.ui.R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i)));
        return map;
    }

    private static android.app.PendingIntent createBroadcastIntent(java.lang.String str, android.content.Context context, int i) {
        android.content.Intent intent = new android.content.Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i);
        return android.app.PendingIntent.getBroadcast(context, i, intent, androidx.media3.common.util.Util.SDK_INT >= 23 ? 201326592 : androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    private static void setLargeIcon(androidx.core.app.NotificationCompat.Builder builder, android.graphics.Bitmap bitmap) {
        builder.setLargeIcon(bitmap);
    }

    private class PlayerListener implements androidx.media3.common.Player.Listener {
        private PlayerListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                androidx.media3.ui.PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    private class NotificationBroadcastReceiver extends android.content.BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            androidx.media3.common.Player player = androidx.media3.ui.PlayerNotificationManager.this.player;
            if (player != null && androidx.media3.ui.PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(androidx.media3.ui.PlayerNotificationManager.EXTRA_INSTANCE_ID, androidx.media3.ui.PlayerNotificationManager.this.instanceId) == androidx.media3.ui.PlayerNotificationManager.this.instanceId) {
                java.lang.String action = intent.getAction();
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    androidx.media3.common.util.Util.handlePlayButtonAction(player);
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    androidx.media3.common.util.Util.handlePauseButtonAction(player);
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    if (player.isCommandAvailable(7)) {
                        player.seekToPrevious();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    if (player.isCommandAvailable(11)) {
                        player.seekBack();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    if (player.isCommandAvailable(12)) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    if (player.isCommandAvailable(9)) {
                        player.seekToNext();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    if (player.isCommandAvailable(3)) {
                        player.stop();
                    }
                    if (player.isCommandAvailable(20)) {
                        player.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    androidx.media3.ui.PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || androidx.media3.ui.PlayerNotificationManager.this.customActionReceiver == null || !androidx.media3.ui.PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    androidx.media3.ui.PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    private static final class MediaStyle extends androidx.core.app.NotificationCompat.Style {
        private final int[] actionsToShowInCompact;
        private final android.media.session.MediaSession.Token token;

        public MediaStyle(android.media.session.MediaSession.Token token, int[] iArr) {
            this.token = token;
            this.actionsToShowInCompact = iArr;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.MediaStyle mediaStyle = new android.app.Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.actionsToShowInCompact);
            android.media.session.MediaSession.Token token = this.token;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(mediaStyle);
        }
    }
}
