package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbzf {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzbzq zzb;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.Object zzd = new java.lang.Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final java.util.LinkedList zzc = new java.util.LinkedList();

    zzbzf(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzbzq zzbzqVar, java.lang.String str, java.lang.String str2) {
        this.zza = clock;
        this.zzb = zzbzqVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final android.os.Bundle zza() {
        android.os.Bundle bundle;
        synchronized (this.zzd) {
            bundle = new android.os.Bundle();
            bundle.putString("seq_num", this.zze);
            bundle.putString("slotid", this.zzf);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzj);
            bundle.putLong("tresponse", this.zzk);
            bundle.putLong("timp", this.zzg);
            bundle.putLong("tload", this.zzh);
            bundle.putLong("pcc", this.zzi);
            bundle.putLong("tfetch", -1L);
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            java.util.Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.google.android.gms.internal.ads.zzbze) it.next()).zzb());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final java.lang.String zzc() {
        return this.zze;
    }

    public final void zzd() {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                com.google.android.gms.internal.ads.zzbze zzbzeVar = new com.google.android.gms.internal.ads.zzbze(this);
                zzbzeVar.zzd();
                this.zzc.add(zzbzeVar);
                this.zzi++;
                this.zzb.zzf();
                this.zzb.zze(this);
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && !this.zzc.isEmpty()) {
                com.google.android.gms.internal.ads.zzbze zzbzeVar = (com.google.android.gms.internal.ads.zzbze) this.zzc.getLast();
                if (zzbzeVar.zza() == -1) {
                    zzbzeVar.zzc();
                    this.zzb.zze(this);
                }
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && this.zzg == -1) {
                this.zzg = this.zza.elapsedRealtime();
                this.zzb.zze(this);
            }
            this.zzb.zzg();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzh(boolean z) {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                this.zzh = this.zza.elapsedRealtime();
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zzb.zzi();
        }
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        synchronized (this.zzd) {
            long jElapsedRealtime = this.zza.elapsedRealtime();
            this.zzj = jElapsedRealtime;
            this.zzb.zzj(zzmVar, jElapsedRealtime);
        }
    }

    public final void zzk(long j) {
        synchronized (this.zzd) {
            this.zzk = j;
            if (j != -1) {
                this.zzb.zze(this);
            }
        }
    }
}
