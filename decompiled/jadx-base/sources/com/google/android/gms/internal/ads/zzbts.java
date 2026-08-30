package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbts extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbtt {
    public zzbts() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static com.google.android.gms.internal.ads.zzbtt zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbtt ? (com.google.android.gms.internal.ads.zzbtt) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbtr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(android.net.Uri.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzf(arrayListCreateTypedArrayList);
        } else {
            if (i != 2) {
                return false;
            }
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zze(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
