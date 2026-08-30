package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfpl extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzfpn {
    zzfpl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zzf() throws android.os.RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zzg(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zzh(int[] iArr) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zzi(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zzj(byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }
}
