package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbz extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzbz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final android.os.IBinder zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        parcelZza.writeInt(i2);
        android.os.Parcel parcelZzcZ = zzcZ(2, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        parcelZzcZ.recycle();
        return strongBinder;
    }
}
