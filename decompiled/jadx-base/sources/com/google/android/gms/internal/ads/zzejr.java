package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzejr extends com.google.android.gms.ads.internal.client.zzbq {
    private final com.google.android.gms.internal.ads.zzeky zza;

    public zzejr(android.content.Context context, com.google.android.gms.internal.ads.zzcgx zzcgxVar, com.google.android.gms.internal.ads.zzfch zzfchVar, com.google.android.gms.internal.ads.zzdiq zzdiqVar, com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        com.google.android.gms.internal.ads.zzela zzelaVar = new com.google.android.gms.internal.ads.zzela(zzdiqVar, zzcgxVar.zzj());
        zzelaVar.zze(zzblVar);
        this.zza = new com.google.android.gms.internal.ads.zzeky(new com.google.android.gms.internal.ads.zzelk(zzcgxVar, context, zzelaVar, zzfchVar), zzfchVar.zzL());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized java.lang.String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized java.lang.String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        this.zza.zzd(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws android.os.RemoteException {
        this.zza.zzd(zzmVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized boolean zzi() throws android.os.RemoteException {
        return this.zza.zze();
    }
}
