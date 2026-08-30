package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbfv extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbfw {
    public zzbfv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static com.google.android.gms.internal.ads.zzbfw zzg(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbfw ? (com.google.android.gms.internal.ads.zzbfw) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzf = zzf();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzf);
        } else if (i == 2) {
            android.net.Uri uriZze = zze();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zze(parcel2, uriZze);
        } else if (i == 3) {
            double dZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(dZzb);
        } else if (i == 4) {
            int iZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        } else {
            if (i != 5) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
