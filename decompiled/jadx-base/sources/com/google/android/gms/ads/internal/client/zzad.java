package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzad extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.app.Activity zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzb;

    zzad(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.app.Activity activity) {
        this.zza = activity;
        this.zzb = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzba.zzv(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        return zzcpVar.zzn(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbcl.zza(this.zza);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkA)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzba zzbaVar = this.zzb;
            return zzbaVar.zze.zza(this.zza);
        }
        try {
            return com.google.android.gms.internal.ads.zzbtd.zzI(((com.google.android.gms.internal.ads.zzbth) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzac
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzbtg.zzb((android.os.IBinder) obj);
                }
            })).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza)));
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            this.zzb.zzg = com.google.android.gms.internal.ads.zzbuh.zza(this.zza.getApplicationContext());
            this.zzb.zzg.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
