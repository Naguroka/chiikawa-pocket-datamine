package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BrowserActionItem {
    private final android.app.PendingIntent mAction;
    private int mIconId;
    private android.net.Uri mIconUri;
    private java.lang.Runnable mRunnableAction;
    private final java.lang.String mTitle;

    public BrowserActionItem(java.lang.String str, android.app.PendingIntent pendingIntent, int i) {
        this.mTitle = str;
        this.mAction = pendingIntent;
        this.mIconId = i;
    }

    public BrowserActionItem(java.lang.String str, android.app.PendingIntent pendingIntent, android.net.Uri uri) {
        this.mTitle = str;
        this.mAction = pendingIntent;
        this.mIconUri = uri;
    }

    BrowserActionItem(java.lang.String str, java.lang.Runnable runnable) {
        this.mTitle = str;
        this.mAction = null;
        this.mRunnableAction = runnable;
    }

    public BrowserActionItem(java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }

    public int getIconId() {
        return this.mIconId;
    }

    public java.lang.String getTitle() {
        return this.mTitle;
    }

    public android.app.PendingIntent getAction() {
        android.app.PendingIntent pendingIntent = this.mAction;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new java.lang.IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public android.net.Uri getIconUri() {
        return this.mIconUri;
    }

    java.lang.Runnable getRunnableAction() {
        return this.mRunnableAction;
    }
}
