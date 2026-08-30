package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExternalPRequestContext {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.cct.internal.ExternalPRequestContext build();

        public abstract com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder setOriginAssociatedProductId(java.lang.Integer num);
    }

    public abstract java.lang.Integer getOriginAssociatedProductId();

    public static com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder builder() {
        return new com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext.Builder();
    }
}
