package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaa implements com.google.android.gms.dynamic.OnDelegateCreatedListener {
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zaa;

    zaa(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        this.zaa.zaa = lifecycleDelegate;
        java.util.Iterator it = this.zaa.zac.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.dynamic.zah) it.next()).zab(this.zaa.zaa);
        }
        this.zaa.zac.clear();
        this.zaa.zab = null;
    }
}
