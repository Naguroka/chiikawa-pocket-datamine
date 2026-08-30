package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbwo extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbwp {
    public zzbwo() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static com.google.android.gms.internal.ads.zzbwp zzq(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbwp ? (com.google.android.gms.internal.ads.zzbwp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbww zzbwuVar = null;
        com.google.android.gms.internal.ads.zzbww zzbwuVar2 = null;
        com.google.android.gms.internal.ads.zzbwx zzbwxVar = null;
        com.google.android.gms.internal.ads.zzbws zzbwqVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbww ? (com.google.android.gms.internal.ads.zzbww) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwu(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzf(zzmVar, zzbwuVar);
                parcel2.writeNoException();
                return true;
            case 2:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbwqVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzbws ? (com.google.android.gms.internal.ads.zzbws) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.zzbwq(strongBinder2);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzk(zzbwqVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                java.lang.String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzm(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbwxVar = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.ads.zzbwx ? (com.google.android.gms.internal.ads.zzbwx) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.ads.zzbwx(strongBinder3);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzp(zzbwxVar);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.internal.ads.zzbxd zzbxdVar = (com.google.android.gms.internal.ads.zzbxd) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbxd.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzl(zzbxdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdo zzdoVarZzb = com.google.android.gms.ads.internal.client.zzdn.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(zzdoVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                android.os.Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZzb);
                return true;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzn(iObjectWrapperAsInterface2, zZzg);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.internal.ads.zzbwm zzbwmVarZzd = zzd();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbwmVarZzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdy zzdyVarZzc = zzc();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzdyVarZzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdr zzdrVarZzb = com.google.android.gms.ads.internal.client.zzdq.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzj(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwuVar2 = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.ads.zzbww ? (com.google.android.gms.internal.ads.zzbww) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.ads.zzbwu(strongBinder4);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzg(zzmVar2, zzbwuVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzg2 = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(zZzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
