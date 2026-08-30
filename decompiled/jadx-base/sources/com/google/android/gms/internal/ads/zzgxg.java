package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgxg {
    private static final com.google.android.gms.internal.ads.zzgxg zzb = new com.google.android.gms.internal.ads.zzgxg(true);
    final com.google.android.gms.internal.ads.zzhad zza = new com.google.android.gms.internal.ads.zzgzy();
    private boolean zzc;
    private boolean zzd;

    private zzgxg() {
    }

    static int zza(com.google.android.gms.internal.ads.zzhau zzhauVar, int i, java.lang.Object obj) {
        int iZzD = com.google.android.gms.internal.ads.zzgww.zzD(i << 3);
        if (zzhauVar == com.google.android.gms.internal.ads.zzhau.GROUP) {
            com.google.android.gms.internal.ads.zzgzc zzgzcVar = (com.google.android.gms.internal.ads.zzgzc) obj;
            byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
            if (zzgzcVar instanceof com.google.android.gms.internal.ads.zzgvt) {
                throw null;
            }
            iZzD += iZzD;
        }
        return iZzD + zzb(zzhauVar, obj);
    }

    static int zzb(com.google.android.gms.internal.ads.zzhau zzhauVar, java.lang.Object obj) {
        int iZzd;
        int iZzD;
        com.google.android.gms.internal.ads.zzhau zzhauVar2 = com.google.android.gms.internal.ads.zzhau.DOUBLE;
        com.google.android.gms.internal.ads.zzhav zzhavVar = com.google.android.gms.internal.ads.zzhav.INT;
        switch (zzhauVar) {
            case DOUBLE:
                ((java.lang.Double) obj).doubleValue();
                int i = com.google.android.gms.internal.ads.zzgww.zzf;
                return 8;
            case FLOAT:
                ((java.lang.Float) obj).floatValue();
                int i2 = com.google.android.gms.internal.ads.zzgww.zzf;
                return 4;
            case INT64:
                return com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Long) obj).longValue());
            case UINT64:
                return com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Long) obj).longValue());
            case INT32:
                return com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Integer) obj).intValue());
            case FIXED64:
                ((java.lang.Long) obj).longValue();
                int i3 = com.google.android.gms.internal.ads.zzgww.zzf;
                return 8;
            case FIXED32:
                ((java.lang.Integer) obj).intValue();
                int i4 = com.google.android.gms.internal.ads.zzgww.zzf;
                return 4;
            case BOOL:
                ((java.lang.Boolean) obj).booleanValue();
                int i5 = com.google.android.gms.internal.ads.zzgww.zzf;
                return 1;
            case STRING:
                if (!(obj instanceof com.google.android.gms.internal.ads.zzgwj)) {
                    return com.google.android.gms.internal.ads.zzgww.zzC((java.lang.String) obj);
                }
                int i6 = com.google.android.gms.internal.ads.zzgww.zzf;
                iZzd = ((com.google.android.gms.internal.ads.zzgwj) obj).zzd();
                iZzD = com.google.android.gms.internal.ads.zzgww.zzD(iZzd);
                break;
                break;
            case GROUP:
                int i7 = com.google.android.gms.internal.ads.zzgww.zzf;
                return ((com.google.android.gms.internal.ads.zzgzc) obj).zzaY();
            case MESSAGE:
                if (!(obj instanceof com.google.android.gms.internal.ads.zzgym)) {
                    return com.google.android.gms.internal.ads.zzgww.zzz((com.google.android.gms.internal.ads.zzgzc) obj);
                }
                int i8 = com.google.android.gms.internal.ads.zzgww.zzf;
                iZzd = ((com.google.android.gms.internal.ads.zzgym) obj).zza();
                iZzD = com.google.android.gms.internal.ads.zzgww.zzD(iZzd);
                break;
                break;
            case BYTES:
                if (!(obj instanceof com.google.android.gms.internal.ads.zzgwj)) {
                    int i9 = com.google.android.gms.internal.ads.zzgww.zzf;
                    iZzd = ((byte[]) obj).length;
                    iZzD = com.google.android.gms.internal.ads.zzgww.zzD(iZzd);
                } else {
                    int i10 = com.google.android.gms.internal.ads.zzgww.zzf;
                    iZzd = ((com.google.android.gms.internal.ads.zzgwj) obj).zzd();
                    iZzD = com.google.android.gms.internal.ads.zzgww.zzD(iZzd);
                }
                break;
            case UINT32:
                return com.google.android.gms.internal.ads.zzgww.zzD(((java.lang.Integer) obj).intValue());
            case ENUM:
                return obj instanceof com.google.android.gms.internal.ads.zzgxv ? com.google.android.gms.internal.ads.zzgww.zzE(((com.google.android.gms.internal.ads.zzgxv) obj).zza()) : com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Integer) obj).intValue());
            case SFIXED32:
                ((java.lang.Integer) obj).intValue();
                int i11 = com.google.android.gms.internal.ads.zzgww.zzf;
                return 4;
            case SFIXED64:
                ((java.lang.Long) obj).longValue();
                int i12 = com.google.android.gms.internal.ads.zzgww.zzf;
                return 8;
            case SINT32:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                return com.google.android.gms.internal.ads.zzgww.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case SINT64:
                long jLongValue = ((java.lang.Long) obj).longValue();
                return com.google.android.gms.internal.ads.zzgww.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzD + iZzd;
    }

    public static int zzc(com.google.android.gms.internal.ads.zzgxf zzgxfVar, java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzhau zzhauVarZzb = zzgxfVar.zzb();
        int iZza = zzgxfVar.zza();
        if (!zzgxfVar.zze()) {
            return zza(zzhauVarZzb, iZza, obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = list.size();
        int i = 0;
        if (!zzgxfVar.zzd()) {
            int iZza2 = 0;
            while (i < size) {
                iZza2 += zza(zzhauVarZzb, iZza, list.get(i));
                i++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i < size) {
            iZzb += zzb(zzhauVarZzb, list.get(i));
            i++;
        }
        return com.google.android.gms.internal.ads.zzgww.zzD(iZza << 3) + iZzb + com.google.android.gms.internal.ads.zzgww.zzD(iZzb);
    }

    public static com.google.android.gms.internal.ads.zzgxg zze() {
        return zzb;
    }

    private static boolean zzj(java.util.Map.Entry entry) {
        com.google.android.gms.internal.ads.zzgxf zzgxfVar = (com.google.android.gms.internal.ads.zzgxf) entry.getKey();
        if (zzgxfVar.zzc() != com.google.android.gms.internal.ads.zzhav.MESSAGE) {
            return true;
        }
        if (!zzgxfVar.zze()) {
            return zzk(entry.getValue());
        }
        java.util.List list = (java.util.List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzk(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzk(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzgzd) {
            return ((com.google.android.gms.internal.ads.zzgzd) obj).zzbw();
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgym) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(java.util.Map.Entry entry) {
        int i;
        int iZzD;
        int iZzD2;
        com.google.android.gms.internal.ads.zzgxf zzgxfVar = (com.google.android.gms.internal.ads.zzgxf) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (zzgxfVar.zzc() != com.google.android.gms.internal.ads.zzhav.MESSAGE || zzgxfVar.zze() || zzgxfVar.zzd()) {
            return zzc(zzgxfVar, value);
        }
        if (value instanceof com.google.android.gms.internal.ads.zzgym) {
            int iZza = ((com.google.android.gms.internal.ads.zzgxf) entry.getKey()).zza();
            int iZzD3 = com.google.android.gms.internal.ads.zzgww.zzD(8);
            i = iZzD3 + iZzD3;
            iZzD = com.google.android.gms.internal.ads.zzgww.zzD(16) + com.google.android.gms.internal.ads.zzgww.zzD(iZza);
            int iZzD4 = com.google.android.gms.internal.ads.zzgww.zzD(24);
            int iZza2 = ((com.google.android.gms.internal.ads.zzgym) value).zza();
            iZzD2 = iZzD4 + com.google.android.gms.internal.ads.zzgww.zzD(iZza2) + iZza2;
        } else {
            int iZza3 = ((com.google.android.gms.internal.ads.zzgxf) entry.getKey()).zza();
            int iZzD5 = com.google.android.gms.internal.ads.zzgww.zzD(8);
            i = iZzD5 + iZzD5;
            iZzD = com.google.android.gms.internal.ads.zzgww.zzD(16) + com.google.android.gms.internal.ads.zzgww.zzD(iZza3);
            iZzD2 = com.google.android.gms.internal.ads.zzgww.zzD(24) + com.google.android.gms.internal.ads.zzgww.zzz((com.google.android.gms.internal.ads.zzgzc) value);
        }
        return i + iZzD + iZzD2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzm(com.google.android.gms.internal.ads.zzgxf zzgxfVar, java.lang.Object obj) {
        boolean z;
        zzgxfVar.zzb();
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        obj.getClass();
        com.google.android.gms.internal.ads.zzhau zzhauVar = com.google.android.gms.internal.ads.zzhau.DOUBLE;
        com.google.android.gms.internal.ads.zzhav zzhavVar = com.google.android.gms.internal.ads.zzhav.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof java.lang.Long;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof java.lang.Float;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof java.lang.String;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof com.google.android.gms.internal.ads.zzgwj) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.ads.zzgxv)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof com.google.android.gms.internal.ads.zzgzc) || (obj instanceof com.google.android.gms.internal.ads.zzgym)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.ads.zzgxg zzgxgVar = new com.google.android.gms.internal.ads.zzgxg();
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            java.util.Map.Entry entryZzg = this.zza.zzg(i);
            zzgxgVar.zzh((com.google.android.gms.internal.ads.zzgxf) ((com.google.android.gms.internal.ads.zzgzz) entryZzg).zza(), entryZzg.getValue());
        }
        for (java.util.Map.Entry entry : this.zza.zzd()) {
            zzgxgVar.zzh((com.google.android.gms.internal.ads.zzgxf) entry.getKey(), entry.getValue());
        }
        zzgxgVar.zzd = this.zzd;
        return zzgxgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgxg) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzgxg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int iZzc = this.zza.zzc();
        int iZzl = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzl += zzl(this.zza.zzg(i));
        }
        java.util.Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzl += zzl((java.util.Map.Entry) it.next());
        }
        return iZzl;
    }

    public final java.util.Iterator zzf() {
        if (this.zza.isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        return this.zzd ? new com.google.android.gms.internal.ads.zzgyk(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            java.lang.Object value = this.zza.zzg(i).getValue();
            if (value instanceof com.google.android.gms.internal.ads.zzgxr) {
                ((com.google.android.gms.internal.ads.zzgxr) value).zzbU();
            }
        }
        java.util.Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            java.lang.Object value2 = ((java.util.Map.Entry) it.next()).getValue();
            if (value2 instanceof com.google.android.gms.internal.ads.zzgxr) {
                ((com.google.android.gms.internal.ads.zzgxr) value2).zzbU();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(com.google.android.gms.internal.ads.zzgxf zzgxfVar, java.lang.Object obj) {
        if (!zzgxfVar.zze()) {
            zzm(zzgxfVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                java.lang.Object obj2 = list.get(i);
                zzm(zzgxfVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgym) {
            this.zzd = true;
        }
        this.zza.put(zzgxfVar, obj);
    }

    public final boolean zzi() {
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzj(this.zza.zzg(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzj((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzgxg(boolean z) {
        zzg();
        zzg();
    }
}
