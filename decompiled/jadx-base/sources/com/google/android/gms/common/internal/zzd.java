package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd extends com.google.android.gms.common.internal.zzab {
    private com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zzd(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i, android.os.Bundle bundle) {
        android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new java.lang.Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i, android.os.IBinder iBinder, com.google.android.gms.common.internal.zzk zzkVar) {
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkVar);
        com.google.android.gms.common.internal.BaseGmsClient.zzj(baseGmsClient, zzkVar);
        onPostInitComplete(i, iBinder, zzkVar.zza);
    }
}
