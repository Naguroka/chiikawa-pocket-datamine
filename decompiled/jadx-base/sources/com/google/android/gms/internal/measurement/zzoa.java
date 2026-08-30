package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzoa extends java.util.AbstractMap {
    private java.lang.Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile com.google.android.gms.internal.measurement.zzny zze;
    private java.util.Map zzc = java.util.Collections.emptyMap();
    private java.util.Map zzf = java.util.Collections.emptyMap();

    private zzoa() {
    }

    private final int zzl(java.lang.Comparable comparable) {
        int i = this.zzb - 1;
        int i2 = 0;
        if (i >= 0) {
            int iCompareTo = comparable.compareTo(((com.google.android.gms.internal.measurement.zznw) this.zza[i]).zza());
            if (iCompareTo > 0) {
                return -(i + 2);
            }
            if (iCompareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int iCompareTo2 = comparable.compareTo(((com.google.android.gms.internal.measurement.zznw) this.zza[i3]).zza());
            if (iCompareTo2 < 0) {
                i = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object zzm(int i) {
        zzo();
        java.lang.Object value = ((com.google.android.gms.internal.measurement.zznw) this.zza[i]).getValue();
        java.lang.Object[] objArr = this.zza;
        java.lang.System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            java.util.Iterator it = zzn().entrySet().iterator();
            java.lang.Object[] objArr2 = this.zza;
            int i2 = this.zzb;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            objArr2[i2] = new com.google.android.gms.internal.measurement.zznw(this, (java.lang.Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final java.util.SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.measurement.zzny(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzoa)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzoa zzoaVar = (com.google.android.gms.internal.measurement.zzoa) obj;
        int size = size();
        if (size != zzoaVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i != zzoaVar.zzb) {
            return entrySet().equals(zzoaVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zzg(i2).equals(zzoaVar.zzg(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.zzc.equals(zzoaVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZzl = zzl(comparable);
        return iZzl >= 0 ? ((com.google.android.gms.internal.measurement.zznw) this.zza[iZzl]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.zzb;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.zza[i2].hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        zzo();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return zzm(iZzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final java.lang.Iterable zzd() {
        return this.zzc.isEmpty() ? java.util.Collections.emptySet() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        zzo();
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return ((com.google.android.gms.internal.measurement.zznw) this.zza[iZzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new java.lang.Object[16];
        }
        int i = -(iZzl + 1);
        if (i >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            com.google.android.gms.internal.measurement.zznw zznwVar = (com.google.android.gms.internal.measurement.zznw) this.zza[15];
            this.zzb = 15;
            zzn().put(zznwVar.zza(), zznwVar.getValue());
        }
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        java.lang.System.arraycopy(objArr, i, objArr, i + 1, (16 - i) - 1);
        this.zza[i] = new com.google.android.gms.internal.measurement.zznw(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final java.util.Map.Entry zzg(int i) {
        if (i < this.zzb) {
            return (com.google.android.gms.internal.measurement.zznw) this.zza[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    /* synthetic */ zzoa(com.google.android.gms.internal.measurement.zznz zznzVar) {
    }
}
