package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public interface IConfigurationLoader {
    com.unity3d.services.core.configuration.Configuration getLocalConfiguration();

    void loadConfiguration(com.unity3d.services.core.configuration.IConfigurationLoaderListener iConfigurationLoaderListener) throws java.lang.Exception;
}
