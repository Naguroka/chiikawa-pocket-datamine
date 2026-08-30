package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LogRequest {
    public abstract com.google.android.datatransport.cct.internal.ClientInfo getClientInfo();

    @com.google.firebase.encoders.annotations.Encodable.Field(name = "logEvent")
    public abstract java.util.List<com.google.android.datatransport.cct.internal.LogEvent> getLogEvents();

    public abstract java.lang.Integer getLogSource();

    public abstract java.lang.String getLogSourceName();

    public abstract com.google.android.datatransport.cct.internal.QosTier getQosTier();

    public abstract long getRequestTimeMs();

    public abstract long getRequestUptimeMs();

    public static com.google.android.datatransport.cct.internal.LogRequest.Builder builder() {
        return new com.google.android.datatransport.cct.internal.AutoValue_LogRequest.Builder();
    }

    public static abstract class Builder {
        public abstract com.google.android.datatransport.cct.internal.LogRequest build();

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setClientInfo(com.google.android.datatransport.cct.internal.ClientInfo clientInfo);

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setLogEvents(java.util.List<com.google.android.datatransport.cct.internal.LogEvent> list);

        abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSource(java.lang.Integer num);

        abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSourceName(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setQosTier(com.google.android.datatransport.cct.internal.QosTier qosTier);

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestTimeMs(long j);

        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestUptimeMs(long j);

        public com.google.android.datatransport.cct.internal.LogRequest.Builder setSource(int i) {
            return setLogSource(java.lang.Integer.valueOf(i));
        }

        public com.google.android.datatransport.cct.internal.LogRequest.Builder setSource(java.lang.String str) {
            return setLogSourceName(str);
        }
    }
}
