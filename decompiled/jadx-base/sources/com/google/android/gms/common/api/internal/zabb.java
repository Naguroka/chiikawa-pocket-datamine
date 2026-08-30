package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabb extends com.google.android.gms.common.api.internal.zabu {
    private final java.lang.ref.WeakReference zaa;

    zabb(com.google.android.gms.common.api.internal.zabc zabcVar) {
        this.zaa = new java.lang.ref.WeakReference(zabcVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zaa() {
        com.google.android.gms.common.api.internal.zabc zabcVar = (com.google.android.gms.common.api.internal.zabc) this.zaa.get();
        if (zabcVar == null) {
            return;
        }
        com.google.android.gms.common.api.internal.zabc.zai(zabcVar);
    }
}
