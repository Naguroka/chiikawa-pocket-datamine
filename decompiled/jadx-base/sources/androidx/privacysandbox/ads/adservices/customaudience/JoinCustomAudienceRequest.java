package androidx.privacysandbox.ads.adservices.customaudience;

/* JADX INFO: compiled from: JoinCustomAudienceRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "", "customAudience", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "(Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;)V", "getCustomAudience", "()Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "equals", "", "other", "hashCode", "", "toString", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JoinCustomAudienceRequest {
    private final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience customAudience;

    public JoinCustomAudienceRequest(androidx.privacysandbox.ads.adservices.customaudience.CustomAudience customAudience) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAudience, "customAudience");
        this.customAudience = customAudience;
    }

    public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudience getCustomAudience() {
        return this.customAudience;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.customAudience, ((androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest) other).customAudience);
        }
        return false;
    }

    public int hashCode() {
        return this.customAudience.hashCode();
    }

    public java.lang.String toString() {
        return "JoinCustomAudience: customAudience=" + this.customAudience;
    }
}
