package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzki {
    public static final /* synthetic */ int zzc = 0;
    private static final java.lang.Object zzd = new java.lang.Object();

    @javax.annotation.Nullable
    private static volatile com.google.android.gms.internal.measurement.zzkg zze = null;
    private static volatile boolean zzf = false;
    private static final java.util.concurrent.atomic.AtomicInteger zzg;
    final com.google.android.gms.internal.measurement.zzkf zza;
    final java.lang.String zzb;
    private java.lang.Object zzh;
    private volatile int zzi = -1;
    private volatile java.lang.Object zzj;
    private volatile boolean zzk;

    static {
        new java.util.concurrent.atomic.AtomicReference();
        com.google.common.base.Preconditions.checkNotNull(new java.lang.Object() { // from class: com.google.android.gms.internal.measurement.zzka
        }, "BuildInfo must be non-null");
        zzg = new java.util.concurrent.atomic.AtomicInteger();
    }

    /* synthetic */ zzki(com.google.android.gms.internal.measurement.zzkf zzkfVar, java.lang.String str, java.lang.Object obj, boolean z, com.google.android.gms.internal.measurement.zzkh zzkhVar) {
        if (zzkfVar.zza == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkfVar;
        this.zzb = str;
        this.zzh = obj;
        this.zzk = false;
    }

    public static void zzc() {
        zzg.incrementAndGet();
    }

    public static void zzd(final android.content.Context context) {
        if (zze != null || context == null) {
            return;
        }
        java.lang.Object obj = zzd;
        synchronized (obj) {
            if (zze == null) {
                synchronized (obj) {
                    com.google.android.gms.internal.measurement.zzkg zzkgVar = zze;
                    android.content.Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzkgVar == null || zzkgVar.zza() != context) {
                        if (zzkgVar != null) {
                            com.google.android.gms.internal.measurement.zzjm.zze();
                            com.google.android.gms.internal.measurement.zzkk.zzd();
                            com.google.android.gms.internal.measurement.zzju.zze();
                        }
                        zze = new com.google.android.gms.internal.measurement.zzjj(context, com.google.common.base.Suppliers.memoize(new com.google.common.base.Supplier() { // from class: com.google.android.gms.internal.measurement.zzjz
                            @Override // com.google.common.base.Supplier
                            public final java.lang.Object get() {
                                int i = com.google.android.gms.internal.measurement.zzki.zzc;
                                return com.google.android.gms.internal.measurement.zzjv.zza(context);
                            }
                        }));
                        zzg.incrementAndGet();
                    }
                }
            }
        }
    }

    @javax.annotation.Nullable
    abstract java.lang.Object zza(java.lang.Object obj);

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r2
  0x0047: PHI (r2v1 com.google.common.base.Optional) = (r2v0 com.google.common.base.Optional), (r2v0 com.google.common.base.Optional), (r2v7 com.google.common.base.Optional) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final java.lang.Object zzb() {
        java.lang.String strZza;
        com.google.android.gms.internal.measurement.zzjr zzjrVarZza;
        java.lang.String strZzb;
        java.lang.Object objZzb;
        int i = zzg.get();
        if (this.zzi < i) {
            synchronized (this) {
                if (this.zzi < i) {
                    com.google.android.gms.internal.measurement.zzkg zzkgVar = zze;
                    com.google.common.base.Optional optionalAbsent = com.google.common.base.Optional.absent();
                    java.lang.Object objZza = null;
                    if (zzkgVar == null || zzkgVar.zzb() == null) {
                        strZza = null;
                    } else {
                        optionalAbsent = (com.google.common.base.Optional) ((com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(zzkgVar.zzb())).get();
                        if (optionalAbsent.isPresent()) {
                            com.google.android.gms.internal.measurement.zzjo zzjoVar = (com.google.android.gms.internal.measurement.zzjo) optionalAbsent.get();
                            com.google.android.gms.internal.measurement.zzkf zzkfVar = this.zza;
                            strZza = zzjoVar.zza(zzkfVar.zza, null, zzkfVar.zzc, this.zzb);
                        } else {
                            strZza = null;
                        }
                    }
                    com.google.common.base.Preconditions.checkState(zzkgVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    com.google.android.gms.internal.measurement.zzkf zzkfVar2 = this.zza;
                    android.net.Uri uri = zzkfVar2.zza;
                    if (uri != null) {
                        zzjrVarZza = com.google.android.gms.internal.measurement.zzjw.zza(zzkgVar.zza(), uri) ? com.google.android.gms.internal.measurement.zzjm.zza(zzkgVar.zza().getContentResolver(), uri, new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.zzjy
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.gms.internal.measurement.zzki.zzc();
                            }
                        }) : null;
                    } else {
                        zzjrVarZza = com.google.android.gms.internal.measurement.zzkk.zza(zzkgVar.zza(), (java.lang.String) com.google.common.base.Preconditions.checkNotNull(null), new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.zzjy
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.gms.internal.measurement.zzki.zzc();
                            }
                        });
                    }
                    java.lang.Object objZza2 = (zzjrVarZza == null || (objZzb = zzjrVarZza.zzb(this.zzb)) == null) ? null : zza(objZzb);
                    if (objZza2 == null) {
                        if (!zzkfVar2.zzd && (strZzb = com.google.android.gms.internal.measurement.zzju.zza(zzkgVar.zza()).zzb(this.zzb)) != null) {
                            objZza = zza(strZzb);
                        }
                        objZza2 = objZza == null ? this.zzh : objZza;
                    }
                    if (optionalAbsent.isPresent()) {
                        objZza2 = strZza == null ? this.zzh : zza(strZza);
                    }
                    this.zzj = objZza2;
                    this.zzi = i;
                }
            }
        }
        return this.zzj;
    }
}
