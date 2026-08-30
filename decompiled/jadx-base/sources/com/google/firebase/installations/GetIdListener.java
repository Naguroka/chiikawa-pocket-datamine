package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
class GetIdListener implements com.google.firebase.installations.StateListener {
    final com.google.android.gms.tasks.TaskCompletionSource<java.lang.String> taskCompletionSource;

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(java.lang.Exception exc) {
        return false;
    }

    public GetIdListener(com.google.android.gms.tasks.TaskCompletionSource<java.lang.String> taskCompletionSource) {
        this.taskCompletionSource = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.taskCompletionSource.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
