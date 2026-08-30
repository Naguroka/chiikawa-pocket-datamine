package com.google.firebase.crashlytics.ndk;

/* JADX INFO: loaded from: classes5.dex */
public class CrashpadController {
    private static final java.lang.String APP_METADATA_FILE = "app.json";
    private static final java.lang.String DEVICE_METADATA_FILE = "device.json";
    private static final java.lang.String OS_METADATA_FILE = "os.json";
    private static final java.lang.String SESSION_METADATA_FILE = "session.json";
    private static final java.lang.String SESSION_START_TIMESTAMP_FILE_NAME = "start-time";
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
    private final android.content.Context context;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private final com.google.firebase.crashlytics.ndk.NativeApi nativeApi;

    CrashpadController(android.content.Context context, com.google.firebase.crashlytics.ndk.NativeApi nativeApi, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore) {
        this.context = context;
        this.nativeApi = nativeApi;
        this.fileStore = fileStore;
    }

    public boolean initialize(java.lang.String str, java.lang.String str2, long j, com.google.firebase.crashlytics.internal.model.StaticSessionData staticSessionData) throws java.lang.Throwable {
        java.io.File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        if (nativeSessionDir == null) {
            return false;
        }
        try {
            if (!this.nativeApi.initialize(nativeSessionDir.getCanonicalPath(), this.context.getAssets())) {
                return false;
            }
            writeBeginSession(str, str2, j);
            writeSessionApp(str, staticSessionData.appData());
            writeSessionOs(str, staticSessionData.osData());
            writeSessionDevice(str, staticSessionData.deviceData());
            return true;
        } catch (java.io.IOException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Error initializing Crashlytics NDK", e);
            return false;
        }
    }

    public boolean hasCrashDataForSession(java.lang.String str) {
        com.google.firebase.crashlytics.ndk.SessionFiles filesForSession = getFilesForSession(str);
        return filesForSession.nativeCore != null && filesForSession.nativeCore.hasCore();
    }

    public com.google.firebase.crashlytics.ndk.SessionFiles getFilesForSession(java.lang.String str) {
        java.io.File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        java.io.File file = new java.io.File(nativeSessionDir, "pending");
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Minidump directory: " + file.getAbsolutePath());
        java.io.File singleFileWithExtension = getSingleFileWithExtension(file, ".dmp");
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Minidump file ".concat((singleFileWithExtension == null || !singleFileWithExtension.exists()) ? "does not exist" : "exists"));
        com.google.firebase.crashlytics.ndk.SessionFiles.Builder builder = new com.google.firebase.crashlytics.ndk.SessionFiles.Builder();
        if (nativeSessionDir != null && nativeSessionDir.exists() && file.exists()) {
            builder.nativeCore(getNativeCore(str, file)).metadataFile(getSingleFileWithExtension(nativeSessionDir, ".device_info")).sessionFile(new java.io.File(nativeSessionDir, SESSION_METADATA_FILE)).appFile(new java.io.File(nativeSessionDir, APP_METADATA_FILE)).deviceFile(new java.io.File(nativeSessionDir, DEVICE_METADATA_FILE)).osFile(new java.io.File(nativeSessionDir, OS_METADATA_FILE));
        }
        return builder.build();
    }

    private com.google.firebase.crashlytics.ndk.SessionFiles.NativeCore getNativeCore(java.lang.String str, java.io.File file) {
        return new com.google.firebase.crashlytics.ndk.SessionFiles.NativeCore(getSingleFileWithExtension(file, ".dmp"), getApplicationExitInfo(str));
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getApplicationExitInfo(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return getNativeCrashApplicationExitInfo(str);
        }
        return null;
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getNativeCrashApplicationExitInfo(java.lang.String str) {
        java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = ((android.app.ActivityManager) this.context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        java.io.File sessionFile = this.fileStore.getSessionFile(str, SESSION_START_TIMESTAMP_FILE_NAME);
        return getRelevantApplicationExitInfo(sessionFile == null ? java.lang.System.currentTimeMillis() : sessionFile.lastModified(), historicalProcessExitReasons);
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getRelevantApplicationExitInfo(long j, java.util.List<android.app.ApplicationExitInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.app.ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getReason() == 5 && applicationExitInfo.getTimestamp() >= j) {
                arrayList.add(applicationExitInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return convertApplicationExitInfoToModel((android.app.ApplicationExitInfo) arrayList.get(0));
    }

    public void writeBeginSession(java.lang.String str, java.lang.String str2, long j) throws java.lang.Throwable {
        writeSessionJsonFile(this.fileStore, str, com.google.firebase.crashlytics.ndk.SessionMetadataJsonSerializer.serializeBeginSession(str, str2, j), SESSION_METADATA_FILE);
    }

    public void writeSessionApp(java.lang.String str, com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData) throws java.lang.Throwable {
        writeSessionJsonFile(this.fileStore, str, com.google.firebase.crashlytics.ndk.SessionMetadataJsonSerializer.serializeSessionApp(appData.appIdentifier(), appData.versionCode(), appData.versionName(), appData.installUuid(), appData.deliveryMechanism(), appData.developmentPlatformProvider().getDevelopmentPlatform(), appData.developmentPlatformProvider().getDevelopmentPlatformVersion()), APP_METADATA_FILE);
    }

    public void writeSessionOs(java.lang.String str, com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData) throws java.lang.Throwable {
        writeSessionJsonFile(this.fileStore, str, com.google.firebase.crashlytics.ndk.SessionMetadataJsonSerializer.serializeSessionOs(osData.osRelease(), osData.osCodeName(), osData.isRooted()), OS_METADATA_FILE);
    }

    public void writeSessionDevice(java.lang.String str, com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData deviceData) throws java.lang.Throwable {
        writeSessionJsonFile(this.fileStore, str, com.google.firebase.crashlytics.ndk.SessionMetadataJsonSerializer.serializeSessionDevice(deviceData.arch(), deviceData.model(), deviceData.availableProcessors(), deviceData.totalRam(), deviceData.diskSpace(), deviceData.isEmulator(), deviceData.state(), deviceData.manufacturer(), deviceData.modelClass()), DEVICE_METADATA_FILE);
    }

    private static void writeSessionJsonFile(com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Throwable {
        writeTextFile(new java.io.File(fileStore.getNativeSessionDir(str), str3), str2);
    }

    private static void writeTextFile(java.io.File file, java.lang.String str) throws java.lang.Throwable {
        java.io.BufferedWriter bufferedWriter = null;
        try {
            java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), UTF_8));
            try {
                bufferedWriter2.write(str);
                com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(bufferedWriter2, "Failed to close " + file);
            } catch (java.io.IOException unused) {
                bufferedWriter = bufferedWriter2;
                com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static java.io.File getSingleFileWithExtension(java.io.File file, java.lang.String str) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfoToModel(android.app.ApplicationExitInfo applicationExitInfo) {
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(getTraceFileFromApplicationExitInfo(applicationExitInfo)).build();
    }

    private static java.lang.String getTraceFileFromApplicationExitInfo(android.app.ApplicationExitInfo applicationExitInfo) {
        try {
            return convertInputStreamToString(applicationExitInfo.getTraceInputStream());
        } catch (java.io.IOException unused) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    public static java.lang.String convertInputStreamToString(java.io.InputStream inputStream) throws java.io.IOException {
        if (inputStream == null) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return zipAndEncode(byteArrayOutputStream.toByteArray());
            }
        }
    }

    private static java.lang.String zipAndEncode(byte[] bArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                java.lang.String strEncodeToString = java.util.Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } catch (java.lang.Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
