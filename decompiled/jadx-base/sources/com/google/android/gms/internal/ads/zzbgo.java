package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbgo extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbgq {
    zzbgo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzeb zze() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.internal.ads.zzbft zzf() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbft zzbfrVar;
        android.os.Parcel parcelZzcZ = zzcZ(16, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfrVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbfrVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbft ? (com.google.android.gms.internal.ads.zzbft) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfr(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.internal.ads.zzbfw zzg(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbfw zzbfuVar;
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(2, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfuVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfuVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbfw ? (com.google.android.gms.internal.ads.zzbfw) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfu(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.dynamic.IObjectWrapper zzh() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(9, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final java.lang.String zzi() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(4, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final java.lang.String zzj(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final java.util.List zzk() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(3, zza());
        java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcelZzcZ.createStringArrayList();
        parcelZzcZ.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() throws android.os.RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzm() throws android.os.RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzn(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzo() throws android.os.RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzp(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzq() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzs(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZzcZ = zzcZ(10, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
