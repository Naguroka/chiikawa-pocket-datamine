package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbae extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbag {
    zzbae(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzb(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzd(com.google.android.gms.internal.ads.zzbad zzbadVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbadVar);
        zzda(1, parcelZza);
    }
}
