package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbvy extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbvz {
    public zzbvy() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.ads.zzbwd zzbwdVar = (com.google.android.gms.internal.ads.zzbwd) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbwd.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzg(zzbwdVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            com.google.android.gms.internal.ads.zzbwc zzbwaVar = null;
            com.google.android.gms.internal.ads.zzbvx zzbvxVar = null;
            if (i == 3) {
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbwaVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbwc ? (com.google.android.gms.internal.ads.zzbwc) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwa(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzo(zzbwaVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                        parcel2.writeInt(zZzs ? 1 : 0);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                        zzi(iObjectWrapperAsInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                        zzk(iObjectWrapperAsInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                        zzf(iObjectWrapperAsInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        java.lang.String strZzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzd);
                        break;
                    case 13:
                        java.lang.String string = parcel.readString();
                        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                        zzp(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzcc zzccVarZzb = com.google.android.gms.ads.internal.client.zzcb.zzb(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                        zzl(zzccVarZzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        android.os.Bundle bundleZzb = zzb();
                        parcel2.writeNoException();
                        com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZzb);
                        break;
                    case 16:
                        android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzbvxVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzbvx ? (com.google.android.gms.internal.ads.zzbvx) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.zzbvx(strongBinder2);
                        }
                        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                        zzu(zzbvxVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                        zzr(iObjectWrapperAsInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        java.lang.String string2 = parcel.readString();
                        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                        zzm(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzt = zzt();
                        parcel2.writeNoException();
                        int i4 = com.google.android.gms.internal.ads.zzayc.zza;
                        parcel2.writeInt(zZzt ? 1 : 0);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzc = zzc();
                        parcel2.writeNoException();
                        com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzdyVarZzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzn(zZzg);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }
}
