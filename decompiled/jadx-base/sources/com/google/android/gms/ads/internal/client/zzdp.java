package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdp extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzdr {
    zzdp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(com.google.android.gms.ads.internal.client.zzu zzuVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzuVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
