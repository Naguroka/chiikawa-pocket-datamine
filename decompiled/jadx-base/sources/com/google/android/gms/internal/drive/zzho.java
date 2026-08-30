package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzho extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.MetadataBuffer> {
    public zzho(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.MetadataBuffer> taskCompletionSource) {
        super(taskCompletionSource);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfv zzfvVar) throws android.os.RemoteException {
        zzay().setResult(new com.google.android.gms.drive.MetadataBuffer(zzfvVar.zzav()));
    }
}
