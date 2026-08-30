package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzblt extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzblu {
    public zzblt() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static com.google.android.gms.internal.ads.zzblu zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzblu ? (com.google.android.gms.internal.ads.zzblu) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbls(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.internal.ads.zzbln.CREATOR);
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zzb(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
