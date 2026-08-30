package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzht extends com.google.android.gms.internal.measurement.zzlz implements com.google.android.gms.internal.measurement.zzni {
    private zzht() {
        throw null;
    }

    /* synthetic */ zzht(com.google.android.gms.internal.measurement.zzip zzipVar) {
        super(com.google.android.gms.internal.measurement.zzhv.zzb);
    }

    public final int zza() {
        return ((com.google.android.gms.internal.measurement.zzhv) this.zza).zza();
    }

    public final com.google.android.gms.internal.measurement.zzht zzb(java.lang.Iterable iterable) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhv.zzi((com.google.android.gms.internal.measurement.zzhv) this.zza, iterable);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzht zzc(com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhv.zzj((com.google.android.gms.internal.measurement.zzhv) this.zza, (com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba());
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzht zzd() {
        zzbe();
        ((com.google.android.gms.internal.measurement.zzhv) this.zza).zze = com.google.android.gms.internal.measurement.zzhv.zzcn();
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzht zze(int i, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhv.zzm((com.google.android.gms.internal.measurement.zzhv) this.zza, i, (com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba());
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzht zzf(java.lang.String str) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhv.zzn((com.google.android.gms.internal.measurement.zzhv) this.zza, str);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzht zzg(java.lang.String str) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhv.zzo((com.google.android.gms.internal.measurement.zzhv) this.zza, str);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhx zzh(int i) {
        return ((com.google.android.gms.internal.measurement.zzhv) this.zza).zze(i);
    }

    public final java.lang.String zzi() {
        return ((com.google.android.gms.internal.measurement.zzhv) this.zza).zzf();
    }

    public final java.util.List zzj() {
        return java.util.Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzhv) this.zza).zzh());
    }
}
