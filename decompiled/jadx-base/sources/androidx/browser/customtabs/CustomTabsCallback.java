package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabsCallback {
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
    public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
    public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final java.lang.String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActivityLayoutState {
    }

    public void extraCallback(java.lang.String str, android.os.Bundle bundle) {
    }

    public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) {
        return null;
    }

    public void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) {
    }

    public void onActivityResized(int i, int i2, android.os.Bundle bundle) {
    }

    public void onMessageChannelReady(android.os.Bundle bundle) {
    }

    public void onMinimized(android.os.Bundle bundle) {
    }

    public void onNavigationEvent(int i, android.os.Bundle bundle) {
    }

    public void onPostMessage(java.lang.String str, android.os.Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) {
    }

    public void onUnminimized(android.os.Bundle bundle) {
    }

    public void onWarmupCompleted(android.os.Bundle bundle) {
    }
}
