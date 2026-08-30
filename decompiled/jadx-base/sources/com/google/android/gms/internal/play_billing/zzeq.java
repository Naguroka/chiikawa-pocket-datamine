package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzeq implements com.google.android.gms.internal.play_billing.zzhu {
    private final com.google.android.gms.internal.play_billing.zzep zza;

    private zzeq(com.google.android.gms.internal.play_billing.zzep zzepVar) {
        byte[] bArr = com.google.android.gms.internal.play_billing.zzfo.zzb;
        this.zza = zzepVar;
        zzepVar.zza = this;
    }

    public static com.google.android.gms.internal.play_billing.zzeq zza(com.google.android.gms.internal.play_billing.zzep zzepVar) {
        com.google.android.gms.internal.play_billing.zzeq zzeqVar = zzepVar.zza;
        return zzeqVar != null ? zzeqVar : new com.google.android.gms.internal.play_billing.zzeq(zzepVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzB(int i, int i2) throws java.io.IOException {
        this.zza.zzu(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzD(int i, long j) throws java.io.IOException {
        this.zza.zzw(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    @java.lang.Deprecated
    public final void zzF(int i) throws java.io.IOException {
        this.zza.zzt(i, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzG(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zzr(i, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzI(int i, int i2) throws java.io.IOException {
        this.zza.zzu(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzK(int i, long j) throws java.io.IOException {
        this.zza.zzw(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzb(int i, boolean z) throws java.io.IOException {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzd(int i, com.google.android.gms.internal.play_billing.zzei zzeiVar) throws java.io.IOException {
        this.zza.zze(i, zzeiVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zze(int i, java.util.List list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (com.google.android.gms.internal.play_billing.zzei) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzf(int i, double d) throws java.io.IOException {
        this.zza.zzi(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    @java.lang.Deprecated
    public final void zzh(int i) throws java.io.IOException {
        this.zza.zzt(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzi(int i, int i2) throws java.io.IOException {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzk(int i, int i2) throws java.io.IOException {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzm(int i, long j) throws java.io.IOException {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzo(int i, float f) throws java.io.IOException {
        this.zza.zzg(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzq(int i, java.lang.Object obj, com.google.android.gms.internal.play_billing.zzgv zzgvVar) throws java.io.IOException {
        com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
        zzepVar.zzt(i, 3);
        zzgvVar.zzi((com.google.android.gms.internal.play_billing.zzgl) obj, zzepVar.zza);
        zzepVar.zzt(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzr(int i, int i2) throws java.io.IOException {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzt(int i, long j) throws java.io.IOException {
        this.zza.zzw(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzv(int i, java.lang.Object obj, com.google.android.gms.internal.play_billing.zzgv zzgvVar) throws java.io.IOException {
        this.zza.zzn(i, (com.google.android.gms.internal.play_billing.zzgl) obj, zzgvVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzw(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.play_billing.zzei) {
            this.zza.zzq(i, (com.google.android.gms.internal.play_billing.zzei) obj);
        } else {
            this.zza.zzp(i, (com.google.android.gms.internal.play_billing.zzgl) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzx(int i, int i2) throws java.io.IOException {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzz(int i, long j) throws java.io.IOException {
        this.zza.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzH(int i, java.util.List list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzfx)) {
            while (i2 < list.size()) {
                this.zza.zzr(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzfx zzfxVar = (com.google.android.gms.internal.play_billing.zzfx) list;
        while (i2 < list.size()) {
            java.lang.Object objZza = zzfxVar.zza();
            if (objZza instanceof java.lang.String) {
                this.zza.zzr(i, (java.lang.String) objZza);
            } else {
                this.zza.zze(i, (com.google.android.gms.internal.play_billing.zzei) objZza);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzJ(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzu(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzC += com.google.android.gms.internal.play_billing.zzep.zzC(((java.lang.Integer) list.get(i3)).intValue());
            }
            zzepVar.zzv(iZzC);
            while (i2 < list.size()) {
                zzepVar.zzv(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzu(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzC2 = 0;
        for (int i4 = 0; i4 < zzfjVar.size(); i4++) {
            iZzC2 += com.google.android.gms.internal.play_billing.zzep.zzC(zzfjVar.zze(i4));
        }
        zzepVar2.zzv(iZzC2);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzv(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzL(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzw(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Long) list.get(i3)).longValue());
            }
            zzepVar.zzv(iZzD);
            while (i2 < list.size()) {
                zzepVar.zzx(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) list;
        if (!z) {
            while (i2 < zzgaVar.size()) {
                this.zza.zzw(i, zzgaVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzgaVar.size(); i4++) {
            iZzD2 += com.google.android.gms.internal.play_billing.zzep.zzD(zzgaVar.zze(i4));
        }
        zzepVar2.zzv(iZzD2);
        while (i2 < zzgaVar.size()) {
            zzepVar2.zzx(zzgaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzl(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzh(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzg(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzfjVar.size(); i6++) {
            zzfjVar.zze(i6);
            i5 += 4;
        }
        zzepVar2.zzv(i5);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzh(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzn(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzj(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) list;
        if (!z) {
            while (i2 < zzgaVar.size()) {
                this.zza.zzi(i, zzgaVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgaVar.size(); i6++) {
            zzgaVar.zze(i6);
            i5 += 8;
        }
        zzepVar2.zzv(i5);
        while (i2 < zzgaVar.size()) {
            zzepVar2.zzj(zzgaVar.zze(i2));
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzc(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzdy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzb(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzdy zzdyVar = (com.google.android.gms.internal.play_billing.zzdy) list;
        if (!z) {
            while (i2 < zzdyVar.size()) {
                this.zza.zzd(i, zzdyVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdyVar.size(); i6++) {
            zzdyVar.zzf(i6);
            i5++;
        }
        zzepVar2.zzv(i5);
        while (i2 < zzdyVar.size()) {
            zzepVar2.zzb(zzdyVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzs(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzk(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Integer) list.get(i3)).intValue());
            }
            zzepVar.zzv(iZzD);
            while (i2 < list.size()) {
                zzepVar.zzl(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzk(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzfjVar.size(); i4++) {
            iZzD2 += com.google.android.gms.internal.play_billing.zzep.zzD(zzfjVar.zze(i4));
        }
        zzepVar2.zzv(iZzD2);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzl(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzA(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzj(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) list;
        if (!z) {
            while (i2 < zzgaVar.size()) {
                this.zza.zzi(i, zzgaVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgaVar.size(); i6++) {
            zzgaVar.zze(i6);
            i5 += 8;
        }
        zzepVar2.zzv(i5);
        while (i2 < zzgaVar.size()) {
            zzepVar2.zzj(zzgaVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzg(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzer)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzj(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzer zzerVar = (com.google.android.gms.internal.play_billing.zzer) list;
        if (!z) {
            while (i2 < zzerVar.size()) {
                this.zza.zzi(i, java.lang.Double.doubleToRawLongBits(zzerVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzerVar.size(); i6++) {
            zzerVar.zze(i6);
            i5 += 8;
        }
        zzepVar2.zzv(i5);
        while (i2 < zzerVar.size()) {
            zzepVar2.zzj(java.lang.Double.doubleToRawLongBits(zzerVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzp(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzfb)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzh(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzfb zzfbVar = (com.google.android.gms.internal.play_billing.zzfb) list;
        if (!z) {
            while (i2 < zzfbVar.size()) {
                this.zza.zzg(i, java.lang.Float.floatToRawIntBits(zzfbVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzfbVar.size(); i6++) {
            zzfbVar.zze(i6);
            i5 += 4;
        }
        zzepVar2.zzv(i5);
        while (i2 < zzfbVar.size()) {
            zzepVar2.zzh(java.lang.Float.floatToRawIntBits(zzfbVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzy(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzepVar.zzv(i3);
            while (i2 < list.size()) {
                zzepVar.zzh(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzg(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzfjVar.size(); i6++) {
            zzfjVar.zze(i6);
            i5 += 4;
        }
        zzepVar2.zzv(i5);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzh(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzC(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
                    int iIntValue = ((java.lang.Integer) list.get(i2)).intValue();
                    zzepVar.zzu(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
            zzepVar2.zzt(i, 2);
            int iZzC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i3)).intValue();
                iZzC += com.google.android.gms.internal.play_billing.zzep.zzC((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzepVar2.zzv(iZzC);
            while (i2 < list.size()) {
                int iIntValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                zzepVar2.zzv((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                com.google.android.gms.internal.play_billing.zzep zzepVar3 = this.zza;
                int iZze = zzfjVar.zze(i2);
                zzepVar3.zzu(i, (iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar4 = this.zza;
        zzepVar4.zzt(i, 2);
        int iZzC2 = 0;
        for (int i4 = 0; i4 < zzfjVar.size(); i4++) {
            int iZze2 = zzfjVar.zze(i4);
            iZzC2 += com.google.android.gms.internal.play_billing.zzep.zzC((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzepVar4.zzv(iZzC2);
        while (i2 < zzfjVar.size()) {
            int iZze3 = zzfjVar.zze(i2);
            zzepVar4.zzv((iZze3 >> 31) ^ (iZze3 + iZze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzE(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
                    long jLongValue = ((java.lang.Long) list.get(i2)).longValue();
                    zzepVar.zzw(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
            zzepVar2.zzt(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((java.lang.Long) list.get(i3)).longValue();
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzepVar2.zzv(iZzD);
            while (i2 < list.size()) {
                long jLongValue3 = ((java.lang.Long) list.get(i2)).longValue();
                zzepVar2.zzx((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) list;
        if (!z) {
            while (i2 < zzgaVar.size()) {
                com.google.android.gms.internal.play_billing.zzep zzepVar3 = this.zza;
                long jZze = zzgaVar.zze(i2);
                zzepVar3.zzw(i, (jZze >> 63) ^ (jZze + jZze));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar4 = this.zza;
        zzepVar4.zzt(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzgaVar.size(); i4++) {
            long jZze2 = zzgaVar.zze(i4);
            iZzD2 += com.google.android.gms.internal.play_billing.zzep.zzD((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzepVar4.zzv(iZzD2);
        while (i2 < zzgaVar.size()) {
            long jZze3 = zzgaVar.zze(i2);
            zzepVar4.zzx((jZze3 >> 63) ^ (jZze3 + jZze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzj(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzfj)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzk(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Integer) list.get(i3)).intValue());
            }
            zzepVar.zzv(iZzD);
            while (i2 < list.size()) {
                zzepVar.zzl(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzfj zzfjVar = (com.google.android.gms.internal.play_billing.zzfj) list;
        if (!z) {
            while (i2 < zzfjVar.size()) {
                this.zza.zzk(i, zzfjVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzfjVar.size(); i4++) {
            iZzD2 += com.google.android.gms.internal.play_billing.zzep.zzD(zzfjVar.zze(i4));
        }
        zzepVar2.zzv(iZzD2);
        while (i2 < zzfjVar.size()) {
            zzepVar2.zzl(zzfjVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzu(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.zzga)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzw(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.play_billing.zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzD += com.google.android.gms.internal.play_billing.zzep.zzD(((java.lang.Long) list.get(i3)).longValue());
            }
            zzepVar.zzv(iZzD);
            while (i2 < list.size()) {
                zzepVar.zzx(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzga zzgaVar = (com.google.android.gms.internal.play_billing.zzga) list;
        if (!z) {
            while (i2 < zzgaVar.size()) {
                this.zza.zzw(i, zzgaVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzgaVar.size(); i4++) {
            iZzD2 += com.google.android.gms.internal.play_billing.zzep.zzD(zzgaVar.zze(i4));
        }
        zzepVar2.zzv(iZzD2);
        while (i2 < zzgaVar.size()) {
            zzepVar2.zzx(zzgaVar.zze(i2));
            i2++;
        }
    }
}
