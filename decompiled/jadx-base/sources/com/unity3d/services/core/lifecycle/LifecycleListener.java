package com.unity3d.services.core.lifecycle;

/* JADX INFO: loaded from: classes6.dex */
public class LifecycleListener implements android.app.Application.ActivityLifecycleCallbacks {
    private final com.unity3d.services.core.webview.bridge.IEventSender _eventSender;
    private final java.util.ArrayList<java.lang.String> _events;

    public LifecycleListener(java.util.ArrayList<java.lang.String> arrayList) {
        this(arrayList, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public LifecycleListener(java.util.ArrayList<java.lang.String> arrayList, com.unity3d.services.core.webview.bridge.IEventSender iEventSender) {
        this._events = arrayList;
        this._eventSender = iEventSender;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (this._events.contains("onActivityCreated") && this._eventSender.canSend()) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.LIFECYCLE, com.unity3d.services.core.lifecycle.LifecycleEvent.CREATED, activity.getClass().getName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        if (this._events.contains("onActivityStarted") && this._eventSender.canSend()) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.LIFECYCLE, com.unity3d.services.core.lifecycle.LifecycleEvent.STARTED, activity.getClass().getName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        if (this._events.contains("onActivityResumed") && this._eventSender.canSend()) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.LIFECYCLE, com.unity3d.services.core.lifecycle.LifecycleEvent.RESUMED, activity.getClass().getName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        if (this._events.contains("onActivityPaused") && this._eventSender.canSend()) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.LIFECYCLE, com.unity3d.services.core.lifecycle.LifecycleEvent.PAUSED, activity.getClass().getName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        if (this._events.contains("onActivityStopped") && this._eventSender.canSend()) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.LIFECYCLE, com.unity3d.services.core.lifecycle.LifecycleEvent.STOPPED, activity.getClass().getName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        if (this._events.contains("onActivitySaveInstanceState") && this._eventSender.canSend()) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.LIFECYCLE, com.unity3d.services.core.lifecycle.LifecycleEvent.SAVE_INSTANCE_STATE, activity.getClass().getName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (this._events.contains("onActivityDestroyed") && this._eventSender.canSend()) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.LIFECYCLE, com.unity3d.services.core.lifecycle.LifecycleEvent.DESTROYED, activity.getClass().getName());
        }
    }
}
