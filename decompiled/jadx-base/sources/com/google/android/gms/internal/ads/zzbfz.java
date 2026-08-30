package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbfz extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbga {
    public zzbfz() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static com.google.android.gms.internal.ads.zzbga zzdy(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbga ? (com.google.android.gms.internal.ads.zzbga) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbft zzbfrVar;
        switch (i) {
            case 1:
                java.lang.String string = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzdt(string, iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 2:
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzb = zzb(string2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzb);
                return true;
            case 3:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzdx(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzdu(iObjectWrapperAsInterface3);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzd(iObjectWrapperAsInterface4);
                parcel2.writeNoException();
                return true;
            case 8:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbfrVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbfrVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbft ? (com.google.android.gms.internal.ads.zzbft) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfr(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzdv(zzbfrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzdw(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
