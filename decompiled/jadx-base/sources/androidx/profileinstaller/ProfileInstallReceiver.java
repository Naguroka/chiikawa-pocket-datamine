package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    public static final java.lang.String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    public static final java.lang.String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";
    public static final java.lang.String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";
    private static final java.lang.String EXTRA_BENCHMARK_OPERATION = "EXTRA_BENCHMARK_OPERATION";
    private static final java.lang.String EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE = "DROP_SHADER_CACHE";
    private static final java.lang.String EXTRA_SKIP_FILE_OPERATION = "EXTRA_SKIP_FILE_OPERATION";
    private static final java.lang.String EXTRA_SKIP_FILE_OPERATION_DELETE = "DELETE_SKIP_FILE";
    private static final java.lang.String EXTRA_SKIP_FILE_OPERATION_WRITE = "WRITE_SKIP_FILE";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras;
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if (ACTION_INSTALL_PROFILE.equals(action)) {
            androidx.profileinstaller.ProfileInstaller.writeProfile(context, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics(), true);
            return;
        }
        if (ACTION_SKIP_FILE.equals(action)) {
            android.os.Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                java.lang.String string = extras2.getString(EXTRA_SKIP_FILE_OPERATION);
                if (EXTRA_SKIP_FILE_OPERATION_WRITE.equals(string)) {
                    androidx.profileinstaller.ProfileInstaller.writeSkipFile(context, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics());
                    return;
                } else {
                    if (EXTRA_SKIP_FILE_OPERATION_DELETE.equals(string)) {
                        androidx.profileinstaller.ProfileInstaller.deleteSkipFile(context, new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (ACTION_SAVE_PROFILE.equals(action)) {
            saveProfile(new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics());
            return;
        }
        if (!ACTION_BENCHMARK_OPERATION.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        java.lang.String string2 = extras.getString(EXTRA_BENCHMARK_OPERATION);
        androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics resultDiagnostics = new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics();
        if (EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE.equals(string2)) {
            androidx.profileinstaller.BenchmarkOperation.dropShaderCache(context, resultDiagnostics);
        } else {
            resultDiagnostics.onResultReceived(16, null);
        }
    }

    static void saveProfile(androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        android.os.Process.sendSignal(android.os.Process.myPid(), 10);
        diagnosticsCallback.onResultReceived(12, null);
    }

    class ResultDiagnostics implements androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback {
        ResultDiagnostics() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, java.lang.Object obj) {
            androidx.profileinstaller.ProfileInstaller.LOG_DIAGNOSTICS.onDiagnosticReceived(i, obj);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, java.lang.Object obj) {
            androidx.profileinstaller.ProfileInstaller.LOG_DIAGNOSTICS.onResultReceived(i, obj);
            androidx.profileinstaller.ProfileInstallReceiver.this.setResultCode(i);
        }
    }
}
