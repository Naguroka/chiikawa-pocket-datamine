package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaf implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zaa;

    zaf(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 4;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        this.zaa.zaa.onStart();
    }
}
