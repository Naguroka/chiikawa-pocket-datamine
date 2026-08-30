package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzik {
    final android.content.Context zza;
    com.google.android.gms.internal.ads.zzcx zzb;
    com.google.android.gms.internal.ads.zzfvf zzc;
    com.google.android.gms.internal.ads.zzfvf zzd;
    com.google.android.gms.internal.ads.zzfvf zze;
    com.google.android.gms.internal.ads.zzfvf zzf;
    com.google.android.gms.internal.ads.zzfvf zzg;
    com.google.android.gms.internal.ads.zzfuc zzh;
    android.os.Looper zzi;
    int zzj;
    com.google.android.gms.internal.ads.zze zzk;
    int zzl;
    boolean zzm;
    com.google.android.gms.internal.ads.zzlp zzn;
    long zzo;
    long zzp;
    boolean zzq;
    boolean zzr;
    java.lang.String zzs;
    com.google.android.gms.internal.ads.zzhv zzt;

    static /* synthetic */ com.google.android.gms.internal.ads.zzuf zza(android.content.Context context) {
        return new com.google.android.gms.internal.ads.zztt(context, new com.google.android.gms.internal.ads.zzach());
    }

    public zzik(final android.content.Context context, com.google.android.gms.internal.ads.zzced zzcedVar) {
        com.google.android.gms.internal.ads.zzid zzidVar = new com.google.android.gms.internal.ads.zzid(zzcedVar);
        com.google.android.gms.internal.ads.zzie zzieVar = new com.google.android.gms.internal.ads.zzie(context);
        com.google.android.gms.internal.ads.zzfvf zzfvfVar = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzif
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return new com.google.android.gms.internal.ads.zzxt(context);
            }
        };
        com.google.android.gms.internal.ads.zzfvf zzfvfVar2 = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final java.lang.Object zza() {
                return new com.google.android.gms.internal.ads.zzhy();
            }
        };
        com.google.android.gms.internal.ads.zzih zzihVar = new com.google.android.gms.internal.ads.zzih(context);
        com.google.android.gms.internal.ads.zzfuc zzfucVar = new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzii
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.zznx((com.google.android.gms.internal.ads.zzcx) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzidVar;
        this.zzd = zzieVar;
        this.zze = zzfvfVar;
        this.zzf = zzfvfVar2;
        this.zzg = zzihVar;
        this.zzh = zzfucVar;
        this.zzi = com.google.android.gms.internal.ads.zzei.zzz();
        this.zzk = com.google.android.gms.internal.ads.zze.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = com.google.android.gms.internal.ads.zzlp.zzb;
        this.zzt = new com.google.android.gms.internal.ads.zzhv(0.97f, 1.03f, 1000L, 1.0E-7f, com.google.android.gms.internal.ads.zzei.zzs(20L), com.google.android.gms.internal.ads.zzei.zzs(500L), 0.999f, null);
        this.zzb = com.google.android.gms.internal.ads.zzcx.zza;
        this.zzo = 500L;
        this.zzp = 2000L;
        this.zzq = true;
        this.zzs = "";
        this.zzj = -1000;
    }
}
