package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public interface IInitializationNotificationCenter {
    void addListener(com.unity3d.services.core.configuration.IInitializationListener iInitializationListener);

    void removeListener(com.unity3d.services.core.configuration.IInitializationListener iInitializationListener);

    void triggerOnSdkInitializationFailed(java.lang.String str, com.unity3d.services.core.configuration.ErrorState errorState, int i);

    void triggerOnSdkInitialized();
}
