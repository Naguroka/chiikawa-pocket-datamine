package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public interface ExoMediaDrm {
    public static final int EVENT_KEY_EXPIRED = 3;
    public static final int EVENT_KEY_REQUIRED = 2;
    public static final int EVENT_PROVISION_REQUIRED = 1;
    public static final int KEY_TYPE_OFFLINE = 2;
    public static final int KEY_TYPE_RELEASE = 3;
    public static final int KEY_TYPE_STREAMING = 1;

    public interface OnEventListener {
        void onEvent(androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface OnExpirationUpdateListener {
        void onExpirationUpdate(androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm, byte[] bArr, long j);
    }

    public interface OnKeyStatusChangeListener {
        void onKeyStatusChange(androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm, byte[] bArr, java.util.List<androidx.media3.exoplayer.drm.ExoMediaDrm.KeyStatus> list, boolean z);
    }

    public interface Provider {
        androidx.media3.exoplayer.drm.ExoMediaDrm acquireExoMediaDrm(java.util.UUID uuid);
    }

    void acquire();

    void closeSession(byte[] bArr);

    androidx.media3.decoder.CryptoConfig createCryptoConfig(byte[] bArr) throws android.media.MediaCryptoException;

    int getCryptoType();

    androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, int i, java.util.HashMap<java.lang.String, java.lang.String> map) throws android.media.NotProvisionedException;

    android.os.PersistableBundle getMetrics();

    byte[] getPropertyByteArray(java.lang.String str);

    java.lang.String getPropertyString(java.lang.String str);

    androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest getProvisionRequest();

    byte[] openSession() throws android.media.MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws android.media.DeniedByServerException, android.media.NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws android.media.DeniedByServerException;

    java.util.Map<java.lang.String, java.lang.String> queryKeyStatus(byte[] bArr);

    void release();

    boolean requiresSecureDecoder(byte[] bArr, java.lang.String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener onEventListener);

    void setOnExpirationUpdateListener(androidx.media3.exoplayer.drm.ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener);

    void setOnKeyStatusChangeListener(androidx.media3.exoplayer.drm.ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener);

    default void setPlayerIdForSession(byte[] bArr, androidx.media3.exoplayer.analytics.PlayerId playerId) {
    }

    void setPropertyByteArray(java.lang.String str, byte[] bArr);

    void setPropertyString(java.lang.String str, java.lang.String str2);

    public static final class AppManagedProvider implements androidx.media3.exoplayer.drm.ExoMediaDrm.Provider {
        private final androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm;

        public AppManagedProvider(androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm) {
            this.exoMediaDrm = exoMediaDrm;
        }

        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
        public androidx.media3.exoplayer.drm.ExoMediaDrm acquireExoMediaDrm(java.util.UUID uuid) {
            this.exoMediaDrm.acquire();
            return this.exoMediaDrm;
        }
    }

    public static final class KeyStatus {
        private final byte[] keyId;
        private final int statusCode;

        public KeyStatus(int i, byte[] bArr) {
            this.statusCode = i;
            this.keyId = bArr;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public byte[] getKeyId() {
            return this.keyId;
        }
    }

    public static final class KeyRequest {
        public static final int REQUEST_TYPE_INITIAL = 0;
        public static final int REQUEST_TYPE_NONE = 3;
        public static final int REQUEST_TYPE_RELEASE = 2;
        public static final int REQUEST_TYPE_RENEWAL = 1;
        public static final int REQUEST_TYPE_UNKNOWN = Integer.MIN_VALUE;
        public static final int REQUEST_TYPE_UPDATE = 4;
        private final byte[] data;
        private final java.lang.String licenseServerUrl;
        private final int requestType;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(byte[] bArr, java.lang.String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }

        public KeyRequest(byte[] bArr, java.lang.String str, int i) {
            this.data = bArr;
            this.licenseServerUrl = str;
            this.requestType = i;
        }

        public byte[] getData() {
            return this.data;
        }

        public java.lang.String getLicenseServerUrl() {
            return this.licenseServerUrl;
        }

        public int getRequestType() {
            return this.requestType;
        }
    }

    public static final class ProvisionRequest {
        private final byte[] data;
        private final java.lang.String defaultUrl;

        public ProvisionRequest(byte[] bArr, java.lang.String str) {
            this.data = bArr;
            this.defaultUrl = str;
        }

        public byte[] getData() {
            return this.data;
        }

        public java.lang.String getDefaultUrl() {
            return this.defaultUrl;
        }
    }

    default void removeOfflineLicense(byte[] bArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    default java.util.List<byte[]> getOfflineLicenseKeySetIds() {
        throw new java.lang.UnsupportedOperationException();
    }
}
