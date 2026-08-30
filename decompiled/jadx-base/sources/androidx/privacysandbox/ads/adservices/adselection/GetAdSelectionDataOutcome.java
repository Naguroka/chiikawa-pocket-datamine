package androidx.privacysandbox.ads.adservices.adselection;

/* JADX INFO: compiled from: GetAdSelectionDataOutcome.kt */
/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "", com.json.hs.n, "Landroid/adservices/adselection/GetAdSelectionDataOutcome;", "(Landroid/adservices/adselection/GetAdSelectionDataOutcome;)V", "adSelectionId", "", "adSelectionData", "", "(J[B)V", "getAdSelectionData", "()[B", "getAdSelectionId", "()J", "equals", "", "other", "hashCode", "", "toString", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetAdSelectionDataOutcome {
    private final byte[] adSelectionData;
    private final long adSelectionId;

    public GetAdSelectionDataOutcome(long j) {
        this(j, null, 2, null);
    }

    public GetAdSelectionDataOutcome(long j, byte[] bArr) {
        this.adSelectionId = j;
        this.adSelectionData = bArr;
    }

    public /* synthetic */ GetAdSelectionDataOutcome(long j, byte[] bArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : bArr);
    }

    public final byte[] getAdSelectionData() {
        return this.adSelectionData;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome getAdSelectionDataOutcome = (androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome) other;
        return this.adSelectionId == getAdSelectionDataOutcome.adSelectionId && java.util.Arrays.equals(this.adSelectionData, getAdSelectionDataOutcome.adSelectionData);
    }

    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.adSelectionId) * 31;
        byte[] bArr = this.adSelectionData;
        return iHashCode + (bArr != null ? bArr.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GetAdSelectionDataOutcome: adSelectionId=" + this.adSelectionId + ", adSelectionData=" + this.adSelectionData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAdSelectionDataOutcome(android.adservices.adselection.GetAdSelectionDataOutcome response) {
        this(response.getAdSelectionId(), response.getAdSelectionData());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
    }
}
