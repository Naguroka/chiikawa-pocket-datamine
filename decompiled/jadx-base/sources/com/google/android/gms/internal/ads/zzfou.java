package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfou extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzfou(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final com.google.android.gms.internal.ads.zzfos zze(com.google.android.gms.internal.ads.zzfoq zzfoqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzfoqVar);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
        com.google.android.gms.internal.ads.zzfos zzfosVar = (com.google.android.gms.internal.ads.zzfos) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.internal.ads.zzfos.CREATOR);
        parcelZzcZ.recycle();
        return zzfosVar;
    }

    public final com.google.android.gms.internal.ads.zzfpb zzf(com.google.android.gms.internal.ads.zzfoz zzfozVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzfozVar);
        android.os.Parcel parcelZzcZ = zzcZ(3, parcelZza);
        com.google.android.gms.internal.ads.zzfpb zzfpbVar = (com.google.android.gms.internal.ads.zzfpb) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.internal.ads.zzfpb.CREATOR);
        parcelZzcZ.recycle();
        return zzfpbVar;
    }

    public final void zzg(com.google.android.gms.internal.ads.zzfon zzfonVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzfonVar);
        zzda(2, parcelZza);
    }
}
