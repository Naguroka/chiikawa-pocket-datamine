package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbpd extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbpe {
    public zzbpd() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static com.google.android.gms.internal.ads.zzbpe zzf(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpe ? (com.google.android.gms.internal.ads.zzbpe) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            com.google.android.gms.internal.ads.zzbph zzbphVarZzb = zzb(string);
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbphVarZzb);
        } else if (i == 2) {
            java.lang.String string2 = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            boolean zZze = zze(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
        } else if (i == 3) {
            java.lang.String string3 = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            com.google.android.gms.internal.ads.zzbrd zzbrdVarZzc = zzc(string3);
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbrdVarZzc);
        } else {
            if (i != 4) {
                return false;
            }
            java.lang.String string4 = parcel.readString();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
