package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhp extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.Metadata> {
    public zzhp(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.Metadata> taskCompletionSource) {
        super(taskCompletionSource);
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfy zzfyVar) throws android.os.RemoteException {
        zzay().setResult(new com.google.android.gms.internal.drive.zzaa(zzfyVar.zzaw()));
    }
}
