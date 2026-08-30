package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcem extends com.google.android.gms.internal.ads.zzcay {
    private final com.google.android.gms.internal.ads.zzcbt zzc;
    private com.google.android.gms.internal.ads.zzcen zzd;
    private android.net.Uri zze;
    private com.google.android.gms.internal.ads.zzcax zzf;
    private boolean zzg;
    private int zzh;

    public zzcem(android.content.Context context, com.google.android.gms.internal.ads.zzcbt zzcbtVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcbtVar;
        zzcbtVar.zza(this);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"immersiveAdPlayer"}, result = true)
    private final boolean zzm() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i;
    }

    @Override // android.view.View
    public final java.lang.String toString() {
        return getClass().getName() + "@" + java.lang.Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzg() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzh() {
        return 0L;
    }

    final /* synthetic */ void zzi() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final java.lang.String zzj() {
        return "ImmersivePlayer";
    }

    final /* synthetic */ void zzk() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            if (!this.zzg) {
                zzcaxVar.zzg();
                this.zzg = true;
            }
            this.zzf.zze();
        }
    }

    final /* synthetic */ void zzl() {
        com.google.android.gms.internal.ads.zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.zzcbv
    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcel
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcek
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzq(int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView seek " + i);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzr(com.google.android.gms.internal.ads.zzcax zzcaxVar) {
        this.zzf = zzcaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzs(java.lang.String str) {
        if (str != null) {
            this.zze = android.net.Uri.parse(str);
            this.zzd = new com.google.android.gms.internal.ads.zzcen(this.zze.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcej
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        com.google.android.gms.internal.ads.zzcen zzcenVar = this.zzd;
        if (zzcenVar != null) {
            zzcenVar.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzu(float f, float f2) {
    }
}
