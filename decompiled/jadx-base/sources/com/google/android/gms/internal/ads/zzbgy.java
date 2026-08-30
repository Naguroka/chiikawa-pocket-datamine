package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbgy extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbha {
    zzbgy(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(com.google.android.gms.internal.ads.zzbgq zzbgqVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbgqVar);
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}
