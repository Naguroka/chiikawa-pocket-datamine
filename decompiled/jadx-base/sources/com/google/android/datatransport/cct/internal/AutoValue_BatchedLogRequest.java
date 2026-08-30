package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BatchedLogRequest extends com.google.android.datatransport.cct.internal.BatchedLogRequest {
    private final java.util.List<com.google.android.datatransport.cct.internal.LogRequest> logRequests;

    AutoValue_BatchedLogRequest(java.util.List<com.google.android.datatransport.cct.internal.LogRequest> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null logRequests");
        }
        this.logRequests = list;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    @com.google.firebase.encoders.annotations.Encodable.Field(name = "logRequest")
    public java.util.List<com.google.android.datatransport.cct.internal.LogRequest> getLogRequests() {
        return this.logRequests;
    }

    public java.lang.String toString() {
        return "BatchedLogRequest{logRequests=" + this.logRequests + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.datatransport.cct.internal.BatchedLogRequest) {
            return this.logRequests.equals(((com.google.android.datatransport.cct.internal.BatchedLogRequest) obj).getLogRequests());
        }
        return false;
    }

    public int hashCode() {
        return this.logRequests.hashCode() ^ 1000003;
    }
}
