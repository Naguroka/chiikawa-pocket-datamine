package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbpj extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbpk {
    public zzbpj() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static com.google.android.gms.internal.ads.zzbpk zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i3 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzg(i3);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpo) {
                    }
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzq(string, string2);
                break;
            case 10:
                com.google.android.gms.internal.ads.zzbgp.zzb(parcel.readStrongBinder());
                parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                com.google.android.gms.internal.ads.zzbwi zzbwiVar = (com.google.android.gms.internal.ads.zzbwi) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbwi.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzs(zzbwiVar);
                break;
            case 15:
                zzw();
                break;
            case 16:
                com.google.android.gms.internal.ads.zzbwm zzbwmVarZzb = com.google.android.gms.internal.ads.zzbwl.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzt(zzbwmVarZzb);
                break;
            case 17:
                int i4 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzj(i4);
                break;
            case 18:
                zzu();
                break;
            case 19:
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzl(string3);
                break;
            case 22:
                int i5 = parcel.readInt();
                java.lang.String string4 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(i5, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzk(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
