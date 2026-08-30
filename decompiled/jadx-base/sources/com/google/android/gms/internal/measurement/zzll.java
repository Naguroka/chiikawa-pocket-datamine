package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzll implements com.google.android.gms.internal.measurement.zzor {
    private final com.google.android.gms.internal.measurement.zzlk zza;

    private zzll(com.google.android.gms.internal.measurement.zzlk zzlkVar) {
        byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
        this.zza = zzlkVar;
        zzlkVar.zza = this;
    }

    public static com.google.android.gms.internal.measurement.zzll zza(com.google.android.gms.internal.measurement.zzlk zzlkVar) {
        com.google.android.gms.internal.measurement.zzll zzllVar = zzlkVar.zza;
        return zzllVar != null ? zzllVar : new com.google.android.gms.internal.measurement.zzll(zzlkVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzB(int i, int i2) throws java.io.IOException {
        this.zza.zzs(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzD(int i, long j) throws java.io.IOException {
        this.zza.zzu(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    @java.lang.Deprecated
    public final void zzF(int i) throws java.io.IOException {
        this.zza.zzr(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzG(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zzp(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzI(int i, int i2) throws java.io.IOException {
        this.zza.zzs(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzK(int i, long j) throws java.io.IOException {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzb(int i, boolean z) throws java.io.IOException {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzd(int i, com.google.android.gms.internal.measurement.zzld zzldVar) throws java.io.IOException {
        this.zza.zze(i, zzldVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zze(int i, java.util.List list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (com.google.android.gms.internal.measurement.zzld) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzf(int i, double d) throws java.io.IOException {
        this.zza.zzh(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    @java.lang.Deprecated
    public final void zzh(int i) throws java.io.IOException {
        this.zza.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzi(int i, int i2) throws java.io.IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzk(int i, int i2) throws java.io.IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzm(int i, long j) throws java.io.IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzo(int i, float f) throws java.io.IOException {
        this.zza.zzf(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzq(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zzns zznsVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
        zzlkVar.zzr(i, 3);
        zznsVar.zzi((com.google.android.gms.internal.measurement.zznh) obj, zzlkVar.zza);
        zzlkVar.zzr(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzr(int i, int i2) throws java.io.IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzt(int i, long j) throws java.io.IOException {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzv(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zzns zznsVar) throws java.io.IOException {
        this.zza.zzm(i, (com.google.android.gms.internal.measurement.zznh) obj, zznsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzw(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.measurement.zzld) {
            this.zza.zzo(i, (com.google.android.gms.internal.measurement.zzld) obj);
        } else {
            this.zza.zzn(i, (com.google.android.gms.internal.measurement.zznh) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzx(int i, int i2) throws java.io.IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzz(int i, long j) throws java.io.IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzH(int i, java.util.List list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmt)) {
            while (i2 < list.size()) {
                this.zza.zzp(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmt zzmtVar = (com.google.android.gms.internal.measurement.zzmt) list;
        while (i2 < list.size()) {
            java.lang.Object objZzc = zzmtVar.zzc();
            if (objZzc instanceof java.lang.String) {
                this.zza.zzp(i, (java.lang.String) objZzc);
            } else {
                this.zza.zze(i, (com.google.android.gms.internal.measurement.zzld) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzJ(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzs(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int iZzz = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzz += com.google.android.gms.internal.measurement.zzlk.zzz(((java.lang.Integer) list.get(i3)).intValue());
            }
            zzlkVar.zzt(iZzz);
            while (i2 < list.size()) {
                zzlkVar.zzt(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.zza.zzs(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int iZzz2 = 0;
        for (int i4 = 0; i4 < zzmeVar.size(); i4++) {
            iZzz2 += com.google.android.gms.internal.measurement.zzlk.zzz(zzmeVar.zze(i4));
        }
        zzlkVar2.zzt(iZzz2);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzt(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzL(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzu(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(((java.lang.Long) list.get(i3)).longValue());
            }
            zzlkVar.zzt(iZzA);
            while (i2 < list.size()) {
                zzlkVar.zzv(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                this.zza.zzu(i, zzmwVar.zza(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzmwVar.size(); i4++) {
            iZzA2 += com.google.android.gms.internal.measurement.zzlk.zzA(zzmwVar.zza(i4));
        }
        zzlkVar2.zzt(iZzA2);
        while (i2 < zzmwVar.size()) {
            zzlkVar2.zzv(zzmwVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzl(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzg(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.zza.zzf(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmeVar.size(); i6++) {
            zzmeVar.zze(i6);
            i5 += 4;
        }
        zzlkVar2.zzt(i5);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzg(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzn(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzi(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                this.zza.zzh(i, zzmwVar.zza(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmwVar.size(); i6++) {
            zzmwVar.zza(i6);
            i5 += 8;
        }
        zzlkVar2.zzt(i5);
        while (i2 < zzmwVar.size()) {
            zzlkVar2.zzi(zzmwVar.zza(i2));
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
    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzc(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzku)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzb(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzku zzkuVar = (com.google.android.gms.internal.measurement.zzku) list;
        if (!z) {
            while (i2 < zzkuVar.size()) {
                this.zza.zzd(i, zzkuVar.zzf(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzkuVar.size(); i6++) {
            zzkuVar.zzf(i6);
            i5++;
        }
        zzlkVar2.zzt(i5);
        while (i2 < zzkuVar.size()) {
            zzlkVar2.zzb(zzkuVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzs(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(((java.lang.Integer) list.get(i3)).intValue());
            }
            zzlkVar.zzt(iZzA);
            while (i2 < list.size()) {
                zzlkVar.zzk(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.zza.zzj(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzmeVar.size(); i4++) {
            iZzA2 += com.google.android.gms.internal.measurement.zzlk.zzA(zzmeVar.zze(i4));
        }
        zzlkVar2.zzt(iZzA2);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzk(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzA(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzi(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                this.zza.zzh(i, zzmwVar.zza(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmwVar.size(); i6++) {
            zzmwVar.zza(i6);
            i5 += 8;
        }
        zzlkVar2.zzt(i5);
        while (i2 < zzmwVar.size()) {
            zzlkVar2.zzi(zzmwVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzg(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzlm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzi(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlm zzlmVar = (com.google.android.gms.internal.measurement.zzlm) list;
        if (!z) {
            while (i2 < zzlmVar.size()) {
                this.zza.zzh(i, java.lang.Double.doubleToRawLongBits(zzlmVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzlmVar.size(); i6++) {
            zzlmVar.zze(i6);
            i5 += 8;
        }
        zzlkVar2.zzt(i5);
        while (i2 < zzlmVar.size()) {
            zzlkVar2.zzi(java.lang.Double.doubleToRawLongBits(zzlmVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzp(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzlw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzg(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlw zzlwVar = (com.google.android.gms.internal.measurement.zzlw) list;
        if (!z) {
            while (i2 < zzlwVar.size()) {
                this.zza.zzf(i, java.lang.Float.floatToRawIntBits(zzlwVar.zze(i2)));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzlwVar.size(); i6++) {
            zzlwVar.zze(i6);
            i5 += 4;
        }
        zzlkVar2.zzt(i5);
        while (i2 < zzlwVar.size()) {
            zzlkVar2.zzg(java.lang.Float.floatToRawIntBits(zzlwVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzy(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzlkVar.zzt(i3);
            while (i2 < list.size()) {
                zzlkVar.zzg(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.zza.zzf(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmeVar.size(); i6++) {
            zzmeVar.zze(i6);
            i5 += 4;
        }
        zzlkVar2.zzt(i5);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzg(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzC(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
                    int iIntValue = ((java.lang.Integer) list.get(i2)).intValue();
                    zzlkVar.zzs(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
            zzlkVar2.zzr(i, 2);
            int iZzz = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i3)).intValue();
                iZzz += com.google.android.gms.internal.measurement.zzlk.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzlkVar2.zzt(iZzz);
            while (i2 < list.size()) {
                int iIntValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                zzlkVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                com.google.android.gms.internal.measurement.zzlk zzlkVar3 = this.zza;
                int iZze = zzmeVar.zze(i2);
                zzlkVar3.zzs(i, (iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar4 = this.zza;
        zzlkVar4.zzr(i, 2);
        int iZzz2 = 0;
        for (int i4 = 0; i4 < zzmeVar.size(); i4++) {
            int iZze2 = zzmeVar.zze(i4);
            iZzz2 += com.google.android.gms.internal.measurement.zzlk.zzz((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzlkVar4.zzt(iZzz2);
        while (i2 < zzmeVar.size()) {
            int iZze3 = zzmeVar.zze(i2);
            zzlkVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzE(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
                    long jLongValue = ((java.lang.Long) list.get(i2)).longValue();
                    zzlkVar.zzu(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
            zzlkVar2.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((java.lang.Long) list.get(i3)).longValue();
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzlkVar2.zzt(iZzA);
            while (i2 < list.size()) {
                long jLongValue3 = ((java.lang.Long) list.get(i2)).longValue();
                zzlkVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                com.google.android.gms.internal.measurement.zzlk zzlkVar3 = this.zza;
                long jZza = zzmwVar.zza(i2);
                zzlkVar3.zzu(i, (jZza >> 63) ^ (jZza + jZza));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar4 = this.zza;
        zzlkVar4.zzr(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzmwVar.size(); i4++) {
            long jZza2 = zzmwVar.zza(i4);
            iZzA2 += com.google.android.gms.internal.measurement.zzlk.zzA((jZza2 >> 63) ^ (jZza2 + jZza2));
        }
        zzlkVar4.zzt(iZzA2);
        while (i2 < zzmwVar.size()) {
            long jZza3 = zzmwVar.zza(i2);
            zzlkVar4.zzv((jZza3 >> 63) ^ (jZza3 + jZza3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzj(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzme)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(((java.lang.Integer) list.get(i3)).intValue());
            }
            zzlkVar.zzt(iZzA);
            while (i2 < list.size()) {
                zzlkVar.zzk(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) list;
        if (!z) {
            while (i2 < zzmeVar.size()) {
                this.zza.zzj(i, zzmeVar.zze(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzmeVar.size(); i4++) {
            iZzA2 += com.google.android.gms.internal.measurement.zzlk.zzA(zzmeVar.zze(i4));
        }
        zzlkVar2.zzt(iZzA2);
        while (i2 < zzmeVar.size()) {
            zzlkVar2.zzk(zzmeVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzu(int i, java.util.List list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.zzmw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzu(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            com.google.android.gms.internal.measurement.zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += com.google.android.gms.internal.measurement.zzlk.zzA(((java.lang.Long) list.get(i3)).longValue());
            }
            zzlkVar.zzt(iZzA);
            while (i2 < list.size()) {
                zzlkVar.zzv(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzmw zzmwVar = (com.google.android.gms.internal.measurement.zzmw) list;
        if (!z) {
            while (i2 < zzmwVar.size()) {
                this.zza.zzu(i, zzmwVar.zza(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzmwVar.size(); i4++) {
            iZzA2 += com.google.android.gms.internal.measurement.zzlk.zzA(zzmwVar.zza(i4));
        }
        zzlkVar2.zzt(iZzA2);
        while (i2 < zzmwVar.size()) {
            zzlkVar2.zzv(zzmwVar.zza(i2));
            i2++;
        }
    }
}
