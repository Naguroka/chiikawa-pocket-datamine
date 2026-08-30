package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public class NotificationApiHelperForM {
    static android.os.Parcelable[] getActiveNotifications(android.app.NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }

    private NotificationApiHelperForM() {
    }
}
