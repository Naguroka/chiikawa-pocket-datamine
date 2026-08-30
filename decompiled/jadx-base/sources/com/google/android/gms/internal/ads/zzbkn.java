package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbkn extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbko {
    public zzbkn() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static com.google.android.gms.internal.ads.zzbko zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbko ? (com.google.android.gms.internal.ads.zzbko) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbkm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        java.lang.String string = parcel.readString();
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zzb(string);
        parcel2.writeNoException();
        return true;
    }
}
