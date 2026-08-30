package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class MinimalDeviceInfoReader implements com.unity3d.services.core.device.reader.IDeviceInfoReader {
    final com.unity3d.services.core.device.reader.IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(com.unity3d.services.core.device.reader.IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public java.util.Map<java.lang.String, java.lang.Object> getDeviceInfoData() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.ce.A, "android");
        map.put("sdkVersion", java.lang.Integer.valueOf(com.unity3d.services.core.properties.SdkProperties.getVersionCode()));
        map.put("sdkVersionName", com.unity3d.services.core.properties.SdkProperties.getVersionName());
        map.put("idfi", com.unity3d.services.core.device.Device.getIdfi());
        map.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        map.put("ts", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        map.put(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, com.unity3d.services.core.properties.ClientProperties.getGameId());
        return map;
    }
}
