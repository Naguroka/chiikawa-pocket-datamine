package com.android.installreferrer.api;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstallReferrerClient {

    public static final class Builder {
        private final android.content.Context mContext;

        private Builder(android.content.Context context) {
            this.mContext = context;
        }

        public com.android.installreferrer.api.InstallReferrerClient build() {
            android.content.Context context = this.mContext;
            if (context != null) {
                return new com.android.installreferrer.api.InstallReferrerClientImpl(context);
            }
            throw new java.lang.IllegalArgumentException("Please provide a valid Context.");
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int PERMISSION_ERROR = 4;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;
    }

    public static com.android.installreferrer.api.InstallReferrerClient.Builder newBuilder(android.content.Context context) {
        return new com.android.installreferrer.api.InstallReferrerClient.Builder(context);
    }

    public abstract void endConnection();

    public abstract com.android.installreferrer.api.ReferrerDetails getInstallReferrer() throws android.os.RemoteException;

    public abstract boolean isReady();

    public abstract void startConnection(com.android.installreferrer.api.InstallReferrerStateListener installReferrerStateListener);
}
