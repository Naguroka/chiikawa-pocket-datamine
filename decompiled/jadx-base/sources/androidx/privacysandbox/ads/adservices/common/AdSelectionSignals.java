package androidx.privacysandbox.ads.adservices.common;

/* JADX INFO: compiled from: AdSelectionSignals.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "", "signals", "", "(Ljava/lang/String;)V", "getSignals", "()Ljava/lang/String;", "convertToAdServices", "Landroid/adservices/common/AdSelectionSignals;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdSelectionSignals {
    private final java.lang.String signals;

    public AdSelectionSignals(java.lang.String signals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signals, "signals");
        this.signals = signals;
    }

    public final java.lang.String getSignals() {
        return this.signals;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.privacysandbox.ads.adservices.common.AdSelectionSignals) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.signals, ((androidx.privacysandbox.ads.adservices.common.AdSelectionSignals) other).signals);
        }
        return false;
    }

    public int hashCode() {
        return this.signals.hashCode();
    }

    public java.lang.String toString() {
        return "AdSelectionSignals: " + this.signals;
    }

    public final android.adservices.common.AdSelectionSignals convertToAdServices$ads_adservices_release() {
        android.adservices.common.AdSelectionSignals adSelectionSignalsFromString = android.adservices.common.AdSelectionSignals.fromString(this.signals);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adSelectionSignalsFromString, "fromString(signals)");
        return adSelectionSignalsFromString;
    }
}
