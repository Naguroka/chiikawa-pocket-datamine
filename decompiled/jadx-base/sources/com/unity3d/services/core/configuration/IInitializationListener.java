package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public interface IInitializationListener {
    void onSdkInitializationFailed(java.lang.String str, com.unity3d.services.core.configuration.ErrorState errorState, int i);

    void onSdkInitialized();
}
