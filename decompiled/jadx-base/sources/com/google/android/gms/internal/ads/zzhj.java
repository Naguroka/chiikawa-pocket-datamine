package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhj extends android.content.BroadcastReceiver implements java.lang.Runnable {
    private final android.os.Handler zza;

    public zzhj(com.google.android.gms.internal.ads.zzhl zzhlVar, android.os.Handler handler, com.google.android.gms.internal.ads.zzhk zzhkVar) {
        this.zza = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
