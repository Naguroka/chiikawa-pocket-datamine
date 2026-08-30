package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbzq implements com.google.android.gms.internal.ads.zzazd {
    final com.google.android.gms.internal.ads.zzbzn zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final java.lang.Object zzd = new java.lang.Object();
    final java.util.HashSet zzb = new java.util.HashSet();
    final java.util.HashSet zzc = new java.util.HashSet();
    private boolean zzg = false;
    private final com.google.android.gms.internal.ads.zzbzo zzf = new com.google.android.gms.internal.ads.zzbzo();

    public zzbzq(java.lang.String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new com.google.android.gms.internal.ads.zzbzn(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final void zza(boolean z) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        if (!z) {
            this.zze.zzr(jCurrentTimeMillis);
            this.zze.zzG(this.zza.zzd);
            return;
        }
        if (jCurrentTimeMillis - this.zze.zzd() > ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbd)).longValue()) {
            this.zza.zzd = -1;
        } else {
            this.zza.zzd = this.zze.zzc();
        }
        this.zzg = true;
    }

    public final int zzb() {
        int iZza;
        synchronized (this.zzd) {
            iZza = this.zza.zza();
        }
        return iZza;
    }

    public final com.google.android.gms.internal.ads.zzbzf zzc(com.google.android.gms.common.util.Clock clock, java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzbzf(clock, this, this.zzf.zza(), str);
    }

    public final java.lang.String zzd() {
        return this.zzf.zzb();
    }

    public final void zze(com.google.android.gms.internal.ads.zzbzf zzbzfVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzbzfVar);
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        synchronized (this.zzd) {
            this.zza.zzg(zzmVar, j);
        }
    }

    public final void zzk() {
        synchronized (this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(java.util.HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final android.os.Bundle zzn(android.content.Context context, com.google.android.gms.internal.ads.zzfdq zzfdqVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBundle("app", this.zza.zzb(context, this.zzf.zzb()));
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.util.Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((com.google.android.gms.internal.ads.zzbzf) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfdqVar.zzc(hashSet);
        return bundle;
    }
}
