package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LogResponse extends com.google.android.datatransport.cct.internal.LogResponse {
    private final long nextRequestWaitMillis;

    AutoValue_LogResponse(long j) {
        this.nextRequestWaitMillis = j;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public java.lang.String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.nextRequestWaitMillis + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof com.google.android.datatransport.cct.internal.LogResponse) && this.nextRequestWaitMillis == ((com.google.android.datatransport.cct.internal.LogResponse) obj).getNextRequestWaitMillis();
    }

    public int hashCode() {
        long j = this.nextRequestWaitMillis;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }
}
