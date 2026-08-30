package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EventInternal {
    protected abstract java.util.Map<java.lang.String, java.lang.String> getAutoMetadata();

    public abstract java.lang.Integer getCode();

    public abstract com.google.android.datatransport.runtime.EncodedPayload getEncodedPayload();

    public abstract long getEventMillis();

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public abstract java.lang.Integer getProductId();

    public abstract java.lang.String getPseudonymousId();

    public abstract java.lang.String getTransportName();

    public abstract long getUptimeMillis();

    @java.lang.Deprecated
    public byte[] getPayload() {
        return getEncodedPayload().getBytes();
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return java.util.Collections.unmodifiableMap(getAutoMetadata());
    }

    public final java.lang.String getOrDefault(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = getAutoMetadata().get(str);
        return str3 == null ? str2 : str3;
    }

    public final int getInteger(java.lang.String str) {
        java.lang.String str2 = getAutoMetadata().get(str);
        if (str2 == null) {
            return 0;
        }
        return java.lang.Integer.valueOf(str2).intValue();
    }

    public final long getLong(java.lang.String str) {
        java.lang.String str2 = getAutoMetadata().get(str);
        if (str2 == null) {
            return 0L;
        }
        return java.lang.Long.valueOf(str2).longValue();
    }

    public final java.lang.String get(java.lang.String str) {
        java.lang.String str2 = getAutoMetadata().get(str);
        return str2 == null ? "" : str2;
    }

    public com.google.android.datatransport.runtime.EventInternal.Builder toBuilder() {
        return new com.google.android.datatransport.runtime.AutoValue_EventInternal.Builder().setTransportName(getTransportName()).setCode(getCode()).setProductId(getProductId()).setPseudonymousId(getPseudonymousId()).setExperimentIdsClear(getExperimentIdsClear()).setExperimentIdsEncrypted(getExperimentIdsEncrypted()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).setAutoMetadata(new java.util.HashMap(getAutoMetadata()));
    }

    public static com.google.android.datatransport.runtime.EventInternal.Builder builder() {
        return new com.google.android.datatransport.runtime.AutoValue_EventInternal.Builder().setAutoMetadata(new java.util.HashMap());
    }

    public static abstract class Builder {
        public abstract com.google.android.datatransport.runtime.EventInternal build();

        protected abstract java.util.Map<java.lang.String, java.lang.String> getAutoMetadata();

        protected abstract com.google.android.datatransport.runtime.EventInternal.Builder setAutoMetadata(java.util.Map<java.lang.String, java.lang.String> map);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setCode(java.lang.Integer num);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setEncodedPayload(com.google.android.datatransport.runtime.EncodedPayload encodedPayload);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setEventMillis(long j);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setExperimentIdsClear(byte[] bArr);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setExperimentIdsEncrypted(byte[] bArr);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setProductId(java.lang.Integer num);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setPseudonymousId(java.lang.String str);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setTransportName(java.lang.String str);

        public abstract com.google.android.datatransport.runtime.EventInternal.Builder setUptimeMillis(long j);

        public final com.google.android.datatransport.runtime.EventInternal.Builder addMetadata(java.lang.String str, java.lang.String str2) {
            getAutoMetadata().put(str, str2);
            return this;
        }

        public final com.google.android.datatransport.runtime.EventInternal.Builder addMetadata(java.lang.String str, long j) {
            getAutoMetadata().put(str, java.lang.String.valueOf(j));
            return this;
        }

        public final com.google.android.datatransport.runtime.EventInternal.Builder addMetadata(java.lang.String str, int i) {
            getAutoMetadata().put(str, java.lang.String.valueOf(i));
            return this;
        }
    }
}
