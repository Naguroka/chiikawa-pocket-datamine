package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class ReflectiveGenericLifecycleObserver implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.ClassesInfoCache.CallbackInfo mInfo;
    private final java.lang.Object mWrapped;

    ReflectiveGenericLifecycleObserver(java.lang.Object obj) {
        this.mWrapped = obj;
        this.mInfo = androidx.lifecycle.ClassesInfoCache.sInstance.getInfo(obj.getClass());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        this.mInfo.invokeCallbacks(lifecycleOwner, event, this.mWrapped);
    }
}
