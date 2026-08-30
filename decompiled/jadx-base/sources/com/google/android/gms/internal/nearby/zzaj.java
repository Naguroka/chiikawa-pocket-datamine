package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaj extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaj(com.google.android.gms.internal.nearby.zzak zzakVar, com.google.android.gms.internal.nearby.zzfa zzfaVar) {
        super(null);
        this.zza = zzfaVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback) obj).onConnectionResponse(this.zza.zza(), com.google.android.gms.internal.nearby.zzbf.zzG(this.zza.zzb()), this.zza.zzc());
    }
}
