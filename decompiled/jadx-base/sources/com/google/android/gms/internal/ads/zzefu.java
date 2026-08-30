package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzefu extends com.google.android.gms.internal.ads.zzbqw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzefw zza;
    private final com.google.android.gms.internal.ads.zzecz zzb;

    /* synthetic */ zzefu(com.google.android.gms.internal.ads.zzefw zzefwVar, com.google.android.gms.internal.ads.zzecz zzeczVar, com.google.android.gms.internal.ads.zzefv zzefvVar) {
        this.zza = zzefwVar;
        this.zzb = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zze(java.lang.String str) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzees) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzees) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzg(com.google.android.gms.internal.ads.zzbpt zzbptVar) throws android.os.RemoteException {
        this.zza.zzc = zzbptVar;
        ((com.google.android.gms.internal.ads.zzees) this.zzb.zzc).zzo();
    }
}
