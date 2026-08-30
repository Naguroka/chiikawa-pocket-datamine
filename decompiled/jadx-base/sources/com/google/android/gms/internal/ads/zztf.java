package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zztf implements com.google.android.gms.internal.ads.zzui {
    private final java.util.ArrayList zza = new java.util.ArrayList(1);
    private final java.util.HashSet zzb = new java.util.HashSet(1);
    private final com.google.android.gms.internal.ads.zzuq zzc = new com.google.android.gms.internal.ads.zzuq();
    private final com.google.android.gms.internal.ads.zzra zzd = new com.google.android.gms.internal.ads.zzra();
    private android.os.Looper zze;
    private com.google.android.gms.internal.ads.zzbq zzf;
    private com.google.android.gms.internal.ads.zzog zzg;

    @Override // com.google.android.gms.internal.ads.zzui
    public /* synthetic */ com.google.android.gms.internal.ads.zzbq zzM() {
        return null;
    }

    protected final com.google.android.gms.internal.ads.zzog zzb() {
        com.google.android.gms.internal.ads.zzog zzogVar = this.zzg;
        com.google.android.gms.internal.ads.zzcw.zzb(zzogVar);
        return zzogVar;
    }

    protected final com.google.android.gms.internal.ads.zzra zzc(com.google.android.gms.internal.ads.zzug zzugVar) {
        return this.zzd.zza(0, zzugVar);
    }

    protected final com.google.android.gms.internal.ads.zzra zzd(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        return this.zzd.zza(0, zzugVar);
    }

    protected final com.google.android.gms.internal.ads.zzuq zze(com.google.android.gms.internal.ads.zzug zzugVar) {
        return this.zzc.zza(0, zzugVar);
    }

    protected final com.google.android.gms.internal.ads.zzuq zzf(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        return this.zzc.zza(0, zzugVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzg(android.os.Handler handler, com.google.android.gms.internal.ads.zzrb zzrbVar) {
        this.zzd.zzb(handler, zzrbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzh(android.os.Handler handler, com.google.android.gms.internal.ads.zzur zzurVar) {
        this.zzc.zzb(handler, zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzi(com.google.android.gms.internal.ads.zzuh zzuhVar) {
        boolean z = !this.zzb.isEmpty();
        this.zzb.remove(zzuhVar);
        if (z && this.zzb.isEmpty()) {
            zzj();
        }
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzk(com.google.android.gms.internal.ads.zzuh zzuhVar) {
        this.zze.getClass();
        java.util.HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzuhVar);
        if (zIsEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzm(com.google.android.gms.internal.ads.zzuh zzuhVar, com.google.android.gms.internal.ads.zzgy zzgyVar, com.google.android.gms.internal.ads.zzog zzogVar) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        this.zzg = zzogVar;
        com.google.android.gms.internal.ads.zzbq zzbqVar = this.zzf;
        this.zza.add(zzuhVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzuhVar);
            zzn(zzgyVar);
        } else if (zzbqVar != null) {
            zzk(zzuhVar);
            zzuhVar.zza(this, zzbqVar);
        }
    }

    protected abstract void zzn(com.google.android.gms.internal.ads.zzgy zzgyVar);

    protected final void zzo(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        this.zzf = zzbqVar;
        java.util.ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.internal.ads.zzuh) arrayList.get(i)).zza(this, zzbqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzp(com.google.android.gms.internal.ads.zzuh zzuhVar) {
        this.zza.remove(zzuhVar);
        if (!this.zza.isEmpty()) {
            zzi(zzuhVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzr(com.google.android.gms.internal.ads.zzrb zzrbVar) {
        this.zzd.zzc(zzrbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzs(com.google.android.gms.internal.ads.zzur zzurVar) {
        this.zzc.zzi(zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public /* synthetic */ void zzt(com.google.android.gms.internal.ads.zzar zzarVar) {
        throw null;
    }

    protected final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
