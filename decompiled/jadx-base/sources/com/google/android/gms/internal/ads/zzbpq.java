package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbpq extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzbpq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final android.os.Bundle zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(13, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, android.os.Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzeb zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(16, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    public final com.google.android.gms.internal.ads.zzbfp zzg() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(19, zza());
        com.google.android.gms.internal.ads.zzbfp zzbfpVarZzj = com.google.android.gms.internal.ads.zzbfo.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfpVarZzj;
    }

    public final com.google.android.gms.internal.ads.zzbfw zzh() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.internal.ads.zzbfw zzbfwVarZzg = com.google.android.gms.internal.ads.zzbfv.zzg(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfwVarZzg;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(15, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(20, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(21, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    public final java.lang.String zzl() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(7, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
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

    public final java.util.List zzp() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(3, zza());
        java.util.ArrayList arrayListZzb = com.google.android.gms.internal.ads.zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    public final void zzq(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(9, parcelZza);
    }

    public final void zzr() throws android.os.RemoteException {
        zzda(8, zza());
    }

    public final void zzs(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(10, parcelZza);
    }

    public final void zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper2);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper3);
        zzda(22, parcelZza);
    }

    public final void zzu(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(14, parcelZza);
    }

    public final boolean zzv() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    public final boolean zzw() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
