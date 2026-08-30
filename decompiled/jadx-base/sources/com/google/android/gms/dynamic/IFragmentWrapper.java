package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface IFragmentWrapper extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static com.google.android.gms.dynamic.IFragmentWrapper asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.dynamic.IFragmentWrapper ? (com.google.android.gms.dynamic.IFragmentWrapper) iInterfaceQueryLocalInterface : new com.google.android.gms.dynamic.zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            switch (i) {
                case 2:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzg = zzg();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, iObjectWrapperZzg);
                    return true;
                case 3:
                    android.os.Bundle bundleZzd = zzd();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzd(parcel2, bundleZzd);
                    return true;
                case 4:
                    int iZzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzb);
                    return true;
                case 5:
                    com.google.android.gms.dynamic.IFragmentWrapper iFragmentWrapperZze = zze();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, iFragmentWrapperZze);
                    return true;
                case 6:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzh = zzh();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, iObjectWrapperZzh);
                    return true;
                case 7:
                    boolean zZzs = zzs();
                    parcel2.writeNoException();
                    int i3 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zZzs ? 1 : 0);
                    return true;
                case 8:
                    java.lang.String strZzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(strZzj);
                    return true;
                case 9:
                    com.google.android.gms.dynamic.IFragmentWrapper iFragmentWrapperZzf = zzf();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, iFragmentWrapperZzf);
                    return true;
                case 10:
                    int iZzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzc);
                    return true;
                case 11:
                    boolean zZzt = zzt();
                    parcel2.writeNoException();
                    int i4 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zZzt ? 1 : 0);
                    return true;
                case 12:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzi = zzi();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, iObjectWrapperZzi);
                    return true;
                case 13:
                    boolean zZzu = zzu();
                    parcel2.writeNoException();
                    int i5 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zZzu ? 1 : 0);
                    return true;
                case 14:
                    boolean zZzv = zzv();
                    parcel2.writeNoException();
                    int i6 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zZzv ? 1 : 0);
                    return true;
                case 15:
                    boolean zZzw = zzw();
                    parcel2.writeNoException();
                    int i7 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zZzw ? 1 : 0);
                    return true;
                case 16:
                    boolean zZzx = zzx();
                    parcel2.writeNoException();
                    int i8 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zZzx ? 1 : 0);
                    return true;
                case 17:
                    boolean zZzy = zzy();
                    parcel2.writeNoException();
                    int i9 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zZzy ? 1 : 0);
                    return true;
                case 18:
                    boolean zZzz = zzz();
                    parcel2.writeNoException();
                    int i10 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zZzz ? 1 : 0);
                    return true;
                case 19:
                    boolean zZzA = zzA();
                    parcel2.writeNoException();
                    int i11 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zZzA ? 1 : 0);
                    return true;
                case 20:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzk(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zZzf = com.google.android.gms.internal.common.zzc.zzf(parcel);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzl(zZzf);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zZzf2 = com.google.android.gms.internal.common.zzc.zzf(parcel);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzm(zZzf2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zZzf3 = com.google.android.gms.internal.common.zzc.zzf(parcel);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzn(zZzf3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zZzf4 = com.google.android.gms.internal.common.zzc.zzf(parcel);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzo(zZzf4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.common.zzc.zza(parcel, android.content.Intent.CREATOR);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzp(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    android.content.Intent intent2 = (android.content.Intent) com.google.android.gms.internal.common.zzc.zza(parcel, android.content.Intent.CREATOR);
                    int i12 = parcel.readInt();
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzq(intent2, i12);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzr(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean zzA() throws android.os.RemoteException;

    int zzb() throws android.os.RemoteException;

    int zzc() throws android.os.RemoteException;

    android.os.Bundle zzd() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zze() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zzf() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzg() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzh() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException;

    java.lang.String zzj() throws android.os.RemoteException;

    void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void zzl(boolean z) throws android.os.RemoteException;

    void zzm(boolean z) throws android.os.RemoteException;

    void zzn(boolean z) throws android.os.RemoteException;

    void zzo(boolean z) throws android.os.RemoteException;

    void zzp(android.content.Intent intent) throws android.os.RemoteException;

    void zzq(android.content.Intent intent, int i) throws android.os.RemoteException;

    void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    boolean zzs() throws android.os.RemoteException;

    boolean zzt() throws android.os.RemoteException;

    boolean zzu() throws android.os.RemoteException;

    boolean zzv() throws android.os.RemoteException;

    boolean zzw() throws android.os.RemoteException;

    boolean zzx() throws android.os.RemoteException;

    boolean zzy() throws android.os.RemoteException;

    boolean zzz() throws android.os.RemoteException;
}
