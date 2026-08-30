package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzal extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.EndpointDiscoveryCallback> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(com.google.android.gms.internal.nearby.zzap zzapVar, com.google.android.gms.internal.nearby.zzfg zzfgVar) {
        super(null);
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        this.zza.zza();
        this.zza.zzb();
        this.zza.zzc();
    }
}
