package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbax extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzbax(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(com.google.android.gms.internal.ads.zzbav zzbavVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbavVar);
        android.os.Parcel parcelZzcZ = zzcZ(3, parcelZza);
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    public final com.google.android.gms.internal.ads.zzbas zzf(com.google.android.gms.internal.ads.zzbav zzbavVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbavVar);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
        com.google.android.gms.internal.ads.zzbas zzbasVar = (com.google.android.gms.internal.ads.zzbas) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.internal.ads.zzbas.CREATOR);
        parcelZzcZ.recycle();
        return zzbasVar;
    }

    public final com.google.android.gms.internal.ads.zzbas zzg(com.google.android.gms.internal.ads.zzbav zzbavVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbavVar);
        android.os.Parcel parcelZzcZ = zzcZ(2, parcelZza);
        com.google.android.gms.internal.ads.zzbas zzbasVar = (com.google.android.gms.internal.ads.zzbas) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.internal.ads.zzbas.CREATOR);
        parcelZzcZ.recycle();
        return zzbasVar;
    }
}
