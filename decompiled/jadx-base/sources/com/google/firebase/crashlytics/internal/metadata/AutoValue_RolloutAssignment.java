package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_RolloutAssignment extends com.google.firebase.crashlytics.internal.metadata.RolloutAssignment {
    private final java.lang.String parameterKey;
    private final java.lang.String parameterValue;
    private final java.lang.String rolloutId;
    private final long templateVersion;
    private final java.lang.String variantId;

    AutoValue_RolloutAssignment(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null rolloutId");
        }
        this.rolloutId = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null parameterKey");
        }
        this.parameterKey = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null parameterValue");
        }
        this.parameterValue = str3;
        if (str4 == null) {
            throw new java.lang.NullPointerException("Null variantId");
        }
        this.variantId = str4;
        this.templateVersion = j;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public java.lang.String getRolloutId() {
        return this.rolloutId;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public java.lang.String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public java.lang.String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public java.lang.String getVariantId() {
        return this.variantId;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public long getTemplateVersion() {
        return this.templateVersion;
    }

    public java.lang.String toString() {
        return "RolloutAssignment{rolloutId=" + this.rolloutId + ", parameterKey=" + this.parameterKey + ", parameterValue=" + this.parameterValue + ", variantId=" + this.variantId + ", templateVersion=" + this.templateVersion + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.metadata.RolloutAssignment)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.metadata.RolloutAssignment rolloutAssignment = (com.google.firebase.crashlytics.internal.metadata.RolloutAssignment) obj;
        return this.rolloutId.equals(rolloutAssignment.getRolloutId()) && this.parameterKey.equals(rolloutAssignment.getParameterKey()) && this.parameterValue.equals(rolloutAssignment.getParameterValue()) && this.variantId.equals(rolloutAssignment.getVariantId()) && this.templateVersion == rolloutAssignment.getTemplateVersion();
    }

    public int hashCode() {
        int iHashCode = (((((((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003) ^ this.variantId.hashCode()) * 1000003;
        long j = this.templateVersion;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }
}
