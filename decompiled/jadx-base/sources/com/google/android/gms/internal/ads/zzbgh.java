package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbgh extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbgj {
    zzbgh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final android.os.IBinder zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper2);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper3);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        parcelZzcZ.recycle();
        return strongBinder;
    }
}
