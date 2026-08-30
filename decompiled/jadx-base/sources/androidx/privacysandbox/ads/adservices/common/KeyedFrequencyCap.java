package androidx.privacysandbox.ads.adservices.common;

/* JADX INFO: compiled from: KeyedFrequencyCap.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/KeyedFrequencyCap;", "", "adCounterKey", "", "maxCount", "interval", "Ljava/time/Duration;", "(IILjava/time/Duration;)V", "getAdCounterKey", "()I", "getInterval", "()Ljava/time/Duration;", "getMaxCount", "convertToAdServices", "Landroid/adservices/common/KeyedFrequencyCap;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "toString", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext8OptIn
public final class KeyedFrequencyCap {
    private final int adCounterKey;
    private final java.time.Duration interval;
    private final int maxCount;

    public KeyedFrequencyCap(int i, int i2, java.time.Duration interval) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interval, "interval");
        this.adCounterKey = i;
        this.maxCount = i2;
        this.interval = interval;
    }

    public final int getAdCounterKey() {
        return this.adCounterKey;
    }

    public final java.time.Duration getInterval() {
        return this.interval;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap keyedFrequencyCap = (androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap) other;
        return this.adCounterKey == keyedFrequencyCap.adCounterKey && this.maxCount == keyedFrequencyCap.maxCount && kotlin.jvm.internal.Intrinsics.areEqual(this.interval, keyedFrequencyCap.interval);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.adCounterKey) * 31) + java.lang.Integer.hashCode(this.maxCount)) * 31) + this.interval.hashCode();
    }

    public java.lang.String toString() {
        return "KeyedFrequencyCap: adCounterKey=" + this.adCounterKey + ", maxCount=" + this.maxCount + ", interval=" + this.interval;
    }

    public final android.adservices.common.KeyedFrequencyCap convertToAdServices$ads_adservices_release() {
        android.adservices.common.KeyedFrequencyCap keyedFrequencyCapBuild = new android.adservices.common.KeyedFrequencyCap.Builder(this.adCounterKey, this.maxCount, this.interval).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keyedFrequencyCapBuild, "Builder(adCounterKey, ma…val)\n            .build()");
        return keyedFrequencyCapBuild;
    }
}
