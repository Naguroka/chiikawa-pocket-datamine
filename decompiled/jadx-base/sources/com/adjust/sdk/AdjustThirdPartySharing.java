package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustThirdPartySharing {
    java.lang.Boolean isEnabled;
    java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> granularOptions = new java.util.HashMap();
    java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> partnerSharingSettings = new java.util.HashMap();

    public AdjustThirdPartySharing(java.lang.Boolean bool) {
        this.isEnabled = bool;
    }

    public void addGranularOption(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null || str2 == null || str3 == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Cannot add granular option with any null value", new java.lang.Object[0]);
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.granularOptions.get(str);
        if (map == null) {
            map = new java.util.HashMap<>();
            this.granularOptions.put(str, map);
        }
        map.put(str2, str3);
    }

    public void addPartnerSharingSetting(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null || str2 == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("Cannot add partner sharing setting with any null value", new java.lang.Object[0]);
            return;
        }
        java.util.Map<java.lang.String, java.lang.Boolean> map = this.partnerSharingSettings.get(str);
        if (map == null) {
            map = new java.util.HashMap<>();
            this.partnerSharingSettings.put(str, map);
        }
        map.put(str2, java.lang.Boolean.valueOf(z));
    }

    public java.lang.Boolean getEnabled() {
        return this.isEnabled;
    }

    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> getGranularOptions() {
        return this.granularOptions;
    }

    public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> getPartnerSharingSettings() {
        return this.partnerSharingSettings;
    }
}
