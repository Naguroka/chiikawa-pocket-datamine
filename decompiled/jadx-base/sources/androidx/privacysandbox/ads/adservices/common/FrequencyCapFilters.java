package androidx.privacysandbox.ads.adservices.common;

/* JADX INFO: compiled from: FrequencyCapFilters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bBG\b\u0007\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bJ\r\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001c"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters;", "", "keyedFrequencyCapsForWinEvents", "", "Landroidx/privacysandbox/ads/adservices/common/KeyedFrequencyCap;", "keyedFrequencyCapsForImpressionEvents", "keyedFrequencyCapsForViewEvents", "keyedFrequencyCapsForClickEvents", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getKeyedFrequencyCapsForClickEvents", "()Ljava/util/List;", "getKeyedFrequencyCapsForImpressionEvents", "getKeyedFrequencyCapsForViewEvents", "getKeyedFrequencyCapsForWinEvents", "convertToAdServices", "Landroid/adservices/common/FrequencyCapFilters;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "", "", "Landroid/adservices/common/KeyedFrequencyCap;", "AdEventType", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext8OptIn
public final class FrequencyCapFilters {
    public static final int AD_EVENT_TYPE_CLICK = 3;
    public static final int AD_EVENT_TYPE_IMPRESSION = 1;
    public static final int AD_EVENT_TYPE_VIEW = 2;
    public static final int AD_EVENT_TYPE_WIN = 0;
    private final java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForClickEvents;
    private final java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForImpressionEvents;
    private final java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForViewEvents;
    private final java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForWinEvents;

    /* JADX INFO: compiled from: FrequencyCapFilters.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters$AdEventType;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface AdEventType {
    }

    public FrequencyCapFilters() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrequencyCapFilters(java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForWinEvents) {
        this(keyedFrequencyCapsForWinEvents, null, null, null, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrequencyCapFilters(java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForWinEvents, java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForImpressionEvents) {
        this(keyedFrequencyCapsForWinEvents, keyedFrequencyCapsForImpressionEvents, null, null, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForImpressionEvents, "keyedFrequencyCapsForImpressionEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrequencyCapFilters(java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForWinEvents, java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForImpressionEvents, java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForViewEvents) {
        this(keyedFrequencyCapsForWinEvents, keyedFrequencyCapsForImpressionEvents, keyedFrequencyCapsForViewEvents, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForImpressionEvents, "keyedFrequencyCapsForImpressionEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForViewEvents, "keyedFrequencyCapsForViewEvents");
    }

    public FrequencyCapFilters(java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForWinEvents, java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForImpressionEvents, java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForViewEvents, java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> keyedFrequencyCapsForClickEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForImpressionEvents, "keyedFrequencyCapsForImpressionEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForViewEvents, "keyedFrequencyCapsForViewEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyedFrequencyCapsForClickEvents, "keyedFrequencyCapsForClickEvents");
        this.keyedFrequencyCapsForWinEvents = keyedFrequencyCapsForWinEvents;
        this.keyedFrequencyCapsForImpressionEvents = keyedFrequencyCapsForImpressionEvents;
        this.keyedFrequencyCapsForViewEvents = keyedFrequencyCapsForViewEvents;
        this.keyedFrequencyCapsForClickEvents = keyedFrequencyCapsForClickEvents;
    }

    public /* synthetic */ FrequencyCapFilters(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4);
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> getKeyedFrequencyCapsForWinEvents() {
        return this.keyedFrequencyCapsForWinEvents;
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> getKeyedFrequencyCapsForImpressionEvents() {
        return this.keyedFrequencyCapsForImpressionEvents;
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> getKeyedFrequencyCapsForViewEvents() {
        return this.keyedFrequencyCapsForViewEvents;
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> getKeyedFrequencyCapsForClickEvents() {
        return this.keyedFrequencyCapsForClickEvents;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.common.FrequencyCapFilters)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.common.FrequencyCapFilters frequencyCapFilters = (androidx.privacysandbox.ads.adservices.common.FrequencyCapFilters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.keyedFrequencyCapsForWinEvents, frequencyCapFilters.keyedFrequencyCapsForWinEvents) && kotlin.jvm.internal.Intrinsics.areEqual(this.keyedFrequencyCapsForImpressionEvents, frequencyCapFilters.keyedFrequencyCapsForImpressionEvents) && kotlin.jvm.internal.Intrinsics.areEqual(this.keyedFrequencyCapsForViewEvents, frequencyCapFilters.keyedFrequencyCapsForViewEvents) && kotlin.jvm.internal.Intrinsics.areEqual(this.keyedFrequencyCapsForClickEvents, frequencyCapFilters.keyedFrequencyCapsForClickEvents);
    }

    public int hashCode() {
        return (((((this.keyedFrequencyCapsForWinEvents.hashCode() * 31) + this.keyedFrequencyCapsForImpressionEvents.hashCode()) * 31) + this.keyedFrequencyCapsForViewEvents.hashCode()) * 31) + this.keyedFrequencyCapsForClickEvents.hashCode();
    }

    public java.lang.String toString() {
        return "FrequencyCapFilters: keyedFrequencyCapsForWinEvents=" + this.keyedFrequencyCapsForWinEvents + ", keyedFrequencyCapsForImpressionEvents=" + this.keyedFrequencyCapsForImpressionEvents + ", keyedFrequencyCapsForViewEvents=" + this.keyedFrequencyCapsForViewEvents + ", keyedFrequencyCapsForClickEvents=" + this.keyedFrequencyCapsForClickEvents;
    }

    public final android.adservices.common.FrequencyCapFilters convertToAdServices$ads_adservices_release() {
        android.adservices.common.FrequencyCapFilters frequencyCapFiltersBuild = new android.adservices.common.FrequencyCapFilters.Builder().setKeyedFrequencyCapsForWinEvents(convertToAdServices(this.keyedFrequencyCapsForWinEvents)).setKeyedFrequencyCapsForImpressionEvents(convertToAdServices(this.keyedFrequencyCapsForImpressionEvents)).setKeyedFrequencyCapsForViewEvents(convertToAdServices(this.keyedFrequencyCapsForViewEvents)).setKeyedFrequencyCapsForClickEvents(convertToAdServices(this.keyedFrequencyCapsForClickEvents)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frequencyCapFiltersBuild, "Builder()\n            .s…   )\n            .build()");
        return frequencyCapFiltersBuild;
    }

    private final java.util.List<android.adservices.common.KeyedFrequencyCap> convertToAdServices(java.util.List<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.privacysandbox.ads.adservices.common.KeyedFrequencyCap> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }
}
