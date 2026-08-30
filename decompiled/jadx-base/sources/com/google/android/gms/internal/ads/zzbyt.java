package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbyt extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbyu {
    public zzbyt() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static com.google.android.gms.internal.ads.zzbyu zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbyu ? (com.google.android.gms.internal.ads.zzbyu) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbys(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbyr zzbypVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbyy zzbyyVar = (com.google.android.gms.internal.ads.zzbyy) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbyy.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbypVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbyr ? (com.google.android.gms.internal.ads.zzbyr) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbyp(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzf(iObjectWrapperAsInterface, zzbyyVar, zzbypVar);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzk(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, null);
                return true;
            case 4:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, null);
                return true;
            case 5:
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(android.net.Uri.CREATOR);
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbtt zzbttVarZzb = com.google.android.gms.internal.ads.zzbts.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzm(arrayListCreateTypedArrayList, iObjectWrapperAsInterface3, zzbttVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                java.util.ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(android.net.Uri.CREATOR);
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbtt zzbttVarZzb2 = com.google.android.gms.internal.ads.zzbts.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzl(arrayListCreateTypedArrayList2, iObjectWrapperAsInterface4, zzbttVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.internal.ads.zzbuc zzbucVar = (com.google.android.gms.internal.ads.zzbuc) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbuc.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzg(zzbucVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzj(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                java.util.ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(android.net.Uri.CREATOR);
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbtt zzbttVarZzb3 = com.google.android.gms.internal.ads.zzbts.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(arrayListCreateTypedArrayList3, iObjectWrapperAsInterface6, zzbttVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                java.util.ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(android.net.Uri.CREATOR);
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbtt zzbttVarZzb4 = com.google.android.gms.internal.ads.zzbts.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(arrayListCreateTypedArrayList4, iObjectWrapperAsInterface7, zzbttVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String string = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZze = zze(iObjectWrapperAsInterface8, iObjectWrapperAsInterface9, string, iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZze);
                return true;
            default:
                return false;
        }
    }
}
