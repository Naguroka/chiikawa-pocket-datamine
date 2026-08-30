package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: DeviceInfoRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\b\u00106\u001a\u000207H&J\u0013\u00108\u001a\u0004\u0018\u000109H¦@ø\u0001\u0000¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u0004\u0018\u00010\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010:J\u0011\u0010<\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010:J\u0011\u0010=\u001a\u000207H¦@ø\u0001\u0000¢\u0006\u0002\u0010:R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\nR\u0012\u0010!\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\nR\u0012\u0010#\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0012\u0010%\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\nR\u0012\u0010'\u001a\u00020(X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0012\u0010+\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0012\u0010-\u001a\u00020.X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020302X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "", "allowedPii", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPii", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "analyticsUserId", "", "getAnalyticsUserId", "()Ljava/lang/String;", "appName", "getAppName", "connectionTypeStr", "getConnectionTypeStr", "currentUiTheme", "", "getCurrentUiTheme", "()I", "dynamicDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "hasInternet", "", "getHasInternet", "()Z", "localeList", "", "getLocaleList", "()Ljava/util/List;", "manufacturer", "getManufacturer", com.json.ce.v, "getModel", "orientation", "getOrientation", "osVersion", "getOsVersion", "piiData", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiData", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "ringerMode", "getRingerMode", "systemBootTime", "", "getSystemBootTime", "()J", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", "cachedStaticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getAuidByteString", "Lcom/google/protobuf/ByteString;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuidString", "getIdfi", "staticDeviceInfo", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DeviceInfoRepository {
    gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii> getAllowedPii();

    java.lang.String getAnalyticsUserId();

    java.lang.String getAppName();

    java.lang.Object getAuidByteString(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation);

    java.lang.Object getAuidString(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.String getConnectionTypeStr();

    int getCurrentUiTheme();

    gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    java.lang.Object getIdfi(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.util.List<java.lang.String> getLocaleList();

    java.lang.String getManufacturer();

    java.lang.String getModel();

    java.lang.String getOrientation();

    java.lang.String getOsVersion();

    gatewayprotocol.v1.PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.datasource.VolumeSettingsChange> getVolumeSettingsChange();

    java.lang.Object staticDeviceInfo(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo> continuation);
}
