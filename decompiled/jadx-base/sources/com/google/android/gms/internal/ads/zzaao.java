package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaao implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {
    private static final com.google.android.gms.internal.ads.zzaao zzb = new com.google.android.gms.internal.ads.zzaao();
    public volatile long zza = androidx.media3.common.C.TIME_UNSET;
    private final android.os.Handler zzc;
    private final android.os.HandlerThread zzd;
    private android.view.Choreographer zze;
    private int zzf;

    private zzaao() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), this);
        this.zzc = handler;
        handler.sendEmptyMessage(1);
    }

    public static com.google.android.gms.internal.ads.zzaao zza() {
        return zzb;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.zze = android.view.Choreographer.getInstance();
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.internal.ads.zzdo.zzg("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 2) {
            android.view.Choreographer choreographer = this.zze;
            if (choreographer != null) {
                int i2 = this.zzf + 1;
                this.zzf = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        android.view.Choreographer choreographer2 = this.zze;
        if (choreographer2 != null) {
            int i3 = this.zzf - 1;
            this.zzf = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.zza = androidx.media3.common.C.TIME_UNSET;
            }
        }
        return true;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(2);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.zza = j;
        android.view.Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }
}
