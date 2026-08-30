package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzav extends com.google.android.gms.internal.measurement.zzca {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzaw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzav(com.google.android.gms.measurement.internal.zzaw zzawVar, android.content.Context context, java.lang.String str) {
        super(context, "google_app_measurement.db", null, 1);
        this.zza = zzawVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        com.google.android.gms.measurement.internal.zzaw zzawVar = this.zza;
        com.google.android.gms.measurement.internal.zzou zzouVar = zzawVar.zzn;
        zzawVar.zzu.zzf();
        if (!zzouVar.zzc(3600000L)) {
            throw new android.database.sqlite.SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException unused) {
            com.google.android.gms.measurement.internal.zzaw zzawVar2 = this.zza;
            zzawVar2.zzn.zzb();
            com.google.android.gms.measurement.internal.zzio zzioVar = zzawVar2.zzu;
            zzioVar.zzaW().zze().zza("Opening the database failed, dropping and recreating it");
            zzioVar.zzf();
            if (!zzioVar.zzaT().getDatabasePath("google_app_measurement.db").delete()) {
                zzioVar.zzaW().zze().zzb("Failed to delete corrupted db file", "google_app_measurement.db");
            }
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zzawVar2.zzn.zza();
                return writableDatabase;
            } catch (android.database.sqlite.SQLiteException e) {
                this.zza.zzu.zzaW().zze().zzb("Failed to open freshly created database", e);
                throw e;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.gms.measurement.internal.zzax.zzb(this.zza.zzu.zzaW(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) throws java.lang.Throwable {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza.zzu;
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", com.google.android.gms.measurement.internal.zzaw.zzb);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", com.google.android.gms.measurement.internal.zzaw.zzc);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", com.google.android.gms.measurement.internal.zzaw.zzd);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", com.google.android.gms.measurement.internal.zzaw.zzf);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", com.google.android.gms.measurement.internal.zzaw.zze);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", com.google.android.gms.measurement.internal.zzaw.zzh);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", com.google.android.gms.measurement.internal.zzaw.zzi);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", com.google.android.gms.measurement.internal.zzaw.zzj);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", com.google.android.gms.measurement.internal.zzaw.zzk);
        com.google.android.gms.internal.measurement.zzqr.zzb();
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", com.google.android.gms.measurement.internal.zzaw.zzl);
        com.google.android.gms.measurement.internal.zzax.zza(zzioVar.zzaW(), sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", com.google.android.gms.measurement.internal.zzaw.zza);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
