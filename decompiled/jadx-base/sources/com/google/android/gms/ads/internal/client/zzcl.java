package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcl extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzcm {
    public zzcl() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static com.google.android.gms.ads.internal.client.zzcm zzd(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcm ? (com.google.android.gms.ads.internal.client.zzcm) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzck(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        java.lang.String string = parcel.readString();
        java.lang.String string2 = parcel.readString();
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zzc(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
