package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeax {
    private final com.google.android.gms.internal.ads.zzbbj zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzeac zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;

    public zzeax(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbbj zzbbjVar, com.google.android.gms.internal.ads.zzeac zzeacVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbbjVar;
        this.zzc = zzeacVar;
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzeau
                @Override // com.google.android.gms.internal.ads.zzffr
                public final java.lang.Object zza(java.lang.Object obj) throws java.lang.Exception {
                    this.zza.zza(z, (android.database.sqlite.SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in offline signals database startup: ".concat(java.lang.String.valueOf(e.getMessage())));
        }
    }

    final /* synthetic */ java.lang.Void zza(boolean z, android.database.sqlite.SQLiteDatabase sQLiteDatabase) throws java.lang.Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.database.Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new java.lang.String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(com.google.android.gms.internal.ads.zzbbq.zzaf.zza.zzx(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (com.google.android.gms.internal.ads.zzgyg e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(e.getMessage());
                }
            }
            cursorQuery.close();
            android.content.Context context = this.zzb;
            com.google.android.gms.internal.ads.zzbbq.zzaf.zzc zzcVarZzi = com.google.android.gms.internal.ads.zzbbq.zzaf.zzi();
            zzcVarZzi.zzv(context.getPackageName());
            zzcVarZzi.zzy(android.os.Build.MODEL);
            zzcVarZzi.zzA(com.google.android.gms.internal.ads.zzear.zza(sQLiteDatabase, 0));
            zzcVarZzi.zzh(arrayList);
            zzcVarZzi.zzE(com.google.android.gms.internal.ads.zzear.zza(sQLiteDatabase, 1));
            zzcVarZzi.zzx(com.google.android.gms.internal.ads.zzear.zza(sQLiteDatabase, 3));
            zzcVarZzi.zzF(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
            zzcVarZzi.zzB(com.google.android.gms.internal.ads.zzear.zzb(sQLiteDatabase, 2));
            final com.google.android.gms.internal.ads.zzbbq.zzaf zzafVarZzbr = zzcVarZzi.zzbr();
            int size = arrayList.size();
            long jZze = 0;
            for (int i = 0; i < size; i++) {
                com.google.android.gms.internal.ads.zzbbq.zzaf.zza zzaVar = (com.google.android.gms.internal.ads.zzbbq.zzaf.zza) arrayList.get(i);
                if (zzaVar.zzk() == com.google.android.gms.internal.ads.zzbbq.zzq.ENUM_TRUE && zzaVar.zze() > jZze) {
                    jZze = zzaVar.zze();
                }
            }
            if (jZze != 0) {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("value", java.lang.Long.valueOf(jZze));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzb(new com.google.android.gms.internal.ads.zzbbi() { // from class: com.google.android.gms.internal.ads.zzeav
                @Override // com.google.android.gms.internal.ads.zzbbi
                public final void zza(com.google.android.gms.internal.ads.zzbbq.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzafVarZzbr);
                }
            });
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzd;
            com.google.android.gms.internal.ads.zzbbq.zzar.zza zzaVarZzd = com.google.android.gms.internal.ads.zzbbq.zzar.zzd();
            zzaVarZzd.zzg(versionInfoParcel.buddyApkVersion);
            zzaVarZzd.zzi(this.zzd.clientJarVersion);
            zzaVarZzd.zzh(true != this.zzd.isClientJar ? 2 : 0);
            final com.google.android.gms.internal.ads.zzbbq.zzar zzarVarZzbr = zzaVarZzd.zzbr();
            this.zza.zzb(new com.google.android.gms.internal.ads.zzbbi() { // from class: com.google.android.gms.internal.ads.zzeaw
                @Override // com.google.android.gms.internal.ads.zzbbi
                public final void zza(com.google.android.gms.internal.ads.zzbbq.zzt.zza zzaVar2) {
                    com.google.android.gms.internal.ads.zzbbq.zzm.zza zzaVarZzbM = zzaVar2.zzg().zzbM();
                    zzaVarZzbM.zzw(zzarVarZzbr);
                    zzaVar2.zzK(zzaVarZzbM);
                }
            });
            this.zza.zzc(com.google.android.gms.games.GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
            com.google.android.gms.internal.ads.zzear.zze(sQLiteDatabase);
        }
        return null;
    }
}
