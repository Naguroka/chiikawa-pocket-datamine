package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbwq extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbws {
    zzbwq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zze() throws android.os.RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzf() throws android.os.RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzg() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzh(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzeVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzj() throws android.os.RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzk(com.google.android.gms.internal.ads.zzbwm zzbwmVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbwmVar);
        zzda(3, parcelZza);
    }
}
