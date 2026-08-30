package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbls extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzblu {
    zzbls(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzb(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzda(1, parcelZza);
    }
}
