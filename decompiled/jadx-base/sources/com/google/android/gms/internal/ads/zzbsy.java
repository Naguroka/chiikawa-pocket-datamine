package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsy extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbta {
    zzbsy(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final com.google.android.gms.internal.ads.zzbsx zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbsx zzbsvVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbsvVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbsvVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbsx ? (com.google.android.gms.internal.ads.zzbsx) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbsv(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbsvVar;
    }
}
