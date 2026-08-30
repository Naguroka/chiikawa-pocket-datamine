package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdn extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzdo {
    public zzdn() {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    public static com.google.android.gms.ads.internal.client.zzdo zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdo ? (com.google.android.gms.ads.internal.client.zzdo) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdm(iBinder);
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
