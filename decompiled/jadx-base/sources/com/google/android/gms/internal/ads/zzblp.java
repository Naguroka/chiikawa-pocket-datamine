package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzblp extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzblr {
    zzblp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zze(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzf() throws android.os.RemoteException {
        zzda(2, zza());
    }
}
