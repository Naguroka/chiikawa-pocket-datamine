package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhv extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhv zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmj zze = zzcn();
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private int zzh;

    static {
        com.google.android.gms.internal.measurement.zzhv zzhvVar = new com.google.android.gms.internal.measurement.zzhv();
        zzb = zzhvVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzhv.class, zzhvVar);
    }

    private zzhv() {
    }

    public static com.google.android.gms.internal.measurement.zzht zzb() {
        return (com.google.android.gms.internal.measurement.zzht) zzb.zzcg();
    }

    public static com.google.android.gms.internal.measurement.zzht zzc(com.google.android.gms.internal.measurement.zzhv zzhvVar) {
        com.google.android.gms.internal.measurement.zzlz zzlzVarZzcg = zzb.zzcg();
        zzlzVarZzcg.zzaY(zzhvVar);
        return (com.google.android.gms.internal.measurement.zzht) zzlzVarZzcg;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzhv zzhvVar, java.lang.Iterable iterable) {
        zzhvVar.zzr();
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzhvVar.zze);
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzhv zzhvVar, com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.getClass();
        zzhvVar.zzr();
        zzhvVar.zze.add(zzhxVar);
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.measurement.zzhv zzhvVar, int i, com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.getClass();
        zzhvVar.zzr();
        zzhvVar.zze.set(i, zzhxVar);
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzhv zzhvVar, java.lang.String str) {
        str.getClass();
        zzhvVar.zzd |= 1;
        zzhvVar.zzf = str;
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.measurement.zzhv zzhvVar, java.lang.String str) {
        str.getClass();
        zzhvVar.zzd |= 2;
        zzhvVar.zzg = str;
    }

    private final void zzr() {
        com.google.android.gms.internal.measurement.zzmj zzmjVar = this.zze;
        if (zzmjVar.zzc()) {
            return;
        }
        this.zze = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    public final com.google.android.gms.internal.measurement.zzhx zze(int i) {
        return (com.google.android.gms.internal.measurement.zzhx) this.zze.get(i);
    }

    public final java.lang.String zzf() {
        return this.zzf;
    }

    public final java.lang.String zzg() {
        return this.zzg;
    }

    public final java.util.List zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.measurement.zzhx.class, "zzf", "zzg", "zzh", com.google.android.gms.internal.measurement.zzhu.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhv();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzht(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzp() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zzd & 2) != 0;
    }
}
