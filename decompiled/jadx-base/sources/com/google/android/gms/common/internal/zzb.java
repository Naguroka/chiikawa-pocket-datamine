package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzb extends com.google.android.gms.internal.common.zzh {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, android.os.Looper looper) {
        super(looper);
        this.zza = baseGmsClient;
    }

    private static final void zza(android.os.Message message) {
        com.google.android.gms.common.internal.zzc zzcVar = (com.google.android.gms.common.internal.zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean zzb(android.os.Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (this.zza.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || ((message.what == 4 && !this.zza.enableLocalFallback()) || message.what == 5)) && !this.zza.isConnecting()) {
            zza(message);
            return;
        }
        if (message.what == 4) {
            this.zza.zzC = new com.google.android.gms.common.ConnectionResult(message.arg2);
            if (com.google.android.gms.common.internal.BaseGmsClient.zzo(this.zza)) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
                if (!baseGmsClient.zzD) {
                    baseGmsClient.zzp(3, null);
                    return;
                }
            }
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient2 = this.zza;
            com.google.android.gms.common.ConnectionResult connectionResult = baseGmsClient2.zzC != null ? baseGmsClient2.zzC : new com.google.android.gms.common.ConnectionResult(8);
            this.zza.zzc.onReportServiceBinding(connectionResult);
            this.zza.onConnectionFailed(connectionResult);
            return;
        }
        if (message.what == 5) {
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient3 = this.zza;
            com.google.android.gms.common.ConnectionResult connectionResult2 = baseGmsClient3.zzC != null ? baseGmsClient3.zzC : new com.google.android.gms.common.ConnectionResult(8);
            this.zza.zzc.onReportServiceBinding(connectionResult2);
            this.zza.onConnectionFailed(connectionResult2);
            return;
        }
        if (message.what == 3) {
            com.google.android.gms.common.ConnectionResult connectionResult3 = new com.google.android.gms.common.ConnectionResult(message.arg2, message.obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) message.obj : null);
            this.zza.zzc.onReportServiceBinding(connectionResult3);
            this.zza.onConnectionFailed(connectionResult3);
            return;
        }
        if (message.what == 6) {
            this.zza.zzp(5, null);
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient4 = this.zza;
            if (baseGmsClient4.zzw != null) {
                baseGmsClient4.zzw.onConnectionSuspended(message.arg2);
            }
            this.zza.onConnectionSuspended(message.arg2);
            com.google.android.gms.common.internal.BaseGmsClient.zzn(this.zza, 5, 1, null);
            return;
        }
        if (message.what == 2 && !this.zza.isConnected()) {
            zza(message);
            return;
        }
        if (zzb(message)) {
            ((com.google.android.gms.common.internal.zzc) message.obj).zze();
            return;
        }
        android.util.Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new java.lang.Exception());
    }
}
