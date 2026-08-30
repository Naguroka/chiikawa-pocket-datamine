package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedWebActivityServiceConnection {
    private static final java.lang.String KEY_ACTIVE_NOTIFICATIONS = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";
    private static final java.lang.String KEY_CHANNEL_NAME = "android.support.customtabs.trusted.CHANNEL_NAME";
    private static final java.lang.String KEY_NOTIFICATION = "android.support.customtabs.trusted.NOTIFICATION";
    private static final java.lang.String KEY_NOTIFICATION_SUCCESS = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";
    private static final java.lang.String KEY_PLATFORM_ID = "android.support.customtabs.trusted.PLATFORM_ID";
    private static final java.lang.String KEY_PLATFORM_TAG = "android.support.customtabs.trusted.PLATFORM_TAG";
    private final android.content.ComponentName mComponentName;
    private final android.support.customtabs.trusted.ITrustedWebActivityService mService;

    TrustedWebActivityServiceConnection(android.support.customtabs.trusted.ITrustedWebActivityService iTrustedWebActivityService, android.content.ComponentName componentName) {
        this.mService = iTrustedWebActivityService;
        this.mComponentName = componentName;
    }

    public boolean areNotificationsEnabled(java.lang.String str) throws android.os.RemoteException {
        return androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs.fromBundle(this.mService.areNotificationsEnabled(new androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs(str).toBundle())).success;
    }

    public boolean notify(java.lang.String str, int i, android.app.Notification notification, java.lang.String str2) throws android.os.RemoteException {
        return androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs.fromBundle(this.mService.notifyNotificationWithChannel(new androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs(str, i, notification, str2).toBundle())).success;
    }

    public void cancel(java.lang.String str, int i) throws android.os.RemoteException {
        this.mService.cancelNotification(new androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs(str, i).toBundle());
    }

    public android.os.Parcelable[] getActiveNotifications() throws android.os.RemoteException {
        return androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs.fromBundle(this.mService.getActiveNotifications()).notifications;
    }

    public int getSmallIconId() throws android.os.RemoteException {
        return this.mService.getSmallIconId();
    }

    public android.graphics.Bitmap getSmallIconBitmap() throws android.os.RemoteException {
        return (android.graphics.Bitmap) this.mService.getSmallIconBitmap().getParcelable(androidx.browser.trusted.TrustedWebActivityService.KEY_SMALL_ICON_BITMAP);
    }

    public android.content.ComponentName getComponentName() {
        return this.mComponentName;
    }

    public android.os.Bundle sendExtraCommand(java.lang.String str, android.os.Bundle bundle, androidx.browser.trusted.TrustedWebActivityCallback trustedWebActivityCallback) throws android.os.RemoteException {
        android.support.customtabs.trusted.ITrustedWebActivityCallback iTrustedWebActivityCallbackWrapCallback = wrapCallback(trustedWebActivityCallback);
        return this.mService.extraCommand(str, bundle, iTrustedWebActivityCallbackWrapCallback == null ? null : iTrustedWebActivityCallbackWrapCallback.asBinder());
    }

    static class NotifyNotificationArgs {
        public final java.lang.String channelName;
        public final android.app.Notification notification;
        public final int platformId;
        public final java.lang.String platformTag;

        NotifyNotificationArgs(java.lang.String str, int i, android.app.Notification notification, java.lang.String str2) {
            this.platformTag = str;
            this.platformId = i;
            this.notification = notification;
            this.channelName = str2;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs fromBundle(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(bundle, androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG);
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(bundle, androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_ID);
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(bundle, androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_NOTIFICATION);
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(bundle, androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME);
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs(bundle.getString(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG), bundle.getInt(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_ID), (android.app.Notification) bundle.getParcelable(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_NOTIFICATION), bundle.getString(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME));
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG, this.platformTag);
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_ID, this.platformId);
            bundle.putParcelable(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_NOTIFICATION, this.notification);
            bundle.putString(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME, this.channelName);
            return bundle;
        }
    }

    static class CancelNotificationArgs {
        public final int platformId;
        public final java.lang.String platformTag;

        CancelNotificationArgs(java.lang.String str, int i) {
            this.platformTag = str;
            this.platformId = i;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs fromBundle(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(bundle, androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG);
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(bundle, androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_ID);
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs(bundle.getString(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG), bundle.getInt(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_ID));
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG, this.platformTag);
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_PLATFORM_ID, this.platformId);
            return bundle;
        }
    }

    static class ResultArgs {
        public final boolean success;

        ResultArgs(boolean z) {
            this.success = z;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs fromBundle(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(bundle, androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_NOTIFICATION_SUCCESS);
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs(bundle.getBoolean(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_NOTIFICATION_SUCCESS));
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_NOTIFICATION_SUCCESS, this.success);
            return bundle;
        }
    }

    static class ActiveNotificationsArgs {
        public final android.os.Parcelable[] notifications;

        ActiveNotificationsArgs(android.os.Parcelable[] parcelableArr) {
            this.notifications = parcelableArr;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs fromBundle(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(bundle, androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_ACTIVE_NOTIFICATIONS);
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs(bundle.getParcelableArray(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_ACTIVE_NOTIFICATIONS));
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArray(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_ACTIVE_NOTIFICATIONS, this.notifications);
            return bundle;
        }
    }

    static class NotificationsEnabledArgs {
        public final java.lang.String channelName;

        NotificationsEnabledArgs(java.lang.String str) {
            this.channelName = str;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs fromBundle(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(bundle, androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME);
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs(bundle.getString(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME));
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.browser.trusted.TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME, this.channelName);
            return bundle;
        }
    }

    static void ensureBundleContains(android.os.Bundle bundle, java.lang.String str) {
        if (!bundle.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("Bundle must contain " + str);
        }
    }

    private static android.support.customtabs.trusted.ITrustedWebActivityCallback wrapCallback(final androidx.browser.trusted.TrustedWebActivityCallback trustedWebActivityCallback) {
        if (trustedWebActivityCallback == null) {
            return null;
        }
        return new android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub() { // from class: androidx.browser.trusted.TrustedWebActivityServiceConnection.1
            @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
            public void onExtraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                trustedWebActivityCallback.onExtraCallback(str, bundle);
            }
        };
    }
}
