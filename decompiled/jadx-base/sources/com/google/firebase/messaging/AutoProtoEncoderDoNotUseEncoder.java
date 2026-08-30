package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final com.google.firebase.encoders.config.Configurator CONFIG = new com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder();

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(com.google.firebase.messaging.ProtoEncoderDoNotUse.class, com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.messaging.reporting.MessagingClientEventExtension.class, com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.MessagingClientEventExtensionEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.messaging.reporting.MessagingClientEvent.class, com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.MessagingClientEventEncoder.INSTANCE);
    }

    private static final class ProtoEncoderDoNotUseEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.messaging.ProtoEncoderDoNotUse> {
        static final com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder INSTANCE = new com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor MESSAGINGCLIENTEVENTEXTENSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("messagingClientEventExtension");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.messaging.ProtoEncoderDoNotUse protoEncoderDoNotUse, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(MESSAGINGCLIENTEVENTEXTENSION_DESCRIPTOR, protoEncoderDoNotUse.getMessagingClientEventExtension());
        }
    }

    private static final class MessagingClientEventExtensionEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.messaging.reporting.MessagingClientEventExtension> {
        static final com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.MessagingClientEventExtensionEncoder INSTANCE = new com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.MessagingClientEventExtensionEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor MESSAGINGCLIENTEVENT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("messagingClientEvent").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(1).build()).build();

        private MessagingClientEventExtensionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.messaging.reporting.MessagingClientEventExtension messagingClientEventExtension, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(MESSAGINGCLIENTEVENT_DESCRIPTOR, messagingClientEventExtension.getMessagingClientEventInternal());
        }
    }

    private static final class MessagingClientEventEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.messaging.reporting.MessagingClientEvent> {
        static final com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.MessagingClientEventEncoder INSTANCE = new com.google.firebase.messaging.AutoProtoEncoderDoNotUseEncoder.MessagingClientEventEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PROJECTNUMBER_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("projectNumber").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(1).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor MESSAGEID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("messageId").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(2).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor INSTANCEID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("instanceId").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(3).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor MESSAGETYPE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("messageType").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(4).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor SDKPLATFORM_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("sdkPlatform").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(5).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor PACKAGENAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME).withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(6).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor COLLAPSEKEY_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("collapseKey").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(7).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor PRIORITY_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(8).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor TTL_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("ttl").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(9).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor TOPIC_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("topic").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(10).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor BULKID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("bulkId").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(11).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor EVENT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder(androidx.core.app.NotificationCompat.CATEGORY_EVENT).withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(12).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor ANALYTICSLABEL_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("analyticsLabel").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(13).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor CAMPAIGNID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("campaignId").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(14).build()).build();
        private static final com.google.firebase.encoders.FieldDescriptor COMPOSERLABEL_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.builder("composerLabel").withProperty(com.google.firebase.encoders.proto.AtProtobuf.builder().tag(15).build()).build();

        private MessagingClientEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.messaging.reporting.MessagingClientEvent messagingClientEvent, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PROJECTNUMBER_DESCRIPTOR, messagingClientEvent.getProjectNumber());
            objectEncoderContext.add(MESSAGEID_DESCRIPTOR, messagingClientEvent.getMessageId());
            objectEncoderContext.add(INSTANCEID_DESCRIPTOR, messagingClientEvent.getInstanceId());
            objectEncoderContext.add(MESSAGETYPE_DESCRIPTOR, messagingClientEvent.getMessageType());
            objectEncoderContext.add(SDKPLATFORM_DESCRIPTOR, messagingClientEvent.getSdkPlatform());
            objectEncoderContext.add(PACKAGENAME_DESCRIPTOR, messagingClientEvent.getPackageName());
            objectEncoderContext.add(COLLAPSEKEY_DESCRIPTOR, messagingClientEvent.getCollapseKey());
            objectEncoderContext.add(PRIORITY_DESCRIPTOR, messagingClientEvent.getPriority());
            objectEncoderContext.add(TTL_DESCRIPTOR, messagingClientEvent.getTtl());
            objectEncoderContext.add(TOPIC_DESCRIPTOR, messagingClientEvent.getTopic());
            objectEncoderContext.add(BULKID_DESCRIPTOR, messagingClientEvent.getBulkId());
            objectEncoderContext.add(EVENT_DESCRIPTOR, messagingClientEvent.getEvent());
            objectEncoderContext.add(ANALYTICSLABEL_DESCRIPTOR, messagingClientEvent.getAnalyticsLabel());
            objectEncoderContext.add(CAMPAIGNID_DESCRIPTOR, messagingClientEvent.getCampaignId());
            objectEncoderContext.add(COMPOSERLABEL_DESCRIPTOR, messagingClientEvent.getComposerLabel());
        }
    }
}
