package jp.co.cyberagent.canalya.android.plugins;

/* JADX INFO: loaded from: classes6.dex */
public class MemoryInfo {
    private static final int PAGE_SIZE = 4096;
    private static final java.lang.String PROC_STATM_PATH = "/proc/self/statm";
    private static final int[] _processMemories = new int[1];

    public static long getUsedMemoryKB() {
        return getUsedMemoryKB(com.unity3d.player.UnityPlayer.currentActivity.getApplicationContext());
    }

    public static long getUsedMemoryKB(android.content.Context context) {
        java.lang.String firstLine = readFirstLine(PROC_STATM_PATH);
        if (firstLine == null) {
            return 0L;
        }
        java.lang.String[] strArrSplit = firstLine.split("[ \t]", 3);
        if (strArrSplit.length < 2) {
            return 0L;
        }
        return (java.lang.Long.parseLong(strArrSplit[1]) * 4096) / 1024;
    }

    public static long getUsedMemoryPssKB() {
        return getUsedMemoryPssKB(com.unity3d.player.UnityPlayer.currentActivity.getApplicationContext());
    }

    public static long getUsedMemoryPssKB(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        int[] iArr = _processMemories;
        iArr[0] = android.os.Process.myPid();
        long totalPss = 0;
        for (android.os.Debug.MemoryInfo memoryInfo : activityManager.getProcessMemoryInfo(iArr)) {
            totalPss += (long) memoryInfo.getTotalPss();
        }
        return totalPss;
    }

    private static java.lang.String readFirstLine(java.lang.String str) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(str));
            try {
                java.lang.String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
