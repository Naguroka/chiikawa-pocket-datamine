package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdg extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzdh {
    public zzdg() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static com.google.android.gms.ads.internal.client.zzdh zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdh ? (com.google.android.gms.ads.internal.client.zzdh) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else {
            if (i != 2) {
                return false;
            }
            java.lang.String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        }
        return true;
    }
}
