package androidx.media;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionManagerImplBase implements androidx.media.MediaSessionManager.MediaSessionManagerImpl {
    private static final boolean DEBUG = androidx.media.MediaSessionManager.DEBUG;
    private static final java.lang.String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final java.lang.String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
    private static final java.lang.String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
    private static final java.lang.String TAG = "MediaSessionManager";
    android.content.ContentResolver mContentResolver;
    android.content.Context mContext;

    MediaSessionManagerImplBase(android.content.Context context) {
        this.mContext = context;
        this.mContentResolver = context.getContentResolver();
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public android.content.Context getContext() {
        return this.mContext;
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(androidx.media.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        try {
            if (this.mContext.getPackageManager().getApplicationInfo(remoteUserInfoImpl.getPackageName(), 0) == null) {
                return false;
            }
            return isPermissionGranted(remoteUserInfoImpl, PERMISSION_STATUS_BAR_SERVICE) || isPermissionGranted(remoteUserInfoImpl, PERMISSION_MEDIA_CONTENT_CONTROL) || remoteUserInfoImpl.getUid() == 1000 || isEnabledNotificationListener(remoteUserInfoImpl);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            if (DEBUG) {
                android.util.Log.d(TAG, "Package " + remoteUserInfoImpl.getPackageName() + " doesn't exist");
            }
            return false;
        }
    }

    private boolean isPermissionGranted(androidx.media.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl, java.lang.String str) {
        if (remoteUserInfoImpl.getPid() < 0) {
            return this.mContext.getPackageManager().checkPermission(str, remoteUserInfoImpl.getPackageName()) == 0;
        }
        return this.mContext.checkPermission(str, remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0;
    }

    boolean isEnabledNotificationListener(androidx.media.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        java.lang.String string = android.provider.Settings.Secure.getString(this.mContentResolver, ENABLED_NOTIFICATION_LISTENERS);
        if (string != null) {
            for (java.lang.String str : string.split(":")) {
                android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(remoteUserInfoImpl.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    static class RemoteUserInfoImplBase implements androidx.media.MediaSessionManager.RemoteUserInfoImpl {
        private java.lang.String mPackageName;
        private int mPid;
        private int mUid;

        RemoteUserInfoImplBase(java.lang.String str, int i, int i2) {
            this.mPackageName = str;
            this.mPid = i;
            this.mUid = i2;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public java.lang.String getPackageName() {
            return this.mPackageName;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
            return this.mPid;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
            return this.mUid;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase)) {
                return false;
            }
            androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase remoteUserInfoImplBase = (androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase) obj;
            if (this.mPid < 0 || remoteUserInfoImplBase.mPid < 0) {
                return android.text.TextUtils.equals(this.mPackageName, remoteUserInfoImplBase.mPackageName) && this.mUid == remoteUserInfoImplBase.mUid;
            }
            return android.text.TextUtils.equals(this.mPackageName, remoteUserInfoImplBase.mPackageName) && this.mPid == remoteUserInfoImplBase.mPid && this.mUid == remoteUserInfoImplBase.mUid;
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(this.mPackageName, java.lang.Integer.valueOf(this.mUid));
        }
    }
}
