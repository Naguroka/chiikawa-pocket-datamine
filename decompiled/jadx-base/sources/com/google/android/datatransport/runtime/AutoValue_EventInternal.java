package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_EventInternal extends com.google.android.datatransport.runtime.EventInternal {
    private final java.util.Map<java.lang.String, java.lang.String> autoMetadata;
    private final java.lang.Integer code;
    private final com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
    private final long eventMillis;
    private final byte[] experimentIdsClear;
    private final byte[] experimentIdsEncrypted;
    private final java.lang.Integer productId;
    private final java.lang.String pseudonymousId;
    private final java.lang.String transportName;
    private final long uptimeMillis;

    private AutoValue_EventInternal(java.lang.String str, java.lang.Integer num, com.google.android.datatransport.runtime.EncodedPayload encodedPayload, long j, long j2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Integer num2, java.lang.String str2, byte[] bArr, byte[] bArr2) {
        this.transportName = str;
        this.code = num;
        this.encodedPayload = encodedPayload;
        this.eventMillis = j;
        this.uptimeMillis = j2;
        this.autoMetadata = map;
        this.productId = num2;
        this.pseudonymousId = str2;
        this.experimentIdsClear = bArr;
        this.experimentIdsEncrypted = bArr2;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.String getTransportName() {
        return this.transportName;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public com.google.android.datatransport.runtime.EncodedPayload getEncodedPayload() {
        return this.encodedPayload;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
        return this.eventMillis;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    protected java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
        return this.autoMetadata;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.Integer getProductId() {
        return this.productId;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.String getPseudonymousId() {
        return this.pseudonymousId;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public byte[] getExperimentIdsClear() {
        return this.experimentIdsClear;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public byte[] getExperimentIdsEncrypted() {
        return this.experimentIdsEncrypted;
    }

    public java.lang.String toString() {
        return "EventInternal{transportName=" + this.transportName + ", code=" + this.code + ", encodedPayload=" + this.encodedPayload + ", eventMillis=" + this.eventMillis + ", uptimeMillis=" + this.uptimeMillis + ", autoMetadata=" + this.autoMetadata + ", productId=" + this.productId + ", pseudonymousId=" + this.pseudonymousId + ", experimentIdsClear=" + java.util.Arrays.toString(this.experimentIdsClear) + ", experimentIdsEncrypted=" + java.util.Arrays.toString(this.experimentIdsEncrypted) + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.EventInternal)) {
            return false;
        }
        com.google.android.datatransport.runtime.EventInternal eventInternal = (com.google.android.datatransport.runtime.EventInternal) obj;
        if (this.transportName.equals(eventInternal.getTransportName()) && ((num = this.code) != null ? num.equals(eventInternal.getCode()) : eventInternal.getCode() == null) && this.encodedPayload.equals(eventInternal.getEncodedPayload()) && this.eventMillis == eventInternal.getEventMillis() && this.uptimeMillis == eventInternal.getUptimeMillis() && this.autoMetadata.equals(eventInternal.getAutoMetadata()) && ((num2 = this.productId) != null ? num2.equals(eventInternal.getProductId()) : eventInternal.getProductId() == null) && ((str = this.pseudonymousId) != null ? str.equals(eventInternal.getPseudonymousId()) : eventInternal.getPseudonymousId() == null)) {
            boolean z = eventInternal instanceof com.google.android.datatransport.runtime.AutoValue_EventInternal;
            if (java.util.Arrays.equals(this.experimentIdsClear, z ? ((com.google.android.datatransport.runtime.AutoValue_EventInternal) eventInternal).experimentIdsClear : eventInternal.getExperimentIdsClear())) {
                if (java.util.Arrays.equals(this.experimentIdsEncrypted, z ? ((com.google.android.datatransport.runtime.AutoValue_EventInternal) eventInternal).experimentIdsEncrypted : eventInternal.getExperimentIdsEncrypted())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.transportName.hashCode() ^ 1000003) * 1000003;
        java.lang.Integer num = this.code;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.encodedPayload.hashCode()) * 1000003;
        long j = this.eventMillis;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.uptimeMillis;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.autoMetadata.hashCode()) * 1000003;
        java.lang.Integer num2 = this.productId;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        java.lang.String str = this.pseudonymousId;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ java.util.Arrays.hashCode(this.experimentIdsClear)) * 1000003) ^ java.util.Arrays.hashCode(this.experimentIdsEncrypted);
    }

    static final class Builder extends com.google.android.datatransport.runtime.EventInternal.Builder {
        private java.util.Map<java.lang.String, java.lang.String> autoMetadata;
        private java.lang.Integer code;
        private com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
        private java.lang.Long eventMillis;
        private byte[] experimentIdsClear;
        private byte[] experimentIdsEncrypted;
        private java.lang.Integer productId;
        private java.lang.String pseudonymousId;
        private java.lang.String transportName;
        private java.lang.Long uptimeMillis;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setTransportName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null transportName");
            }
            this.transportName = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setCode(java.lang.Integer num) {
            this.code = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setEncodedPayload(com.google.android.datatransport.runtime.EncodedPayload encodedPayload) {
            if (encodedPayload == null) {
                throw new java.lang.NullPointerException("Null encodedPayload");
            }
            this.encodedPayload = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setEventMillis(long j) {
            this.eventMillis = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setUptimeMillis(long j) {
            this.uptimeMillis = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected com.google.android.datatransport.runtime.EventInternal.Builder setAutoMetadata(java.util.Map<java.lang.String, java.lang.String> map) {
            if (map == null) {
                throw new java.lang.NullPointerException("Null autoMetadata");
            }
            this.autoMetadata = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
            java.util.Map<java.lang.String, java.lang.String> map = this.autoMetadata;
            if (map != null) {
                return map;
            }
            throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setProductId(java.lang.Integer num) {
            this.productId = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setPseudonymousId(java.lang.String str) {
            this.pseudonymousId = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setExperimentIdsClear(byte[] bArr) {
            this.experimentIdsClear = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.experimentIdsEncrypted = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal build() {
            java.lang.String str = this.transportName == null ? " transportName" : "";
            if (this.encodedPayload == null) {
                str = str + " encodedPayload";
            }
            if (this.eventMillis == null) {
                str = str + " eventMillis";
            }
            if (this.uptimeMillis == null) {
                str = str + " uptimeMillis";
            }
            if (this.autoMetadata == null) {
                str = str + " autoMetadata";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.android.datatransport.runtime.AutoValue_EventInternal(this.transportName, this.code, this.encodedPayload, this.eventMillis.longValue(), this.uptimeMillis.longValue(), this.autoMetadata, this.productId, this.pseudonymousId, this.experimentIdsClear, this.experimentIdsEncrypted);
        }
    }
}
