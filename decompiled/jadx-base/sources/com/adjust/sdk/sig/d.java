package com.adjust.sdk.sig;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f117a = false;

    public static void a(java.util.Set set, java.util.Map map, java.util.Map map2) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (java.lang.String) map.get(str));
            }
        }
    }

    public static void a(android.content.Context context, com.adjust.sdk.sig.c cVar, com.adjust.sdk.sig.a aVar, java.util.Map map, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        byte[] bArrA;
        if (f117a) {
            android.util.Log.e("SignerInstance", "sign: library received error. It has locked down");
            return;
        }
        if (map == null || map.isEmpty() || str == null || str2 == null) {
            android.util.Log.e("SignerInstance", "sign: One or more parameters are null");
            return;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.US);
        boolean zEquals = com.adjust.sdk.AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
        if (zEquals) {
            android.util.Log.v("SignerInstance", "Signing all the parameters begin: " + simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i = 2;
        while (true) {
            bArrA = null;
            if (i <= 0) {
                break;
            }
            try {
                cVar.a(context);
                bArrA = cVar.a(context, map.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));
                break;
            } catch (com.adjust.sdk.sig.b e) {
                android.util.Log.e("SignerInstance", "sign: Api is less than JellyBean-4-18");
                f117a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e;
            } catch (java.security.InvalidKeyException e2) {
                e = e2;
            } catch (java.security.UnrecoverableKeyException e3) {
                e = e3;
            } catch (java.lang.Exception e4) {
                android.util.Log.e("SignerInstance", "sign: Received an Exception: " + e4.getMessage(), e4);
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e4;
            }
            android.util.Log.e("SignerInstance", "sign: Received a retriable exception: " + e.getMessage(), e);
            android.util.Log.e("SignerInstance", "sign: Attempting retry #" + i);
            i--;
            cVar.getClass();
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry("key2");
            context.getSharedPreferences("adjust_keys", 0).edit().remove("encrypted_key").apply();
        }
        if (i == 0) {
            f117a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        if (zEquals) {
            android.util.Log.v("SignerInstance", "Calling native begin: " + simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
        }
        byte[] bArrA2 = ((com.adjust.sdk.sig.NativeLibHelper) aVar).a(context, map, bArrA, cVar.f116a);
        if (zEquals) {
            android.util.Log.v("SignerInstance", "Calling native end  : " + simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
        }
        if (bArrA2 == null) {
            android.util.Log.e("SignerInstance", "sign: Returned an null signature. Exiting...");
            map.remove("activity_kind");
            map.remove("client_sdk");
        } else {
            map.put(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, android.util.Base64.encodeToString(bArrA2, 2));
            map.remove("activity_kind");
            map.remove("client_sdk");
            if (zEquals) {
                android.util.Log.v("SignerInstance", "Signing all the parameters end  : " + simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
            }
        }
    }
}
