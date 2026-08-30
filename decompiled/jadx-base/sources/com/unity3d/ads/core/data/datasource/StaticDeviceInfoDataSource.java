package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: StaticDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0003H&J\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0014H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "", "analyticsUserId", "", "getAnalyticsUserId", "()Ljava/lang/String;", "fetch", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "additionalStores", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCached", "getAppName", "getAuid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIdfi", "getManufacturer", "getModel", "getOsVersion", "getSystemBootTime", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface StaticDeviceInfoDataSource {
    java.lang.Object fetch(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo> continuation);

    gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    java.lang.String getAnalyticsUserId();

    java.lang.String getAppName();

    java.lang.Object getAuid(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object getIdfi(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.String getManufacturer();

    java.lang.String getModel();

    java.lang.String getOsVersion();

    long getSystemBootTime();
}
