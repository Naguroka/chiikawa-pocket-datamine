package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzflu {
    private static final com.google.android.gms.internal.ads.zzflu zza = new com.google.android.gms.internal.ads.zzflu();
    private java.lang.ref.WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static com.google.android.gms.internal.ads.zzflu zza() {
        return zza;
    }

    public final void zzc() {
        android.content.Context context = (android.content.Context) this.zzb.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((android.app.KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        zzd(this.zzc, zIsDeviceLocked);
        this.zzd = zIsDeviceLocked;
    }

    public final void zzd(boolean z, boolean z2) {
        if ((z2 || z) == (this.zzd || this.zzc)) {
            return;
        }
        java.util.Iterator it = com.google.android.gms.internal.ads.zzflk.zza().zzc().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfkt) it.next()).zzg().zzm(z2 || z);
        }
    }

    public final void zze(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new java.lang.ref.WeakReference(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new com.google.android.gms.internal.ads.zzflt(this), intentFilter);
    }
}
