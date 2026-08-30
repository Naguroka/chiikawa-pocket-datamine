package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzl {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final java.util.List zzg;
    private static final java.lang.Object zzb = new java.lang.Object();
    private static final com.google.android.gms.common.util.Clock zze = com.google.android.gms.common.util.DefaultClock.getInstance();
    private static final java.util.Set zzf = new java.util.HashSet(java.util.Arrays.asList(new java.lang.String[0]));

    public zzl() {
        throw null;
    }

    public zzl(java.lang.String str) {
        this.zzg = !zzk() ? new java.util.ArrayList() : java.util.Arrays.asList("network_request_".concat(java.lang.String.valueOf(java.util.UUID.randomUUID().toString())));
    }

    static /* synthetic */ void zza(java.lang.String str, java.lang.String str2, java.util.Map map, byte[] bArr, android.util.JsonWriter jsonWriter) throws java.io.IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(com.google.android.gms.common.util.Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void zzb(int i, java.util.Map map, android.util.JsonWriter jsonWriter) throws java.io.IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzk() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc && zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzl() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    private static synchronized void zzm(java.lang.String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("GMA Debug BEGIN");
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 4000;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("GMA Debug CONTENT ".concat(java.lang.String.valueOf(str.substring(i, java.lang.Math.min(i2, str.length())))));
            i = i2;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi("GMA Debug FINISH");
    }

    private final void zzn(java.lang.String str, com.google.android.gms.ads.internal.util.client.zzk zzkVar) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(com.ironsource.aa.a.d).value(zze.currentTimeMillis());
            jsonWriter.name(androidx.core.app.NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            java.util.Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                jsonWriter.value((java.lang.String) it.next());
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("unable to log", e);
        }
        zzm(stringWriter.toString());
    }

    private final void zzo(final java.lang.String str) {
        zzn("onNetworkRequestError", new com.google.android.gms.ads.internal.util.client.zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzi
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(android.util.JsonWriter jsonWriter) throws java.io.IOException {
                int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
                jsonWriter.name("params").beginObject();
                java.lang.String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void zzp(final java.lang.String str, final java.lang.String str2, final java.util.Map map, final byte[] bArr) {
        zzn("onNetworkRequest", new com.google.android.gms.ads.internal.util.client.zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzg
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(android.util.JsonWriter jsonWriter) throws java.io.IOException {
                com.google.android.gms.ads.internal.util.client.zzl.zza(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzq(final java.util.Map map, final int i) {
        zzn("onNetworkResponse", new com.google.android.gms.ads.internal.util.client.zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzj
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(android.util.JsonWriter jsonWriter) throws java.io.IOException {
                com.google.android.gms.ads.internal.util.client.zzl.zzb(i, map, jsonWriter);
            }
        });
    }

    private static void zzr(android.util.JsonWriter jsonWriter, java.util.Map map) throws java.io.IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (!zzf.contains(str)) {
                if (!(entry.getValue() instanceof java.util.List)) {
                    if (!(entry.getValue() instanceof java.lang.String)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((java.lang.String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (java.lang.String str2 : (java.util.List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void zzc(java.net.HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzk()) {
            zzp(new java.lang.String(httpURLConnection.getURL().toString()), new java.lang.String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new java.util.HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzd(java.lang.String str, java.lang.String str2, java.util.Map map, byte[] bArr) {
        if (zzk()) {
            zzp(str, "GET", map, bArr);
        }
    }

    public final void zze(java.net.HttpURLConnection httpURLConnection, int i) {
        if (zzk()) {
            java.lang.String responseMessage = null;
            zzq(httpURLConnection.getHeaderFields() == null ? null : new java.util.HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (java.io.IOException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Can not get error message from error HttpURLConnection\n".concat(java.lang.String.valueOf(e.getMessage())));
                }
                zzo(responseMessage);
            }
        }
    }

    public final void zzf(java.util.Map map, int i) {
        if (zzk()) {
            zzq(map, i);
            if (i < 200 || i >= 300) {
                zzo(null);
            }
        }
    }

    public final void zzg(java.lang.String str) {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        zzn("onNetworkResponseBody", new com.google.android.gms.ads.internal.util.client.zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(android.util.JsonWriter jsonWriter) throws java.io.IOException {
                int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                java.lang.String strEncode = com.google.android.gms.common.util.Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncode);
                } else {
                    java.lang.String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(strEncode);
                    if (strZzf != null) {
                        jsonWriter.name("bodydigest").value(strZzf);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
