package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public abstract long getNextRequestWaitMillis();

    public abstract com.google.android.datatransport.runtime.backends.BackendResponse.Status getStatus();

    public static com.google.android.datatransport.runtime.backends.BackendResponse transientError() {
        return new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse(com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR, -1L);
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse fatalError() {
        return new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse(com.google.android.datatransport.runtime.backends.BackendResponse.Status.FATAL_ERROR, -1L);
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse invalidPayload() {
        return new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse(com.google.android.datatransport.runtime.backends.BackendResponse.Status.INVALID_PAYLOAD, -1L);
    }

    public static com.google.android.datatransport.runtime.backends.BackendResponse ok(long j) {
        return new com.google.android.datatransport.runtime.backends.AutoValue_BackendResponse(com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK, j);
    }
}
