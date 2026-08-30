package androidx.core.telephony;

/* JADX INFO: loaded from: classes.dex */
public class TelephonyManagerCompat {
    private static java.lang.reflect.Method sGetDeviceIdMethod;
    private static java.lang.reflect.Method sGetSubIdMethod;

    public static java.lang.String getImei(android.telephony.TelephonyManager telephonyManager) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.telephony.TelephonyManagerCompat.Api26Impl.getImei(telephonyManager);
        }
        int subscriptionId = getSubscriptionId(telephonyManager);
        if (subscriptionId != Integer.MAX_VALUE && subscriptionId != -1) {
            return androidx.core.telephony.TelephonyManagerCompat.Api23Impl.getDeviceId(telephonyManager, androidx.core.telephony.SubscriptionManagerCompat.getSlotIndex(subscriptionId));
        }
        return telephonyManager.getDeviceId();
    }

    public static int getSubscriptionId(android.telephony.TelephonyManager telephonyManager) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.telephony.TelephonyManagerCompat.Api30Impl.getSubscriptionId(telephonyManager);
        }
        try {
            if (sGetSubIdMethod == null) {
                java.lang.reflect.Method declaredMethod = android.telephony.TelephonyManager.class.getDeclaredMethod("getSubId", new java.lang.Class[0]);
                sGetSubIdMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            java.lang.Integer num = (java.lang.Integer) sGetSubIdMethod.invoke(telephonyManager, new java.lang.Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }

    private TelephonyManagerCompat() {
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static int getSubscriptionId(android.telephony.TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
        }

        static java.lang.String getImei(android.telephony.TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static java.lang.String getDeviceId(android.telephony.TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }
}
