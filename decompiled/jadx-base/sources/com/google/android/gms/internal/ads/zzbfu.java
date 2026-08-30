package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbfu extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbfw {
    zzbfu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final double zzb() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(3, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzc() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(5, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzd() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(4, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final android.net.Uri zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(2, zza());
        android.net.Uri uri = (android.net.Uri) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, android.net.Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final com.google.android.gms.dynamic.IObjectWrapper zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(1, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }
}
