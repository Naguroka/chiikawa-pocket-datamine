package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbkp extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbkr {
    zzbkp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    public final void zze() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    public final void zzf(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}
