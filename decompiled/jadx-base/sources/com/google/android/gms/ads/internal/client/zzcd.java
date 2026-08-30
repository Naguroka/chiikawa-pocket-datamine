package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcd extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzcf {
    zzcd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(com.google.android.gms.ads.internal.client.zzft zzftVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzftVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(com.google.android.gms.ads.internal.client.zzft zzftVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzftVar);
        zzda(2, parcelZza);
    }
}
