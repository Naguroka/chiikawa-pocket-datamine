package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbys extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbyu {
    zzbys(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final com.google.android.gms.dynamic.IObjectWrapper zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper3);
        android.os.Parcel parcelZzcZ = zzcZ(11, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbyy zzbyyVar, com.google.android.gms.internal.ads.zzbyr zzbyrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbyyVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbyrVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzg(com.google.android.gms.internal.ads.zzbuc zzbucVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbucVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzh(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbttVar);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzi(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbttVar);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzl(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbttVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzm(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbtt zzbttVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbttVar);
        zzda(5, parcelZza);
    }
}
