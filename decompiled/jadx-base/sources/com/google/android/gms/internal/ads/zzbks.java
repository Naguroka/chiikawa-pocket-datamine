package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbks extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbku {
    zzbks(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbku
    public final com.google.android.gms.internal.ads.zzbkr zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i, com.google.android.gms.internal.ads.zzbko zzbkoVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbkr zzbkpVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbkoVar);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbkpVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbkpVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbkr ? (com.google.android.gms.internal.ads.zzbkr) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbkp(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbkpVar;
    }
}
