package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzean implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzeao zzb;

    zzean(com.google.android.gms.internal.ads.zzeao zzeaoVar, boolean z) {
        this.zza = z;
        this.zzb = zzeaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.util.List listEmptyList;
        java.util.List listAsList;
        final java.util.ArrayList arrayList;
        java.util.Iterator it;
        byte b;
        com.google.android.gms.internal.ads.zzbbq.zzd.zza zzaVar;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (this.zzb.zzf()) {
            return;
        }
        android.os.Bundle bundle = zzcuvVar.zza;
        java.lang.Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof java.util.List)) {
            if (obj2 instanceof java.lang.String[]) {
                listAsList = java.util.Arrays.asList((java.lang.String[]) obj2);
            } else {
                listEmptyList = java.util.Collections.emptyList();
            }
            arrayList = new java.util.ArrayList();
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                switch ((java.lang.String) it.next()) {
                    case "banner":
                        b = 0;
                        break;
                    case "native":
                        b = 2;
                        break;
                    case "rewarded":
                        b = 3;
                        break;
                    case "interstitial":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != 0) {
                    zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.BANNER;
                } else if (b != 1) {
                    zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.INTERSTITIAL;
                } else if (b != 2) {
                    zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.NATIVE_APP_INSTALL;
                } else if (b != 3) {
                    zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaVar);
            }
            final com.google.android.gms.internal.ads.zzbbq.zzaf.zzd zzdVarZzb = com.google.android.gms.internal.ads.zzeao.zzb(this.zzb, bundle);
            final com.google.android.gms.internal.ads.zzbbq.zzab zzabVarZza = com.google.android.gms.internal.ads.zzeao.zza(this.zzb, bundle);
            com.google.android.gms.internal.ads.zzeao zzeaoVar = this.zzb;
            final boolean z = this.zza;
            zzeaoVar.zza.zza(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzeam
                @Override // com.google.android.gms.internal.ads.zzffr
                public final java.lang.Object zza(java.lang.Object obj3) {
                    com.google.android.gms.internal.ads.zzean zzeanVar = this.zza;
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj3;
                    if (zzeanVar.zzb.zzf()) {
                        return null;
                    }
                    com.google.android.gms.internal.ads.zzbbq.zzaf.zzd zzdVar = zzdVarZzb;
                    com.google.android.gms.internal.ads.zzbbq.zzab zzabVar = zzabVarZza;
                    java.util.ArrayList arrayList2 = arrayList;
                    boolean z2 = z;
                    byte[] bArrZze = com.google.android.gms.internal.ads.zzeao.zze(zzeanVar.zzb, z2, arrayList2, zzabVar, zzdVar);
                    com.google.android.gms.internal.ads.zzear.zzf(sQLiteDatabase, z2, true);
                    com.google.android.gms.internal.ads.zzear.zzc(sQLiteDatabase, zzeanVar.zzb.zzf.zzd(), bArrZze);
                    return null;
                }
            });
        }
        listAsList = (java.util.List) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(listAsList.size());
        for (java.lang.Object obj3 : listAsList) {
            if (obj3 instanceof java.lang.String) {
                arrayList2.add((java.lang.String) obj3);
            }
        }
        listEmptyList = java.util.Collections.unmodifiableList(arrayList2);
        arrayList = new java.util.ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
            switch ((java.lang.String) it.next()) {
                case -1396342996:
                    if (!r1.equals("banner")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case -1052618729:
                    if (!r1.equals(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE)) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -239580146:
                    if (!r1.equals("rewarded")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 604727084:
                    if (!r1.equals("interstitial")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.BANNER;
            } else if (b != 1) {
                zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.INTERSTITIAL;
            } else if (b != 2) {
                zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.NATIVE_APP_INSTALL;
            } else if (b != 3) {
                zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaVar = com.google.android.gms.internal.ads.zzbbq.zzd.zza.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaVar);
        }
        final com.google.android.gms.internal.ads.zzbbq.zzaf.zzd zzdVarZzb2 = com.google.android.gms.internal.ads.zzeao.zzb(this.zzb, bundle);
        final com.google.android.gms.internal.ads.zzbbq.zzab zzabVarZza2 = com.google.android.gms.internal.ads.zzeao.zza(this.zzb, bundle);
        com.google.android.gms.internal.ads.zzeao zzeaoVar2 = this.zzb;
        final boolean z2 = this.zza;
        zzeaoVar2.zza.zza(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzeam
            @Override // com.google.android.gms.internal.ads.zzffr
            public final java.lang.Object zza(java.lang.Object obj4) {
                com.google.android.gms.internal.ads.zzean zzeanVar = this.zza;
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj4;
                if (zzeanVar.zzb.zzf()) {
                    return null;
                }
                com.google.android.gms.internal.ads.zzbbq.zzaf.zzd zzdVar = zzdVarZzb2;
                com.google.android.gms.internal.ads.zzbbq.zzab zzabVar = zzabVarZza2;
                java.util.ArrayList arrayList3 = arrayList;
                boolean z3 = z2;
                byte[] bArrZze = com.google.android.gms.internal.ads.zzeao.zze(zzeanVar.zzb, z3, arrayList3, zzabVar, zzdVar);
                com.google.android.gms.internal.ads.zzear.zzf(sQLiteDatabase, z3, true);
                com.google.android.gms.internal.ads.zzear.zzc(sQLiteDatabase, zzeanVar.zzb.zzf.zzd(), bArrZze);
                return null;
            }
        });
    }
}
