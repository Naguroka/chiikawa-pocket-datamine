package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExperimentIds {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.cct.internal.ExperimentIds build();

        public abstract com.google.android.datatransport.cct.internal.ExperimentIds.Builder setClearBlob(byte[] bArr);

        public abstract com.google.android.datatransport.cct.internal.ExperimentIds.Builder setEncryptedBlob(byte[] bArr);
    }

    public abstract byte[] getClearBlob();

    public abstract byte[] getEncryptedBlob();

    public static com.google.android.datatransport.cct.internal.ExperimentIds.Builder builder() {
        return new com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds.Builder();
    }
}
