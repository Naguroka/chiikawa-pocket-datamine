package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzao {
    private final java.util.EnumMap zza;

    zzao() {
        this.zza = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
    }

    public static com.google.android.gms.measurement.internal.zzao zzb(java.lang.String str) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        if (str.length() >= com.google.android.gms.measurement.internal.zzjw.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                com.google.android.gms.measurement.internal.zzjw[] zzjwVarArrValues = com.google.android.gms.measurement.internal.zzjw.values();
                int length = zzjwVarArrValues.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put(zzjwVarArrValues[i], com.google.android.gms.measurement.internal.zzan.zzb(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new com.google.android.gms.measurement.internal.zzao(enumMap);
            }
        }
        return new com.google.android.gms.measurement.internal.zzao();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("1");
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjw.values()) {
            com.google.android.gms.measurement.internal.zzan zzanVar = (com.google.android.gms.measurement.internal.zzan) this.zza.get(zzjwVar);
            if (zzanVar == null) {
                zzanVar = com.google.android.gms.measurement.internal.zzan.UNSET;
            }
            sb.append(zzanVar.zzl);
        }
        return sb.toString();
    }

    public final com.google.android.gms.measurement.internal.zzan zza(com.google.android.gms.measurement.internal.zzjw zzjwVar) {
        com.google.android.gms.measurement.internal.zzan zzanVar = (com.google.android.gms.measurement.internal.zzan) this.zza.get(zzjwVar);
        return zzanVar == null ? com.google.android.gms.measurement.internal.zzan.UNSET : zzanVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void zzc(com.google.android.gms.measurement.internal.zzjw zzjwVar, int i) {
        com.google.android.gms.measurement.internal.zzan zzanVar = com.google.android.gms.measurement.internal.zzan.UNSET;
        if (i == -30) {
            zzanVar = com.google.android.gms.measurement.internal.zzan.TCF;
        } else if (i == -20) {
            zzanVar = com.google.android.gms.measurement.internal.zzan.API;
        } else if (i == -10) {
            zzanVar = com.google.android.gms.measurement.internal.zzan.MANIFEST;
        } else if (i == 0) {
            zzanVar = com.google.android.gms.measurement.internal.zzan.API;
        } else if (i == 30) {
            zzanVar = com.google.android.gms.measurement.internal.zzan.INITIALIZATION;
        }
        this.zza.put(zzjwVar, zzanVar);
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzjw zzjwVar, com.google.android.gms.measurement.internal.zzan zzanVar) {
        this.zza.put(zzjwVar, zzanVar);
    }

    private zzao(java.util.EnumMap enumMap) {
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
