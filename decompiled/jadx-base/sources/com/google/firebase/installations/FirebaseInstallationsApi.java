package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
public interface FirebaseInstallationsApi {
    com.google.android.gms.tasks.Task<java.lang.Void> delete();

    com.google.android.gms.tasks.Task<java.lang.String> getId();

    com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> getToken(boolean z);

    com.google.firebase.installations.internal.FidListenerHandle registerFidListener(com.google.firebase.installations.internal.FidListener fidListener);
}
