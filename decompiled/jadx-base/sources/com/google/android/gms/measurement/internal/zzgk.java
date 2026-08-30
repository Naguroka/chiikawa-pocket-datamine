package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgk extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.measurement.internal.zzgl {
    public zzgk() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.measurement.internal.zzgr zzgpVar = null;
        com.google.android.gms.measurement.internal.zzgo zzgmVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.measurement.internal.zzbh zzbhVar = (com.google.android.gms.measurement.internal.zzbh) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzbh.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzp(zzbhVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.measurement.internal.zzqb zzqbVar = (com.google.android.gms.measurement.internal.zzqb) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzqb.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar2 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzB(zzqbVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                com.google.android.gms.measurement.internal.zzr zzrVar3 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzn(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.zzbh zzbhVar2 = (com.google.android.gms.measurement.internal.zzbh) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzbh.CREATOR);
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzq(zzbhVar2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.measurement.internal.zzr zzrVar4 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzz(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.measurement.internal.zzr zzrVar5 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                boolean zZzf = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                java.util.List listZzh = zzh(zzrVar5, zZzf);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzh);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.zzbh zzbhVar3 = (com.google.android.gms.measurement.internal.zzbh) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzbh.CREATOR);
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                byte[] bArrZzD = zzD(zzbhVar3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrZzD);
                return true;
            case 10:
                long j = parcel.readLong();
                java.lang.String string4 = parcel.readString();
                java.lang.String string5 = parcel.readString();
                java.lang.String string6 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzw(j, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.measurement.internal.zzr zzrVar6 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                java.lang.String strZzf = zzf(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 12:
                com.google.android.gms.measurement.internal.zzai zzaiVar = (com.google.android.gms.measurement.internal.zzai) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzai.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar7 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzt(zzaiVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.measurement.internal.zzai zzaiVar2 = (com.google.android.gms.measurement.internal.zzai) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzai.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzu(zzaiVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                java.lang.String string7 = parcel.readString();
                java.lang.String string8 = parcel.readString();
                boolean zZzf2 = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                com.google.android.gms.measurement.internal.zzr zzrVar8 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                java.util.List listZzk = zzk(string7, string8, zZzf2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzk);
                return true;
            case 15:
                java.lang.String string9 = parcel.readString();
                java.lang.String string10 = parcel.readString();
                java.lang.String string11 = parcel.readString();
                boolean zZzf3 = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                java.util.List listZzl = zzl(string9, string10, string11, zZzf3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzl);
                return true;
            case 16:
                java.lang.String string12 = parcel.readString();
                java.lang.String string13 = parcel.readString();
                com.google.android.gms.measurement.internal.zzr zzrVar9 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                java.util.List listZzi = zzi(string12, string13, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzi);
                return true;
            case 17:
                java.lang.String string14 = parcel.readString();
                java.lang.String string15 = parcel.readString();
                java.lang.String string16 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                java.util.List listZzj = zzj(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzj);
                return true;
            case 18:
                com.google.android.gms.measurement.internal.zzr zzrVar10 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzs(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar11 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzx(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.measurement.internal.zzr zzrVar12 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzv(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.measurement.internal.zzr zzrVar13 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                com.google.android.gms.measurement.internal.zzap zzapVarZze = zze(zzrVar13);
                parcel2.writeNoException();
                if (zzapVarZze == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    zzapVarZze.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                com.google.android.gms.measurement.internal.zzr zzrVar14 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                java.util.List listZzg = zzg(zzrVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 25:
                com.google.android.gms.measurement.internal.zzr zzrVar15 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzA(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.measurement.internal.zzr zzrVar16 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzy(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                com.google.android.gms.measurement.internal.zzr zzrVar17 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzm(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                com.google.android.gms.measurement.internal.zzr zzrVar18 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.measurement.internal.zzpc zzpcVar = (com.google.android.gms.measurement.internal.zzpc) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzpc.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    zzgpVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.measurement.internal.zzgr ? (com.google.android.gms.measurement.internal.zzgr) iInterfaceQueryLocalInterface : new com.google.android.gms.measurement.internal.zzgp(strongBinder);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzo(zzrVar18, zzpcVar, zzgpVar);
                parcel2.writeNoException();
                return true;
            case 30:
                com.google.android.gms.measurement.internal.zzr zzrVar19 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.measurement.internal.zzag zzagVar = (com.google.android.gms.measurement.internal.zzag) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzag.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzC(zzrVar19, zzagVar);
                parcel2.writeNoException();
                return true;
            case 31:
                com.google.android.gms.measurement.internal.zzr zzrVar20 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    zzgmVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.measurement.internal.zzgo ? (com.google.android.gms.measurement.internal.zzgo) iInterfaceQueryLocalInterface2 : new com.google.android.gms.measurement.internal.zzgm(strongBinder2);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                zzr(zzrVar20, bundle3, zzgmVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
