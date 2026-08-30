package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzhec implements java.util.Iterator, java.io.Closeable, com.google.android.gms.internal.ads.zzara {
    private static final com.google.android.gms.internal.ads.zzaqz zza = new com.google.android.gms.internal.ads.zzheb("eof ");
    protected com.google.android.gms.internal.ads.zzaqw zzb;
    protected com.google.android.gms.internal.ads.zzhed zzc;
    com.google.android.gms.internal.ads.zzaqz zzd = null;
    long zze = 0;
    long zzf = 0;
    private final java.util.List zzg = new java.util.ArrayList();

    static {
        com.google.android.gms.internal.ads.zzhej.zzb(com.google.android.gms.internal.ads.zzhec.class);
    }

    public void close() throws java.io.IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.android.gms.internal.ads.zzaqz zzaqzVar = this.zzd;
        if (zzaqzVar == zza) {
            return false;
        }
        if (zzaqzVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (java.util.NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(com.ironsource.y8.i.d);
        for (int i = 0; i < this.zzg.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((com.google.android.gms.internal.ads.zzaqz) this.zzg.get(i)).toString());
        }
        sb.append(com.ironsource.y8.i.e);
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzaqz next() {
        com.google.android.gms.internal.ads.zzaqz zzaqzVarZzb;
        com.google.android.gms.internal.ads.zzaqz zzaqzVar = this.zzd;
        if (zzaqzVar != null && zzaqzVar != zza) {
            this.zzd = null;
            return zzaqzVar;
        }
        com.google.android.gms.internal.ads.zzhed zzhedVar = this.zzc;
        if (zzhedVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new java.util.NoSuchElementException();
        }
        try {
            synchronized (zzhedVar) {
                this.zzc.zze(this.zze);
                zzaqzVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzb();
            }
            return zzaqzVarZzb;
        } catch (java.io.EOFException unused) {
            throw new java.util.NoSuchElementException();
        } catch (java.io.IOException unused2) {
            throw new java.util.NoSuchElementException();
        }
    }

    public final java.util.List zzd() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new com.google.android.gms.internal.ads.zzhei(this.zzg, this);
    }

    public final void zze(com.google.android.gms.internal.ads.zzhed zzhedVar, long j, com.google.android.gms.internal.ads.zzaqw zzaqwVar) throws java.io.IOException {
        this.zzc = zzhedVar;
        this.zze = zzhedVar.zzb();
        zzhedVar.zze(zzhedVar.zzb() + j);
        this.zzf = zzhedVar.zzb();
        this.zzb = zzaqwVar;
    }
}
