package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zab implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ android.app.Activity zaa;
    final /* synthetic */ android.os.Bundle zab;
    final /* synthetic */ android.os.Bundle zac;
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zad;

    zab(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper, android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.zaa = activity;
        this.zab = bundle;
        this.zac = bundle2;
        this.zad = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        this.zad.zaa.onInflate(this.zaa, this.zab, this.zac);
    }
}
