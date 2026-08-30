package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    public static final int zza = java.lang.Runtime.getRuntime().availableProcessors();

    public static int zza(android.content.Intent intent, java.lang.String str) {
        if (intent != null) {
            return zzp(intent.getExtras(), "ProxyBillingActivity");
        }
        zzn("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return 6;
        }
        java.lang.Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzm(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        zzn(str, "Unexpected type for bundle response code: ".concat(java.lang.String.valueOf(obj.getClass().getName())));
        return 6;
    }

    public static android.os.Bundle zzc(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
        return bundle;
    }

    public static android.os.Bundle zzd(com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("RESPONSE_CODE", billingResult.getResponseCode());
        bundle.putString("DEBUG_MESSAGE", billingResult.getDebugMessage());
        bundle.putInt("LOG_REASON", zzieVar.zza());
        return bundle;
    }

    public static android.os.Bundle zze(com.android.billingclient.api.BillingResult billingResult, com.google.android.gms.internal.play_billing.zzie zzieVar, java.lang.String str) {
        android.os.Bundle bundleZzd = zzd(billingResult, zzieVar);
        if (str != null) {
            bundleZzd.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleZzd;
    }

    public static android.os.Bundle zzf(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.lang.String str3, java.lang.String str4, com.google.android.gms.internal.play_billing.zza zzaVar, long j) {
        android.os.Bundle bundle = new android.os.Bundle();
        zzc(bundle, str, str2, j);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new java.util.ArrayList<>(com.google.android.gms.internal.play_billing.zzbt.zzm("subs", "inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new java.util.ArrayList<>(com.google.android.gms.internal.play_billing.zzbt.zzl("inapp")));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (zzaVar.zza) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            com.android.billingclient.api.QueryProductDetailsParams.Product product = (com.android.billingclient.api.QueryProductDetailsParams.Product) arrayList.get(i);
            arrayList2.add(null);
            z |= !android.text.TextUtils.isEmpty(null);
            arrayList4.add(null);
            z2 |= !android.text.TextUtils.isEmpty(null);
            if (product.zzb().equals("first_party")) {
                com.google.android.gms.internal.play_billing.zzbg.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add(null);
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!android.text.TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z2) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static android.os.Bundle zzg(java.lang.String str, java.lang.String str2, long j) {
        android.os.Bundle bundle = new android.os.Bundle();
        zzc(bundle, str, str2, j);
        return bundle;
    }

    public static com.android.billingclient.api.BillingResult zzh(android.content.Intent intent, java.lang.String str) {
        if (intent != null) {
            com.android.billingclient.api.BillingResult.Builder builderNewBuilder = com.android.billingclient.api.BillingResult.newBuilder();
            builderNewBuilder.setResponseCode(zzb(intent.getExtras(), str));
            builderNewBuilder.setDebugMessage(zzj(intent.getExtras(), str));
            return builderNewBuilder.build();
        }
        zzn("BillingHelper", "Got null intent!");
        com.android.billingclient.api.BillingResult.Builder builderNewBuilder2 = com.android.billingclient.api.BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(6);
        builderNewBuilder2.setDebugMessage("An internal error occurred.");
        return builderNewBuilder2.build();
    }

    public static com.android.billingclient.api.InAppMessageResult zzi(android.os.Bundle bundle, java.lang.String str) {
        return bundle == null ? new com.android.billingclient.api.InAppMessageResult(0, null) : new com.android.billingclient.api.InAppMessageResult(zzp(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static java.lang.String zzj(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return "";
        }
        java.lang.Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzm(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        zzn(str, "Unexpected type for debug message: ".concat(java.lang.String.valueOf(obj.getClass().getName())));
        return "";
    }

    public static java.lang.String zzk(int i) {
        return com.google.android.gms.internal.play_billing.zzb.zza(i).toString();
    }

    public static java.util.List zzl(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            com.android.billingclient.api.Purchase purchaseZzq = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseZzq == null) {
                zzm("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseZzq);
        } else {
            zzm("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                com.android.billingclient.api.Purchase purchaseZzq2 = zzq(stringArrayList.get(i), stringArrayList2.get(i));
                if (purchaseZzq2 != null) {
                    arrayList.add(purchaseZzq2);
                }
            }
        }
        return arrayList;
    }

    public static void zzm(java.lang.String str, java.lang.String str2) {
        if (android.util.Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                android.util.Log.v(str, str2);
                return;
            }
            int i = androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            while (!str2.isEmpty() && i > 0) {
                int iMin = java.lang.Math.min(str2.length(), java.lang.Math.min(4000, i));
                android.util.Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    public static void zzn(java.lang.String str, java.lang.String str2) {
        if (android.util.Log.isLoggable(str, 5)) {
            android.util.Log.w(str, str2);
        }
    }

    public static void zzo(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        try {
            if (android.util.Log.isLoggable(str, 5)) {
                if (th == null) {
                    android.util.Log.w(str, str2);
                } else {
                    android.util.Log.w(str, str2, th);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private static int zzp(android.os.Bundle bundle, java.lang.String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzn(str, "Unexpected null bundle received!");
        return 0;
    }

    private static com.android.billingclient.api.Purchase zzq(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            zzm("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new com.android.billingclient.api.Purchase(str, str2);
        } catch (org.json.JSONException e) {
            zzn("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
