package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzay extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.PayloadCallback> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzay(com.google.android.gms.internal.nearby.zzbb zzbbVar, com.google.android.gms.internal.nearby.zzfo zzfoVar) {
        super(null);
        this.zza = zzfoVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.connection.PayloadCallback) obj).onPayloadTransferUpdate(this.zza.zza(), this.zza.zzb());
    }
}
