package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzez {
    private static final com.google.android.gms.internal.play_billing.zzez zzb = new com.google.android.gms.internal.play_billing.zzez(true);
    final com.google.android.gms.internal.play_billing.zzhd zza = new com.google.android.gms.internal.play_billing.zzgy();
    private boolean zzc;
    private boolean zzd;

    private zzez() {
    }

    static int zza(com.google.android.gms.internal.play_billing.zzhs zzhsVar, int i, java.lang.Object obj) {
        int iZzC = com.google.android.gms.internal.play_billing.zzep.zzC(i << 3);
        if (zzhsVar == com.google.android.gms.internal.play_billing.zzhs.GROUP) {
            com.google.android.gms.internal.play_billing.zzfo.zzd((com.google.android.gms.internal.play_billing.zzgl) obj);
            iZzC += iZzC;
        }
        return iZzC + zzb(zzhsVar, obj);
    }

    static int zzb(com.google.android.gms.internal.play_billing.zzhs zzhsVar, java.lang.Object obj) {
        int iZzd;
        int iZzC;
        com.google.android.gms.internal.play_billing.zzhs zzhsVar2 = com.google.android.gms.internal.play_billing.zzhs.DOUBLE;
        com.google.android.gms.internal.play_billing.zzht zzhtVar = com.google.android.gms.internal.play_billing.zzht.INT;
        switch (zzhsVar) {
            case DOUBLE:
                ((java.lang.Double) obj).doubleValue();
                int i = com.google.android.gms.internal.play_billing.zzep.zzb;
                return 8;
            case FLOAT:
                ((java.lang.Float) obj).floatValue();
                int i2 = com.google.android.gms.internal.play_billing.zzep.zzb;
                return 4;
            case INT64:
                return com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Long) obj).longValue());
            case UINT64:
                return com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Long) obj).longValue());
            case INT32:
                return com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Integer) obj).intValue());
            case FIXED64:
                ((java.lang.Long) obj).longValue();
                int i3 = com.google.android.gms.internal.play_billing.zzep.zzb;
                return 8;
            case FIXED32:
                ((java.lang.Integer) obj).intValue();
                int i4 = com.google.android.gms.internal.play_billing.zzep.zzb;
                return 4;
            case BOOL:
                ((java.lang.Boolean) obj).booleanValue();
                int i5 = com.google.android.gms.internal.play_billing.zzep.zzb;
                return 1;
            case STRING:
                if (!(obj instanceof com.google.android.gms.internal.play_billing.zzei)) {
                    return com.google.android.gms.internal.play_billing.zzep.zzB((java.lang.String) obj);
                }
                int i6 = com.google.android.gms.internal.play_billing.zzep.zzb;
                iZzd = ((com.google.android.gms.internal.play_billing.zzei) obj).zzd();
                iZzC = com.google.android.gms.internal.play_billing.zzep.zzC(iZzd);
                break;
                break;
            case GROUP:
                return ((com.google.android.gms.internal.play_billing.zzgl) obj).zzj();
            case MESSAGE:
                if (!(obj instanceof com.google.android.gms.internal.play_billing.zzfv)) {
                    return com.google.android.gms.internal.play_billing.zzep.zzz((com.google.android.gms.internal.play_billing.zzgl) obj);
                }
                int i7 = com.google.android.gms.internal.play_billing.zzep.zzb;
                iZzd = ((com.google.android.gms.internal.play_billing.zzfv) obj).zza();
                iZzC = com.google.android.gms.internal.play_billing.zzep.zzC(iZzd);
                break;
                break;
            case BYTES:
                if (!(obj instanceof com.google.android.gms.internal.play_billing.zzei)) {
                    int i8 = com.google.android.gms.internal.play_billing.zzep.zzb;
                    iZzd = ((byte[]) obj).length;
                    iZzC = com.google.android.gms.internal.play_billing.zzep.zzC(iZzd);
                } else {
                    int i9 = com.google.android.gms.internal.play_billing.zzep.zzb;
                    iZzd = ((com.google.android.gms.internal.play_billing.zzei) obj).zzd();
                    iZzC = com.google.android.gms.internal.play_billing.zzep.zzC(iZzd);
                }
                break;
            case UINT32:
                return com.google.android.gms.internal.play_billing.zzep.zzC(((java.lang.Integer) obj).intValue());
            case ENUM:
                return obj instanceof com.google.android.gms.internal.play_billing.zzfk ? com.google.android.gms.internal.play_billing.zzep.zzD(((com.google.android.gms.internal.play_billing.zzfk) obj).zza()) : com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Integer) obj).intValue());
            case SFIXED32:
                ((java.lang.Integer) obj).intValue();
                int i10 = com.google.android.gms.internal.play_billing.zzep.zzb;
                return 4;
            case SFIXED64:
                ((java.lang.Long) obj).longValue();
                int i11 = com.google.android.gms.internal.play_billing.zzep.zzb;
                return 8;
            case SINT32:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                return com.google.android.gms.internal.play_billing.zzep.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case SINT64:
                long jLongValue = ((java.lang.Long) obj).longValue();
                return com.google.android.gms.internal.play_billing.zzep.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzC + iZzd;
    }

    public static int zzc(com.google.android.gms.internal.play_billing.zzey zzeyVar, java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.zzhs zzhsVarZzb = zzeyVar.zzb();
        int iZza = zzeyVar.zza();
        if (!zzeyVar.zze()) {
            return zza(zzhsVarZzb, iZza, obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = list.size();
        int i = 0;
        if (!zzeyVar.zzd()) {
            int iZza2 = 0;
            while (i < size) {
                iZza2 += zza(zzhsVarZzb, iZza, list.get(i));
                i++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i < size) {
            iZzb += zzb(zzhsVarZzb, list.get(i));
            i++;
        }
        return com.google.android.gms.internal.play_billing.zzep.zzC(iZza << 3) + iZzb + com.google.android.gms.internal.play_billing.zzep.zzC(iZzb);
    }

    public static com.google.android.gms.internal.play_billing.zzez zze() {
        return zzb;
    }

    private static boolean zzj(java.util.Map.Entry entry) {
        com.google.android.gms.internal.play_billing.zzey zzeyVar = (com.google.android.gms.internal.play_billing.zzey) entry.getKey();
        if (zzeyVar.zzc() != com.google.android.gms.internal.play_billing.zzht.MESSAGE) {
            return true;
        }
        if (!zzeyVar.zze()) {
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
        if (obj instanceof com.google.android.gms.internal.play_billing.zzgm) {
            return ((com.google.android.gms.internal.play_billing.zzgm) obj).zzk();
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzfv) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(java.util.Map.Entry entry) {
        int i;
        int iZzC;
        int iZzC2;
        com.google.android.gms.internal.play_billing.zzey zzeyVar = (com.google.android.gms.internal.play_billing.zzey) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (zzeyVar.zzc() != com.google.android.gms.internal.play_billing.zzht.MESSAGE || zzeyVar.zze() || zzeyVar.zzd()) {
            return zzc(zzeyVar, value);
        }
        if (value instanceof com.google.android.gms.internal.play_billing.zzfv) {
            int iZza = ((com.google.android.gms.internal.play_billing.zzey) entry.getKey()).zza();
            int iZzC3 = com.google.android.gms.internal.play_billing.zzep.zzC(8);
            i = iZzC3 + iZzC3;
            iZzC = com.google.android.gms.internal.play_billing.zzep.zzC(16) + com.google.android.gms.internal.play_billing.zzep.zzC(iZza);
            int iZzC4 = com.google.android.gms.internal.play_billing.zzep.zzC(24);
            int iZza2 = ((com.google.android.gms.internal.play_billing.zzfv) value).zza();
            iZzC2 = iZzC4 + com.google.android.gms.internal.play_billing.zzep.zzC(iZza2) + iZza2;
        } else {
            int iZza3 = ((com.google.android.gms.internal.play_billing.zzey) entry.getKey()).zza();
            int iZzC5 = com.google.android.gms.internal.play_billing.zzep.zzC(8);
            i = iZzC5 + iZzC5;
            iZzC = com.google.android.gms.internal.play_billing.zzep.zzC(16) + com.google.android.gms.internal.play_billing.zzep.zzC(iZza3);
            iZzC2 = com.google.android.gms.internal.play_billing.zzep.zzC(24) + com.google.android.gms.internal.play_billing.zzep.zzz((com.google.android.gms.internal.play_billing.zzgl) value);
        }
        return i + iZzC + iZzC2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzm(com.google.android.gms.internal.play_billing.zzey zzeyVar, java.lang.Object obj) {
        boolean z;
        zzeyVar.zzb();
        byte[] bArr = com.google.android.gms.internal.play_billing.zzfo.zzb;
        obj.getClass();
        com.google.android.gms.internal.play_billing.zzhs zzhsVar = com.google.android.gms.internal.play_billing.zzhs.DOUBLE;
        com.google.android.gms.internal.play_billing.zzht zzhtVar = com.google.android.gms.internal.play_billing.zzht.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof java.lang.Long;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof java.lang.Float;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof java.lang.String;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof com.google.android.gms.internal.play_billing.zzei) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.play_billing.zzfk)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof com.google.android.gms.internal.play_billing.zzgl) || (obj instanceof com.google.android.gms.internal.play_billing.zzfv)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzeyVar.zza()), zzeyVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.play_billing.zzez zzezVar = new com.google.android.gms.internal.play_billing.zzez();
        com.google.android.gms.internal.play_billing.zzhd zzhdVar = this.zza;
        int iZzc = zzhdVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            java.util.Map.Entry entryZzg = zzhdVar.zzg(i);
            zzezVar.zzh((com.google.android.gms.internal.play_billing.zzey) ((com.google.android.gms.internal.play_billing.zzgz) entryZzg).zza(), entryZzg.getValue());
        }
        for (java.util.Map.Entry entry : zzhdVar.zzd()) {
            zzezVar.zzh((com.google.android.gms.internal.play_billing.zzey) entry.getKey(), entry.getValue());
        }
        zzezVar.zzd = this.zzd;
        return zzezVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzez) {
            return this.zza.equals(((com.google.android.gms.internal.play_billing.zzez) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        com.google.android.gms.internal.play_billing.zzhd zzhdVar = this.zza;
        int iZzc = zzhdVar.zzc();
        int iZzl = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzl += zzl(zzhdVar.zzg(i));
        }
        java.util.Iterator it = zzhdVar.zzd().iterator();
        while (it.hasNext()) {
            iZzl += zzl((java.util.Map.Entry) it.next());
        }
        return iZzl;
    }

    public final java.util.Iterator zzf() {
        com.google.android.gms.internal.play_billing.zzhd zzhdVar = this.zza;
        if (zzhdVar.isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        return this.zzd ? new com.google.android.gms.internal.play_billing.zzft(zzhdVar.entrySet().iterator()) : zzhdVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        com.google.android.gms.internal.play_billing.zzhd zzhdVar = this.zza;
        int iZzc = zzhdVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            java.lang.Object value = zzhdVar.zzg(i).getValue();
            if (value instanceof com.google.android.gms.internal.play_billing.zzfi) {
                ((com.google.android.gms.internal.play_billing.zzfi) value).zzu();
            }
        }
        java.util.Iterator it = zzhdVar.zzd().iterator();
        while (it.hasNext()) {
            java.lang.Object value2 = ((java.util.Map.Entry) it.next()).getValue();
            if (value2 instanceof com.google.android.gms.internal.play_billing.zzfi) {
                ((com.google.android.gms.internal.play_billing.zzfi) value2).zzu();
            }
        }
        zzhdVar.zza();
        this.zzc = true;
    }

    public final void zzh(com.google.android.gms.internal.play_billing.zzey zzeyVar, java.lang.Object obj) {
        if (!zzeyVar.zze()) {
            zzm(zzeyVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                java.lang.Object obj2 = list.get(i);
                zzm(zzeyVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzfv) {
            this.zzd = true;
        }
        this.zza.put(zzeyVar, obj);
    }

    public final boolean zzi() {
        com.google.android.gms.internal.play_billing.zzhd zzhdVar = this.zza;
        int iZzc = zzhdVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzj(zzhdVar.zzg(i))) {
                return false;
            }
        }
        java.util.Iterator it = zzhdVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzj((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzez(boolean z) {
        zzg();
        zzg();
    }
}
