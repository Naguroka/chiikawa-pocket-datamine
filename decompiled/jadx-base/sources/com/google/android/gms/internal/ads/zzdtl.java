package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdtl extends com.google.android.gms.internal.ads.zzbwv {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdtn zza;

    zzdtl(com.google.android.gms.internal.ads.zzdtn zzdtnVar) {
        this.zza = zzdtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzm(zzdtnVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzm(zzdtnVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzp(zzdtnVar.zza);
    }
}
