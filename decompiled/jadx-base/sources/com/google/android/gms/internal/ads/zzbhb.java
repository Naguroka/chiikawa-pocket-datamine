package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbhb extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbhd {
    zzbhb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zze(com.google.android.gms.internal.ads.zzbgq zzbgqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbgqVar);
        zzda(1, parcelZza);
    }
}
