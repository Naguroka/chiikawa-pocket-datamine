package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
public abstract class InstallationTokenResult {

    public static abstract class Builder {
        public abstract com.google.firebase.installations.InstallationTokenResult build();

        public abstract com.google.firebase.installations.InstallationTokenResult.Builder setToken(java.lang.String str);

        public abstract com.google.firebase.installations.InstallationTokenResult.Builder setTokenCreationTimestamp(long j);

        public abstract com.google.firebase.installations.InstallationTokenResult.Builder setTokenExpirationTimestamp(long j);
    }

    public abstract java.lang.String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract com.google.firebase.installations.InstallationTokenResult.Builder toBuilder();

    public static com.google.firebase.installations.InstallationTokenResult.Builder builder() {
        return new com.google.firebase.installations.AutoValue_InstallationTokenResult.Builder();
    }
}
