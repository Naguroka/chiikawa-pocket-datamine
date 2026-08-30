package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcv extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static com.google.android.gms.ads.internal.client.zzcw asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcw ? (com.google.android.gms.ads.internal.client.zzcw) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzfb liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zze(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.internal.ads.zzbpe adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
