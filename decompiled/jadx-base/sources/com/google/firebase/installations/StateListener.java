package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
interface StateListener {
    boolean onException(java.lang.Exception exc);

    boolean onStateReached(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry);
}
