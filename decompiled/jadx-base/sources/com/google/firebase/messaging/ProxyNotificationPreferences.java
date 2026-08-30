package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
final class ProxyNotificationPreferences {
    private static final java.lang.String FCM_PREFERENCES = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    private static android.content.SharedPreferences getPreference(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static void setProxyNotificationsInitialized(android.content.Context context, boolean z) {
        android.content.SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z);
        editorEdit.apply();
    }

    static void setProxyRetention(final android.content.Context context, com.google.firebase.messaging.GmsRpc gmsRpc, final boolean z) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastQ() && !isProxyNotificationRetentionSet(getPreference(context), z)) {
            gmsRpc.setRetainProxiedNotifications(z).addOnSuccessListener(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.firebase.messaging.ProxyNotificationPreferences$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    com.google.firebase.messaging.ProxyNotificationPreferences.setProxyRetentionPreferences(context, z);
                }
            });
        }
    }

    static boolean isProxyNotificationInitialized(android.content.Context context) {
        return getPreference(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean isProxyNotificationRetentionSet(android.content.SharedPreferences sharedPreferences, boolean z) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setProxyRetentionPreferences(android.content.Context context, boolean z) {
        android.content.SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_retention", z);
        editorEdit.apply();
    }
}
