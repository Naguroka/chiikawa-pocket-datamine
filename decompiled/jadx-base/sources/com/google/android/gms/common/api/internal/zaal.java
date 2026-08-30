package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaal extends com.google.android.gms.common.api.internal.zabe {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaan zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaal(com.google.android.gms.common.api.internal.zaan zaanVar, com.google.android.gms.common.api.internal.zabd zabdVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        super(zabdVar);
        this.zaa = connectionResult;
        this.zab = zaanVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabe
    public final void zaa() {
        this.zab.zaa.zaD(this.zaa);
    }
}
