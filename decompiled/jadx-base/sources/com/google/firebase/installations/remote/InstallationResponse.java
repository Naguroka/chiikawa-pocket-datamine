package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes5.dex */
public abstract class InstallationResponse {

    public static abstract class Builder {
        public abstract com.google.firebase.installations.remote.InstallationResponse build();

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setAuthToken(com.google.firebase.installations.remote.TokenResult tokenResult);

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setFid(java.lang.String str);

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setRefreshToken(java.lang.String str);

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setResponseCode(com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode);

        public abstract com.google.firebase.installations.remote.InstallationResponse.Builder setUri(java.lang.String str);
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    public abstract com.google.firebase.installations.remote.TokenResult getAuthToken();

    public abstract java.lang.String getFid();

    public abstract java.lang.String getRefreshToken();

    public abstract com.google.firebase.installations.remote.InstallationResponse.ResponseCode getResponseCode();

    public abstract java.lang.String getUri();

    public abstract com.google.firebase.installations.remote.InstallationResponse.Builder toBuilder();

    public static com.google.firebase.installations.remote.InstallationResponse.Builder builder() {
        return new com.google.firebase.installations.remote.AutoValue_InstallationResponse.Builder();
    }
}
