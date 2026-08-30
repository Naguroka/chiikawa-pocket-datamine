package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class SystemLifecycle implements android.app.Application.ActivityLifecycleCallbacks {
    private static volatile com.adjust.sdk.SystemLifecycle instance;
    private android.app.Application application = null;
    private volatile com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback callback;
    private final com.adjust.sdk.SystemLifecycle.SystemLifecycleCache callbackCache;
    public final java.util.concurrent.CopyOnWriteArrayList<java.lang.String> logMessageList;

    public static class SystemLifecycleCache implements com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback {
        public volatile java.lang.Boolean foregroundOrElseBackgroundCache = null;

        @Override // com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback
        public void onActivityLifecycle(boolean z) {
            this.foregroundOrElseBackgroundCache = java.lang.Boolean.valueOf(z);
        }
    }

    public interface SystemLifecycleCallback {
        void onActivityLifecycle(boolean z);
    }

    public SystemLifecycle() {
        com.adjust.sdk.SystemLifecycle.SystemLifecycleCache systemLifecycleCache = new com.adjust.sdk.SystemLifecycle.SystemLifecycleCache();
        this.callbackCache = systemLifecycleCache;
        this.callback = systemLifecycleCache;
        this.logMessageList = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    public static com.adjust.sdk.SystemLifecycle getSingletonInstance() {
        com.adjust.sdk.SystemLifecycle systemLifecycle = instance;
        if (systemLifecycle == null) {
            synchronized (com.adjust.sdk.SystemLifecycle.class) {
                systemLifecycle = instance;
                if (systemLifecycle == null) {
                    systemLifecycle = new com.adjust.sdk.SystemLifecycle();
                    instance = systemLifecycle;
                }
            }
        }
        return systemLifecycle;
    }

    public java.lang.Boolean foregroundOrElseBackgroundCached() {
        return this.callbackCache.foregroundOrElseBackgroundCache;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        this.callback.onActivityLifecycle(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        this.callback.onActivityLifecycle(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }

    public void overwriteCallback(com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback systemLifecycleCallback) {
        this.callback = systemLifecycleCallback;
    }

    public synchronized void registerActivityLifecycleCallbacks(android.content.Context context) {
        if (this.application != null) {
            this.logMessageList.add("Cannot register activity lifecycle callbacks more than once");
            return;
        }
        if (context == null) {
            this.logMessageList.add("Cannot register activity lifecycle callbacks without context");
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof android.app.Application)) {
            this.logMessageList.add("Cannot register activity lifecycle callbacks without application context as Application");
            return;
        }
        this.logMessageList.add("Registering activity lifecycle callbacks");
        android.app.Application application = (android.app.Application) applicationContext;
        this.application = application;
        application.registerActivityLifecycleCallbacks(this);
    }
}
