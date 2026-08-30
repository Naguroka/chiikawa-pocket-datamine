package com.unity3d.ads.metadata;

/* JADX INFO: loaded from: classes6.dex */
public class InAppPurchaseMetaData extends com.unity3d.ads.metadata.MetaData {
    public static final java.lang.String IAP_KEY = "iap";
    public static final java.lang.String KEY_CURRENCY = "currency";
    public static final java.lang.String KEY_PRICE = "price";
    public static final java.lang.String KEY_PRODUCT_ID = "productId";
    public static final java.lang.String KEY_RECEIPT_PURCHASE_DATA = "receiptPurchaseData";
    public static final java.lang.String KEY_SIGNATURE = "signature";

    public InAppPurchaseMetaData(android.content.Context context) {
        super(context);
    }

    public void setProductId(java.lang.String str) {
        set(KEY_PRODUCT_ID, str);
    }

    public void setPrice(java.lang.Double d) {
        set("price", d);
    }

    public void setCurrency(java.lang.String str) {
        set("currency", str);
    }

    public void setReceiptPurchaseData(java.lang.String str) {
        set(KEY_RECEIPT_PURCHASE_DATA, str);
    }

    public void setSignature(java.lang.String str) {
        set(KEY_SIGNATURE, str);
    }

    @Override // com.unity3d.ads.metadata.MetaData, com.unity3d.services.core.misc.JsonStorage
    public synchronized boolean set(java.lang.String str, java.lang.Object obj) {
        return setRaw(str, obj);
    }

    @Override // com.unity3d.ads.metadata.MetaData
    public void commit() {
        org.json.JSONArray jSONArray;
        if (com.unity3d.services.core.device.StorageManager.init(this._context)) {
            com.unity3d.services.core.device.Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PUBLIC);
            if (getData() == null || storage == null) {
                return;
            }
            java.lang.Object obj = storage.get("iap.purchases");
            if (obj != null) {
                try {
                    jSONArray = (org.json.JSONArray) obj;
                } catch (java.lang.Exception unused) {
                    com.unity3d.services.core.log.DeviceLog.error("Invalid object type for purchases");
                    jSONArray = null;
                }
            } else {
                jSONArray = null;
            }
            if (jSONArray == null) {
                jSONArray = new org.json.JSONArray();
            }
            org.json.JSONObject data = getData();
            try {
                data.put("ts", java.lang.System.currentTimeMillis());
                jSONArray.put(data);
                storage.set("iap.purchases", jSONArray);
                storage.writeStorage();
                storage.sendEvent(com.unity3d.services.core.device.StorageEvent.SET, storage.get("iap.purchases"));
                return;
            } catch (org.json.JSONException unused2) {
                com.unity3d.services.core.log.DeviceLog.error("Error constructing purchase object");
                return;
            }
        }
        com.unity3d.services.core.log.DeviceLog.error("Unity Ads could not commit metadata due to storage error or the data is null");
    }
}
