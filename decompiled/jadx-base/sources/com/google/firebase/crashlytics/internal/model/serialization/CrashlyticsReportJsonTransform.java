package com.google.firebase.crashlytics.internal.model.serialization;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsReportJsonTransform {
    private static final com.google.firebase.encoders.DataEncoder CRASHLYTICS_REPORT_JSON_ENCODER = new com.google.firebase.encoders.json.JsonDataEncoderBuilder().configureWith(com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CONFIG).ignoreNullValues(true).build();

    /* JADX INFO: Access modifiers changed from: private */
    interface ObjectParser<T> {
        T parse(android.util.JsonReader jsonReader) throws java.io.IOException;
    }

    public java.lang.String reportToJson(com.google.firebase.crashlytics.internal.model.CrashlyticsReport crashlyticsReport) {
        return CRASHLYTICS_REPORT_JSON_ENCODER.encode(crashlyticsReport);
    }

    public java.lang.String eventToJson(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event) {
        return CRASHLYTICS_REPORT_JSON_ENCODER.encode(event);
    }

    public java.lang.String applicationExitInfoToJson(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CRASHLYTICS_REPORT_JSON_ENCODER.encode(applicationExitInfo);
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport reportFromJson(java.lang.String str) throws java.io.IOException {
        try {
            android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(str));
            try {
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport report = parseReport(jsonReader);
                jsonReader.close();
                return report;
            } catch (java.lang.Throwable th) {
                try {
                    jsonReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.IllegalStateException e) {
            throw new java.io.IOException(e);
        }
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event eventFromJson(java.lang.String str) throws java.io.IOException {
        try {
            android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(str));
            try {
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event event = parseEvent(jsonReader);
                jsonReader.close();
                return event;
            } catch (java.lang.Throwable th) {
                try {
                    jsonReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.IllegalStateException e) {
            throw new java.io.IOException(e);
        }
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfoFromJson(java.lang.String str) throws java.io.IOException {
        try {
            android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(str));
            try {
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo appExitInfo = parseAppExitInfo(jsonReader);
                jsonReader.close();
                return appExitInfo;
            } catch (java.lang.Throwable th) {
                try {
                    jsonReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.IllegalStateException e) {
            throw new java.io.IOException(e);
        }
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport parseReport(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    builder.setNdkPayload(parseNdkPayload(jsonReader));
                    break;
                case "sdkVersion":
                    builder.setSdkVersion(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    builder.setAppQualitySessionId(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    builder.setAppExitInfo(parseAppExitInfo(jsonReader));
                    break;
                case "buildVersion":
                    builder.setBuildVersion(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    builder.setFirebaseAuthenticationToken(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    builder.setGmpAppId(jsonReader.nextString());
                    break;
                case "installationUuid":
                    builder.setInstallationUuid(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    builder.setFirebaseInstallationId(jsonReader.nextString());
                    break;
                case "platform":
                    builder.setPlatform(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    builder.setDisplayVersion(jsonReader.nextString());
                    break;
                case "session":
                    builder.setSession(parseSession(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session parseSession(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "startedAt":
                    builder.setStartedAt(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    builder.setAppQualitySessionId(jsonReader.nextString());
                    break;
                case "identifier":
                    builder.setIdentifierFromUtf8Bytes(android.util.Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    builder.setEndedAt(java.lang.Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    builder.setDevice(parseDevice(jsonReader));
                    break;
                case "events":
                    builder.setEvents(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda1
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final java.lang.Object parse(android.util.JsonReader jsonReader2) {
                            return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseEvent(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    builder.setOs(parseOs(jsonReader));
                    break;
                case "app":
                    builder.setApp(parseApp(jsonReader));
                    break;
                case "user":
                    builder.setUser(parseUser(jsonReader));
                    break;
                case "generator":
                    builder.setGenerator(jsonReader.nextString());
                    break;
                case "crashed":
                    builder.setCrashed(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    builder.setGeneratorType(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload parseNdkPayload(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                builder.setFiles(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda4
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final java.lang.Object parse(android.util.JsonReader jsonReader2) {
                        return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseFile(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                builder.setOrgId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo parseAppExitInfo(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    builder.setBuildIdMappingForArch(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda8
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final java.lang.Object parse(android.util.JsonReader jsonReader2) {
                            return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseBuildIdMappingForArch(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    builder.setPid(jsonReader.nextInt());
                    break;
                case "pss":
                    builder.setPss(jsonReader.nextLong());
                    break;
                case "rss":
                    builder.setRss(jsonReader.nextLong());
                    break;
                case "timestamp":
                    builder.setTimestamp(jsonReader.nextLong());
                    break;
                case "processName":
                    builder.setProcessName(jsonReader.nextString());
                    break;
                case "reasonCode":
                    builder.setReasonCode(jsonReader.nextInt());
                    break;
                case "traceFile":
                    builder.setTraceFile(jsonReader.nextString());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File parseFile(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                builder.setFilename(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                builder.setContents(android.util.Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User parseUser(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                builder.setIdentifier(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application parseApp(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "identifier":
                    builder.setIdentifier(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    builder.setDevelopmentPlatform(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    builder.setDevelopmentPlatformVersion(jsonReader.nextString());
                    break;
                case "version":
                    builder.setVersion(jsonReader.nextString());
                    break;
                case "installationUuid":
                    builder.setInstallationUuid(jsonReader.nextString());
                    break;
                case "displayVersion":
                    builder.setDisplayVersion(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem parseOs(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildVersion":
                    builder.setBuildVersion(jsonReader.nextString());
                    break;
                case "jailbroken":
                    builder.setJailbroken(jsonReader.nextBoolean());
                    break;
                case "version":
                    builder.setVersion(jsonReader.nextString());
                    break;
                case "platform":
                    builder.setPlatform(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device parseDevice(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "simulator":
                    builder.setSimulator(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    builder.setManufacturer(jsonReader.nextString());
                    break;
                case "ram":
                    builder.setRam(jsonReader.nextLong());
                    break;
                case "arch":
                    builder.setArch(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    builder.setDiskSpace(jsonReader.nextLong());
                    break;
                case "cores":
                    builder.setCores(jsonReader.nextInt());
                    break;
                case "model":
                    builder.setModel(jsonReader.nextString());
                    break;
                case "state":
                    builder.setState(jsonReader.nextInt());
                    break;
                case "modelClass":
                    builder.setModelClass(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event parseEvent(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    builder.setDevice(parseEventDevice(jsonReader));
                    break;
                case "rollouts":
                    builder.setRollouts(parseEventRolloutsState(jsonReader));
                    break;
                case "app":
                    builder.setApp(parseEventApp(jsonReader));
                    break;
                case "log":
                    builder.setLog(parseEventLog(jsonReader));
                    break;
                case "type":
                    builder.setType(jsonReader.nextString());
                    break;
                case "timestamp":
                    builder.setTimestamp(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application parseEventApp(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appProcessDetails":
                    builder.setAppProcessDetails(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda7
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final java.lang.Object parse(android.util.JsonReader jsonReader2) {
                            return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseProcessDetails(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    builder.setBackground(java.lang.Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    builder.setExecution(parseEventExecution(jsonReader));
                    break;
                case "internalKeys":
                    builder.setInternalKeys(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda6
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final java.lang.Object parse(android.util.JsonReader jsonReader2) {
                            return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    builder.setCustomAttributes(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda6
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final java.lang.Object parse(android.util.JsonReader jsonReader2) {
                            return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    builder.setUiOrientation(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    builder.setCurrentProcessDetails(parseProcessDetails(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails parseProcessDetails(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "pid":
                    builder.setPid(jsonReader.nextInt());
                    break;
                case "processName":
                    builder.setProcessName(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    builder.setDefaultProcess(jsonReader.nextBoolean());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution parseEventExecution(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appExitInfo":
                    builder.setAppExitInfo(parseAppExitInfo(jsonReader));
                    break;
                case "threads":
                    builder.setThreads(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda2
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final java.lang.Object parse(android.util.JsonReader jsonReader2) {
                            return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseEventThread(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    builder.setSignal(parseEventSignal(jsonReader));
                    break;
                case "binaries":
                    builder.setBinaries(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda3
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                        public final java.lang.Object parse(android.util.JsonReader jsonReader2) {
                            return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    builder.setException(parseEventExecutionException(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception parseEventExecutionException(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    builder.setFrames(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda0()));
                    break;
                case "reason":
                    builder.setReason(jsonReader.nextString());
                    break;
                case "type":
                    builder.setType(jsonReader.nextString());
                    break;
                case "causedBy":
                    builder.setCausedBy(parseEventExecutionException(jsonReader));
                    break;
                case "overflowCount":
                    builder.setOverflowCount(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal parseEventSignal(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "address":
                    builder.setAddress(jsonReader.nextLong());
                    break;
                case "code":
                    builder.setCode(jsonReader.nextString());
                    break;
                case "name":
                    builder.setName(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage parseEventBinaryImage(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "name":
                    builder.setName(jsonReader.nextString());
                    break;
                case "size":
                    builder.setSize(jsonReader.nextLong());
                    break;
                case "uuid":
                    builder.setUuidFromUtf8Bytes(android.util.Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    builder.setBaseAddress(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread parseEventThread(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    builder.setFrames(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda0()));
                    break;
                case "name":
                    builder.setName(jsonReader.nextString());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame parseEventFrame(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    builder.setOffset(jsonReader.nextLong());
                    break;
                case "symbol":
                    builder.setSymbol(jsonReader.nextString());
                    break;
                case "pc":
                    builder.setPc(jsonReader.nextLong());
                    break;
                case "file":
                    builder.setFile(jsonReader.nextString());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device parseEventDevice(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "batteryLevel":
                    builder.setBatteryLevel(java.lang.Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    builder.setBatteryVelocity(jsonReader.nextInt());
                    break;
                case "orientation":
                    builder.setOrientation(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    builder.setDiskUsed(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    builder.setRamUsed(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    builder.setProximityOn(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log parseEventLog(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                builder.setContent(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState parseEventRolloutsState(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("assignments")) {
                builder.setRolloutAssignments(parseArray(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser() { // from class: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda5
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
                    public final java.lang.Object parse(android.util.JsonReader jsonReader2) {
                        return com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.parseEventRolloutsAssignment(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment parseEventRolloutsAssignment(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "parameterKey":
                    builder.setParameterKey(jsonReader.nextString());
                    break;
                case "templateVersion":
                    builder.setTemplateVersion(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    builder.setRolloutVariant(parseRolloutAssignmentRolloutVariant(jsonReader));
                    break;
                case "parameterValue":
                    builder.setParameterValue(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant parseRolloutAssignmentRolloutVariant(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("variantId")) {
                builder.setVariantId(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                builder.setRolloutId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute parseCustomAttribute(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals(com.ironsource.y8.h.W)) {
                builder.setKey(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                builder.setValue(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch parseBuildIdMappingForArch(android.util.JsonReader jsonReader) throws java.io.IOException {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder builder = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    builder.setLibraryName(jsonReader.nextString());
                    break;
                case "arch":
                    builder.setArch(jsonReader.nextString());
                    break;
                case "buildId":
                    builder.setBuildId(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    private static <T> java.util.List<T> parseArray(android.util.JsonReader jsonReader, com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser<T> objectParser) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(objectParser.parse(jsonReader));
        }
        jsonReader.endArray();
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
