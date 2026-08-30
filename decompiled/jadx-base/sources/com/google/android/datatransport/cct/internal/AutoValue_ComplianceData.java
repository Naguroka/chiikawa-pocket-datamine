package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ComplianceData extends com.google.android.datatransport.cct.internal.ComplianceData {
    private final com.google.android.datatransport.cct.internal.ExternalPrivacyContext privacyContext;
    private final com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin;

    private AutoValue_ComplianceData(com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext, com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin) {
        this.privacyContext = externalPrivacyContext;
        this.productIdOrigin = productIdOrigin;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public com.google.android.datatransport.cct.internal.ExternalPrivacyContext getPrivacyContext() {
        return this.privacyContext;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin getProductIdOrigin() {
        return this.productIdOrigin;
    }

    public java.lang.String toString() {
        return "ComplianceData{privacyContext=" + this.privacyContext + ", productIdOrigin=" + this.productIdOrigin + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.ComplianceData)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.ComplianceData complianceData = (com.google.android.datatransport.cct.internal.ComplianceData) obj;
        com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext = this.privacyContext;
        if (externalPrivacyContext != null ? externalPrivacyContext.equals(complianceData.getPrivacyContext()) : complianceData.getPrivacyContext() == null) {
            com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin = this.productIdOrigin;
            if (productIdOrigin == null) {
                if (complianceData.getProductIdOrigin() == null) {
                    return true;
                }
            } else if (productIdOrigin.equals(complianceData.getProductIdOrigin())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext = this.privacyContext;
        int iHashCode = ((externalPrivacyContext == null ? 0 : externalPrivacyContext.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin = this.productIdOrigin;
        return iHashCode ^ (productIdOrigin != null ? productIdOrigin.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ComplianceData.Builder {
        private com.google.android.datatransport.cct.internal.ExternalPrivacyContext privacyContext;
        private com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public com.google.android.datatransport.cct.internal.ComplianceData.Builder setPrivacyContext(com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext) {
            this.privacyContext = externalPrivacyContext;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public com.google.android.datatransport.cct.internal.ComplianceData.Builder setProductIdOrigin(com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin) {
            this.productIdOrigin = productIdOrigin;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public com.google.android.datatransport.cct.internal.ComplianceData build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_ComplianceData(this.privacyContext, this.productIdOrigin);
        }
    }
}
