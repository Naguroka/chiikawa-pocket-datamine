package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.encoders.annotations.Encodable
public abstract class CrashlyticsReport {
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Architecture {
        public static final int ARM64 = 9;
        public static final int ARMV6 = 5;
        public static final int ARMV7 = 6;
        public static final int UNKNOWN = 7;
        public static final int X86_32 = 0;
        public static final int X86_64 = 1;
    }

    public static abstract class Builder {
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport build();

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setAppExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setAppQualitySessionId(java.lang.String str);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setBuildVersion(java.lang.String str);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setDisplayVersion(java.lang.String str);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setFirebaseAuthenticationToken(java.lang.String str);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setFirebaseInstallationId(java.lang.String str);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setGmpAppId(java.lang.String str);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setInstallationUuid(java.lang.String str);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setNdkPayload(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setPlatform(int i);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSdkVersion(java.lang.String str);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSession(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session);
    }

    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getAppExitInfo();

    public abstract java.lang.String getAppQualitySessionId();

    public abstract java.lang.String getBuildVersion();

    public abstract java.lang.String getDisplayVersion();

    public abstract java.lang.String getFirebaseAuthenticationToken();

    public abstract java.lang.String getFirebaseInstallationId();

    public abstract java.lang.String getGmpAppId();

    public abstract java.lang.String getInstallationUuid();

    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload getNdkPayload();

    public abstract int getPlatform();

    public abstract java.lang.String getSdkVersion();

    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session getSession();

    protected abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder toBuilder();

    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder builder() {
        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder();
    }

