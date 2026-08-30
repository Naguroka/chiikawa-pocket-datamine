package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zac implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ android.os.Bundle zaa;
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zab;

    zac(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper, android.os.Bundle bundle) {
        this.zaa = bundle;
        this.zab = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 1;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        this.zab.zaa.onCreate(this.zaa);
    }
}
