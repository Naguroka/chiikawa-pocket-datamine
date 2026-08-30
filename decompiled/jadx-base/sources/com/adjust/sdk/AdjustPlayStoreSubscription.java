package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustPlayStoreSubscription {
    private static com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private java.util.Map<java.lang.String, java.lang.String> callbackParameters;
    private java.lang.String currency;
    private java.lang.String orderId;
    private java.util.Map<java.lang.String, java.lang.String> partnerParameters;
    private long price;
    private long purchaseTime = -1;
    private java.lang.String purchaseToken;
    private java.lang.String signature;
    private java.lang.String sku;

    public AdjustPlayStoreSubscription(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.price = j;
        this.currency = str;
        this.sku = str2;
        this.orderId = str3;
        this.signature = str4;
        this.purchaseToken = str5;
    }

    public void addCallbackParameter(java.lang.String str, java.lang.String str2) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.y8.h.W, "Callback") && com.adjust.sdk.Util.isValidParameter(str2, "value", "Callback")) {
            if (this.callbackParameters == null) {
                this.callbackParameters = new java.util.LinkedHashMap();
            }
            if (this.callbackParameters.put(str, str2) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    public void addPartnerParameter(java.lang.String str, java.lang.String str2) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.y8.h.W, "Partner") && com.adjust.sdk.Util.isValidParameter(str2, "value", "Partner")) {
            if (this.partnerParameters == null) {
                this.partnerParameters = new java.util.LinkedHashMap();
            }
            if (this.partnerParameters.put(str, str2) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getCallbackParameters() {
        return this.callbackParameters;
    }

    public java.lang.String getCurrency() {
        return this.currency;
    }

    public java.lang.String getOrderId() {
        return this.orderId;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPartnerParameters() {
        return this.partnerParameters;
    }

    public long getPrice() {
        return this.price;
    }

    public long getPurchaseTime() {
        return this.purchaseTime;
    }

    public java.lang.String getPurchaseToken() {
        return this.purchaseToken;
    }

    public java.lang.String getSignature() {
        return this.signature;
    }

    public java.lang.String getSku() {
        return this.sku;
    }

    public void setPurchaseTime(long j) {
        this.purchaseTime = j;
    }
}
