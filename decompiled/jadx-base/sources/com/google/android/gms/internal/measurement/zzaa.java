package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaa {
    private static final com.google.common.collect.ImmutableSet zza = com.google.common.collect.ImmutableSet.of("_syn", "_err", "_el");
    private java.lang.String zzb;
    private final long zzc;
    private final java.util.Map zzd;

    public zzaa(java.lang.String str, long j, java.util.Map map) {
        this.zzb = str;
        this.zzc = j;
        java.util.HashMap map2 = new java.util.HashMap();
        this.zzd = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static java.lang.Object zzd(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (zza.contains(str) && (obj2 instanceof java.lang.Double)) {
            return java.lang.Long.valueOf(java.lang.Math.round(((java.lang.Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof java.lang.String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof java.lang.Double)) {
            if (obj instanceof java.lang.Long) {
                return java.lang.Long.valueOf(java.lang.Math.round(((java.lang.Double) obj2).doubleValue()));
            }
            if (obj instanceof java.lang.String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzaa)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaa zzaaVar = (com.google.android.gms.internal.measurement.zzaa) obj;
        if (this.zzc == zzaaVar.zzc && this.zzb.equals(zzaaVar.zzb)) {
            return this.zzd.equals(zzaaVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        long j = this.zzc;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.zzd.hashCode();
    }

    public final java.lang.String toString() {
        return "Event{name='" + this.zzb + "', timestamp=" + this.zzc + ", params=" + this.zzd.toString() + "}";
    }

    public final long zza() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzaa clone() {
        return new com.google.android.gms.internal.measurement.zzaa(this.zzb, this.zzc, new java.util.HashMap(this.zzd));
    }

    public final java.lang.Object zzc(java.lang.String str) {
        java.util.Map map = this.zzd;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final java.lang.String zze() {
        return this.zzb;
    }

    public final java.util.Map zzf() {
        return this.zzd;
    }

    public final void zzg(java.lang.String str) {
        this.zzb = str;
    }

    public final void zzh(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
        } else {
            java.util.Map map = this.zzd;
            map.put(str, zzd(str, map.get(str), obj));
        }
    }
}
