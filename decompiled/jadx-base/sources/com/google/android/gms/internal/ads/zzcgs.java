package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcgs extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzcgt {
    public zzcgs() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzp(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                android.os.Bundle bundleZzd = zzd(bundle2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzayc.zze(parcel2, bundleZzd);
                return true;
            case 3:
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzo(string, string2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                java.lang.String string3 = parcel.readString();
                java.lang.String string4 = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzt(string3, string4, iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 5:
                java.lang.String string5 = parcel.readString();
                java.lang.String string6 = parcel.readString();
                boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcel);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                java.util.Map mapZzk = zzk(string5, string6, zZzg);
                parcel2.writeNoException();
                parcel2.writeMap(mapZzk);
                return true;
            case 6:
                java.lang.String string7 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                int iZzb = zzb(string7);
                parcel2.writeNoException();
                parcel2.writeInt(iZzb);
                return true;
            case 7:
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzq(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                java.lang.String string8 = parcel.readString();
                java.lang.String string9 = parcel.readString();
                android.os.Bundle bundle5 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzm(string8, string9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                java.lang.String string10 = parcel.readString();
                java.lang.String string11 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                java.util.List listZzj = zzj(string10, string11);
                parcel2.writeNoException();
                parcel2.writeList(listZzj);
                return true;
            case 10:
                java.lang.String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 11:
                java.lang.String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 12:
                long jZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(jZzc);
                return true;
            case 13:
                java.lang.String string12 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzl(string12);
                parcel2.writeNoException();
                return true;
            case 14:
                java.lang.String string13 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzn(string13);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String string14 = parcel.readString();
                java.lang.String string15 = parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzs(iObjectWrapperAsInterface2, string14, string15);
                parcel2.writeNoException();
                return true;
            case 16:
                java.lang.String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 17:
                java.lang.String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 18:
                java.lang.String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 19:
                android.os.Bundle bundle6 = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                zzr(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
