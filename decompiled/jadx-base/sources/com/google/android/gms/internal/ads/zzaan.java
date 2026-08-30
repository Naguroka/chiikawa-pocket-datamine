package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaan implements android.hardware.display.DisplayManager.DisplayListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaap zza;
    private final android.hardware.display.DisplayManager zzb;

    public zzaan(com.google.android.gms.internal.ads.zzaap zzaapVar, android.hardware.display.DisplayManager displayManager) {
        this.zza = zzaapVar;
        this.zzb = displayManager;
    }

    private final android.view.Display zzc() {
        return this.zzb.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            com.google.android.gms.internal.ads.zzaap.zzb(this.zza, zzc());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.zzb.registerDisplayListener(this, com.google.android.gms.internal.ads.zzei.zzy(null));
        com.google.android.gms.internal.ads.zzaap.zzb(this.zza, zzc());
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }
}
