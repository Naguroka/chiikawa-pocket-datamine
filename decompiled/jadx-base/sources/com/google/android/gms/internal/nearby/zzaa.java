package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaa extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.ConnectionLifecycleCallback> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzew zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(com.google.android.gms.internal.nearby.zzag zzagVar, com.google.android.gms.internal.nearby.zzew zzewVar) {
        super(null);
        this.zza = zzewVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        java.lang.String strZza = this.zza.zza();
        com.google.android.gms.nearby.connection.zzi zziVar = new com.google.android.gms.nearby.connection.zzi();
        zziVar.zza(this.zza.zzb());
        zziVar.zzb(this.zza.zzc());
        zziVar.zzc(this.zza.zze());
        zziVar.zzd(this.zza.zzd());
        zziVar.zze(this.zza.zzf());
        zziVar.zzf(this.zza.zzg());
        ((com.google.android.gms.nearby.connection.ConnectionLifecycleCallback) obj).onConnectionInitiated(strZza, zziVar.zzg());
    }
}
