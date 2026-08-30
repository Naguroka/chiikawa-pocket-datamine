package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final com.google.firebase.encoders.config.Configurator CONFIG = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder();

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.ProtoEncoderDoNotUse.class, com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.class, com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.TimeWindow.class, com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.class, com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.class, com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.class, com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.class, com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder.INSTANCE);
    }

    private static final class ProtoEncoderDoNotUseEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.ProtoEncoderDoNotUse> {
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder INSTANCE = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor CLIENTMETRICS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("clientMetrics");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.runtime.ProtoEncoderDoNotUse protoEncoderDoNotUse, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(CLIENTMETRICS_DESCRIPTOR, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    private static final class ClientMetricsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.ClientMetrics> {
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder INSTANCE = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor WINDOW_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("window").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(1).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCEMETRICS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("logSourceMetrics").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(2).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor GLOBALMETRICS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("globalMetrics").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(3).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor APPNAMESPACE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("appNamespace").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(4).build()).build();

        private ClientMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.runtime.firebase.transport.ClientMetrics clientMetrics, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(WINDOW_DESCRIPTOR, clientMetrics.getWindowInternal());
            objectEncoderContext.add(LOGSOURCEMETRICS_DESCRIPTOR, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(GLOBALMETRICS_DESCRIPTOR, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(APPNAMESPACE_DESCRIPTOR, clientMetrics.getAppNamespace());
        }
    }

    private static final class TimeWindowEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.TimeWindow> {
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder INSTANCE = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor STARTMS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("startMs").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(1).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor ENDMS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("endMs").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(2).build()).build();

        private TimeWindowEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.runtime.firebase.transport.TimeWindow timeWindow, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(STARTMS_DESCRIPTOR, timeWindow.getStartMs());
            objectEncoderContext.add(ENDMS_DESCRIPTOR, timeWindow.getEndMs());
        }
    }

    private static final class LogSourceMetricsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> {
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder INSTANCE = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("logSource").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(1).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor LOGEVENTDROPPED_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("logEventDropped").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(2).build()).build();

        private LogSourceMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics logSourceMetrics, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(LOGSOURCE_DESCRIPTOR, logSourceMetrics.getLogSource());
            objectEncoderContext.add(LOGEVENTDROPPED_DESCRIPTOR, logSourceMetrics.getLogEventDroppedList());
        }
    }

    private static final class LogEventDroppedEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> {
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder INSTANCE = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor EVENTSDROPPEDCOUNT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("eventsDroppedCount").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(1).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor REASON_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("reason").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(3).build()).build();

        private LogEventDroppedEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.runtime.firebase.transport.LogEventDropped logEventDropped, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(EVENTSDROPPEDCOUNT_DESCRIPTOR, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(REASON_DESCRIPTOR, logEventDropped.getReason());
        }
    }

    private static final class GlobalMetricsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics> {
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder INSTANCE = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor STORAGEMETRICS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("storageMetrics").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(1).build()).build();

        private GlobalMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics globalMetrics, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(STORAGEMETRICS_DESCRIPTOR, globalMetrics.getStorageMetricsInternal());
        }
    }

    private static final class StorageMetricsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.StorageMetrics> {
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder INSTANCE = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor CURRENTCACHESIZEBYTES_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("currentCacheSizeBytes").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(1).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor MAXCACHESIZEBYTES_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("maxCacheSizeBytes").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(2).build()).build();

        private StorageMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.android.datatransport.runtime.firebase.transport.StorageMetrics storageMetrics, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(CURRENTCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(MAXCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getMaxCacheSizeBytes());
        }
    }
}
