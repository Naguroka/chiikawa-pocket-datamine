package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgn extends com.google.android.gms.internal.measurement.zzlz implements com.google.android.gms.internal.measurement.zzni {
    private zzgn() {
        throw null;
    }

    /* synthetic */ zzgn(com.google.android.gms.internal.measurement.zzgz zzgzVar) {
        super(com.google.android.gms.internal.measurement.zzgo.zzb);
    }

    public final int zza() {
        return ((com.google.android.gms.internal.measurement.zzgo) this.zza).zzb();
    }

    public final com.google.android.gms.internal.measurement.zzgm zzb(int i) {
        return ((com.google.android.gms.internal.measurement.zzgo) this.zza).zze(i);
    }

    public final com.google.android.gms.internal.measurement.zzgn zzc() {
        zzbe();
        ((com.google.android.gms.internal.measurement.zzgo) this.zza).zzj = com.google.android.gms.internal.measurement.zzgo.zzcn();
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzgn zzd() {
        zzbe();
        ((com.google.android.gms.internal.measurement.zzgo) this.zza).zzm = com.google.android.gms.internal.measurement.zzgo.zzcn();
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzgn zze(int i, com.google.android.gms.internal.measurement.zzgl zzglVar) {
        zzbe();
        com.google.android.gms.internal.measurement.zzgo.zzs((com.google.android.gms.internal.measurement.zzgo) this.zza, i, (com.google.android.gms.internal.measurement.zzgm) zzglVar.zzba());
        return this;
    }

    public final java.lang.String zzf() {
        return ((com.google.android.gms.internal.measurement.zzgo) this.zza).zzk();
    }

    public final java.util.List zzg() {
        return java.util.Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzgo) this.zza).zzm());
    }

    public final java.util.List zzh() {
        return java.util.Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzgo) this.zza).zzn());
    }
}
