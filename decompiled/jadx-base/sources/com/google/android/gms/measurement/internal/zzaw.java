package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaw extends com.google.android.gms.measurement.internal.zzpg {
    private final com.google.android.gms.measurement.internal.zzav zzm;
    private final com.google.android.gms.measurement.internal.zzou zzn;
    private static final java.lang.String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final java.lang.String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    private static final java.lang.String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final java.lang.String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};
    private static final java.lang.String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final java.lang.String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final java.lang.String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final java.lang.String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final java.lang.String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final java.lang.String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final java.lang.String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    zzaw(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        super(zzpvVar);
        this.zzn = new com.google.android.gms.measurement.internal.zzou(this.zzu.zzaU());
        this.zzu.zzf();
        this.zzm = new com.google.android.gms.measurement.internal.zzav(this, this.zzu.zzaT(), "google_app_measurement.db");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    private final com.google.android.gms.measurement.internal.zzbd zzaA(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor;
        java.lang.Boolean boolValueOf;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        zzg();
        zzav();
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzj().query(str, (java.lang.String[]) new java.util.ArrayList(java.util.Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new java.lang.String[0]), "app_id=? and name=?", new java.lang.String[]{str2, str3}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    long j2 = cursorQuery.getLong(1);
                    long j3 = cursorQuery.getLong(2);
                    long j4 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    java.lang.Long lValueOf = cursorQuery.isNull(4) ? null : java.lang.Long.valueOf(cursorQuery.getLong(4));
                    java.lang.Long lValueOf2 = cursorQuery.isNull(5) ? null : java.lang.Long.valueOf(cursorQuery.getLong(5));
                    java.lang.Long lValueOf3 = cursorQuery.isNull(6) ? null : java.lang.Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = java.lang.Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    cursor = cursorQuery;
                    try {
                        com.google.android.gms.measurement.internal.zzbd zzbdVar = new com.google.android.gms.measurement.internal.zzbd(str2, str3, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursor.moveToNext()) {
                            this.zzu.zzaW().zze().zzb("Got multiple records for event aggregates, expected one. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str2));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zzbdVar;
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    cursor = cursorQuery;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                }
                cursorQuery = cursor;
            } catch (android.database.sqlite.SQLiteException e3) {
                e = e3;
                cursorQuery = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            zzioVar.zzaW().zze().zzd("Error querying events. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str2), zzioVar.zzj().zzd(str3), e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            cursor2 = cursorQuery;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private final com.google.android.gms.measurement.internal.zzpz zzaB(java.lang.String str, long j, byte[] bArr, java.lang.String str2, java.lang.String str3, int i, int i2, long j2, long j3, long j4) {
        if (android.text.TextUtils.isEmpty(str2)) {
            this.zzu.zzaW().zzd().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzht zzhtVar = (com.google.android.gms.internal.measurement.zzht) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhv.zzb(), bArr);
            com.google.android.gms.measurement.internal.zzmf zzmfVarZzb = com.google.android.gms.measurement.internal.zzmf.zzb(i);
            if (zzmfVarZzb != com.google.android.gms.measurement.internal.zzmf.GOOGLE_SIGNAL && zzmfVarZzb != com.google.android.gms.measurement.internal.zzmf.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = zzhtVar.zzj().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) ((com.google.android.gms.internal.measurement.zzhx) it.next()).zzch();
                    zzhwVar.zzat(i2);
                    arrayList.add((com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba());
                }
                zzhtVar.zzd();
                zzhtVar.zzb(arrayList);
            }
            java.util.HashMap map = new java.util.HashMap();
            if (str3 != null) {
                for (java.lang.String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    java.lang.String[] strArrSplit = str4.split(com.ironsource.y8.i.b, 2);
                    if (strArrSplit.length != 2) {
                        this.zzu.zzaW().zze().zzb("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            com.google.android.gms.measurement.internal.zzpx zzpxVar = new com.google.android.gms.measurement.internal.zzpx();
            zzpxVar.zzf(j);
            zzpxVar.zzd((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba());
            zzpxVar.zzi(str2);
            zzpxVar.zzg(map);
            zzpxVar.zzh(zzmfVarZzb);
            zzpxVar.zzb(j2);
            zzpxVar.zza(j3);
            zzpxVar.zzc(j4);
            zzpxVar.zze(i2);
            return zzpxVar.zzj();
        } catch (java.io.IOException e) {
            this.zzu.zzaW().zze().zzc("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    private final java.lang.String zzaC() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        long jCurrentTimeMillis = zzioVar.zzaU().currentTimeMillis();
        java.util.Locale locale = java.util.Locale.US;
        com.google.android.gms.measurement.internal.zzmf zzmfVar = com.google.android.gms.measurement.internal.zzmf.GOOGLE_SIGNAL;
        java.lang.Long lValueOf = java.lang.Long.valueOf(jCurrentTimeMillis);
        zzioVar.zzf();
        java.lang.String str = java.lang.String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", java.lang.Integer.valueOf(zzmfVar.zza()), lValueOf, java.lang.Long.valueOf(((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzR.zza(null)).longValue()));
        java.util.Locale locale2 = java.util.Locale.US;
        zzioVar.zzf();
        return "(" + str + " OR " + java.lang.String.format(locale2, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", java.lang.Integer.valueOf(zzmfVar.zza()), lValueOf, java.lang.Long.valueOf(com.google.android.gms.measurement.internal.zzam.zzI())) + ")";
    }

    private final java.lang.String zzaD(java.lang.String str, java.lang.String[] strArr, java.lang.String str2) {
        android.database.Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzj().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    java.lang.String string = cursorRawQuery.getString(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return string;
                }
                if (cursorRawQuery == null) {
                    return "";
                }
                cursorRawQuery.close();
                return "";
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzc("Database error", str, e);
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    private final void zzaE(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        try {
            zzj().delete(str, "app_id=?", new java.lang.String[]{str2});
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzc("Error deleting snapshot. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str2), e);
        }
    }

    private final void zzaF(java.lang.String str, com.google.android.gms.measurement.internal.zzbd zzbdVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbdVar);
        zzg();
        zzav();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        java.lang.String str2 = zzbdVar.zza;
        contentValues.put("app_id", str2);
        contentValues.put("name", zzbdVar.zzb);
        contentValues.put("lifetime_count", java.lang.Long.valueOf(zzbdVar.zzc));
        contentValues.put("current_bundle_count", java.lang.Long.valueOf(zzbdVar.zzd));
        contentValues.put("last_fire_timestamp", java.lang.Long.valueOf(zzbdVar.zzf));
        contentValues.put("last_bundled_timestamp", java.lang.Long.valueOf(zzbdVar.zzg));
        contentValues.put("last_bundled_day", zzbdVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbdVar.zzi);
        contentValues.put("last_sampling_rate", zzbdVar.zzj);
        contentValues.put("current_session_count", java.lang.Long.valueOf(zzbdVar.zze));
        java.lang.Boolean bool = zzbdVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzj().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.zzu.zzaW().zze().zzb("Failed to insert/update event aggregates (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str2));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzc("Error storing event aggregates. appId", com.google.android.gms.measurement.internal.zzhe.zzn(zzbdVar.zza), e);
        }
    }

    private final void zzaG(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
            java.lang.String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                this.zzu.zzaW().zzf().zzb("Value of the primary key is not set.", com.google.android.gms.measurement.internal.zzhe.zzn("app_id"));
            } else if (sQLiteDatabaseZzj.update("consent_settings", contentValues, "app_id = ?", new java.lang.String[]{asString}) == 0 && sQLiteDatabaseZzj.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.zzu.zzaW().zze().zzc("Failed to insert/update table (got -1). key", com.google.android.gms.measurement.internal.zzhe.zzn("consent_settings"), com.google.android.gms.measurement.internal.zzhe.zzn("app_id"));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzd("Error storing into table. key", com.google.android.gms.measurement.internal.zzhe.zzn("consent_settings"), com.google.android.gms.measurement.internal.zzhe.zzn("app_id"), e);
        }
    }

    private static final java.lang.String zzaH(java.util.List list) {
        return list.isEmpty() ? "" : java.lang.String.format(" AND (upload_type IN (%s))", android.text.TextUtils.join(", ", list));
    }

    static final void zzau(android.content.ContentValues contentValues, java.lang.String str, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("value");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        if (obj instanceof java.lang.String) {
            contentValues.put("value", (java.lang.String) obj);
        } else if (obj instanceof java.lang.Long) {
            contentValues.put("value", (java.lang.Long) obj);
        } else {
            if (!(obj instanceof java.lang.Double)) {
                throw new java.lang.IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (java.lang.Double) obj);
        }
    }

    private final long zzay(java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorRawQuery = zzj().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new android.database.sqlite.SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzc("Database error", str, e);
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzaz(java.lang.String str, java.lang.String[] strArr, long j) {
        android.database.Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzj().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzc("Database error", str, e);
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final java.lang.String zzA() throws java.lang.Throwable {
        android.database.sqlite.SQLiteException e;
        android.database.Cursor cursorRawQuery;
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseZzj.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        java.lang.String string = cursorRawQuery.getString(0);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return string;
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaW().zze().zzb("Database error getting next bundle app id", e);
                }
            } catch (java.lang.Throwable th) {
                r1 = sQLiteDatabaseZzj;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final java.util.List zzB(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("app_id=?");
        if (!android.text.TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            arrayList.add(java.lang.String.valueOf(str3).concat(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES));
            sb.append(" and name glob ?");
        }
        return zzC(sb.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    public final java.util.List zzC(java.lang.String str, java.lang.String[] strArr) {
        zzg();
        zzav();
        java.util.List arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
                java.lang.String[] strArr2 = {"app_id", "origin", "name", "value", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                zzioVar.zzf();
                cursorQuery = sQLiteDatabaseZzj.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        int size = arrayList.size();
                        zzioVar.zzf();
                        if (size >= 1000) {
                            com.google.android.gms.measurement.internal.zzhc zzhcVarZze = zzioVar.zzaW().zze();
                            zzioVar.zzf();
                            zzhcVarZze.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        java.lang.String string = cursorQuery.getString(0);
                        java.lang.String string2 = cursorQuery.getString(1);
                        java.lang.String string3 = cursorQuery.getString(2);
                        java.lang.Object objZzz = zzz(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        java.lang.String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
                        com.google.android.gms.measurement.internal.zzbh zzbhVar = (com.google.android.gms.measurement.internal.zzbh) zzpvVar.zzA().zzi(cursorQuery.getBlob(7), com.google.android.gms.measurement.internal.zzbh.CREATOR);
                        arrayList.add(new com.google.android.gms.measurement.internal.zzai(string, string2, new com.google.android.gms.measurement.internal.zzqb(string3, cursorQuery.getLong(10), objZzz, string2), cursorQuery.getLong(8), z, string4, zzbhVar, j, (com.google.android.gms.measurement.internal.zzbh) zzpvVar.zzA().zzi(cursorQuery.getBlob(9), com.google.android.gms.measurement.internal.zzbh.CREATOR), cursorQuery.getLong(11), (com.google.android.gms.measurement.internal.zzbh) zzpvVar.zzA().zzi(cursorQuery.getBlob(12), com.google.android.gms.measurement.internal.zzbh.CREATOR)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzb("Error querying conditional user property value", e);
                arrayList = java.util.Collections.emptyList();
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    public final java.util.List zzD(java.lang.String str, com.google.android.gms.measurement.internal.zzpc zzpcVar, int i) {
        java.util.List listEmptyList;
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor;
        android.database.Cursor cursor2 = null;
        if (!this.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
            return java.util.Collections.emptyList();
        }
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        try {
            int i2 = 0;
            cursorQuery = zzj().query("upload_queue", new java.lang.String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "app_id=?" + zzaH(zzpcVar.zza) + " AND NOT " + zzaC(), new java.lang.String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? java.lang.String.valueOf(i) : null);
            try {
                listEmptyList = new java.util.ArrayList();
                while (cursorQuery.moveToNext()) {
                    long j = cursorQuery.getLong(i2);
                    cursor = cursorQuery;
                    java.util.List list = listEmptyList;
                    try {
                        com.google.android.gms.measurement.internal.zzpz zzpzVarZzaB = zzaB(str, j, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                        if (zzpzVarZzaB != null) {
                            list.add(zzpzVarZzaB);
                        }
                        listEmptyList = list;
                        cursorQuery = cursor;
                        i2 = 0;
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        cursor2 = cursor;
                        try {
                            this.zzu.zzaW().zze().zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                            listEmptyList = java.util.Collections.emptyList();
                            cursorQuery = cursor2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listEmptyList;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
            } catch (android.database.sqlite.SQLiteException e2) {
                e = e2;
                cursor = cursorQuery;
            } catch (java.lang.Throwable th3) {
                th = th3;
                cursor = cursorQuery;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return listEmptyList;
    }

    public final java.util.List zzE(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        java.util.List arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                zzioVar.zzf();
                cursorQuery = zzj().query("user_attributes", new java.lang.String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        java.lang.String string = cursorQuery.getString(0);
                        java.lang.String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        java.lang.String str2 = string2;
                        long j = cursorQuery.getLong(2);
                        java.lang.Object objZzz = zzz(cursorQuery, 3);
                        if (objZzz == null) {
                            zzioVar.zzaW().zze().zzb("Read invalid user property value, ignoring it. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                        } else {
                            arrayList.add(new com.google.android.gms.measurement.internal.zzqd(str, str2, string, j, objZzz));
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzc("Error querying user properties. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
                arrayList = java.util.Collections.emptyList();
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x011a A[DONT_GENERATE] */
    public final java.util.List zzF(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String string;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        java.util.List arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
                try {
                    arrayList2.add(str);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("app_id=?");
                    if (android.text.TextUtils.isEmpty(str2)) {
                        string = str2;
                    } else {
                        string = str2;
                        try {
                            arrayList2.add(string);
                            sb.append(" and origin=?");
                        } catch (android.database.sqlite.SQLiteException e) {
                            e = e;
                            this.zzu.zzaW().zze().zzd("(2)Error querying user properties", com.google.android.gms.measurement.internal.zzhe.zzn(str), string, e);
                            arrayList = java.util.Collections.emptyList();
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
                        sb.append(" and name glob ?");
                    }
                    java.lang.String[] strArr = (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]);
                    java.lang.String string2 = sb.toString();
                    com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                    zzioVar.zzf();
                    cursorQuery = zzj().query("user_attributes", new java.lang.String[]{"name", "set_timestamp", "value", "origin"}, string2, strArr, null, null, "rowid", "1001");
                    if (cursorQuery.moveToFirst()) {
                        do {
                            int size = arrayList.size();
                            zzioVar.zzf();
                            if (size >= 1000) {
                                com.google.android.gms.measurement.internal.zzhc zzhcVarZze = zzioVar.zzaW().zze();
                                zzioVar.zzf();
                                zzhcVarZze.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                                break;
                            }
                            java.lang.String string3 = cursorQuery.getString(0);
                            long j = cursorQuery.getLong(1);
                            java.lang.Object objZzz = zzz(cursorQuery, 2);
                            string = cursorQuery.getString(3);
                            if (objZzz == null) {
                                zzioVar.zzaW().zze().zzd("(2)Read invalid user property value, ignoring it", com.google.android.gms.measurement.internal.zzhe.zzn(str), string, str3);
                            } else {
                                arrayList.add(new com.google.android.gms.measurement.internal.zzqd(str, string, string3, j, objZzz));
                            }
                        } while (cursorQuery.moveToNext());
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    string = str2;
                    this.zzu.zzaW().zze().zzd("(2)Error querying user properties", com.google.android.gms.measurement.internal.zzhe.zzn(str), string, e);
                    arrayList = java.util.Collections.emptyList();
                    return arrayList;
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc A[PHI: r2 r3
  0x00cc: PHI (r2v16 android.database.Cursor) = (r2v15 android.database.Cursor), (r2v23 android.database.Cursor) binds: [B:44:0x0104, B:29:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r3v6 java.lang.Object) = (r3v19 java.lang.Object), (r3v20 java.lang.Object) binds: [B:44:0x0104, B:29:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzG(java.lang.String str, java.lang.Long l, java.lang.String str2, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzio zzioVar;
        com.google.android.gms.measurement.internal.zzbc zzbcVar;
        long j;
        java.lang.String str3;
        android.content.ContentValues contentValues;
        android.database.Cursor cursorQuery;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.google.android.gms.internal.measurement.zzhx zzhxVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        zzg();
        zzav();
        com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
        android.database.Cursor cursor = null;
        com.google.android.gms.measurement.internal.zzau zzauVar = (!zzioVar2.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbe) || l == null) ? new com.google.android.gms.measurement.internal.zzau(this, str) : new com.google.android.gms.measurement.internal.zzau(this, str, l.longValue());
        java.util.List<com.google.android.gms.measurement.internal.zzat> listZza = zzauVar.zza();
        while (!listZza.isEmpty()) {
            for (com.google.android.gms.measurement.internal.zzat zzatVar : listZza) {
                try {
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        try {
                            cursorQuery = zzj().query("raw_events_metadata", new java.lang.String[]{androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new java.lang.String[]{str, java.lang.Long.toString(zzatVar.zzb)}, null, null, "rowid", "2");
                            try {
                                try {
                                    if (cursorQuery.moveToFirst()) {
                                        try {
                                            obj = (com.google.android.gms.internal.measurement.zzhx) ((com.google.android.gms.internal.measurement.zzhw) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhx.zzz(), cursorQuery.getBlob(0))).zzba();
                                            try {
                                                if (cursorQuery.moveToNext()) {
                                                    this.zzu.zzaW().zzk().zzb("Get multiple raw event metadata records, expected one. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                                                }
                                                cursorQuery.close();
                                                zzhxVar = obj;
                                                obj2 = obj;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                    zzhxVar = obj2;
                                                }
                                            } catch (android.database.sqlite.SQLiteException e) {
                                                e = e;
                                                this.zzu.zzaW().zze().zzc("Data loss. Error selecting raw event. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
                                                zzhxVar = obj;
                                                obj2 = obj;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                    zzhxVar = obj2;
                                                }
                                            }
                                        } catch (java.io.IOException e2) {
                                            this.zzu.zzaW().zze().zzc("Data loss. Failed to merge raw event metadata. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e2);
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            zzhxVar = cursor;
                                        }
                                    } else {
                                        zzioVar2.zzaW().zze().zzb("Raw event metadata record is missing. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        zzhxVar = cursor;
                                    }
                                } catch (android.database.sqlite.SQLiteException e3) {
                                    e = e3;
                                    obj = cursor;
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteException e4) {
                            e = e4;
                            cursorQuery = cursor;
                            obj = cursorQuery;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                        }
                        if (zzhxVar != 0) {
                            java.util.Iterator it = zzhxVar.zzY().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((com.google.android.gms.internal.measurement.zzio) it.next()).zzg().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = zzj().update("raw_events", contentValues, "rowid = ?", new java.lang.String[]{java.lang.String.valueOf(j)});
                    if (jUpdate != 1) {
                        zzioVar.zzaW().zze().zzc("Failed to update raw event. appId, updatedRows", com.google.android.gms.measurement.internal.zzhe.zzn(str3), java.lang.Long.valueOf(jUpdate));
                    }
                } catch (android.database.sqlite.SQLiteException e5) {
                    this.zzu.zzaW().zze().zzc("Error updating raw event. appId", com.google.android.gms.measurement.internal.zzhe.zzn(zzbcVar.zza), e5);
                }
                com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
                com.google.android.gms.measurement.internal.zzqa zzqaVarZzA = zzpvVar.zzA();
                com.google.android.gms.internal.measurement.zzhm zzhmVar = zzatVar.zzd;
                android.os.Bundle bundle2 = new android.os.Bundle();
                for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zzhmVar.zzi()) {
                    if (zzhqVar.zzu()) {
                        bundle2.putDouble(zzhqVar.zzg(), zzhqVar.zza());
                    } else if (zzhqVar.zzv()) {
                        bundle2.putFloat(zzhqVar.zzg(), zzhqVar.zzb());
                    } else if (zzhqVar.zzw()) {
                        bundle2.putLong(zzhqVar.zzg(), zzhqVar.zzd());
                    } else if (zzhqVar.zzy()) {
                        bundle2.putString(zzhqVar.zzg(), zzhqVar.zzh());
                    } else if (zzhqVar.zzi().isEmpty()) {
                        zzqaVarZzA.zzu.zzaW().zze().zzb("Unexpected parameter type for parameter", zzhqVar);
                    } else {
                        bundle2.putParcelableArray(zzhqVar.zzg(), com.google.android.gms.measurement.internal.zzqa.zzC(zzhqVar.zzi()));
                    }
                }
                java.lang.String string = bundle2.getString("_o");
                bundle2.remove("_o");
                java.lang.String strZzh = zzhmVar.zzh();
                if (string == null) {
                    string = "";
                }
                com.google.android.gms.measurement.internal.zzhf zzhfVar = new com.google.android.gms.measurement.internal.zzhf(strZzh, string, bundle2, zzhmVar.zzd());
                zzioVar = this.zzu;
                android.os.Bundle bundle3 = zzhfVar.zzd;
                zzioVar.zzw().zzO(bundle3, bundle);
                zzbcVar = new com.google.android.gms.measurement.internal.zzbc(this.zzu, zzhfVar.zzb, str, zzhmVar.zzh(), zzhmVar.zzd(), zzhmVar.zzc(), bundle3);
                j = zzatVar.zza;
                long j2 = zzatVar.zzb;
                boolean z = zzatVar.zzc;
                zzg();
                zzav();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbcVar);
                str3 = zzbcVar.zza;
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
                byte[] bArrZzcd = zzpvVar.zzA().zzm(zzbcVar).zzcd();
                contentValues = new android.content.ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", zzbcVar.zzb);
                contentValues.put(com.ironsource.aa.a.d, java.lang.Long.valueOf(zzbcVar.zzd));
                contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(j2));
                contentValues.put("data", bArrZzcd);
                contentValues.put("realtime", java.lang.Integer.valueOf(z ? 1 : 0));
                cursor = null;
            }
            listZza = zzauVar.zza();
            cursor = null;
        }
    }

    public final void zzH() {
        zzav();
        zzj().beginTransaction();
    }

    public final void zzI(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzbd zzbdVarZzaA;
        zzaE("events_snapshot", str);
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zzj().query("events", (java.lang.String[]) java.util.Collections.singletonList("name").toArray(new java.lang.String[0]), "app_id=?", new java.lang.String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        java.lang.String string = cursorQuery.getString(0);
                        if (string != null && (zzbdVarZzaA = zzaA("events", str, string)) != null) {
                            zzaF("events_snapshot", zzbdVarZzaA);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzc("Error creating snapshot. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final void zzJ(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        zzg();
        zzav();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((java.lang.Long) list.get(i)).longValue());
        }
        sb.append(")");
        int iDelete = zzj().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            this.zzu.zzaW().zze().zzc("Deleted fewer rows from raw events table than expected", java.lang.Integer.valueOf(iDelete), java.lang.Integer.valueOf(list.size()));
        }
    }

    public final void zzK(java.lang.Long l) {
        zzg();
        zzav();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l);
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaM)) {
            try {
                if (zzj().delete("upload_queue", "rowid=?", new java.lang.String[]{l.toString()}) != 1) {
                    zzioVar.zzaW().zzk().zza("Deleted fewer rows from upload_queue than expected");
                }
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzb("Failed to delete a MeasurementBatch in a upload_queue table", e);
                throw e;
            }
        }
    }

    public final void zzL() {
        zzav();
        zzj().endTransaction();
    }

    final void zzM(java.util.List list) {
        zzg();
        zzav();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        com.google.android.gms.common.internal.Preconditions.checkNotZero(list.size());
        if (zzae()) {
            java.lang.String str = "(" + android.text.TextUtils.join(",", list) + ")";
            if (zzay("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.zzu.zzaW().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzj().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    final void zzN(java.lang.Long l) {
        java.lang.String str;
        zzg();
        zzav();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l);
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaM) && zzae()) {
            if (zzay("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzioVar.zzaW().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
                if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
                    str = " SET retry_count = retry_count + 1, last_upload_timestamp = " + zzioVar.zzaU().currentTimeMillis();
                } else {
                    str = " SET retry_count = retry_count + 1 ";
                }
                sQLiteDatabaseZzj.execSQL("UPDATE upload_queue" + str + " WHERE rowid = " + l + " AND retry_count < 2147483647");
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    final void zzO() {
        zzg();
        zzav();
        if (zzae()) {
            com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
            long jZza = zzpvVar.zzw().zza.zza();
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            long jElapsedRealtime = zzioVar.zzaU().elapsedRealtime();
            long jAbs = java.lang.Math.abs(jElapsedRealtime - jZza);
            zzioVar.zzf();
            if (jAbs > com.google.android.gms.measurement.internal.zzam.zzJ()) {
                zzpvVar.zzw().zza.zzb(jElapsedRealtime);
                zzg();
                zzav();
                if (zzae()) {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
                    zzioVar.zzf();
                    int iDelete = sQLiteDatabaseZzj.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new java.lang.String[]{java.lang.String.valueOf(zzioVar.zzaU().currentTimeMillis()), java.lang.String.valueOf(com.google.android.gms.measurement.internal.zzam.zzI())});
                    if (iDelete > 0) {
                        zzioVar.zzaW().zzj().zzb("Deleted stale rows. rowsDeleted", java.lang.Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    public final void zzP(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        try {
            zzj().delete("user_attributes", "app_id=? and name=?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e) {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            zzioVar.zzaW().zze().zzd("Error deleting user property. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), zzioVar.zzj().zzf(str2), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6 A[ADDED_TO_REGION] */
    public final void zzQ(java.lang.String str) throws java.lang.Throwable {
        boolean z;
        com.google.android.gms.measurement.internal.zzbd zzbdVarZzaA;
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList("name", "lifetime_count"));
        com.google.android.gms.measurement.internal.zzbd zzbdVarZzaA2 = zzaA("events", str, "_f");
        com.google.android.gms.measurement.internal.zzbd zzbdVarZzaA3 = zzaA("events", str, "_v");
        zzaE("events", str);
        android.database.Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = zzj().query("events_snapshot", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), "app_id=?", new java.lang.String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        java.lang.String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (zzbdVarZzaA = zzaA("events_snapshot", str, string)) != null) {
                            zzaF("events", zzbdVarZzaA);
                        }
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            this.zzu.zzaW().zze().zzc("Error querying snapshot. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
                            z3 = z2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && zzbdVarZzaA2 != null) {
                                zzaF("events", zzbdVarZzaA2);
                            } else if (!z && zzbdVarZzaA3 != null) {
                                zzaF("events", zzbdVarZzaA3);
                            }
                            zzaE("events_snapshot", str);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                zzaF("events", zzbdVarZzaA3);
                            }
                        } else if (!z) {
                            zzaF("events", zzbdVarZzaA3);
                        }
                        zzaE("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && zzbdVarZzaA2 != null) {
                    zzaF("events", zzbdVarZzaA2);
                } else if (!z && zzbdVarZzaA3 != null) {
                    zzaF("events", zzbdVarZzaA3);
                }
            } else {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (zzbdVarZzaA2 != null) {
                    zzaF("events", zzbdVarZzaA2);
                } else if (zzbdVarZzaA3 != null) {
                    zzaF("events", zzbdVarZzaA3);
                }
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            z = false;
        } catch (java.lang.Throwable th3) {
            th = th3;
            z = false;
        }
        zzaE("events_snapshot", str);
    }

    final void zzR(java.lang.String str, java.util.List list) {
        java.util.Iterator it;
        boolean z;
        java.lang.String str2 = "app_id=? and audience_id=?";
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        int i = 0;
        while (i < list.size()) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) ((com.google.android.gms.internal.measurement.zzfh) list.get(i)).zzch();
            if (zzfgVar.zza() != 0) {
                int i2 = 0;
                while (i2 < zzfgVar.zza()) {
                    com.google.android.gms.internal.measurement.zzfi zzfiVar = (com.google.android.gms.internal.measurement.zzfi) zzfgVar.zze(i2).zzch();
                    com.google.android.gms.internal.measurement.zzfi zzfiVar2 = (com.google.android.gms.internal.measurement.zzfi) zzfiVar.clone();
                    java.lang.String strZzb = com.google.android.gms.measurement.internal.zzjy.zzb(zzfiVar.zze());
                    if (strZzb != null) {
                        zzfiVar2.zzb(strZzb);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < zzfiVar.zza()) {
                        com.google.android.gms.internal.measurement.zzfl zzflVarZzd = zzfiVar.zzd(i3);
                        com.google.android.gms.internal.measurement.zzfi zzfiVar3 = zzfiVar;
                        java.lang.String str3 = str2;
                        java.lang.String strZzb2 = com.google.android.gms.measurement.internal.zzmg.zzb(zzflVarZzd.zze(), com.google.android.gms.measurement.internal.zzjz.zza, com.google.android.gms.measurement.internal.zzjz.zzb);
                        if (strZzb2 != null) {
                            com.google.android.gms.internal.measurement.zzfk zzfkVar = (com.google.android.gms.internal.measurement.zzfk) zzflVarZzd.zzch();
                            zzfkVar.zza(strZzb2);
                            zzfiVar2.zzc(i3, (com.google.android.gms.internal.measurement.zzfl) zzfkVar.zzba());
                            z = true;
                        }
                        i3++;
                        zzfiVar = zzfiVar3;
                        str2 = str3;
                    }
                    java.lang.String str4 = str2;
                    if (z) {
                        zzfgVar.zzc(i2, zzfiVar2);
                        list.set(i, (com.google.android.gms.internal.measurement.zzfh) zzfgVar.zzba());
                    }
                    i2++;
                    str2 = str4;
                }
            }
            java.lang.String str5 = str2;
            if (zzfgVar.zzb() != 0) {
                for (int i4 = 0; i4 < zzfgVar.zzb(); i4++) {
                    com.google.android.gms.internal.measurement.zzfr zzfrVarZzf = zzfgVar.zzf(i4);
                    java.lang.String strZzb3 = com.google.android.gms.measurement.internal.zzmg.zzb(zzfrVarZzf.zze(), com.google.android.gms.measurement.internal.zzka.zza, com.google.android.gms.measurement.internal.zzka.zzb);
                    if (strZzb3 != null) {
                        com.google.android.gms.internal.measurement.zzfq zzfqVar = (com.google.android.gms.internal.measurement.zzfq) zzfrVarZzf.zzch();
                        zzfqVar.zza(strZzb3);
                        zzfgVar.zzd(i4, zzfqVar);
                        list.set(i, (com.google.android.gms.internal.measurement.zzfh) zzfgVar.zzba());
                    }
                }
            }
            i++;
            str2 = str5;
        }
        java.lang.String str6 = str2;
        zzav();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
        sQLiteDatabaseZzj.beginTransaction();
        try {
            zzav();
            zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj2 = zzj();
            sQLiteDatabaseZzj2.delete("property_filters", "app_id=?", new java.lang.String[]{str});
            sQLiteDatabaseZzj2.delete("event_filters", "app_id=?", new java.lang.String[]{str});
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.zzfh zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it2.next();
                zzav();
                zzg();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfhVar);
                if (zzfhVar.zzk()) {
                    int iZza = zzfhVar.zza();
                    java.util.Iterator it3 = zzfhVar.zzg().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzfj) it3.next()).zzp()) {
                                this.zzu.zzaW().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzhe.zzn(str), java.lang.Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            java.util.Iterator it4 = zzfhVar.zzh().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    java.util.Iterator it5 = zzfhVar.zzg().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            java.util.Iterator it6 = zzfhVar.zzh().iterator();
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    it2 = it;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it6.next();
                                                zzav();
                                                zzg();
                                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfrVar);
                                                if (zzfrVar.zze().isEmpty()) {
                                                    this.zzu.zzaW().zzk().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.measurement.internal.zzhe.zzn(str), java.lang.Integer.valueOf(iZza), java.lang.String.valueOf(zzfrVar.zzj() ? java.lang.Integer.valueOf(zzfrVar.zza()) : null));
                                                } else {
                                                    byte[] bArrZzcd = zzfrVar.zzcd();
                                                    android.content.ContentValues contentValues = new android.content.ContentValues();
                                                    contentValues.put("app_id", str);
                                                    contentValues.put("audience_id", java.lang.Integer.valueOf(iZza));
                                                    contentValues.put("filter_id", zzfrVar.zzj() ? java.lang.Integer.valueOf(zzfrVar.zza()) : null);
                                                    java.util.Iterator it7 = it6;
                                                    contentValues.put("property_name", zzfrVar.zze());
                                                    contentValues.put("session_scoped", zzfrVar.zzk() ? java.lang.Boolean.valueOf(zzfrVar.zzi()) : null);
                                                    contentValues.put("data", bArrZzcd);
                                                    try {
                                                        if (zzj().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            this.zzu.zzaW().zze().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                                                        } else {
                                                            it6 = it7;
                                                        }
                                                    } catch (android.database.sqlite.SQLiteException e) {
                                                        this.zzu.zzaW().zze().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
                                                    }
                                                }
                                            }
                                        } else {
                                            com.google.android.gms.internal.measurement.zzfj zzfjVar = (com.google.android.gms.internal.measurement.zzfj) it5.next();
                                            zzav();
                                            zzg();
                                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                                            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfjVar);
                                            if (!zzfjVar.zzg().isEmpty()) {
                                                byte[] bArrZzcd2 = zzfjVar.zzcd();
                                                it = it2;
                                                android.content.ContentValues contentValues2 = new android.content.ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", java.lang.Integer.valueOf(iZza));
                                                contentValues2.put("filter_id", zzfjVar.zzp() ? java.lang.Integer.valueOf(zzfjVar.zzb()) : null);
                                                contentValues2.put("event_name", zzfjVar.zzg());
                                                contentValues2.put("session_scoped", zzfjVar.zzq() ? java.lang.Boolean.valueOf(zzfjVar.zzn()) : null);
                                                contentValues2.put("data", bArrZzcd2);
                                                try {
                                                    if (zzj().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        this.zzu.zzaW().zze().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                                                    }
                                                    it2 = it;
                                                } catch (android.database.sqlite.SQLiteException e2) {
                                                    this.zzu.zzaW().zze().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e2);
                                                    zzav();
                                                    zzg();
                                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                                                    android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj3 = zzj();
                                                    java.lang.String str7 = str6;
                                                    sQLiteDatabaseZzj3.delete("property_filters", str7, new java.lang.String[]{str, java.lang.String.valueOf(iZza)});
                                                    sQLiteDatabaseZzj3.delete("event_filters", str7, new java.lang.String[]{str, java.lang.String.valueOf(iZza)});
                                                    str6 = str7;
                                                    it2 = it;
                                                    break;
                                                }
                                            } else {
                                                this.zzu.zzaW().zzk().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.measurement.internal.zzhe.zzn(str), java.lang.Integer.valueOf(iZza), java.lang.String.valueOf(zzfjVar.zzp() ? java.lang.Integer.valueOf(zzfjVar.zzb()) : null));
                                                it = it2;
                                            }
                                        }
                                        zzav();
                                        zzg();
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                                        android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj4 = zzj();
                                        java.lang.String str8 = str6;
                                        sQLiteDatabaseZzj4.delete("property_filters", str8, new java.lang.String[]{str, java.lang.String.valueOf(iZza)});
                                        sQLiteDatabaseZzj4.delete("event_filters", str8, new java.lang.String[]{str, java.lang.String.valueOf(iZza)});
                                        str6 = str8;
                                        it2 = it;
                                        break;
                                    }
                                }
                                if (!((com.google.android.gms.internal.measurement.zzfr) it4.next()).zzj()) {
                                    this.zzu.zzaW().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzhe.zzn(str), java.lang.Integer.valueOf(iZza));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.zzu.zzaW().zzk().zzb("Audience with no ID. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zzfh zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it8.next();
                arrayList.add(zzfhVar2.zzk() ? java.lang.Integer.valueOf(zzfhVar2.zza()) : null);
            }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            zzav();
            zzg();
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj5 = zzj();
            try {
                long jZzay = zzay("select count(1) from audience_filter_values where app_id=?", new java.lang.String[]{str});
                int iMax = java.lang.Math.max(0, java.lang.Math.min(2000, this.zzu.zzf().zzh(str, com.google.android.gms.measurement.internal.zzgi.zzT)));
                if (jZzay > iMax) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            sQLiteDatabaseZzj5.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + android.text.TextUtils.join(",", arrayList2) + ")") + " order by rowid desc limit -1 offset ?)", new java.lang.String[]{str, java.lang.Integer.toString(iMax)});
                            break;
                        }
                        java.lang.Integer num = (java.lang.Integer) arrayList.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(java.lang.Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (android.database.sqlite.SQLiteException e3) {
                this.zzu.zzaW().zze().zzc("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e3);
            }
            sQLiteDatabaseZzj.setTransactionSuccessful();
            sQLiteDatabaseZzj.endTransaction();
        } catch (java.lang.Throwable th) {
            sQLiteDatabaseZzj.endTransaction();
            throw th;
        }
    }

    public final void zzS() {
        zzav();
        zzj().setTransactionSuccessful();
    }

    public final void zzT(com.google.android.gms.measurement.internal.zzh zzhVar, boolean z, boolean z2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVar);
        zzg();
        zzav();
        java.lang.String strZzC = zzhVar.zzC();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strZzC);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", strZzC);
        if (z) {
            contentValues.put("app_instance_id", (java.lang.String) null);
        } else if (this.zzg.zzu(strZzC).zzr(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.zzD());
        }
        contentValues.put("gmp_app_id", zzhVar.zzH());
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
        if (zzpvVar.zzu(strZzC).zzr(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzJ());
        }
        contentValues.put("last_bundle_index", java.lang.Long.valueOf(zzhVar.zzt()));
        contentValues.put("last_bundle_start_timestamp", java.lang.Long.valueOf(zzhVar.zzu()));
        contentValues.put("last_bundle_end_timestamp", java.lang.Long.valueOf(zzhVar.zzs()));
        contentValues.put("app_version", zzhVar.zzF());
        contentValues.put("app_store", zzhVar.zzE());
        contentValues.put("gmp_version", java.lang.Long.valueOf(zzhVar.zzq()));
        contentValues.put("dev_cert_hash", java.lang.Long.valueOf(zzhVar.zzn()));
        contentValues.put("measurement_enabled", java.lang.Boolean.valueOf(zzhVar.zzaJ()));
        contentValues.put("day", java.lang.Long.valueOf(zzhVar.zzm()));
        contentValues.put("daily_public_events_count", java.lang.Long.valueOf(zzhVar.zzk()));
        contentValues.put("daily_events_count", java.lang.Long.valueOf(zzhVar.zzj()));
        contentValues.put("daily_conversions_count", java.lang.Long.valueOf(zzhVar.zzh()));
        contentValues.put("config_fetched_time", java.lang.Long.valueOf(zzhVar.zzg()));
        contentValues.put("failed_config_fetch_time", java.lang.Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version_int", java.lang.Long.valueOf(zzhVar.zze()));
        contentValues.put("firebase_instance_id", zzhVar.zzG());
        contentValues.put("daily_error_events_count", java.lang.Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(zzhVar.zzl()));
        contentValues.put("health_monitor_sample", zzhVar.zzI());
        contentValues.put("android_id", (java.lang.Long) 0L);
        contentValues.put("adid_reporting_enabled", java.lang.Boolean.valueOf(zzhVar.zzaI()));
        contentValues.put("admob_app_id", zzhVar.zzA());
        contentValues.put("dynamite_version", java.lang.Long.valueOf(zzhVar.zzo()));
        if (zzpvVar.zzu(strZzC).zzr(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzhVar.zzL());
        }
        contentValues.put("sgtm_upload_enabled", java.lang.Boolean.valueOf(zzhVar.zzaL()));
        contentValues.put("target_os_version", java.lang.Long.valueOf(zzhVar.zzw()));
        contentValues.put("session_stitching_token_hash", java.lang.Long.valueOf(zzhVar.zzv()));
        com.google.android.gms.internal.measurement.zzqr.zzb();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(strZzC, com.google.android.gms.measurement.internal.zzgi.zzaV)) {
            contentValues.put("ad_services_version", java.lang.Integer.valueOf(zzhVar.zza()));
            contentValues.put("attribution_eligibility_status", java.lang.Long.valueOf(zzhVar.zzf()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", java.lang.Boolean.valueOf(zzhVar.zzaM()));
        contentValues.put("npa_metadata_value", zzhVar.zzx());
        contentValues.put("bundle_delivery_index", java.lang.Long.valueOf(zzhVar.zzr()));
        contentValues.put("sgtm_preview_key", zzhVar.zzM());
        contentValues.put("dma_consent_state", java.lang.Integer.valueOf(zzhVar.zzd()));
        contentValues.put("daily_realtime_dcu_count", java.lang.Integer.valueOf(zzhVar.zzc()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzK());
        if (zzioVar.zzf().zzx(strZzC, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
            contentValues.put("client_upload_eligibility", java.lang.Integer.valueOf(zzhVar.zzb()));
        }
        java.util.List listZzN = zzhVar.zzN();
        if (listZzN != null) {
            if (listZzN.isEmpty()) {
                zzioVar.zzaW().zzk().zzb("Safelisted events should not be an empty list. appId", strZzC);
            } else {
                contentValues.put("safelisted_events", android.text.TextUtils.join(",", listZzN));
            }
        }
        com.google.android.gms.internal.measurement.zzpn.zzb();
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaJ) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (java.lang.String) null);
        }
        contentValues.put("unmatched_pfo", zzhVar.zzy());
        contentValues.put("unmatched_uwa", zzhVar.zzz());
        contentValues.put("ad_campaign_info", zzhVar.zzaN());
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
            if (sQLiteDatabaseZzj.update("apps", contentValues, "app_id = ?", new java.lang.String[]{strZzC}) == 0 && sQLiteDatabaseZzj.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzioVar.zzaW().zze().zzb("Failed to insert/update app (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(strZzC));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzc("Error storing app. appId", com.google.android.gms.measurement.internal.zzhe.zzn(strZzC), e);
        }
    }

    public final void zzU(java.lang.String str, com.google.android.gms.measurement.internal.zzba zzbaVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbaVar);
        zzg();
        zzav();
        if (zzu(str) == com.google.android.gms.measurement.internal.zzjx.zza) {
            zzX(str, com.google.android.gms.measurement.internal.zzjx.zza);
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzbaVar.zzj());
        zzaG("consent_settings", "app_id", contentValues);
    }

    public final void zzV(com.google.android.gms.measurement.internal.zzbd zzbdVar) {
        zzaF("events", zzbdVar);
    }

    public final void zzW(java.lang.String str, com.google.android.gms.measurement.internal.zzjx zzjxVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjxVar);
        zzg();
        zzav();
        zzX(str, zzu(str));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjxVar.zzq());
        zzaG("consent_settings", "app_id", contentValues);
    }

    public final void zzX(java.lang.String str, com.google.android.gms.measurement.internal.zzjx zzjxVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjxVar);
        zzg();
        zzav();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjxVar.zzq());
        contentValues.put("consent_source", java.lang.Integer.valueOf(zzjxVar.zzb()));
        zzaG("consent_settings", "app_id", contentValues);
    }

    public final boolean zzY(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaM)) {
            if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
                com.google.android.gms.measurement.internal.zzmf[] zzmfVarArr = {com.google.android.gms.measurement.internal.zzmf.GOOGLE_SIGNAL};
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(java.lang.Integer.valueOf(zzmfVarArr[0].zza()));
                java.lang.String strZzaH = zzaH(arrayList);
                java.lang.String strZzaC = zzaC();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
                sb.append(strZzaH);
                sb.append(" AND NOT ");
                sb.append(strZzaC);
                return zzay(sb.toString(), new java.lang.String[]{str}) != 0;
            }
            if (zzay("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ".concat(zzaC()), new java.lang.String[]{str}) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzZ(java.lang.String str, java.lang.String str2) {
        return zzay("select count(1) from raw_events where app_id = ? and name = ?", new java.lang.String[]{str, str2}) > 0;
    }

    public final int zza(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        try {
            return zzj().delete("conditional_properties", "app_id=? and name=?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e) {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            zzioVar.zzaW().zze().zzd("Error deleting conditional property", com.google.android.gms.measurement.internal.zzhe.zzn(str), zzioVar.zzj().zzf(str2), e);
            return 0;
        }
    }

    public final boolean zzaa() {
        return zzay("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzab() {
        return zzay("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzac() {
        return zzay("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean zzad(java.lang.String str, com.google.android.gms.measurement.internal.zzov zzovVar) {
        zzg();
        zzav();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzovVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        long jCurrentTimeMillis = zzioVar.zzaU().currentTimeMillis();
        long jLongValue = jCurrentTimeMillis - ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzau.zza(null)).longValue();
        long j = zzovVar.zzb;
        if (j < jLongValue || j > ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzau.zza(null)).longValue() + jCurrentTimeMillis) {
            zzioVar.zzaW().zzk().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", com.google.android.gms.measurement.internal.zzhe.zzn(str), java.lang.Long.valueOf(jCurrentTimeMillis), java.lang.Long.valueOf(j));
        }
        zzioVar.zzaW().zzj().zza("Saving trigger URI");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzovVar.zza);
        contentValues.put("source", java.lang.Integer.valueOf(zzovVar.zzc));
        contentValues.put("timestamp_millis", java.lang.Long.valueOf(j));
        try {
            if (zzj().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzioVar.zzaW().zze().zzb("Failed to insert trigger URI (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzc("Error storing trigger URI. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
            return false;
        }
    }

    protected final boolean zzae() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        android.content.Context contextZzaT = zzioVar.zzaT();
        zzioVar.zzf();
        return contextZzaT.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzaf(java.lang.String str, java.lang.Long l, long j, com.google.android.gms.internal.measurement.zzhm zzhmVar) {
        zzg();
        zzav();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhmVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l);
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        byte[] bArrZzcd = zzhmVar.zzcd();
        zzioVar.zzaW().zzj().zzc("Saving complex main event, appId, data size", zzioVar.zzj().zzd(str), java.lang.Integer.valueOf(bArrZzcd.length));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", java.lang.Long.valueOf(j));
        contentValues.put("main_event", bArrZzcd);
        try {
            if (zzj().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzioVar.zzaW().zze().zzb("Failed to insert complex main event (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzc("Error storing complex main event. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
            return false;
        }
    }

    final boolean zzag(java.lang.String str, long j) {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (!zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbe) && zzioVar.zzaU().currentTimeMillis() > androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS + j) {
            return false;
        }
        try {
            return zzaz("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new java.lang.String[]{str, java.lang.String.valueOf(j)}, 0L) <= 0 && zzaz("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new java.lang.String[]{str, java.lang.String.valueOf(j)}, 0L) > 0;
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzb("Error checking backfill conditions", e);
            return false;
        }
    }

    public final boolean zzah(com.google.android.gms.measurement.internal.zzai zzaiVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar);
        zzg();
        zzav();
        java.lang.String str = zzaiVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        if (zzy(str, zzaiVar.zzc.zzb) == null) {
            long jZzay = zzay("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new java.lang.String[]{str});
            this.zzu.zzf();
            if (jZzay >= 1000) {
                return false;
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzaiVar.zzb);
        contentValues.put("name", zzaiVar.zzc.zzb);
        zzau(contentValues, "value", com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar.zzc.zza()));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, java.lang.Boolean.valueOf(zzaiVar.zze));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzaiVar.zzf);
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, java.lang.Long.valueOf(zzaiVar.zzh));
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        contentValues.put("timed_out_event", zzioVar.zzw().zzay(zzaiVar.zzg));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, java.lang.Long.valueOf(zzaiVar.zzd));
        contentValues.put("triggered_event", zzioVar.zzw().zzay(zzaiVar.zzi));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, java.lang.Long.valueOf(zzaiVar.zzc.zzc));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, java.lang.Long.valueOf(zzaiVar.zzj));
        contentValues.put("expired_event", zzioVar.zzw().zzay(zzaiVar.zzk));
        try {
            if (zzj().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzioVar.zzaW().zze().zzb("Failed to insert/update conditional user property (got -1)", com.google.android.gms.measurement.internal.zzhe.zzn(str));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzc("Error storing conditional user property", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
        }
        return true;
    }

    public final boolean zzai(com.google.android.gms.measurement.internal.zzqd zzqdVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzqdVar);
        zzg();
        zzav();
        java.lang.String str = zzqdVar.zza;
        java.lang.String str2 = zzqdVar.zzc;
        if (zzy(str, str2) == null) {
            if (com.google.android.gms.measurement.internal.zzqf.zzaq(str2)) {
                if (zzay("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{str}) >= this.zzu.zzf().zzi(str, com.google.android.gms.measurement.internal.zzgi.zzU, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jZzay = zzay("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new java.lang.String[]{str, zzqdVar.zzb});
                this.zzu.zzf();
                if (jZzay >= 25) {
                    return false;
                }
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzqdVar.zzb);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", java.lang.Long.valueOf(zzqdVar.zzd));
        zzau(contentValues, "value", zzqdVar.zze);
        try {
            if (zzj().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzu.zzaW().zze().zzb("Failed to insert/update user property (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zze().zzc("Error storing user property. appId", com.google.android.gms.measurement.internal.zzhe.zzn(zzqdVar.zza), e);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d7 A[Catch: SQLiteException -> 0x006b, all -> 0x006e, TryCatch #1 {SQLiteException -> 0x006b, blocks: (B:16:0x0063, B:33:0x00ae, B:35:0x00d7, B:36:0x00ec, B:37:0x00f0, B:38:0x0100, B:40:0x0106, B:41:0x0119, B:43:0x0128, B:45:0x0143, B:47:0x016c, B:48:0x0174, B:50:0x017f, B:55:0x01b1, B:54:0x019c, B:58:0x01b8, B:44:0x0139, B:60:0x01cd), top: B:72:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec A[Catch: SQLiteException -> 0x006b, all -> 0x006e, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x006b, blocks: (B:16:0x0063, B:33:0x00ae, B:35:0x00d7, B:36:0x00ec, B:37:0x00f0, B:38:0x0100, B:40:0x0106, B:41:0x0119, B:43:0x0128, B:45:0x0143, B:47:0x016c, B:48:0x0174, B:50:0x017f, B:55:0x01b1, B:54:0x019c, B:58:0x01b8, B:44:0x0139, B:60:0x01cd), top: B:72:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0106 A[Catch: SQLiteException -> 0x006b, all -> 0x006e, TryCatch #1 {SQLiteException -> 0x006b, blocks: (B:16:0x0063, B:33:0x00ae, B:35:0x00d7, B:36:0x00ec, B:37:0x00f0, B:38:0x0100, B:40:0x0106, B:41:0x0119, B:43:0x0128, B:45:0x0143, B:47:0x016c, B:48:0x0174, B:50:0x017f, B:55:0x01b1, B:54:0x019c, B:58:0x01b8, B:44:0x0139, B:60:0x01cd), top: B:72:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0128 A[Catch: SQLiteException -> 0x006b, all -> 0x006e, TryCatch #1 {SQLiteException -> 0x006b, blocks: (B:16:0x0063, B:33:0x00ae, B:35:0x00d7, B:36:0x00ec, B:37:0x00f0, B:38:0x0100, B:40:0x0106, B:41:0x0119, B:43:0x0128, B:45:0x0143, B:47:0x016c, B:48:0x0174, B:50:0x017f, B:55:0x01b1, B:54:0x019c, B:58:0x01b8, B:44:0x0139, B:60:0x01cd), top: B:72:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0139 A[Catch: SQLiteException -> 0x006b, all -> 0x006e, TryCatch #1 {SQLiteException -> 0x006b, blocks: (B:16:0x0063, B:33:0x00ae, B:35:0x00d7, B:36:0x00ec, B:37:0x00f0, B:38:0x0100, B:40:0x0106, B:41:0x0119, B:43:0x0128, B:45:0x0143, B:47:0x016c, B:48:0x0174, B:50:0x017f, B:55:0x01b1, B:54:0x019c, B:58:0x01b8, B:44:0x0139, B:60:0x01cd), top: B:72:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x016c A[Catch: SQLiteException -> 0x006b, all -> 0x006e, LOOP:0: B:47:0x016c->B:79:?, LOOP_START, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x006b, blocks: (B:16:0x0063, B:33:0x00ae, B:35:0x00d7, B:36:0x00ec, B:37:0x00f0, B:38:0x0100, B:40:0x0106, B:41:0x0119, B:43:0x0128, B:45:0x0143, B:47:0x016c, B:48:0x0174, B:50:0x017f, B:55:0x01b1, B:54:0x019c, B:58:0x01b8, B:44:0x0139, B:60:0x01cd), top: B:72:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01b1 A[Catch: SQLiteException -> 0x006b, all -> 0x006e, TryCatch #1 {SQLiteException -> 0x006b, blocks: (B:16:0x0063, B:33:0x00ae, B:35:0x00d7, B:36:0x00ec, B:37:0x00f0, B:38:0x0100, B:40:0x0106, B:41:0x0119, B:43:0x0128, B:45:0x0143, B:47:0x016c, B:48:0x0174, B:50:0x017f, B:55:0x01b1, B:54:0x019c, B:58:0x01b8, B:44:0x0139, B:60:0x01cd), top: B:72:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8 A[Catch: SQLiteException -> 0x006b, all -> 0x006e, TryCatch #1 {SQLiteException -> 0x006b, blocks: (B:16:0x0063, B:33:0x00ae, B:35:0x00d7, B:36:0x00ec, B:37:0x00f0, B:38:0x0100, B:40:0x0106, B:41:0x0119, B:43:0x0128, B:45:0x0143, B:47:0x016c, B:48:0x0174, B:50:0x017f, B:55:0x01b1, B:54:0x019c, B:58:0x01b8, B:44:0x0139, B:60:0x01cd), top: B:72:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x019a A[SYNTHETIC] */
    public final void zzat(java.lang.String str, long j, long j2, com.google.android.gms.measurement.internal.zzpr zzprVar) {
        java.lang.String string;
        java.lang.String string2;
        char c;
        boolean z;
        java.lang.String str2;
        java.lang.String[] strArr;
        long j3;
        com.google.android.gms.internal.measurement.zzhl zzhlVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzprVar);
        zzg();
        zzav();
        android.database.Cursor cursorRawQuery = null;
        try {
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
                if (android.text.TextUtils.isEmpty(str)) {
                    cursorRawQuery = sQLiteDatabaseZzj.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j2 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j2 != -1 ? new java.lang.String[]{java.lang.String.valueOf(j2), java.lang.String.valueOf(j)} : new java.lang.String[]{java.lang.String.valueOf(j)});
                    if (cursorRawQuery.moveToFirst()) {
                        string = cursorRawQuery.getString(0);
                        try {
                            string2 = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                            cursorRawQuery = sQLiteDatabaseZzj.query("raw_events_metadata", new java.lang.String[]{androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new java.lang.String[]{string, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                try {
                                    com.google.android.gms.internal.measurement.zzhx zzhxVar = (com.google.android.gms.internal.measurement.zzhx) ((com.google.android.gms.internal.measurement.zzhw) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhx.zzz(), cursorRawQuery.getBlob(0))).zzba();
                                    if (cursorRawQuery.moveToNext()) {
                                        this.zzu.zzaW().zzk().zzb("Get multiple raw event metadata records, expected one. appId", com.google.android.gms.measurement.internal.zzhe.zzn(string));
                                    }
                                    cursorRawQuery.close();
                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhxVar);
                                    zzprVar.zza = zzhxVar;
                                    if (j2 != -1) {
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        z = true;
                                        c = 2;
                                        strArr = new java.lang.String[]{string, string2, java.lang.String.valueOf(j2)};
                                    } else {
                                        c = 2;
                                        z = true;
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new java.lang.String[]{string, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseZzj.query("raw_events", new java.lang.String[]{"rowid", "name", com.ironsource.aa.a.d, "data"}, str2, strArr, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j3 = cursorRawQuery.getLong(0);
                                            try {
                                                zzhlVar = (com.google.android.gms.internal.measurement.zzhl) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), cursorRawQuery.getBlob(3));
                                                zzhlVar.zzi(cursorRawQuery.getString(1));
                                                zzhlVar.zzm(cursorRawQuery.getLong(2));
                                                if (!zzprVar.zza(j3, (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba())) {
                                                    break;
                                                }
                                            } catch (java.io.IOException e) {
                                                this.zzu.zzaW().zze().zzc("Data loss. Failed to merge raw event. appId", com.google.android.gms.measurement.internal.zzhe.zzn(string), e);
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        this.zzu.zzaW().zzk().zzb("Raw event data disappeared while in transaction. appId", com.google.android.gms.measurement.internal.zzhe.zzn(string));
                                    }
                                } catch (java.io.IOException e2) {
                                    this.zzu.zzaW().zze().zzc("Data loss. Failed to merge raw event metadata. appId", com.google.android.gms.measurement.internal.zzhe.zzn(string), e2);
                                }
                            } else {
                                this.zzu.zzaW().zze().zzb("Raw event metadata record is missing. appId", com.google.android.gms.measurement.internal.zzhe.zzn(string));
                            }
                        } catch (android.database.sqlite.SQLiteException e3) {
                            e = e3;
                            this.zzu.zzaW().zze().zzc("Data loss. Error selecting raw event. appId", com.google.android.gms.measurement.internal.zzhe.zzn(string), e);
                        }
                    }
                } else {
                    cursorRawQuery = sQLiteDatabaseZzj.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j2 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j2 != -1 ? new java.lang.String[]{str, java.lang.String.valueOf(j2)} : new java.lang.String[]{str});
                    if (cursorRawQuery.moveToFirst()) {
                        string2 = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        string = str;
                        cursorRawQuery = sQLiteDatabaseZzj.query("raw_events_metadata", new java.lang.String[]{androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new java.lang.String[]{string, string2}, null, null, "rowid", "2");
                        if (cursorRawQuery.moveToFirst()) {
                            this.zzu.zzaW().zze().zzb("Raw event metadata record is missing. appId", com.google.android.gms.measurement.internal.zzhe.zzn(string));
                        } else {
                            com.google.android.gms.internal.measurement.zzhx zzhxVar2 = (com.google.android.gms.internal.measurement.zzhx) ((com.google.android.gms.internal.measurement.zzhw) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhx.zzz(), cursorRawQuery.getBlob(0))).zzba();
                            if (cursorRawQuery.moveToNext()) {
                                this.zzu.zzaW().zzk().zzb("Get multiple raw event metadata records, expected one. appId", com.google.android.gms.measurement.internal.zzhe.zzn(string));
                            }
                            cursorRawQuery.close();
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhxVar2);
                            zzprVar.zza = zzhxVar2;
                            if (j2 != -1) {
                                str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                z = true;
                                c = 2;
                                strArr = new java.lang.String[]{string, string2, java.lang.String.valueOf(j2)};
                            } else {
                                c = 2;
                                z = true;
                                str2 = "app_id = ? and metadata_fingerprint = ?";
                                strArr = new java.lang.String[]{string, string2};
                            }
                            cursorRawQuery = sQLiteDatabaseZzj.query("raw_events", new java.lang.String[]{"rowid", "name", com.ironsource.aa.a.d, "data"}, str2, strArr, null, null, "rowid", null);
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    j3 = cursorRawQuery.getLong(0);
                                    zzhlVar = (com.google.android.gms.internal.measurement.zzhl) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), cursorRawQuery.getBlob(3));
                                    zzhlVar.zzi(cursorRawQuery.getString(1));
                                    zzhlVar.zzm(cursorRawQuery.getLong(2));
                                    if (!zzprVar.zza(j3, (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba())) {
                                        break;
                                        break;
                                    }
                                } while (cursorRawQuery.moveToNext());
                            } else {
                                this.zzu.zzaW().zzk().zzb("Raw event data disappeared while in transaction. appId", com.google.android.gms.measurement.internal.zzhe.zzn(string));
                            }
                        }
                    }
                }
            } catch (android.database.sqlite.SQLiteException e4) {
                e = e4;
                string = str;
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }

    public final long zzd(java.lang.String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, java.lang.String str2, java.util.Map map, com.google.android.gms.measurement.internal.zzmf zzmfVar, java.lang.Long l) {
        int iDelete;
        zzg();
        zzav();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhvVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaM)) {
            zzg();
            zzav();
            if (zzae()) {
                com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
                long jZza = zzpvVar.zzw().zzb.zza();
                long jElapsedRealtime = zzioVar.zzaU().elapsedRealtime();
                long jAbs = java.lang.Math.abs(jElapsedRealtime - jZza);
                zzioVar.zzf();
                if (jAbs > com.google.android.gms.measurement.internal.zzam.zzJ()) {
                    zzpvVar.zzw().zzb.zzb(jElapsedRealtime);
                    zzg();
                    zzav();
                    if (zzae() && (iDelete = zzj().delete("upload_queue", zzaC(), new java.lang.String[0])) > 0) {
                        zzioVar.zzaW().zzj().zzb("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", java.lang.Integer.valueOf(iDelete));
                    }
                    if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                        zzg();
                        zzav();
                        try {
                            int iZzh = zzioVar.zzf().zzh(str, com.google.android.gms.measurement.internal.zzgi.zzz);
                            if (iZzh > 0) {
                                zzj().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new java.lang.String[]{str, java.lang.String.valueOf(iZzh)});
                            }
                        } catch (android.database.sqlite.SQLiteException e) {
                            this.zzu.zzaW().zze().zzc("Error deleting over the limit queued batches. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
                        }
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry entry : map.entrySet()) {
                arrayList.add(((java.lang.String) entry.getKey()) + com.ironsource.y8.i.b + ((java.lang.String) entry.getValue()));
            }
            byte[] bArrZzcd = zzhvVar.zzcd();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", bArrZzcd);
            contentValues.put("upload_uri", str2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((java.lang.CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((java.lang.CharSequence) "\r\n");
                }
            }
            contentValues.put("upload_headers", sb.toString());
            contentValues.put("upload_type", java.lang.Integer.valueOf(zzmfVar.zza()));
            com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
            contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, java.lang.Long.valueOf(zzioVar2.zzaU().currentTimeMillis()));
            contentValues.put("retry_count", (java.lang.Integer) 0);
            if (l != null) {
                contentValues.put("associated_row_id", l);
            }
            try {
                long jInsert = zzj().insert("upload_queue", null, contentValues);
                if (jInsert != -1) {
                    return jInsert;
                }
                zzioVar2.zzaW().zze().zzb("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
                return -1L;
            } catch (android.database.sqlite.SQLiteException e2) {
                this.zzu.zzaW().zze().zzc("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            }
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0081 A[Catch: SQLiteException -> 0x0099, all -> 0x00b6, TryCatch #0 {SQLiteException -> 0x0099, blocks: (B:11:0x0060, B:13:0x0081, B:14:0x0095), top: B:27:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0095 A[Catch: SQLiteException -> 0x0099, all -> 0x00b6, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x0099, blocks: (B:11:0x0060, B:13:0x0081, B:14:0x0095), top: B:27:0x0060 }] */
    protected final long zze(java.lang.String str, java.lang.String str2) {
        long jZzaz;
        android.database.sqlite.SQLiteException e;
        long j;
        android.content.ContentValues contentValues;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzav();
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
        sQLiteDatabaseZzj.beginTransaction();
        try {
            try {
                j = -1;
                jZzaz = zzaz("select first_open_count from app2 where app_id=?", new java.lang.String[]{str}, -1L);
                if (jZzaz == -1) {
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (java.lang.Integer) 0);
                    contentValues2.put("previous_install_count", (java.lang.Integer) 0);
                    if (sQLiteDatabaseZzj.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.zzu.zzaW().zze().zzc("Failed to insert column (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), "first_open_count");
                    } else {
                        jZzaz = 0;
                        try {
                            contentValues = new android.content.ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", java.lang.Long.valueOf(1 + jZzaz));
                            if (sQLiteDatabaseZzj.update("app2", contentValues, "app_id = ?", new java.lang.String[]{str}) == 0) {
                                this.zzu.zzaW().zze().zzc("Failed to update column (got 0). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), "first_open_count");
                            } else {
                                sQLiteDatabaseZzj.setTransactionSuccessful();
                                j = jZzaz;
                            }
                        } catch (android.database.sqlite.SQLiteException e2) {
                            e = e2;
                            this.zzu.zzaW().zze().zzd("Error inserting column. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), "first_open_count", e);
                        }
                    }
                } else {
                    contentValues = new android.content.ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", java.lang.Long.valueOf(1 + jZzaz));
                    if (sQLiteDatabaseZzj.update("app2", contentValues, "app_id = ?", new java.lang.String[]{str}) == 0) {
                        this.zzu.zzaW().zze().zzc("Failed to update column (got 0). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), "first_open_count");
                    } else {
                        sQLiteDatabaseZzj.setTransactionSuccessful();
                        j = jZzaz;
                    }
                }
            } finally {
                sQLiteDatabaseZzj.endTransaction();
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            jZzaz = 0;
            e = e3;
        }
        return j;
    }

    public final long zzf() {
        return zzaz("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zzh() {
        return zzaz("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzi(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return zzaz("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{str}, 0L);
    }

    final android.database.sqlite.SQLiteDatabase zzj() {
        zzg();
        try {
            return this.zzm.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaW().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0085: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:27:0x0085 */
    public final android.os.Bundle zzk(java.lang.String str) throws java.lang.Throwable {
        android.database.Cursor cursorRawQuery;
        android.database.Cursor cursor;
        zzg();
        zzav();
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = zzj().rawQuery("select parameters from default_event_params where app_id=?", new java.lang.String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            com.google.android.gms.internal.measurement.zzhm zzhmVar = (com.google.android.gms.internal.measurement.zzhm) ((com.google.android.gms.internal.measurement.zzhl) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), cursorRawQuery.getBlob(0))).zzba();
                            this.zzg.zzA();
                            android.os.Bundle bundleZzF = com.google.android.gms.measurement.internal.zzqa.zzF(zzhmVar.zzi());
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            return bundleZzF;
                        } catch (java.io.IOException e) {
                            this.zzu.zzaW().zze().zzc("Failed to retrieve default event parameters. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
                        }
                    } else {
                        this.zzu.zzaW().zzj().zza("Default event parameters not found");
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaW().zze().zzb("Error selecting default event parameters", e);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x031b  */
    public final com.google.android.gms.measurement.internal.zzh zzl(java.lang.String str) {
        android.database.Cursor cursorQuery;
        java.lang.Boolean boolValueOf;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        android.database.Cursor cursor = null;
        try {
            boolean z = true;
            cursorQuery = zzj().query("apps", new java.lang.String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
                        com.google.android.gms.measurement.internal.zzh zzhVar = new com.google.android.gms.measurement.internal.zzh(zzpvVar.zzt(), str);
                        com.google.android.gms.measurement.internal.zzjx zzjxVarZzu = zzpvVar.zzu(str);
                        com.google.android.gms.measurement.internal.zzjw zzjwVar = com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE;
                        if (zzjxVarZzu.zzr(zzjwVar)) {
                            zzhVar.zzV(cursorQuery.getString(0));
                        }
                        zzhVar.zzao(cursorQuery.getString(1));
                        if (zzpvVar.zzu(str).zzr(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE)) {
                            zzhVar.zzax(cursorQuery.getString(2));
                        }
                        zzhVar.zzat(cursorQuery.getLong(3));
                        zzhVar.zzau(cursorQuery.getLong(4));
                        zzhVar.zzas(cursorQuery.getLong(5));
                        zzhVar.zzX(cursorQuery.getString(6));
                        zzhVar.zzW(cursorQuery.getString(7));
                        zzhVar.zzap(cursorQuery.getLong(8));
                        zzhVar.zzaj(cursorQuery.getLong(9));
                        zzhVar.zzav(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        zzhVar.zzai(cursorQuery.getLong(11));
                        zzhVar.zzaf(cursorQuery.getLong(12));
                        zzhVar.zzae(cursorQuery.getLong(13));
                        zzhVar.zzac(cursorQuery.getLong(14));
                        zzhVar.zzab(cursorQuery.getLong(15));
                        zzhVar.zzam(cursorQuery.getLong(16));
                        zzhVar.zzY(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        zzhVar.zzan(cursorQuery.getString(18));
                        zzhVar.zzad(cursorQuery.getLong(19));
                        zzhVar.zzah(cursorQuery.getLong(20));
                        zzhVar.zzaq(cursorQuery.getString(21));
                        zzhVar.zzU(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        zzhVar.zzS(cursorQuery.getString(24));
                        zzhVar.zzal(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            zzhVar.zzay(java.util.Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (zzpvVar.zzu(str).zzr(zzjwVar)) {
                            zzhVar.zzaA(cursorQuery.getString(28));
                        }
                        zzhVar.zzaD((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                        zzhVar.zzar(cursorQuery.getLong(39));
                        zzhVar.zzaC(cursorQuery.getString(36));
                        zzhVar.zzaE(cursorQuery.getLong(30));
                        zzhVar.zzaB(cursorQuery.getLong(31));
                        com.google.android.gms.internal.measurement.zzqr.zzb();
                        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                        if (zzioVar.zzf().zzx(str, com.google.android.gms.measurement.internal.zzgi.zzaV)) {
                            zzhVar.zzT(cursorQuery.getInt(32));
                            zzhVar.zzZ(cursorQuery.getLong(35));
                        }
                        zzhVar.zzaF((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            if (cursorQuery.getInt(34) == 0) {
                                z = false;
                            }
                            boolValueOf = java.lang.Boolean.valueOf(z);
                        }
                        zzhVar.zzaw(boolValueOf);
                        zzhVar.zzak(cursorQuery.getInt(37));
                        zzhVar.zzag(cursorQuery.getInt(38));
                        zzhVar.zzaz(cursorQuery.isNull(40) ? "" : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursorQuery.getString(40)));
                        if (!cursorQuery.isNull(41)) {
                            zzhVar.zzaG(java.lang.Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            zzhVar.zzaH(java.lang.Long.valueOf(cursorQuery.getLong(42)));
                        }
                        zzhVar.zzR(cursorQuery.getBlob(43));
                        if (zzioVar.zzf().zzx(str, com.google.android.gms.measurement.internal.zzgi.zzaP) && !cursorQuery.isNull(44)) {
                            zzhVar.zzaa(cursorQuery.getInt(44));
                        }
                        zzhVar.zzO();
                        if (cursorQuery.moveToNext()) {
                            zzioVar.zzaW().zze().zzb("Got multiple records for app, expected one. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzhVar;
                    }
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    this.zzu.zzaW().zze().zzc("Error querying app. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0122  */
    public final com.google.android.gms.measurement.internal.zzai zzm(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        android.database.Cursor cursor = null;
        try {
            cursorQuery = zzj().query("conditional_properties", new java.lang.String[]{"origin", "value", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new java.lang.String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        java.lang.String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        java.lang.String str3 = string;
                        java.lang.Object objZzz = zzz(cursorQuery, 1);
                        boolean z = cursorQuery.getInt(2) != 0;
                        java.lang.String string2 = cursorQuery.getString(3);
                        long j = cursorQuery.getLong(4);
                        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
                        com.google.android.gms.measurement.internal.zzai zzaiVar = new com.google.android.gms.measurement.internal.zzai(str, str3, new com.google.android.gms.measurement.internal.zzqb(str2, cursorQuery.getLong(8), objZzz, str3), cursorQuery.getLong(6), z, string2, (com.google.android.gms.measurement.internal.zzbh) zzpvVar.zzA().zzi(cursorQuery.getBlob(5), com.google.android.gms.measurement.internal.zzbh.CREATOR), j, (com.google.android.gms.measurement.internal.zzbh) zzpvVar.zzA().zzi(cursorQuery.getBlob(7), com.google.android.gms.measurement.internal.zzbh.CREATOR), cursorQuery.getLong(9), (com.google.android.gms.measurement.internal.zzbh) zzpvVar.zzA().zzi(cursorQuery.getBlob(10), com.google.android.gms.measurement.internal.zzbh.CREATOR));
                        if (cursorQuery.moveToNext()) {
                            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                            zzioVar.zzaW().zze().zzc("Got multiple records for conditional property, expected one", com.google.android.gms.measurement.internal.zzhe.zzn(str), zzioVar.zzj().zzf(str2));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzaiVar;
                    }
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
                    zzioVar2.zzaW().zze().zzd("Error querying conditional property", com.google.android.gms.measurement.internal.zzhe.zzn(str), zzioVar2.zzj().zzf(str2), e);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0085: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:27:0x0085 */
    public final com.google.android.gms.measurement.internal.zzar zzn(java.lang.String str) throws java.lang.Throwable {
        android.database.sqlite.SQLiteException e;
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzj().query("apps", new java.lang.String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        java.lang.String string = cursorQuery.getString(1);
                        java.lang.String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            this.zzu.zzaW().zze().zzb("Got multiple records for app config, expected one. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                        }
                        if (blob != null) {
                            com.google.android.gms.measurement.internal.zzar zzarVar = new com.google.android.gms.measurement.internal.zzar(blob, string, string2);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return zzarVar;
                        }
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaW().zze().zzc("Error querying remote config. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final com.google.android.gms.measurement.internal.zzas zzo(long j, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return zzp(j, str, 1L, false, false, z3, false, z5, z6, z7);
    }

    public final com.google.android.gms.measurement.internal.zzas zzp(long j, java.lang.String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        java.lang.String[] strArr = {str};
        com.google.android.gms.measurement.internal.zzas zzasVar = new com.google.android.gms.measurement.internal.zzas();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseZzj = zzj();
                cursorQuery = sQLiteDatabaseZzj.query("apps", new java.lang.String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        zzasVar.zzb = cursorQuery.getLong(1);
                        zzasVar.zza = cursorQuery.getLong(2);
                        zzasVar.zzc = cursorQuery.getLong(3);
                        zzasVar.zzd = cursorQuery.getLong(4);
                        zzasVar.zze = cursorQuery.getLong(5);
                        zzasVar.zzf = cursorQuery.getLong(6);
                        zzasVar.zzg = cursorQuery.getLong(7);
                    }
                    if (z) {
                        zzasVar.zzb += j2;
                    }
                    if (z2) {
                        zzasVar.zza += j2;
                    }
                    if (z3) {
                        zzasVar.zzc += j2;
                    }
                    if (z4) {
                        zzasVar.zzd += j2;
                    }
                    if (z5) {
                        zzasVar.zze += j2;
                    }
                    if (z6) {
                        zzasVar.zzf += j2;
                    }
                    if (z7) {
                        zzasVar.zzg += j2;
                    }
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("day", java.lang.Long.valueOf(j));
                    contentValues.put("daily_public_events_count", java.lang.Long.valueOf(zzasVar.zza));
                    contentValues.put("daily_events_count", java.lang.Long.valueOf(zzasVar.zzb));
                    contentValues.put("daily_conversions_count", java.lang.Long.valueOf(zzasVar.zzc));
                    contentValues.put("daily_error_events_count", java.lang.Long.valueOf(zzasVar.zzd));
                    contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(zzasVar.zze));
                    contentValues.put("daily_realtime_dcu_count", java.lang.Long.valueOf(zzasVar.zzf));
                    contentValues.put("daily_registered_triggers_count", java.lang.Long.valueOf(zzasVar.zzg));
                    sQLiteDatabaseZzj.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.zzu.zzaW().zzk().zzb("Not updating daily counts, app is not known. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                }
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaW().zze().zzc("Error updating daily counts. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), e);
            }
            return zzasVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public final com.google.android.gms.measurement.internal.zzba zzq(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zzg();
        zzav();
        return com.google.android.gms.measurement.internal.zzba.zze(zzaD("select dma_consent_settings from consent_settings where app_id=? limit 1;", new java.lang.String[]{str}, ""));
    }

    final com.google.android.gms.measurement.internal.zzbd zzr(java.lang.String str, com.google.android.gms.internal.measurement.zzhm zzhmVar, java.lang.String str2) throws java.lang.Throwable {
        com.google.android.gms.measurement.internal.zzbd zzbdVarZzaA = zzaA("events", str, zzhmVar.zzh());
        if (zzbdVarZzaA == null) {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
            zzioVar.zzaW().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", com.google.android.gms.measurement.internal.zzhe.zzn(str), zzioVar.zzj().zzd(str2));
            return new com.google.android.gms.measurement.internal.zzbd(str, zzhmVar.zzh(), 1L, 1L, 1L, zzhmVar.zzd(), 0L, null, null, null, null);
        }
        long j = zzbdVarZzaA.zze + 1;
        long j2 = zzbdVarZzaA.zzd + 1;
        return new com.google.android.gms.measurement.internal.zzbd(zzbdVarZzaA.zza, zzbdVarZzaA.zzb, zzbdVarZzaA.zzc + 1, j2, j, zzbdVarZzaA.zzf, zzbdVarZzaA.zzg, zzbdVarZzaA.zzh, zzbdVarZzaA.zzi, zzbdVarZzaA.zzj, zzbdVarZzaA.zzk);
    }

    public final com.google.android.gms.measurement.internal.zzbd zzs(java.lang.String str, java.lang.String str2) {
        return zzaA("events", str, str2);
    }

    public final com.google.android.gms.measurement.internal.zzjx zzt(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zzg();
        zzav();
        return com.google.android.gms.measurement.internal.zzjx.zzk(zzaD("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new java.lang.String[]{str}, ""), 100);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d A[ExcSplitCross -> B:21:0x005d, PHI: r3
  0x005d: PHI (r3v8 com.google.android.gms.measurement.internal.zzjx) = (r3v7 com.google.android.gms.measurement.internal.zzjx), (r3v11 com.google.android.gms.measurement.internal.zzjx) binds: [B:10:0x003e, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.google.android.gms.measurement.internal.zzjx] */
    public final com.google.android.gms.measurement.internal.zzjx zzu(java.lang.String str) {
        java.lang.Throwable th;
        android.database.sqlite.SQLiteException e;
        android.database.Cursor cursorRawQuery;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zzg();
        zzav();
        java.lang.String[] strArr = {str};
        com.google.android.gms.measurement.internal.zzjx zzjxVar = "select consent_state, consent_source from consent_settings where app_id=? limit 1;";
        ?? r3 = 0;
        zzjxVarZzk = null;
        zzjxVarZzk = null;
        zzjxVarZzk = null;
        com.google.android.gms.measurement.internal.zzjx zzjxVarZzk = null;
        try {
            try {
                cursorRawQuery = zzj().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", strArr);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        zzjxVarZzk = com.google.android.gms.measurement.internal.zzjx.zzk(cursorRawQuery.getString(0), cursorRawQuery.getInt(1));
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else {
                        this.zzu.zzaW().zzj().zza("No data found");
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaW().zze().zzb("Error querying database.", e);
                    if (cursorRawQuery != null) {
                    }
                    zzjxVar = zzjxVarZzk;
                    if (zzjxVarZzk == null) {
                        return com.google.android.gms.measurement.internal.zzjx.zza;
                    }
                    return zzjxVarZzk;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                r3 = zzjxVar;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        zzjxVar = zzjxVarZzk;
        if (zzjxVarZzk == null) {
            return com.google.android.gms.measurement.internal.zzjx.zza;
        }
        return zzjxVarZzk;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    public final com.google.android.gms.measurement.internal.zzpz zzw(java.lang.String str) throws java.lang.Throwable {
        android.database.Cursor cursor;
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor2;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        com.google.android.gms.measurement.internal.zzpz zzpzVar = null;
        if (!zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaM)) {
            return null;
        }
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
            java.util.List listZzD = zzD(str, com.google.android.gms.measurement.internal.zzpc.zza(com.google.android.gms.measurement.internal.zzmf.GOOGLE_SIGNAL), 1);
            if (listZzD.isEmpty()) {
                return null;
            }
            return (com.google.android.gms.measurement.internal.zzpz) listZzD.get(0);
        }
        try {
            try {
                cursorQuery = zzj().query("upload_queue", new java.lang.String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "app_id=? AND NOT " + zzaC(), new java.lang.String[]{str}, null, null, "creation_timestamp ASC", "1");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        zzpzVar = null;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzpzVar;
                    }
                    cursor2 = cursorQuery;
                    try {
                        com.google.android.gms.measurement.internal.zzpz zzpzVarZzaB = zzaB(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return zzpzVarZzaB;
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    cursor2 = cursorQuery;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor2 = cursorQuery;
                }
                cursor = cursor2;
            } catch (android.database.sqlite.SQLiteException e3) {
                e = e3;
                zzpzVar = null;
                cursor = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                cursor = null;
            }
            this.zzu.zzaW().zze().zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e);
            cursorQuery = cursor;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return zzpzVar;
        } catch (java.lang.Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    public final com.google.android.gms.measurement.internal.zzpz zzx(long j) throws java.lang.Throwable {
        android.database.Cursor cursor;
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor2;
        com.google.android.gms.measurement.internal.zzpz zzpzVar = null;
        if (!this.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaP)) {
            return null;
        }
        zzg();
        zzav();
        try {
            try {
                cursorQuery = zzj().query("upload_queue", new java.lang.String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "rowId=?", new java.lang.String[]{java.lang.String.valueOf(j)}, null, null, null, "1");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        zzpzVar = null;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzpzVar;
                    }
                    cursor2 = cursorQuery;
                    try {
                        com.google.android.gms.measurement.internal.zzpz zzpzVarZzaB = zzaB((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursorQuery.getString(1)), j, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return zzpzVarZzaB;
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    cursor2 = cursorQuery;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor2 = cursorQuery;
                }
                cursor = cursor2;
            } catch (android.database.sqlite.SQLiteException e3) {
                e = e3;
                zzpzVar = null;
                cursor = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                cursor = null;
            }
            this.zzu.zzaW().zze().zzc("Error to querying MeasurementBatch from upload_queue. rowId", java.lang.Long.valueOf(j), e);
            cursorQuery = cursor;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return zzpzVar;
        } catch (java.lang.Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    public final com.google.android.gms.measurement.internal.zzqd zzy(java.lang.String str, java.lang.String str2) {
        android.database.Cursor cursorQuery;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        android.database.Cursor cursor = null;
        try {
            cursorQuery = zzj().query("user_attributes", new java.lang.String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new java.lang.String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        java.lang.Object objZzz = zzz(cursorQuery, 1);
                        if (objZzz != null) {
                            com.google.android.gms.measurement.internal.zzqd zzqdVar = new com.google.android.gms.measurement.internal.zzqd(str, cursorQuery.getString(2), str2, j, objZzz);
                            if (cursorQuery.moveToNext()) {
                                this.zzu.zzaW().zze().zzb("Got multiple records for user property, expected one. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str));
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return zzqdVar;
                        }
                    }
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                    zzioVar.zzaW().zze().zzd("Error querying user property. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str), zzioVar.zzj().zzf(str2), e);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    final java.lang.Object zzz(android.database.Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.zzu.zzaW().zze().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return java.lang.Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return java.lang.Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            this.zzu.zzaW().zze().zzb("Loaded invalid unknown value type, ignoring it", java.lang.Integer.valueOf(type));
            return null;
        }
        this.zzu.zzaW().zze().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }
}
