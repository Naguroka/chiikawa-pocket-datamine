package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbuw extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbuy {
    zzbuw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zze(com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzbvc zzbvcVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbvkVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbvcVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzf(com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzbvc zzbvcVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbvkVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbvcVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzg(com.google.android.gms.internal.ads.zzbvk zzbvkVar, com.google.android.gms.internal.ads.zzbvc zzbvcVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbvkVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbvcVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzh(java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbvcVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzi(com.google.android.gms.internal.ads.zzbuu zzbuuVar, com.google.android.gms.internal.ads.zzbvd zzbvdVar) throws android.os.RemoteException {
        throw null;
    }
}
