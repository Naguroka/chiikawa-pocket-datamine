package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgv extends com.google.android.gms.measurement.internal.zzg {
    private static final java.lang.String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final com.google.android.gms.measurement.internal.zzgt zzb;
    private boolean zzc;

    zzgv(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        android.content.Context contextZzaT = this.zzu.zzaT();
        this.zzu.zzf();
        this.zzb = new com.google.android.gms.measurement.internal.zzgt(this, contextZzaT, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[Catch: SQLiteException -> 0x0085, SQLiteDatabaseLockedException -> 0x0089, SQLiteFullException -> 0x008c, all -> 0x0173, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x0173, blocks: (B:23:0x007a, B:25:0x0080, B:34:0x0099, B:35:0x00a1, B:37:0x00bd, B:66:0x0117, B:68:0x011d, B:69:0x0120, B:76:0x013e, B:84:0x0152, B:45:0x00e3), top: B:100:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[Catch: SQLiteException -> 0x00d8, SQLiteDatabaseLockedException -> 0x00db, SQLiteFullException -> 0x00de, all -> 0x0173, TRY_LEAVE, TryCatch #11 {all -> 0x0173, blocks: (B:23:0x007a, B:25:0x0080, B:34:0x0099, B:35:0x00a1, B:37:0x00bd, B:66:0x0117, B:68:0x011d, B:69:0x0120, B:76:0x013e, B:84:0x0152, B:45:0x00e3), top: B:100:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d A[Catch: all -> 0x0173, TryCatch #11 {all -> 0x0173, blocks: (B:23:0x007a, B:25:0x0080, B:34:0x0099, B:35:0x00a1, B:37:0x00bd, B:66:0x0117, B:68:0x011d, B:69:0x0120, B:76:0x013e, B:84:0x0152, B:45:0x00e3), top: B:100:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a A[PHI: r2 r8 r10
  0x014a: PHI (r2v13 java.lang.String[]) = (r2v9 java.lang.String[]), (r2v10 java.lang.String[]), (r2v14 java.lang.String[]) binds: [B:72:0x0137, B:87:0x0169, B:80:0x0148] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:72:0x0137, B:87:0x0169, B:80:0x0148] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v7 android.database.sqlite.SQLiteDatabase)
  (r10v9 android.database.sqlite.SQLiteDatabase)
 binds: [B:72:0x0137, B:87:0x0169, B:80:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0166  */
    /* JADX WARN: Code duplicated, block: B:93:0x0177  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v4 */
    private final boolean zzs(int i, byte[] bArr) throws java.lang.Throwable {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        java.lang.String[] strArr;
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzh;
        ?? RawQuery;
        ?? r5;
        long j;
        long jDelete;
        zzg();
        boolean z = false;
        z = false;
        if (!this.zzc) {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            java.lang.String[] strArr2 = null;
            com.google.android.gms.measurement.internal.zzr zzrVarZzk = zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbl) ? this.zzu.zzh().zzk(null) : null;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("type", java.lang.Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbl) && zzrVarZzk != null) {
                contentValues.put("app_version", zzrVarZzk.zzc);
                contentValues.put("app_version_int", java.lang.Long.valueOf(zzrVarZzk.zzj));
            }
            zzioVar.zzf();
            int i2 = 0;
            int i3 = 5;
            for (int i4 = 5; i2 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseZzh = zzh();
                    if (sQLiteDatabaseZzh == null) {
                        this.zzc = true;
                    } else {
                        try {
                            sQLiteDatabaseZzh.beginTransaction();
                            RawQuery = sQLiteDatabaseZzh.rawQuery("select count(1) from messages", strArr2);
                            long j2 = 0;
                            if (RawQuery == 0) {
                                if (j2 >= androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                    strArr = null;
                                    sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                                    sQLiteDatabaseZzh.setTransactionSuccessful();
                                    sQLiteDatabaseZzh.endTransaction();
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    sQLiteDatabaseZzh.close();
                                    return true;
                                }
                                zzioVar.zzaW().zze().zza("Data loss, local db full");
                                java.lang.String[] strArr3 = new java.lang.String[1];
                                j = (androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US - j2) + 1;
                                strArr3[z ? 1 : 0] = java.lang.Long.toString(j);
                                jDelete = sQLiteDatabaseZzh.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr3);
                                if (jDelete != j) {
                                    zzioVar.zzaW().zze().zzd("Different delete count than expected in local db. expected, received, difference", java.lang.Long.valueOf(j), java.lang.Long.valueOf(jDelete), java.lang.Long.valueOf(j - jDelete));
                                }
                                strArr = null;
                                sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                                sQLiteDatabaseZzh.setTransactionSuccessful();
                                sQLiteDatabaseZzh.endTransaction();
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                sQLiteDatabaseZzh.close();
                                return true;
                            }
                            try {
                                if (RawQuery.moveToFirst()) {
                                    j2 = RawQuery.getLong(z ? 1 : 0);
                                }
                                if (j2 >= androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                    strArr = null;
                                    sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                                    sQLiteDatabaseZzh.setTransactionSuccessful();
                                    sQLiteDatabaseZzh.endTransaction();
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    sQLiteDatabaseZzh.close();
                                    return true;
                                }
                                try {
                                    zzioVar.zzaW().zze().zza("Data loss, local db full");
                                    java.lang.String[] strArr4 = new java.lang.String[1];
                                    j = (androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US - j2) + 1;
                                    strArr4[z ? 1 : 0] = java.lang.Long.toString(j);
                                    jDelete = sQLiteDatabaseZzh.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr4);
                                    if (jDelete != j) {
                                        zzioVar.zzaW().zze().zzd("Different delete count than expected in local db. expected, received, difference", java.lang.Long.valueOf(j), java.lang.Long.valueOf(jDelete), java.lang.Long.valueOf(j - jDelete));
                                    }
                                    strArr = null;
                                    try {
                                        sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                                        sQLiteDatabaseZzh.setTransactionSuccessful();
                                        sQLiteDatabaseZzh.endTransaction();
                                        if (RawQuery != 0) {
                                            RawQuery.close();
                                        }
                                        sQLiteDatabaseZzh.close();
                                        return true;
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                                        android.os.SystemClock.sleep(i3);
                                        i3 += 20;
                                        if (RawQuery != 0) {
                                            RawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                        i2++;
                                        strArr2 = strArr;
                                        z = false;
                                    } catch (android.database.sqlite.SQLiteFullException e) {
                                        e = e;
                                        this.zzu.zzaW().zze().zzb("Error writing entry; local database full", e);
                                        this.zzc = true;
                                        if (RawQuery != 0) {
                                            RawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                        i2++;
                                        strArr2 = strArr;
                                        z = false;
                                    } catch (android.database.sqlite.SQLiteException e2) {
                                        e = e2;
                                        if (sQLiteDatabaseZzh != null) {
                                            try {
                                                if (sQLiteDatabaseZzh.inTransaction()) {
                                                    sQLiteDatabaseZzh.endTransaction();
                                                }
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                r5 = RawQuery;
                                                sQLiteDatabase = sQLiteDatabaseZzh;
                                                if (r5 != 0) {
                                                    r5.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        this.zzu.zzaW().zze().zzb("Error writing entry to local database", e);
                                        this.zzc = true;
                                        if (RawQuery != 0) {
                                            RawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                        i2++;
                                        strArr2 = strArr;
                                        z = false;
                                    }
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused2) {
                                    strArr = null;
                                    android.os.SystemClock.sleep(i3);
                                    i3 += 20;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    i2++;
                                    strArr2 = strArr;
                                    z = false;
                                } catch (android.database.sqlite.SQLiteFullException e3) {
                                    e = e3;
                                    strArr = null;
                                    this.zzu.zzaW().zze().zzb("Error writing entry; local database full", e);
                                    this.zzc = true;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    i2++;
                                    strArr2 = strArr;
                                    z = false;
                                } catch (android.database.sqlite.SQLiteException e4) {
                                    e = e4;
                                    strArr = null;
                                    if (sQLiteDatabaseZzh != null) {
                                        if (sQLiteDatabaseZzh.inTransaction()) {
                                            sQLiteDatabaseZzh.endTransaction();
                                        }
                                    }
                                    this.zzu.zzaW().zze().zzb("Error writing entry to local database", e);
                                    this.zzc = true;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    i2++;
                                    strArr2 = strArr;
                                    z = false;
                                }
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException unused3) {
                                strArr = strArr2;
                                android.os.SystemClock.sleep(i3);
                                i3 += 20;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                i2++;
                                strArr2 = strArr;
                                z = false;
                            } catch (android.database.sqlite.SQLiteFullException e5) {
                                e = e5;
                                strArr = strArr2;
                                this.zzu.zzaW().zze().zzb("Error writing entry; local database full", e);
                                this.zzc = true;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                i2++;
                                strArr2 = strArr;
                                z = false;
                            } catch (android.database.sqlite.SQLiteException e6) {
                                e = e6;
                                strArr = strArr2;
                                if (sQLiteDatabaseZzh != null) {
                                    if (sQLiteDatabaseZzh.inTransaction()) {
                                        sQLiteDatabaseZzh.endTransaction();
                                    }
                                }
                                this.zzu.zzaW().zze().zzb("Error writing entry to local database", e);
                                this.zzc = true;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                i2++;
                                strArr2 = strArr;
                                z = false;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException unused4) {
                            strArr = strArr2;
                            RawQuery = strArr;
                        } catch (android.database.sqlite.SQLiteFullException e7) {
                            e = e7;
                            strArr = strArr2;
                            RawQuery = strArr;
                        } catch (android.database.sqlite.SQLiteException e8) {
                            e = e8;
                            strArr = strArr2;
                            RawQuery = strArr;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            r5 = strArr2;
                            sQLiteDatabase = sQLiteDatabaseZzh;
                            if (r5 != 0) {
                                r5.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                        i2++;
                        strArr2 = strArr;
                        z = false;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException unused5) {
                    strArr = strArr2;
                    sQLiteDatabaseZzh = strArr;
                    RawQuery = sQLiteDatabaseZzh;
                } catch (android.database.sqlite.SQLiteFullException e9) {
                    e = e9;
                    strArr = strArr2;
                    sQLiteDatabaseZzh = strArr;
                    RawQuery = sQLiteDatabaseZzh;
                } catch (android.database.sqlite.SQLiteException e10) {
                    e = e10;
                    strArr = strArr2;
                    sQLiteDatabaseZzh = strArr;
                    RawQuery = sQLiteDatabaseZzh;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    java.lang.String[] strArr5 = strArr2;
                    sQLiteDatabase = strArr5;
                    r5 = strArr5;
                }
            }
            this.zzu.zzaW().zzj().zza("Failed to write entry to local database");
            return false;
        }
        return z;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return false;
    }

    final android.database.sqlite.SQLiteDatabase zzh() throws android.database.sqlite.SQLiteException {
        if (this.zzc) {
            return null;
        }
        android.database.sqlite.SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.util.List zzi(int r28) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgv.zzi(int):java.util.List");
    }

    public final void zzj() {
        int iDelete;
        zzg();
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh == null || (iDelete = sQLiteDatabaseZzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaW().zzj().zzb("Reset local analytics data. records", java.lang.Integer.valueOf(iDelete));
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzk() {
        return zzs(3, new byte[0]);
    }

    final boolean zzl() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        android.content.Context contextZzaT = zzioVar.zzaT();
        zzioVar.zzf();
        return contextZzaT.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b A[PHI: r4
  0x006b: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:34:0x007e, B:28:0x0062, B:31:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean zzm() {
        zzg();
        if (!this.zzc && zzl()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzh = zzh();
                            if (sQLiteDatabaseZzh != null) {
                                sQLiteDatabaseZzh.beginTransaction();
                                sQLiteDatabaseZzh.delete("messages", "type == ?", new java.lang.String[]{java.lang.Integer.toString(3)});
                                sQLiteDatabaseZzh.setTransactionSuccessful();
                                sQLiteDatabaseZzh.endTransaction();
                                sQLiteDatabaseZzh.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
                            android.os.SystemClock.sleep(i);
                            i += 20;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (android.database.sqlite.SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (java.lang.Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        this.zzu.zzaW().zze().zzb("Error deleting app launch break from local database", e);
                        this.zzc = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (android.database.sqlite.SQLiteFullException e2) {
                    this.zzu.zzaW().zze().zzb("Error deleting app launch break from local database", e2);
                    this.zzc = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzu.zzaW().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(com.google.android.gms.measurement.internal.zzai zzaiVar) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        byte[] bArrZzay = zzioVar.zzw().zzay(zzaiVar);
        if (bArrZzay.length <= 131072) {
            return zzs(2, bArrZzay);
        }
        zzioVar.zzaW().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(com.google.android.gms.measurement.internal.zzbf zzbfVar) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        byte[] bArrZzay = zzioVar.zzw().zzay(zzbfVar);
        if (bArrZzay == null) {
            zzioVar.zzaW().zzh().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzay.length <= 131072) {
            return zzs(4, bArrZzay);
        }
        zzioVar.zzaW().zzh().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzp(com.google.android.gms.measurement.internal.zzbh zzbhVar) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        com.google.android.gms.measurement.internal.zzbi.zza(zzbhVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(0, bArrMarshall);
        }
        this.zzu.zzaW().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzq(com.google.android.gms.measurement.internal.zzqb zzqbVar) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        com.google.android.gms.measurement.internal.zzqc.zza(zzqbVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(1, bArrMarshall);
        }
        this.zzu.zzaW().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
