package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoSessionEventEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final com.google.firebase.encoders.config.Configurator CONFIG = new com.google.firebase.sessions.AutoSessionEventEncoder();

    private AutoSessionEventEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(com.google.firebase.sessions.SessionEvent.class, com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.sessions.SessionInfo.class, com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.sessions.DataCollectionStatus.class, com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.sessions.ApplicationInfo.class, com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.sessions.AndroidApplicationInfo.class, com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.sessions.ProcessDetails.class, com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder.INSTANCE);
    }

    private static final class SessionEventEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.SessionEvent> {
        static final com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder INSTANCE = new com.google.firebase.sessions.AutoSessionEventEncoder.SessionEventEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor EVENTTYPE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("eventType");
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONDATA_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("sessionData");
        private static final com.google.firebase.encoders.FieldDescriptor APPLICATIONINFO_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("applicationInfo");

        private SessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.sessions.SessionEvent sessionEvent, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(EVENTTYPE_DESCRIPTOR, sessionEvent.getEventType());
            objectEncoderContext.add(SESSIONDATA_DESCRIPTOR, sessionEvent.getSessionData());
            objectEncoderContext.add(APPLICATIONINFO_DESCRIPTOR, sessionEvent.getApplicationInfo());
        }
    }

    private static final class SessionInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.SessionInfo> {
        static final com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder INSTANCE = new com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY);
        private static final com.google.firebase.encoders.FieldDescriptor FIRSTSESSIONID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("firstSessionId");
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONINDEX_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("sessionIndex");
        private static final com.google.firebase.encoders.FieldDescriptor EVENTTIMESTAMPUS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("eventTimestampUs");
        private static final com.google.firebase.encoders.FieldDescriptor DATACOLLECTIONSTATUS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("dataCollectionStatus");
        private static final com.google.firebase.encoders.FieldDescriptor FIREBASEINSTALLATIONID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("firebaseInstallationId");
        private static final com.google.firebase.encoders.FieldDescriptor FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("firebaseAuthenticationToken");

        private SessionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.sessions.SessionInfo sessionInfo, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(SESSIONID_DESCRIPTOR, sessionInfo.getSessionId());
            objectEncoderContext.add(FIRSTSESSIONID_DESCRIPTOR, sessionInfo.getFirstSessionId());
            objectEncoderContext.add(SESSIONINDEX_DESCRIPTOR, sessionInfo.getSessionIndex());
            objectEncoderContext.add(EVENTTIMESTAMPUS_DESCRIPTOR, sessionInfo.getEventTimestampUs());
            objectEncoderContext.add(DATACOLLECTIONSTATUS_DESCRIPTOR, sessionInfo.getDataCollectionStatus());
            objectEncoderContext.add(FIREBASEINSTALLATIONID_DESCRIPTOR, sessionInfo.getFirebaseInstallationId());
            objectEncoderContext.add(FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR, sessionInfo.getFirebaseAuthenticationToken());
        }
    }

    private static final class DataCollectionStatusEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.DataCollectionStatus> {
        static final com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder INSTANCE = new com.google.firebase.sessions.AutoSessionEventEncoder.DataCollectionStatusEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PERFORMANCE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("performance");
        private static final com.google.firebase.encoders.FieldDescriptor CRASHLYTICS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("crashlytics");
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONSAMPLINGRATE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("sessionSamplingRate");

        private DataCollectionStatusEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.sessions.DataCollectionStatus dataCollectionStatus, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PERFORMANCE_DESCRIPTOR, dataCollectionStatus.getPerformance());
            objectEncoderContext.add(CRASHLYTICS_DESCRIPTOR, dataCollectionStatus.getCrashlytics());
            objectEncoderContext.add(SESSIONSAMPLINGRATE_DESCRIPTOR, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    private static final class ApplicationInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.ApplicationInfo> {
        static final com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder INSTANCE = new com.google.firebase.sessions.AutoSessionEventEncoder.ApplicationInfoEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor APPID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("appId");
        private static final com.google.firebase.encoders.FieldDescriptor DEVICEMODEL_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.ironsource.y8.i.l);
        private static final com.google.firebase.encoders.FieldDescriptor SESSIONSDKVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("sessionSdkVersion");
        private static final com.google.firebase.encoders.FieldDescriptor OSVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("osVersion");
        private static final com.google.firebase.encoders.FieldDescriptor LOGENVIRONMENT_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("logEnvironment");
        private static final com.google.firebase.encoders.FieldDescriptor ANDROIDAPPINFO_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("androidAppInfo");

        private ApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.sessions.ApplicationInfo applicationInfo, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(APPID_DESCRIPTOR, applicationInfo.getAppId());
            objectEncoderContext.add(DEVICEMODEL_DESCRIPTOR, applicationInfo.getDeviceModel());
            objectEncoderContext.add(SESSIONSDKVERSION_DESCRIPTOR, applicationInfo.getSessionSdkVersion());
            objectEncoderContext.add(OSVERSION_DESCRIPTOR, applicationInfo.getOsVersion());
            objectEncoderContext.add(LOGENVIRONMENT_DESCRIPTOR, applicationInfo.getLogEnvironment());
            objectEncoderContext.add(ANDROIDAPPINFO_DESCRIPTOR, applicationInfo.getAndroidAppInfo());
        }
    }

    private static final class AndroidApplicationInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.AndroidApplicationInfo> {
        static final com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder INSTANCE = new com.google.firebase.sessions.AutoSessionEventEncoder.AndroidApplicationInfoEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PACKAGENAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        private static final com.google.firebase.encoders.FieldDescriptor VERSIONNAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("versionName");
        private static final com.google.firebase.encoders.FieldDescriptor APPBUILDVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("appBuildVersion");
        private static final com.google.firebase.encoders.FieldDescriptor DEVICEMANUFACTURER_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("deviceManufacturer");
        private static final com.google.firebase.encoders.FieldDescriptor CURRENTPROCESSDETAILS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("currentProcessDetails");
        private static final com.google.firebase.encoders.FieldDescriptor APPPROCESSDETAILS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("appProcessDetails");

        private AndroidApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.sessions.AndroidApplicationInfo androidApplicationInfo, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PACKAGENAME_DESCRIPTOR, androidApplicationInfo.getPackageName());
            objectEncoderContext.add(VERSIONNAME_DESCRIPTOR, androidApplicationInfo.getVersionName());
            objectEncoderContext.add(APPBUILDVERSION_DESCRIPTOR, androidApplicationInfo.getAppBuildVersion());
            objectEncoderContext.add(DEVICEMANUFACTURER_DESCRIPTOR, androidApplicationInfo.getDeviceManufacturer());
            objectEncoderContext.add(CURRENTPROCESSDETAILS_DESCRIPTOR, androidApplicationInfo.getCurrentProcessDetails());
            objectEncoderContext.add(APPPROCESSDETAILS_DESCRIPTOR, androidApplicationInfo.getAppProcessDetails());
        }
    }

    private static final class ProcessDetailsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.sessions.ProcessDetails> {
        static final com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder INSTANCE = new com.google.firebase.sessions.AutoSessionEventEncoder.ProcessDetailsEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor PROCESSNAME_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("processName");
        private static final com.google.firebase.encoders.FieldDescriptor PID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("pid");
        private static final com.google.firebase.encoders.FieldDescriptor IMPORTANCE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("importance");
        private static final com.google.firebase.encoders.FieldDescriptor DEFAULTPROCESS_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("defaultProcess");

        private ProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.sessions.ProcessDetails processDetails, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(PROCESSNAME_DESCRIPTOR, processDetails.getProcessName());
            objectEncoderContext.add(PID_DESCRIPTOR, processDetails.getPid());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, processDetails.getImportance());
            objectEncoderContext.add(DEFAULTPROCESS_DESCRIPTOR, processDetails.isDefaultProcess());
        }
    }
}
