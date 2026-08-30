package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbsw extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbsx {
    public zzbsw() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static com.google.android.gms.internal.ads.zzbsx zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbsx ? (com.google.android.gms.internal.ads.zzbsx) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbsv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zze(intent);
                break;
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(iObjectWrapperAsInterface, string, string2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzg(iObjectWrapperAsInterface2);
                break;
            case 5:
                java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzf(strArrCreateStringArray, iArrCreateIntArray, iObjectWrapperAsInterface3);
                break;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzj(iObjectWrapperAsInterface4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
