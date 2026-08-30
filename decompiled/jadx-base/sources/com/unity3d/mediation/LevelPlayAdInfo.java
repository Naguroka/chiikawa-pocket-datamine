package com.unity3d.mediation;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b.\u0010/B\u001b\b\u0016\u0012\u0006\u00100\u001a\u00020\u0000\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b.\u00101J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÂ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0002J\u0006\u0010\u001c\u001a\u00020\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0016JM\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010&\u001a\u00020%HÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0016\u0010 \u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0016\u0010!\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0016\u0010\"\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0016\u0010#\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*¨\u00062"}, d2 = {"Lcom/unity3d/mediation/LevelPlayAdInfo;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lcom/ironsource/mediationsdk/impressionData/ImpressionData;", "c", "Lcom/ironsource/wl;", "d", "Lcom/unity3d/mediation/LevelPlayAdSize;", "e", "f", "getAdUnitId", "getAdUnitName", "getAdSize", "getAdFormat", "getPlacementName", "getAuctionId", "getCountry", "getAb", "getSegmentName", "getAdNetwork", "getInstanceName", "getInstanceId", "", "getRevenue", "getPrecision", "getEncryptedCPM", "getCreativeId", "toString", "adUnitId", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "impressionData", "loadArmData", com.ironsource.y8.h.O, com.json.op.d, "copy", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "Lcom/ironsource/mediationsdk/impressionData/ImpressionData;", "Lcom/ironsource/wl;", "Lcom/unity3d/mediation/LevelPlayAdSize;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/impressionData/ImpressionData;Lcom/ironsource/wl;Lcom/unity3d/mediation/LevelPlayAdSize;Ljava/lang/String;)V", "adInfo", "(Lcom/unity3d/mediation/LevelPlayAdInfo;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LevelPlayAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String adUnitId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String adFormat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.mediationsdk.impressionData.ImpressionData impressionData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.wl loadArmData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.unity3d.mediation.LevelPlayAdSize adSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final java.lang.String placementName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(com.unity3d.mediation.LevelPlayAdInfo adInfo, java.lang.String str) {
        this(adInfo.adUnitId, adInfo.adFormat, adInfo.impressionData, adInfo.loadArmData, adInfo.adSize, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public LevelPlayAdInfo(java.lang.String adUnitId, java.lang.String adFormat, com.json.mediationsdk.impressionData.ImpressionData impressionData, com.json.wl wlVar, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.adUnitId = adUnitId;
        this.adFormat = adFormat;
        this.impressionData = impressionData;
        this.loadArmData = wlVar;
        this.adSize = levelPlayAdSize;
        this.placementName = str;
    }

    public /* synthetic */ LevelPlayAdInfo(java.lang.String str, java.lang.String str2, com.json.mediationsdk.impressionData.ImpressionData impressionData, com.json.wl wlVar, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : impressionData, (i & 8) != 0 ? null : wlVar, (i & 16) != 0 ? null : levelPlayAdSize, (i & 32) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final java.lang.String getAdFormat() {
        return this.adFormat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    private final com.json.mediationsdk.impressionData.ImpressionData getImpressionData() {
        return this.impressionData;
    }

    public static /* synthetic */ com.unity3d.mediation.LevelPlayAdInfo copy$default(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo, java.lang.String str, java.lang.String str2, com.json.mediationsdk.impressionData.ImpressionData impressionData, com.json.wl wlVar, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = levelPlayAdInfo.adUnitId;
        }
        if ((i & 2) != 0) {
            str2 = levelPlayAdInfo.adFormat;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            impressionData = levelPlayAdInfo.impressionData;
        }
        com.json.mediationsdk.impressionData.ImpressionData impressionData2 = impressionData;
        if ((i & 8) != 0) {
            wlVar = levelPlayAdInfo.loadArmData;
        }
        com.json.wl wlVar2 = wlVar;
        if ((i & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.adSize;
        }
        com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        if ((i & 32) != 0) {
            str3 = levelPlayAdInfo.placementName;
        }
        return levelPlayAdInfo.copy(str, str4, impressionData2, wlVar2, levelPlayAdSize2, str3);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    private final com.json.wl getLoadArmData() {
        return this.loadArmData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    private final com.unity3d.mediation.LevelPlayAdSize getAdSize() {
        return this.adSize;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    private final java.lang.String getPlacementName() {
        return this.placementName;
    }

    public final com.unity3d.mediation.LevelPlayAdInfo copy(java.lang.String adUnitId, java.lang.String adFormat, com.json.mediationsdk.impressionData.ImpressionData impressionData, com.json.wl loadArmData, com.unity3d.mediation.LevelPlayAdSize adSize, java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return new com.unity3d.mediation.LevelPlayAdInfo(adUnitId, adFormat, impressionData, loadArmData, adSize, placementName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.mediation.LevelPlayAdInfo)) {
            return false;
        }
        com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo = (com.unity3d.mediation.LevelPlayAdInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.adUnitId, levelPlayAdInfo.adUnitId) && kotlin.jvm.internal.Intrinsics.areEqual(this.adFormat, levelPlayAdInfo.adFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.impressionData, levelPlayAdInfo.impressionData) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadArmData, levelPlayAdInfo.loadArmData) && kotlin.jvm.internal.Intrinsics.areEqual(this.adSize, levelPlayAdInfo.adSize) && kotlin.jvm.internal.Intrinsics.areEqual(this.placementName, levelPlayAdInfo.placementName);
    }

    public final java.lang.String getAb() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String ab = impressionData != null ? impressionData.getAb() : null;
        return ab == null ? "" : ab;
    }

    public final java.lang.String getAdFormat() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String adFormat = impressionData != null ? impressionData.getAdFormat() : null;
        return adFormat == null ? this.adFormat : adFormat;
    }

    public final java.lang.String getAdNetwork() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String adNetwork = impressionData != null ? impressionData.getAdNetwork() : null;
        return adNetwork == null ? "" : adNetwork;
    }

    public final com.unity3d.mediation.LevelPlayAdSize getAdSize() {
        return this.adSize;
    }

    public final java.lang.String getAdUnitId() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String mediationAdUnitId = impressionData != null ? impressionData.getMediationAdUnitId() : null;
        return mediationAdUnitId == null ? this.adUnitId : mediationAdUnitId;
    }

    public final java.lang.String getAdUnitName() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String mediationAdUnitName = impressionData != null ? impressionData.getMediationAdUnitName() : null;
        return mediationAdUnitName == null ? "" : mediationAdUnitName;
    }

    public final java.lang.String getAuctionId() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String auctionId = impressionData != null ? impressionData.getAuctionId() : null;
        return auctionId == null ? "" : auctionId;
    }

    public final java.lang.String getCountry() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String country = impressionData != null ? impressionData.getCountry() : null;
        return country == null ? "" : country;
    }

    public final java.lang.String getCreativeId() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String creativeId = impressionData != null ? impressionData.getCreativeId() : null;
        return creativeId == null ? "" : creativeId;
    }

    public final java.lang.String getEncryptedCPM() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String encryptedCPM = impressionData != null ? impressionData.getEncryptedCPM() : null;
        return encryptedCPM == null ? "" : encryptedCPM;
    }

    public final java.lang.String getInstanceId() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String instanceId = impressionData != null ? impressionData.getInstanceId() : null;
        return instanceId == null ? "" : instanceId;
    }

    public final java.lang.String getInstanceName() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String instanceName = impressionData != null ? impressionData.getInstanceName() : null;
        return instanceName == null ? "" : instanceName;
    }

    public final java.lang.String getPlacementName() {
        java.lang.String str = this.placementName;
        return str == null ? "" : str;
    }

    public final java.lang.String getPrecision() {
        java.lang.String strC;
        com.json.wl wlVar = this.loadArmData;
        if (wlVar != null && (strC = wlVar.c()) != null) {
            return strC;
        }
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String precision = impressionData != null ? impressionData.getPrecision() : null;
        return precision == null ? "" : precision;
    }

    public final double getRevenue() {
        com.json.wl wlVar = this.loadArmData;
        if (wlVar != null) {
            return wlVar.d();
        }
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.Double revenue = impressionData != null ? impressionData.getRevenue() : null;
        if (revenue != null) {
            return revenue.doubleValue();
        }
        return 0.0d;
    }

    public final java.lang.String getSegmentName() {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        java.lang.String segmentName = impressionData != null ? impressionData.getSegmentName() : null;
        return segmentName == null ? "" : segmentName;
    }

    public int hashCode() {
        int iHashCode = ((this.adUnitId.hashCode() * 31) + this.adFormat.hashCode()) * 31;
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.impressionData;
        int iHashCode2 = (iHashCode + (impressionData == null ? 0 : impressionData.hashCode())) * 31;
        com.json.wl wlVar = this.loadArmData;
        int iHashCode3 = (iHashCode2 + (wlVar == null ? 0 : wlVar.hashCode())) * 31;
        com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize = this.adSize;
        int iHashCode4 = (iHashCode3 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        java.lang.String str = this.placementName;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("adUnitId: ");
        sb.append(getAdUnitId()).append(", adUnitName: ").append(getAdUnitName()).append(", adSize: ").append(this.adSize).append(", adFormat: ").append(getAdFormat()).append(", placementName: ").append(getPlacementName()).append(", auctionId: ").append(getAuctionId()).append(", country: ").append(getCountry()).append(", ab: ").append(getAb()).append(", segmentName: ").append(getSegmentName()).append(", adNetwork: ").append(getAdNetwork()).append(", instanceName: ").append(getInstanceName()).append(", instanceId: ");
        sb.append(getInstanceId()).append(", revenue: ").append(getRevenue()).append(", precision: ").append(getPrecision()).append(", encryptedCPM: ").append(getEncryptedCPM()).append(", creativeId: ").append(getCreativeId());
        return sb.toString();
    }
}
