package com.unity.androidnotifications;

/* JADX INFO: loaded from: classes3.dex */
public class UnityNotificationRestartReceiver extends android.content.BroadcastReceiver {
    private static final long EXPIRATION_TRESHOLD = 600000;

    @Override // android.content.BroadcastReceiver
    public void onReceive(final android.content.Context context, android.content.Intent intent) {
        android.util.Log.d("UnityNotifications", "Rescheduling notifications after restart");
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            android.os.AsyncTask.execute(new java.lang.Runnable() { // from class: com.unity.androidnotifications.UnityNotificationRestartReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.unity.androidnotifications.UnityNotificationRestartReceiver.rescheduleSavedNotifications(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rescheduleSavedNotifications(android.content.Context context) {
        com.unity.androidnotifications.UnityNotificationManager notificationManagerImpl = com.unity.androidnotifications.UnityNotificationManager.getNotificationManagerImpl(context);
        java.util.List<android.app.Notification.Builder> listLoadSavedNotifications = notificationManagerImpl.loadSavedNotifications();
        java.util.Date time = java.util.Calendar.getInstance().getTime();
        java.util.Iterator<android.app.Notification.Builder> it = listLoadSavedNotifications.iterator();
        while (it.hasNext()) {
            rescheduleNotification(notificationManagerImpl, time, it.next());
        }
    }

    private static boolean rescheduleNotification(com.unity.androidnotifications.UnityNotificationManager unityNotificationManager, java.util.Date date, android.app.Notification.Builder builder) {
        try {
            android.os.Bundle extras = builder.getExtras();
            long j = extras.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_REPEAT_INTERVAL, 0L);
            long j2 = extras.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, 0L);
            java.util.Date date2 = new java.util.Date(j2);
            boolean z = j > 0;
            if (!date2.after(date) && !z) {
                if (date.getTime() - j2 < 600000) {
                    unityNotificationManager.notify(extras.getInt("id"), builder);
                    return true;
                }
                android.util.Log.d("UnityNotifications", "Notification expired, not rescheduling, ID: " + extras.getInt("id", -1));
                return false;
            }
            unityNotificationManager.scheduleAlarmWithNotification(builder);
            return true;
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityNotifications", "Failed to reschedule notification", e);
            return false;
        }
    }
}
