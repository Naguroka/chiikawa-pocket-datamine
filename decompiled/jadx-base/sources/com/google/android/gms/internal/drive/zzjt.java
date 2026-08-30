package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzjt implements com.google.android.gms.internal.drive.zzns {
    private final com.google.android.gms.internal.drive.zzjr zznx;

    public static com.google.android.gms.internal.drive.zzjt zza(com.google.android.gms.internal.drive.zzjr zzjrVar) {
        return zzjrVar.zzoh != null ? zzjrVar.zzoh : new com.google.android.gms.internal.drive.zzjt(zzjrVar);
    }

    private zzjt(com.google.android.gms.internal.drive.zzjr zzjrVar) {
        com.google.android.gms.internal.drive.zzjr zzjrVar2 = (com.google.android.gms.internal.drive.zzjr) com.google.android.gms.internal.drive.zzkm.zza(zzjrVar, org.jacoco.core.runtime.AgentOptions.OUTPUT);
        this.zznx = zzjrVar2;
        zzjrVar2.zzoh = this;
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final int zzcd() {
        return com.google.android.gms.internal.drive.zzkk.zze.zzsi;
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzm(int i, int i2) throws java.io.IOException {
        this.zznx.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzi(int i, long j) throws java.io.IOException {
        this.zznx.zza(i, j);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzj(int i, long j) throws java.io.IOException {
        this.zznx.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, float f) throws java.io.IOException {
        this.zznx.zza(i, f);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, double d) throws java.io.IOException {
        this.zznx.zza(i, d);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzn(int i, int i2) throws java.io.IOException {
        this.zznx.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, long j) throws java.io.IOException {
        this.zznx.zza(i, j);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzc(int i, int i2) throws java.io.IOException {
        this.zznx.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzc(int i, long j) throws java.io.IOException {
        this.zznx.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzf(int i, int i2) throws java.io.IOException {
        this.zznx.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int i, boolean z) throws java.io.IOException {
        this.zznx.zzb(i, z);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, java.lang.String str) throws java.io.IOException {
        this.zznx.zza(i, str);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, com.google.android.gms.internal.drive.zzjc zzjcVar) throws java.io.IOException {
        this.zznx.zza(i, zzjcVar);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzd(int i, int i2) throws java.io.IOException {
        this.zznx.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zze(int i, int i2) throws java.io.IOException {
        this.zznx.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int i, long j) throws java.io.IOException {
        this.zznx.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, java.lang.Object obj, com.google.android.gms.internal.drive.zzmf zzmfVar) throws java.io.IOException {
        this.zznx.zza(i, (com.google.android.gms.internal.drive.zzlq) obj, zzmfVar);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.drive.zzmf zzmfVar) throws java.io.IOException {
        com.google.android.gms.internal.drive.zzjr zzjrVar = this.zznx;
        zzjrVar.zzb(i, 3);
        zzmfVar.zza((com.google.android.gms.internal.drive.zzlq) obj, zzjrVar.zzoh);
        zzjrVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzak(int i) throws java.io.IOException {
        this.zznx.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzal(int i) throws java.io.IOException {
        this.zznx.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.drive.zzjc) {
            this.zznx.zzb(i, (com.google.android.gms.internal.drive.zzjc) obj);
        } else {
            this.zznx.zza(i, (com.google.android.gms.internal.drive.zzlq) obj);
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzac = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzac += com.google.android.gms.internal.drive.zzjr.zzac(list.get(i3).intValue());
            }
            this.zznx.zzy(iZzac);
            while (i2 < list.size()) {
                this.zznx.zzx(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzaf = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzaf += com.google.android.gms.internal.drive.zzjr.zzaf(list.get(i3).intValue());
            }
            this.zznx.zzy(iZzaf);
            while (i2 < list.size()) {
                this.zznx.zzaa(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzc(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzo = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzo += com.google.android.gms.internal.drive.zzjr.zzo(list.get(i3).longValue());
            }
            this.zznx.zzy(iZzo);
            while (i2 < list.size()) {
                this.zznx.zzl(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzd(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzp = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzp += com.google.android.gms.internal.drive.zzjr.zzp(list.get(i3).longValue());
            }
            this.zznx.zzy(iZzp);
            while (i2 < list.size()) {
                this.zznx.zzl(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zze(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzr = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzr += com.google.android.gms.internal.drive.zzjr.zzr(list.get(i3).longValue());
            }
            this.zznx.zzy(iZzr);
            while (i2 < list.size()) {
                this.zznx.zzn(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzf(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzb += com.google.android.gms.internal.drive.zzjr.zzb(list.get(i3).floatValue());
            }
            this.zznx.zzy(iZzb);
            while (i2 < list.size()) {
                this.zznx.zza(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzg(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzb += com.google.android.gms.internal.drive.zzjr.zzb(list.get(i3).doubleValue());
            }
            this.zznx.zzy(iZzb);
            while (i2 < list.size()) {
                this.zznx.zza(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzh(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzah = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzah += com.google.android.gms.internal.drive.zzjr.zzah(list.get(i3).intValue());
            }
            this.zznx.zzy(iZzah);
            while (i2 < list.size()) {
                this.zznx.zzx(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzi(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzd += com.google.android.gms.internal.drive.zzjr.zzd(list.get(i3).booleanValue());
            }
            this.zznx.zzy(iZzd);
            while (i2 < list.size()) {
                this.zznx.zzc(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzb(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        int i2 = 0;
        if (list instanceof com.google.android.gms.internal.drive.zzkz) {
            com.google.android.gms.internal.drive.zzkz zzkzVar = (com.google.android.gms.internal.drive.zzkz) list;
            while (i2 < list.size()) {
                java.lang.Object objZzao = zzkzVar.zzao(i2);
                if (objZzao instanceof java.lang.String) {
                    this.zznx.zza(i, (java.lang.String) objZzao);
                } else {
                    this.zznx.zza(i, (com.google.android.gms.internal.drive.zzjc) objZzao);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zza(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int i, java.util.List<com.google.android.gms.internal.drive.zzjc> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zznx.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzj(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzad = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzad += com.google.android.gms.internal.drive.zzjr.zzad(list.get(i3).intValue());
            }
            this.zznx.zzy(iZzad);
            while (i2 < list.size()) {
                this.zznx.zzy(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzd(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzk(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzag = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzag += com.google.android.gms.internal.drive.zzjr.zzag(list.get(i3).intValue());
            }
            this.zznx.zzy(iZzag);
            while (i2 < list.size()) {
                this.zznx.zzaa(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzl(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzs = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzs += com.google.android.gms.internal.drive.zzjr.zzs(list.get(i3).longValue());
            }
            this.zznx.zzy(iZzs);
            while (i2 < list.size()) {
                this.zznx.zzn(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzm(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzae = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzae += com.google.android.gms.internal.drive.zzjr.zzae(list.get(i3).intValue());
            }
            this.zznx.zzy(iZzae);
            while (i2 < list.size()) {
                this.zznx.zzz(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzn(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int iZzq = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzq += com.google.android.gms.internal.drive.zzjr.zzq(list.get(i3).longValue());
            }
            this.zznx.zzy(iZzq);
            while (i2 < list.size()) {
                this.zznx.zzm(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zza(int i, java.util.List<?> list, com.google.android.gms.internal.drive.zzmf zzmfVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzmfVar);
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final void zzb(int i, java.util.List<?> list, com.google.android.gms.internal.drive.zzmf zzmfVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzmfVar);
        }
    }

    @Override // com.google.android.gms.internal.drive.zzns
    public final <K, V> void zza(int i, com.google.android.gms.internal.drive.zzlj<K, V> zzljVar, java.util.Map<K, V> map) throws java.io.IOException {
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            this.zznx.zzb(i, 2);
            this.zznx.zzy(com.google.android.gms.internal.drive.zzli.zza(zzljVar, entry.getKey(), entry.getValue()));
            com.google.android.gms.internal.drive.zzli.zza(this.zznx, zzljVar, entry.getKey(), entry.getValue());
        }
    }
}
