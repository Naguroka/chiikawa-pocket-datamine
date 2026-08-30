package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    static androidx.constraintlayout.core.motion.utils.Utils.DebugHandle ourHandle;

    public interface DebugHandle {
        void message(java.lang.String str);
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void log(java.lang.String str, java.lang.String str2) {
        java.lang.System.out.println(str + " : " + str2);
    }

    public static void loge(java.lang.String str, java.lang.String str2) {
        java.lang.System.err.println(str + " : " + str2);
    }

    public static void socketSend(java.lang.String str) {
        try {
            java.io.OutputStream outputStream = new java.net.Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) java.lang.Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) java.lang.Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) java.lang.Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int iClamp = clamp((int) (f * 255.0f));
        int iClamp2 = clamp((int) (f2 * 255.0f));
        return (iClamp << 16) | (clamp((int) (f4 * 255.0f)) << 24) | (iClamp2 << 8) | clamp((int) (f3 * 255.0f));
    }

    public static void setDebugHandle(androidx.constraintlayout.core.motion.utils.Utils.DebugHandle debugHandle) {
        ourHandle = debugHandle;
    }

    public static void logStack(java.lang.String str, int i) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int iMin = java.lang.Math.min(i, stackTrace.length - 1);
        java.lang.String str2 = " ";
        for (int i2 = 1; i2 <= iMin; i2++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
            str2 = str2 + " ";
            java.lang.System.out.println(str + str2 + (".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName()) + str2);
        }
    }

    public static void log(java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        java.lang.String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")" + "    ".substring(java.lang.Integer.toString(stackTraceElement.getLineNumber()).length()) + (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        java.lang.System.out.println(str2 + " " + str);
        androidx.constraintlayout.core.motion.utils.Utils.DebugHandle debugHandle = ourHandle;
        if (debugHandle != null) {
            debugHandle.message(str2 + " " + str);
        }
    }
}
