package androidx.privacysandbox.ads.adservices.customaudience;

/* JADX INFO: compiled from: LeaveCustomAudienceRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "", "buyer", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "name", "", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/lang/String;)V", "getBuyer", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getName", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LeaveCustomAudienceRequest {
    private final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier buyer;
    private final java.lang.String name;

    public LeaveCustomAudienceRequest(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier buyer, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyer, "buyer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.buyer = buyer;
        this.name = name;
    }

    public final androidx.privacysandbox.ads.adservices.common.AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequest = (androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.buyer, leaveCustomAudienceRequest.buyer) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, leaveCustomAudienceRequest.name);
    }

    public int hashCode() {
        return (this.buyer.hashCode() * 31) + this.name.hashCode();
    }

    public java.lang.String toString() {
        return "LeaveCustomAudience: buyer=" + this.buyer + ", name=" + this.name;
    }
}
