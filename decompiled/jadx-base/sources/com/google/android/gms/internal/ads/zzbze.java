package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbze {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbzf zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbze(com.google.android.gms.internal.ads.zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final android.os.Bundle zzb() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        this.zzc = this.zza.zza.elapsedRealtime();
    }

    public final void zzd() {
        this.zzb = this.zza.zza.elapsedRealtime();
    }
}
