package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbva extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbvc {
    zzbva(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbbVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(android.os.ParcelFileDescriptor parcelFileDescriptor) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, parcelFileDescriptor);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(android.os.ParcelFileDescriptor parcelFileDescriptor, com.google.android.gms.internal.ads.zzbvk zzbvkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, parcelFileDescriptor);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbvkVar);
        zzda(3, parcelZza);
    }
}
