package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbai extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbak {
    zzbai(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzb() throws android.os.RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzc() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zze() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzf() throws android.os.RemoteException {
        zzda(1, zza());
    }
}
