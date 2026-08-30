package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String[] ACTIONS = {"android.intent.action.MEDIA_BUTTON", androidx.media3.session.MediaLibraryService.SERVICE_INTERFACE, androidx.media3.session.MediaSessionService.SERVICE_INTERFACE};
    private static final java.lang.String TAG = "MediaButtonReceiver";

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.view.KeyEvent keyEvent;
        if (intent == null || !java.util.Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            android.util.Log.d(TAG, "Ignore unsupported intent: " + intent);
            return;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 26 && (keyEvent = (android.view.KeyEvent) ((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(intent.getExtras())).getParcelable("android.intent.extra.KEY_EVENT")) != null && keyEvent.getKeyCode() != 126 && keyEvent.getKeyCode() != 85) {
            android.util.Log.w(TAG, "Ignore key event that is not a `play` command on API 26 or above to avoid an 'ForegroundServiceDidNotStartInTimeException'");
            return;
        }
        for (java.lang.String str : ACTIONS) {
            android.content.ComponentName serviceComponentByAction = getServiceComponentByAction(context, str);
            if (serviceComponentByAction != null) {
                intent.setComponent(serviceComponentByAction);
                try {
                    androidx.core.content.ContextCompat.startForegroundService(context, intent);
                    return;
                } catch (java.lang.IllegalStateException e) {
                    if (android.os.Build.VERSION.SDK_INT >= 31 && androidx.media3.session.MediaButtonReceiver.Api31.instanceOfForegroundServiceStartNotAllowedException(e)) {
                        onForegroundServiceStartNotAllowedException(intent, androidx.media3.session.MediaButtonReceiver.Api31.castToForegroundServiceStartNotAllowedException(e));
                        return;
                    }
                    throw e;
                }
            }
        }
        throw new java.lang.IllegalStateException("Could not find any Service that handles any of the actions " + java.util.Arrays.toString(ACTIONS));
    }

    protected void onForegroundServiceStartNotAllowedException(android.content.Intent intent, android.app.ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        androidx.media3.common.util.Log.e(TAG, "caught exception when trying to start a foreground service from the background: " + foregroundServiceStartNotAllowedException.getMessage());
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