    @com.google.firebase.encoders.annotations.Encodable.Ignore
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Type getType() {
        if (getSession() != null) {
            return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Type.JAVA;
        }
        if (getNdkPayload() != null) {
            return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Type.NATIVE;
        }
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Type.INCOMPLETE;
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withEvents(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> list) {
        if (getSession() == null) {
            throw new java.lang.IllegalStateException("Reports without sessions cannot have events added to them.");
        }
        return toBuilder().setSession(getSession().withEvents(list)).build();
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withOrganizationId(java.lang.String str) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder builder = toBuilder();
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload ndkPayload = getNdkPayload();
        if (ndkPayload != null) {
            builder.setNdkPayload(ndkPayload.toBuilder().setOrgId(str).build());
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session = getSession();
        if (session != null) {
            builder.setSession(session.withOrganizationId(str));
        }
        return builder.build();
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withNdkPayload(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload) {
        return toBuilder().setSession(null).setNdkPayload(filesPayload).build();
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withApplicationExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo == null ? this : toBuilder().setAppExitInfo(applicationExitInfo).build();
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withSessionEndFields(long j, boolean z, java.lang.String str) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder builder = toBuilder();
        if (getSession() != null) {
            builder.setSession(getSession().withSessionEndFields(j, z, str));
        }
        return builder.build();
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withAppQualitySessionId(java.lang.String str) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder appQualitySessionId = toBuilder().setAppQualitySessionId(str);
        if (getSession() != null) {
            appQualitySessionId.setSession(getSession().withAppQualitySessionId(str));
        }
        return appQualitySessionId.build();
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withFirebaseInstallationId(java.lang.String str) {
        return toBuilder().setFirebaseInstallationId(str).build();
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withFirebaseAuthenticationToken(java.lang.String str) {
        return toBuilder().setFirebaseAuthenticationToken(str).build();
    }

    public static abstract class FilesPayload {

        public static abstract class Builder {
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload build();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setFiles(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> list);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setOrgId(java.lang.String str);
        }

        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> getFiles();

        public abstract java.lang.String getOrgId();

        abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder toBuilder();

        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder builder() {
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload.Builder();
        }

        public static abstract class File {

            public static abstract class Builder {
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setFilename(java.lang.String str);
            }

            public abstract byte[] getContents();

            public abstract java.lang.String getFilename();

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder builder() {
                return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File.Builder();
            }
        }
    }

    public static abstract class CustomAttribute {

        public static abstract class Builder {
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute build();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setKey(java.lang.String str);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setValue(java.lang.String str);
        }

        public abstract java.lang.String getKey();

        public abstract java.lang.String getValue();

        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder builder() {
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute.Builder();
        }
    }

    public static abstract class Session {
        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application getApp();

        public abstract java.lang.String getAppQualitySessionId();

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device getDevice();

        public abstract java.lang.Long getEndedAt();

        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> getEvents();

        public abstract java.lang.String getGenerator();

        public abstract int getGeneratorType();

        @com.google.firebase.encoders.annotations.Encodable.Ignore
        public abstract java.lang.String getIdentifier();

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem getOs();

        public abstract long getStartedAt();

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User getUser();

        public abstract boolean isCrashed();

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder toBuilder();

        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder builder() {
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.Builder().setCrashed(false);
        }

        @com.google.firebase.encoders.annotations.Encodable.Field(name = "identifier")
        public byte[] getIdentifierUtf8Bytes() {
            return getIdentifier().getBytes(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.UTF_8);
        }

        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session withEvents(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> list) {
            return toBuilder().setEvents(list).build();
        }

        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session withOrganizationId(java.lang.String str) {
            return toBuilder().setApp(getApp().withOrganizationId(str)).build();
        }

        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session withSessionEndFields(long j, boolean z, java.lang.String str) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder builder = toBuilder();
            builder.setEndedAt(java.lang.Long.valueOf(j));
            builder.setCrashed(z);
            if (str != null) {
                builder.setUser(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.builder().setIdentifier(str).build());
            }
            return builder.build();
        }

        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session withAppQualitySessionId(java.lang.String str) {
            return toBuilder().setAppQualitySessionId(str).build();
        }

        public static abstract class Builder {
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session build();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setApp(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application application);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setAppQualitySessionId(java.lang.String str);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setCrashed(boolean z);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setDevice(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEndedAt(java.lang.Long l);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEvents(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> list);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGenerator(java.lang.String str);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGeneratorType(int i);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setIdentifier(java.lang.String str);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setOs(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem operatingSystem);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setStartedAt(long j);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setUser(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User user);

            public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setIdentifierFromUtf8Bytes(byte[] bArr) {
                return setIdentifier(new java.lang.String(bArr, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.UTF_8));
            }
        }

        public static abstract class User {

            public static abstract class Builder {
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder setIdentifier(java.lang.String str);
            }

            public abstract java.lang.String getIdentifier();

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder builder() {
                return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User.Builder();
            }
        }

        public static abstract class Application {

            public static abstract class Builder {
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDisplayVersion(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setIdentifier(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setInstallationUuid(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setOrganization(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setVersion(java.lang.String str);
            }

            public abstract java.lang.String getDevelopmentPlatform();

            public abstract java.lang.String getDevelopmentPlatformVersion();

            public abstract java.lang.String getDisplayVersion();

            public abstract java.lang.String getIdentifier();

            public abstract java.lang.String getInstallationUuid();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization getOrganization();

            public abstract java.lang.String getVersion();

            protected abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder toBuilder();

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder builder() {
                return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application.Builder();
            }

            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application withOrganizationId(java.lang.String str) {
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization = getOrganization();
                return toBuilder().setOrganization((organization != null ? organization.toBuilder() : com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.builder()).setClsId(str).build()).build();
            }

            public static abstract class Organization {

                public static abstract class Builder {
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder setClsId(java.lang.String str);
                }

                public abstract java.lang.String getClsId();

                protected abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder toBuilder();

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder builder() {
                    return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization.Builder();
                }
            }
        }

        public static abstract class OperatingSystem {

            public static abstract class Builder {
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean z);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int i);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setVersion(java.lang.String str);
            }

            public abstract java.lang.String getBuildVersion();

            public abstract int getPlatform();

            public abstract java.lang.String getVersion();

            public abstract boolean isJailbroken();

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder builder() {
                return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder();
            }
        }

        public static abstract class Device {

            public static abstract class Builder {
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setArch(int i);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setCores(int i);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setDiskSpace(long j);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setManufacturer(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModel(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModelClass(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setRam(long j);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setSimulator(boolean z);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setState(int i);
            }

            public abstract int getArch();

            public abstract int getCores();

            public abstract long getDiskSpace();

            public abstract java.lang.String getManufacturer();

            public abstract java.lang.String getModel();

            public abstract java.lang.String getModelClass();

            public abstract long getRam();

            public abstract int getState();

            public abstract boolean isSimulator();

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder builder() {
                return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device.Builder();
            }
        }

        public static abstract class Event {

            public static abstract class Builder {
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setApp(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application application);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setDevice(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device device);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setLog(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log log);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setRollouts(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState rolloutsState);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setTimestamp(long j);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setType(java.lang.String str);
            }

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application getApp();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device getDevice();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log getLog();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState getRollouts();

            public abstract long getTimestamp();

            public abstract java.lang.String getType();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder toBuilder();

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder builder() {
                return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.Builder();
            }

            public static abstract class Application {

                public static abstract class Builder {
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> list);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setBackground(java.lang.Boolean bool);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setExecution(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution execution);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> list);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i);
                }

                public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails();

                public abstract java.lang.Boolean getBackground();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails();

                public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getCustomAttributes();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution getExecution();

                public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getInternalKeys();

                public abstract int getUiOrientation();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder toBuilder();

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder builder() {
                    return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application.Builder();
                }

                public static abstract class Execution {

                    public static abstract class Builder {
                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution build();

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setAppExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> list);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setException(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception exception);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal signal);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread> list);
                    }

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getAppExitInfo();

                    public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> getBinaries();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception getException();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal getSignal();

                    public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread> getThreads();

                    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder builder() {
                        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder();
                    }

                    public static abstract class Thread {

                        public static abstract class Builder {
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread build();

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(java.lang.String str);
                        }

                        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames();

                        public abstract int getImportance();

                        public abstract java.lang.String getName();

                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builder() {
                            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.Builder();
                        }

                        public static abstract class Frame {

                            public static abstract class Builder {
                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build();

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(java.lang.String str);

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i);

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j);

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j);

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(java.lang.String str);
                            }

                            public abstract java.lang.String getFile();

                            public abstract int getImportance();

                            public abstract long getOffset();

                            public abstract long getPc();

                            public abstract java.lang.String getSymbol();

                            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder() {
                                return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.Builder();
                            }
                        }
                    }

                    public static abstract class Exception {

                        public static abstract class Builder {
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception build();

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception exception);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int i);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(java.lang.String str);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(java.lang.String str);
                        }

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy();

                        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames();

                        public abstract int getOverflowCount();

                        public abstract java.lang.String getReason();

                        public abstract java.lang.String getType();

                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder() {
                            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.Builder();
                        }
                    }

                    public static abstract class Signal {

                        public static abstract class Builder {
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal build();

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(java.lang.String str);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(java.lang.String str);
                        }

                        public abstract long getAddress();

                        public abstract java.lang.String getCode();

                        public abstract java.lang.String getName();

                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder() {
                            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.Builder();
                        }
                    }

                    public static abstract class BinaryImage {
                        public abstract long getBaseAddress();

                        public abstract java.lang.String getName();

                        public abstract long getSize();

                        @com.google.firebase.encoders.annotations.Encodable.Ignore
                        public abstract java.lang.String getUuid();

                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builder() {
                            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.Builder();
                        }

                        @com.google.firebase.encoders.annotations.Encodable.Field(name = "uuid")
                        public byte[] getUuidUtf8Bytes() {
                            java.lang.String uuid = getUuid();
                            if (uuid != null) {
                                return uuid.getBytes(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.UTF_8);
                            }
                            return null;
                        }

                        public static abstract class Builder {
                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build();

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(java.lang.String str);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(java.lang.String str);

                            public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuidFromUtf8Bytes(byte[] bArr) {
                                return setUuid(new java.lang.String(bArr, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.UTF_8));
                            }
                        }
                    }
                }

                public static abstract class ProcessDetails {

                    public static abstract class Builder {
                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails build();

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean z);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int i);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int i);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(java.lang.String str);
                    }

