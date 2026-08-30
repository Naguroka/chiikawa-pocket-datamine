package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzayd extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzayf {
    zzayd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzayf
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString("GMA_SDK");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzayf
    public final void zzf() throws android.os.RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzayf
    public final void zzg(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzayf
    public final void zzh(int[] iArr) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzayf
    public final void zzi(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzayf
    public final void zzj(byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }
}
