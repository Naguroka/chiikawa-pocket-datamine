package com.applovin.mediation.unity;

/* JADX INFO: loaded from: classes3.dex */
public class MaxUnityApplicationStateChangeTracker {
    private final java.util.concurrent.atomic.AtomicBoolean applicationPaused = new java.util.concurrent.atomic.AtomicBoolean();
    private final com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback callback;

    public interface MaxUnityApplicationStateCallback {
        void onApplicationStateChanged(boolean z);
    }

    protected MaxUnityApplicationStateChangeTracker(com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback maxUnityApplicationStateCallback) {
        this.callback = maxUnityApplicationStateCallback;
        android.app.Application application = com.applovin.mediation.unity.Utils.getCurrentActivity().getApplication();
        application.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() { // from class: com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(android.app.Activity activity) {
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

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(android.app.Activity activity) {
                com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.this.notifyApplicationResumedIfNeeded();
            }
        });
        application.registerComponentCallbacks(new android.content.ComponentCallbacks2() { // from class: com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.2
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(android.content.res.Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
                if (i == 20) {
                    com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.this.notifyApplicationPausedIfNeeded();
                }
            }
        });
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new android.content.BroadcastReceiver() { // from class: com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                java.lang.String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (com.applovin.mediation.unity.Utils.isCurrentProcessInForeground()) {
                        com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.this.notifyApplicationResumedIfNeeded();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.this.notifyApplicationPausedIfNeeded();
                }
            }
        }, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyApplicationResumedIfNeeded() {
        if (this.applicationPaused.compareAndSet(true, false)) {
            this.callback.onApplicationStateChanged(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyApplicationPausedIfNeeded() {
        if (this.applicationPaused.compareAndSet(false, true)) {
            this.callback.onApplicationStateChanged(true);
        }
    }
}
