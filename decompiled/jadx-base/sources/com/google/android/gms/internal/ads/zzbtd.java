package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbtd extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbte {
    public zzbtd() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static com.google.android.gms.internal.ads.zzbte zzI(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbte ? (com.google.android.gms.internal.ads.zzbte) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbtc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzt();
                parcel2.writeNoException();
                return true;
            case 4:
                zzr();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzs(bundle2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                zzx();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 12:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(i4, i5, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzk(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 14:
                zzv();
                parcel2.writeNoException();
                return true;
            case 15:
                int i6 = parcel.readInt();
                java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzp(i6, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
