package com.unity3d.services.core.request.metrics;

/* JADX INFO: compiled from: Metric.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B3\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/unity3d/services/core/request/metrics/Metric;", "", "name", "", "value", "tags", "", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getTags", "()Ljava/util/Map;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toMap", "toString", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Metric {
    private static final java.lang.String METRIC_NAME = "n";
    private static final java.lang.String METRIC_TAGS = "t";
    private static final java.lang.String METRIC_VALUE = "v";
    private final java.lang.String name;
    private final java.util.Map<java.lang.String, java.lang.String> tags;
    private final java.lang.Object value;

    public Metric(java.lang.String str) {
        this(str, null, null, 6, null);
    }

    public Metric(java.lang.String str, java.lang.Object obj) {
        this(str, obj, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.unity3d.services.core.request.metrics.Metric copy$default(com.unity3d.services.core.request.metrics.Metric metric, java.lang.String str, java.lang.Object obj, java.util.Map map, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = metric.name;
        }
        if ((i & 2) != 0) {
            obj = metric.value;
        }
        if ((i & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.Object getValue() {
        return this.value;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return this.tags;
    }

    public final com.unity3d.services.core.request.metrics.Metric copy(java.lang.String name, java.lang.Object value, java.util.Map<java.lang.String, java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        return new com.unity3d.services.core.request.metrics.Metric(name, value, tags);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.services.core.request.metrics.Metric)) {
            return false;
        }
        com.unity3d.services.core.request.metrics.Metric metric = (com.unity3d.services.core.request.metrics.Metric) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, metric.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, metric.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, metric.tags);
    }

    public int hashCode() {
        java.lang.String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Object obj = this.value;
        return ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.tags.hashCode();
    }

    public java.lang.String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }

    public Metric(java.lang.String str, java.lang.Object obj, java.util.Map<java.lang.String, java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        this.name = str;
        this.value = obj;
        this.tags = tags;
    }

    public /* synthetic */ Metric(java.lang.String str, java.lang.Object obj, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getTags() {
        return this.tags;
    }

    public final java.lang.Object getValue() {
        return this.value;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toMap() {
        java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        java.lang.String str = this.name;
        if (str != null) {
            mapCreateMapBuilder.put("n", str);
        }
        java.lang.Object obj = this.value;
        if (obj != null) {
            mapCreateMapBuilder.put("v", obj);
        }
        if (!this.tags.isEmpty()) {
            mapCreateMapBuilder.put(METRIC_TAGS, this.tags);
        }
        return kotlin.collections.MapsKt.build(mapCreateMapBuilder);
    }
}
