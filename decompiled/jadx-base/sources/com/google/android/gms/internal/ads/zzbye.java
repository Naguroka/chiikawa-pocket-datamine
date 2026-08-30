package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbye implements com.google.android.gms.internal.ads.zzayk {
    private final android.content.Context zza;
    private final java.lang.Object zzb;
    private final java.lang.String zzc;
    private boolean zzd;

    public zzbye(android.content.Context context, java.lang.String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new java.lang.Object();
    }

    public final java.lang.String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z) {
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zza)) {
            synchronized (this.zzb) {
                if (this.zzd == z) {
                    return;
                }
                this.zzd = z;
                if (android.text.TextUtils.isEmpty(this.zzc)) {
                    return;
                }
                if (this.zzd) {
                    com.google.android.gms.ads.internal.zzv.zzo().zzf(this.zza, this.zzc);
                } else {
                    com.google.android.gms.ads.internal.zzv.zzo().zzg(this.zza, this.zzc);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
        zzb(zzayjVar.zzj);
    }
}
