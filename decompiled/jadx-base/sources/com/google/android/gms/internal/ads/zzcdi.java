package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcdi extends com.google.android.gms.internal.ads.zzcde {
    public zzcdi(com.google.android.gms.internal.ads.zzcbs zzcbsVar) {
        super(zzcbsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(java.lang.String str) {
        java.lang.String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) this.zzc.get();
        if (zzcbsVar != null && strZzf != null) {
            zzcbsVar.zzt(strZzf, this);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
