package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExternalPrivacyContext {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.cct.internal.ExternalPrivacyContext build();

        public abstract com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder setPrequest(com.google.android.datatransport.cct.internal.ExternalPRequestContext externalPRequestContext);
    }

    public abstract com.google.android.datatransport.cct.internal.ExternalPRequestContext getPrequest();

    public static com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder builder() {
        return new com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext.Builder();
    }
}
