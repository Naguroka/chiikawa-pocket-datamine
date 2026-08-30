package com.google.firebase.installations.local;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_PersistedInstallationEntry extends com.google.firebase.installations.local.PersistedInstallationEntry {
    private final java.lang.String authToken;
    private final long expiresInSecs;
    private final java.lang.String firebaseInstallationId;
    private final java.lang.String fisError;
    private final java.lang.String refreshToken;
    private final com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus;
    private final long tokenCreationEpochInSecs;

    private AutoValue_PersistedInstallationEntry(java.lang.String str, com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus, java.lang.String str2, java.lang.String str3, long j, long j2, java.lang.String str4) {
        this.firebaseInstallationId = str;
        this.registrationStatus = registrationStatus;
        this.authToken = str2;
        this.refreshToken = str3;
        this.expiresInSecs = j;
        this.tokenCreationEpochInSecs = j2;
        this.fisError = str4;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public java.lang.String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.registrationStatus;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public java.lang.String getAuthToken() {
        return this.authToken;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getExpiresInSecs() {
        return this.expiresInSecs;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getTokenCreationEpochInSecs() {
        return this.tokenCreationEpochInSecs;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public java.lang.String getFisError() {
        return this.fisError;
    }

    public java.lang.String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.firebaseInstallationId + ", registrationStatus=" + this.registrationStatus + ", authToken=" + this.authToken + ", refreshToken=" + this.refreshToken + ", expiresInSecs=" + this.expiresInSecs + ", tokenCreationEpochInSecs=" + this.tokenCreationEpochInSecs + ", fisError=" + this.fisError + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.local.PersistedInstallationEntry)) {
            return false;
        }
        com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry = (com.google.firebase.installations.local.PersistedInstallationEntry) obj;
        java.lang.String str3 = this.firebaseInstallationId;
        if (str3 != null ? str3.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
            if (this.registrationStatus.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.authToken) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.refreshToken) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.expiresInSecs == persistedInstallationEntry.getExpiresInSecs() && this.tokenCreationEpochInSecs == persistedInstallationEntry.getTokenCreationEpochInSecs()) {
                java.lang.String str4 = this.fisError;
                if (str4 == null) {
                    if (persistedInstallationEntry.getFisError() == null) {
                        return true;
                    }
                } else if (str4.equals(persistedInstallationEntry.getFisError())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.firebaseInstallationId;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.registrationStatus.hashCode()) * 1000003;
        java.lang.String str2 = this.authToken;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.refreshToken;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.expiresInSecs;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.tokenCreationEpochInSecs;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        java.lang.String str4 = this.fisError;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public com.google.firebase.installations.local.PersistedInstallationEntry.Builder toBuilder() {
        return new com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry.Builder(this);
    }

    static final class Builder extends com.google.firebase.installations.local.PersistedInstallationEntry.Builder {
        private java.lang.String authToken;
        private java.lang.Long expiresInSecs;
        private java.lang.String firebaseInstallationId;
        private java.lang.String fisError;
        private java.lang.String refreshToken;
        private com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus;
        private java.lang.Long tokenCreationEpochInSecs;

        Builder() {
        }

        private Builder(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
            this.firebaseInstallationId = persistedInstallationEntry.getFirebaseInstallationId();
            this.registrationStatus = persistedInstallationEntry.getRegistrationStatus();
            this.authToken = persistedInstallationEntry.getAuthToken();
            this.refreshToken = persistedInstallationEntry.getRefreshToken();
            this.expiresInSecs = java.lang.Long.valueOf(persistedInstallationEntry.getExpiresInSecs());
            this.tokenCreationEpochInSecs = java.lang.Long.valueOf(persistedInstallationEntry.getTokenCreationEpochInSecs());
            this.fisError = persistedInstallationEntry.getFisError();
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFirebaseInstallationId(java.lang.String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new java.lang.NullPointerException("Null registrationStatus");
            }
            this.registrationStatus = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setAuthToken(java.lang.String str) {
            this.authToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRefreshToken(java.lang.String str) {
            this.refreshToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setExpiresInSecs(long j) {
            this.expiresInSecs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j) {
            this.tokenCreationEpochInSecs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFisError(java.lang.String str) {
            this.fisError = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public com.google.firebase.installations.local.PersistedInstallationEntry build() {
            java.lang.String str = this.registrationStatus == null ? " registrationStatus" : "";
            if (this.expiresInSecs == null) {
                str = str + " expiresInSecs";
            }
            if (this.tokenCreationEpochInSecs == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry(this.firebaseInstallationId, this.registrationStatus, this.authToken, this.refreshToken, this.expiresInSecs.longValue(), this.tokenCreationEpochInSecs.longValue(), this.fisError);
        }
    }
}
