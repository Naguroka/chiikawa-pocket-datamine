package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoBatchedLogRequestEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final com.google.firebase.encoders.config.Configurator CONFIG = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder();

    private AutoBatchedLogRequestEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.BatchedLogRequest.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.LogRequest.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_LogRequest.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.ClientInfo.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_ClientInfo.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AndroidClientInfo.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.LogEvent.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_LogEvent.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.ComplianceData.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_ComplianceData.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.ExternalPrivacyContext.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPrivacyContextEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPrivacyContextEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.ExternalPRequestContext.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPRequestContextEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPRequestContextEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.ExperimentIds.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds.class, com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder.INSTANCE);
    }

    private static final class BatchedLogRequestEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.BatchedLogRequest> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor LOGREQUEST_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("logRequest");

        private BatchedLogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.BatchedLogRequest batchedLogRequest, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(LOGREQUEST_DESCRIPTOR, batchedLogRequest.getLogRequests());
        }
    }

    private static final class LogRequestEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.LogRequest> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor REQUESTTIMEMS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("requestTimeMs");
        private static final com.google.firebase.encoders.FieldDescriptor REQUESTUPTIMEMS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("requestUptimeMs");
        private static final com.google.firebase.encoders.FieldDescriptor CLIENTINFO_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("clientInfo");
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("logSource");
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCENAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("logSourceName");
        private static final com.google.firebase.encoders.FieldDescriptor LOGEVENT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("logEvent");
        private static final com.google.firebase.encoders.FieldDescriptor QOSTIER_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("qosTier");

        private LogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.LogRequest logRequest, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(REQUESTTIMEMS_DESCRIPTOR, logRequest.getRequestTimeMs());
            objectEncoderContext.add(REQUESTUPTIMEMS_DESCRIPTOR, logRequest.getRequestUptimeMs());
            objectEncoderContext.add(CLIENTINFO_DESCRIPTOR, logRequest.getClientInfo());
            objectEncoderContext.add(LOGSOURCE_DESCRIPTOR, logRequest.getLogSource());
            objectEncoderContext.add(LOGSOURCENAME_DESCRIPTOR, logRequest.getLogSourceName());
            objectEncoderContext.add(LOGEVENT_DESCRIPTOR, logRequest.getLogEvents());
            objectEncoderContext.add(QOSTIER_DESCRIPTOR, logRequest.getQosTier());
        }
    }

    private static final class ClientInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ClientInfo> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor CLIENTTYPE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("clientType");
        private static final com.google.firebase.encoders.FieldDescriptor ANDROIDCLIENTINFO_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("androidClientInfo");

        private ClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.ClientInfo clientInfo, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(CLIENTTYPE_DESCRIPTOR, clientInfo.getClientType());
            objectEncoderContext.add(ANDROIDCLIENTINFO_DESCRIPTOR, clientInfo.getAndroidClientInfo());
        }
    }

    private static final class AndroidClientInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.AndroidClientInfo> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor SDKVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("sdkVersion");
        private static final com.google.firebase.encoders.FieldDescriptor MODEL_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.json.ce.v);
        private static final com.google.firebase.encoders.FieldDescriptor HARDWARE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("hardware");
        private static final com.google.firebase.encoders.FieldDescriptor DEVICE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.ironsource.y8.h.G);
        private static final com.google.firebase.encoders.FieldDescriptor PRODUCT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.applovin.sdk.AppLovinEventTypes.USER_VIEWED_PRODUCT);
        private static final com.google.firebase.encoders.FieldDescriptor OSBUILD_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("osBuild");
        private static final com.google.firebase.encoders.FieldDescriptor MANUFACTURER_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("manufacturer");
        private static final com.google.firebase.encoders.FieldDescriptor FINGERPRINT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("fingerprint");
        private static final com.google.firebase.encoders.FieldDescriptor LOCALE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("locale");
        private static final com.google.firebase.encoders.FieldDescriptor COUNTRY_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_COUNTRY);
        private static final com.google.firebase.encoders.FieldDescriptor MCCMNC_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("mccMnc");
        private static final com.google.firebase.encoders.FieldDescriptor APPLICATIONBUILD_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("applicationBuild");

        private AndroidClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(SDKVERSION_DESCRIPTOR, androidClientInfo.getSdkVersion());
            objectEncoderContext.add(MODEL_DESCRIPTOR, androidClientInfo.getModel());
            objectEncoderContext.add(HARDWARE_DESCRIPTOR, androidClientInfo.getHardware());
            objectEncoderContext.add(DEVICE_DESCRIPTOR, androidClientInfo.getDevice());
            objectEncoderContext.add(PRODUCT_DESCRIPTOR, androidClientInfo.getProduct());
            objectEncoderContext.add(OSBUILD_DESCRIPTOR, androidClientInfo.getOsBuild());
            objectEncoderContext.add(MANUFACTURER_DESCRIPTOR, androidClientInfo.getManufacturer());
            objectEncoderContext.add(FINGERPRINT_DESCRIPTOR, androidClientInfo.getFingerprint());
            objectEncoderContext.add(LOCALE_DESCRIPTOR, androidClientInfo.getLocale());
            objectEncoderContext.add(COUNTRY_DESCRIPTOR, androidClientInfo.getCountry());
            objectEncoderContext.add(MCCMNC_DESCRIPTOR, androidClientInfo.getMccMnc());
            objectEncoderContext.add(APPLICATIONBUILD_DESCRIPTOR, androidClientInfo.getApplicationBuild());
        }
    }

    private static final class LogEventEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.LogEvent> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor EVENTTIMEMS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("eventTimeMs");
        private static final com.google.firebase.encoders.FieldDescriptor EVENTCODE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("eventCode");
        private static final com.google.firebase.encoders.FieldDescriptor COMPLIANCEDATA_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("complianceData");
        private static final com.google.firebase.encoders.FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("eventUptimeMs");
        private static final com.google.firebase.encoders.FieldDescriptor SOURCEEXTENSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("sourceExtension");
        private static final com.google.firebase.encoders.FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("sourceExtensionJsonProto3");
        private static final com.google.firebase.encoders.FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("timezoneOffsetSeconds");
        private static final com.google.firebase.encoders.FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("networkConnectionInfo");
        private static final com.google.firebase.encoders.FieldDescriptor EXPERIMENTIDS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("experimentIds");

        private LogEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.LogEvent logEvent, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(EVENTTIMEMS_DESCRIPTOR, logEvent.getEventTimeMs());
            objectEncoderContext.add(EVENTCODE_DESCRIPTOR, logEvent.getEventCode());
            objectEncoderContext.add(COMPLIANCEDATA_DESCRIPTOR, logEvent.getComplianceData());
            objectEncoderContext.add(EVENTUPTIMEMS_DESCRIPTOR, logEvent.getEventUptimeMs());
            objectEncoderContext.add(SOURCEEXTENSION_DESCRIPTOR, logEvent.getSourceExtension());
            objectEncoderContext.add(SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR, logEvent.getSourceExtensionJsonProto3());
            objectEncoderContext.add(TIMEZONEOFFSETSECONDS_DESCRIPTOR, logEvent.getTimezoneOffsetSeconds());
            objectEncoderContext.add(NETWORKCONNECTIONINFO_DESCRIPTOR, logEvent.getNetworkConnectionInfo());
            objectEncoderContext.add(EXPERIMENTIDS_DESCRIPTOR, logEvent.getExperimentIds());
        }
    }

    private static final class ComplianceDataEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ComplianceData> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PRIVACYCONTEXT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("privacyContext");
        private static final com.google.firebase.encoders.FieldDescriptor PRODUCTIDORIGIN_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("productIdOrigin");

        private ComplianceDataEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.ComplianceData complianceData, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PRIVACYCONTEXT_DESCRIPTOR, complianceData.getPrivacyContext());
            objectEncoderContext.add(PRODUCTIDORIGIN_DESCRIPTOR, complianceData.getProductIdOrigin());
        }
    }

    private static final class ExternalPrivacyContextEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ExternalPrivacyContext> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPrivacyContextEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPrivacyContextEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PREQUEST_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("prequest");

        private ExternalPrivacyContextEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PREQUEST_DESCRIPTOR, externalPrivacyContext.getPrequest());
        }
    }

    private static final class ExternalPRequestContextEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ExternalPRequestContext> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPRequestContextEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPRequestContextEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("originAssociatedProductId");

        private ExternalPRequestContextEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.ExternalPRequestContext externalPRequestContext, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR, externalPRequestContext.getOriginAssociatedProductId());
        }
    }

    private static final class NetworkConnectionInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.NetworkConnectionInfo> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor NETWORKTYPE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("networkType");
        private static final com.google.firebase.encoders.FieldDescriptor MOBILESUBTYPE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("mobileSubtype");

        private NetworkConnectionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(NETWORKTYPE_DESCRIPTOR, networkConnectionInfo.getNetworkType());
            objectEncoderContext.add(MOBILESUBTYPE_DESCRIPTOR, networkConnectionInfo.getMobileSubtype());
        }
    }

    private static final class ExperimentIdsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ExperimentIds> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder INSTANCE = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor CLEARBLOB_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("clearBlob");
        private static final com.google.firebase.encoders.FieldDescriptor ENCRYPTEDBLOB_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("encryptedBlob");

        private ExperimentIdsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.cct.internal.ExperimentIds experimentIds, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(CLEARBLOB_DESCRIPTOR, experimentIds.getClearBlob());
            objectEncoderContext.add(ENCRYPTEDBLOB_DESCRIPTOR, experimentIds.getEncryptedBlob());
        }
    }
}
