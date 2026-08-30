package com.unity3d.services.core.lifecycle;

/* JADX INFO: loaded from: classes6.dex */
public class LifecycleCache implements android.app.Application.ActivityLifecycleCallbacks, androidx.lifecycle.LifecycleEventObserver {
    private boolean _newLifecycle;
    private com.unity3d.services.core.lifecycle.LifecycleEvent _currentState = com.unity3d.services.core.lifecycle.LifecycleEvent.RESUMED;
    private boolean _appActive = true;
    private boolean _lifecycleAppActive = true;
    private int _numStarted = 0;
    private final java.util.Set<com.unity3d.services.core.lifecycle.IAppActiveListener> _appActiveListeners = new java.util.HashSet();
    private final java.util.Set<com.unity3d.services.core.lifecycle.IAppEventListener> _appStateListeners = new java.util.HashSet();

    LifecycleCache(com.unity3d.services.core.configuration.ConfigurationReader configurationReader) {
        this._newLifecycle = false;
        this._newLifecycle = configurationReader.getCurrentConfiguration().getExperiments().isJetpackLifecycle();
        startProcessLifecycleObserving();
    }

    private void startProcessLifecycleObserving() {
        com.unity3d.scar.adapter.common.Utils.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.lifecycle.LifecycleCache.1
            @Override // java.lang.Runnable
            public void run() {
                com.unity3d.services.core.lifecycle.LifecycleCache.this.registerLifecycleObserver();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerLifecycleObserver() {
        androidx.lifecycle.ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this._currentState = com.unity3d.services.core.lifecycle.LifecycleEvent.CREATED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        this._currentState = com.unity3d.services.core.lifecycle.LifecycleEvent.STARTED;
        if (this._numStarted == 0) {
            this._appActive = true;
            if (!this._newLifecycle) {
                notifyActiveListeners();
            }
        }
        this._numStarted++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        this._currentState = com.unity3d.services.core.lifecycle.LifecycleEvent.RESUMED;
        notifyStateListeners(com.unity3d.services.core.lifecycle.LifecycleEvent.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        this._currentState = com.unity3d.services.core.lifecycle.LifecycleEvent.PAUSED;
        notifyStateListeners(com.unity3d.services.core.lifecycle.LifecycleEvent.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        this._currentState = com.unity3d.services.core.lifecycle.LifecycleEvent.STOPPED;
        int i = this._numStarted - 1;
        this._numStarted = i;
        if (i <= 0) {
            this._numStarted = 0;
            this._appActive = false;
            if (this._newLifecycle) {
                return;
            }
            notifyActiveListeners();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        this._currentState = com.unity3d.services.core.lifecycle.LifecycleEvent.SAVE_INSTANCE_STATE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        this._currentState = com.unity3d.services.core.lifecycle.LifecycleEvent.DESTROYED;
    }

    public com.unity3d.services.core.lifecycle.LifecycleEvent getCurrentState() {
        return this._currentState;
    }

    public boolean isAppActive() {
        return this._newLifecycle ? this._lifecycleAppActive : this._appActive;
    }

    public synchronized void notifyStateListeners(com.unity3d.services.core.lifecycle.LifecycleEvent lifecycleEvent) {
        java.util.Iterator<com.unity3d.services.core.lifecycle.IAppEventListener> it = this._appStateListeners.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleEvent(lifecycleEvent);
        }
    }

    public synchronized void notifyActiveListeners() {
        java.util.Iterator<com.unity3d.services.core.lifecycle.IAppActiveListener> it = this._appActiveListeners.iterator();
        while (it.hasNext()) {
            it.next().onAppStateChanged(this._appActive);
        }
    }

    public synchronized void addActiveListener(com.unity3d.services.core.lifecycle.IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.add(iAppActiveListener);
    }

    public synchronized void removeActiveListener(com.unity3d.services.core.lifecycle.IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.remove(iAppActiveListener);
    }

    public synchronized void addStateListener(com.unity3d.services.core.lifecycle.IAppEventListener iAppEventListener) {
        this._appStateListeners.add(iAppEventListener);
    }

    public synchronized void removeStateListener(com.unity3d.services.core.lifecycle.IAppEventListener iAppEventListener) {
        this._appStateListeners.remove(iAppEventListener);
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.lifecycle.LifecycleCache$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$Event = iArr;
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$Event[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        int i = com.unity3d.services.core.lifecycle.LifecycleCache.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$Event[event.ordinal()];
        if (i == 1) {
            this._lifecycleAppActive = false;
            if (this._newLifecycle) {
                notifyActiveListeners();
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        this._lifecycleAppActive = true;
        if (this._newLifecycle) {
            notifyActiveListeners();
        }
    }
}
