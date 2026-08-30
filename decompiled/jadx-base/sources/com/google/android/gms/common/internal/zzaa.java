package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaa extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IGmsCallbacks {
    zzaa(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzc.zzc(parcelZza, bundle);
        zzC(1, parcelZza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i, android.os.IBinder iBinder, com.google.android.gms.common.internal.zzk zzkVar) throws android.os.RemoteException {
        throw null;
    }
}
