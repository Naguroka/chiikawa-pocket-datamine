package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzae implements java.lang.Iterable, com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzal {
    final java.util.SortedMap zza;
    final java.util.Map zzb;

    public zzae() {
        this.zza = new java.util.TreeMap();
        this.zzb = new java.util.TreeMap();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzae)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzae zzaeVar = (com.google.android.gms.internal.measurement.zzae) obj;
        if (zzc() != zzaeVar.zzc()) {
            return false;
        }
        java.util.SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return zzaeVar.zza.isEmpty();
        }
        for (int iIntValue = ((java.lang.Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((java.lang.Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!zze(iIntValue).equals(zzaeVar.zze(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.zzad(this);
    }

    public final java.lang.String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc() {
        java.util.SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((java.lang.Integer) sortedMap.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || com.adjust.sdk.Constants.PUSH.equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? com.google.android.gms.internal.measurement.zzbb.zza(str, this, zzgVar, list) : com.google.android.gms.internal.measurement.zzaj.zza(this, new com.google.android.gms.internal.measurement.zzat(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
        com.google.android.gms.internal.measurement.zzae zzaeVar = new com.google.android.gms.internal.measurement.zzae();
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof com.google.android.gms.internal.measurement.zzal) {
                zzaeVar.zza.put((java.lang.Integer) entry.getKey(), (com.google.android.gms.internal.measurement.zzap) entry.getValue());
            } else {
                zzaeVar.zza.put((java.lang.Integer) entry.getKey(), ((com.google.android.gms.internal.measurement.zzap) entry.getValue()).zzd());
            }
        }
        return zzaeVar;
    }

    public final com.google.android.gms.internal.measurement.zzap zze(int i) {
        com.google.android.gms.internal.measurement.zzap zzapVar;
        if (i < zzc()) {
            return (!zzs(i) || (zzapVar = (com.google.android.gms.internal.measurement.zzap) this.zza.get(java.lang.Integer.valueOf(i))) == null) ? zzf : zzapVar;
        }
        throw new java.lang.IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final com.google.android.gms.internal.measurement.zzap zzf(java.lang.String str) {
        com.google.android.gms.internal.measurement.zzap zzapVar;
        if ("length".equals(str)) {
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzc()));
        }
        return (!zzt(str) || (zzapVar = (com.google.android.gms.internal.measurement.zzap) this.zzb.get(str)) == null) ? zzf : zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
        java.util.SortedMap sortedMap = this.zza;
        if (sortedMap.size() == 1) {
            return zze(0).zzh();
        }
        return sortedMap.size() <= 0 ? java.lang.Double.valueOf(0.0d) : java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
        return zzj(",");
    }

    public final java.lang.String zzj(java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!this.zza.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= zzc()) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzap zzapVarZze = zze(i);
                sb.append(str2);
                if (!(zzapVarZze instanceof com.google.android.gms.internal.measurement.zzau) && !(zzapVarZze instanceof com.google.android.gms.internal.measurement.zzan)) {
                    sb.append(zzapVarZze.zzi());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final java.util.Iterator zzk() {
        return this.zza.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
        return new com.google.android.gms.internal.measurement.zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final java.util.List zzm() {
        java.util.ArrayList arrayList = new java.util.ArrayList(zzc());
        for (int i = 0; i < zzc(); i++) {
            arrayList.add(zze(i));
        }
        return arrayList;
    }

    public final void zzn() {
        this.zza.clear();
    }

    public final void zzp(int i) {
        java.util.SortedMap sortedMap = this.zza;
        int iIntValue = ((java.lang.Integer) sortedMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        sortedMap.remove(java.lang.Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
            if (sortedMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            sortedMap.put(numValueOf, com.google.android.gms.internal.measurement.zzap.zzf);
            return;
        }
        while (true) {
            i++;
            if (i > ((java.lang.Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
            com.google.android.gms.internal.measurement.zzap zzapVar = (com.google.android.gms.internal.measurement.zzap) sortedMap.get(numValueOf2);
            if (zzapVar != null) {
                sortedMap.put(java.lang.Integer.valueOf(i - 1), zzapVar);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(java.lang.String str, com.google.android.gms.internal.measurement.zzap zzapVar) {
        if (zzapVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i) {
        if (i >= 0) {
            java.util.SortedMap sortedMap = this.zza;
            if (i <= ((java.lang.Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(java.lang.Integer.valueOf(i));
            }
        }
        throw new java.lang.IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(java.lang.String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    public final void zzo(int i, com.google.android.gms.internal.measurement.zzap zzapVar) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Invalid value index: " + i);
        }
        if (i >= zzc()) {
            zzq(i, zzapVar);
            return;
        }
        java.util.SortedMap sortedMap = this.zza;
        for (int iIntValue = ((java.lang.Integer) sortedMap.lastKey()).intValue(); iIntValue >= i; iIntValue--) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iIntValue);
            com.google.android.gms.internal.measurement.zzap zzapVar2 = (com.google.android.gms.internal.measurement.zzap) sortedMap.get(numValueOf);
            if (zzapVar2 != null) {
                zzq(iIntValue + 1, zzapVar2);
                sortedMap.remove(numValueOf);
            }
        }
        zzq(i, zzapVar);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"elements"})
    public final void zzq(int i, com.google.android.gms.internal.measurement.zzap zzapVar) {
        if (i > 32468) {
            throw new java.lang.IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        if (zzapVar == null) {
            this.zza.remove(java.lang.Integer.valueOf(i));
        } else {
            this.zza.put(java.lang.Integer.valueOf(i), zzapVar);
        }
    }

    public zzae(java.util.List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzq(i, (com.google.android.gms.internal.measurement.zzap) list.get(i));
            }
        }
    }
}
