package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzon {
    private final android.content.Context zza;
    private final android.os.Handler zzb;
    private final com.google.android.gms.internal.ads.zzoj zzc;
    private final android.content.BroadcastReceiver zzd;
    private final com.google.android.gms.internal.ads.zzok zze;
    private com.google.android.gms.internal.ads.zzoi zzf;
    private com.google.android.gms.internal.ads.zzoo zzg;
    private com.google.android.gms.internal.ads.zze zzh;
    private boolean zzi;
    private final com.google.android.gms.internal.ads.zzpw zzj;

    /* JADX WARN: Multi-variable type inference failed */
    zzon(android.content.Context context, com.google.android.gms.internal.ads.zzpw zzpwVar, com.google.android.gms.internal.ads.zze zzeVar, com.google.android.gms.internal.ads.zzoo zzooVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzpwVar;
        this.zzh = zzeVar;
        this.zzg = zzooVar;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        android.os.Handler handler = new android.os.Handler(com.google.android.gms.internal.ads.zzei.zzz(), null);
        this.zzb = handler;
        this.zzc = com.google.android.gms.internal.ads.zzei.zza >= 23 ? new com.google.android.gms.internal.ads.zzoj(this, objArr2 == true ? 1 : 0) : null;
        this.zzd = new com.google.android.gms.internal.ads.zzol(this, objArr == true ? 1 : 0);
        android.net.Uri uriZza = com.google.android.gms.internal.ads.zzoi.zza();
        this.zze = uriZza != null ? new com.google.android.gms.internal.ads.zzok(this, handler, applicationContext.getContentResolver(), uriZza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(com.google.android.gms.internal.ads.zzoi zzoiVar) {
        if (!this.zzi || zzoiVar.equals(this.zzf)) {
            return;
        }
        this.zzf = zzoiVar;
        this.zzj.zza.zzJ(zzoiVar);
    }

    public final void zzg(com.google.android.gms.internal.ads.zze zzeVar) {
        this.zzh = zzeVar;
        zzj(com.google.android.gms.internal.ads.zzoi.zzc(this.zza, zzeVar, this.zzg));
    }

    public final void zzh(android.media.AudioDeviceInfo audioDeviceInfo) {
        com.google.android.gms.internal.ads.zzoo zzooVar = this.zzg;
        if (java.util.Objects.equals(audioDeviceInfo, zzooVar == null ? null : zzooVar.zza)) {
            return;
        }
        com.google.android.gms.internal.ads.zzoo zzooVar2 = audioDeviceInfo != null ? new com.google.android.gms.internal.ads.zzoo(audioDeviceInfo) : null;
        this.zzg = zzooVar2;
        zzj(com.google.android.gms.internal.ads.zzoi.zzc(this.zza, this.zzh, zzooVar2));
    }

    public final void zzi() {
        com.google.android.gms.internal.ads.zzoj zzojVar;
        if (this.zzi) {
            this.zzf = null;
            if (com.google.android.gms.internal.ads.zzei.zza >= 23 && (zzojVar = this.zzc) != null) {
                android.media.AudioManager audioManager = (android.media.AudioManager) this.zza.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(zzojVar);
            }
            this.zza.unregisterReceiver(this.zzd);
            com.google.android.gms.internal.ads.zzok zzokVar = this.zze;
            if (zzokVar != null) {
                zzokVar.zzb();
            }
            this.zzi = false;
        }
    }

    public final com.google.android.gms.internal.ads.zzoi zzc() {
        com.google.android.gms.internal.ads.zzoj zzojVar;
        if (this.zzi) {
            com.google.android.gms.internal.ads.zzoi zzoiVar = this.zzf;
            zzoiVar.getClass();
            return zzoiVar;
        }
        this.zzi = true;
        com.google.android.gms.internal.ads.zzok zzokVar = this.zze;
        if (zzokVar != null) {
            zzokVar.zza();
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 23 && (zzojVar = this.zzc) != null) {
            android.content.Context context = this.zza;
            android.os.Handler handler = this.zzb;
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(zzojVar, handler);
        }
        com.google.android.gms.internal.ads.zzoi zzoiVarZzd = com.google.android.gms.internal.ads.zzoi.zzd(this.zza, this.zza.registerReceiver(this.zzd, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzoiVarZzd;
        return zzoiVarZzd;
    }
}
