package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ExternalPRequestContext extends com.google.android.datatransport.cct.internal.ExternalPRequestContext {
    private final java.lang.Integer originAssociatedProductId;

    private AutoValue_ExternalPRequestContext(java.lang.Integer num) {
        this.originAssociatedProductId = num;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    public java.lang.Integer getOriginAssociatedProductId() {
        return this.originAssociatedProductId;
    }

    public java.lang.String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.originAssociatedProductId + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.ExternalPRequestContext)) {
            return false;
        }
        java.lang.Integer num = this.originAssociatedProductId;
        java.lang.Integer originAssociatedProductId = ((com.google.android.datatransport.cct.internal.ExternalPRequestContext) obj).getOriginAssociatedProductId();
        if (num == null) {
            return originAssociatedProductId == null;
        }
        return num.equals(originAssociatedProductId);
    }

    public int hashCode() {
        java.lang.Integer num = this.originAssociatedProductId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder {
        private java.lang.Integer originAssociatedProductId;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder setOriginAssociatedProductId(java.lang.Integer num) {
            this.originAssociatedProductId = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public com.google.android.datatransport.cct.internal.ExternalPRequestContext build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext(this.originAssociatedProductId);
        }
    }
}
