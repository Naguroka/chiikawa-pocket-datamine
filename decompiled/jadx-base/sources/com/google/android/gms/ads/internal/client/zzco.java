package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzco extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzcp {
    public zzco() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.ads.internal.client.zzby zzbyVarZzd = zzd(iObjectWrapperAsInterface, zzsVar, string, zzbpeVarZzf, i3);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbyVarZzd);
                return true;
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar2 = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf2 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.ads.internal.client.zzby zzbyVarZze = zze(iObjectWrapperAsInterface2, zzsVar2, string2, zzbpeVarZzf2, i4);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbyVarZze);
                return true;
            case 3:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf3 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.ads.internal.client.zzbu zzbuVarZzb = zzb(iObjectWrapperAsInterface3, string3, zzbpeVarZzf3, i5);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbuVarZzb);
                return true;
            case 4:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, null);
                return true;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbga zzbgaVarZzj = zzj(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbgaVarZzj);
                return true;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf4 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbvz zzbvzVarZzo = zzo(iObjectWrapperAsInterface6, zzbpeVarZzf4, i6);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbvzVarZzo);
                return true;
            case 7:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, null);
                return true;
            case 8:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbte zzbteVarZzn = zzn(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbteVarZzn);
                return true;
            case 9:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.ads.internal.client.zzcz zzczVarZzh = zzh(iObjectWrapperAsInterface8, i7);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzczVarZzh);
                return true;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar3 = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                java.lang.String string4 = parcel.readString();
                int i8 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.ads.internal.client.zzby zzbyVarZzf = zzf(iObjectWrapperAsInterface9, zzsVar3, string4, i8);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbyVarZzf);
                return true;
            case 11:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface12 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbgg zzbggVarZzk = zzk(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbggVarZzk);
                return true;
            case 12:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface13 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String string5 = parcel.readString();
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf5 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbwp zzbwpVarZzp = zzp(iObjectWrapperAsInterface13, string5, zzbpeVarZzf5, i9);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbwpVarZzp);
                return true;
            case 13:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface14 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar4 = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                java.lang.String string6 = parcel.readString();
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf6 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.ads.internal.client.zzby zzbyVarZzc = zzc(iObjectWrapperAsInterface14, zzsVar4, string6, zzbpeVarZzf6, i10);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbyVarZzc);
                return true;
            case 14:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface15 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf7 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbyu zzbyuVarZzq = zzq(iObjectWrapperAsInterface15, zzbpeVarZzf7, i11);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbyuVarZzq);
                return true;
            case 15:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface16 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf8 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbsx zzbsxVarZzm = zzm(iObjectWrapperAsInterface16, zzbpeVarZzf8, i12);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbsxVarZzm);
                return true;
            case 16:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface17 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf9 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbko zzbkoVarZzc = com.google.android.gms.internal.ads.zzbkn.zzc(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.internal.ads.zzbkr zzbkrVarZzl = zzl(iObjectWrapperAsInterface17, zzbpeVarZzf9, i13, zzbkoVarZzc);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzbkrVarZzl);
                return true;
            case 17:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface18 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf10 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.ads.internal.client.zzdu zzduVarZzi = zzi(iObjectWrapperAsInterface18, zzbpeVarZzf10, i14);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzduVarZzi);
                return true;
            case 18:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface19 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbpe zzbpeVarZzf11 = com.google.android.gms.internal.ads.zzbpd.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                com.google.android.gms.ads.internal.client.zzci zzciVarZzg = zzg(iObjectWrapperAsInterface19, zzbpeVarZzf11, i15);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zzf(parcel2, zzciVarZzg);
                return true;
            default:
                return false;
        }
    }
}
