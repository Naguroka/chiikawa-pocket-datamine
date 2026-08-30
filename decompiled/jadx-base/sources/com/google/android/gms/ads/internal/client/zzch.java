package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzch extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzcf zzcdVar;
        switch (i) {
            case 1:
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.ads.internal.client.zzft.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcdVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzcdVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcf ? (com.google.android.gms.ads.internal.client.zzcf) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcd(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(arrayListCreateTypedArrayList, zzcdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                boolean zZzl = zzl(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 3:
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbwp zzbwpVarZzg = zzg(string2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbwpVarZzg);
                return true;
            case 4:
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                boolean zZzj = zzj(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 5:
                java.lang.String string4 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbad zzbadVarZze = zze(string4);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbadVarZze);
                return true;
            case 6:
                java.lang.String string5 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                boolean zZzk = zzk(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 7:
                java.lang.String string6 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.ads.internal.client.zzby zzbyVarZzf = zzf(string6);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbyVarZzf);
                return true;
            case 8:
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(zzbpeVarZzf);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
