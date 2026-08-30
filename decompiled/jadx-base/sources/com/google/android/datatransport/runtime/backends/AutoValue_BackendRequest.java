package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BackendRequest extends com.google.android.datatransport.runtime.backends.BackendRequest {
    private final java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> events;
    private final byte[] extras;

    private AutoValue_BackendRequest(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> iterable, byte[] bArr) {
        this.events = iterable;
        this.extras = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> getEvents() {
        return this.events;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public byte[] getExtras() {
        return this.extras;
    }

    public java.lang.String toString() {
        return "BackendRequest{events=" + this.events + ", extras=" + java.util.Arrays.toString(this.extras) + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.backends.BackendRequest)) {
            return false;
        }
        com.google.android.datatransport.runtime.backends.BackendRequest backendRequest = (com.google.android.datatransport.runtime.backends.BackendRequest) obj;
        if (this.events.equals(backendRequest.getEvents())) {
            if (java.util.Arrays.equals(this.extras, backendRequest instanceof com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest ? ((com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest) backendRequest).extras : backendRequest.getExtras())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.events.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.extras);
    }

    static final class Builder extends com.google.android.datatransport.runtime.backends.BackendRequest.Builder {
        private java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> events;
        private byte[] extras;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public com.google.android.datatransport.runtime.backends.BackendRequest.Builder setEvents(java.lang.Iterable<com.google.android.datatransport.runtime.EventInternal> iterable) {
            if (iterable == null) {
                throw new java.lang.NullPointerException("Null events");
            }
            this.events = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public com.google.android.datatransport.runtime.backends.BackendRequest.Builder setExtras(byte[] bArr) {
            this.extras = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public com.google.android.datatransport.runtime.backends.BackendRequest build() {
            java.lang.String str = this.events == null ? " events" : "";
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest(this.events, this.extras);
        }
    }
}
