package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public interface InstallIdProvider {
    com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds getInstallIds();

    public static abstract class InstallIds {
        public abstract java.lang.String getCrashlyticsInstallId();

        public abstract java.lang.String getFirebaseAuthenticationToken();

        public abstract java.lang.String getFirebaseInstallationId();

        public static com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds createWithoutFid(java.lang.String str) {
            return new com.google.firebase.crashlytics.internal.common.AutoValue_InstallIdProvider_InstallIds(str, null, null);
        }

        static com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds create(java.lang.String str, com.google.firebase.crashlytics.internal.common.FirebaseInstallationId firebaseInstallationId) {
            return new com.google.firebase.crashlytics.internal.common.AutoValue_InstallIdProvider_InstallIds(str, firebaseInstallationId.getFid(), firebaseInstallationId.getAuthToken());
        }
    }
}
