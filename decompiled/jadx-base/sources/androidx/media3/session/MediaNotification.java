package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class MediaNotification {
    public final android.app.Notification notification;
    public final int notificationId;

    public interface ActionFactory {
        androidx.core.app.NotificationCompat.Action createCustomAction(androidx.media3.session.MediaSession mediaSession, androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, java.lang.String str, android.os.Bundle bundle);

        androidx.core.app.NotificationCompat.Action createCustomActionFromCustomCommandButton(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.CommandButton commandButton);

        androidx.core.app.NotificationCompat.Action createMediaAction(androidx.media3.session.MediaSession mediaSession, androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, int i);

        android.app.PendingIntent createMediaActionPendingIntent(androidx.media3.session.MediaSession mediaSession, long j);
    }

    public interface Provider {

        public interface Callback {
            void onNotificationChanged(androidx.media3.session.MediaNotification mediaNotification);
        }

        androidx.media3.session.MediaNotification createNotification(androidx.media3.session.MediaSession mediaSession, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.MediaNotification.ActionFactory actionFactory, androidx.media3.session.MediaNotification.Provider.Callback callback);

        boolean handleCustomCommand(androidx.media3.session.MediaSession mediaSession, java.lang.String str, android.os.Bundle bundle);
    }

    public MediaNotification(int i, android.app.Notification notification) {
        this.notificationId = i;
        this.notification = (android.app.Notification) androidx.media3.common.util.Assertions.checkNotNull(notification);
    }
}
