package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes5.dex */
public abstract class TokenResult {

    public static abstract class Builder {
        public abstract com.google.firebase.installations.remote.TokenResult build();

        public abstract com.google.firebase.installations.remote.TokenResult.Builder setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode);

        public abstract com.google.firebase.installations.remote.TokenResult.Builder setToken(java.lang.String str);

        public abstract com.google.firebase.installations.remote.TokenResult.Builder setTokenExpirationTimestamp(long j);
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public abstract com.google.firebase.installations.remote.TokenResult.ResponseCode getResponseCode();

    public abstract java.lang.String getToken();

    public abstract long getTokenExpirationTimestamp();

    public abstract com.google.firebase.installations.remote.TokenResult.Builder toBuilder();

    public static com.google.firebase.installations.remote.TokenResult.Builder builder() {
        return new com.google.firebase.installations.remote.AutoValue_TokenResult.Builder().setTokenExpirationTimestamp(0L);
    }
}
