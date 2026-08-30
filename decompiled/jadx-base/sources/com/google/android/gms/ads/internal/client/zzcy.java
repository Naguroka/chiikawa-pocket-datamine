package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcy extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzcz {
    public zzcy() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzdl zzdjVar;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzq(f);
                parcel2.writeNoException();
                return true;
            case 3:
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzp(zZzg);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzn(iObjectWrapperAsInterface, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzl(string3, iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                java.lang.String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                java.lang.String string4 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzo(zzbpeVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                com.google.android.gms.internal.ads.zzblu zzbluVarZzc = com.google.android.gms.internal.ads.zzblt.zzc(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzs(zzbluVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                java.util.List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzfv zzfvVar = (com.google.android.gms.ads.internal.client.zzfv) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzfv.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzu(zzfvVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdjVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdjVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdl ? (com.google.android.gms.ads.internal.client.zzdl) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdj(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzm(zzdjVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZzg2 = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzj(zZzg2);
                parcel2.writeNoException();
                return true;
            case 18:
                java.lang.String string5 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
