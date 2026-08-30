package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbp extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzbr {
    zzbp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final java.lang.String zze() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final java.lang.String zzf() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeInt(i);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(3, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