                    public abstract int getImportance();

                    public abstract int getPid();

                    public abstract java.lang.String getProcessName();

                    public abstract boolean isDefaultProcess();

                    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builder() {
                        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.Builder();
                    }
                }
            }

            public static abstract class Device {

                public static abstract class Builder {
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(java.lang.Double d);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j);
                }

                public abstract java.lang.Double getBatteryLevel();

                public abstract int getBatteryVelocity();

                public abstract long getDiskUsed();

                public abstract int getOrientation();

                public abstract long getRamUsed();

                public abstract boolean isProximityOn();

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder builder() {
                    return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device.Builder();
                }
            }

            public static abstract class Log {

                public static abstract class Builder {
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder setContent(java.lang.String str);
                }

                public abstract java.lang.String getContent();

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder builder() {
                    return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log.Builder();
                }
            }

            public static abstract class RolloutsState {

                public static abstract class Builder {
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> list);
                }

                @com.google.firebase.encoders.annotations.Encodable.Field(name = "assignments")
                public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments();

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder builder() {
                    return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState.Builder();
                }
            }

            public static abstract class RolloutAssignment {

                public static abstract class Builder {
                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(java.lang.String str);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(java.lang.String str);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j);
                }

                public abstract java.lang.String getParameterKey();

                public abstract java.lang.String getParameterValue();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant();

                public abstract long getTemplateVersion();

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder builder() {
                    return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.Builder();
                }

                public static abstract class RolloutVariant {

                    public static abstract class Builder {
                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build();

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(java.lang.String str);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(java.lang.String str);
                    }

                    public abstract java.lang.String getRolloutId();

                    public abstract java.lang.String getVariantId();

                    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builder() {
                        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.Builder();
                    }
                }
            }
        }
    }

    public static abstract class ApplicationExitInfo {

        public static abstract class Builder {
            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo build();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(java.lang.String str);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(java.lang.String str);
        }

        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch();

        public abstract int getImportance();

        public abstract int getPid();

        public abstract java.lang.String getProcessName();

        public abstract long getPss();

        public abstract int getReasonCode();

        public abstract long getRss();

        public abstract long getTimestamp();

        public abstract java.lang.String getTraceFile();

        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder builder() {
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo.Builder();
        }

        public static abstract class BuildIdMappingForArch {

            public static abstract class Builder {
                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(java.lang.String str);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(java.lang.String str);
            }

            public abstract java.lang.String getArch();

            public abstract java.lang.String getBuildId();

            public abstract java.lang.String getLibraryName();

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder builder() {
                return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.Builder();
            }
        }
    }
}
