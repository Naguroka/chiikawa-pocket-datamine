package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzms {
    protected volatile com.google.android.gms.internal.measurement.zznh zza;
    private volatile com.google.android.gms.internal.measurement.zzld zzb;
    private volatile boolean zzc;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzms)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzms zzmsVar = (com.google.android.gms.internal.measurement.zzms) obj;
        com.google.android.gms.internal.measurement.zznh zznhVar = this.zza;
        com.google.android.gms.internal.measurement.zznh zznhVar2 = zzmsVar.zza;
        if (zznhVar == null && zznhVar2 == null) {
            return zzb().equals(zzmsVar.zzb());
        }
        if (zznhVar != null && zznhVar2 != null) {
            return zznhVar.equals(zznhVar2);
        }
        if (zznhVar != null) {
            zzmsVar.zzd(zznhVar.zzcC());
            return zznhVar.equals(zzmsVar.zza);
        }
        zzd(zznhVar2.zzcC());
        return this.zza.equals(zznhVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((com.google.android.gms.internal.measurement.zzlb) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzcf();
        }
        return 0;
    }

    public final com.google.android.gms.internal.measurement.zzld zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = com.google.android.gms.internal.measurement.zzld.zzb;
            } else {
                this.zzb = this.zza.zzcb();
            }
            return this.zzb;
        }
    }

    public final com.google.android.gms.internal.measurement.zznh zzc(com.google.android.gms.internal.measurement.zznh zznhVar) {
        com.google.android.gms.internal.measurement.zznh zznhVar2 = this.zza;
        this.zzb = null;
        this.zza = zznhVar;
        return zznhVar2;
    }

    protected final void zzd(com.google.android.gms.internal.measurement.zznh zznhVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zznhVar;
                this.zzb = com.google.android.gms.internal.measurement.zzld.zzb;
            } catch (com.google.android.gms.internal.measurement.zzmm unused) {
                this.zzc = true;
                this.zza = zznhVar;
                this.zzb = com.google.android.gms.internal.measurement.zzld.zzb;
            }
        }
    }
}
