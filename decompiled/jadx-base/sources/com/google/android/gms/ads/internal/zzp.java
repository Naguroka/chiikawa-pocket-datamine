package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzp implements android.view.View.OnTouchListener {
    final /* synthetic */ com.google.android.gms.ads.internal.zzu zza;

    zzp(com.google.android.gms.ads.internal.zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.google.android.gms.ads.internal.zzu zzuVar = this.zza;
        if (zzuVar.zzh == null) {
            return false;
        }
        zzuVar.zzh.zzd(motionEvent);
        return false;
    }
}
