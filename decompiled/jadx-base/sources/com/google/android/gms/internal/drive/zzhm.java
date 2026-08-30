package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhm extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.TransferPreferences> {
    public zzhm(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.TransferPreferences> taskCompletionSource) {
        super(taskCompletionSource);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfj zzfjVar) throws android.os.RemoteException {
        zzay().setResult(new com.google.android.gms.drive.TransferPreferencesBuilder(zzfjVar.zzas()).build());
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzga zzgaVar) throws android.os.RemoteException {
        zzay().setResult(zzgaVar.zzax());
    }
}
