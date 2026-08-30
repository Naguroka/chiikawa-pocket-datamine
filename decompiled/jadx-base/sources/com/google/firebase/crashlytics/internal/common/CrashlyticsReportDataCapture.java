package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsReportDataCapture {
    private static final java.util.Map<java.lang.String, java.lang.Integer> ARCHITECTURES_BY_NAME;
    static final java.lang.String GENERATOR;
    static final int GENERATOR_TYPE = 3;
    static final int REPORT_ANDROID_PLATFORM = 4;
    static final int SESSION_ANDROID_PLATFORM = 3;
    static final java.lang.String SIGNAL_DEFAULT = "0";
    private final com.google.firebase.crashlytics.internal.common.AppData appData;
    private final android.content.Context context;
    private final com.google.firebase.crashlytics.internal.common.IdManager idManager;
    private final com.google.firebase.crashlytics.internal.ProcessDetailsProvider processDetailsProvider = com.google.firebase.crashlytics.internal.ProcessDetailsProvider.INSTANCE;
    private final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider;
    private final com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy stackTraceTrimmingStrategy;

    private static long ensureNonNegative(long j) {
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    static {
        java.util.HashMap map = new java.util.HashMap();
        ARCHITECTURES_BY_NAME = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        GENERATOR = java.lang.String.format(java.util.Locale.US, "Crashlytics Android SDK/%s", "19.4.2");
    }

    public CrashlyticsReportDataCapture(android.content.Context context, com.google.firebase.crashlytics.internal.common.IdManager idManager, com.google.firebase.crashlytics.internal.common.AppData appData, com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy stackTraceTrimmingStrategy, com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider) {
        this.context = context;
        this.idManager = idManager;
        this.appData = appData;
        this.stackTraceTrimmingStrategy = stackTraceTrimmingStrategy;
        this.settingsProvider = settingsProvider;
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport captureReportData(java.lang.String str, long j) {
        return buildReportData().setSession(populateSessionData(str, j)).build();
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event captureEventData(java.lang.Throwable th, java.lang.Thread thread, java.lang.String str, long j, int i, int i2, boolean z) {
        int i3 = this.context.getResources().getConfiguration().orientation;
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.builder().setType(str).setTimestamp(j).setApp(populateEventApplicationData(i3, com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData.makeTrimmedThrowableData(th, this.stackTraceTrimmingStrategy), thread, i, i2, z)).setDevice(populateEventDeviceData(i3)).build();
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event captureAnrEventData(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        int i = this.context.getResources().getConfiguration().orientation;
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.builder().setType("anr").setTimestamp(applicationExitInfo.getTimestamp()).setApp(populateEventApplicationData(i, addBuildIdInfo(applicationExitInfo))).setDevice(populateEventDeviceData(i)).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo addBuildIdInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> listUnmodifiableList;
        if (!this.settingsProvider.getSettingsSync().featureFlagData.collectBuildIds || this.appData.buildIdInfoList.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.firebase.crashlytics.internal.common.BuildIdInfo buildIdInfo : this.appData.buildIdInfoList) {
                arrayList.add(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder().setLibraryName(buildIdInfo.getLibraryName()).setArch(buildIdInfo.getArch()).setBuildId(buildIdInfo.getBuildId()).build());
            }
            listUnmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        }
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReasonCode()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(applicationExitInfo.getTraceFile()).setBuildIdMappingForArch(listUnmodifiableList).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder buildReportData() {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.builder().setSdkVersion("19.4.2").setGmpAppId(this.appData.googleAppId).setInstallationUuid(this.idManager.getInstallIds().getCrashlyticsInstallId()).setFirebaseInstallationId(this.idManager.getInstallIds().getFirebaseInstallationId()).setFirebaseAuthenticationToken(this.idManager.getInstallIds().getFirebaseAuthenticationToken()).setBuildVersion(this.appData.versionCode).setDisplayVersion(this.appData.versionName).setPlatform(4);
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session populateSessionData(java.lang.String str, long j) {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.builder().setStartedAt(j).setIdentifier(str).setGenerator(GENERATOR).setApp(populateSessionApplicationData()).setOs(populateSessionOperatingSystemData()).setDevice(populateSessionDeviceData()).setGeneratorType(3).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application populateSessionApplicationData() {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.builder().setIdentifier(this.idManager.getAppIdentifier()).setVersion(this.appData.versionCode).setDisplayVersion(this.appData.versionName).setInstallationUuid(this.idManager.getInstallIds().getCrashlyticsInstallId()).setDevelopmentPlatform(this.appData.developmentPlatformProvider.getDevelopmentPlatform()).setDevelopmentPlatformVersion(this.appData.developmentPlatformProvider.getDevelopmentPlatformVersion()).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem populateSessionOperatingSystemData() {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.builder().setPlatform(3).setVersion(android.os.Build.VERSION.RELEASE).setBuildVersion(android.os.Build.VERSION.CODENAME).setJailbroken(com.google.firebase.crashlytics.internal.common.CommonUtils.isRooted()).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device populateSessionDeviceData() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        int deviceArchitecture = getDeviceArchitecture();
        int iAvailableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        long jCalculateTotalRamInBytes = com.google.firebase.crashlytics.internal.common.CommonUtils.calculateTotalRamInBytes(this.context);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zIsEmulator = com.google.firebase.crashlytics.internal.common.CommonUtils.isEmulator();
        int deviceState = com.google.firebase.crashlytics.internal.common.CommonUtils.getDeviceState();
        java.lang.String str = android.os.Build.MANUFACTURER;
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.builder().setArch(deviceArchitecture).setModel(android.os.Build.MODEL).setCores(iAvailableProcessors).setRam(jCalculateTotalRamInBytes).setDiskSpace(blockCount).setSimulator(zIsEmulator).setState(deviceState).setManufacturer(str).setModelClass(android.os.Build.PRODUCT).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application populateEventApplicationData(int i, com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData trimmedThrowableData, java.lang.Thread thread, int i2, int i3, boolean z) {
        java.lang.Boolean boolValueOf;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails = this.processDetailsProvider.getCurrentProcessDetails(this.context);
        if (currentProcessDetails.getImportance() > 0) {
            boolValueOf = java.lang.Boolean.valueOf(currentProcessDetails.getImportance() != 100);
        } else {
            boolValueOf = null;
        }
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.builder().setBackground(boolValueOf).setCurrentProcessDetails(currentProcessDetails).setAppProcessDetails(this.processDetailsProvider.getAppProcessDetails(this.context)).setUiOrientation(i).setExecution(populateExecutionData(trimmedThrowableData, thread, i2, i3, z)).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application populateEventApplicationData(int i, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.builder().setBackground(java.lang.Boolean.valueOf(applicationExitInfo.getImportance() != 100)).setCurrentProcessDetails(processDetailsFromApplicationExitInfo(applicationExitInfo)).setUiOrientation(i).setExecution(populateExecutionData(applicationExitInfo)).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device populateEventDeviceData(int i) {
        com.google.firebase.crashlytics.internal.common.BatteryState batteryState = com.google.firebase.crashlytics.internal.common.BatteryState.get(this.context);
        java.lang.Float batteryLevel = batteryState.getBatteryLevel();
        java.lang.Double dValueOf = batteryLevel != null ? java.lang.Double.valueOf(batteryLevel.doubleValue()) : null;
        int batteryVelocity = batteryState.getBatteryVelocity();
        boolean proximitySensorEnabled = com.google.firebase.crashlytics.internal.common.CommonUtils.getProximitySensorEnabled(this.context);
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.builder().setBatteryLevel(dValueOf).setBatteryVelocity(batteryVelocity).setProximityOn(proximitySensorEnabled).setOrientation(i).setRamUsed(ensureNonNegative(com.google.firebase.crashlytics.internal.common.CommonUtils.calculateTotalRamInBytes(this.context) - com.google.firebase.crashlytics.internal.common.CommonUtils.calculateFreeRamInBytes(this.context))).setDiskUsed(com.google.firebase.crashlytics.internal.common.CommonUtils.calculateUsedDiskSpaceInBytes(android.os.Environment.getDataDirectory().getPath())).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution populateExecutionData(com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData trimmedThrowableData, java.lang.Thread thread, int i, int i2, boolean z) {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.builder().setThreads(populateThreadsList(trimmedThrowableData, thread, i, z)).setException(populateExceptionData(trimmedThrowableData, i, i2)).setSignal(populateSignalData()).setBinaries(populateBinaryImagesList()).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution populateExecutionData(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.builder().setAppExitInfo(applicationExitInfo).setSignal(populateSignalData()).setBinaries(populateBinaryImagesList()).build();
    }

    private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread> populateThreadsList(com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData trimmedThrowableData, java.lang.Thread thread, int i, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(populateThreadData(thread, trimmedThrowableData.stacktrace, i));
        if (z) {
            for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : java.lang.Thread.getAllStackTraces().entrySet()) {
                java.lang.Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(populateThreadData(key, this.stackTraceTrimmingStrategy.getTrimmedStackTrace(entry.getValue())));
                }
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread populateThreadData(java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr) {
        return populateThreadData(thread, stackTraceElementArr, 0);
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread populateThreadData(java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, int i) {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.builder().setName(thread.getName()).setImportance(i).setFrames(populateFramesList(stackTraceElementArr, i)).build();
    }

    private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> populateFramesList(java.lang.StackTraceElement[] stackTraceElementArr, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(populateFrameData(stackTraceElement, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder().setImportance(i)));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception populateExceptionData(com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData trimmedThrowableData, int i, int i2) {
        return populateExceptionData(trimmedThrowableData, i, i2, 0);
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception populateExceptionData(com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData trimmedThrowableData, int i, int i2, int i3) {
        java.lang.String str = trimmedThrowableData.className;
        java.lang.String str2 = trimmedThrowableData.localizedMessage;
        int i4 = 0;
        java.lang.StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace != null ? trimmedThrowableData.stacktrace : new java.lang.StackTraceElement[0];
        com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (i3 >= i2) {
            com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.cause;
                i4++;
            }
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder overflowCount = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.builder().setType(str).setReason(str2).setFrames(populateFramesList(stackTraceElementArr, i)).setOverflowCount(i4);
        if (trimmedThrowableData2 != null && i4 == 0) {
            overflowCount.setCausedBy(populateExceptionData(trimmedThrowableData2, i, i2, i3 + 1));
        }
        return overflowCount.build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame populateFrameData(java.lang.StackTraceElement stackTraceElement, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? java.lang.Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        java.lang.String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        java.lang.String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return builder.setPc(jMax).setSymbol(str).setFile(fileName).setOffset(lineNumber).build();
    }

    private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> populateBinaryImagesList() {
        return java.util.Collections.singletonList(populateBinaryImageData());
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage populateBinaryImageData() {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder().setBaseAddress(0L).setSize(0L).setName(this.appData.packageName).setUuid(this.appData.buildId).build();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal populateSignalData() {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.builder().setName("0").setCode("0").setAddress(0L).build();
    }

    private static int getDeviceArchitecture() {
        java.lang.Integer num;
        java.lang.String str = android.os.Build.CPU_ABI;
        if (android.text.TextUtils.isEmpty(str) || (num = ARCHITECTURES_BY_NAME.get(str.toLowerCase(java.util.Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetailsFromApplicationExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return this.processDetailsProvider.buildProcessDetails(applicationExitInfo.getProcessName(), applicationExitInfo.getPid(), applicationExitInfo.getImportance());
    }
}
