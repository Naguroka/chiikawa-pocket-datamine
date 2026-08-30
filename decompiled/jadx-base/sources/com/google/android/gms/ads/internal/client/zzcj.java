package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcj extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzcj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
    }

    public final android.os.IBinder zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        parcelZzcZ.recycle();
        return strongBinder;
    }
}
