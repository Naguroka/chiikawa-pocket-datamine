package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public interface IPrivacyConfigurationListener {
    void onError(com.unity3d.services.core.configuration.PrivacyCallError privacyCallError, java.lang.String str);

    void onSuccess(com.unity3d.services.core.configuration.PrivacyConfig privacyConfig);
}
