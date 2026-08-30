package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoDataFactory {
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetricsSender;

    public DeviceInfoDataFactory(com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender) {
        this._sdkMetricsSender = sDKMetricsSender;
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.device.reader.DeviceInfoDataFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$configuration$InitRequestType;

        static {
            int[] iArr = new int[com.unity3d.services.core.configuration.InitRequestType.values().length];
            $SwitchMap$com$unity3d$services$core$configuration$InitRequestType = iArr;
            try {
                iArr[com.unity3d.services.core.configuration.InitRequestType.TOKEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$configuration$InitRequestType[com.unity3d.services.core.configuration.InitRequestType.PRIVACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public com.unity3d.services.core.device.reader.IDeviceInfoDataContainer getDeviceInfoData(com.unity3d.services.core.configuration.InitRequestType initRequestType) {
        int i = com.unity3d.services.core.device.reader.DeviceInfoDataFactory.AnonymousClass1.$SwitchMap$com$unity3d$services$core$configuration$InitRequestType[initRequestType.ordinal()];
        if (i == 1) {
            return getTokenDeviceInfoData();
        }
        if (i != 2) {
            return null;
        }
        return getPrivacyDeviceInfoData();
    }

    private com.unity3d.services.core.device.reader.IDeviceInfoDataContainer getPrivacyDeviceInfoData() {
        return new com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor(new com.unity3d.services.core.device.reader.builder.DeviceInfoReaderPrivacyBuilder(new com.unity3d.services.core.configuration.ConfigurationReader(), com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance(), com.unity3d.services.core.device.reader.GameSessionIdReader.getInstance()).build());
    }

    private com.unity3d.services.core.device.reader.IDeviceInfoDataContainer getTokenDeviceInfoData() {
        return new com.unity3d.services.core.device.reader.DeviceInfoReaderCompressorWithMetrics(new com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor(new com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder(new com.unity3d.services.core.configuration.ConfigurationReader(), com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance(), com.unity3d.services.core.device.reader.GameSessionIdReader.getInstance()).build()), this._sdkMetricsSender);
    }
}
