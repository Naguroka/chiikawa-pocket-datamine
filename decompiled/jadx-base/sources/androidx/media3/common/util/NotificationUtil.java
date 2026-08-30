package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    public static void createNotificationChannel(android.content.Context context, java.lang.String str, int i, int i2, int i3) {
        if (androidx.media3.common.util.Util.SDK_INT >= 26) {
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) androidx.media3.common.util.Assertions.checkNotNull((android.app.NotificationManager) context.getSystemService("notification"));
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(str, context.getString(i), i3);
            if (i2 != 0) {
                notificationChannel.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void setNotification(android.content.Context context, int i, android.app.Notification notification) {
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) androidx.media3.common.util.Assertions.checkNotNull((android.app.NotificationManager) context.getSystemService("notification"));
        if (notification != null) {
            notificationManager.notify(i, notification);
        } else {
            notificationManager.cancel(i);
        }
    }

    private NotificationUtil() {
    }
}
