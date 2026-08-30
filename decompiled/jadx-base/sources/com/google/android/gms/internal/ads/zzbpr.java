package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbpr extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbpt {
    zzbpr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzA() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(18, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzB() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(17, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final double zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(8, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(23, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzg() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(25, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzh() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(24, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final android.os.Bundle zzi() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(16, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, android.os.Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.ads.internal.client.zzeb zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.internal.ads.zzbfp zzk() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(12, zza());
        com.google.android.gms.internal.ads.zzbfp zzbfpVarZzj = com.google.android.gms.internal.ads.zzbfo.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfpVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.internal.ads.zzbfw zzl() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.internal.ads.zzbfw zzbfwVarZzg = com.google.android.gms.internal.ads.zzbfv.zzg(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfwVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.dynamic.IObjectWrapper zzm() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(13, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(14, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.dynamic.IObjectWrapper zzo() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(15, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzp() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(7, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzq() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(4, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzr() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(6, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzs() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(2, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzt() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(10, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzu() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(9, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.util.List zzv() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(3, zza());
        java.util.ArrayList arrayListZzb = com.google.android.gms.internal.ads.zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzx() throws android.os.RemoteException {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper2);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper3);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzz(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(22, parcelZza);
    }
}
