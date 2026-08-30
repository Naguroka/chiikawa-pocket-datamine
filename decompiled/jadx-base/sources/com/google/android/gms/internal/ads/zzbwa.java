package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbwa extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbwc {
    zzbwa(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zze(com.google.android.gms.internal.ads.zzbvw zzbvwVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbvwVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzf() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzg(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzh() throws android.os.RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzi() throws android.os.RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzj() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzk() throws android.os.RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwc
    public final void zzl() throws android.os.RemoteException {
        zzda(3, zza());
    }
}
