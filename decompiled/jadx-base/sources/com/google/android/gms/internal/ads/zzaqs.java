package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaqs implements com.google.android.gms.internal.ads.zzaqh {
    final /* synthetic */ android.content.Context zza;
    private java.io.File zzb = null;

    zzaqs(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final java.io.File zza() {
        if (this.zzb == null) {
            this.zzb = new java.io.File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
