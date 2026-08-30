package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbds {
    private android.view.MotionEvent zza = android.view.MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private android.view.MotionEvent zzb = android.view.MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final java.util.concurrent.ScheduledExecutorService zzc;

    public zzbds(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzbdu zzbduVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar) {
        this.zzc = scheduledExecutorService;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzo(com.google.android.gms.internal.ads.zzgby.zzu(com.google.android.gms.internal.ads.zzgch.zzh(null)), ((java.lang.Long) com.google.android.gms.internal.ads.zzbek.zzc.zze()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzc);
    }

    public final void zzb(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = android.view.MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
                return;
            }
            this.zzb = android.view.MotionEvent.obtain(motionEvent);
        }
    }
}
