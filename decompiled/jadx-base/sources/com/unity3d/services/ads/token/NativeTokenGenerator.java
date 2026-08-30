package com.unity3d.services.ads.token;

/* JADX INFO: loaded from: classes6.dex */
public class NativeTokenGenerator implements com.unity3d.services.ads.token.INativeTokenGenerator {
    private static final java.lang.String DEFAULT_NATIVE_TOKEN_PREFIX = "1:";
    private com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder _deviceInfoReaderBuilder;
    private java.util.concurrent.ExecutorService _executorService;
    private java.lang.String _prependStr;

    public NativeTokenGenerator(java.util.concurrent.ExecutorService executorService, com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder deviceInfoReaderBuilder) {
        this(executorService, deviceInfoReaderBuilder, DEFAULT_NATIVE_TOKEN_PREFIX);
    }

    public NativeTokenGenerator(java.util.concurrent.ExecutorService executorService, com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder deviceInfoReaderBuilder, java.lang.String str) {
        this._executorService = executorService;
        this._deviceInfoReaderBuilder = deviceInfoReaderBuilder;
        this._prependStr = str;
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGenerator
    public void generateToken(final com.unity3d.services.ads.token.INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        this._executorService.execute(new java.lang.Runnable() { // from class: com.unity3d.services.ads.token.NativeTokenGenerator.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    java.lang.String strEncodeToString = android.util.Base64.encodeToString(new com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor(com.unity3d.services.ads.token.NativeTokenGenerator.this._deviceInfoReaderBuilder.build()).getDeviceData(), 2);
                    if (com.unity3d.services.ads.token.NativeTokenGenerator.this._prependStr != null && !com.unity3d.services.ads.token.NativeTokenGenerator.this._prependStr.isEmpty()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.unity3d.services.ads.token.NativeTokenGenerator.this._prependStr.length() + strEncodeToString.length());
                        sb.append(com.unity3d.services.ads.token.NativeTokenGenerator.this._prependStr);
                        sb.append(strEncodeToString);
                        iNativeTokenGeneratorListener.onReady(sb.toString());
                    } else {
                        iNativeTokenGeneratorListener.onReady(strEncodeToString);
                    }
                } catch (java.lang.Exception e) {
                    com.unity3d.services.core.log.DeviceLog.exception("Unity Ads failed to generate token.", e);
                    iNativeTokenGeneratorListener.onReady(null);
                }
            }
        });
    }
}
