package com.unity3d.services.store.core;

/* JADX INFO: compiled from: StoreLifecycleListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/unity3d/services/store/core/StoreLifecycleListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "_purchaseTypes", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "_storeBilling", "Lcom/unity3d/services/store/gpbl/StoreBilling;", "_storeEventListener", "Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;", "(Ljava/util/ArrayList;Lcom/unity3d/services/store/gpbl/StoreBilling;Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StoreLifecycleListener implements android.app.Application.ActivityLifecycleCallbacks {
    private final java.util.ArrayList<java.lang.String> _purchaseTypes;
    private final com.unity3d.services.store.gpbl.StoreBilling _storeBilling;
    private final com.unity3d.services.store.gpbl.listeners.StoreEventListener _storeEventListener;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public StoreLifecycleListener(java.util.ArrayList<java.lang.String> _purchaseTypes, com.unity3d.services.store.gpbl.StoreBilling _storeBilling, com.unity3d.services.store.gpbl.listeners.StoreEventListener _storeEventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(_purchaseTypes, "_purchaseTypes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(_storeBilling, "_storeBilling");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(_storeEventListener, "_storeEventListener");
        this._purchaseTypes = _purchaseTypes;
        this._storeBilling = _storeBilling;
        this._storeEventListener = _storeEventListener;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            java.util.Iterator<java.lang.String> it = this._purchaseTypes.iterator();
            while (it.hasNext()) {
                this._storeBilling.getPurchases(it.next(), this._storeEventListener);
            }
        } catch (java.lang.ClassNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.warning("Couldn't fetch purchases onActivityResumed. " + e.getMessage());
        }
    }
}
