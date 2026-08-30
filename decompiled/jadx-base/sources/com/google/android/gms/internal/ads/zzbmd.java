package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbmd extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbmf {
    zzbmd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zzf() throws android.os.RemoteException {
        zzda(1, zza());
    }
}
