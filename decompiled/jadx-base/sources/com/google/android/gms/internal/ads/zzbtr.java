package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbtr extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbtt {
    zzbtr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zze(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzda(1, parcelZza);
    }
}
