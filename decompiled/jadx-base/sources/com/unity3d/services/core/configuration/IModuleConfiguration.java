package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public interface IModuleConfiguration {
    java.lang.Class[] getWebAppApiClassList();

    boolean initCompleteState(com.unity3d.services.core.configuration.Configuration configuration);

    boolean initErrorState(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.configuration.ErrorState errorState, java.lang.String str);

    boolean resetState(com.unity3d.services.core.configuration.Configuration configuration);
}
