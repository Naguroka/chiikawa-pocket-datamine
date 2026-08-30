package com.google.firebase.remoteconfig.interop.rollouts;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_RolloutAssignment extends com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment {
    private final java.lang.String parameterKey;
    private final java.lang.String parameterValue;
    private final java.lang.String rolloutId;
    private final long templateVersion;
    private final java.lang.String variantId;

    private AutoValue_RolloutAssignment(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        this.rolloutId = str;
        this.variantId = str2;
        this.parameterKey = str3;
        this.parameterValue = str4;
        this.templateVersion = j;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public java.lang.String getRolloutId() {
        return this.rolloutId;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public java.lang.String getVariantId() {
        return this.variantId;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public java.lang.String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public java.lang.String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public long getTemplateVersion() {
        return this.templateVersion;
    }

    public java.lang.String toString() {
        return "RolloutAssignment{rolloutId=" + this.rolloutId + ", variantId=" + this.variantId + ", parameterKey=" + this.parameterKey + ", parameterValue=" + this.parameterValue + ", templateVersion=" + this.templateVersion + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment)) {
            return false;
        }
        com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment rolloutAssignment = (com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment) obj;
        return this.rolloutId.equals(rolloutAssignment.getRolloutId()) && this.variantId.equals(rolloutAssignment.getVariantId()) && this.parameterKey.equals(rolloutAssignment.getParameterKey()) && this.parameterValue.equals(rolloutAssignment.getParameterValue()) && this.templateVersion == rolloutAssignment.getTemplateVersion();
    }

    public int hashCode() {
        int iHashCode = (((((((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.variantId.hashCode()) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003;
        long j = this.templateVersion;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    static final class Builder extends com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder {
        private java.lang.String parameterKey;
        private java.lang.String parameterValue;
        private java.lang.String rolloutId;
        private byte set$0;
        private long templateVersion;
        private java.lang.String variantId;

        Builder() {
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setRolloutId(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null rolloutId");
            }
            this.rolloutId = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setVariantId(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null variantId");
            }
            this.variantId = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setParameterKey(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null parameterKey");
            }
            this.parameterKey = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setParameterValue(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null parameterValue");
            }
            this.parameterValue = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder setTemplateVersion(long j) {
            this.templateVersion = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment build() {
            if (this.set$0 != 1 || this.rolloutId == null || this.variantId == null || this.parameterKey == null || this.parameterValue == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.rolloutId == null) {
                    sb.append(" rolloutId");
                }
                if (this.variantId == null) {
                    sb.append(" variantId");
                }
                if (this.parameterKey == null) {
                    sb.append(" parameterKey");
                }
                if (this.parameterValue == null) {
                    sb.append(" parameterValue");
                }
                if ((1 & this.set$0) == 0) {
                    sb.append(" templateVersion");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment(this.rolloutId, this.variantId, this.parameterKey, this.parameterValue, this.templateVersion);
        }
    }
}
