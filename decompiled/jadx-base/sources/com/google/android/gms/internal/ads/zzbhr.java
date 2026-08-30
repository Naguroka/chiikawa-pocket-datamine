package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbhr extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbht {
    zzbhr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzA() throws android.os.RemoteException {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzB(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        zzda(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzC(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzD() throws android.os.RemoteException {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzE(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzddVar);
        zzda(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzF(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzdrVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzG(com.google.android.gms.internal.ads.zzbhq zzbhqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbhqVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzH() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(30, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzI() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(24, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzJ(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        android.os.Parcel parcelZzcZ = zzcZ(16, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final double zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(8, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final android.os.Bundle zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(20, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, android.os.Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.ads.internal.client.zzdy zzg() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(31, zza());
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzb = com.google.android.gms.ads.internal.client.zzdx.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.internal.ads.zzbfp zzi() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbfp zzbfnVar;
        android.os.Parcel parcelZzcZ = zzcZ(14, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfnVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbfnVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbfp ? (com.google.android.gms.internal.ads.zzbfp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfn(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.internal.ads.zzbft zzj() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbft zzbfrVar;
        android.os.Parcel parcelZzcZ = zzcZ(29, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.internal.ads.zzbfw zzk() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbfw zzbfuVar;
        android.os.Parcel parcelZzcZ = zzcZ(5, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.dynamic.IObjectWrapper zzl() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(19, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.dynamic.IObjectWrapper zzm() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(18, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzn() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(7, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzo() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(4, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzp() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(6, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzq() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(2, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzr() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzs() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(10, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzt() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(9, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.util.List zzu() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(3, zza());
        java.util.ArrayList arrayListZzb = com.google.android.gms.internal.ads.zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.util.List zzv() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(23, zza());
        java.util.ArrayList arrayListZzb = com.google.android.gms.internal.ads.zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzw() throws android.os.RemoteException {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzx() throws android.os.RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzy(com.google.android.gms.ads.internal.client.zzdh zzdhVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzdhVar);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzz(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        zzda(15, parcelZza);
    }
}
