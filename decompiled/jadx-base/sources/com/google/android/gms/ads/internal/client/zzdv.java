package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdv extends com.google.android.gms.internal.ads.zzaya implements android.os.IInterface {
    zzdv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final com.google.android.gms.ads.internal.client.zzdu zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzdu zzdsVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdsVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdsVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdu ? (com.google.android.gms.ads.internal.client.zzdu) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzds(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdsVar;
    }
}
