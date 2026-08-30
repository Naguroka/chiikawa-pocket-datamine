package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlu {
    private static final com.google.android.gms.internal.measurement.zzlu zzb = new com.google.android.gms.internal.measurement.zzlu(true);
    final com.google.android.gms.internal.measurement.zzoa zza = new com.google.android.gms.internal.measurement.zznv();
    private boolean zzc;
    private boolean zzd;

    private zzlu() {
    }

    static int zza(com.google.android.gms.internal.measurement.zzop zzopVar, int i, java.lang.Object obj) {
        com.google.android.gms.internal.measurement.zzlk.zzz(i << 3);
        if (com.google.android.gms.internal.measurement.zzop.GROUP == null) {
            com.google.android.gms.internal.measurement.zznh zznhVar = (com.google.android.gms.internal.measurement.zznh) obj;
            byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
            if (zznhVar instanceof com.google.android.gms.internal.measurement.zzkp) {
                throw null;
            }
        }
        com.google.android.gms.internal.measurement.zzoq zzoqVar = com.google.android.gms.internal.measurement.zzoq.INT;
        throw null;
    }

    public static int zzb(com.google.android.gms.internal.measurement.zzlt zzltVar, java.lang.Object obj) {
        com.google.android.gms.internal.measurement.zzop zzopVarZzb = zzltVar.zzb();
        int iZza = zzltVar.zza();
        if (!zzltVar.zze()) {
            return zza(zzopVarZzb, iZza, obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = list.size();
        if (!zzltVar.zzd()) {
            int iZza2 = 0;
            for (int i = 0; i < size; i++) {
                iZza2 += zza(zzopVarZzb, iZza, list.get(i));
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return com.google.android.gms.internal.measurement.zzlk.zzz(iZza << 3) + com.google.android.gms.internal.measurement.zzlk.zzz(0);
        }
        list.get(0);
        com.google.android.gms.internal.measurement.zzop zzopVar = com.google.android.gms.internal.measurement.zzop.DOUBLE;
        com.google.android.gms.internal.measurement.zzoq zzoqVar = com.google.android.gms.internal.measurement.zzoq.INT;
        throw null;
    }

    public static com.google.android.gms.internal.measurement.zzlu zzd() {
        return zzb;
    }

    private static boolean zzi(java.util.Map.Entry entry) {
        com.google.android.gms.internal.measurement.zzlt zzltVar = (com.google.android.gms.internal.measurement.zzlt) entry.getKey();
        if (zzltVar.zzc() != com.google.android.gms.internal.measurement.zzoq.MESSAGE) {
            return true;
        }
        if (!zzltVar.zze()) {
            return zzj(entry.getValue());
        }
        java.util.List list = (java.util.List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzj(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzj(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.measurement.zzni) {
            return ((com.google.android.gms.internal.measurement.zzni) obj).zzcD();
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzmr) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzk(java.util.Map.Entry entry) {
        int i;
        int iZzz;
        int iZzz2;
        int iZzcf;
        int iZzz3;
        com.google.android.gms.internal.measurement.zzlt zzltVar = (com.google.android.gms.internal.measurement.zzlt) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (zzltVar.zzc() != com.google.android.gms.internal.measurement.zzoq.MESSAGE || zzltVar.zze() || zzltVar.zzd()) {
            return zzb(zzltVar, value);
        }
        if (value instanceof com.google.android.gms.internal.measurement.zzmr) {
            int iZza = ((com.google.android.gms.internal.measurement.zzlt) entry.getKey()).zza();
            int iZzz4 = com.google.android.gms.internal.measurement.zzlk.zzz(8);
            i = iZzz4 + iZzz4;
            iZzz = com.google.android.gms.internal.measurement.zzlk.zzz(16) + com.google.android.gms.internal.measurement.zzlk.zzz(iZza);
            iZzz2 = com.google.android.gms.internal.measurement.zzlk.zzz(24);
            iZzcf = ((com.google.android.gms.internal.measurement.zzmr) value).zza();
            iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(iZzcf);
        } else {
            int iZza2 = ((com.google.android.gms.internal.measurement.zzlt) entry.getKey()).zza();
            int iZzz5 = com.google.android.gms.internal.measurement.zzlk.zzz(8);
            i = iZzz5 + iZzz5;
            iZzz = com.google.android.gms.internal.measurement.zzlk.zzz(16) + com.google.android.gms.internal.measurement.zzlk.zzz(iZza2);
            iZzz2 = com.google.android.gms.internal.measurement.zzlk.zzz(24);
            iZzcf = ((com.google.android.gms.internal.measurement.zznh) value).zzcf();
            iZzz3 = com.google.android.gms.internal.measurement.zzlk.zzz(iZzcf);
        }
        return i + iZzz + iZzz2 + iZzz3 + iZzcf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzl(com.google.android.gms.internal.measurement.zzlt zzltVar, java.lang.Object obj) {
        boolean z;
        zzltVar.zzb();
        byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
        obj.getClass();
        com.google.android.gms.internal.measurement.zzop zzopVar = com.google.android.gms.internal.measurement.zzop.DOUBLE;
        com.google.android.gms.internal.measurement.zzoq zzoqVar = com.google.android.gms.internal.measurement.zzoq.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof java.lang.Long;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof java.lang.Float;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof java.lang.String;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof com.google.android.gms.internal.measurement.zzld) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.measurement.zzmf)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof com.google.android.gms.internal.measurement.zznh) || (obj instanceof com.google.android.gms.internal.measurement.zzmr)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.measurement.zzlu zzluVar = new com.google.android.gms.internal.measurement.zzlu();
        com.google.android.gms.internal.measurement.zzoa zzoaVar = this.zza;
        int iZzc = zzoaVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            java.util.Map.Entry entryZzg = zzoaVar.zzg(i);
            zzluVar.zzg((com.google.android.gms.internal.measurement.zzlt) ((com.google.android.gms.internal.measurement.zznw) entryZzg).zza(), entryZzg.getValue());
        }
        for (java.util.Map.Entry entry : zzoaVar.zzd()) {
            zzluVar.zzg((com.google.android.gms.internal.measurement.zzlt) entry.getKey(), entry.getValue());
        }
        zzluVar.zzd = this.zzd;
        return zzluVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzlu) {
            return this.zza.equals(((com.google.android.gms.internal.measurement.zzlu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        com.google.android.gms.internal.measurement.zzoa zzoaVar = this.zza;
        int iZzc = zzoaVar.zzc();
        int iZzk = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzk += zzk(zzoaVar.zzg(i));
        }
        java.util.Iterator it = zzoaVar.zzd().iterator();
        while (it.hasNext()) {
            iZzk += zzk((java.util.Map.Entry) it.next());
        }
        return iZzk;
    }

    public final java.util.Iterator zze() {
        com.google.android.gms.internal.measurement.zzoa zzoaVar = this.zza;
        if (zzoaVar.isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        return this.zzd ? new com.google.android.gms.internal.measurement.zzmp(zzoaVar.entrySet().iterator()) : zzoaVar.entrySet().iterator();
    }

    public final void zzf() {
        if (this.zzc) {
            return;
        }
        com.google.android.gms.internal.measurement.zzoa zzoaVar = this.zza;
        int iZzc = zzoaVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            java.lang.Object value = zzoaVar.zzg(i).getValue();
            if (value instanceof com.google.android.gms.internal.measurement.zzmd) {
                ((com.google.android.gms.internal.measurement.zzmd) value).zzcr();
            }
        }
        java.util.Iterator it = zzoaVar.zzd().iterator();
        while (it.hasNext()) {
            java.lang.Object value2 = ((java.util.Map.Entry) it.next()).getValue();
            if (value2 instanceof com.google.android.gms.internal.measurement.zzmd) {
                ((com.google.android.gms.internal.measurement.zzmd) value2).zzcr();
            }
        }
        zzoaVar.zza();
        this.zzc = true;
    }

    public final void zzg(com.google.android.gms.internal.measurement.zzlt zzltVar, java.lang.Object obj) {
        if (!zzltVar.zze()) {
            zzl(zzltVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                java.lang.Object obj2 = list.get(i);
                zzl(zzltVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzmr) {
            this.zzd = true;
        }
        this.zza.put(zzltVar, obj);
    }

    public final boolean zzh() {
        com.google.android.gms.internal.measurement.zzoa zzoaVar = this.zza;
        int iZzc = zzoaVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzi(zzoaVar.zzg(i))) {
                return false;
            }
        }
        java.util.Iterator it = zzoaVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzi((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzlu(boolean z) {
        zzf();
        zzf();
    }
}
