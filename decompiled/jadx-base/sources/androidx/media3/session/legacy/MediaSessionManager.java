package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionManager {
    private static volatile androidx.media3.session.legacy.MediaSessionManager sSessionManager;
    androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl mImpl;
    static final java.lang.String TAG = "MediaSessionManager";
    static final boolean DEBUG = android.util.Log.isLoggable(TAG, 3);
    private static final java.lang.Object sLock = new java.lang.Object();

    interface MediaSessionManagerImpl {
        android.content.Context getContext();

        boolean isTrustedForMediaControl(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl);
    }

    interface RemoteUserInfoImpl {
        java.lang.String getPackageName();

        int getPid();

        int getUid();
    }

    public static androidx.media3.session.legacy.MediaSessionManager getSessionManager(android.content.Context context) {
        androidx.media3.session.legacy.MediaSessionManager mediaSessionManager;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context cannot be null");
        }
        synchronized (sLock) {
            if (sSessionManager == null) {
                sSessionManager = new androidx.media3.session.legacy.MediaSessionManager(context.getApplicationContext());
            }
            mediaSessionManager = sSessionManager;
        }
        return mediaSessionManager;
    }

    private MediaSessionManager(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplApi28(context);
        } else {
            this.mImpl = new androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplApi21(context);
        }
    }

    public boolean isTrustedForMediaControl(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        if (remoteUserInfo == null) {
            throw new java.lang.IllegalArgumentException("userInfo should not be null");
        }
        return this.mImpl.isTrustedForMediaControl(remoteUserInfo.mImpl);
    }

    android.content.Context getContext() {
        return this.mImpl.getContext();
    }

    public static final class RemoteUserInfo {
        public static final java.lang.String LEGACY_CONTROLLER = "android.media.session.MediaController";
        public static final int UNKNOWN_PID = -1;
        public static final int UNKNOWN_UID = -1;
        androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl mImpl;

        public RemoteUserInfo(java.lang.String str, int i, int i2) {
            if (str == null) {
                throw new java.lang.NullPointerException("package shouldn't be null");
            }
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("packageName should be nonempty");
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                this.mImpl = new androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i, i2);
            } else {
                this.mImpl = new androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase.RemoteUserInfoImplBase(str, i, i2);
            }
        }

        public RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            java.lang.String packageName = androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28.getPackageName(remoteUserInfo);
            if (packageName == null) {
                throw new java.lang.NullPointerException("package shouldn't be null");
            }
            if (android.text.TextUtils.isEmpty(packageName)) {
                throw new java.lang.IllegalArgumentException("packageName should be nonempty");
            }
            this.mImpl = new androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(remoteUserInfo);
        }

        public java.lang.String getPackageName() {
            return this.mImpl.getPackageName();
        }

        public int getPid() {
            return this.mImpl.getPid();
        }

        public int getUid() {
            return this.mImpl.getUid();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo) {
                return this.mImpl.equals(((androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo) obj).mImpl);
            }
            return false;
        }

        public int hashCode() {
            return this.mImpl.hashCode();
        }
    }

    private static class MediaSessionManagerImplBase implements androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl {
        private static final boolean DEBUG = androidx.media3.session.legacy.MediaSessionManager.DEBUG;
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

        @Override // androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl
        public android.content.Context getContext() {
            return this.mContext;
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl
        public boolean isTrustedForMediaControl(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
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

        private boolean isPermissionGranted(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl, java.lang.String str) {
            if (remoteUserInfoImpl.getPid() < 0) {
                return this.mContext.getPackageManager().checkPermission(str, remoteUserInfoImpl.getPackageName()) == 0;
            }
            return this.mContext.checkPermission(str, remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0;
        }

        boolean isEnabledNotificationListener(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
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

        static class RemoteUserInfoImplBase implements androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl {
            private java.lang.String mPackageName;
            private int mPid;
            private int mUid;

            RemoteUserInfoImplBase(java.lang.String str, int i, int i2) {
                this.mPackageName = str;
                this.mPid = i;
                this.mUid = i2;
            }

            @Override // androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl
            public java.lang.String getPackageName() {
                return this.mPackageName;
            }

            @Override // androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl
            public int getPid() {
                return this.mPid;
            }

            @Override // androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl
            public int getUid() {
                return this.mUid;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase.RemoteUserInfoImplBase)) {
                    return false;
                }
                androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase.RemoteUserInfoImplBase remoteUserInfoImplBase = (androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase.RemoteUserInfoImplBase) obj;
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

    private static class MediaSessionManagerImplApi21 extends androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase {
        MediaSessionManagerImplApi21(android.content.Context context) {
            super(context);
            this.mContext = context;
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase, androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl
        public boolean isTrustedForMediaControl(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
            return hasMediaControlPermission(remoteUserInfoImpl) || super.isTrustedForMediaControl(remoteUserInfoImpl);
        }

        private boolean hasMediaControlPermission(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
            return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", remoteUserInfoImpl.getPid(), remoteUserInfoImpl.getUid()) == 0;
        }
    }

    private static final class MediaSessionManagerImplApi28 extends androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplApi21 {
        android.media.session.MediaSessionManager mObject;

        MediaSessionManagerImplApi28(android.content.Context context) {
            super(context);
            this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
        }

        @Override // androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplApi21, androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase, androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImpl
        public boolean isTrustedForMediaControl(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
            return super.isTrustedForMediaControl(remoteUserInfoImpl);
        }

        private static final class RemoteUserInfoImplApi28 extends androidx.media3.session.legacy.MediaSessionManager.MediaSessionManagerImplBase.RemoteUserInfoImplBase {
            final android.media.session.MediaSessionManager.RemoteUserInfo mObject;

            RemoteUserInfoImplApi28(java.lang.String str, int i, int i2) {
                super(str, i, i2);
                this.mObject = new android.media.session.MediaSessionManager.RemoteUserInfo(str, i, i2);
            }

            RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
                super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
                this.mObject = remoteUserInfo;
            }

            static java.lang.String getPackageName(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
                return remoteUserInfo.getPackageName();
            }
        }
    }
}
