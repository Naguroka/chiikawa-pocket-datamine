package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbqs extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbqu {
    zzbqs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zze(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzeVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzg() throws android.os.RemoteException {
        zzda(2, zza());
    }
}
