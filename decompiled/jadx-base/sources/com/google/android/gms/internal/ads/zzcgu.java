package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcgu extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzcgw {
    zzcgu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzcgt zzcgtVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzcgtVar);
        zzda(2, parcelZza);
    }
}
