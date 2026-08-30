package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzad extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzeu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzad(com.google.android.gms.internal.nearby.zzag zzagVar, com.google.android.gms.internal.nearby.zzeu zzeuVar) {
        super(null);
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        java.lang.String strZza = this.zza.zza();
        com.google.android.gms.nearby.connection.zzf zzfVar = new com.google.android.gms.nearby.connection.zzf();
        zzfVar.zza(this.zza.zzb());
        zzfVar.zzb(this.zza.zzc());
        ((com.google.android.gms.nearby.connection.ConnectionLifecycleCallback) obj).zza(strZza, zzfVar.zzc());
    }
}
