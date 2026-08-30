package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbac extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbad {
    public zzbac() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static com.google.android.gms.internal.ads.zzbad zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbad ? (com.google.android.gms.internal.ads.zzbad) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbab(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbak zzbaiVar;
        switch (i) {
            case 2:
                com.google.android.gms.ads.internal.client.zzby zzbyVarZze = zze();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbyVarZze);
                return true;
            case 3:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbah) {
                    }
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbaiVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbaiVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzbak ? (com.google.android.gms.internal.ads.zzbak) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.zzbai(strongBinder2);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(iObjectWrapperAsInterface, zzbaiVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdy zzdyVarZzf = zzf();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzdyVarZzf);
                return true;
            case 6:
                boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzg(zZzg);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdr zzdrVarZzb = com.google.android.gms.ads.internal.client.zzdq.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
