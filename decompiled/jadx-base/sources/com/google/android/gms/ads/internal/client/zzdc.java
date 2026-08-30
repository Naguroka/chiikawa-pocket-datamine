package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdc extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzdd {
    public zzdc() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public static com.google.android.gms.ads.internal.client.zzdd zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdd ? (com.google.android.gms.ads.internal.client.zzdd) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }
}
