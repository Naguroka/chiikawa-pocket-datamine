package androidx.media.session;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "MediaButtonReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            android.util.Log.d(TAG, "Ignore unsupported intent: " + intent);
            return;
        }
        android.content.ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
        if (serviceComponentByAction != null) {
            intent.setComponent(serviceComponentByAction);
            try {
                androidx.core.content.ContextCompat.startForegroundService(context, intent);
                return;
            } catch (java.lang.IllegalStateException e) {
                if (android.os.Build.VERSION.SDK_INT >= 31 && androidx.media.session.MediaButtonReceiver.Api31.instanceOfForegroundServiceStartNotAllowedException(e)) {
                    onForegroundServiceStartNotAllowedException(intent, androidx.media.session.MediaButtonReceiver.Api31.castToForegroundServiceStartNotAllowedException(e));
                    return;
                }
                throw e;
            }
        }
        android.content.ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, "android.media.browse.MediaBrowserService");
        if (serviceComponentByAction2 != null) {
            android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            android.content.Context applicationContext = context.getApplicationContext();
            androidx.media.session.MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback = new androidx.media.session.MediaButtonReceiver.MediaButtonConnectionCallback(applicationContext, intent, pendingResultGoAsync);
            android.support.v4.media.MediaBrowserCompat mediaBrowserCompat = new android.support.v4.media.MediaBrowserCompat(applicationContext, serviceComponentByAction2, mediaButtonConnectionCallback, null);
            mediaButtonConnectionCallback.setMediaBrowser(mediaBrowserCompat);
            mediaBrowserCompat.connect();
            return;
        }
        throw new java.lang.IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }

    protected void onForegroundServiceStartNotAllowedException(android.content.Intent intent, android.app.ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        android.util.Log.e(TAG, "caught exception when trying to start a foreground service from the background: " + foregroundServiceStartNotAllowedException.getMessage());
    }

    private static class MediaButtonConnectionCallback extends android.support.v4.media.MediaBrowserCompat.ConnectionCallback {
        private final android.content.Context mContext;
        private final android.content.Intent mIntent;
        private android.support.v4.media.MediaBrowserCompat mMediaBrowser;
        private final android.content.BroadcastReceiver.PendingResult mPendingResult;

        MediaButtonConnectionCallback(android.content.Context context, android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult) {
            this.mContext = context;
            this.mIntent = intent;
            this.mPendingResult = pendingResult;
        }

        void setMediaBrowser(android.support.v4.media.MediaBrowserCompat mediaBrowserCompat) {
            this.mMediaBrowser = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            new android.support.v4.media.session.MediaControllerCompat(this.mContext, this.mMediaBrowser.getSessionToken()).dispatchMediaButtonEvent((android.view.KeyEvent) this.mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            finish();
        }

        private void finish() {
            this.mMediaBrowser.disconnect();
            this.mPendingResult.finish();
        }
    }

    public static android.view.KeyEvent handleIntent(android.support.v4.media.session.MediaSessionCompat mediaSessionCompat, android.content.Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        android.view.KeyEvent keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.getController().dispatchMediaButtonEvent(keyEvent);
        return keyEvent;
    }

    public static android.app.PendingIntent buildMediaButtonPendingIntent(android.content.Context context, long j) {
        android.content.ComponentName mediaButtonReceiverComponent = getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent == null) {
            android.util.Log.w(TAG, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
            return null;
        }
        return buildMediaButtonPendingIntent(context, mediaButtonReceiverComponent, j);
    }

    public static android.app.PendingIntent buildMediaButtonPendingIntent(android.content.Context context, android.content.ComponentName componentName, long j) {
        if (componentName == null) {
            android.util.Log.w(TAG, "The component name of media button receiver should be provided.");
            return null;
        }
        int keyCode = android.support.v4.media.session.PlaybackStateCompat.toKeyCode(j);
        if (keyCode == 0) {
            android.util.Log.w(TAG, "Cannot build a media button pending intent with the given action: " + j);
            return null;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new android.view.KeyEvent(0, keyCode));
        intent.addFlags(268435456);
        return android.app.PendingIntent.getBroadcast(context, keyCode, intent, android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
    }

    public static android.content.ComponentName getMediaButtonReceiverComponent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            android.content.pm.ResolveInfo resolveInfo = listQueryBroadcastReceivers.get(0);
            return new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        android.util.Log.w(TAG, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    private static android.content.ComponentName getServiceComponentByAction(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent(str);
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            return new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new java.lang.IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    private static final class Api31 {
        private Api31() {
        }

        public static boolean instanceOfForegroundServiceStartNotAllowedException(java.lang.IllegalStateException illegalStateException) {
            return illegalStateException instanceof android.app.ForegroundServiceStartNotAllowedException;
        }

        public static android.app.ForegroundServiceStartNotAllowedException castToForegroundServiceStartNotAllowedException(java.lang.IllegalStateException illegalStateException) {
            return (android.app.ForegroundServiceStartNotAllowedException) illegalStateException;
        }
    }
}
