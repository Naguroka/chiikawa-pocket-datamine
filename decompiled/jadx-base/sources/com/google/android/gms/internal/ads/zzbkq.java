package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbkq extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbkr {
    public zzbkq() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    public static com.google.android.gms.internal.ads.zzbkr zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbkr ? (com.google.android.gms.internal.ads.zzbkr) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbkp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzf(string);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
