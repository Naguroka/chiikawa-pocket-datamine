package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbps extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbpt {
    public zzbps() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static com.google.android.gms.internal.ads.zzbpt zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpt ? (com.google.android.gms.internal.ads.zzbpt) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 2:
                java.lang.String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                java.util.List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                java.lang.String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                com.google.android.gms.internal.ads.zzbfw zzbfwVarZzl = zzl();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbfwVarZzl);
                return true;
            case 6:
                java.lang.String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                java.lang.String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                java.lang.String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                java.lang.String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzeb zzebVarZzj = zzj();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzebVarZzj);
                return true;
            case 12:
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, null);
                return true;
            case 13:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzm = zzm();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzm);
                return true;
            case 14:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzn = zzn();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzn);
                return true;
            case 15:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzo = zzo();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzo);
                return true;
            case 16:
                android.os.Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 18:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzw(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzy(iObjectWrapperAsInterface2, iObjectWrapperAsInterface3, iObjectWrapperAsInterface4);
                parcel2.writeNoException();
                return true;
            case 22:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzz(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
