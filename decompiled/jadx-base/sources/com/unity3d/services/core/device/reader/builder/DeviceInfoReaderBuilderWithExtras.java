package com.unity3d.services.core.device.reader.builder;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoReaderBuilderWithExtras extends com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder {
    private java.util.Map<java.lang.String, java.lang.String> _extras;

    public DeviceInfoReaderBuilderWithExtras(com.unity3d.services.core.configuration.ConfigurationReader configurationReader, com.unity3d.services.core.configuration.PrivacyConfigStorage privacyConfigStorage, com.unity3d.services.core.device.reader.IGameSessionIdReader iGameSessionIdReader) {
        super(configurationReader, privacyConfigStorage, iGameSessionIdReader);
    }

    public void setExtras(java.util.Map<java.lang.String, java.lang.String> map) {
        this._extras = map;
    }

    @Override // com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder
    public com.unity3d.services.core.device.reader.IDeviceInfoReader build() {
        if (this._extras == null) {
            return super.build();
        }
        return new com.unity3d.services.core.device.reader.DeviceInfoReaderWithExtras(super.build(), this._extras);
    }
}
