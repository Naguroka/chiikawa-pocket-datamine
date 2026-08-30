package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbpp extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzbpp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(7, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    public final android.os.Bundle zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(15, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, android.os.Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzeb zzg() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(17, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    public final com.google.android.gms.internal.ads.zzbfp zzh() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(19, zza());
        com.google.android.gms.internal.ads.zzbfp zzbfpVarZzj = com.google.android.gms.internal.ads.zzbfo.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfpVarZzj;
    }

    public final com.google.android.gms.internal.ads.zzbfw zzi() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.internal.ads.zzbfw zzbfwVarZzg = com.google.android.gms.internal.ads.zzbfv.zzg(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfwVarZzg;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(18, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(20, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzl() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(21, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    public final java.lang.String zzm() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(4, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final java.lang.String zzn() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(6, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final java.lang.String zzo() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(2, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final java.lang.String zzp() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(9, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final java.lang.String zzq() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(8, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final java.util.List zzr() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(3, zza());
        java.util.ArrayList arrayListZzb = com.google.android.gms.internal.ads.zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    public final void zzs(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(11, parcelZza);
    }

    public final void zzt() throws android.os.RemoteException {
        zzda(10, zza());
    }

    public final void zzu(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(12, parcelZza);
    }

    public final void zzv(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper2);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper3);
        zzda(22, parcelZza);
    }

    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(16, parcelZza);
    }

    public final boolean zzx() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(14, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    public final boolean zzy() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
