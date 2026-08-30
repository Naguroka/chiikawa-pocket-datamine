package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzbv {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final com.google.android.gms.internal.ads.zzfxn zzh;
    private final com.google.android.gms.internal.ads.zzfxn zzi;
    private final com.google.android.gms.internal.ads.zzfxn zzj;
    private final int zzk;
    private final int zzl;
    private final com.google.android.gms.internal.ads.zzfxn zzm;
    private final com.google.android.gms.internal.ads.zzbu zzn;
    private com.google.android.gms.internal.ads.zzfxn zzo;
    private int zzp;
    private final java.util.HashMap zzq;
    private final java.util.HashSet zzr;

    @java.lang.Deprecated
    public zzbv() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = com.google.android.gms.internal.ads.zzfxn.zzn();
        this.zzi = com.google.android.gms.internal.ads.zzfxn.zzn();
        this.zzj = com.google.android.gms.internal.ads.zzfxn.zzn();
        this.zzk = Integer.MAX_VALUE;
        this.zzl = Integer.MAX_VALUE;
        this.zzm = com.google.android.gms.internal.ads.zzfxn.zzn();
        this.zzn = com.google.android.gms.internal.ads.zzbu.zza;
        this.zzo = com.google.android.gms.internal.ads.zzfxn.zzn();
        this.zzp = 0;
        this.zzq = new java.util.HashMap();
        this.zzr = new java.util.HashSet();
    }

    public final com.google.android.gms.internal.ads.zzbv zze(android.content.Context context) {
        android.view.accessibility.CaptioningManager captioningManager;
        if ((com.google.android.gms.internal.ads.zzei.zza >= 23 || android.os.Looper.myLooper() != null) && (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzp = 1088;
            java.util.Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzo = com.google.android.gms.internal.ads.zzfxn.zzo(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzbv zzf(int i, int i2, boolean z) {
        this.zze = i;
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    protected zzbv(com.google.android.gms.internal.ads.zzbw zzbwVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzbwVar.zzi;
        this.zzf = zzbwVar.zzj;
        this.zzg = zzbwVar.zzk;
        this.zzh = zzbwVar.zzl;
        this.zzi = zzbwVar.zzm;
        this.zzj = zzbwVar.zzo;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = Integer.MAX_VALUE;
        this.zzm = zzbwVar.zzs;
        this.zzn = zzbwVar.zzt;
        this.zzo = zzbwVar.zzu;
        this.zzp = zzbwVar.zzv;
        this.zzr = new java.util.HashSet(zzbwVar.zzC);
        this.zzq = new java.util.HashMap(zzbwVar.zzB);
    }
}
