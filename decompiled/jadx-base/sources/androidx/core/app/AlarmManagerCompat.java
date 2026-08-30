package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class AlarmManagerCompat {
    public static void setAlarmClock(android.app.AlarmManager alarmManager, long j, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
        androidx.core.app.AlarmManagerCompat.Api21Impl.setAlarmClock(alarmManager, androidx.core.app.AlarmManagerCompat.Api21Impl.createAlarmClockInfo(j, pendingIntent), pendingIntent2);
    }

    public static void setAndAllowWhileIdle(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
        androidx.core.app.AlarmManagerCompat.Api23Impl.setAndAllowWhileIdle(alarmManager, i, j, pendingIntent);
    }

    public static void setExact(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
        androidx.core.app.AlarmManagerCompat.Api19Impl.setExact(alarmManager, i, j, pendingIntent);
    }

    public static void setExactAndAllowWhileIdle(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
        androidx.core.app.AlarmManagerCompat.Api23Impl.setExactAndAllowWhileIdle(alarmManager, i, j, pendingIntent);
    }

    private AlarmManagerCompat() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void setAlarmClock(android.app.AlarmManager alarmManager, java.lang.Object obj, android.app.PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((android.app.AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }

        static android.app.AlarmManager.AlarmClockInfo createAlarmClockInfo(long j, android.app.PendingIntent pendingIntent) {
            return new android.app.AlarmManager.AlarmClockInfo(j, pendingIntent);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void setAndAllowWhileIdle(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        static void setExactAndAllowWhileIdle(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void setExact(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }
}
