package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: PersistAdSelectionResultRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "", "adSelectionId", "", "seller", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "adSelectionResult", "", "(JLandroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;[B)V", "getAdSelectionId", "()J", "getAdSelectionResult", "()[B", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "convertToAdServices", "Landroid/adservices/adselection/PersistAdSelectionResultRequest;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PersistAdSelectionResultRequest {
    private final long adSelectionId;
    private final byte[] adSelectionResult;
    private final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier seller;

    public PersistAdSelectionResultRequest(long j) {
        this(j, null, null, 6, null);
    }

    public PersistAdSelectionResultRequest(long j, androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier) {
        this(j, adTechIdentifier, null, 4, null);
    }

    public PersistAdSelectionResultRequest(long j, androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier, byte[] bArr) {
        this.adSelectionId = j;
        this.seller = adTechIdentifier;
        this.adSelectionResult = bArr;
    }

    public /* synthetic */ PersistAdSelectionResultRequest(long j, androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier, byte[] bArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : adTechIdentifier, (i & 4) != 0 ? null : bArr);
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final byte[] getAdSelectionResult() {
        return this.adSelectionResult;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequest = (androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest) other;
        return this.adSelectionId == persistAdSelectionResultRequest.adSelectionId && kotlin.jvm.internal.Intrinsics.areEqual(this.seller, persistAdSelectionResultRequest.seller) && java.util.Arrays.equals(this.adSelectionResult, persistAdSelectionResultRequest.adSelectionResult);
    }

    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.adSelectionId) * 31;
        androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier = this.seller;
        int iHashCode2 = (iHashCode + (adTechIdentifier != null ? adTechIdentifier.hashCode() : 0)) * 31;
        byte[] bArr = this.adSelectionResult;
        return iHashCode2 + (bArr != null ? bArr.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PersistAdSelectionResultRequest: adSelectionId=" + this.adSelectionId + ", seller=" + this.seller + ", adSelectionResult=" + this.adSelectionResult;
    }

    public final android.adservices.adselection.PersistAdSelectionResultRequest convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.PersistAdSelectionResultRequest.Builder adSelectionId = new android.adservices.adselection.PersistAdSelectionResultRequest.Builder().setAdSelectionId(this.adSelectionId);
        androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier = this.seller;
        android.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequestBuild = adSelectionId.setSeller(adTechIdentifier != null ? adTechIdentifier.convertToAdServices$ads_adservices_release() : null).setAdSelectionResult(this.adSelectionResult).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(persistAdSelectionResultRequestBuild, "Builder()\n            .s…ult)\n            .build()");
        return persistAdSelectionResultRequestBuild;
    }
}
