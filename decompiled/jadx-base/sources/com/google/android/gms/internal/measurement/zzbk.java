package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbk extends com.google.android.gms.internal.measurement.zzaw {
    protected zzbk() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.ASSIGN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.CONST);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.CREATE_ARRAY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.CREATE_OBJECT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.EXPRESSION_LIST);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.GET);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.GET_INDEX);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.GET_PROPERTY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.NULL);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.SET_PROPERTY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.TYPEOF);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.UNDEFINED);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzap zzapVarZzb;
        java.lang.String str2;
        com.google.android.gms.internal.measurement.zzbl zzblVar = com.google.android.gms.internal.measurement.zzbl.ADD;
        int iOrdinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        int i = 0;
        if (iOrdinal == 3) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.ASSIGN.name(), 2, list);
            com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
            if (!(zzapVarZzb2 instanceof com.google.android.gms.internal.measurement.zzat)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for assign var. got %s", zzapVarZzb2.getClass().getCanonicalName()));
            }
            if (!zzgVar.zzh(zzapVarZzb2.zzi())) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Attempting to assign undefined value %s", zzapVarZzb2.zzi()));
            }
            com.google.android.gms.internal.measurement.zzap zzapVarZzb3 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
            zzgVar.zzg(zzapVarZzb2.zzi(), zzapVarZzb3);
            return zzapVarZzb3;
        }
        if (iOrdinal == 14) {
            com.google.android.gms.internal.measurement.zzh.zzi(com.google.android.gms.internal.measurement.zzbl.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("CONST requires an even number of arguments, found %s", java.lang.Integer.valueOf(list.size())));
            }
            for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                com.google.android.gms.internal.measurement.zzap zzapVarZzb4 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i2));
                if (!(zzapVarZzb4 instanceof com.google.android.gms.internal.measurement.zzat)) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for const name. got %s", zzapVarZzb4.getClass().getCanonicalName()));
                }
                zzgVar.zzf(zzapVarZzb4.zzi(), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i2 + 1)));
            }
            return com.google.android.gms.internal.measurement.zzap.zzf;
        }
        if (iOrdinal == 24) {
            com.google.android.gms.internal.measurement.zzh.zzi(com.google.android.gms.internal.measurement.zzbl.EXPRESSION_LIST.name(), 1, list);
            com.google.android.gms.internal.measurement.zzap zzapVarZzb5 = com.google.android.gms.internal.measurement.zzap.zzf;
            while (i < list.size()) {
                zzapVarZzb5 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i));
                if (zzapVarZzb5 instanceof com.google.android.gms.internal.measurement.zzag) {
                    throw new java.lang.IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return zzapVarZzb5;
        }
        if (iOrdinal == 33) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.GET.name(), 1, list);
            com.google.android.gms.internal.measurement.zzap zzapVarZzb6 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
            if (zzapVarZzb6 instanceof com.google.android.gms.internal.measurement.zzat) {
                return zzgVar.zzd(zzapVarZzb6.zzi());
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for get var. got %s", zzapVarZzb6.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.NULL.name(), 0, list);
            return com.google.android.gms.internal.measurement.zzap.zzg;
        }
        if (iOrdinal != 58) {
            if (iOrdinal == 17) {
                if (list.isEmpty()) {
                    return new com.google.android.gms.internal.measurement.zzae();
                }
                com.google.android.gms.internal.measurement.zzae zzaeVar = new com.google.android.gms.internal.measurement.zzae();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzap zzapVarZzb7 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) it.next());
                    if (zzapVarZzb7 instanceof com.google.android.gms.internal.measurement.zzag) {
                        throw new java.lang.IllegalStateException("Failed to evaluate array element");
                    }
                    zzaeVar.zzq(i, zzapVarZzb7);
                    i++;
                }
                return zzaeVar;
            }
            if (iOrdinal == 18) {
                if (list.isEmpty()) {
                    return new com.google.android.gms.internal.measurement.zzam();
                }
                if (list.size() % 2 != 0) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("CREATE_OBJECT requires an even number of arguments, found %s", java.lang.Integer.valueOf(list.size())));
                }
                com.google.android.gms.internal.measurement.zzam zzamVar = new com.google.android.gms.internal.measurement.zzam();
                while (i < list.size() - 1) {
                    com.google.android.gms.internal.measurement.zzap zzapVarZzb8 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i));
                    com.google.android.gms.internal.measurement.zzap zzapVarZzb9 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i + 1));
                    if ((zzapVarZzb8 instanceof com.google.android.gms.internal.measurement.zzag) || (zzapVarZzb9 instanceof com.google.android.gms.internal.measurement.zzag)) {
                        throw new java.lang.IllegalStateException("Failed to evaluate map entry");
                    }
                    zzamVar.zzr(zzapVarZzb8.zzi(), zzapVarZzb9);
                    i += 2;
                }
                return zzamVar;
            }
            if (iOrdinal == 35 || iOrdinal == 36) {
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.GET_PROPERTY.name(), 2, list);
                com.google.android.gms.internal.measurement.zzap zzapVarZzb10 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
                com.google.android.gms.internal.measurement.zzap zzapVarZzb11 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
                if ((zzapVarZzb10 instanceof com.google.android.gms.internal.measurement.zzae) && com.google.android.gms.internal.measurement.zzh.zzk(zzapVarZzb11)) {
                    return ((com.google.android.gms.internal.measurement.zzae) zzapVarZzb10).zze(zzapVarZzb11.zzh().intValue());
                }
                if (zzapVarZzb10 instanceof com.google.android.gms.internal.measurement.zzal) {
                    return ((com.google.android.gms.internal.measurement.zzal) zzapVarZzb10).zzf(zzapVarZzb11.zzi());
                }
                if (zzapVarZzb10 instanceof com.google.android.gms.internal.measurement.zzat) {
                    if ("length".equals(zzapVarZzb11.zzi())) {
                        zzapVarZzb = new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzapVarZzb10.zzi().length()));
                    } else if (com.google.android.gms.internal.measurement.zzh.zzk(zzapVarZzb11) && zzapVarZzb11.zzh().doubleValue() < zzapVarZzb10.zzi().length()) {
                        return new com.google.android.gms.internal.measurement.zzat(java.lang.String.valueOf(zzapVarZzb10.zzi().charAt(zzapVarZzb11.zzh().intValue())));
                    }
                }
                return com.google.android.gms.internal.measurement.zzap.zzf;
            }
            switch (iOrdinal) {
                case 62:
                    com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.TYPEOF.name(), 1, list);
                    com.google.android.gms.internal.measurement.zzap zzapVarZzb12 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
                    if (zzapVarZzb12 instanceof com.google.android.gms.internal.measurement.zzau) {
                        str2 = com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
                    } else if (zzapVarZzb12 instanceof com.google.android.gms.internal.measurement.zzaf) {
                        str2 = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN;
                    } else if (zzapVarZzb12 instanceof com.google.android.gms.internal.measurement.zzah) {
                        str2 = "number";
                    } else if (zzapVarZzb12 instanceof com.google.android.gms.internal.measurement.zzat) {
                        str2 = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING;
                    } else if (zzapVarZzb12 instanceof com.google.android.gms.internal.measurement.zzao) {
                        str2 = "function";
                    } else {
                        if ((zzapVarZzb12 instanceof com.google.android.gms.internal.measurement.zzaq) || (zzapVarZzb12 instanceof com.google.android.gms.internal.measurement.zzag)) {
                            throw new java.lang.IllegalArgumentException(java.lang.String.format("Unsupported value type %s in typeof", zzapVarZzb12));
                        }
                        str2 = "object";
                    }
                    return new com.google.android.gms.internal.measurement.zzat(str2);
                case 63:
                    com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.UNDEFINED.name(), 0, list);
                    return com.google.android.gms.internal.measurement.zzap.zzf;
                case 64:
                    com.google.android.gms.internal.measurement.zzh.zzi(com.google.android.gms.internal.measurement.zzbl.VAR.name(), 1, list);
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        com.google.android.gms.internal.measurement.zzap zzapVarZzb13 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) it2.next());
                        if (!(zzapVarZzb13 instanceof com.google.android.gms.internal.measurement.zzat)) {
                            throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected string for var name. got %s", zzapVarZzb13.getClass().getCanonicalName()));
                        }
                        zzgVar.zze(zzapVarZzb13.zzi(), com.google.android.gms.internal.measurement.zzap.zzf);
                    }
                    return com.google.android.gms.internal.measurement.zzap.zzf;
                default:
                    return super.zzb(str);
            }
        }
        com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.SET_PROPERTY.name(), 3, list);
        com.google.android.gms.internal.measurement.zzap zzapVarZzb14 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
        com.google.android.gms.internal.measurement.zzap zzapVarZzb15 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
        zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2));
        if (zzapVarZzb14 == com.google.android.gms.internal.measurement.zzap.zzf || zzapVarZzb14 == com.google.android.gms.internal.measurement.zzap.zzg) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Can't set property %s of %s", zzapVarZzb15.zzi(), zzapVarZzb14.zzi()));
        }
        if ((zzapVarZzb14 instanceof com.google.android.gms.internal.measurement.zzae) && (zzapVarZzb15 instanceof com.google.android.gms.internal.measurement.zzah)) {
            ((com.google.android.gms.internal.measurement.zzae) zzapVarZzb14).zzq(zzapVarZzb15.zzh().intValue(), zzapVarZzb);
        } else if (zzapVarZzb14 instanceof com.google.android.gms.internal.measurement.zzal) {
            ((com.google.android.gms.internal.measurement.zzal) zzapVarZzb14).zzr(zzapVarZzb15.zzi(), zzapVarZzb);
            return zzapVarZzb;
        }
        return zzapVarZzb;
    }
}
