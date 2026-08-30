package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionManager {
    private static volatile androidx.media.MediaSessionManager sSessionManager;
    androidx.media.MediaSessionManager.MediaSessionManagerImpl mImpl;
    static final java.lang.String TAG = "MediaSessionManager";
    static final boolean DEBUG = android.util.Log.isLoggable(TAG, 3);
    private static final java.lang.Object sLock = new java.lang.Object();

    interface MediaSessionManagerImpl {
        android.content.Context getContext();

        boolean isTrustedForMediaControl(androidx.media.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl);
    }

    interface RemoteUserInfoImpl {
        java.lang.String getPackageName();

        int getPid();

        int getUid();
    }

    public static androidx.media.MediaSessionManager getSessionManager(android.content.Context context) {
        androidx.media.MediaSessionManager mediaSessionManager;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context cannot be null");
        }
        synchronized (sLock) {
            if (sSessionManager == null) {
                sSessionManager = new androidx.media.MediaSessionManager(context.getApplicationContext());
            }
            mediaSessionManager = sSessionManager;
        }
        return mediaSessionManager;
    }

    private MediaSessionManager(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new androidx.media.MediaSessionManagerImplApi28(context);
        } else {
            this.mImpl = new androidx.media.MediaSessionManagerImplApi21(context);
        }
    }

    public boolean isTrustedForMediaControl(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
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
        androidx.media.MediaSessionManager.RemoteUserInfoImpl mImpl;

        public RemoteUserInfo(java.lang.String str, int i, int i2) {
            if (str == null) {
                throw new java.lang.NullPointerException("package shouldn't be null");
            }
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("packageName should be nonempty");
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                this.mImpl = new androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i, i2);
            } else {
                this.mImpl = new androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase(str, i, i2);
            }
        }

        public RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            java.lang.String packageName = androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28.getPackageName(remoteUserInfo);
            if (packageName == null) {
                throw new java.lang.NullPointerException("package shouldn't be null");
            }
            if (android.text.TextUtils.isEmpty(packageName)) {
                throw new java.lang.IllegalArgumentException("packageName should be nonempty");
            }
            this.mImpl = new androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(remoteUserInfo);
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
            if (obj instanceof androidx.media.MediaSessionManager.RemoteUserInfo) {
                return this.mImpl.equals(((androidx.media.MediaSessionManager.RemoteUserInfo) obj).mImpl);
            }
            return false;
        }

        public int hashCode() {
            return this.mImpl.hashCode();
        }
    }
}
