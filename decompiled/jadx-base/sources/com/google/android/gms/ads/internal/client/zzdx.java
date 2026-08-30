package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdx extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzdy {
    public zzdx() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static com.google.android.gms.ads.internal.client.zzdy zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdy ? (com.google.android.gms.ads.internal.client.zzdy) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                java.lang.String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 2:
                java.lang.String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 3:
                java.util.List listZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzj);
                return true;
            case 4:
                com.google.android.gms.ads.internal.client.zzw zzwVarZzf = zzf();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, zzwVarZzf);
                return true;
            case 5:
                android.os.Bundle bundleZze = zze();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZze);
                return true;
            case 6:
                java.lang.String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            default:
                return false;
        }
    }
}
