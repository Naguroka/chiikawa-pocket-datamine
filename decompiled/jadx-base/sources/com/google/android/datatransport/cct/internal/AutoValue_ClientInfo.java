package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ClientInfo extends com.google.android.datatransport.cct.internal.ClientInfo {
    private final com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo;
    private final com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType;

    private AutoValue_ClientInfo(com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType, com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo) {
        this.clientType = clientType;
        this.androidClientInfo = androidClientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public com.google.android.datatransport.cct.internal.ClientInfo.ClientType getClientType() {
        return this.clientType;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public com.google.android.datatransport.cct.internal.AndroidClientInfo getAndroidClientInfo() {
        return this.androidClientInfo;
    }

    public java.lang.String toString() {
        return "ClientInfo{clientType=" + this.clientType + ", androidClientInfo=" + this.androidClientInfo + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.ClientInfo)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.ClientInfo clientInfo = (com.google.android.datatransport.cct.internal.ClientInfo) obj;
        com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType = this.clientType;
        if (clientType != null ? clientType.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
            com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo = this.androidClientInfo;
            if (androidClientInfo == null) {
                if (clientInfo.getAndroidClientInfo() == null) {
                    return true;
                }
            } else if (androidClientInfo.equals(clientInfo.getAndroidClientInfo())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType = this.clientType;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo = this.androidClientInfo;
        return iHashCode ^ (androidClientInfo != null ? androidClientInfo.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ClientInfo.Builder {
        private com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo;
        private com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public com.google.android.datatransport.cct.internal.ClientInfo.Builder setClientType(com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType) {
            this.clientType = clientType;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public com.google.android.datatransport.cct.internal.ClientInfo.Builder setAndroidClientInfo(com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo) {
            this.androidClientInfo = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public com.google.android.datatransport.cct.internal.ClientInfo build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_ClientInfo(this.clientType, this.androidClientInfo);
        }
    }
}
