package com.adjust.sdk.sig;

/* JADX INFO: loaded from: classes3.dex */
public class Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f115a = false;
    public com.adjust.sdk.sig.d b;
    public com.adjust.sdk.sig.a c;
    public com.adjust.sdk.sig.c d;

    public static java.lang.String getVersion() {
        return "3.67.0";
    }

    public final synchronized void a() {
        if (this.f115a) {
            return;
        }
        this.b = new com.adjust.sdk.sig.d();
        this.d = new com.adjust.sdk.sig.c(android.os.Build.VERSION.SDK_INT);
        this.c = new com.adjust.sdk.sig.NativeLibHelper();
        this.f115a = true;
    }

    public synchronized void onResume() {
        a();
        com.adjust.sdk.sig.d dVar = this.b;
        com.adjust.sdk.sig.a aVar = this.c;
        dVar.getClass();
        if (!com.adjust.sdk.sig.d.f117a) {
            ((com.adjust.sdk.sig.NativeLibHelper) aVar).a();
        }
    }

    public synchronized void sign(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
        a();
        com.adjust.sdk.sig.d dVar = this.b;
        com.adjust.sdk.sig.c cVar = this.d;
        com.adjust.sdk.sig.a aVar = this.c;
        dVar.getClass();
        com.adjust.sdk.sig.d.a(context, cVar, aVar, map, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x018e A[Catch: all -> 0x01b9, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:10:0x001b, B:12:0x0032, B:13:0x0053, B:15:0x007f, B:17:0x008c, B:19:0x0094, B:21:0x009c, B:23:0x00a4, B:26:0x00ae, B:27:0x0169, B:28:0x0171, B:30:0x018e, B:31:0x01b0), top: B:37:0x0001 }] */
    public synchronized void sign(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        a();
        com.adjust.sdk.sig.d dVar = this.b;
        com.adjust.sdk.sig.c cVar = this.d;
        com.adjust.sdk.sig.a aVar = this.c;
        dVar.getClass();
        if (map == null || map.isEmpty() || map2 == null || map3 == null) {
            android.util.Log.e("SignerInstance", "sign: One or more parameters are null");
        } else {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.US);
            boolean zEquals = com.adjust.sdk.AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
            if (zEquals) {
                android.util.Log.v("SignerInstance", "SDKv5 Signing all the parameters begin: " + simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
            }
            java.util.HashMap map4 = new java.util.HashMap();
            com.adjust.sdk.sig.d.a(map.keySet(), map, map4);
            java.lang.String str = map2.get("activity_kind");
            java.lang.String str2 = map2.get("client_sdk");
            if ("b".equals(map2.get(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY))) {
                com.adjust.sdk.sig.d.a(map.keySet(), map, map3);
                com.adjust.sdk.sig.d.a(new java.util.HashSet(java.util.Arrays.asList("network_payload", com.json.zb.r)), map2, map3);
                if (zEquals) {
                    android.util.Log.v("SignerInstance", "SDKv5 Signing all the parameters end  : " + simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
                }
            } else {
                com.adjust.sdk.sig.d.a(context, cVar, aVar, map4, str, str2);
                if (map4.containsKey(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE) && map4.containsKey("adj_signing_id") && map4.containsKey("headers_id") && map4.containsKey("algorithm") && map4.containsKey("native_version")) {
                    java.lang.String str3 = (java.lang.String) map4.get("adj_signing_id");
                    java.lang.String str4 = (java.lang.String) map4.get("headers_id");
                    java.lang.String str5 = (java.lang.String) map4.get(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE);
                    java.lang.String str6 = (java.lang.String) map4.get("algorithm");
                    java.lang.String str7 = "algorithm=\"" + str6 + "\"";
                    map3.put("authorization", "Signature " + ("signature=\"" + str5 + "\"") + "," + ("adj_signing_id=\"" + str3 + "\"") + "," + str7 + "," + ("headers_id=\"" + str4 + "\"") + "," + ("native_version=\"" + ((java.lang.String) map4.get("native_version")) + "\""));
                    com.adjust.sdk.sig.d.a(map.keySet(), map, map3);
                    com.adjust.sdk.sig.d.a(new java.util.HashSet(java.util.Arrays.asList("network_payload", com.json.zb.r)), map2, map3);
                    if (zEquals) {
                        android.util.Log.v("SignerInstance", "SDKv5 Signing all the parameters end  : " + simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
                    }
                } else {
                    android.util.Log.e("SignerInstance", "sign: Signature generation failed. Exiting...");
                }
            }
        }
    }
}
