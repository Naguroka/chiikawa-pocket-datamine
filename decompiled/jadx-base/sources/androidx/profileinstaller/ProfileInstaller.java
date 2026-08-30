package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileInstaller {
    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_PROFILE_IS_COMPRESSED = 5;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    private static final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback EMPTY_DIAGNOSTICS = new androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback() { // from class: androidx.profileinstaller.ProfileInstaller.1
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, java.lang.Object obj) {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, java.lang.Object obj) {
        }
    };
    static final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback LOG_DIAGNOSTICS = new androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback() { // from class: androidx.profileinstaller.ProfileInstaller.2
        static final java.lang.String TAG = "ProfileInstaller";

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, java.lang.Object obj) {
            java.lang.String str;
            if (i == 1) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            } else if (i == 2) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
            } else if (i == 3) {
                str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
            } else if (i != 4) {
                str = i != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
            } else {
                str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
            }
            android.util.Log.d(TAG, str);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, java.lang.Object obj) {
            java.lang.String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                android.util.Log.e(TAG, str, (java.lang.Throwable) obj);
            } else {
                android.util.Log.d(TAG, str);
            }
        }
    };
    private static final java.lang.String PROFILE_BASE_DIR = "/data/misc/profiles/cur/0";
    private static final java.lang.String PROFILE_FILE = "primary.prof";
    private static final java.lang.String PROFILE_INSTALLER_SKIP_FILE_NAME = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
    private static final java.lang.String PROFILE_META_LOCATION = "dexopt/baseline.profm";
    private static final java.lang.String PROFILE_SOURCE_LOCATION = "dexopt/baseline.prof";
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_BENCHMARK_OPERATION_FAILURE = 15;
    public static final int RESULT_BENCHMARK_OPERATION_SUCCESS = 14;
    public static final int RESULT_BENCHMARK_OPERATION_UNKNOWN = 16;
    public static final int RESULT_DELETE_SKIP_FILE_SUCCESS = 11;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SKIP_FILE_SUCCESS = 10;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_META_FILE_REQUIRED_BUT_NOT_FOUND = 9;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_SAVE_PROFILE_SIGNALLED = 12;
    public static final int RESULT_SAVE_PROFILE_SKIPPED = 13;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;
    private static final java.lang.String TAG = "ProfileInstaller";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int i, java.lang.Object obj);

        void onResultReceived(int i, java.lang.Object obj);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    private ProfileInstaller() {
    }

    static void result(java.util.concurrent.Executor executor, final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback, final int i, final java.lang.Object obj) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                diagnosticsCallback.onResultReceived(i, obj);
            }
        });
    }

    static void diagnostic(java.util.concurrent.Executor executor, final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback, final int i, final java.lang.Object obj) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                diagnosticsCallback.onDiagnosticReceived(i, obj);
            }
        });
    }

    static boolean hasAlreadyWrittenProfileForThisInstall(android.content.pm.PackageInfo packageInfo, java.io.File file, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        java.io.File file2 = new java.io.File(file, PROFILE_INSTALLER_SKIP_FILE_NAME);
        if (!file2.exists()) {
            return false;
        }
        try {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file2));
            try {
                long j = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = j == packageInfo.lastUpdateTime;
                if (z) {
                    diagnosticsCallback.onResultReceived(2, null);
                }
                return z;
            } catch (java.lang.Throwable th) {
                try {
                    dataInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    static void noteProfileWrittenFor(android.content.pm.PackageInfo packageInfo, java.io.File file) {
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(file, PROFILE_INSTALLER_SKIP_FILE_NAME)));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
        }
    }

    static boolean deleteProfileWrittenFor(java.io.File file) {
        return new java.io.File(file, PROFILE_INSTALLER_SKIP_FILE_NAME).delete();
    }

    private static boolean transcodeAndWrite(android.content.res.AssetManager assetManager, java.lang.String str, android.content.pm.PackageInfo packageInfo, java.io.File file, java.lang.String str2, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        androidx.profileinstaller.DeviceProfileWriter deviceProfileWriter = new androidx.profileinstaller.DeviceProfileWriter(assetManager, executor, diagnosticsCallback, str2, PROFILE_SOURCE_LOCATION, PROFILE_META_LOCATION, new java.io.File(new java.io.File(PROFILE_BASE_DIR, str), PROFILE_FILE));
        if (!deviceProfileWriter.deviceAllowsProfileInstallerAotWrites()) {
            return false;
        }
        boolean zWrite = deviceProfileWriter.read().transcodeIfNeeded().write();
        if (zWrite) {
            noteProfileWrittenFor(packageInfo, file);
        }
        return zWrite;
    }

    public static void writeProfile(android.content.Context context) {
        writeProfile(context, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), EMPTY_DIAGNOSTICS);
    }

    public static void writeProfile(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        writeProfile(context, executor, diagnosticsCallback, false);
    }

    static void writeProfile(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback, boolean z) {
        android.content.Context applicationContext = context.getApplicationContext();
        java.lang.String packageName = applicationContext.getPackageName();
        android.content.pm.ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        android.content.res.AssetManager assets = applicationContext.getAssets();
        java.lang.String name = new java.io.File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            java.io.File filesDir = context.getFilesDir();
            if (z || !hasAlreadyWrittenProfileForThisInstall(packageInfo, filesDir, diagnosticsCallback)) {
                android.util.Log.d(TAG, "Installing profile for " + context.getPackageName());
                if (transcodeAndWrite(assets, packageName, packageInfo, filesDir, name, executor, diagnosticsCallback) && z) {
                    z2 = true;
                }
                androidx.profileinstaller.ProfileVerifier.writeProfileVerification(context, z2);
                return;
            }
            android.util.Log.d(TAG, "Skipping profile installation for " + context.getPackageName());
            androidx.profileinstaller.ProfileVerifier.writeProfileVerification(context, false);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            diagnosticsCallback.onResultReceived(7, e);
            androidx.profileinstaller.ProfileVerifier.writeProfileVerification(context, false);
        }
    }

    static void writeSkipFile(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        try {
            noteProfileWrittenFor(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            result(executor, diagnosticsCallback, 10, null);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            result(executor, diagnosticsCallback, 7, e);
        }
    }

    static void deleteSkipFile(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        deleteProfileWrittenFor(context.getFilesDir());
        result(executor, diagnosticsCallback, 11, null);
    }
}
