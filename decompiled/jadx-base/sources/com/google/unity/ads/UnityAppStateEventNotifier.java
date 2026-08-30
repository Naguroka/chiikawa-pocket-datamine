package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public class UnityAppStateEventNotifier implements androidx.lifecycle.DefaultLifecycleObserver {
    private final android.app.Activity activity;
    private final com.google.unity.ads.UnityAppStateEventCallback callback;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(androidx.lifecycle.LifecycleOwner owner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(androidx.lifecycle.LifecycleOwner owner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(androidx.lifecycle.LifecycleOwner owner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(androidx.lifecycle.LifecycleOwner owner) {
    }

    public UnityAppStateEventNotifier(android.app.Activity activity, com.google.unity.ads.UnityAppStateEventCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void startListening() {
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppStateEventNotifier.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.lifecycle.ProcessLifecycleOwner.get().getLifecycle().addObserver(com.google.unity.ads.UnityAppStateEventNotifier.this);
            }
        });
    }

    public void stopListening() {
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.UnityAppStateEventNotifier.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.lifecycle.ProcessLifecycleOwner.get().getLifecycle().removeObserver(com.google.unity.ads.UnityAppStateEventNotifier.this);
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(androidx.lifecycle.LifecycleOwner owner) {
        this.callback.onAppStateChanged(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(androidx.lifecycle.LifecycleOwner owner) {
        this.callback.onAppStateChanged(true);
    }
}
