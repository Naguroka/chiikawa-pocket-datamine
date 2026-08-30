package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbpg extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbph {
    public zzbpg() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbpk zzbpiVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string = parcel.readString();
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpi(strongBinder);
                }
                com.google.android.gms.internal.ads.zzbpk zzbpkVar = zzbpiVar;
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzu(iObjectWrapperAsInterface, zzsVar, zzmVar, string, zzbpkVar);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzn = zzn();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, iObjectWrapperZzn);
                return true;
            case 3:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string2 = parcel.readString();
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.zzbpi(strongBinder2);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzx(iObjectWrapperAsInterface2, zzmVar2, string2, zzbpiVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar2 = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string3 = parcel.readString();
                java.lang.String string4 = parcel.readString();
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.ads.zzbpi(strongBinder3);
                }
                com.google.android.gms.internal.ads.zzbpk zzbpkVar2 = zzbpiVar;
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzv(iObjectWrapperAsInterface3, zzsVar2, zzmVar3, string3, string4, zzbpkVar2);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string5 = parcel.readString();
                java.lang.String string6 = parcel.readString();
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.ads.zzbpi(strongBinder4);
                }
                com.google.android.gms.internal.ads.zzbpk zzbpkVar3 = zzbpiVar;
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzy(iObjectWrapperAsInterface4, zzmVar4, string5, string6, zzbpkVar3);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string7 = parcel.readString();
                com.google.android.gms.internal.ads.zzbwh zzbwhVarZzb = com.google.android.gms.internal.ads.zzbwg.zzb(parcel.readStrongBinder());
                java.lang.String string8 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzp(iObjectWrapperAsInterface5, zzmVar5, string7, zzbwhVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string9 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzs(zzmVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string10 = parcel.readString();
                java.lang.String string11 = parcel.readString();
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface5 instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface5 : new com.google.android.gms.internal.ads.zzbpi(strongBinder5);
                }
                com.google.android.gms.internal.ads.zzbpk zzbpkVar4 = zzbpiVar;
                com.google.android.gms.internal.ads.zzbfl zzbflVar = (com.google.android.gms.internal.ads.zzbfl) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbfl.CREATOR);
                java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzz(iObjectWrapperAsInterface6, zzmVar7, string10, string11, zzbpkVar4, zzbflVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, null);
                return true;
            case 17:
                android.os.Bundle bundleZze = zze();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZze);
                return true;
            case 18:
                android.os.Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZzf);
                return true;
            case 19:
                android.os.Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string12 = parcel.readString();
                java.lang.String string13 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzB(zzmVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzD(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzayc.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbwh zzbwhVarZzb2 = com.google.android.gms.internal.ads.zzbwg.zzb(parcel.readStrongBinder());
                java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzr(iObjectWrapperAsInterface8, zzbwhVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                com.google.android.gms.internal.ads.zzbgq zzbgqVarZzi = zzi();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbgqVarZzi);
                return true;
            case 25:
                boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzG(zZzg);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzeb zzebVarZzh = zzh();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzebVarZzh);
                return true;
            case 27:
                com.google.android.gms.internal.ads.zzbpt zzbptVarZzk = zzk();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbptVarZzk);
                return true;
            case 28:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string14 = parcel.readString();
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface6 instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface6 : new com.google.android.gms.internal.ads.zzbpi(strongBinder6);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzA(iObjectWrapperAsInterface9, zzmVar9, string14, zzbpiVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzK(iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzblr zzblrVarZzb = com.google.android.gms.internal.ads.zzblq.zzb(parcel.readStrongBinder());
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.internal.ads.zzblx.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzq(iObjectWrapperAsInterface11, zzblrVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface12 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string15 = parcel.readString();
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface7 instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface7 : new com.google.android.gms.internal.ads.zzbpi(strongBinder7);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzC(iObjectWrapperAsInterface12, zzmVar10, string15, zzbpiVar);
                parcel2.writeNoException();
                return true;
            case 33:
                com.google.android.gms.internal.ads.zzbrs zzbrsVarZzl = zzl();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, zzbrsVarZzl);
                return true;
            case 34:
                com.google.android.gms.internal.ads.zzbrs zzbrsVarZzm = zzm();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, zzbrsVarZzm);
                return true;
            case 35:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface13 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar3 = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string16 = parcel.readString();
                java.lang.String string17 = parcel.readString();
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface8 instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface8 : new com.google.android.gms.internal.ads.zzbpi(strongBinder8);
                }
                com.google.android.gms.internal.ads.zzbpk zzbpkVar5 = zzbpiVar;
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzw(iObjectWrapperAsInterface13, zzsVar3, zzmVar11, string16, string17, zzbpkVar5);
                parcel2.writeNoException();
                return true;
            case 36:
                com.google.android.gms.internal.ads.zzbpn zzbpnVarZzj = zzj();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbpnVarZzj);
                return true;
            case 37:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface14 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzJ(iObjectWrapperAsInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface15 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String string18 = parcel.readString();
                android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface9 instanceof com.google.android.gms.internal.ads.zzbpk ? (com.google.android.gms.internal.ads.zzbpk) iInterfaceQueryLocalInterface9 : new com.google.android.gms.internal.ads.zzbpi(strongBinder9);
                }
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzt(iObjectWrapperAsInterface15, zzmVar12, string18, zzbpiVar);
                parcel2.writeNoException();
                return true;
            case 39:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface16 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzH(iObjectWrapperAsInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
