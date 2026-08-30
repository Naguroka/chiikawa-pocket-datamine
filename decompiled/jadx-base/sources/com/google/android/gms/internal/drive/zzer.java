package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzer extends com.google.android.gms.internal.drive.zzb implements com.google.android.gms.internal.drive.zzeq {
    public zzer() {
        super("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.drive.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                zza((com.google.android.gms.internal.drive.zzfl) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzfl.CREATOR));
                break;
            case 2:
                zza((com.google.android.gms.internal.drive.zzft) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzft.CREATOR));
                break;
            case 3:
                zza((com.google.android.gms.internal.drive.zzfn) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzfn.CREATOR));
                break;
            case 4:
                zza((com.google.android.gms.internal.drive.zzfy) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzfy.CREATOR));
                break;
            case 5:
                zza((com.google.android.gms.internal.drive.zzfh) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzfh.CREATOR));
                break;
            case 6:
                zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
                break;
            case 7:
                onSuccess();
                break;
            case 8:
                zza((com.google.android.gms.internal.drive.zzfv) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzfv.CREATOR));
                break;
            case 9:
                zza((com.google.android.gms.internal.drive.zzgh) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzgh.CREATOR));
                break;
            case 10:
            case 19:
            default:
                return false;
            case 11:
                zza((com.google.android.gms.internal.drive.zzfx) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzfx.CREATOR), com.google.android.gms.internal.drive.zzip.zzb(parcel.readStrongBinder()));
                break;
            case 12:
                zza((com.google.android.gms.internal.drive.zzgd) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzgd.CREATOR));
                break;
            case 13:
                zza((com.google.android.gms.internal.drive.zzga) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzga.CREATOR));
                break;
            case 14:
                zza((com.google.android.gms.internal.drive.zzfj) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzfj.CREATOR));
                break;
            case 15:
                zzb(com.google.android.gms.internal.drive.zzc.zza(parcel));
                break;
            case 16:
                zza((com.google.android.gms.internal.drive.zzfr) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzfr.CREATOR));
                break;
            case 17:
                zza((com.google.android.gms.drive.zza) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.drive.zza.CREATOR));
                break;
            case 18:
                zza((com.google.android.gms.internal.drive.zzff) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzff.CREATOR));
                break;
            case 20:
                zza((com.google.android.gms.internal.drive.zzem) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzem.CREATOR));
                break;
            case 21:
                zza((com.google.android.gms.internal.drive.zzgz) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzgz.CREATOR));
                break;
            case 22:
                zza((com.google.android.gms.internal.drive.zzgf) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzgf.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
