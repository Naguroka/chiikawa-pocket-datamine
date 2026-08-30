package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
final class ProxyNotificationInitializer {
    private static final java.lang.String MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED = "firebase_messaging_notification_delegation_enabled";

    private ProxyNotificationInitializer() {
    }

    static com.google.android.gms.tasks.Task<java.lang.Void> setEnableProxyNotification(java.util.concurrent.Executor executor, final android.content.Context context, final boolean z) {
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        executor.execute(new java.lang.Runnable() { // from class: com.google.firebase.messaging.ProxyNotificationInitializer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.messaging.ProxyNotificationInitializer.lambda$setEnableProxyNotification$0(context, z, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$setEnableProxyNotification$0(android.content.Context context, boolean z, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            if (!allowedToUse(context)) {
                android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            com.google.firebase.messaging.ProxyNotificationPreferences.setProxyNotificationsInitialized(context, true);
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    static boolean isProxyNotificationEnabled(android.content.Context context) {
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()) {
            if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
                android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Platform doesn't support proxying.");
            }
            return false;
        }
        if (!allowedToUse(context)) {
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (!android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            return true;
        }
        android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "GMS core is set for proxying");
        return true;
    }

    private static boolean shouldEnableProxyNotification(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    static void initialize(android.content.Context context) {
        if (com.google.firebase.messaging.ProxyNotificationPreferences.isProxyNotificationInitialized(context)) {
            return;
        }
        setEnableProxyNotification(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), context, shouldEnableProxyNotification(context));
    }

    private static boolean allowedToUse(android.content.Context context) {
        return android.os.Binder.getCallingUid() == context.getApplicationInfo().uid;
    }
}
