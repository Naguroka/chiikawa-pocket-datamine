package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwx implements com.google.android.gms.internal.ads.zzhaw {
    private final com.google.android.gms.internal.ads.zzgww zza;

    private zzgwx(com.google.android.gms.internal.ads.zzgww zzgwwVar) {
        com.google.android.gms.internal.ads.zzgye.zzc(zzgwwVar, org.jacoco.core.runtime.AgentOptions.OUTPUT);
        this.zza = zzgwwVar;
        zzgwwVar.zze = this;
    }

    public static com.google.android.gms.internal.ads.zzgwx zza(com.google.android.gms.internal.ads.zzgww zzgwwVar) {
        com.google.android.gms.internal.ads.zzgwx zzgwxVar = zzgwwVar.zze;
        return zzgwxVar != null ? zzgwxVar : new com.google.android.gms.internal.ads.zzgwx(zzgwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzB(int i, int i2) throws java.io.IOException {
        this.zza.zzt(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzD(int i, long j) throws java.io.IOException {
        this.zza.zzv(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    @java.lang.Deprecated
    public final void zzF(int i) throws java.io.IOException {
        this.zza.zzs(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzG(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zzq(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzI(int i, int i2) throws java.io.IOException {
        this.zza.zzt(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzK(int i, long j) throws java.io.IOException {
        this.zza.zzv(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzb(int i, boolean z) throws java.io.IOException {
        this.zza.zzM(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzd(int i, com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws java.io.IOException {
        this.zza.zzN(i, zzgwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zze(int i, java.util.List list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzN(i, (com.google.android.gms.internal.ads.zzgwj) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzf(int i, double d) throws java.io.IOException {
        this.zza.zzj(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    @java.lang.Deprecated
    public final void zzh(int i) throws java.io.IOException {
        this.zza.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzi(int i, int i2) throws java.io.IOException {
        this.zza.zzl(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzk(int i, int i2) throws java.io.IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzm(int i, long j) throws java.io.IOException {
        this.zza.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzo(int i, float f) throws java.io.IOException {
        this.zza.zzh(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzq(int i, java.lang.Object obj, com.google.android.gms.internal.ads.zzgzv zzgzvVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgww zzgwwVar = this.zza;
        zzgwwVar.zzs(i, 3);
        zzgzvVar.zzj((com.google.android.gms.internal.ads.zzgzc) obj, zzgwwVar.zze);
        zzgwwVar.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzr(int i, int i2) throws java.io.IOException {
        this.zza.zzl(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzt(int i, long j) throws java.io.IOException {
        this.zza.zzv(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzv(int i, java.lang.Object obj, com.google.android.gms.internal.ads.zzgzv zzgzvVar) throws java.io.IOException {
        this.zza.zzn(i, (com.google.android.gms.internal.ads.zzgzc) obj, zzgzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzw(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.ads.zzgwj) {
            this.zza.zzp(i, (com.google.android.gms.internal.ads.zzgwj) obj);
        } else {
            this.zza.zzo(i, (com.google.android.gms.internal.ads.zzgzc) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzx(int i, int i2) throws java.io.IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzz(int i, long j) throws java.io.IOException {
        this.zza.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzH(int i, java.util.List list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgyo)) {
            while (i2 < list.size()) {
                this.zza.zzq(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgyo zzgyoVar = (com.google.android.gms.internal.ads.zzgyo) list;
        while (i2 < list.size()) {
            java.lang.Object objZzc = zzgyoVar.zzc();
            if (objZzc instanceof java.lang.String) {
                this.zza.zzq(i, (java.lang.String) objZzc);
            } else {
                this.zza.zzN(i, (com.google.android.gms.internal.ads.zzgwj) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzJ(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzt(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzD += com.google.android.gms.internal.ads.zzgww.zzD(((java.lang.Integer) list.get(i3)).intValue());
            }
            this.zza.zzu(iZzD);
            while (i2 < list.size()) {
                this.zza.zzu(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzt(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzgxsVar.size(); i4++) {
            iZzD2 += com.google.android.gms.internal.ads.zzgww.zzD(zzgxsVar.zzd(i4));
        }
        this.zza.zzu(iZzD2);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzu(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzL(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Long) list.get(i3)).longValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzw(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                this.zza.zzv(i, zzgyrVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgyrVar.size(); i4++) {
            iZzE2 += com.google.android.gms.internal.ads.zzgww.zzE(zzgyrVar.zza(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgyrVar.size()) {
            this.zza.zzw(zzgyrVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzl(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzh(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxsVar.size(); i6++) {
            zzgxsVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzi(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzn(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                this.zza.zzj(i, zzgyrVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgyrVar.size(); i6++) {
            zzgyrVar.zza(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzgyrVar.size()) {
            this.zza.zzk(zzgyrVar.zza(i2));
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzc(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgvz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzM(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzL(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgvz zzgvzVar = (com.google.android.gms.internal.ads.zzgvz) list;
        if (!z) {
            while (i2 < zzgvzVar.size()) {
                this.zza.zzM(i, zzgvzVar.zzh(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgvzVar.size(); i6++) {
            zzgvzVar.zzh(i6);
            i5++;
        }
        this.zza.zzu(i5);
        while (i2 < zzgvzVar.size()) {
            this.zza.zzL(zzgvzVar.zzh(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzs(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Integer) list.get(i3)).intValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzm(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzl(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgxsVar.size(); i4++) {
            iZzE2 += com.google.android.gms.internal.ads.zzgww.zzE(zzgxsVar.zzd(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzm(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzA(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                this.zza.zzj(i, zzgyrVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgyrVar.size(); i6++) {
            zzgyrVar.zza(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzgyrVar.size()) {
            this.zza.zzk(zzgyrVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzg(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgwy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgwy zzgwyVar = (com.google.android.gms.internal.ads.zzgwy) list;
        if (!z) {
            while (i2 < zzgwyVar.size()) {
                this.zza.zzj(i, java.lang.Double.doubleToRawLongBits(zzgwyVar.zzd(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgwyVar.size(); i6++) {
            zzgwyVar.zzd(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzgwyVar.size()) {
            this.zza.zzk(java.lang.Double.doubleToRawLongBits(zzgwyVar.zzd(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzp(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgxi)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgxi zzgxiVar = (com.google.android.gms.internal.ads.zzgxi) list;
        if (!z) {
            while (i2 < zzgxiVar.size()) {
                this.zza.zzh(i, java.lang.Float.floatToRawIntBits(zzgxiVar.zzd(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxiVar.size(); i6++) {
            zzgxiVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxiVar.size()) {
            this.zza.zzi(java.lang.Float.floatToRawIntBits(zzgxiVar.zzd(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzy(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzh(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxsVar.size(); i6++) {
            zzgxsVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzi(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzC(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.ads.zzgww zzgwwVar = this.zza;
                    int iIntValue = ((java.lang.Integer) list.get(i2)).intValue();
                    zzgwwVar.zzt(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i3)).intValue();
                iZzD += com.google.android.gms.internal.ads.zzgww.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzu(iZzD);
            while (i2 < list.size()) {
                com.google.android.gms.internal.ads.zzgww zzgwwVar2 = this.zza;
                int iIntValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                zzgwwVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                com.google.android.gms.internal.ads.zzgww zzgwwVar3 = this.zza;
                int iZzd = zzgxsVar.zzd(i2);
                zzgwwVar3.zzt(i, (iZzd >> 31) ^ (iZzd + iZzd));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzgxsVar.size(); i4++) {
            int iZzd2 = zzgxsVar.zzd(i4);
            iZzD2 += com.google.android.gms.internal.ads.zzgww.zzD((iZzd2 >> 31) ^ (iZzd2 + iZzd2));
        }
        this.zza.zzu(iZzD2);
        while (i2 < zzgxsVar.size()) {
            com.google.android.gms.internal.ads.zzgww zzgwwVar4 = this.zza;
            int iZzd3 = zzgxsVar.zzd(i2);
            zzgwwVar4.zzu((iZzd3 >> 31) ^ (iZzd3 + iZzd3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzE(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.ads.zzgww zzgwwVar = this.zza;
                    long jLongValue = ((java.lang.Long) list.get(i2)).longValue();
                    zzgwwVar.zzv(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((java.lang.Long) list.get(i3)).longValue();
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                com.google.android.gms.internal.ads.zzgww zzgwwVar2 = this.zza;
                long jLongValue3 = ((java.lang.Long) list.get(i2)).longValue();
                zzgwwVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                com.google.android.gms.internal.ads.zzgww zzgwwVar3 = this.zza;
                long jZza = zzgyrVar.zza(i2);
                zzgwwVar3.zzv(i, (jZza >> 63) ^ (jZza + jZza));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgyrVar.size(); i4++) {
            long jZza2 = zzgyrVar.zza(i4);
            iZzE2 += com.google.android.gms.internal.ads.zzgww.zzE((jZza2 >> 63) ^ (jZza2 + jZza2));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgyrVar.size()) {
            com.google.android.gms.internal.ads.zzgww zzgwwVar4 = this.zza;
            long jZza3 = zzgyrVar.zza(i2);
            zzgwwVar4.zzw((jZza3 >> 63) ^ (jZza3 + jZza3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzj(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Integer) list.get(i3)).intValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzm(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgxs zzgxsVar = (com.google.android.gms.internal.ads.zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzl(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgxsVar.size(); i4++) {
            iZzE2 += com.google.android.gms.internal.ads.zzgww.zzE(zzgxsVar.zzd(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzm(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzu(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += com.google.android.gms.internal.ads.zzgww.zzE(((java.lang.Long) list.get(i3)).longValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzw(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgyr zzgyrVar = (com.google.android.gms.internal.ads.zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                this.zza.zzv(i, zzgyrVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgyrVar.size(); i4++) {
            iZzE2 += com.google.android.gms.internal.ads.zzgww.zzE(zzgyrVar.zza(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgyrVar.size()) {
            this.zza.zzw(zzgyrVar.zza(i2));
            i2++;
        }
    }
}
