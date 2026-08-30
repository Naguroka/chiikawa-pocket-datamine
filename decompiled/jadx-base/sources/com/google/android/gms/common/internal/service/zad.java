package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zad extends com.google.android.gms.common.internal.service.zaa {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zaa;

    public zad(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        this.zaa = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int i) throws android.os.RemoteException {
        this.zaa.setResult(new com.google.android.gms.common.api.Status(i));
    }
}
