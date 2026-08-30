package com.google.firebase.installations.local;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PersistedInstallationEntry {
    public static com.google.firebase.installations.local.PersistedInstallationEntry INSTANCE = builder().build();

    public static abstract class Builder {
        public abstract com.google.firebase.installations.local.PersistedInstallationEntry build();

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setAuthToken(java.lang.String str);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setExpiresInSecs(long j);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFirebaseInstallationId(java.lang.String str);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setFisError(java.lang.String str);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRefreshToken(java.lang.String str);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus registrationStatus);

        public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j);
    }

    public abstract java.lang.String getAuthToken();

    public abstract long getExpiresInSecs();

    public abstract java.lang.String getFirebaseInstallationId();

    public abstract java.lang.String getFisError();

    public abstract java.lang.String getRefreshToken();

    public abstract com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public abstract com.google.firebase.installations.local.PersistedInstallationEntry.Builder toBuilder();

    public boolean isRegistered() {
        return getRegistrationStatus() == com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    public boolean isErrored() {
        return getRegistrationStatus() == com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    public boolean isUnregistered() {
        return getRegistrationStatus() == com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    public boolean isNotGenerated() {
        return getRegistrationStatus() == com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED || getRegistrationStatus() == com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public boolean shouldAttemptMigration() {
        return getRegistrationStatus() == com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withUnregisteredFid(java.lang.String str) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED).build();
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withRegisteredFid(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, long j2) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTERED).setAuthToken(str3).setRefreshToken(str2).setExpiresInSecs(j2).setTokenCreationEpochInSecs(j).build();
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withFisError(java.lang.String str) {
        return toBuilder().setFisError(str).setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR).build();
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withNoGeneratedFid() {
        return toBuilder().setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED).build();
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withAuthToken(java.lang.String str, long j, long j2) {
        return toBuilder().setAuthToken(str).setExpiresInSecs(j).setTokenCreationEpochInSecs(j2).build();
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry withClearedAuthToken() {
        return toBuilder().setAuthToken(null).build();
    }

    public static com.google.firebase.installations.local.PersistedInstallationEntry.Builder builder() {
        return new com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry.Builder().setTokenCreationEpochInSecs(0L).setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).setExpiresInSecs(0L);
    }
}
