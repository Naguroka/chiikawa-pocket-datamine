package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class DebugUtils {
    public static void buildShortClassTag(java.lang.Object obj, java.lang.StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        java.lang.String simpleName = obj.getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
    }

    private DebugUtils() {
    }
}
