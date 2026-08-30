package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TransportContext extends com.google.android.datatransport.runtime.TransportContext {
    private final java.lang.String backendName;
    private final byte[] extras;
    private final com.google.android.datatransport.Priority priority;

    private AutoValue_TransportContext(java.lang.String str, byte[] bArr, com.google.android.datatransport.Priority priority) {
        this.backendName = str;
        this.extras = bArr;
        this.priority = priority;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public java.lang.String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public byte[] getExtras() {
        return this.extras;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public com.google.android.datatransport.Priority getPriority() {
        return this.priority;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.TransportContext)) {
            return false;
        }
        com.google.android.datatransport.runtime.TransportContext transportContext = (com.google.android.datatransport.runtime.TransportContext) obj;
        if (this.backendName.equals(transportContext.getBackendName())) {
            if (java.util.Arrays.equals(this.extras, transportContext instanceof com.google.android.datatransport.runtime.AutoValue_TransportContext ? ((com.google.android.datatransport.runtime.AutoValue_TransportContext) transportContext).extras : transportContext.getExtras()) && this.priority.equals(transportContext.getPriority())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.backendName.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.extras)) * 1000003) ^ this.priority.hashCode();
    }

    static final class Builder extends com.google.android.datatransport.runtime.TransportContext.Builder {
        private java.lang.String backendName;
        private byte[] extras;
        private com.google.android.datatransport.Priority priority;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public com.google.android.datatransport.runtime.TransportContext.Builder setBackendName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null backendName");
            }
            this.backendName = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public com.google.android.datatransport.runtime.TransportContext.Builder setExtras(byte[] bArr) {
            this.extras = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public com.google.android.datatransport.runtime.TransportContext.Builder setPriority(com.google.android.datatransport.Priority priority) {
            if (priority == null) {
                throw new java.lang.NullPointerException("Null priority");
            }
            this.priority = priority;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public com.google.android.datatransport.runtime.TransportContext build() {
            java.lang.String str = this.backendName == null ? " backendName" : "";
            if (this.priority == null) {
                str = str + " priority";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.android.datatransport.runtime.AutoValue_TransportContext(this.backendName, this.extras, this.priority);
        }
    }
}
