package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbmb extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbmc {
    public zzbmb() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbmf zzbmdVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzebVarZzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbmdVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbmdVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbmf ? (com.google.android.gms.internal.ads.zzbmf) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbmd(strongBinder);
            }
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzf(iObjectWrapperAsInterface, zzbmdVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zze(iObjectWrapperAsInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        com.google.android.gms.internal.ads.zzbft zzbftVarZzc = zzc();
        parcel2.writeNoException();
        com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbftVarZzc);
        return true;
    }
}
