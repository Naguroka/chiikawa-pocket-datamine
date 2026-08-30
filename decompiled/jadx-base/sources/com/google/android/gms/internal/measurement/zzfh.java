package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfh extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzfh zzb;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.zzmj zzf = zzcn();
    private com.google.android.gms.internal.measurement.zzmj zzg = zzcn();
    private boolean zzh;
    private boolean zzi;

    static {
        com.google.android.gms.internal.measurement.zzfh zzfhVar = new com.google.android.gms.internal.measurement.zzfh();
        zzb = zzfhVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzfh zzfhVar, int i, com.google.android.gms.internal.measurement.zzfj zzfjVar) {
        zzfjVar.getClass();
        com.google.android.gms.internal.measurement.zzmj zzmjVar = zzfhVar.zzg;
        if (!zzmjVar.zzc()) {
            zzfhVar.zzg = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
        }
        zzfhVar.zzg.set(i, zzfjVar);
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzfh zzfhVar, int i, com.google.android.gms.internal.measurement.zzfr zzfrVar) {
        zzfrVar.getClass();
        com.google.android.gms.internal.measurement.zzmj zzmjVar = zzfhVar.zzf;
        if (!zzmjVar.zzc()) {
            zzfhVar.zzf = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
        }
        zzfhVar.zzf.set(i, zzfrVar);
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzg.size();
    }

    public final int zzc() {
        return this.zzf.size();
    }

    public final com.google.android.gms.internal.measurement.zzfj zze(int i) {
        return (com.google.android.gms.internal.measurement.zzfj) this.zzg.get(i);
    }

    public final com.google.android.gms.internal.measurement.zzfr zzf(int i) {
        return (com.google.android.gms.internal.measurement.zzfr) this.zzf.get(i);
    }

    public final java.util.List zzg() {
        return this.zzg;
    }

    public final java.util.List zzh() {
        return this.zzf;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", com.google.android.gms.internal.measurement.zzfr.class, "zzg", com.google.android.gms.internal.measurement.zzfj.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfh();
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfg(zzfwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
