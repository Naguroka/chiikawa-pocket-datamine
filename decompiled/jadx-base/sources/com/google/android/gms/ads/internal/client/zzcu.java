package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcu extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzcw {
    zzcu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final com.google.android.gms.internal.ads.zzbpe getAdapterCreator() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(2, zza());
        com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf = com.google.android.gms.internal.ads.zzbpd.zzf(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbpeVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final com.google.android.gms.ads.internal.client.zzfb getLiteSdkVersion() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(1, zza());
        com.google.android.gms.ads.internal.client.zzfb zzfbVar = (com.google.android.gms.ads.internal.client.zzfb) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.ads.internal.client.zzfb.CREATOR);
        parcelZzcZ.recycle();
        return zzfbVar;
    }
}
