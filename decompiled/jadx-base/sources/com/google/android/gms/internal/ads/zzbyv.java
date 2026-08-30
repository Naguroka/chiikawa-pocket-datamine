package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbyv extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbyx {
    zzbyv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final com.google.android.gms.internal.ads.zzbyu zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbyu zzbysVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(2, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbysVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbysVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbyu ? (com.google.android.gms.internal.ads.zzbyu) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbys(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbysVar;
    }
}
