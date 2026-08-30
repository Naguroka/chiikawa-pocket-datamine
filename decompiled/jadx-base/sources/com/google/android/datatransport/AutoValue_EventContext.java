package com.google.android.datatransport;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_EventContext extends com.google.android.datatransport.EventContext {
    private final byte[] experimentIdsClear;
    private final byte[] experimentIdsEncrypted;
    private final java.lang.String pseudonymousId;

    private AutoValue_EventContext(java.lang.String str, byte[] bArr, byte[] bArr2) {
        this.pseudonymousId = str;
        this.experimentIdsClear = bArr;
        this.experimentIdsEncrypted = bArr2;
    }

    @Override // com.google.android.datatransport.EventContext
    public java.lang.String getPseudonymousId() {
        return this.pseudonymousId;
    }

    @Override // com.google.android.datatransport.EventContext
    public byte[] getExperimentIdsClear() {
        return this.experimentIdsClear;
    }

    @Override // com.google.android.datatransport.EventContext
    public byte[] getExperimentIdsEncrypted() {
        return this.experimentIdsEncrypted;
    }

    public java.lang.String toString() {
        return "EventContext{pseudonymousId=" + this.pseudonymousId + ", experimentIdsClear=" + java.util.Arrays.toString(this.experimentIdsClear) + ", experimentIdsEncrypted=" + java.util.Arrays.toString(this.experimentIdsEncrypted) + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.EventContext)) {
            return false;
        }
        com.google.android.datatransport.EventContext eventContext = (com.google.android.datatransport.EventContext) obj;
        java.lang.String str = this.pseudonymousId;
        if (str != null ? str.equals(eventContext.getPseudonymousId()) : eventContext.getPseudonymousId() == null) {
            boolean z = eventContext instanceof com.google.android.datatransport.AutoValue_EventContext;
            if (java.util.Arrays.equals(this.experimentIdsClear, z ? ((com.google.android.datatransport.AutoValue_EventContext) eventContext).experimentIdsClear : eventContext.getExperimentIdsClear())) {
                if (java.util.Arrays.equals(this.experimentIdsEncrypted, z ? ((com.google.android.datatransport.AutoValue_EventContext) eventContext).experimentIdsEncrypted : eventContext.getExperimentIdsEncrypted())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.pseudonymousId;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.experimentIdsClear)) * 1000003) ^ java.util.Arrays.hashCode(this.experimentIdsEncrypted);
    }

    static final class Builder extends com.google.android.datatransport.EventContext.Builder {
        private byte[] experimentIdsClear;
        private byte[] experimentIdsEncrypted;
        private java.lang.String pseudonymousId;

        Builder() {
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public com.google.android.datatransport.EventContext.Builder setPseudonymousId(java.lang.String str) {
            this.pseudonymousId = str;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public com.google.android.datatransport.EventContext.Builder setExperimentIdsClear(byte[] bArr) {
            this.experimentIdsClear = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public com.google.android.datatransport.EventContext.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.experimentIdsEncrypted = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public com.google.android.datatransport.EventContext build() {
            return new com.google.android.datatransport.AutoValue_EventContext(this.pseudonymousId, this.experimentIdsClear, this.experimentIdsEncrypted);
        }
    }
}
