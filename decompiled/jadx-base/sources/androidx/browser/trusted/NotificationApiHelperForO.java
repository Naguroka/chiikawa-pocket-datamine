package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
class NotificationApiHelperForO {
    static boolean isChannelEnabled(android.app.NotificationManager notificationManager, java.lang.String str) {
        android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }

    static android.app.Notification copyNotificationOntoChannel(android.content.Context context, android.app.NotificationManager notificationManager, android.app.Notification notification, java.lang.String str, java.lang.String str2) {
        notificationManager.createNotificationChannel(new android.app.NotificationChannel(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        android.app.Notification.Builder builderRecoverBuilder = android.app.Notification.Builder.recoverBuilder(context, notification);
        builderRecoverBuilder.setChannelId(str);
        return builderRecoverBuilder.build();
    }

    private NotificationApiHelperForO() {
    }
}
