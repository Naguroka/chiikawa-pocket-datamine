package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbtc extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbte {
    zzbtc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzH() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzh(int i, int i2, android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, intent);
        zzda(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzi() throws android.os.RemoteException {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzl(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzm() throws android.os.RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzo() throws android.os.RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzp(int i, java.lang.String[] strArr, int[] iArr) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzq() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzr() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzs(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        android.os.Parcel parcelZzcZ = zzcZ(6, parcelZza);
        if (parcelZzcZ.readInt() != 0) {
            bundle.readFromParcel(parcelZzcZ);
        }
        parcelZzcZ.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzt() throws android.os.RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzu() throws android.os.RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzv() throws android.os.RemoteException {
        zzda(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzx() throws android.os.RemoteException {
        zzda(9, zza());
    }
}
