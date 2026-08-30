package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbt extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbl zzbjVar = null;
        com.google.android.gms.ads.internal.client.zzcq zzcqVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzbr zzbrVarZze = zze();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbrVarZze);
                return true;
            case 2:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbjVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbl ? (com.google.android.gms.ads.internal.client.zzbl) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbj(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzl(zzbjVar);
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.internal.ads.zzbgu zzbguVarZzb = com.google.android.gms.internal.ads.zzbgt.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzf(zzbguVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.internal.ads.zzbgx zzbgxVarZzb = com.google.android.gms.internal.ads.zzbgw.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzg(zzbgxVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.zzbhd zzbhdVarZzb = com.google.android.gms.internal.ads.zzbhc.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbha zzbhaVarZzb = com.google.android.gms.internal.ads.zzbgz.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzh(string, zzbhdVarZzb, zzbhaVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.internal.ads.zzbfl zzbflVar = (com.google.android.gms.internal.ads.zzbfl) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbfl.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzo(zzbflVar);
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzcq ? (com.google.android.gms.ads.internal.client.zzcq) iInterfaceQueryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzcq(strongBinder2);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzq(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.internal.ads.zzbhh zzbhhVarZzb = com.google.android.gms.internal.ads.zzbhg.zzb(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzj(zzbhhVarZzb, zzsVar);
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.ads.formats.PublisherAdViewOptions publisherAdViewOptions = (com.google.android.gms.ads.formats.PublisherAdViewOptions) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.internal.ads.zzbhk zzbhkVarZzb = com.google.android.gms.internal.ads.zzbhj.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzk(zzbhkVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                com.google.android.gms.internal.ads.zzblz zzblzVar = (com.google.android.gms.internal.ads.zzblz) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzblz.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzn(zzblzVar);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.ads.zzbmi zzbmiVarZzb = com.google.android.gms.internal.ads.zzbmh.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzi(zzbmiVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions = (com.google.android.gms.ads.formats.AdManagerAdViewOptions) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.formats.AdManagerAdViewOptions.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
