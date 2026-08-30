package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbz {
    public final java.util.List zza;
    public final com.google.android.gms.internal.ads.zzfbr zzb;
    public final java.util.List zzc;
    public final com.google.android.gms.internal.ads.zzbvk zzd;

    zzfbz(android.util.JsonReader jsonReader, com.google.android.gms.internal.ads.zzbvk zzbvkVar) throws java.lang.IllegalStateException, org.json.JSONException, java.io.IOException, java.lang.NumberFormatException, java.lang.AssertionError {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        this.zzd = zzbvkVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() && zzbvkVar != null && (bundle2 = zzbvkVar.zzm) != null) {
            bundle2.putLong(com.google.android.gms.internal.ads.zzdre.SERVER_RESPONSE_PARSE_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        java.util.List listEmptyList = java.util.Collections.emptyList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginObject();
        com.google.android.gms.internal.ads.zzfbr zzfbrVar = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    java.lang.String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        listEmptyList = new java.util.ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            listEmptyList.add(new com.google.android.gms.internal.ads.zzfbo(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfbrVar = new com.google.android.gms.internal.ads.zzfbr(jsonReader);
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcl)).booleanValue() && zzbvkVar != null && (bundle = zzbvkVar.zzm) != null) {
                            bundle.putLong(com.google.android.gms.internal.ads.zzdre.NORMALIZATION_AD_RESPONSE_START.zza(), zzfbrVar.zzs);
                            zzbvkVar.zzm.putLong(com.google.android.gms.internal.ads.zzdre.NORMALIZATION_AD_RESPONSE_END.zza(), zzfbrVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    java.lang.String strNextString = null;
                    org.json.JSONObject jSONObjectZzi = null;
                    while (jsonReader.hasNext()) {
                        java.lang.String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new com.google.android.gms.internal.ads.zzfby(strNextString, jSONObjectZzi));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = listEmptyList;
        this.zzb = zzfbrVar == null ? new com.google.android.gms.internal.ads.zzfbr(new android.util.JsonReader(new java.io.StringReader(com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON))) : zzfbrVar;
    }

    public static com.google.android.gms.internal.ads.zzfbz zza(java.io.Reader reader, com.google.android.gms.internal.ads.zzbvk zzbvkVar) throws com.google.android.gms.internal.ads.zzfbs {
        try {
            try {
                com.google.android.gms.internal.ads.zzfbz zzfbzVar = new com.google.android.gms.internal.ads.zzfbz(new android.util.JsonReader(reader), zzbvkVar);
                com.google.android.gms.common.util.IOUtils.closeQuietly(reader);
                return zzfbzVar;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.common.util.IOUtils.closeQuietly(reader);
                throw th;
            }
        } catch (java.io.IOException | java.lang.AssertionError | java.lang.IllegalStateException | java.lang.NumberFormatException | org.json.JSONException e) {
            throw new com.google.android.gms.internal.ads.zzfbs("unable to parse ServerResponse", e);
        }
    }
}
