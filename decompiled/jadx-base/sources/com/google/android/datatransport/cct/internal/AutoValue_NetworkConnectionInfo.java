package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_NetworkConnectionInfo extends com.google.android.datatransport.cct.internal.NetworkConnectionInfo {
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype;
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType;

    private AutoValue_NetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType, com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.networkType = networkType;
        this.mobileSubtype = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType getNetworkType() {
        return this.networkType;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype getMobileSubtype() {
        return this.mobileSubtype;
    }

    public java.lang.String toString() {
        return "NetworkConnectionInfo{networkType=" + this.networkType + ", mobileSubtype=" + this.mobileSubtype + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.NetworkConnectionInfo)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo) obj;
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType = this.networkType;
        if (networkType != null ? networkType.equals(networkConnectionInfo.getNetworkType()) : networkConnectionInfo.getNetworkType() == null) {
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype = this.mobileSubtype;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.getMobileSubtype() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.getMobileSubtype())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType = this.networkType;
        int iHashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype = this.mobileSubtype;
        return iHashCode ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder {
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype;
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setNetworkType(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType) {
            this.networkType = networkType;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setMobileSubtype(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.mobileSubtype = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public com.google.android.datatransport.cct.internal.NetworkConnectionInfo build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo(this.networkType, this.mobileSubtype);
        }
    }
}
