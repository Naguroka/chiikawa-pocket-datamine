package com.google.android.datatransport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EventContext {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.EventContext build();

        public abstract com.google.android.datatransport.EventContext.Builder setExperimentIdsClear(byte[] bArr);

        public abstract com.google.android.datatransport.EventContext.Builder setExperimentIdsEncrypted(byte[] bArr);

        public abstract com.google.android.datatransport.EventContext.Builder setPseudonymousId(java.lang.String str);
    }

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public abstract java.lang.String getPseudonymousId();

    public static com.google.android.datatransport.EventContext.Builder builder() {
        return new com.google.android.datatransport.AutoValue_EventContext.Builder();
    }
}
