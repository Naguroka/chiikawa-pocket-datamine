package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdte extends com.google.android.gms.internal.ads.zzbkq {
    private final com.google.android.gms.internal.ads.zzdth zza;
    private final com.google.android.gms.internal.ads.zzdtc zzb;
    private final java.util.Map zzc = new java.util.HashMap();

    zzdte(com.google.android.gms.internal.ads.zzdth zzdthVar, com.google.android.gms.internal.ads.zzdtc zzdtcVar) {
        this.zza = zzdthVar;
        this.zzb = zzdtcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    private static com.google.android.gms.ads.internal.client.zzm zzc(java.util.Map map) {
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        java.lang.String str = (java.lang.String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(android.net.Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        android.os.Bundle bundle = new android.os.Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zznVar.zzb(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zznVar.zze(arrayList);
                        break;
                    case "isTestDevice":
                        zznVar.zzd(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzh(0);
                            break;
                        } else {
                            zznVar.zzh(1);
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzi(0);
                            break;
                        } else {
                            zznVar.zzi(1);
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        java.lang.String strNextString = jsonReader.nextString();
                        if (!com.google.android.gms.ads.RequestConfiguration.zza.contains(strNextString)) {
                            break;
                        } else {
                            zznVar.zzf(strNextString);
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        zznVar.zzc(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (java.io.IOException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zzmVarZza = zznVar.zza();
        android.os.Bundle bundle2 = zzmVarZza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zzmVarZza.zzc;
            zzmVarZza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zzmVarZza.zza, zzmVarZza.zzb, bundle2, zzmVarZza.zzd, zzmVarZza.zze, zzmVarZza.zzf, zzmVarZza.zzg, zzmVarZza.zzh, zzmVarZza.zzi, zzmVarZza.zzj, zzmVarZza.zzk, zzmVarZza.zzl, zzmVarZza.zzm, zzmVarZza.zzn, zzmVarZza.zzo, zzmVarZza.zzp, zzmVarZza.zzq, zzmVarZza.zzr, zzmVarZza.zzs, zzmVarZza.zzt, zzmVarZza.zzu, zzmVarZza.zzv, zzmVarZza.zzw, zzmVarZza.zzx, zzmVarZza.zzy, zzmVarZza.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    @Override // com.google.android.gms.internal.ads.zzbkr
    public final void zzf(java.lang.String str) throws android.os.RemoteException {
        byte b;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjN)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(java.lang.String.valueOf(str)));
            android.net.Uri uri = android.net.Uri.parse(str);
            com.google.android.gms.ads.internal.zzv.zzq();
            java.util.Map mapZzP = com.google.android.gms.ads.internal.util.zzs.zzP(uri);
            java.lang.String str2 = (java.lang.String) mapZzP.get("action");
            if (android.text.TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (b == 1) {
                java.util.Iterator it = this.zzc.values().iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.internal.ads.zzdsx) it.next()).zza();
                }
                this.zzc.clear();
                return;
            }
            java.lang.String str3 = (java.lang.String) mapZzP.get("obj_id");
            try {
                long j = java.lang.Long.parseLong((java.lang.String) java.util.Objects.requireNonNull(str3));
                switch (str2) {
                    case "create_interstitial_ad":
                        if (this.zzc.size() >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjO)).intValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(j);
                            break;
                        } else {
                            java.util.Map map = this.zzc;
                            java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                            if (!map.containsKey(lValueOf)) {
                                java.lang.String str4 = (java.lang.String) mapZzP.get("ad_unit");
                                if (!android.text.TextUtils.isEmpty(str4)) {
                                    com.google.android.gms.internal.ads.zzdsy zzdsyVarZzb = this.zza.zzb();
                                    zzdsyVarZzb.zzb(j);
                                    zzdsyVarZzb.zza(str4);
                                    this.zzc.put(lValueOf, zzdsyVarZzb.zzc().zza());
                                    this.zzb.zzh(j);
                                    com.google.android.gms.ads.internal.util.zze.zza("Created H5 interstitial #" + j + " with ad unit " + str4);
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(j);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                            }
                            break;
                        }
                        break;
                    case "load_interstitial_ad":
                        com.google.android.gms.internal.ads.zzdsx zzdsxVar = (com.google.android.gms.internal.ads.zzdsx) this.zzc.get(java.lang.Long.valueOf(j));
                        if (zzdsxVar == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzf(j);
                            break;
                        } else {
                            zzdsxVar.zzb(zzc(mapZzP));
                            break;
                        }
                        break;
                    case "show_interstitial_ad":
                        com.google.android.gms.internal.ads.zzdsx zzdsxVar2 = (com.google.android.gms.internal.ads.zzdsx) this.zzc.get(java.lang.Long.valueOf(j));
                        if (zzdsxVar2 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzf(j);
                            break;
                        } else {
                            zzdsxVar2.zzc();
                            break;
                        }
                        break;
                    case "create_rewarded_ad":
                        if (this.zzc.size() >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjO)).intValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(j);
                            break;
                        } else {
                            java.util.Map map2 = this.zzc;
                            java.lang.Long lValueOf2 = java.lang.Long.valueOf(j);
                            if (!map2.containsKey(lValueOf2)) {
                                java.lang.String str5 = (java.lang.String) mapZzP.get("ad_unit");
                                if (!android.text.TextUtils.isEmpty(str5)) {
                                    com.google.android.gms.internal.ads.zzdsy zzdsyVarZzb2 = this.zza.zzb();
                                    zzdsyVarZzb2.zzb(j);
                                    zzdsyVarZzb2.zza(str5);
                                    this.zzc.put(lValueOf2, zzdsyVarZzb2.zzc().zzb());
                                    this.zzb.zzh(j);
                                    com.google.android.gms.ads.internal.util.zze.zza("Created H5 rewarded #" + j + " with ad unit " + str5);
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(j);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                            }
                            break;
                        }
                        break;
                    case "load_rewarded_ad":
                        com.google.android.gms.internal.ads.zzdsx zzdsxVar3 = (com.google.android.gms.internal.ads.zzdsx) this.zzc.get(java.lang.Long.valueOf(j));
                        if (zzdsxVar3 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzq(j);
                            break;
                        } else {
                            zzdsxVar3.zzb(zzc(mapZzP));
                            break;
                        }
                        break;
                    case "show_rewarded_ad":
                        com.google.android.gms.internal.ads.zzdsx zzdsxVar4 = (com.google.android.gms.internal.ads.zzdsx) this.zzc.get(java.lang.Long.valueOf(j));
                        if (zzdsxVar4 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzq(j);
                            break;
                        } else {
                            zzdsxVar4.zzc();
                            break;
                        }
                        break;
                    case "dispose":
                        java.util.Map map3 = this.zzc;
                        java.lang.Long lValueOf3 = java.lang.Long.valueOf(j);
                        com.google.android.gms.internal.ads.zzdsx zzdsxVar5 = (com.google.android.gms.internal.ads.zzdsx) map3.get(lValueOf3);
                        if (zzdsxVar5 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not dispose H5 ad, object ID does not exist");
                            break;
                        } else {
                            zzdsxVar5.zza();
                            this.zzc.remove(lValueOf3);
                            com.google.android.gms.ads.internal.util.zze.zza("Disposed H5 ad #" + j);
                            break;
                        }
                        break;
                    default:
                        com.google.android.gms.ads.internal.util.client.zzo.zze("H5 gmsg contained invalid action: ".concat(java.lang.String.valueOf(str2)));
                        break;
                }
            } catch (java.lang.NullPointerException | java.lang.NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("H5 gmsg did not contain a valid object id: ".concat(java.lang.String.valueOf(str3)));
            }
        }
    }
}
