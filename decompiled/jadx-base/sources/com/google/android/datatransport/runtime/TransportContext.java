package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TransportContext {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.runtime.TransportContext build();

        public abstract com.google.android.datatransport.runtime.TransportContext.Builder setBackendName(java.lang.String str);

        public abstract com.google.android.datatransport.runtime.TransportContext.Builder setExtras(byte[] bArr);

        public abstract com.google.android.datatransport.runtime.TransportContext.Builder setPriority(com.google.android.datatransport.Priority priority);
    }

    public abstract java.lang.String getBackendName();

    public abstract byte[] getExtras();

    public abstract com.google.android.datatransport.Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = getBackendName();
        objArr[1] = getPriority();
        objArr[2] = getExtras() == null ? "" : android.util.Base64.encodeToString(getExtras(), 2);
        return java.lang.String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public static com.google.android.datatransport.runtime.TransportContext.Builder builder() {
        return new com.google.android.datatransport.runtime.AutoValue_TransportContext.Builder().setPriority(com.google.android.datatransport.Priority.DEFAULT);
    }

    public com.google.android.datatransport.runtime.TransportContext withPriority(com.google.android.datatransport.Priority priority) {
        return builder().setBackendName(getBackendName()).setPriority(priority).setExtras(getExtras()).build();
    }
}
