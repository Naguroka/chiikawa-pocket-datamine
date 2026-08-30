package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbgp extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbgq {
    public zzbgp() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static com.google.android.gms.internal.ads.zzbgq zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgq ? (com.google.android.gms.internal.ads.zzbgq) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbgo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                java.lang.String strZzj = zzj(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbfw zzbfwVarZzg = zzg(string2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbfwVarZzg);
                return true;
            case 3:
                java.util.List<java.lang.String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                java.lang.String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 5:
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzn(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzeb zzebVarZze = zze();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzebVarZze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzh = zzh();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzh);
                return true;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                boolean zZzs = zzs(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzp(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                com.google.android.gms.internal.ads.zzbft zzbftVarZzf = zzf();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbftVarZzf);
                return true;
            case 17:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                boolean zZzr = zzr(iObjectWrapperAsInterface3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzr ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
