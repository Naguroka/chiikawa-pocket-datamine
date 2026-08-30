package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbhs extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbht {
    public zzbhs() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbhq zzbhoVar;
        switch (i) {
            case 2:
                java.lang.String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 3:
                java.util.List listZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 4:
                java.lang.String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 5:
                com.google.android.gms.internal.ads.zzbfw zzbfwVarZzk = zzk();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbfwVarZzk);
                return true;
            case 6:
                java.lang.String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 7:
                java.lang.String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                java.lang.String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 10:
                java.lang.String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzeb zzebVarZzh = zzh();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzebVarZzh);
                return true;
            case 12:
                java.lang.String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.ads.zzbfp zzbfpVarZzi = zzi();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbfpVarZzi);
                return true;
            case 15:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzz(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                boolean zZzJ = zzJ(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzJ ? 1 : 0);
                return true;
            case 17:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzC(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzm = zzm();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzm);
                return true;
            case 19:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzl = zzl();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzl);
                return true;
            case 20:
                android.os.Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZzf);
                return true;
            case 21:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbhoVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbhoVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbhq ? (com.google.android.gms.internal.ads.zzbhq) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbho(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzG(zzbhoVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                java.util.List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 24:
                boolean zZzI = zzI();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzI ? 1 : 0);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzdh zzdhVarZzb = com.google.android.gms.ads.internal.client.zzdg.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzy(zzdhVarZzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdd zzddVarZzb = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzE(zzddVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                com.google.android.gms.internal.ads.zzbft zzbftVarZzj = zzj();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbftVarZzj);
                return true;
            case 30:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzdy zzdyVarZzg = zzg();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzdyVarZzg);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdr zzdrVarZzb = com.google.android.gms.ads.internal.client.zzdq.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzF(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            case 33:
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzB(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
