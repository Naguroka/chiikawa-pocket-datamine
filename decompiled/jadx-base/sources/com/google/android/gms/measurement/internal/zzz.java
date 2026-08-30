package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzae zza;
    private com.google.android.gms.internal.measurement.zzhm zzb;
    private java.lang.Long zzc;
    private long zzd;

    /* synthetic */ zzz(com.google.android.gms.measurement.internal.zzae zzaeVar, com.google.android.gms.measurement.internal.zzad zzadVar) {
        this.zza = zzaeVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x008c A[Catch: SQLiteException -> 0x00df, all -> 0x01de, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x00df, blocks: (B:18:0x0086, B:20:0x008c, B:24:0x00a2, B:25:0x00ae, B:26:0x00be, B:30:0x00c9), top: B:84:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a2 A[Catch: SQLiteException -> 0x00df, all -> 0x01de, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x00df, blocks: (B:18:0x0086, B:20:0x008c, B:24:0x00a2, B:25:0x00ae, B:26:0x00be, B:30:0x00c9), top: B:84:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8 A[PHI: r14
  0x00f8: PHI (r14v3 android.database.Cursor) = (r14v2 android.database.Cursor), (r14v5 android.database.Cursor) binds: [B:40:0x00f6, B:31:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6, types: [long] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v7 */
    final com.google.android.gms.internal.measurement.zzhm zza(java.lang.String str, com.google.android.gms.internal.measurement.zzhm zzhmVar) {
        com.google.android.gms.measurement.internal.zzaw zzawVarZzj;
        ?? r7;
        android.database.Cursor cursorRawQuery;
        android.util.Pair pairCreate;
        ?? LongValue;
        java.lang.String strZzh = zzhmVar.zzh();
        java.util.List listZzi = zzhmVar.zzi();
        com.google.android.gms.measurement.internal.zzae zzaeVar = this.zza;
        com.google.android.gms.measurement.internal.zzpv zzpvVar = zzaeVar.zzg;
        zzpvVar.zzA();
        java.lang.Long l = (java.lang.Long) com.google.android.gms.measurement.internal.zzqa.zzH(zzhmVar, "_eid");
        if (l != null) {
            if (strZzh.equals("_ep")) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(l);
                zzpvVar.zzA();
                java.lang.String str2 = (java.lang.String) com.google.android.gms.measurement.internal.zzqa.zzH(zzhmVar, "_en");
                if (android.text.TextUtils.isEmpty(str2)) {
                    zzaeVar.zzu.zzaW().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.zzb == null || this.zzc == null) {
                    zzawVarZzj = zzpvVar.zzj();
                    zzawVarZzj.zzg();
                    zzawVarZzj.zzav();
                    try {
                        try {
                            cursorRawQuery = zzawVarZzj.zzj().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new java.lang.String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = android.util.Pair.create((com.google.android.gms.internal.measurement.zzhm) ((com.google.android.gms.internal.measurement.zzhl) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), cursorRawQuery.getBlob(0))).zzba(), java.lang.Long.valueOf(cursorRawQuery.getLong(1)));
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                    } catch (java.io.IOException e) {
                                        zzawVarZzj.zzu.zzaW().zze().zzd("Failed to merge main event. appId, eventId", com.google.android.gms.measurement.internal.zzhe.zzn(str), l, e);
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        pairCreate = null;
                                    }
                                } else {
                                    zzawVarZzj.zzu.zzaW().zzj().zza("Main event not found");
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    pairCreate = null;
                                }
                            } catch (android.database.sqlite.SQLiteException e2) {
                                e = e2;
                                zzawVarZzj.zzu.zzaW().zze().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzu.zzaW().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                                return null;
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            r7 = LongValue;
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteException e3) {
                        e = e3;
                        cursorRawQuery = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        r7 = 0;
                        if (r7 != 0) {
                            r7.close();
                        }
                        throw th;
                    }
                    if (pairCreate != null || pairCreate.first == null) {
                        this.zza.zzu.zzaW().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                    this.zzb = (com.google.android.gms.internal.measurement.zzhm) pairCreate.first;
                    this.zzd = ((java.lang.Long) pairCreate.second).longValue();
                    this.zza.zzg.zzA();
                    this.zzc = (java.lang.Long) com.google.android.gms.measurement.internal.zzqa.zzH(this.zzb, "_eid");
                } else {
                    LongValue = l.longValue();
                    if (LongValue != this.zzc.longValue()) {
                        zzawVarZzj = zzpvVar.zzj();
                        zzawVarZzj.zzg();
                        zzawVarZzj.zzav();
                        cursorRawQuery = zzawVarZzj.zzj().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new java.lang.String[]{str, l.toString()});
                        if (cursorRawQuery.moveToFirst()) {
                            zzawVarZzj.zzu.zzaW().zzj().zza("Main event not found");
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            pairCreate = null;
                        } else {
                            pairCreate = android.util.Pair.create((com.google.android.gms.internal.measurement.zzhm) ((com.google.android.gms.internal.measurement.zzhl) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), cursorRawQuery.getBlob(0))).zzba(), java.lang.Long.valueOf(cursorRawQuery.getLong(1)));
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        }
                        if (pairCreate != null) {
                        }
                        this.zza.zzu.zzaW().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                }
                long j = this.zzd - 1;
                this.zzd = j;
                if (j <= 0) {
                    com.google.android.gms.measurement.internal.zzaw zzawVarZzj2 = this.zza.zzg.zzj();
                    zzawVarZzj2.zzg();
                    zzawVarZzj2.zzu.zzaW().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzawVarZzj2.zzj().execSQL("delete from main_event_params where app_id=?", new java.lang.String[]{str});
                    } catch (android.database.sqlite.SQLiteException e4) {
                        zzawVarZzj2.zzu.zzaW().zze().zzb("Error clearing complex main event", e4);
                    }
                } else {
                    this.zza.zzg.zzj().zzaf(str, l, this.zzd, this.zzb);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.google.android.gms.internal.measurement.zzhq zzhqVar : this.zzb.zzi()) {
                    this.zza.zzg.zzA();
                    if (com.google.android.gms.measurement.internal.zzqa.zzG(zzhmVar, zzhqVar.zzg()) == null) {
                        arrayList.add(zzhqVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzu.zzaW().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
                strZzh = str2;
            } else {
                this.zzc = l;
                this.zzb = zzhmVar;
                zzpvVar.zzA();
                long jLongValue = ((java.lang.Long) com.google.android.gms.measurement.internal.zzqa.zzI(zzhmVar, "_epc", 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    zzaeVar.zzu.zzaW().zzh().zzb("Complex event with zero extra param count. eventName", strZzh);
                } else {
                    zzpvVar.zzj().zzaf(str, (java.lang.Long) com.google.android.gms.common.internal.Preconditions.checkNotNull(l), this.zzd, zzhmVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) zzhmVar.zzch();
        zzhlVar.zzi(strZzh);
        zzhlVar.zzg();
        zzhlVar.zzd(listZzi);
        return (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba();
    }
}
