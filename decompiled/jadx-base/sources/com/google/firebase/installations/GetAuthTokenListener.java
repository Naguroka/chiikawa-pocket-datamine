package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
class GetAuthTokenListener implements com.google.firebase.installations.StateListener {
    private final com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.installations.InstallationTokenResult> resultTaskCompletionSource;
    private final com.google.firebase.installations.Utils utils;

    public GetAuthTokenListener(com.google.firebase.installations.Utils utils, com.google.android.gms.tasks.TaskCompletionSource<com.google.firebase.installations.InstallationTokenResult> taskCompletionSource) {
        this.utils = utils;
        this.resultTaskCompletionSource = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.utils.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.resultTaskCompletionSource.setResult(com.google.firebase.installations.InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(java.lang.Exception exc) {
        this.resultTaskCompletionSource.trySetException(exc);
        return true;
    }
}
