package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustAttribution implements java.io.Serializable {
    private static final java.io.ObjectStreamField[] serialPersistentFields = {new java.io.ObjectStreamField("trackerToken", java.lang.String.class), new java.io.ObjectStreamField("trackerName", java.lang.String.class), new java.io.ObjectStreamField("network", java.lang.String.class), new java.io.ObjectStreamField("campaign", java.lang.String.class), new java.io.ObjectStreamField("adgroup", java.lang.String.class), new java.io.ObjectStreamField("creative", java.lang.String.class), new java.io.ObjectStreamField("clickLabel", java.lang.String.class), new java.io.ObjectStreamField("costType", java.lang.String.class), new java.io.ObjectStreamField("costAmount", java.lang.Double.class), new java.io.ObjectStreamField("costCurrency", java.lang.String.class), new java.io.ObjectStreamField("fbInstallReferrer", java.lang.String.class)};
    private static final long serialVersionUID = 1;
    public java.lang.String adgroup;
    public java.lang.String campaign;
    public java.lang.String clickLabel;
    public java.lang.Double costAmount;
    public java.lang.String costCurrency;
    public java.lang.String costType;
    public java.lang.String creative;
    public java.lang.String fbInstallReferrer;
    public java.lang.String network;
    public java.lang.String trackerName;
    public java.lang.String trackerToken;

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.adjust.sdk.AdjustAttribution adjustAttribution = (com.adjust.sdk.AdjustAttribution) obj;
        return com.adjust.sdk.Util.equalString(this.trackerToken, adjustAttribution.trackerToken) && com.adjust.sdk.Util.equalString(this.trackerName, adjustAttribution.trackerName) && com.adjust.sdk.Util.equalString(this.network, adjustAttribution.network) && com.adjust.sdk.Util.equalString(this.campaign, adjustAttribution.campaign) && com.adjust.sdk.Util.equalString(this.adgroup, adjustAttribution.adgroup) && com.adjust.sdk.Util.equalString(this.creative, adjustAttribution.creative) && com.adjust.sdk.Util.equalString(this.clickLabel, adjustAttribution.clickLabel) && com.adjust.sdk.Util.equalString(this.costType, adjustAttribution.costType) && com.adjust.sdk.Util.equalsDouble(this.costAmount, adjustAttribution.costAmount) && com.adjust.sdk.Util.equalString(this.costCurrency, adjustAttribution.costCurrency) && com.adjust.sdk.Util.equalString(this.fbInstallReferrer, adjustAttribution.fbInstallReferrer);
    }

    public int hashCode() {
        return com.adjust.sdk.Util.hashString(this.fbInstallReferrer, com.adjust.sdk.Util.hashString(this.costCurrency, com.adjust.sdk.Util.hashDouble(this.costAmount, com.adjust.sdk.Util.hashString(this.costType, com.adjust.sdk.Util.hashString(this.clickLabel, com.adjust.sdk.Util.hashString(this.creative, com.adjust.sdk.Util.hashString(this.adgroup, com.adjust.sdk.Util.hashString(this.campaign, com.adjust.sdk.Util.hashString(this.network, com.adjust.sdk.Util.hashString(this.trackerName, com.adjust.sdk.Util.hashString(this.trackerToken, 17)))))))))));
    }

    public java.util.Map<java.lang.String, java.lang.String> toMap() {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String str = this.trackerToken;
        if (str != null) {
            map.put("trackerToken", str);
        }
        java.lang.String str2 = this.trackerName;
        if (str2 != null) {
            map.put("trackerName", str2);
        }
        java.lang.String str3 = this.network;
        if (str3 != null) {
            map.put("network", str3);
        }
        java.lang.String str4 = this.campaign;
        if (str4 != null) {
            map.put("campaign", str4);
        }
        java.lang.String str5 = this.adgroup;
        if (str5 != null) {
            map.put("adgroup", str5);
        }
        java.lang.String str6 = this.creative;
        if (str6 != null) {
            map.put("creative", str6);
        }
        java.lang.String str7 = this.clickLabel;
        if (str7 != null) {
            map.put("clickLabel", str7);
        }
        java.lang.String str8 = this.costType;
        if (str8 != null) {
            map.put("costType", str8);
        }
        java.lang.Double d = this.costAmount;
        if (d != null) {
            map.put("costAmount", d.toString());
        }
        java.lang.String str9 = this.costCurrency;
        if (str9 != null) {
            map.put("costCurrency", str9);
        }
        java.lang.String str10 = this.fbInstallReferrer;
        if (str10 != null) {
            map.put("fbInstallReferrer", str10);
        }
        return map;
    }

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString("tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s ct:%s ca:%.2f cc:%s fir:%s", this.trackerToken, this.trackerName, this.network, this.campaign, this.adgroup, this.creative, this.clickLabel, this.costType, this.costAmount, this.costCurrency, this.fbInstallReferrer);
    }
}
