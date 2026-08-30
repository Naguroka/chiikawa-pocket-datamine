package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcu {
    public static java.lang.String zza(@javax.annotation.CheckForNull java.lang.String str, @javax.annotation.CheckForNull java.lang.Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        java.lang.String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            java.lang.Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (java.lang.Exception e) {
                    java.lang.String str2 = obj.getClass().getName() + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (java.lang.Throwable) e);
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = string;
            i2++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((java.lang.CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
