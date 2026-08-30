package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_InstallationTokenResult extends com.google.firebase.installations.InstallationTokenResult {
    private final java.lang.String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    private AutoValue_InstallationTokenResult(java.lang.String str, long j, long j2) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.tokenCreationTimestamp = j2;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public java.lang.String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    public java.lang.String toString() {
        return "InstallationTokenResult{token=" + this.token + ", tokenExpirationTimestamp=" + this.tokenExpirationTimestamp + ", tokenCreationTimestamp=" + this.tokenCreationTimestamp + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.InstallationTokenResult)) {
            return false;
        }
        com.google.firebase.installations.InstallationTokenResult installationTokenResult = (com.google.firebase.installations.InstallationTokenResult) obj;
        return this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp();
    }

    public int hashCode() {
        int iHashCode = (this.token.hashCode() ^ 1000003) * 1000003;
        long j = this.tokenExpirationTimestamp;
        long j2 = this.tokenCreationTimestamp;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public com.google.firebase.installations.InstallationTokenResult.Builder toBuilder() {
        return new com.google.firebase.installations.AutoValue_InstallationTokenResult.Builder(this);
    }

    static final class Builder extends com.google.firebase.installations.InstallationTokenResult.Builder {
        private java.lang.String token;
        private java.lang.Long tokenCreationTimestamp;
        private java.lang.Long tokenExpirationTimestamp;

        Builder() {
        }

        private Builder(com.google.firebase.installations.InstallationTokenResult installationTokenResult) {
            this.token = installationTokenResult.getToken();
            this.tokenExpirationTimestamp = java.lang.Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.tokenCreationTimestamp = java.lang.Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public com.google.firebase.installations.InstallationTokenResult.Builder setToken(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null token");
            }
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public com.google.firebase.installations.InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public com.google.firebase.installations.InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
            this.tokenCreationTimestamp = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public com.google.firebase.installations.InstallationTokenResult build() {
            java.lang.String str = this.token == null ? " token" : "";
            if (this.tokenExpirationTimestamp == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.tokenCreationTimestamp == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.firebase.installations.AutoValue_InstallationTokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.tokenCreationTimestamp.longValue());
        }
    }
}
