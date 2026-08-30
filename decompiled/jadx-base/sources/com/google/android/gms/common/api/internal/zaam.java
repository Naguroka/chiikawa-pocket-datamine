package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaam extends com.google.android.gms.common.api.internal.zabe {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaam(com.google.android.gms.common.api.internal.zaan zaanVar, com.google.android.gms.common.api.internal.zabd zabdVar, com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabdVar);
        this.zaa = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.zabe
    public final void zaa() {
        this.zaa.onReportServiceBinding(new com.google.android.gms.common.ConnectionResult(16, null));
    }
}
