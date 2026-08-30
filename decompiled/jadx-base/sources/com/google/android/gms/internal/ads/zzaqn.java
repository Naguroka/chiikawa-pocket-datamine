package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaqn extends com.google.android.gms.internal.ads.zzaqa {
    public zzaqn() {
        throw null;
    }

    public zzaqn(com.google.android.gms.internal.ads.zzaqm zzaqmVar, javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
    }

    static java.util.List zzb(java.util.Map map) {
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.google.android.gms.internal.ads.zzape((java.lang.String) entry.getKey(), (java.lang.String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final com.google.android.gms.internal.ads.zzaqk zza(com.google.android.gms.internal.ads.zzapm zzapmVar, java.util.Map map) throws java.lang.Throwable {
        java.lang.String strZzk = zzapmVar.zzk();
        java.util.HashMap map2 = new java.util.HashMap();
        map2.putAll(map);
        map2.putAll(zzapmVar.zzl());
        java.net.URL url = new java.net.URL(strZzk);
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(java.net.HttpURLConnection.getFollowRedirects());
        int iZzb = zzapmVar.zzb();
        httpURLConnection.setConnectTimeout(iZzb);
        httpURLConnection.setReadTimeout(iZzb);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (java.lang.String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (java.lang.String) map2.get(str));
            }
            if (zzapmVar.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrZzx = zzapmVar.zzx();
                if (bArrZzx != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrZzx);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new java.io.IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzapmVar.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                com.google.android.gms.internal.ads.zzaqk zzaqkVar = new com.google.android.gms.internal.ads.zzaqk(responseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzaqkVar;
            }
            try {
                return new com.google.android.gms.internal.ads.zzaqk(responseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new com.google.android.gms.internal.ads.zzaql(httpURLConnection));
            } catch (java.lang.Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
