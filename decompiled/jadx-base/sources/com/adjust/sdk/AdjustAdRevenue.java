package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustAdRevenue {
    private static final com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    java.lang.Integer adImpressionsCount;
    java.lang.String adRevenueNetwork;
    java.lang.String adRevenuePlacement;
    java.lang.String adRevenueUnit;
    java.util.Map<java.lang.String, java.lang.String> callbackParameters;
    java.lang.String currency;
    java.util.Map<java.lang.String, java.lang.String> partnerParameters;
    java.lang.Double revenue;
    java.lang.String source;

    public AdjustAdRevenue(java.lang.String str) {
        if (isValidSource(str)) {
            this.source = str;
        }
    }

    private boolean isValidSource(java.lang.String str) {
        if (str == null) {
            logger.error("Missing source", new java.lang.Object[0]);
            return false;
        }
        if (!str.isEmpty()) {
            return true;
        }
        logger.error("Source can't be empty", new java.lang.Object[0]);
        return false;
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

    public java.lang.Integer getAdImpressionsCount() {
        return this.adImpressionsCount;
    }

    public java.lang.String getAdRevenueNetwork() {
        return this.adRevenueNetwork;
    }

    public java.lang.String getAdRevenuePlacement() {
        return this.adRevenuePlacement;
    }

    public java.lang.String getAdRevenueUnit() {
        return this.adRevenueUnit;
    }

    public java.util.Map<java.lang.String, java.lang.String> getCallbackParameters() {
        return this.callbackParameters;
    }

    public java.lang.String getCurrency() {
        return this.currency;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPartnerParameters() {
        return this.partnerParameters;
    }

    public java.lang.Double getRevenue() {
        return this.revenue;
    }

    public java.lang.String getSource() {
        return this.source;
    }

    public boolean isValid() {
        return isValidSource(this.source);
    }

    public void setAdImpressionsCount(java.lang.Integer num) {
        this.adImpressionsCount = num;
    }

    public void setAdRevenueNetwork(java.lang.String str) {
        this.adRevenueNetwork = str;
    }

    public void setAdRevenuePlacement(java.lang.String str) {
        this.adRevenuePlacement = str;
    }

    public void setAdRevenueUnit(java.lang.String str) {
        this.adRevenueUnit = str;
    }

    public void setRevenue(java.lang.Double d, java.lang.String str) {
        this.revenue = d;
        this.currency = str;
    }
}
