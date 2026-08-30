package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaz extends com.google.android.gms.internal.measurement.zzaw {
    protected zzaz() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.APPLY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.BLOCK);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.BREAK);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.CASE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.DEFAULT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.CONTINUE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.DEFINE_FUNCTION);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.FN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.IF);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.QUOTE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.RETURN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.SWITCH);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.TERNARY);
    }

    private static com.google.android.gms.internal.measurement.zzap zzc(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzh.zzi(com.google.android.gms.internal.measurement.zzbl.FN.name(), 2, list);
        com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
        com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
        if (!(zzapVarZzb2 instanceof com.google.android.gms.internal.measurement.zzae)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("FN requires an ArrayValue of parameter names found %s", zzapVarZzb2.getClass().getCanonicalName()));
        }
        java.util.List listZzm = ((com.google.android.gms.internal.measurement.zzae) zzapVarZzb2).zzm();
        java.util.List arrayList = new java.util.ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new com.google.android.gms.internal.measurement.zzao(zzapVarZzb.zzi(), listZzm, arrayList, zzgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzbl zzblVar = com.google.android.gms.internal.measurement.zzbl.ADD;
        int iOrdinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (iOrdinal == 2) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.APPLY.name(), 3, list);
            com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
            java.lang.String strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzi();
            com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2));
            if (!(zzapVarZzb2 instanceof com.google.android.gms.internal.measurement.zzae)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Function arguments for Apply are not a list found %s", zzapVarZzb2.getClass().getCanonicalName()));
            }
            if (strZzi.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Function name for apply is undefined");
            }
            return zzapVarZzb.zzcz(strZzi, zzgVar, ((com.google.android.gms.internal.measurement.zzae) zzapVarZzb2).zzm());
        }
        if (iOrdinal == 15) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.BREAK.name(), 0, list);
            return com.google.android.gms.internal.measurement.zzap.zzh;
        }
        if (iOrdinal == 25) {
            return zzc(zzgVar, list);
        }
        if (iOrdinal != 41) {
            if (iOrdinal == 54) {
                return new com.google.android.gms.internal.measurement.zzae(list);
            }
            if (iOrdinal == 57) {
                if (list.isEmpty()) {
                    return com.google.android.gms.internal.measurement.zzap.zzj;
                }
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.RETURN.name(), 1, list);
                return new com.google.android.gms.internal.measurement.zzag("return", zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)));
            }
            if (iOrdinal != 19) {
                if (iOrdinal == 20) {
                    com.google.android.gms.internal.measurement.zzh.zzi(com.google.android.gms.internal.measurement.zzbl.DEFINE_FUNCTION.name(), 2, list);
                    com.google.android.gms.internal.measurement.zzao zzaoVar = (com.google.android.gms.internal.measurement.zzao) zzc(zzgVar, list);
                    if (zzaoVar.zzc() == null) {
                        zzgVar.zzg("", zzaoVar);
                        return zzaoVar;
                    }
                    zzgVar.zzg(zzaoVar.zzc(), zzaoVar);
                    return zzaoVar;
                }
                if (iOrdinal == 60) {
                    com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.SWITCH.name(), 3, list);
                    com.google.android.gms.internal.measurement.zzap zzapVarZzb3 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
                    com.google.android.gms.internal.measurement.zzap zzapVarZzb4 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
                    com.google.android.gms.internal.measurement.zzap zzapVarZzb5 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2));
                    if (!(zzapVarZzb4 instanceof com.google.android.gms.internal.measurement.zzae)) {
                        throw new java.lang.IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                    }
                    if (!(zzapVarZzb5 instanceof com.google.android.gms.internal.measurement.zzae)) {
                        throw new java.lang.IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                    }
                    com.google.android.gms.internal.measurement.zzae zzaeVar = (com.google.android.gms.internal.measurement.zzae) zzapVarZzb4;
                    com.google.android.gms.internal.measurement.zzae zzaeVar2 = (com.google.android.gms.internal.measurement.zzae) zzapVarZzb5;
                    boolean z = false;
                    for (int i = 0; i < zzaeVar.zzc(); i++) {
                        if (z || zzapVarZzb3.equals(zzgVar.zzb(zzaeVar.zze(i)))) {
                            com.google.android.gms.internal.measurement.zzap zzapVarZzb6 = zzgVar.zzb(zzaeVar2.zze(i));
                            if (!(zzapVarZzb6 instanceof com.google.android.gms.internal.measurement.zzag)) {
                                z = true;
                            } else if (!((com.google.android.gms.internal.measurement.zzag) zzapVarZzb6).zzc().equals("break")) {
                                return zzapVarZzb6;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (zzaeVar.zzc() + 1 == zzaeVar2.zzc()) {
                        com.google.android.gms.internal.measurement.zzap zzapVarZzb7 = zzgVar.zzb(zzaeVar2.zze(zzaeVar.zzc()));
                        if (zzapVarZzb7 instanceof com.google.android.gms.internal.measurement.zzag) {
                            java.lang.String strZzc = ((com.google.android.gms.internal.measurement.zzag) zzapVarZzb7).zzc();
                            if (strZzc.equals("return") || strZzc.equals("continue")) {
                                return zzapVarZzb7;
                            }
                        }
                    }
                } else {
                    if (iOrdinal == 61) {
                        com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.TERNARY.name(), 3, list);
                        return zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzg().booleanValue() ? zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)) : zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2));
                    }
                    switch (iOrdinal) {
                        case 11:
                            return zzgVar.zza().zzc(new com.google.android.gms.internal.measurement.zzae(list));
                        case 12:
                            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.BREAK.name(), 0, list);
                            return com.google.android.gms.internal.measurement.zzap.zzi;
                        case 13:
                            break;
                        default:
                            return super.zzb(str);
                    }
                }
            }
            if (list.isEmpty()) {
                return com.google.android.gms.internal.measurement.zzap.zzf;
            }
            com.google.android.gms.internal.measurement.zzap zzapVarZzb8 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
            return zzapVarZzb8 instanceof com.google.android.gms.internal.measurement.zzae ? zzgVar.zzc((com.google.android.gms.internal.measurement.zzae) zzapVarZzb8) : com.google.android.gms.internal.measurement.zzap.zzf;
        }
        com.google.android.gms.internal.measurement.zzh.zzi(com.google.android.gms.internal.measurement.zzbl.IF.name(), 2, list);
        com.google.android.gms.internal.measurement.zzap zzapVarZzb9 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
        com.google.android.gms.internal.measurement.zzap zzapVarZzb10 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
        com.google.android.gms.internal.measurement.zzap zzapVarZzb11 = list.size() > 2 ? zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2)) : null;
        com.google.android.gms.internal.measurement.zzap zzapVarZzc = zzapVarZzb9.zzg().booleanValue() ? zzgVar.zzc((com.google.android.gms.internal.measurement.zzae) zzapVarZzb10) : zzapVarZzb11 != null ? zzgVar.zzc((com.google.android.gms.internal.measurement.zzae) zzapVarZzb11) : com.google.android.gms.internal.measurement.zzap.zzf;
        if (zzapVarZzc instanceof com.google.android.gms.internal.measurement.zzag) {
            return zzapVarZzc;
        }
        return com.google.android.gms.internal.measurement.zzap.zzf;
    }
}
