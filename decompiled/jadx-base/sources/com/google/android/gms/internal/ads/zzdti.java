package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdti extends com.google.android.gms.ads.internal.client.zzbk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdtc zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdtj zzb;

    zzdti(com.google.android.gms.internal.ads.zzdtj zzdtjVar, com.google.android.gms.internal.ads.zzdtc zzdtcVar) {
        this.zza = zzdtcVar;
        this.zzb = zzdtjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws android.os.RemoteException {
        this.zza.zzb(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws android.os.RemoteException {
        this.zza.zzc(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i) throws android.os.RemoteException {
        this.zza.zzd(this.zzb.zza, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        this.zza.zzd(this.zzb.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws android.os.RemoteException {
        this.zza.zze(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws android.os.RemoteException {
        this.zza.zzg(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
    }
}
