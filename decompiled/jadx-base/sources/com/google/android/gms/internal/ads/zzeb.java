package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeb implements com.google.android.gms.internal.ads.zzdg {
    private android.os.Message zza;

    private zzeb() {
        throw null;
    }

    /* synthetic */ zzeb(com.google.android.gms.internal.ads.zzec zzecVar) {
    }

    public final com.google.android.gms.internal.ads.zzeb zzb(android.os.Message message, com.google.android.gms.internal.ads.zzed zzedVar) {
        this.zza = message;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final void zza() {
        android.os.Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        com.google.android.gms.internal.ads.zzed.zzl(this);
    }

    public final boolean zzc(android.os.Handler handler) {
        android.os.Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        com.google.android.gms.internal.ads.zzed.zzl(this);
        return zSendMessageAtFrontOfQueue;
    }
}
