package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhp extends com.google.android.gms.internal.nearby.zzhr<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> {
    final /* synthetic */ com.google.android.gms.common.api.Status zza;

    zzhp(com.google.android.gms.internal.nearby.zzhq zzhqVar, com.google.android.gms.common.api.Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) obj;
        if (this.zza.isSuccess()) {
            resultHolder.setResult(this.zza);
        } else {
            resultHolder.setFailedResult(this.zza);
        }
    }
}
