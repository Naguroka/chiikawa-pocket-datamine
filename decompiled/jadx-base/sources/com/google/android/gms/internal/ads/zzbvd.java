package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbvd extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzbvd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbbVar);
        zzda(2, parcelZza);
    }

    public final void zzf(java.lang.String str, com.google.android.gms.internal.ads.zzbuu zzbuuVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbuuVar);
        zzda(1, parcelZza);
    }
}
