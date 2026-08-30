package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbff extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzbff(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(com.google.android.gms.internal.ads.zzbuo zzbuoVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbuoVar);
        zzda(1, parcelZza);
    }
}
