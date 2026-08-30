package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbyp extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbyr {
    zzbyp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzb(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzc(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        zzda(3, parcelZza);
    }
}
