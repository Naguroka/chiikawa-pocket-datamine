package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbr {
    public final java.util.List zza;
    public final java.lang.String zzb;
    public final int zzc;
    public final int zzd;
    public final java.lang.String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final java.lang.String zzi;
    public final com.google.android.gms.internal.ads.zzfbq zzj;
    public final android.os.Bundle zzk;
    public final java.lang.String zzl;
    public final java.lang.String zzm;
    public final java.lang.String zzn;
    public final org.json.JSONObject zzo;
    public final org.json.JSONObject zzp;
    public final java.lang.String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    zzfbr(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, org.json.JSONException, java.io.IOException, java.lang.NumberFormatException {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        android.os.Bundle bundle = new android.os.Bundle();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jsonReader.beginObject();
        java.lang.String strNextString = "";
        java.lang.String strNextString2 = "";
        java.lang.String strNextString3 = strNextString2;
        java.lang.String strNextString4 = strNextString3;
        java.lang.String strNextString5 = strNextString4;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        com.google.android.gms.internal.ads.zzfbq zzfbqVar = null;
        long jZza = -1;
        long jZza2 = -1;
        long jNextLong = 0;
        int iNextInt3 = -1;
        int iMax = 1;
        java.lang.String strNextString6 = strNextString5;
        java.lang.String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if (java.util.Objects.equals(strNextName, "nofill_urls")) {
                listEmptyList = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (java.util.Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                java.lang.String str = strNextString3;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzig)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == android.util.JsonToken.BEGIN_OBJECT) {
                    zzfbqVar = new com.google.android.gms.internal.ads.zzfbq(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkm)).booleanValue() && java.util.Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgE)).booleanValue()) {
                            try {
                                try {
                                    android.os.Bundle bundleZza = com.google.android.gms.ads.internal.util.zzbs.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                                    if (bundleZza != null) {
                                        bundle = bundleZza;
                                    }
                                } catch (java.lang.IllegalStateException unused) {
                                    jsonReader.skipValue();
                                }
                            } catch (java.io.IOException | org.json.JSONException unused2) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjg)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(strNextName)) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjg)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjh)).booleanValue() && java.util.Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else {
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjh)).booleanValue() && java.util.Objects.equals(strNextName, "adResponseHeaders")) {
                                jSONObject = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                            } else if (java.util.Objects.equals(strNextName, "max_parallel_renderers")) {
                                iMax = java.lang.Math.max(1, jsonReader.nextInt());
                            } else {
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjo)).booleanValue() && java.util.Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                    jSONObject2 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                                } else {
                                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcl)).booleanValue() && java.util.Objects.equals(strNextName, "latency_extras")) {
                                        try {
                                            android.os.Bundle bundleZza2 = com.google.android.gms.ads.internal.util.zzbs.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                                            if (bundleZza2 != null) {
                                                jZza2 = zza(bundleZza2.getDouble("start_time"));
                                                jZza = zza(bundleZza2.getDouble("end_time"));
                                            }
                                        } catch (java.lang.IllegalStateException unused3) {
                                            jsonReader.skipValue();
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                            }
                        }
                    }
                }
                strNextString3 = str;
            }
        }
        java.lang.String str2 = strNextString3;
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzc = iNextInt;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzber.zzc.zze()).booleanValue()) {
            this.zzd = -1;
        } else if (((java.lang.Long) com.google.android.gms.internal.ads.zzbdz.zza.zze()).longValue() > -1) {
            this.zzd = ((java.lang.Long) com.google.android.gms.internal.ads.zzbdz.zza.zze()).intValue();
        } else {
            this.zzd = iNextInt3;
        }
        this.zzb = strNextString;
        this.zze = strNextString6;
        this.zzf = iNextInt2;
        this.zzg = jNextLong;
        this.zzj = zzfbqVar;
        this.zzh = zNextBoolean;
        this.zzi = strNextString7;
        this.zzk = bundle;
        this.zzl = strNextString4;
        this.zzm = strNextString5;
        this.zzn = strNextString2;
        this.zzo = jSONObject;
        this.zzp = jSONObject2;
        this.zzq = str2;
        this.zzr = ((java.lang.Long) com.google.android.gms.internal.ads.zzbep.zza.zze()).longValue() > 0 ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbep.zza.zze()).intValue() : iMax;
        this.zzs = jZza2;
        this.zzt = jZza;
    }

    private static final long zza(double d) {
        if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d;
    }
}
