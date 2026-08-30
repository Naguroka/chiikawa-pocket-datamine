package com.unity3d.services.core.request.metrics;

/* JADX INFO: compiled from: MetricsContainer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricsContainer;", "", "metricSampleRate", "", "commonTags", "Lcom/unity3d/services/core/request/metrics/MetricCommonTags;", "metrics", "", "Lcom/unity3d/services/core/request/metrics/Metric;", com.unity3d.services.core.request.metrics.MetricsContainer.METRIC_CONTAINER_SESSION_TOKEN, "(Ljava/lang/String;Lcom/unity3d/services/core/request/metrics/MetricCommonTags;Ljava/util/List;Ljava/lang/String;)V", "apiLevel", "deviceManufacturer", "kotlin.jvm.PlatformType", "deviceModel", com.unity3d.services.core.request.metrics.MetricsContainer.METRIC_CONTAINER_DEVICE_NAME, "gameId", com.unity3d.services.core.request.metrics.MetricsContainer.METRIC_CONTAINER_SHARED_SESSION_ID, "toMap", "", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MetricsContainer {
    private static final java.lang.String METRICS_CONTAINER = "m";
    private static final java.lang.String METRICS_CONTAINER_TAGS = "t";
    private static final java.lang.String METRIC_CONTAINER_API_LEVEL = "apil";
    private static final java.lang.String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    private static final java.lang.String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    private static final java.lang.String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    private static final java.lang.String METRIC_CONTAINER_GAME_ID = "gameId";
    private static final java.lang.String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    private static final java.lang.String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    private static final java.lang.String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    private final java.lang.String apiLevel;
    private final com.unity3d.services.core.request.metrics.MetricCommonTags commonTags;
    private final java.lang.String deviceManufacturer;
    private final java.lang.String deviceModel;
    private final java.lang.String deviceName;
    private final java.lang.String gameId;
    private final java.lang.String metricSampleRate;
    private final java.util.List<com.unity3d.services.core.request.metrics.Metric> metrics;
    private final java.lang.String sTkn;
    private final java.lang.String shSid;

    public MetricsContainer(java.lang.String metricSampleRate, com.unity3d.services.core.request.metrics.MetricCommonTags commonTags, java.util.List<com.unity3d.services.core.request.metrics.Metric> metrics, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricSampleRate, "metricSampleRate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonTags, "commonTags");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.metricSampleRate = metricSampleRate;
        this.commonTags = commonTags;
        this.metrics = metrics;
        this.sTkn = str;
        this.shSid = com.unity3d.services.core.properties.Session.INSTANCE.getId();
        this.apiLevel = java.lang.String.valueOf(com.unity3d.services.core.device.Device.getApiLevel());
        this.deviceModel = com.unity3d.services.core.device.Device.getModel();
        this.deviceName = com.unity3d.services.core.device.Device.getDevice();
        this.deviceManufacturer = com.unity3d.services.core.device.Device.getManufacturer();
        this.gameId = com.unity3d.services.core.properties.ClientProperties.getGameId();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toMap() {
        java.util.List<com.unity3d.services.core.request.metrics.Metric> list = this.metrics;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.unity3d.services.core.request.metrics.Metric) it.next()).toMap());
        }
        java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(METRIC_CONTAINER_SAMPLE_RATE, this.metricSampleRate);
        mapCreateMapBuilder.put(METRICS_CONTAINER, arrayList);
        mapCreateMapBuilder.put(METRICS_CONTAINER_TAGS, this.commonTags.toMap());
        mapCreateMapBuilder.put(METRIC_CONTAINER_SHARED_SESSION_ID, this.shSid);
        mapCreateMapBuilder.put(METRIC_CONTAINER_API_LEVEL, this.apiLevel);
        java.lang.String str = this.sTkn;
        if (str != null) {
            mapCreateMapBuilder.put(METRIC_CONTAINER_SESSION_TOKEN, str);
        }
        java.lang.String deviceModel = this.deviceModel;
        if (deviceModel != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceModel, "deviceModel");
            mapCreateMapBuilder.put("deviceModel", deviceModel);
        }
        java.lang.String deviceName = this.deviceName;
        if (deviceName != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceName, "deviceName");
            mapCreateMapBuilder.put(METRIC_CONTAINER_DEVICE_NAME, deviceName);
        }
        java.lang.String deviceManufacturer = this.deviceManufacturer;
        if (deviceManufacturer != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceManufacturer, "deviceManufacturer");
            mapCreateMapBuilder.put(METRIC_CONTAINER_DEVICE_MAKE, deviceManufacturer);
        }
        java.lang.String gameId = this.gameId;
        if (gameId != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gameId, "gameId");
            mapCreateMapBuilder.put("gameId", gameId);
        }
        return kotlin.collections.MapsKt.build(mapCreateMapBuilder);
    }
}
