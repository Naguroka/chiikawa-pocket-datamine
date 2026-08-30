package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ClientInfo {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.cct.internal.ClientInfo build();

        public abstract com.google.android.datatransport.cct.internal.ClientInfo.Builder setAndroidClientInfo(com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo);

        public abstract com.google.android.datatransport.cct.internal.ClientInfo.Builder setClientType(com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType);
    }

    public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo getAndroidClientInfo();

    public abstract com.google.android.datatransport.cct.internal.ClientInfo.ClientType getClientType();

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i) {
            this.value = i;
        }
    }

    public static com.google.android.datatransport.cct.internal.ClientInfo.Builder builder() {
        return new com.google.android.datatransport.cct.internal.AutoValue_ClientInfo.Builder();
    }
}
