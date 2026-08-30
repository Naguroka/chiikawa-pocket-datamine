package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustEvent {
    private static com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    java.lang.String callbackId;
    java.util.Map<java.lang.String, java.lang.String> callbackParameters;
    java.lang.String currency;
    java.lang.String deduplicationId;
    java.lang.String eventToken;
    java.lang.String orderId;
    java.util.Map<java.lang.String, java.lang.String> partnerParameters;
    java.lang.String productId;
    java.lang.String purchaseToken;
    java.lang.Double revenue;

    public AdjustEvent(java.lang.String str) {
        if (checkEventToken(str, logger)) {
            this.eventToken = str;
        }
    }

    private static boolean checkEventToken(java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        if (str == null) {
            iLogger.error("Missing Event Token", new java.lang.Object[0]);
            return false;
        }
        if (str.length() > 0) {
            return true;
        }
        iLogger.error("Event Token can't be empty", new java.lang.Object[0]);
        return false;
    }

    private boolean checkRevenue(java.lang.Double d, java.lang.String str) {
        if (d != null) {
            if (d.doubleValue() < 0.0d) {
                logger.error("Invalid amount %.5f", d);
                return false;
            }
            if (str == null) {
                logger.error("Currency must be set with revenue", new java.lang.Object[0]);
                return false;
            }
            if (str.equals("")) {
                logger.error("Currency is empty", new java.lang.Object[0]);
                return false;
            }
        } else if (str != null) {
            logger.error("Revenue must be set with currency", new java.lang.Object[0]);
            return false;
        }
        return true;
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

    public java.lang.String getCallbackId() {
        return this.callbackId;
    }

    public java.util.Map<java.lang.String, java.lang.String> getCallbackParameters() {
        return this.callbackParameters;
    }

    public java.lang.String getCurrency() {
        return this.currency;
    }

    public java.lang.String getDeduplicationId() {
        return this.deduplicationId;
    }

    public java.lang.String getEventToken() {
        return this.eventToken;
    }

    public java.lang.String getOrderId() {
        return this.orderId;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPartnerParameters() {
        return this.partnerParameters;
    }

    public java.lang.String getProductId() {
        return this.productId;
    }

    public java.lang.String getPurchaseToken() {
        return this.purchaseToken;
    }

    public java.lang.Double getRevenue() {
        return this.revenue;
    }

    public boolean isValid() {
        return this.eventToken != null;
    }

    public void setCallbackId(java.lang.String str) {
        this.callbackId = str;
    }

    public void setDeduplicationId(java.lang.String str) {
        this.deduplicationId = str;
    }

    public void setOrderId(java.lang.String str) {
        this.orderId = str;
    }

    public void setProductId(java.lang.String str) {
        this.productId = str;
    }

    public void setPurchaseToken(java.lang.String str) {
        this.purchaseToken = str;
    }

    public void setRevenue(double d, java.lang.String str) {
        if (checkRevenue(java.lang.Double.valueOf(d), str)) {
            this.revenue = java.lang.Double.valueOf(d);
            this.currency = str;
        }
    }
}
