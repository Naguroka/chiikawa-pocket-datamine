package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbgs extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbgu {
    zzbgs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgu
    public final void zze(com.google.android.gms.internal.ads.zzbgl zzbglVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbglVar);
        zzda(1, parcelZza);
    }
}
