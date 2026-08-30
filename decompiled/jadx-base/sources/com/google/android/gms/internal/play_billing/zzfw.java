package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzfw {
    protected volatile com.google.android.gms.internal.play_billing.zzgl zza;
    private volatile com.google.android.gms.internal.play_billing.zzei zzb;
    private volatile boolean zzc;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzfw)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.zzfw zzfwVar = (com.google.android.gms.internal.play_billing.zzfw) obj;
        com.google.android.gms.internal.play_billing.zzgl zzglVar = this.zza;
        com.google.android.gms.internal.play_billing.zzgl zzglVar2 = zzfwVar.zza;
        if (zzglVar == null && zzglVar2 == null) {
            return zzb().equals(zzfwVar.zzb());
        }
        if (zzglVar != null && zzglVar2 != null) {
            return zzglVar.equals(zzglVar2);
        }
        if (zzglVar != null) {
            zzfwVar.zzd(zzglVar.zzh());
            return zzglVar.equals(zzfwVar.zza);
        }
        zzd(zzglVar2.zzh());
        return this.zza.equals(zzglVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((com.google.android.gms.internal.play_billing.zzeg) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzj();
        }
        return 0;
    }

    public final com.google.android.gms.internal.play_billing.zzei zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = com.google.android.gms.internal.play_billing.zzei.zzb;
            } else {
                this.zzb = this.zza.zzf();
            }
            return this.zzb;
        }
    }

    public final com.google.android.gms.internal.play_billing.zzgl zzc(com.google.android.gms.internal.play_billing.zzgl zzglVar) {
        com.google.android.gms.internal.play_billing.zzgl zzglVar2 = this.zza;
        this.zzb = null;
        this.zza = zzglVar;
        return zzglVar2;
    }

    protected final void zzd(com.google.android.gms.internal.play_billing.zzgl zzglVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzglVar;
                this.zzb = com.google.android.gms.internal.play_billing.zzei.zzb;
            } catch (com.google.android.gms.internal.play_billing.zzfq unused) {
                this.zzc = true;
                this.zza = zzglVar;
                this.zzb = com.google.android.gms.internal.play_billing.zzei.zzb;
            }
        }
    }
}
