package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoCrashlyticsReportEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final com.google.firebase.encoders.config.Configurator CONFIG = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder();

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutsStateEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutsStateEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File.class, com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder.INSTANCE);
    }

    private static final class CrashlyticsReportEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor SDKVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("sdkVersion");
        private static final com.google.firebase.encoders.FieldDescriptor GMPAPPID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("gmpAppId");
        private static final com.google.firebase.encoders.FieldDescriptor PLATFORM_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.json.ce.A);
        private static final com.google.firebase.encoders.FieldDescriptor INSTALLATIONUUID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("installationUuid");
        private static final com.google.firebase.encoders.FieldDescriptor FIREBASEINSTALLATIONID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("firebaseInstallationId");
        private static final com.google.firebase.encoders.FieldDescriptor FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("firebaseAuthenticationToken");
        private static final com.google.firebase.encoders.FieldDescriptor APPQUALITYSESSIONID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("appQualitySessionId");
        private static final com.google.firebase.encoders.FieldDescriptor BUILDVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("buildVersion");
        private static final com.google.firebase.encoders.FieldDescriptor DISPLAYVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("displayVersion");
        private static final com.google.firebase.encoders.FieldDescriptor SESSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("session");
        private static final com.google.firebase.encoders.FieldDescriptor NDKPAYLOAD_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("ndkPayload");
        private static final com.google.firebase.encoders.FieldDescriptor APPEXITINFO_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("appExitInfo");

        private CrashlyticsReportEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport crashlyticsReport, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(SDKVERSION_DESCRIPTOR, crashlyticsReport.getSdkVersion());
            objectEncoderContext.add(GMPAPPID_DESCRIPTOR, crashlyticsReport.getGmpAppId());
            objectEncoderContext.add(PLATFORM_DESCRIPTOR, crashlyticsReport.getPlatform());
            objectEncoderContext.add(INSTALLATIONUUID_DESCRIPTOR, crashlyticsReport.getInstallationUuid());
            objectEncoderContext.add(FIREBASEINSTALLATIONID_DESCRIPTOR, crashlyticsReport.getFirebaseInstallationId());
            objectEncoderContext.add(FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR, crashlyticsReport.getFirebaseAuthenticationToken());
            objectEncoderContext.add(APPQUALITYSESSIONID_DESCRIPTOR, crashlyticsReport.getAppQualitySessionId());
            objectEncoderContext.add(BUILDVERSION_DESCRIPTOR, crashlyticsReport.getBuildVersion());
            objectEncoderContext.add(DISPLAYVERSION_DESCRIPTOR, crashlyticsReport.getDisplayVersion());
            objectEncoderContext.add(SESSION_DESCRIPTOR, crashlyticsReport.getSession());
            objectEncoderContext.add(NDKPAYLOAD_DESCRIPTOR, crashlyticsReport.getNdkPayload());
            objectEncoderContext.add(APPEXITINFO_DESCRIPTOR, crashlyticsReport.getAppExitInfo());
        }
    }

    private static final class CrashlyticsReportSessionEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor GENERATOR_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("generator");
        private static final com.google.firebase.encoders.FieldDescriptor IDENTIFIER_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("identifier");
        private static final com.google.firebase.encoders.FieldDescriptor APPQUALITYSESSIONID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("appQualitySessionId");
        private static final com.google.firebase.encoders.FieldDescriptor STARTEDAT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("startedAt");
        private static final com.google.firebase.encoders.FieldDescriptor ENDEDAT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("endedAt");
        private static final com.google.firebase.encoders.FieldDescriptor CRASHED_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("crashed");
        private static final com.google.firebase.encoders.FieldDescriptor APP_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("app");
        private static final com.google.firebase.encoders.FieldDescriptor USER_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("user");
        private static final com.google.firebase.encoders.FieldDescriptor OS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.json.ce.y);
        private static final com.google.firebase.encoders.FieldDescriptor DEVICE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.ironsource.y8.h.G);
        private static final com.google.firebase.encoders.FieldDescriptor EVENTS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("events");
        private static final com.google.firebase.encoders.FieldDescriptor GENERATORTYPE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("generatorType");

        private CrashlyticsReportSessionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(GENERATOR_DESCRIPTOR, session.getGenerator());
            objectEncoderContext.add(IDENTIFIER_DESCRIPTOR, session.getIdentifierUtf8Bytes());
            objectEncoderContext.add(APPQUALITYSESSIONID_DESCRIPTOR, session.getAppQualitySessionId());
            objectEncoderContext.add(STARTEDAT_DESCRIPTOR, session.getStartedAt());
            objectEncoderContext.add(ENDEDAT_DESCRIPTOR, session.getEndedAt());
            objectEncoderContext.add(CRASHED_DESCRIPTOR, session.isCrashed());
            objectEncoderContext.add(APP_DESCRIPTOR, session.getApp());
            objectEncoderContext.add(USER_DESCRIPTOR, session.getUser());
            objectEncoderContext.add(OS_DESCRIPTOR, session.getOs());
            objectEncoderContext.add(DEVICE_DESCRIPTOR, session.getDevice());
            objectEncoderContext.add(EVENTS_DESCRIPTOR, session.getEvents());
            objectEncoderContext.add(GENERATORTYPE_DESCRIPTOR, session.getGeneratorType());
        }
    }

    private static final class CrashlyticsReportSessionApplicationEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor IDENTIFIER_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("identifier");
        private static final com.google.firebase.encoders.FieldDescriptor VERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("version");
        private static final com.google.firebase.encoders.FieldDescriptor DISPLAYVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("displayVersion");
        private static final com.google.firebase.encoders.FieldDescriptor ORGANIZATION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("organization");
        private static final com.google.firebase.encoders.FieldDescriptor INSTALLATIONUUID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("installationUuid");
        private static final com.google.firebase.encoders.FieldDescriptor DEVELOPMENTPLATFORM_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("developmentPlatform");
        private static final com.google.firebase.encoders.FieldDescriptor DEVELOPMENTPLATFORMVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("developmentPlatformVersion");

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application application, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(IDENTIFIER_DESCRIPTOR, application.getIdentifier());
            objectEncoderContext.add(VERSION_DESCRIPTOR, application.getVersion());
            objectEncoderContext.add(DISPLAYVERSION_DESCRIPTOR, application.getDisplayVersion());
            objectEncoderContext.add(ORGANIZATION_DESCRIPTOR, application.getOrganization());
            objectEncoderContext.add(INSTALLATIONUUID_DESCRIPTOR, application.getInstallationUuid());
            objectEncoderContext.add(DEVELOPMENTPLATFORM_DESCRIPTOR, application.getDevelopmentPlatform());
            objectEncoderContext.add(DEVELOPMENTPLATFORMVERSION_DESCRIPTOR, application.getDevelopmentPlatformVersion());
        }
    }

    private static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor CLSID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("clsId");

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(CLSID_DESCRIPTOR, organization.getClsId());
        }
    }

    private static final class CrashlyticsReportSessionUserEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor IDENTIFIER_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("identifier");

        private CrashlyticsReportSessionUserEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(IDENTIFIER_DESCRIPTOR, user.getIdentifier());
        }
    }

    private static final class CrashlyticsReportSessionOperatingSystemEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PLATFORM_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.json.ce.A);
        private static final com.google.firebase.encoders.FieldDescriptor VERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("version");
        private static final com.google.firebase.encoders.FieldDescriptor BUILDVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("buildVersion");
        private static final com.google.firebase.encoders.FieldDescriptor JAILBROKEN_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("jailbroken");

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem operatingSystem, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PLATFORM_DESCRIPTOR, operatingSystem.getPlatform());
            objectEncoderContext.add(VERSION_DESCRIPTOR, operatingSystem.getVersion());
            objectEncoderContext.add(BUILDVERSION_DESCRIPTOR, operatingSystem.getBuildVersion());
            objectEncoderContext.add(JAILBROKEN_DESCRIPTOR, operatingSystem.isJailbroken());
        }
    }

    private static final class CrashlyticsReportSessionDeviceEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor ARCH_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("arch");
        private static final com.google.firebase.encoders.FieldDescriptor MODEL_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.json.ce.v);
        private static final com.google.firebase.encoders.FieldDescriptor CORES_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("cores");
        private static final com.google.firebase.encoders.FieldDescriptor RAM_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("ram");
        private static final com.google.firebase.encoders.FieldDescriptor DISKSPACE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("diskSpace");
        private static final com.google.firebase.encoders.FieldDescriptor SIMULATOR_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("simulator");
        private static final com.google.firebase.encoders.FieldDescriptor STATE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("state");
        private static final com.google.firebase.encoders.FieldDescriptor MANUFACTURER_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("manufacturer");
        private static final com.google.firebase.encoders.FieldDescriptor MODELCLASS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("modelClass");

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(ARCH_DESCRIPTOR, device.getArch());
            objectEncoderContext.add(MODEL_DESCRIPTOR, device.getModel());
            objectEncoderContext.add(CORES_DESCRIPTOR, device.getCores());
            objectEncoderContext.add(RAM_DESCRIPTOR, device.getRam());
            objectEncoderContext.add(DISKSPACE_DESCRIPTOR, device.getDiskSpace());
            objectEncoderContext.add(SIMULATOR_DESCRIPTOR, device.isSimulator());
            objectEncoderContext.add(STATE_DESCRIPTOR, device.getState());
            objectEncoderContext.add(MANUFACTURER_DESCRIPTOR, device.getManufacturer());
            objectEncoderContext.add(MODELCLASS_DESCRIPTOR, device.getModelClass());
        }
    }

    private static final class CrashlyticsReportSessionEventEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor TIMESTAMP_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.ironsource.aa.a.d);
        private static final com.google.firebase.encoders.FieldDescriptor TYPE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("type");
        private static final com.google.firebase.encoders.FieldDescriptor APP_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("app");
        private static final com.google.firebase.encoders.FieldDescriptor DEVICE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.ironsource.y8.h.G);
        private static final com.google.firebase.encoders.FieldDescriptor LOG_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("log");
        private static final com.google.firebase.encoders.FieldDescriptor ROLLOUTS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("rollouts");

        private CrashlyticsReportSessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(TIMESTAMP_DESCRIPTOR, event.getTimestamp());
            objectEncoderContext.add(TYPE_DESCRIPTOR, event.getType());
            objectEncoderContext.add(APP_DESCRIPTOR, event.getApp());
            objectEncoderContext.add(DEVICE_DESCRIPTOR, event.getDevice());
            objectEncoderContext.add(LOG_DESCRIPTOR, event.getLog());
            objectEncoderContext.add(ROLLOUTS_DESCRIPTOR, event.getRollouts());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor EXECUTION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("execution");
        private static final com.google.firebase.encoders.FieldDescriptor CUSTOMATTRIBUTES_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("customAttributes");
        private static final com.google.firebase.encoders.FieldDescriptor INTERNALKEYS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("internalKeys");
        private static final com.google.firebase.encoders.FieldDescriptor BACKGROUND_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("background");
        private static final com.google.firebase.encoders.FieldDescriptor CURRENTPROCESSDETAILS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("currentProcessDetails");
        private static final com.google.firebase.encoders.FieldDescriptor APPPROCESSDETAILS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("appProcessDetails");
        private static final com.google.firebase.encoders.FieldDescriptor UIORIENTATION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("uiOrientation");

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application application, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(EXECUTION_DESCRIPTOR, application.getExecution());
            objectEncoderContext.add(CUSTOMATTRIBUTES_DESCRIPTOR, application.getCustomAttributes());
            objectEncoderContext.add(INTERNALKEYS_DESCRIPTOR, application.getInternalKeys());
            objectEncoderContext.add(BACKGROUND_DESCRIPTOR, application.getBackground());
            objectEncoderContext.add(CURRENTPROCESSDETAILS_DESCRIPTOR, application.getCurrentProcessDetails());
            objectEncoderContext.add(APPPROCESSDETAILS_DESCRIPTOR, application.getAppProcessDetails());
            objectEncoderContext.add(UIORIENTATION_DESCRIPTOR, application.getUiOrientation());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor THREADS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("threads");
        private static final com.google.firebase.encoders.FieldDescriptor EXCEPTION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("exception");
        private static final com.google.firebase.encoders.FieldDescriptor APPEXITINFO_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("appExitInfo");
        private static final com.google.firebase.encoders.FieldDescriptor SIGNAL_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("signal");
        private static final com.google.firebase.encoders.FieldDescriptor BINARIES_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("binaries");

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution execution, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(THREADS_DESCRIPTOR, execution.getThreads());
            objectEncoderContext.add(EXCEPTION_DESCRIPTOR, execution.getException());
            objectEncoderContext.add(APPEXITINFO_DESCRIPTOR, execution.getAppExitInfo());
            objectEncoderContext.add(SIGNAL_DESCRIPTOR, execution.getSignal());
            objectEncoderContext.add(BINARIES_DESCRIPTOR, execution.getBinaries());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor NAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("name");
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("importance");
        private static final com.google.firebase.encoders.FieldDescriptor FRAMES_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("frames");

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread thread, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(NAME_DESCRIPTOR, thread.getName());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, thread.getImportance());
            objectEncoderContext.add(FRAMES_DESCRIPTOR, thread.getFrames());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PC_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("pc");
        private static final com.google.firebase.encoders.FieldDescriptor SYMBOL_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("symbol");
        private static final com.google.firebase.encoders.FieldDescriptor FILE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.ironsource.y8.h.b);
        private static final com.google.firebase.encoders.FieldDescriptor OFFSET_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET);
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("importance");

        private CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PC_DESCRIPTOR, frame.getPc());
            objectEncoderContext.add(SYMBOL_DESCRIPTOR, frame.getSymbol());
            objectEncoderContext.add(FILE_DESCRIPTOR, frame.getFile());
            objectEncoderContext.add(OFFSET_DESCRIPTOR, frame.getOffset());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, frame.getImportance());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor TYPE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("type");
        private static final com.google.firebase.encoders.FieldDescriptor REASON_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("reason");
        private static final com.google.firebase.encoders.FieldDescriptor FRAMES_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("frames");
        private static final com.google.firebase.encoders.FieldDescriptor CAUSEDBY_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("causedBy");
        private static final com.google.firebase.encoders.FieldDescriptor OVERFLOWCOUNT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("overflowCount");

        private CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception exception, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(TYPE_DESCRIPTOR, exception.getType());
            objectEncoderContext.add(REASON_DESCRIPTOR, exception.getReason());
            objectEncoderContext.add(FRAMES_DESCRIPTOR, exception.getFrames());
            objectEncoderContext.add(CAUSEDBY_DESCRIPTOR, exception.getCausedBy());
            objectEncoderContext.add(OVERFLOWCOUNT_DESCRIPTOR, exception.getOverflowCount());
        }
    }

    private static final class CrashlyticsReportApplicationExitInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("pid");
        private static final com.google.firebase.encoders.FieldDescriptor PROCESSNAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("processName");
        private static final com.google.firebase.encoders.FieldDescriptor REASONCODE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("reasonCode");
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("importance");
        private static final com.google.firebase.encoders.FieldDescriptor PSS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("pss");
        private static final com.google.firebase.encoders.FieldDescriptor RSS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("rss");
        private static final com.google.firebase.encoders.FieldDescriptor TIMESTAMP_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.ironsource.aa.a.d);
        private static final com.google.firebase.encoders.FieldDescriptor TRACEFILE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("traceFile");
        private static final com.google.firebase.encoders.FieldDescriptor BUILDIDMAPPINGFORARCH_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("buildIdMappingForArch");

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PID_DESCRIPTOR, applicationExitInfo.getPid());
            objectEncoderContext.add(PROCESSNAME_DESCRIPTOR, applicationExitInfo.getProcessName());
            objectEncoderContext.add(REASONCODE_DESCRIPTOR, applicationExitInfo.getReasonCode());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, applicationExitInfo.getImportance());
            objectEncoderContext.add(PSS_DESCRIPTOR, applicationExitInfo.getPss());
            objectEncoderContext.add(RSS_DESCRIPTOR, applicationExitInfo.getRss());
            objectEncoderContext.add(TIMESTAMP_DESCRIPTOR, applicationExitInfo.getTimestamp());
            objectEncoderContext.add(TRACEFILE_DESCRIPTOR, applicationExitInfo.getTraceFile());
            objectEncoderContext.add(BUILDIDMAPPINGFORARCH_DESCRIPTOR, applicationExitInfo.getBuildIdMappingForArch());
        }
    }

    private static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor ARCH_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("arch");
        private static final com.google.firebase.encoders.FieldDescriptor LIBRARYNAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("libraryName");
        private static final com.google.firebase.encoders.FieldDescriptor BUILDID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("buildId");

        private CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(ARCH_DESCRIPTOR, buildIdMappingForArch.getArch());
            objectEncoderContext.add(LIBRARYNAME_DESCRIPTOR, buildIdMappingForArch.getLibraryName());
            objectEncoderContext.add(BUILDID_DESCRIPTOR, buildIdMappingForArch.getBuildId());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor NAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("name");
        private static final com.google.firebase.encoders.FieldDescriptor CODE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("code");
        private static final com.google.firebase.encoders.FieldDescriptor ADDRESS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(org.jacoco.core.runtime.AgentOptions.ADDRESS);

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal signal, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(NAME_DESCRIPTOR, signal.getName());
            objectEncoderContext.add(CODE_DESCRIPTOR, signal.getCode());
            objectEncoderContext.add(ADDRESS_DESCRIPTOR, signal.getAddress());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor BASEADDRESS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("baseAddress");
        private static final com.google.firebase.encoders.FieldDescriptor SIZE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("size");
        private static final com.google.firebase.encoders.FieldDescriptor NAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("name");
        private static final com.google.firebase.encoders.FieldDescriptor UUID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("uuid");

        private CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(BASEADDRESS_DESCRIPTOR, binaryImage.getBaseAddress());
            objectEncoderContext.add(SIZE_DESCRIPTOR, binaryImage.getSize());
            objectEncoderContext.add(NAME_DESCRIPTOR, binaryImage.getName());
            objectEncoderContext.add(UUID_DESCRIPTOR, binaryImage.getUuidUtf8Bytes());
        }
    }

    private static final class CrashlyticsReportCustomAttributeEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor KEY_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.ironsource.y8.h.W);
        private static final com.google.firebase.encoders.FieldDescriptor VALUE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("value");

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute customAttribute, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(KEY_DESCRIPTOR, customAttribute.getKey());
            objectEncoderContext.add(VALUE_DESCRIPTOR, customAttribute.getValue());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PROCESSNAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("processName");
        private static final com.google.firebase.encoders.FieldDescriptor PID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("pid");
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("importance");
        private static final com.google.firebase.encoders.FieldDescriptor DEFAULTPROCESS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("defaultProcess");

        private CrashlyticsReportSessionEventApplicationProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PROCESSNAME_DESCRIPTOR, processDetails.getProcessName());
            objectEncoderContext.add(PID_DESCRIPTOR, processDetails.getPid());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, processDetails.getImportance());
            objectEncoderContext.add(DEFAULTPROCESS_DESCRIPTOR, processDetails.isDefaultProcess());
        }
    }

    private static final class CrashlyticsReportSessionEventDeviceEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventDeviceEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor BATTERYLEVEL_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.ironsource.y8.i.Y);
        private static final com.google.firebase.encoders.FieldDescriptor BATTERYVELOCITY_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("batteryVelocity");
        private static final com.google.firebase.encoders.FieldDescriptor PROXIMITYON_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("proximityOn");
        private static final com.google.firebase.encoders.FieldDescriptor ORIENTATION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("orientation");
        private static final com.google.firebase.encoders.FieldDescriptor RAMUSED_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("ramUsed");
        private static final com.google.firebase.encoders.FieldDescriptor DISKUSED_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("diskUsed");

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device device, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(BATTERYLEVEL_DESCRIPTOR, device.getBatteryLevel());
            objectEncoderContext.add(BATTERYVELOCITY_DESCRIPTOR, device.getBatteryVelocity());
            objectEncoderContext.add(PROXIMITYON_DESCRIPTOR, device.isProximityOn());
            objectEncoderContext.add(ORIENTATION_DESCRIPTOR, device.getOrientation());
            objectEncoderContext.add(RAMUSED_DESCRIPTOR, device.getRamUsed());
            objectEncoderContext.add(DISKUSED_DESCRIPTOR, device.getDiskUsed());
        }
    }

    private static final class CrashlyticsReportSessionEventLogEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor CONTENT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("content");

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(CONTENT_DESCRIPTOR, log.getContent());
        }
    }

    private static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutsStateEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutsStateEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor ASSIGNMENTS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("assignments");

        private CrashlyticsReportSessionEventRolloutsStateEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rolloutsState, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(ASSIGNMENTS_DESCRIPTOR, rolloutsState.getRolloutAssignments());
        }
    }

    private static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor ROLLOUTVARIANT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("rolloutVariant");
        private static final com.google.firebase.encoders.FieldDescriptor PARAMETERKEY_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("parameterKey");
        private static final com.google.firebase.encoders.FieldDescriptor PARAMETERVALUE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("parameterValue");
        private static final com.google.firebase.encoders.FieldDescriptor TEMPLATEVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("templateVersion");

        private CrashlyticsReportSessionEventRolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(ROLLOUTVARIANT_DESCRIPTOR, rolloutAssignment.getRolloutVariant());
            objectEncoderContext.add(PARAMETERKEY_DESCRIPTOR, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(PARAMETERVALUE_DESCRIPTOR, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(TEMPLATEVERSION_DESCRIPTOR, rolloutAssignment.getTemplateVersion());
        }
    }

    private static final class CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor ROLLOUTID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("rolloutId");
        private static final com.google.firebase.encoders.FieldDescriptor VARIANTID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("variantId");

        private CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(ROLLOUTID_DESCRIPTOR, rolloutVariant.getRolloutId());
            objectEncoderContext.add(VARIANTID_DESCRIPTOR, rolloutVariant.getVariantId());
        }
    }

    private static final class CrashlyticsReportFilesPayloadEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor FILES_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("files");
        private static final com.google.firebase.encoders.FieldDescriptor ORGID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("orgId");

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(FILES_DESCRIPTOR, filesPayload.getFiles());
            objectEncoderContext.add(ORGID_DESCRIPTOR, filesPayload.getOrgId());
        }
    }

    private static final class CrashlyticsReportFilesPayloadFileEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> {
        static final com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder INSTANCE = new com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor FILENAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("filename");
        private static final com.google.firebase.encoders.FieldDescriptor CONTENTS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("contents");

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File file, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(FILENAME_DESCRIPTOR, file.getFilename());
            objectEncoderContext.add(CONTENTS_DESCRIPTOR, file.getContents());
        }
    }
}
