package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbpm extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbpn {
    public zzbpm() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static com.google.android.gms.internal.ads.zzbpn zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpn ? (com.google.android.gms.internal.ads.zzbpn) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZze = zze();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZze);
        } else {
            if (i != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i3 = com.google.android.gms.internal.ads.zzayc.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
