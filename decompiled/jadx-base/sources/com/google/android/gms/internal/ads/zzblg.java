package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzblg extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzblg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(com.google.android.gms.internal.ads.zzbla zzblaVar, com.google.android.gms.internal.ads.zzblf zzblfVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzblaVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzblfVar);
        zzdb(2, parcelZza);
    }
}
