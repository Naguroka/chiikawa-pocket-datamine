package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbrc extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbrd {
    public zzbrc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static com.google.android.gms.internal.ads.zzbrd zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbrd ? (com.google.android.gms.internal.ads.zzbrd) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbrb(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.internal.ads.zzbrg] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.android.gms.internal.ads.zzbra] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.zzbqx] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.zzbra] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.gms.internal.ads.zzbqx] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzbrc] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.zzbqr] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbqr] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.google.android.gms.internal.ads.zzbqo] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.zzbqu] */
    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        android.os.IInterface zzbqmVar = null;
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            java.lang.String string = parcel.readString();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
            android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbqmVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbrg ? (com.google.android.gms.internal.ads.zzbrg) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbre(strongBinder);
            }
            ?? r11 = zzbqmVar;
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzh(iObjectWrapperAsInterface, string, bundle, bundle2, zzsVar, r11);
            parcel2.writeNoException();
        } else if (i == 2) {
            com.google.android.gms.internal.ads.zzbrs zzbrsVarZzf = zzf();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zze(parcel2, zzbrsVarZzf);
        } else if (i == 3) {
            com.google.android.gms.internal.ads.zzbrs zzbrsVarZzg = zzg();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zze(parcel2, zzbrsVarZzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzeb zzebVarZze = zze();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzebVarZze);
        } else if (i == 10) {
            com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    java.lang.String string2 = parcel.readString();
                    java.lang.String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzbqr ? (com.google.android.gms.internal.ads.zzbqr) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.zzbqp(strongBinder2);
                    }
                    ?? r5 = zzbqmVar;
                    com.google.android.gms.internal.ads.zzbpk zzbpkVarZzb = com.google.android.gms.internal.ads.zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzs zzsVar2 = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    zzj(string2, string3, zzmVar, iObjectWrapperAsInterface2, r5, zzbpkVarZzb, zzsVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    java.lang.String string4 = parcel.readString();
                    java.lang.String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.ads.zzbqu ? (com.google.android.gms.internal.ads.zzbqu) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.ads.zzbqs(strongBinder3);
                    }
                    ?? r7 = zzbqmVar;
                    com.google.android.gms.internal.ads.zzbpk zzbpkVarZzb2 = com.google.android.gms.internal.ads.zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    zzl(string4, string5, zzmVar2, iObjectWrapperAsInterface3, r7, zzbpkVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    boolean zZzs = zzs(iObjectWrapperAsInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzs ? 1 : 0);
                    break;
                case 16:
                    java.lang.String string6 = parcel.readString();
                    java.lang.String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.ads.zzbra ? (com.google.android.gms.internal.ads.zzbra) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.ads.zzbqy(strongBinder4);
                    }
                    ?? r12 = zzbqmVar;
                    com.google.android.gms.internal.ads.zzbpk zzbpkVarZzb3 = com.google.android.gms.internal.ads.zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    zzp(string6, string7, zzmVar3, iObjectWrapperAsInterface5, r12, zzbpkVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    boolean zZzt = zzt(iObjectWrapperAsInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                case 18:
                    java.lang.String string8 = parcel.readString();
                    java.lang.String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface5 instanceof com.google.android.gms.internal.ads.zzbqx ? (com.google.android.gms.internal.ads.zzbqx) iInterfaceQueryLocalInterface5 : new com.google.android.gms.internal.ads.zzbqv(strongBinder5);
                    }
                    ?? r13 = zzbqmVar;
                    com.google.android.gms.internal.ads.zzbpk zzbpkVarZzb4 = com.google.android.gms.internal.ads.zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    zzm(string8, string9, zzmVar4, iObjectWrapperAsInterface7, r13, zzbpkVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    java.lang.String string10 = parcel.readString();
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    zzq(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    java.lang.String string11 = parcel.readString();
                    java.lang.String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface6 instanceof com.google.android.gms.internal.ads.zzbra ? (com.google.android.gms.internal.ads.zzbra) iInterfaceQueryLocalInterface6 : new com.google.android.gms.internal.ads.zzbqy(strongBinder6);
                    }
                    ?? r14 = zzbqmVar;
                    com.google.android.gms.internal.ads.zzbpk zzbpkVarZzb5 = com.google.android.gms.internal.ads.zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    zzo(string11, string12, zzmVar5, iObjectWrapperAsInterface8, r14, zzbpkVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    java.lang.String string13 = parcel.readString();
                    java.lang.String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface7 instanceof com.google.android.gms.internal.ads.zzbqr ? (com.google.android.gms.internal.ads.zzbqr) iInterfaceQueryLocalInterface7 : new com.google.android.gms.internal.ads.zzbqp(strongBinder7);
                    }
                    ?? r6 = zzbqmVar;
                    com.google.android.gms.internal.ads.zzbpk zzbpkVarZzb6 = com.google.android.gms.internal.ads.zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzs zzsVar3 = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    zzk(string13, string14, zzmVar6, iObjectWrapperAsInterface9, r6, zzbpkVarZzb6, zzsVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    java.lang.String string15 = parcel.readString();
                    java.lang.String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface8 instanceof com.google.android.gms.internal.ads.zzbqx ? (com.google.android.gms.internal.ads.zzbqx) iInterfaceQueryLocalInterface8 : new com.google.android.gms.internal.ads.zzbqv(strongBinder8);
                    }
                    ?? r15 = zzbqmVar;
                    com.google.android.gms.internal.ads.zzbpk zzbpkVarZzb7 = com.google.android.gms.internal.ads.zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzbfl zzbflVar = (com.google.android.gms.internal.ads.zzbfl) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.internal.ads.zzbfl.CREATOR);
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    zzn(string15, string16, zzmVar7, iObjectWrapperAsInterface10, r15, zzbpkVarZzb7, zzbflVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    java.lang.String string17 = parcel.readString();
                    java.lang.String string18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbqmVar = iInterfaceQueryLocalInterface9 instanceof com.google.android.gms.internal.ads.zzbqo ? (com.google.android.gms.internal.ads.zzbqo) iInterfaceQueryLocalInterface9 : new com.google.android.gms.internal.ads.zzbqm(strongBinder9);
                    }
                    ?? r8 = zzbqmVar;
                    com.google.android.gms.internal.ads.zzbpk zzbpkVarZzb8 = com.google.android.gms.internal.ads.zzbpj.zzb(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    zzi(string17, string18, zzmVar8, iObjectWrapperAsInterface11, r8, zzbpkVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface12 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                    boolean zZzr = zzr(iObjectWrapperAsInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
