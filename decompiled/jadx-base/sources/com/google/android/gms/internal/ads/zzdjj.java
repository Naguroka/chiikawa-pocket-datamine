package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdjj implements android.view.GestureDetector.OnGestureListener {
    private final com.google.android.gms.internal.ads.zzdia zza;
    private final com.google.android.gms.internal.ads.zzdjb zzb;

    zzdjj(com.google.android.gms.internal.ads.zzdia zzdiaVar, com.google.android.gms.internal.ads.zzdjb zzdjbVar) {
        this.zza = zzdiaVar;
        this.zzb = zzdjbVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        int y;
        if (this.zza != null) {
            int i = -1;
            if (java.lang.Math.abs(f) > java.lang.Math.abs(f2)) {
                if (f > 0.0f) {
                    y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                    i = 1;
                } else if (f < 0.0f) {
                    y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                    i = 2;
                } else {
                    y = 0;
                }
            } else if (f2 > 0.0f) {
                y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                i = 8;
            } else if (f2 < 0.0f) {
                y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                i = 4;
            } else {
                y = 0;
            }
            if (i == this.zza.zza()) {
                this.zza.zzE(this.zzb.zzr(), y);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return false;
    }
}
