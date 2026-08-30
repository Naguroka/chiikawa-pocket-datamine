package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaah implements com.google.android.gms.internal.ads.zzcc {
    private static final java.util.concurrent.Executor zza = new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzzu
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
        }
    };
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzaab zzc;
    private final com.google.android.gms.internal.ads.zzaal zzd;
    private final com.google.android.gms.internal.ads.zzaaq zze;
    private final com.google.android.gms.internal.ads.zzbl zzf;
    private final java.util.List zzg;
    private final com.google.android.gms.internal.ads.zzabh zzh;
    private final com.google.android.gms.internal.ads.zzcx zzi;
    private final java.util.concurrent.CopyOnWriteArraySet zzj;
    private com.google.android.gms.internal.ads.zzaai zzk;
    private com.google.android.gms.internal.ads.zzdh zzl;
    private android.util.Pair zzm;
    private int zzn;
    private int zzo;

    /* synthetic */ zzaah(com.google.android.gms.internal.ads.zzzw zzzwVar, com.google.android.gms.internal.ads.zzaag zzaagVar) {
        android.content.Context context = zzzwVar.zza;
        this.zzb = context;
        com.google.android.gms.internal.ads.zzaab zzaabVar = new com.google.android.gms.internal.ads.zzaab(this, context);
        this.zzc = zzaabVar;
        com.google.android.gms.internal.ads.zzcx zzcxVar = zzzwVar.zzf;
        this.zzi = zzcxVar;
        com.google.android.gms.internal.ads.zzaal zzaalVar = zzzwVar.zzb;
        this.zzd = zzaalVar;
        zzaalVar.zzk(zzcxVar);
        com.google.android.gms.internal.ads.zzaaq zzaaqVar = new com.google.android.gms.internal.ads.zzaaq(new com.google.android.gms.internal.ads.zzzx(this, null), zzaalVar);
        this.zze = zzaaqVar;
        com.google.android.gms.internal.ads.zzbl zzblVar = zzzwVar.zzd;
        com.google.android.gms.internal.ads.zzcw.zzb(zzblVar);
        this.zzf = zzblVar;
        this.zzg = zzzwVar.zze;
        this.zzh = new com.google.android.gms.internal.ads.zzzh(zzaalVar, zzaaqVar);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
        this.zzj = copyOnWriteArraySet;
        this.zzo = 0;
        new com.google.android.gms.internal.ads.zzz().zzag();
        copyOnWriteArraySet.add(zzaabVar);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcb zzc(com.google.android.gms.internal.ads.zzaah zzaahVar, com.google.android.gms.internal.ads.zzab zzabVar) throws com.google.android.gms.internal.ads.zzabg {
        com.google.android.gms.internal.ads.zzcw.zzf(zzaahVar.zzo == 0);
        com.google.android.gms.internal.ads.zzk zzkVarZzw = zzw(zzabVar.zzC);
        if (zzkVarZzw.zzd == 7 && com.google.android.gms.internal.ads.zzei.zza < 34) {
            com.google.android.gms.internal.ads.zzi zziVarZzc = zzkVarZzw.zzc();
            zziVarZzc.zzd(6);
            zzkVarZzw = zziVarZzc.zzg();
        }
        com.google.android.gms.internal.ads.zzk zzkVar = zzkVarZzw;
        com.google.android.gms.internal.ads.zzcx zzcxVar = zzaahVar.zzi;
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        com.google.android.gms.internal.ads.zzcw.zzb(looperMyLooper);
        zzaahVar.zzl = zzcxVar.zzd(looperMyLooper, null);
        try {
            com.google.android.gms.internal.ads.zzbl zzblVar = zzaahVar.zzf;
            android.content.Context context = zzaahVar.zzb;
            com.google.android.gms.internal.ads.zzn zznVar = com.google.android.gms.internal.ads.zzn.zza;
            final com.google.android.gms.internal.ads.zzdh zzdhVar = zzaahVar.zzl;
            java.util.Objects.requireNonNull(zzdhVar);
            zzblVar.zza(context, zzkVar, zznVar, zzaahVar, new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzzv
                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable runnable) {
                    zzdhVar.zzh(runnable);
                }
            }, com.google.android.gms.internal.ads.zzfxn.zzn(), 0L);
            android.util.Pair pair = zzaahVar.zzm;
            if (pair == null) {
                throw null;
            }
            com.google.android.gms.internal.ads.zzdz zzdzVar = (com.google.android.gms.internal.ads.zzdz) zzaahVar.zzm.second;
            zzdzVar.zzb();
            zzdzVar.zza();
            throw null;
        } catch (com.google.android.gms.internal.ads.zzbz e) {
            throw new com.google.android.gms.internal.ads.zzabg(e, zzabVar);
        }
    }

    static /* bridge */ /* synthetic */ void zzl(final com.google.android.gms.internal.ads.zzaah zzaahVar, boolean z) {
        if (zzaahVar.zzo == 1) {
            zzaahVar.zzn++;
            zzaahVar.zzh.zzd(z);
            com.google.android.gms.internal.ads.zzdh zzdhVar = zzaahVar.zzl;
            com.google.android.gms.internal.ads.zzcw.zzb(zzdhVar);
            zzdhVar.zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzzt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    static /* bridge */ /* synthetic */ boolean zzu(com.google.android.gms.internal.ads.zzaah zzaahVar, long j) {
        return zzaahVar.zzn == 0 && zzaahVar.zze.zze(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.ads.zzk zzw(com.google.android.gms.internal.ads.zzk zzkVar) {
        return (zzkVar == null || !zzkVar.zzf()) ? com.google.android.gms.internal.ads.zzk.zza : zzkVar;
    }

    public final com.google.android.gms.internal.ads.zzabh zzh() {
        return this.zzc;
    }

    public final void zzq() {
        com.google.android.gms.internal.ads.zzdz.zza.zzb();
        com.google.android.gms.internal.ads.zzdz.zza.zza();
        this.zzm = null;
    }

    final /* synthetic */ void zzr() {
        this.zzn--;
    }

    public final void zzs() {
        if (this.zzo == 2) {
            return;
        }
        com.google.android.gms.internal.ads.zzdh zzdhVar = this.zzl;
        if (zzdhVar != null) {
            zzdhVar.zze(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final void zzt(android.view.Surface surface, com.google.android.gms.internal.ads.zzdz zzdzVar) {
        android.util.Pair pair = this.zzm;
        if (pair != null && ((android.view.Surface) pair.first).equals(surface) && ((com.google.android.gms.internal.ads.zzdz) this.zzm.second).equals(zzdzVar)) {
            return;
        }
        this.zzm = android.util.Pair.create(surface, zzdzVar);
        zzdzVar.zzb();
        zzdzVar.zza();
    }
}
