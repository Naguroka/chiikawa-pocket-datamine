package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzba {
    public static final com.google.android.gms.measurement.internal.zzba zza = new com.google.android.gms.measurement.internal.zzba((java.lang.Boolean) null, 100, (java.lang.Boolean) null, (java.lang.String) null);
    private final int zzb;
    private final java.lang.String zzc;
    private final java.lang.Boolean zzd;
    private final java.lang.String zze;
    private final java.util.EnumMap zzf;

    static {
    }

    zzba(java.lang.Boolean bool, int i, java.lang.Boolean bool2, java.lang.String str) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        this.zzf = enumMap;
        enumMap.put(com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA, com.google.android.gms.measurement.internal.zzjx.zzh(bool));
        this.zzb = i;
        this.zzc = zzl();
        this.zzd = bool2;
        this.zze = str;
    }

    public static com.google.android.gms.measurement.internal.zzba zzc(android.os.Bundle bundle, int i) {
        if (bundle == null) {
            return new com.google.android.gms.measurement.internal.zzba((java.lang.Boolean) null, i, (java.lang.Boolean) null, (java.lang.String) null);
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.DMA.zzb()) {
            enumMap.put(zzjwVar, com.google.android.gms.measurement.internal.zzjx.zzd(bundle.getString(zzjwVar.zze)));
        }
        return new com.google.android.gms.measurement.internal.zzba(enumMap, i, bundle.containsKey("is_dma_region") ? java.lang.Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    static com.google.android.gms.measurement.internal.zzba zzd(com.google.android.gms.measurement.internal.zzju zzjuVar, int i) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        enumMap.put(com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA, zzjuVar);
        return new com.google.android.gms.measurement.internal.zzba(enumMap, -10, (java.lang.Boolean) null, (java.lang.String) null);
    }

    public static com.google.android.gms.measurement.internal.zzba zze(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        java.lang.String[] strArrSplit = str.split(":");
        int i = java.lang.Integer.parseInt(strArrSplit[0]);
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        com.google.android.gms.measurement.internal.zzjw[] zzjwVarArrZzb = com.google.android.gms.measurement.internal.zzjv.DMA.zzb();
        int length = zzjwVarArrZzb.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(zzjwVarArrZzb[i3], com.google.android.gms.measurement.internal.zzjx.zzg(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new com.google.android.gms.measurement.internal.zzba(enumMap, i, (java.lang.Boolean) null, (java.lang.String) null);
    }

    public static java.lang.Boolean zzg(android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzju zzjuVarZzd;
        if (bundle == null || (zzjuVarZzd = com.google.android.gms.measurement.internal.zzjx.zzd(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjuVarZzd.ordinal();
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? null : true;
        }
        return false;
    }

    private final java.lang.String zzl() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.zzb);
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.DMA.zzb()) {
            sb.append(":");
            sb.append(com.google.android.gms.measurement.internal.zzjx.zza((com.google.android.gms.measurement.internal.zzju) this.zzf.get(zzjwVar)));
        }
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.measurement.internal.zzba)) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzba zzbaVar = (com.google.android.gms.measurement.internal.zzba) obj;
        if (this.zzc.equalsIgnoreCase(zzbaVar.zzc) && java.util.Objects.equals(this.zzd, zzbaVar.zzd)) {
            return java.util.Objects.equals(this.zze, zzbaVar.zze);
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("source=");
        sb.append(com.google.android.gms.measurement.internal.zzjx.zzn(this.zzb));
        for (com.google.android.gms.measurement.internal.zzjw zzjwVar : com.google.android.gms.measurement.internal.zzjv.DMA.zzb()) {
            sb.append(",");
            sb.append(zzjwVar.zze);
            sb.append(com.ironsource.y8.i.b);
            com.google.android.gms.measurement.internal.zzju zzjuVar = (com.google.android.gms.measurement.internal.zzju) this.zzf.get(zzjwVar);
            if (zzjuVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = zzjuVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        java.lang.Boolean bool = this.zzd;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        java.lang.String str = this.zze;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final android.os.Bundle zzb() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : this.zzf.entrySet()) {
            java.lang.String strZzo = com.google.android.gms.measurement.internal.zzjx.zzo((com.google.android.gms.measurement.internal.zzju) entry.getValue());
            if (strZzo != null) {
                bundle.putString(((com.google.android.gms.measurement.internal.zzjw) entry.getKey()).zze, strZzo);
            }
        }
        java.lang.Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        java.lang.String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final com.google.android.gms.measurement.internal.zzju zzf() {
        com.google.android.gms.measurement.internal.zzju zzjuVar = (com.google.android.gms.measurement.internal.zzju) this.zzf.get(com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA);
        return zzjuVar == null ? com.google.android.gms.measurement.internal.zzju.UNINITIALIZED : zzjuVar;
    }

    public final java.lang.Boolean zzh() {
        return this.zzd;
    }

    public final java.lang.String zzi() {
        return this.zze;
    }

    public final java.lang.String zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        java.util.Iterator it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.measurement.internal.zzju) it.next()) != com.google.android.gms.measurement.internal.zzju.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        java.lang.Boolean bool = this.zzd;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        java.lang.String str = this.zze;
        return this.zzc.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * org.objectweb.asm.Opcodes.L2F);
    }

    private zzba(java.util.EnumMap enumMap, int i, java.lang.Boolean bool, java.lang.String str) {
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjw.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzl();
        this.zzd = bool;
        this.zze = str;
    }
}
