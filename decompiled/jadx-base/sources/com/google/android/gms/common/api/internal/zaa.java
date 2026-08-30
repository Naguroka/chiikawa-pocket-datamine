package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaa extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private java.util.List zaa;

    private zaa(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zaa = new java.util.ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zaa zaa(android.app.Activity activity) {
        com.google.android.gms.common.api.internal.zaa zaaVar;
        synchronized (activity) {
            com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
            zaaVar = (com.google.android.gms.common.api.internal.zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", com.google.android.gms.common.api.internal.zaa.class);
            if (zaaVar == null) {
                zaaVar = new com.google.android.gms.common.api.internal.zaa(fragment);
            }
        }
        return zaaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zac(java.lang.Runnable runnable) {
        this.zaa.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        java.util.List list;
        synchronized (this) {
            list = this.zaa;
            this.zaa = new java.util.ArrayList();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }
}
