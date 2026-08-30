package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzers implements com.google.android.gms.internal.ads.zzetq {
    public final com.google.android.gms.internal.ads.zzfbn zza;

    public zzers(com.google.android.gms.internal.ads.zzfbn zzfbnVar) {
        this.zza = zzfbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (this.zza != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlN)).booleanValue()) {
                return;
            }
            zzcuvVar.zza.putBoolean("render_in_browser", this.zza.zzd());
            zzcuvVar.zza.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
