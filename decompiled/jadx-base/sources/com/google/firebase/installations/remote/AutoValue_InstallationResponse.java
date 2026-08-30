package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_InstallationResponse extends com.google.firebase.installations.remote.InstallationResponse {
    private final com.google.firebase.installations.remote.TokenResult authToken;
    private final java.lang.String fid;
    private final java.lang.String refreshToken;
    private final com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode;
    private final java.lang.String uri;

    private AutoValue_InstallationResponse(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.firebase.installations.remote.TokenResult tokenResult, com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode) {
        this.uri = str;
        this.fid = str2;
        this.refreshToken = str3;
        this.authToken = tokenResult;
        this.responseCode = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public java.lang.String getUri() {
        return this.uri;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public java.lang.String getFid() {
        return this.fid;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public com.google.firebase.installations.remote.TokenResult getAuthToken() {
        return this.authToken;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public com.google.firebase.installations.remote.InstallationResponse.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public java.lang.String toString() {
        return "InstallationResponse{uri=" + this.uri + ", fid=" + this.fid + ", refreshToken=" + this.refreshToken + ", authToken=" + this.authToken + ", responseCode=" + this.responseCode + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.remote.InstallationResponse)) {
            return false;
        }
        com.google.firebase.installations.remote.InstallationResponse installationResponse = (com.google.firebase.installations.remote.InstallationResponse) obj;
        java.lang.String str = this.uri;
        if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
            java.lang.String str2 = this.fid;
            if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                java.lang.String str3 = this.refreshToken;
                if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                    com.google.firebase.installations.remote.TokenResult tokenResult = this.authToken;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                        com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode = this.responseCode;
                        if (responseCode == null) {
                            if (installationResponse.getResponseCode() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.getResponseCode())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.uri;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        java.lang.String str2 = this.fid;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.refreshToken;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        com.google.firebase.installations.remote.TokenResult tokenResult = this.authToken;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode = this.responseCode;
        return iHashCode4 ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public com.google.firebase.installations.remote.InstallationResponse.Builder toBuilder() {
        return new com.google.firebase.installations.remote.AutoValue_InstallationResponse.Builder(this);
    }

    static final class Builder extends com.google.firebase.installations.remote.InstallationResponse.Builder {
        private com.google.firebase.installations.remote.TokenResult authToken;
        private java.lang.String fid;
        private java.lang.String refreshToken;
        private com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode;
        private java.lang.String uri;

        Builder() {
        }

        private Builder(com.google.firebase.installations.remote.InstallationResponse installationResponse) {
            this.uri = installationResponse.getUri();
            this.fid = installationResponse.getFid();
            this.refreshToken = installationResponse.getRefreshToken();
            this.authToken = installationResponse.getAuthToken();
            this.responseCode = installationResponse.getResponseCode();
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setUri(java.lang.String str) {
            this.uri = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setFid(java.lang.String str) {
            this.fid = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setRefreshToken(java.lang.String str) {
            this.refreshToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setAuthToken(com.google.firebase.installations.remote.TokenResult tokenResult) {
            this.authToken = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse.Builder setResponseCode(com.google.firebase.installations.remote.InstallationResponse.ResponseCode responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public com.google.firebase.installations.remote.InstallationResponse build() {
            return new com.google.firebase.installations.remote.AutoValue_InstallationResponse(this.uri, this.fid, this.refreshToken, this.authToken, this.responseCode);
        }
    }
}
