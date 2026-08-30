package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbj extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzbl {
    zzbj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws android.os.RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws android.os.RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzeVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() throws android.os.RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() throws android.os.RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws android.os.RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() throws android.os.RemoteException {
        zzda(9, zza());
    }
}
