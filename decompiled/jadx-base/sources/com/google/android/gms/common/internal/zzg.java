package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzg extends com.google.android.gms.common.internal.zza {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i, android.os.Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zze = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(com.google.android.gms.common.ConnectionResult connectionResult) {
        if (this.zze.enableLocalFallback() && com.google.android.gms.common.internal.BaseGmsClient.zzo(this.zze)) {
            com.google.android.gms.common.internal.BaseGmsClient.zzk(this.zze, 16);
        } else {
            this.zze.zzc.onReportServiceBinding(connectionResult);
            this.zze.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zzd() {
        this.zze.zzc.onReportServiceBinding(com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}
