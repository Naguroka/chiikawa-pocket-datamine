package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbhf extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbhh {
    zzbhf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zze(com.google.android.gms.ads.internal.client.zzby zzbyVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbyVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }
}
