package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzy {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzae zza;
    private java.lang.String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzic zzd;
    private java.util.BitSet zze;
    private java.util.BitSet zzf;
    private java.util.Map zzg;
    private java.util.Map zzh;

    /* synthetic */ zzy(com.google.android.gms.measurement.internal.zzae zzaeVar, java.lang.String str, com.google.android.gms.measurement.internal.zzad zzadVar) {
        this.zza = zzaeVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new java.util.BitSet();
        this.zzf = new java.util.BitSet();
        this.zzg = new androidx.collection.ArrayMap();
        this.zzh = new androidx.collection.ArrayMap();
    }

    final com.google.android.gms.internal.measurement.zzhi zza(int i) {
        java.util.ArrayList arrayList;
        java.util.List listEmptyList;
        com.google.android.gms.internal.measurement.zzhh zzhhVarZzb = com.google.android.gms.internal.measurement.zzhi.zzb();
        zzhhVarZzb.zza(i);
        zzhhVarZzb.zzc(this.zzc);
        com.google.android.gms.internal.measurement.zzic zzicVar = this.zzd;
        if (zzicVar != null) {
            zzhhVarZzb.zzd(zzicVar);
        }
        com.google.android.gms.internal.measurement.zzib zzibVarZze = com.google.android.gms.internal.measurement.zzic.zze();
        zzibVarZze.zzb(com.google.android.gms.measurement.internal.zzqa.zzu(this.zze));
        zzibVarZze.zzd(com.google.android.gms.measurement.internal.zzqa.zzu(this.zzf));
        java.util.Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
            java.util.Iterator it = this.zzg.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                java.lang.Long l = (java.lang.Long) this.zzg.get(java.lang.Integer.valueOf(iIntValue));
                if (l != null) {
                    com.google.android.gms.internal.measurement.zzhj zzhjVarZzc = com.google.android.gms.internal.measurement.zzhk.zzc();
                    zzhjVarZzc.zzb(iIntValue);
                    zzhjVarZzc.zza(l.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.zzhk) zzhjVarZzc.zzba());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzibVarZze.zza(arrayList);
        }
        java.util.Map map2 = this.zzh;
        if (map2 == null) {
            listEmptyList = java.util.Collections.emptyList();
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(map2.size());
            for (java.lang.Integer num : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzid zzidVarZzd = com.google.android.gms.internal.measurement.zzie.zzd();
                zzidVarZzd.zzb(num.intValue());
                java.util.List list = (java.util.List) this.zzh.get(num);
                if (list != null) {
                    java.util.Collections.sort(list);
                    zzidVarZzd.zza(list);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzie) zzidVarZzd.zzba());
            }
            listEmptyList = arrayList3;
        }
        zzibVarZze.zzc(listEmptyList);
        zzhhVarZzb.zzb(zzibVarZze);
        return (com.google.android.gms.internal.measurement.zzhi) zzhhVarZzb.zzba();
    }

    final void zzc(com.google.android.gms.measurement.internal.zzab zzabVar) {
        int iZza = zzabVar.zza();
        java.lang.Boolean bool = zzabVar.zzd;
        if (bool != null) {
            java.util.BitSet bitSet = this.zzf;
            bool.booleanValue();
            bitSet.set(iZza, true);
        }
        java.lang.Boolean bool2 = zzabVar.zze;
        if (bool2 != null) {
            this.zze.set(iZza, bool2.booleanValue());
        }
        if (zzabVar.zzf != null) {
            java.util.Map map = this.zzg;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iZza);
            java.lang.Long l = (java.lang.Long) map.get(numValueOf);
            long jLongValue = zzabVar.zzf.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.zzg.put(numValueOf, java.lang.Long.valueOf(jLongValue));
            }
        }
        if (zzabVar.zzg != null) {
            java.util.Map map2 = this.zzh;
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iZza);
            java.util.List arrayList = (java.util.List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                this.zzh.put(numValueOf2, arrayList);
            }
            if (zzabVar.zzc()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.zzpq.zzb();
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zza.zzu;
            if (zzioVar.zzf().zzx(this.zzb, com.google.android.gms.measurement.internal.zzgi.zzaE) && zzabVar.zzb()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.zzpq.zzb();
            if (!zzioVar.zzf().zzx(this.zzb, com.google.android.gms.measurement.internal.zzgi.zzaE)) {
                arrayList.add(java.lang.Long.valueOf(zzabVar.zzg.longValue() / 1000));
                return;
            }
            java.lang.Long lValueOf = java.lang.Long.valueOf(zzabVar.zzg.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* synthetic */ zzy(com.google.android.gms.measurement.internal.zzae zzaeVar, java.lang.String str, com.google.android.gms.internal.measurement.zzic zzicVar, java.util.BitSet bitSet, java.util.BitSet bitSet2, java.util.Map map, java.util.Map map2, com.google.android.gms.measurement.internal.zzad zzadVar) {
        this.zza = zzaeVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new androidx.collection.ArrayMap();
        for (java.lang.Integer num : map2.keySet()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add((java.lang.Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzicVar;
    }
}
