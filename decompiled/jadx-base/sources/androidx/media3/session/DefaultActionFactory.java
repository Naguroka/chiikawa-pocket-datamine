package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class DefaultActionFactory implements androidx.media3.session.MediaNotification.ActionFactory {
    private static final java.lang.String ACTION_CUSTOM = "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION";
    private static final java.lang.String EXTRAS_KEY_ACTION_CUSTOM = "androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION";
    public static final java.lang.String EXTRAS_KEY_ACTION_CUSTOM_EXTRAS = "androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS";
    private int customActionPendingIntentRequestCode = 0;
    private final android.app.Service service;

    private int toKeyCode(long j) {
        if (j == 8 || j == 9) {
            return 87;
        }
        if (j == 6 || j == 7) {
            return 88;
        }
        if (j == 3) {
            return 86;
        }
        if (j == 12) {
            return 90;
        }
        if (j == 11) {
            return 89;
        }
        return j == 1 ? 85 : 0;
    }

    public static android.view.KeyEvent getKeyEvent(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        return (android.view.KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
    }

    public DefaultActionFactory(android.app.Service service) {
        this.service = service;
    }

    @Override // androidx.media3.session.MediaNotification.ActionFactory
    public androidx.core.app.NotificationCompat.Action createMediaAction(androidx.media3.session.MediaSession mediaSession, androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, int i) {
        return new androidx.core.app.NotificationCompat.Action(iconCompat, charSequence, createMediaActionPendingIntent(mediaSession, i));
    }

    @Override // androidx.media3.session.MediaNotification.ActionFactory
    public androidx.core.app.NotificationCompat.Action createCustomAction(androidx.media3.session.MediaSession mediaSession, androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, java.lang.String str, android.os.Bundle bundle) {
        return new androidx.core.app.NotificationCompat.Action(iconCompat, charSequence, createCustomActionPendingIntent(mediaSession, str, bundle));
    }

    @Override // androidx.media3.session.MediaNotification.ActionFactory
    public androidx.core.app.NotificationCompat.Action createCustomActionFromCustomCommandButton(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.CommandButton commandButton) {
        androidx.media3.common.util.Assertions.checkArgument(commandButton.sessionCommand != null && commandButton.sessionCommand.commandCode == 0);
        androidx.media3.session.SessionCommand sessionCommand = (androidx.media3.session.SessionCommand) androidx.media3.common.util.Assertions.checkNotNull(commandButton.sessionCommand);
        return new androidx.core.app.NotificationCompat.Action(androidx.core.graphics.drawable.IconCompat.createWithResource(this.service, commandButton.iconResId), commandButton.displayName, createCustomActionPendingIntent(mediaSession, sessionCommand.customAction, sessionCommand.customExtras));
    }

    @Override // androidx.media3.session.MediaNotification.ActionFactory
    public android.app.PendingIntent createMediaActionPendingIntent(androidx.media3.session.MediaSession mediaSession, long j) {
        int keyCode = toKeyCode(j);
        android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(mediaSession.getImpl().getUri());
        android.app.Service service = this.service;
        intent.setComponent(new android.content.ComponentName(service, service.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new android.view.KeyEvent(0, keyCode));
        if (androidx.media3.common.util.Util.SDK_INT >= 26 && j == 1 && !mediaSession.getPlayer().getPlayWhenReady()) {
            return androidx.media3.session.DefaultActionFactory.Api26.createForegroundServicePendingIntent(this.service, keyCode, intent);
        }
        return android.app.PendingIntent.getService(this.service, keyCode, intent, androidx.media3.common.util.Util.SDK_INT >= 23 ? 67108864 : 0);
    }

    private android.app.PendingIntent createCustomActionPendingIntent(androidx.media3.session.MediaSession mediaSession, java.lang.String str, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent(ACTION_CUSTOM);
        intent.setData(mediaSession.getImpl().getUri());
        android.app.Service service = this.service;
        intent.setComponent(new android.content.ComponentName(service, service.getClass()));
        intent.putExtra(EXTRAS_KEY_ACTION_CUSTOM, str);
        intent.putExtra(EXTRAS_KEY_ACTION_CUSTOM_EXTRAS, bundle);
        android.app.Service service2 = this.service;
        int i = this.customActionPendingIntentRequestCode + 1;
        this.customActionPendingIntentRequestCode = i;
        return android.app.PendingIntent.getService(service2, i, intent, (androidx.media3.common.util.Util.SDK_INT >= 23 ? 67108864 : 0) | androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    public boolean isMediaAction(android.content.Intent intent) {
        return "android.intent.action.MEDIA_BUTTON".equals(intent.getAction());
    }

    public boolean isCustomAction(android.content.Intent intent) {
        return ACTION_CUSTOM.equals(intent.getAction());
    }

    public java.lang.String getCustomAction(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        java.lang.Object obj = extras != null ? extras.get(EXTRAS_KEY_ACTION_CUSTOM) : null;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public android.os.Bundle getCustomActionExtras(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        java.lang.Object obj = extras != null ? extras.get(EXTRAS_KEY_ACTION_CUSTOM_EXTRAS) : null;
        return obj instanceof android.os.Bundle ? (android.os.Bundle) obj : android.os.Bundle.EMPTY;
    }

    private static final class Api26 {
        private Api26() {
        }

        public static android.app.PendingIntent createForegroundServicePendingIntent(android.app.Service service, int i, android.content.Intent intent) {
            return android.app.PendingIntent.getForegroundService(service, i, intent, 67108864);
        }
    }
}
