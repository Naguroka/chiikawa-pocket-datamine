package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzgyn {
    protected volatile com.google.android.gms.internal.ads.zzgzc zza;
    private volatile com.google.android.gms.internal.ads.zzgwj zzb;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgyn)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgyn zzgynVar = (com.google.android.gms.internal.ads.zzgyn) obj;
        com.google.android.gms.internal.ads.zzgzc zzgzcVar = this.zza;
        com.google.android.gms.internal.ads.zzgzc zzgzcVar2 = zzgynVar.zza;
        if (zzgzcVar == null && zzgzcVar2 == null) {
            return zzb().equals(zzgynVar.zzb());
        }
        if (zzgzcVar != null && zzgzcVar2 != null) {
            return zzgzcVar.equals(zzgzcVar2);
        }
        if (zzgzcVar != null) {
            zzgynVar.zzd(zzgzcVar.zzbt());
            return zzgzcVar.equals(zzgynVar.zza);
        }
        zzd(zzgzcVar2.zzbt());
        return this.zza.equals(zzgzcVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((com.google.android.gms.internal.ads.zzgwg) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final com.google.android.gms.internal.ads.zzgwj zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = com.google.android.gms.internal.ads.zzgwj.zzb;
            } else {
                this.zzb = this.zza.zzaN();
            }
            return this.zzb;
        }
    }

    public final com.google.android.gms.internal.ads.zzgzc zzc(com.google.android.gms.internal.ads.zzgzc zzgzcVar) {
        com.google.android.gms.internal.ads.zzgzc zzgzcVar2 = this.zza;
        this.zzb = null;
        this.zza = zzgzcVar;
        return zzgzcVar2;
    }

    protected final void zzd(com.google.android.gms.internal.ads.zzgzc zzgzcVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzgzcVar;
                this.zzb = com.google.android.gms.internal.ads.zzgwj.zzb;
            } catch (com.google.android.gms.internal.ads.zzgyg unused) {
                this.zza = zzgzcVar;
                this.zzb = com.google.android.gms.internal.ads.zzgwj.zzb;
            }
        }
    }
}
