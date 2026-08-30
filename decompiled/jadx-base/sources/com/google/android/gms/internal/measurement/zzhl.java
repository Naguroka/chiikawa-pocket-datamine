package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhl extends com.google.android.gms.internal.measurement.zzlz implements com.google.android.gms.internal.measurement.zzni {
    private zzhl() {
        throw null;
    }

    /* synthetic */ zzhl(com.google.android.gms.internal.measurement.zzip zzipVar) {
        super(com.google.android.gms.internal.measurement.zzhm.zzb);
    }

    public final int zza() {
        return ((com.google.android.gms.internal.measurement.zzhm) this.zza).zzb();
    }

    public final long zzb() {
        return ((com.google.android.gms.internal.measurement.zzhm) this.zza).zzc();
    }

    public final long zzc() {
        return ((com.google.android.gms.internal.measurement.zzhm) this.zza).zzd();
    }

    public final com.google.android.gms.internal.measurement.zzhl zzd(java.lang.Iterable iterable) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhm.zzj((com.google.android.gms.internal.measurement.zzhm) this.zza, iterable);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhl zze(com.google.android.gms.internal.measurement.zzhp zzhpVar) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhm.zzk((com.google.android.gms.internal.measurement.zzhm) this.zza, (com.google.android.gms.internal.measurement.zzhq) zzhpVar.zzba());
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhl zzf(com.google.android.gms.internal.measurement.zzhq zzhqVar) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhm.zzk((com.google.android.gms.internal.measurement.zzhm) this.zza, zzhqVar);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhl zzg() {
        zzbe();
        ((com.google.android.gms.internal.measurement.zzhm) this.zza).zze = com.google.android.gms.internal.measurement.zzhm.zzcn();
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhl zzh(int i) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhm.zzn((com.google.android.gms.internal.measurement.zzhm) this.zza, i);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhl zzi(java.lang.String str) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhm.zzo((com.google.android.gms.internal.measurement.zzhm) this.zza, str);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhl zzj(int i, com.google.android.gms.internal.measurement.zzhp zzhpVar) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhm.zzp((com.google.android.gms.internal.measurement.zzhm) this.zza, i, (com.google.android.gms.internal.measurement.zzhq) zzhpVar.zzba());
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhl zzk(int i, com.google.android.gms.internal.measurement.zzhq zzhqVar) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhm.zzp((com.google.android.gms.internal.measurement.zzhm) this.zza, i, zzhqVar);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhl zzl(long j) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhm.zzq((com.google.android.gms.internal.measurement.zzhm) this.zza, j);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhl zzm(long j) {
        zzbe();
        com.google.android.gms.internal.measurement.zzhm.zzr((com.google.android.gms.internal.measurement.zzhm) this.zza, j);
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzhq zzn(int i) {
        return ((com.google.android.gms.internal.measurement.zzhm) this.zza).zzg(i);
    }

    public final java.lang.String zzo() {
        return ((com.google.android.gms.internal.measurement.zzhm) this.zza).zzh();
    }

    public final java.util.List zzp() {
        return java.util.Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzhm) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((com.google.android.gms.internal.measurement.zzhm) this.zza).zzu();
    }
}
