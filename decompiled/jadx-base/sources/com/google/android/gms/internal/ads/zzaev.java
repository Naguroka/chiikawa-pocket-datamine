package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaev extends com.google.android.gms.internal.ads.zzaex {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaev() {
        super(new com.google.android.gms.internal.ads.zzaci());
        this.zzb = androidx.media3.common.C.TIME_UNSET;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static java.lang.Double zzg(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(zzdyVar.zzt()));
    }

    private static java.lang.String zzi(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzq = zzdyVar.zzq();
        int iZzd = zzdyVar.zzd();
        zzdyVar.zzM(iZzq);
        return new java.lang.String(zzdyVar.zzN(), iZzd, iZzq);
    }

    private static java.util.HashMap zzj(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzp = zzdyVar.zzp();
        java.util.HashMap map = new java.util.HashMap(iZzp);
        for (int i = 0; i < iZzp; i++) {
            java.lang.String strZzi = zzi(zzdyVar);
            java.lang.Object objZzh = zzh(zzdyVar, zzdyVar.zzm());
            if (objZzh != null) {
                map.put(strZzi, objZzh);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zzb(com.google.android.gms.internal.ads.zzdy zzdyVar, long j) {
        if (zzdyVar.zzm() == 2 && "onMetaData".equals(zzi(zzdyVar)) && zzdyVar.zzb() != 0 && zzdyVar.zzm() == 8) {
            java.util.HashMap mapZzj = zzj(zzdyVar);
            java.lang.Object obj = mapZzj.get("duration");
            if (obj instanceof java.lang.Double) {
                double dDoubleValue = ((java.lang.Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            java.lang.Object obj2 = mapZzj.get("keyframes");
            if (obj2 instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) obj2;
                java.lang.Object obj3 = map.get("filepositions");
                java.lang.Object obj4 = map.get("times");
                if ((obj3 instanceof java.util.List) && (obj4 instanceof java.util.List)) {
                    java.util.List list = (java.util.List) obj3;
                    java.util.List list2 = (java.util.List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        java.lang.Object obj5 = list.get(i);
                        java.lang.Object obj6 = list2.get(i);
                        if (!(obj6 instanceof java.lang.Double) || !(obj5 instanceof java.lang.Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((java.lang.Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((java.lang.Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }

    private static java.lang.Object zzh(com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        if (i == 0) {
            return zzg(zzdyVar);
        }
        if (i == 1) {
            return java.lang.Boolean.valueOf(zzdyVar.zzm() == 1);
        }
        if (i == 2) {
            return zzi(zzdyVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzj(zzdyVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                java.util.Date date = new java.util.Date((long) zzg(zzdyVar).doubleValue());
                zzdyVar.zzM(2);
                return date;
            }
            int iZzp = zzdyVar.zzp();
            java.util.ArrayList arrayList = new java.util.ArrayList(iZzp);
            for (int i2 = 0; i2 < iZzp; i2++) {
                java.lang.Object objZzh = zzh(zzdyVar, zzdyVar.zzm());
                if (objZzh != null) {
                    arrayList.add(objZzh);
                }
            }
            return arrayList;
        }
        java.util.HashMap map = new java.util.HashMap();
        while (true) {
            java.lang.String strZzi = zzi(zzdyVar);
            int iZzm = zzdyVar.zzm();
            if (iZzm == 9) {
                return map;
            }
            java.lang.Object objZzh2 = zzh(zzdyVar, iZzm);
            if (objZzh2 != null) {
                map.put(strZzi, objZzh2);
            }
        }
    }
}
