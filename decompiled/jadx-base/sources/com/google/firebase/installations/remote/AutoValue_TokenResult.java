package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_TokenResult extends com.google.firebase.installations.remote.TokenResult {
    private final com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode;
    private final java.lang.String token;
    private final long tokenExpirationTimestamp;

    private AutoValue_TokenResult(java.lang.String str, long j, com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.responseCode = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public java.lang.String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public com.google.firebase.installations.remote.TokenResult.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public java.lang.String toString() {
        return "TokenResult{token=" + this.token + ", tokenExpirationTimestamp=" + this.tokenExpirationTimestamp + ", responseCode=" + this.responseCode + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.remote.TokenResult)) {
            return false;
        }
        com.google.firebase.installations.remote.TokenResult tokenResult = (com.google.firebase.installations.remote.TokenResult) obj;
        java.lang.String str = this.token;
        if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
            if (this.tokenExpirationTimestamp == tokenResult.getTokenExpirationTimestamp()) {
                com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode = this.responseCode;
                if (responseCode == null) {
                    if (tokenResult.getResponseCode() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.getResponseCode())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.token;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.tokenExpirationTimestamp;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode = this.responseCode;
        return i ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public com.google.firebase.installations.remote.TokenResult.Builder toBuilder() {
        return new com.google.firebase.installations.remote.AutoValue_TokenResult.Builder(this);
    }

    static final class Builder extends com.google.firebase.installations.remote.TokenResult.Builder {
        private com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode;
        private java.lang.String token;
        private java.lang.Long tokenExpirationTimestamp;

        Builder() {
        }

        private Builder(com.google.firebase.installations.remote.TokenResult tokenResult) {
            this.token = tokenResult.getToken();
            this.tokenExpirationTimestamp = java.lang.Long.valueOf(tokenResult.getTokenExpirationTimestamp());
            this.responseCode = tokenResult.getResponseCode();
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public com.google.firebase.installations.remote.TokenResult.Builder setToken(java.lang.String str) {
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public com.google.firebase.installations.remote.TokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public com.google.firebase.installations.remote.TokenResult.Builder setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public com.google.firebase.installations.remote.TokenResult build() {
            java.lang.String str = this.tokenExpirationTimestamp == null ? " tokenExpirationTimestamp" : "";
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.firebase.installations.remote.AutoValue_TokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.responseCode);
        }
    }
}
