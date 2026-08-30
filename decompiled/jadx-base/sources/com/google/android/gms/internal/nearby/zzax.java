package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzax extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.PayloadCallback> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfm zza;
    final /* synthetic */ com.google.android.gms.nearby.connection.Payload zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(com.google.android.gms.internal.nearby.zzbb zzbbVar, com.google.android.gms.internal.nearby.zzfm zzfmVar, com.google.android.gms.nearby.connection.Payload payload) {
        super(null);
        this.zza = zzfmVar;
        this.zzb = payload;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.connection.PayloadCallback) obj).onPayloadReceived(this.zza.zza(), this.zzb);
    }
}
