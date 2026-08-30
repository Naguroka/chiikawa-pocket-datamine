package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BackendRequest {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.runtime.backends.BackendRequest build();

        public abstract com.google.android.datatransport.runtime.backends.BackendRequest.Builder setEvents(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> iterable);

        public abstract com.google.android.datatransport.runtime.backends.BackendRequest.Builder setExtras(byte[] bArr);
    }

    public abstract java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> getEvents();

    public abstract byte[] getExtras();

    public static com.google.android.datatransport.runtime.backends.BackendRequest create(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> iterable) {
        return builder().setEvents(iterable).build();
    }

    public static com.google.android.datatransport.runtime.backends.BackendRequest.Builder builder() {
        return new com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest.Builder();
    }
}
