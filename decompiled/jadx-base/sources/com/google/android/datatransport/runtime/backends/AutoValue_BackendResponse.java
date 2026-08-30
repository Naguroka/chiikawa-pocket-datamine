package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BackendResponse extends com.google.android.datatransport.runtime.backends.BackendResponse {
    private final long nextRequestWaitMillis;
    private final com.google.android.datatransport.runtime.backends.BackendResponse.Status status;

    AutoValue_BackendResponse(com.google.android.datatransport.runtime.backends.BackendResponse.Status status, long j) {
        if (status == null) {
            throw new java.lang.NullPointerException("Null status");
        }
        this.status = status;
        this.nextRequestWaitMillis = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public com.google.android.datatransport.runtime.backends.BackendResponse.Status getStatus() {
        return this.status;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public java.lang.String toString() {
        return "BackendResponse{status=" + this.status + ", nextRequestWaitMillis=" + this.nextRequestWaitMillis + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.backends.BackendResponse)) {
            return false;
        }
        com.google.android.datatransport.runtime.backends.BackendResponse backendResponse = (com.google.android.datatransport.runtime.backends.BackendResponse) obj;
        return this.status.equals(backendResponse.getStatus()) && this.nextRequestWaitMillis == backendResponse.getNextRequestWaitMillis();
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() ^ 1000003) * 1000003;
        long j = this.nextRequestWaitMillis;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }
}
