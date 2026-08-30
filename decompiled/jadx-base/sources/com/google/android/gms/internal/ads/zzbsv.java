package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsv extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbsx {
    zzbsv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zze(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, intent);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzf(java.lang.String[] strArr, int[] iArr, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzh() throws android.os.RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzaVar);
        zzda(6, parcelZza);
    }
}
