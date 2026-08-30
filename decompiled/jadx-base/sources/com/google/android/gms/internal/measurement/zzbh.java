package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbh extends com.google.android.gms.internal.measurement.zzaw {
    protected zzbh() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.FOR_IN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.FOR_IN_CONST);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.FOR_IN_LET);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.FOR_LET);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.FOR_OF);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.FOR_OF_CONST);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.FOR_OF_LET);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.WHILE);
    }

    private static com.google.android.gms.internal.measurement.zzap zzc(com.google.android.gms.internal.measurement.zzbf zzbfVar, java.util.Iterator it, com.google.android.gms.internal.measurement.zzap zzapVar) {
        if (it != null) {
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzap zzapVarZzc = zzbfVar.zza((com.google.android.gms.internal.measurement.zzap) it.next()).zzc((com.google.android.gms.internal.measurement.zzae) zzapVar);
                if (zzapVarZzc instanceof com.google.android.gms.internal.measurement.zzag) {
                    com.google.android.gms.internal.measurement.zzag zzagVar = (com.google.android.gms.internal.measurement.zzag) zzapVarZzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return com.google.android.gms.internal.measurement.zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
        }
        return com.google.android.gms.internal.measurement.zzap.zzf;
    }

    private static com.google.android.gms.internal.measurement.zzap zzd(com.google.android.gms.internal.measurement.zzbf zzbfVar, com.google.android.gms.internal.measurement.zzap zzapVar, com.google.android.gms.internal.measurement.zzap zzapVar2) {
        return zzc(zzbfVar, zzapVar.zzl(), zzapVar2);
    }

    private static com.google.android.gms.internal.measurement.zzap zze(com.google.android.gms.internal.measurement.zzbf zzbfVar, com.google.android.gms.internal.measurement.zzap zzapVar, com.google.android.gms.internal.measurement.zzap zzapVar2) {
        if (zzapVar instanceof java.lang.Iterable) {
            return zzc(zzbfVar, ((java.lang.Iterable) zzapVar).iterator(), zzapVar2);
        }
        throw new java.lang.IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzbl zzblVar = com.google.android.gms.internal.measurement.zzbl.ADD;
        int iOrdinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (iOrdinal == 65) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.WHILE.name(), 4, list);
            com.google.android.gms.internal.measurement.zzap zzapVar = (com.google.android.gms.internal.measurement.zzap) list.get(0);
            com.google.android.gms.internal.measurement.zzap zzapVar2 = (com.google.android.gms.internal.measurement.zzap) list.get(1);
            com.google.android.gms.internal.measurement.zzap zzapVar3 = (com.google.android.gms.internal.measurement.zzap) list.get(2);
            com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(3));
            if (zzgVar.zzb(zzapVar3).zzg().booleanValue()) {
                com.google.android.gms.internal.measurement.zzap zzapVarZzc = zzgVar.zzc((com.google.android.gms.internal.measurement.zzae) zzapVarZzb);
                if (zzapVarZzc instanceof com.google.android.gms.internal.measurement.zzag) {
                    com.google.android.gms.internal.measurement.zzag zzagVar = (com.google.android.gms.internal.measurement.zzag) zzapVarZzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return com.google.android.gms.internal.measurement.zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
            while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                com.google.android.gms.internal.measurement.zzap zzapVarZzc2 = zzgVar.zzc((com.google.android.gms.internal.measurement.zzae) zzapVarZzb);
                if (zzapVarZzc2 instanceof com.google.android.gms.internal.measurement.zzag) {
                    com.google.android.gms.internal.measurement.zzag zzagVar2 = (com.google.android.gms.internal.measurement.zzag) zzapVarZzc2;
                    if ("break".equals(zzagVar2.zzc())) {
                        return com.google.android.gms.internal.measurement.zzap.zzf;
                    }
                    if ("return".equals(zzagVar2.zzc())) {
                        return zzagVar2;
                    }
                }
                zzgVar.zzb(zzapVar2);
            }
            return com.google.android.gms.internal.measurement.zzap.zzf;
        }
        switch (iOrdinal) {
            case 26:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzat)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return zzd(new com.google.android.gms.internal.measurement.zzbg(zzgVar, ((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi()), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2)));
            case 27:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzat)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return zzd(new com.google.android.gms.internal.measurement.zzbd(zzgVar, ((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi()), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2)));
            case 28:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzat)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return zzd(new com.google.android.gms.internal.measurement.zzbe(zzgVar, ((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi()), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2)));
            case 29:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.FOR_LET.name(), 4, list);
                com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
                if (!(zzapVarZzb2 instanceof com.google.android.gms.internal.measurement.zzae)) {
                    throw new java.lang.IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                com.google.android.gms.internal.measurement.zzae zzaeVar = (com.google.android.gms.internal.measurement.zzae) zzapVarZzb2;
                com.google.android.gms.internal.measurement.zzap zzapVar4 = (com.google.android.gms.internal.measurement.zzap) list.get(1);
                com.google.android.gms.internal.measurement.zzap zzapVar5 = (com.google.android.gms.internal.measurement.zzap) list.get(2);
                com.google.android.gms.internal.measurement.zzap zzapVarZzb3 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(3));
                com.google.android.gms.internal.measurement.zzg zzgVarZza = zzgVar.zza();
                for (int i = 0; i < zzaeVar.zzc(); i++) {
                    java.lang.String strZzi = zzaeVar.zze(i).zzi();
                    zzgVarZza.zzg(strZzi, zzgVar.zzd(strZzi));
                }
                while (zzgVar.zzb(zzapVar4).zzg().booleanValue()) {
                    com.google.android.gms.internal.measurement.zzap zzapVarZzc3 = zzgVar.zzc((com.google.android.gms.internal.measurement.zzae) zzapVarZzb3);
                    if (zzapVarZzc3 instanceof com.google.android.gms.internal.measurement.zzag) {
                        com.google.android.gms.internal.measurement.zzag zzagVar3 = (com.google.android.gms.internal.measurement.zzag) zzapVarZzc3;
                        if ("break".equals(zzagVar3.zzc())) {
                            return com.google.android.gms.internal.measurement.zzap.zzf;
                        }
                        if ("return".equals(zzagVar3.zzc())) {
                            return zzagVar3;
                        }
                    }
                    com.google.android.gms.internal.measurement.zzg zzgVarZza2 = zzgVar.zza();
                    for (int i2 = 0; i2 < zzaeVar.zzc(); i2++) {
                        java.lang.String strZzi2 = zzaeVar.zze(i2).zzi();
                        zzgVarZza2.zzg(strZzi2, zzgVarZza.zzd(strZzi2));
                    }
                    zzgVarZza2.zzb(zzapVar5);
                    zzgVarZza = zzgVarZza2;
                }
                return com.google.android.gms.internal.measurement.zzap.zzf;
            case 30:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzat)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return zze(new com.google.android.gms.internal.measurement.zzbg(zzgVar, ((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi()), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2)));
            case 31:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzat)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return zze(new com.google.android.gms.internal.measurement.zzbd(zzgVar, ((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi()), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2)));
            case 32:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof com.google.android.gms.internal.measurement.zzat)) {
                    throw new java.lang.IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return zze(new com.google.android.gms.internal.measurement.zzbe(zzgVar, ((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi()), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2)));
            default:
                return super.zzb(str);
        }
    }
}
