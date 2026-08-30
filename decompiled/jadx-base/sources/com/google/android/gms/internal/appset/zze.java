package com.google.android.gms.internal.appset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zze extends com.google.android.gms.internal.appset.zzb implements com.google.android.gms.internal.appset.zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((com.google.android.gms.common.api.Status) com.google.android.gms.internal.appset.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.appset.zzc) com.google.android.gms.internal.appset.zzc.zza(parcel, com.google.android.gms.appset.zzc.CREATOR));
        return true;
    }
}
