package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjx {
    public static final com.google.android.gms.measurement.internal.zzjx zza = new com.google.android.gms.measurement.internal.zzjx(null, null, 100);
    private final java.util.EnumMap zzb;
    private final int zzc;

    public zzjx(java.lang.Boolean bool, java.lang.Boolean bool2, int i) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        this.zzb = enumMap;
        enumMap.put(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE, zzh(null));
        enumMap.put(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE, zzh(null));
        this.zzc = i;
    }

    static char zza(com.google.android.gms.measurement.internal.zzju zzjuVar) {
        if (zzjuVar == null) {
            return org.objectweb.asm.signature.SignatureVisitor.SUPER;
        }
        int iOrdinal = zzjuVar.ordinal();
        if (iOrdinal == 1) {
            return org.objectweb.asm.signature.SignatureVisitor.EXTENDS;
        }
        if (iOrdinal == 2) {
            return '0';
        }
        if (iOrdinal != 3) {
            return org.objectweb.asm.signature.SignatureVisitor.SUPER;
        }
        return '1';
    }

    static com.google.android.gms.measurement.internal.zzju zzd(java.lang.String str) {
        if (str == null) {
            return com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return com.google.android.gms.measurement.internal.zzju.GRANTED;
        }
        return str.equals("denied") ? com.google.android.gms.measurement.internal.zzju.DENIED : com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
    }

    static com.google.android.gms.measurement.internal.zzju zzh(java.lang.Boolean bool) {
        if (bool == null) {
            return com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
        }
        return bool.booleanValue() ? com.google.android.gms.measurement.internal.zzju.GRANTED : com.google.android.gms.measurement.internal.zzju.DENIED;
    }

    public static com.google.android.gms.measurement.internal.zzjx zzi(android.os.Bundle bundle, int i) {
        if (bundle == null) {
            return new com.google.android.gms.measurement.internal.zzjx(null, null, i);
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.STORAGE.zzd) {
            enumMap.put(zzjwVar, zzd(bundle.getString(zzjwVar.zze)));
        }
        return new com.google.android.gms.measurement.internal.zzjx(enumMap, i);
    }

    public static com.google.android.gms.measurement.internal.zzjx zzj(com.google.android.gms.measurement.internal.zzju zzjuVar, com.google.android.gms.measurement.internal.zzju zzjuVar2, int i) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        enumMap.put(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE, zzjuVar);
        enumMap.put(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE, zzjuVar2);
        return new com.google.android.gms.measurement.internal.zzjx(enumMap, -10);
    }

    public static com.google.android.gms.measurement.internal.zzjx zzk(java.lang.String str, int i) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        com.google.android.gms.measurement.internal.zzjw[] zzjwVarArrZzb = com.google.android.gms.measurement.internal.zzjv.STORAGE.zzb();
        for (int i2 = 0; i2 < zzjwVarArrZzb.length; i2++) {
            java.lang.String str2 = str == null ? "" : str;
            com.google.android.gms.measurement.internal.zzjw zzjwVar = zzjwVarArrZzb[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(zzjwVar, zzg(str2.charAt(i3)));
            } else {
                enumMap.put(zzjwVar, com.google.android.gms.measurement.internal.zzju.UNINITIALIZED);
            }
        }
        return new com.google.android.gms.measurement.internal.zzjx(enumMap, i);
    }

    static java.lang.String zzn(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    static java.lang.String zzo(com.google.android.gms.measurement.internal.zzju zzjuVar) {
        int iOrdinal = zzjuVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static boolean zzs(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.measurement.internal.zzjx)) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzjx zzjxVar = (com.google.android.gms.measurement.internal.zzjx) obj;
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.STORAGE.zzd) {
            if (this.zzb.get(zzjwVar) != zzjxVar.zzb.get(zzjwVar)) {
                return false;
            }
        }
        return this.zzc == zzjxVar.zzc;
    }

    public final int hashCode() {
        java.util.Iterator it = this.zzb.values().iterator();
        int iHashCode = this.zzc * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((com.google.android.gms.measurement.internal.zzju) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("source=");
        sb.append(zzn(this.zzc));
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.STORAGE.zzd) {
            sb.append(",");
            sb.append(zzjwVar.zze);
            sb.append(com.ironsource.y8.i.b);
            com.google.android.gms.measurement.internal.zzju zzjuVar = (com.google.android.gms.measurement.internal.zzju) this.zzb.get(zzjwVar);
            if (zzjuVar == null) {
                zzjuVar = com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
            }
            sb.append(zzjuVar);
        }
        return sb.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final android.os.Bundle zzc() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            java.lang.String strZzo = zzo((com.google.android.gms.measurement.internal.zzju) entry.getValue());
            if (strZzo != null) {
                bundle.putString(((com.google.android.gms.measurement.internal.zzjw) entry.getKey()).zze, strZzo);
            }
        }
        return bundle;
    }

    public final com.google.android.gms.measurement.internal.zzju zze() {
        com.google.android.gms.measurement.internal.zzju zzjuVar = (com.google.android.gms.measurement.internal.zzju) this.zzb.get(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE);
        return zzjuVar == null ? com.google.android.gms.measurement.internal.zzju.UNINITIALIZED : zzjuVar;
    }

    public final com.google.android.gms.measurement.internal.zzju zzf() {
        com.google.android.gms.measurement.internal.zzju zzjuVar = (com.google.android.gms.measurement.internal.zzju) this.zzb.get(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE);
        return zzjuVar == null ? com.google.android.gms.measurement.internal.zzju.UNINITIALIZED : zzjuVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public final com.google.android.gms.measurement.internal.zzjx zzl(com.google.android.gms.measurement.internal.zzjx zzjxVar) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.STORAGE.zzd) {
            com.google.android.gms.measurement.internal.zzju zzjuVar = (com.google.android.gms.measurement.internal.zzju) this.zzb.get(zzjwVar);
            com.google.android.gms.measurement.internal.zzju zzjuVar2 = (com.google.android.gms.measurement.internal.zzju) zzjxVar.zzb.get(zzjwVar);
            if (zzjuVar == null) {
                zzjuVar = zzjuVar2;
            } else if (zzjuVar2 != null) {
                com.google.android.gms.measurement.internal.zzju zzjuVar3 = com.google.android.gms.measurement.internal.zzju.UNINITIALIZED;
                if (zzjuVar == zzjuVar3) {
                    zzjuVar = zzjuVar2;
                } else if (zzjuVar2 != zzjuVar3) {
                    com.google.android.gms.measurement.internal.zzju zzjuVar4 = com.google.android.gms.measurement.internal.zzju.POLICY;
                    if (zzjuVar == zzjuVar4) {
                        zzjuVar = zzjuVar2;
                    } else if (zzjuVar2 != zzjuVar4) {
                        com.google.android.gms.measurement.internal.zzju zzjuVar5 = com.google.android.gms.measurement.internal.zzju.DENIED;
                        zzjuVar = (zzjuVar == zzjuVar5 || zzjuVar2 == zzjuVar5) ? zzjuVar5 : com.google.android.gms.measurement.internal.zzju.GRANTED;
                    }
                }
            }
            if (zzjuVar != null) {
                enumMap.put(zzjwVar, zzjuVar);
            }
        }
        return new com.google.android.gms.measurement.internal.zzjx(enumMap, 100);
    }

    public final com.google.android.gms.measurement.internal.zzjx zzm(com.google.android.gms.measurement.internal.zzjx zzjxVar) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.STORAGE.zzd) {
            com.google.android.gms.measurement.internal.zzju zzjuVar = (com.google.android.gms.measurement.internal.zzju) this.zzb.get(zzjwVar);
            if (zzjuVar == com.google.android.gms.measurement.internal.zzju.UNINITIALIZED) {
                zzjuVar = (com.google.android.gms.measurement.internal.zzju) zzjxVar.zzb.get(zzjwVar);
            }
            if (zzjuVar != null) {
                enumMap.put(zzjwVar, zzjuVar);
            }
        }
        return new com.google.android.gms.measurement.internal.zzjx(enumMap, this.zzc);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final java.lang.String zzp() {
        int iOrdinal;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("G1");
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.STORAGE.zzb()) {
            com.google.android.gms.measurement.internal.zzju zzjuVar = (com.google.android.gms.measurement.internal.zzju) this.zzb.get(zzjwVar);
            char c = org.objectweb.asm.signature.SignatureVisitor.SUPER;
            if (zzjuVar != null && (iOrdinal = zzjuVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c = '1';
                } else if (iOrdinal == 2) {
                    c = '0';
                } else if (iOrdinal == 3) {
                    c = '1';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final java.lang.String zzq() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("G1");
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.STORAGE.zzb()) {
            sb.append(zza((com.google.android.gms.measurement.internal.zzju) this.zzb.get(zzjwVar)));
        }
        return sb.toString();
    }

    public final boolean zzr(com.google.android.gms.measurement.internal.zzjw zzjwVar) {
        return ((com.google.android.gms.measurement.internal.zzju) this.zzb.get(zzjwVar)) != com.google.android.gms.measurement.internal.zzju.DENIED;
    }

    public final boolean zzt() {
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.measurement.internal.zzju) it.next()) != com.google.android.gms.measurement.internal.zzju.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzu(com.google.android.gms.measurement.internal.zzjx zzjxVar) {
        java.util.EnumMap enumMap = this.zzb;
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : (com.google.android.gms.measurement.internal.zzjw[]) enumMap.keySet().toArray(new com.google.android.gms.measurement.internal.zzjw[0])) {
            com.google.android.gms.measurement.internal.zzju zzjuVar = (com.google.android.gms.measurement.internal.zzju) enumMap.get(zzjwVar);
            com.google.android.gms.measurement.internal.zzju zzjuVar2 = (com.google.android.gms.measurement.internal.zzju) zzjxVar.zzb.get(zzjwVar);
            if (zzjuVar == com.google.android.gms.measurement.internal.zzju.DENIED && zzjuVar2 != com.google.android.gms.measurement.internal.zzju.DENIED) {
                return true;
            }
        }
        return false;
    }

    private zzjx(java.util.EnumMap enumMap, int i) {
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    static com.google.android.gms.measurement.internal.zzju zzg(char c) {
        if (c == '+') {
            return com.google.android.gms.measurement.internal.zzju.POLICY;
        }
        if (c != '0') {
            return c != '1' ? com.google.android.gms.measurement.internal.zzju.UNINITIALIZED : com.google.android.gms.measurement.internal.zzju.GRANTED;
        }
        return com.google.android.gms.measurement.internal.zzju.DENIED;
    }
}
