package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: OMData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/model/OMData;", "", "version", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPartnerName", "()Ljava/lang/String;", "getPartnerVersion", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OMData {
    private final java.lang.String partnerName;
    private final java.lang.String partnerVersion;
    private final java.lang.String version;

    public static /* synthetic */ com.unity3d.ads.core.data.model.OMData copy$default(com.unity3d.ads.core.data.model.OMData oMData, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = oMData.version;
        }
        if ((i & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPartnerName() {
        return this.partnerName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getPartnerVersion() {
        return this.partnerVersion;
    }

    public final com.unity3d.ads.core.data.model.OMData copy(java.lang.String version, java.lang.String partnerName, java.lang.String partnerVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerName, "partnerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerVersion, "partnerVersion");
        return new com.unity3d.ads.core.data.model.OMData(version, partnerName, partnerVersion);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ads.core.data.model.OMData)) {
            return false;
        }
        com.unity3d.ads.core.data.model.OMData oMData = (com.unity3d.ads.core.data.model.OMData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.version, oMData.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerName, oMData.partnerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerVersion, oMData.partnerVersion);
    }

    public int hashCode() {
        return (((this.version.hashCode() * 31) + this.partnerName.hashCode()) * 31) + this.partnerVersion.hashCode();
    }

    public java.lang.String toString() {
        return "OMData(version=" + this.version + ", partnerName=" + this.partnerName + ", partnerVersion=" + this.partnerVersion + ')';
    }

    public OMData(java.lang.String version, java.lang.String partnerName, java.lang.String partnerVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerName, "partnerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerVersion, "partnerVersion");
        this.version = version;
        this.partnerName = partnerName;
        this.partnerVersion = partnerVersion;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String getPartnerName() {
        return this.partnerName;
    }

    public final java.lang.String getPartnerVersion() {
        return this.partnerVersion;
    }
}
