package androidx.core.telephony;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionManagerCompat {
    private static java.lang.reflect.Method sGetSlotIndexMethod;

    public static int getSlotIndex(int i) {
        if (i == -1) {
            return -1;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.telephony.SubscriptionManagerCompat.Api29Impl.getSlotIndex(i);
        }
        try {
            if (sGetSlotIndexMethod == null) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    sGetSlotIndexMethod = android.telephony.SubscriptionManager.class.getDeclaredMethod("getSlotIndex", java.lang.Integer.TYPE);
                } else {
                    sGetSlotIndexMethod = android.telephony.SubscriptionManager.class.getDeclaredMethod("getSlotId", java.lang.Integer.TYPE);
                }
                sGetSlotIndexMethod.setAccessible(true);
            }
            java.lang.Integer num = (java.lang.Integer) sGetSlotIndexMethod.invoke(null, java.lang.Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        return -1;
    }

    private SubscriptionManagerCompat() {
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static int getSlotIndex(int i) {
            return android.telephony.SubscriptionManager.getSlotIndex(i);
        }
    }
}
