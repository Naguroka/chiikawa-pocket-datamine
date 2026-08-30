package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
class BenchmarkOperation {
    private BenchmarkOperation() {
    }

    static void dropShaderCache(android.content.Context context, androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        if (deleteFilesRecursively(androidx.profileinstaller.BenchmarkOperation.Api24ContextHelper.getDeviceProtectedCodeCacheDir(context))) {
            resultDiagnostics.onResultReceived(14, null);
        } else {
            resultDiagnostics.onResultReceived(15, null);
        }
    }

    static boolean deleteFilesRecursively(java.io.File file) {
        if (file.isDirectory()) {
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            boolean z = true;
            for (java.io.File file2 : fileArrListFiles) {
                z = deleteFilesRecursively(file2) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }

    private static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        static java.io.File getCodeCacheDir(android.content.Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        static java.io.File getDeviceProtectedCodeCacheDir(android.content.Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }
}
