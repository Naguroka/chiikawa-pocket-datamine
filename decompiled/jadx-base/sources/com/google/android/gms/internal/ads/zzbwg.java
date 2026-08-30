package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbwg extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbwh {
    public zzbwg() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static com.google.android.gms.internal.ads.zzbwh zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbwh ? (com.google.android.gms.internal.ads.zzbwh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzl(iObjectWrapperAsInterface);
                break;
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzk(iObjectWrapperAsInterface2, i3);
                break;
            case 3:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(iObjectWrapperAsInterface3);
                break;
            case 4:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzj(iObjectWrapperAsInterface4);
                break;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzo(iObjectWrapperAsInterface5);
                break;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzf(iObjectWrapperAsInterface6);
                break;
            case 7:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbwi zzbwiVar = (com.google.android.gms.internal.ads.zzbwi) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbwi.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzm(iObjectWrapperAsInterface7, zzbwiVar);
                break;
            case 8:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zze(iObjectWrapperAsInterface8);
                break;
            case 9:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzg(iObjectWrapperAsInterface9, i4);
                break;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(iObjectWrapperAsInterface10);
                break;
            case 11:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzn(iObjectWrapperAsInterface11);
                break;
            case 12:
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
