package com.unity3d.services.core.lifecycle;

/* JADX INFO: loaded from: classes6.dex */
public class CachedLifecycle {
    private static com.unity3d.services.core.lifecycle.LifecycleCache _listener;

    public static void register() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplication() == null || getLifecycleListener() != null) {
            return;
        }
        setLifecycleListener(new com.unity3d.services.core.lifecycle.LifecycleCache(new com.unity3d.services.core.configuration.ConfigurationReader()));
        com.unity3d.services.core.properties.ClientProperties.getApplication().registerActivityLifecycleCallbacks(getLifecycleListener());
    }

    public static void unregister() {
        if (com.unity3d.services.core.properties.ClientProperties.getApplication() == null || getLifecycleListener() == null) {
            return;
        }
        com.unity3d.services.core.properties.ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(getLifecycleListener());
        setLifecycleListener(null);
    }

    public static com.unity3d.services.core.lifecycle.LifecycleCache getLifecycleListener() {
        return _listener;
    }

    public static void setLifecycleListener(com.unity3d.services.core.lifecycle.LifecycleCache lifecycleCache) {
        _listener = lifecycleCache;
    }
}
