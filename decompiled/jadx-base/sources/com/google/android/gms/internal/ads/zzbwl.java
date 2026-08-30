package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbwl extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static com.google.android.gms.internal.ads.zzbwm zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbwm ? (com.google.android.gms.internal.ads.zzbwm) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i != 2) {
                return false;
            }
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        }
        return true;
    }
}
