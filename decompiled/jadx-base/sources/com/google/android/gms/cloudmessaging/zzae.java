package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzae extends com.google.android.gms.internal.cloudmessaging.zzf {
    final /* synthetic */ com.google.android.gms.cloudmessaging.Rpc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzae(com.google.android.gms.cloudmessaging.Rpc rpc, android.os.Looper looper) {
        super(looper);
        this.zza = rpc;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        com.google.android.gms.cloudmessaging.Rpc.zzc(this.zza, message);
    }
}
