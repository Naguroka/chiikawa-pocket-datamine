package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    final com.google.android.gms.internal.measurement.zzf zza;
    com.google.android.gms.internal.measurement.zzg zzb;
    final com.google.android.gms.internal.measurement.zzab zzc;
    private final com.google.android.gms.internal.measurement.zzz zzd;

    public zzc() {
        com.google.android.gms.internal.measurement.zzf zzfVar = new com.google.android.gms.internal.measurement.zzf();
        this.zza = zzfVar;
        this.zzb = zzfVar.zzb.zza();
        this.zzc = new com.google.android.gms.internal.measurement.zzab();
        this.zzd = new com.google.android.gms.internal.measurement.zzz();
        zzfVar.zzd.zza("internal.registerCallback", new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.android.gms.internal.measurement.zzc.zzb(this.zza);
            }
        });
        zzfVar.zzd.zza("internal.eventLogger", new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.measurement.zzk(this.zza.zzc);
            }
        });
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzai zzb(com.google.android.gms.internal.measurement.zzc zzcVar) {
        return new com.google.android.gms.internal.measurement.zzv(zzcVar.zzd);
    }

    public final com.google.android.gms.internal.measurement.zzab zza() {
        return this.zzc;
    }

    public final void zzc(com.google.android.gms.internal.measurement.zziv zzivVar) throws com.google.android.gms.internal.measurement.zzd {
        com.google.android.gms.internal.measurement.zzai zzaiVar;
        try {
            com.google.android.gms.internal.measurement.zzf zzfVar = this.zza;
            this.zzb = zzfVar.zzb.zza();
            if (zzfVar.zza(this.zzb, (com.google.android.gms.internal.measurement.zziz[]) zzivVar.zzc().toArray(new com.google.android.gms.internal.measurement.zziz[0])) instanceof com.google.android.gms.internal.measurement.zzag) {
                throw new java.lang.IllegalStateException("Program loading failed");
            }
            for (com.google.android.gms.internal.measurement.zzit zzitVar : zzivVar.zza().zzd()) {
                java.util.List listZzc = zzitVar.zzc();
                java.lang.String strZzb = zzitVar.zzb();
                java.util.Iterator it = listZzc.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzap zzapVarZza = zzfVar.zza(this.zzb, (com.google.android.gms.internal.measurement.zziz) it.next());
                    if (!(zzapVarZza instanceof com.google.android.gms.internal.measurement.zzam)) {
                        throw new java.lang.IllegalArgumentException("Invalid rule definition");
                    }
                    com.google.android.gms.internal.measurement.zzg zzgVar = this.zzb;
                    if (zzgVar.zzh(strZzb)) {
                        com.google.android.gms.internal.measurement.zzap zzapVarZzd = zzgVar.zzd(strZzb);
                        if (!(zzapVarZzd instanceof com.google.android.gms.internal.measurement.zzai)) {
                            throw new java.lang.IllegalStateException("Invalid function name: ".concat(java.lang.String.valueOf(strZzb)));
                        }
                        zzaiVar = (com.google.android.gms.internal.measurement.zzai) zzapVarZzd;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        throw new java.lang.IllegalStateException("Rule function is undefined: ".concat(java.lang.String.valueOf(strZzb)));
                    }
                    zzaiVar.zza(this.zzb, java.util.Collections.singletonList(zzapVarZza));
                }
            }
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.measurement.zzd(th);
        }
    }

    public final void zzd(java.lang.String str, java.util.concurrent.Callable callable) {
        this.zza.zzd.zza(str, callable);
    }

    public final boolean zze(com.google.android.gms.internal.measurement.zzaa zzaaVar) throws com.google.android.gms.internal.measurement.zzd {
        try {
            com.google.android.gms.internal.measurement.zzab zzabVar = this.zzc;
            zzabVar.zzd(zzaaVar);
            this.zza.zzc.zzg("runtime.counter", new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(0.0d)));
            this.zzd.zzb(this.zzb.zza(), zzabVar);
            return zzg() || zzf();
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.measurement.zzd(th);
        }
    }

    public final boolean zzf() {
        return !this.zzc.zzc().isEmpty();
    }

    public final boolean zzg() {
        com.google.android.gms.internal.measurement.zzab zzabVar = this.zzc;
        return !zzabVar.zzb().equals(zzabVar.zza());
    }
}
