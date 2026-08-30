package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzapm implements java.lang.Comparable {
    private final com.google.android.gms.internal.ads.zzapx zza;
    private final int zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final java.lang.Object zze;
    private final com.google.android.gms.internal.ads.zzapq zzf;
    private java.lang.Integer zzg;
    private com.google.android.gms.internal.ads.zzapp zzh;
    private boolean zzi;
    private com.google.android.gms.internal.ads.zzaov zzj;
    private com.google.android.gms.internal.ads.zzapl zzk;
    private final com.google.android.gms.internal.ads.zzapa zzl;

    public zzapm(int i, java.lang.String str, com.google.android.gms.internal.ads.zzapq zzapqVar) {
        android.net.Uri uri;
        java.lang.String host;
        this.zza = com.google.android.gms.internal.ads.zzapx.zza ? new com.google.android.gms.internal.ads.zzapx() : null;
        this.zze = new java.lang.Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzapqVar;
        this.zzl = new com.google.android.gms.internal.ads.zzapa();
        if (!android.text.TextUtils.isEmpty(str) && (uri = android.net.Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.zzg.intValue() - ((com.google.android.gms.internal.ads.zzapm) obj).zzg.intValue();
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(strValueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzaov zzd() {
        return this.zzj;
    }

    public final com.google.android.gms.internal.ads.zzapm zze(com.google.android.gms.internal.ads.zzaov zzaovVar) {
        this.zzj = zzaovVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzapm zzf(com.google.android.gms.internal.ads.zzapp zzappVar) {
        this.zzh = zzappVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzapm zzg(int i) {
        this.zzg = java.lang.Integer.valueOf(i);
        return this;
    }

    protected abstract com.google.android.gms.internal.ads.zzaps zzh(com.google.android.gms.internal.ads.zzapi zzapiVar);

    public final java.lang.String zzj() {
        int i = this.zzb;
        java.lang.String str = this.zzc;
        if (i == 0) {
            return str;
        }
        return java.lang.Integer.toString(1) + "-" + str;
    }

    public final java.lang.String zzk() {
        return this.zzc;
    }

    public java.util.Map zzl() throws com.google.android.gms.internal.ads.zzaou {
        return java.util.Collections.emptyMap();
    }

    public final void zzm(java.lang.String str) {
        if (com.google.android.gms.internal.ads.zzapx.zza) {
            this.zza.zza(str, java.lang.Thread.currentThread().getId());
        }
    }

    public final void zzn(com.google.android.gms.internal.ads.zzapv zzapvVar) {
        com.google.android.gms.internal.ads.zzapq zzapqVar;
        synchronized (this.zze) {
            zzapqVar = this.zzf;
        }
        zzapqVar.zza(zzapvVar);
    }

    protected abstract void zzo(java.lang.Object obj);

    final void zzp(java.lang.String str) {
        com.google.android.gms.internal.ads.zzapp zzappVar = this.zzh;
        if (zzappVar != null) {
            zzappVar.zzb(this);
        }
        if (com.google.android.gms.internal.ads.zzapx.zza) {
            long id = java.lang.Thread.currentThread().getId();
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.google.android.gms.internal.ads.zzapk(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    final void zzr() {
        com.google.android.gms.internal.ads.zzapl zzaplVar;
        synchronized (this.zze) {
            zzaplVar = this.zzk;
        }
        if (zzaplVar != null) {
            zzaplVar.zza(this);
        }
    }

    final void zzs(com.google.android.gms.internal.ads.zzaps zzapsVar) {
        com.google.android.gms.internal.ads.zzapl zzaplVar;
        synchronized (this.zze) {
            zzaplVar = this.zzk;
        }
        if (zzaplVar != null) {
            zzaplVar.zzb(this, zzapsVar);
        }
    }

    final void zzt(int i) {
        com.google.android.gms.internal.ads.zzapp zzappVar = this.zzh;
        if (zzappVar != null) {
            zzappVar.zzc(this, i);
        }
    }

    final void zzu(com.google.android.gms.internal.ads.zzapl zzaplVar) {
        synchronized (this.zze) {
            this.zzk = zzaplVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws com.google.android.gms.internal.ads.zzaou {
        return null;
    }

    public final com.google.android.gms.internal.ads.zzapa zzy() {
        return this.zzl;
    }
}
