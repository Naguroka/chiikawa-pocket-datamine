package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbx extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzby {
    public zzbx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static com.google.android.gms.ads.internal.client.zzby zzad(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzby ? (com.google.android.gms.ads.internal.client.zzby) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbl zzbjVar = null;
        com.google.android.gms.ads.internal.client.zzct zzcrVar = null;
        com.google.android.gms.ads.internal.client.zzbo zzbmVar = null;
        com.google.android.gms.ads.internal.client.zzdr zzdpVar = null;
        com.google.android.gms.ads.internal.client.zzcc zzcaVar = null;
        com.google.android.gms.ads.internal.client.zzcq zzcqVar = null;
        com.google.android.gms.ads.internal.client.zzbi zzbgVar = null;
        com.google.android.gms.ads.internal.client.zzcm zzckVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzn = zzn();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzaa = zzaa();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 4:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                boolean zZzab = zzab(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbjVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbl ? (com.google.android.gms.ads.internal.client.zzbl) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbj(strongBinder);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzD(zzbjVar);
                parcel2.writeNoException();
                return true;
            case 8:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzckVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzcm ? (com.google.android.gms.ads.internal.client.zzcm) iInterfaceQueryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzck(strongBinder2);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzG(zzckVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzs zzsVarZzg = zzg();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, zzsVarZzg);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzF(zzsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.ads.zzbtn zzbtnVarZzb = com.google.android.gms.internal.ads.zzbtm.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzM(zzbtnVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.internal.ads.zzbtq zzbtqVarZzb = com.google.android.gms.internal.ads.zzbtp.zzb(parcel.readStrongBinder());
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzQ(zzbtqVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                java.lang.String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                com.google.android.gms.internal.ads.zzbdg zzbdgVarZzb = com.google.android.gms.internal.ads.zzbdf.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzO(zzbdgVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbgVar = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.ads.internal.client.zzbi ? (com.google.android.gms.ads.internal.client.zzbi) iInterfaceQueryLocalInterface3 : new com.google.android.gms.ads.internal.client.zzbg(strongBinder3);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzC(zzbgVar);
                parcel2.writeNoException();
                return true;
            case 21:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.ads.internal.client.zzcq ? (com.google.android.gms.ads.internal.client.zzcq) iInterfaceQueryLocalInterface4 : new com.google.android.gms.ads.internal.client.zzcq(strongBinder4);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzac(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzN(zZzg);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case 24:
                com.google.android.gms.internal.ads.zzbwc zzbwcVarZzb = com.google.android.gms.internal.ads.zzbwb.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzS(zzbwcVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzeb zzebVarZzl = zzl();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzebVarZzl);
                return true;
            case 29:
                com.google.android.gms.ads.internal.client.zzga zzgaVar = (com.google.android.gms.ads.internal.client.zzga) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzga.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzU(zzgaVar);
                parcel2.writeNoException();
                return true;
            case 30:
                com.google.android.gms.ads.internal.client.zzef zzefVar = (com.google.android.gms.ads.internal.client.zzef) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzef.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzK(zzefVar);
                parcel2.writeNoException();
                return true;
            case 31:
                java.lang.String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzcm zzcmVarZzj = zzj();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzcmVarZzj);
                return true;
            case 33:
                com.google.android.gms.ads.internal.client.zzbl zzblVarZzi = zzi();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzblVarZzi);
                return true;
            case 34:
                boolean zZzg2 = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzL(zZzg2);
                parcel2.writeNoException();
                return true;
            case 35:
                java.lang.String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzcaVar = iInterfaceQueryLocalInterface5 instanceof com.google.android.gms.ads.internal.client.zzcc ? (com.google.android.gms.ads.internal.client.zzcc) iInterfaceQueryLocalInterface5 : new com.google.android.gms.ads.internal.client.zzca(strongBinder5);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzE(zzcaVar);
                parcel2.writeNoException();
                return true;
            case 37:
                android.os.Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZzd);
                return true;
            case 38:
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                com.google.android.gms.ads.internal.client.zzy zzyVar = (com.google.android.gms.ads.internal.client.zzy) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzy.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzI(zzyVar);
                parcel2.writeNoException();
                return true;
            case 40:
                com.google.android.gms.internal.ads.zzbag zzbagVarZze = com.google.android.gms.internal.ads.zzbaf.zze(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzH(zzbagVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                com.google.android.gms.ads.internal.client.zzdy zzdyVarZzk = zzk();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzdyVarZzk);
                return true;
            case 42:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdpVar = iInterfaceQueryLocalInterface6 instanceof com.google.android.gms.ads.internal.client.zzdr ? (com.google.android.gms.ads.internal.client.zzdr) iInterfaceQueryLocalInterface6 : new com.google.android.gms.ads.internal.client.zzdp(strongBinder6);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzP(zzdpVar);
                parcel2.writeNoException();
                return true;
            case 43:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbmVar = iInterfaceQueryLocalInterface7 instanceof com.google.android.gms.ads.internal.client.zzbo ? (com.google.android.gms.ads.internal.client.zzbo) iInterfaceQueryLocalInterface7 : new com.google.android.gms.ads.internal.client.zzbm(strongBinder7);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzy(zzmVar2, zzbmVar);
                parcel2.writeNoException();
                return true;
            case 44:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzW(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcrVar = iInterfaceQueryLocalInterface8 instanceof com.google.android.gms.ads.internal.client.zzct ? (com.google.android.gms.ads.internal.client.zzct) iInterfaceQueryLocalInterface8 : new com.google.android.gms.ads.internal.client.zzcr(strongBinder8);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzJ(zzcrVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                int i5 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
        }
    }
}
