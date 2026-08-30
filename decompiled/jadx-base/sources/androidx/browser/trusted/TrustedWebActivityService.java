package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedWebActivityService extends android.app.Service {
    public static final java.lang.String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final java.lang.String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final java.lang.String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
    public static final java.lang.String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
    public static final int SMALL_ICON_NOT_SET = -1;
    private android.app.NotificationManager mNotificationManager;
    int mVerifiedUid = -1;
    private final android.support.customtabs.trusted.ITrustedWebActivityService.Stub mBinder = new android.support.customtabs.trusted.ITrustedWebActivityService.Stub() { // from class: androidx.browser.trusted.TrustedWebActivityService.1
        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle areNotificationsEnabled(android.os.Bundle bundle) {
            checkCaller();
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs(androidx.browser.trusted.TrustedWebActivityService.this.onAreNotificationsEnabled(androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs.fromBundle(bundle).channelName)).toBundle();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle notifyNotificationWithChannel(android.os.Bundle bundle) {
            checkCaller();
            androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs notifyNotificationArgsFromBundle = androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs.fromBundle(bundle);
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs(androidx.browser.trusted.TrustedWebActivityService.this.onNotifyNotificationWithChannel(notifyNotificationArgsFromBundle.platformTag, notifyNotificationArgsFromBundle.platformId, notifyNotificationArgsFromBundle.notification, notifyNotificationArgsFromBundle.channelName)).toBundle();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(android.os.Bundle bundle) {
            checkCaller();
            androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs cancelNotificationArgsFromBundle = androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs.fromBundle(bundle);
            androidx.browser.trusted.TrustedWebActivityService.this.onCancelNotification(cancelNotificationArgsFromBundle.platformTag, cancelNotificationArgsFromBundle.platformId);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle getActiveNotifications() {
            checkCaller();
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs(androidx.browser.trusted.TrustedWebActivityService.this.onGetActiveNotifications()).toBundle();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() {
            checkCaller();
            return androidx.browser.trusted.TrustedWebActivityService.this.onGetSmallIconId();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle getSmallIconBitmap() {
            checkCaller();
            return androidx.browser.trusted.TrustedWebActivityService.this.onGetSmallIconBitmap();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle, android.os.IBinder iBinder) {
            checkCaller();
            return androidx.browser.trusted.TrustedWebActivityService.this.onExtraCommand(str, bundle, androidx.browser.trusted.TrustedWebActivityCallbackRemote.fromBinder(iBinder));
        }

        private void checkCaller() {
            if (androidx.browser.trusted.TrustedWebActivityService.this.mVerifiedUid == -1) {
                java.lang.String[] packagesForUid = androidx.browser.trusted.TrustedWebActivityService.this.getPackageManager().getPackagesForUid(getCallingUid());
                if (packagesForUid == null) {
                    packagesForUid = new java.lang.String[0];
                }
                androidx.browser.trusted.Token tokenLoad = androidx.browser.trusted.TrustedWebActivityService.this.getTokenStore().load();
                android.content.pm.PackageManager packageManager = androidx.browser.trusted.TrustedWebActivityService.this.getPackageManager();
                if (tokenLoad != null) {
                    for (java.lang.String str : packagesForUid) {
                        if (tokenLoad.matches(str, packageManager)) {
                            androidx.browser.trusted.TrustedWebActivityService.this.mVerifiedUid = getCallingUid();
                            break;
                        }
                    }
                }
            }
            if (androidx.browser.trusted.TrustedWebActivityService.this.mVerifiedUid != getCallingUid()) {
                throw new java.lang.SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }
    };

    public abstract androidx.browser.trusted.TokenStore getTokenStore();

    public android.os.Bundle onExtraCommand(java.lang.String str, android.os.Bundle bundle, androidx.browser.trusted.TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (android.app.NotificationManager) getSystemService("notification");
    }

    public boolean onAreNotificationsEnabled(java.lang.String str) {
        ensureOnCreateCalled();
        if (!androidx.core.app.NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return androidx.browser.trusted.NotificationApiHelperForO.isChannelEnabled(this.mNotificationManager, channelNameToId(str));
    }

    public boolean onNotifyNotificationWithChannel(java.lang.String str, int i, android.app.Notification notification, java.lang.String str2) {
        ensureOnCreateCalled();
        if (!androidx.core.app.NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.lang.String strChannelNameToId = channelNameToId(str2);
            notification = androidx.browser.trusted.NotificationApiHelperForO.copyNotificationOntoChannel(this, this.mNotificationManager, notification, strChannelNameToId, str2);
            if (!androidx.browser.trusted.NotificationApiHelperForO.isChannelEnabled(this.mNotificationManager, strChannelNameToId)) {
                return false;
            }
        }
        this.mNotificationManager.notify(str, i, notification);
        return true;
    }

    public void onCancelNotification(java.lang.String str, int i) {
        ensureOnCreateCalled();
        this.mNotificationManager.cancel(str, i);
    }

    public android.os.Parcelable[] onGetActiveNotifications() {
        ensureOnCreateCalled();
        return androidx.browser.trusted.NotificationApiHelperForM.getActiveNotifications(this.mNotificationManager);
    }

    public android.os.Bundle onGetSmallIconBitmap() {
        int iOnGetSmallIconId = onGetSmallIconId();
        android.os.Bundle bundle = new android.os.Bundle();
        if (iOnGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable(KEY_SMALL_ICON_BITMAP, android.graphics.BitmapFactory.decodeResource(getResources(), iOnGetSmallIconId));
        return bundle;
    }

    public int onGetSmallIconId() {
        try {
            android.content.pm.ServiceInfo serviceInfo = getPackageManager().getServiceInfo(new android.content.ComponentName(this, getClass()), 128);
            if (serviceInfo.metaData == null) {
                return -1;
            }
            return serviceInfo.metaData.getInt(META_DATA_NAME_SMALL_ICON, -1);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.mBinder;
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        this.mVerifiedUid = -1;
        return super.onUnbind(intent);
    }

    private static java.lang.String channelNameToId(java.lang.String str) {
        return str.toLowerCase(java.util.Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void ensureOnCreateCalled() {
        if (this.mNotificationManager == null) {
            throw new java.lang.IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }
}
