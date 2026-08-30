package androidx.media3.exoplayer.scheduler;

/* JADX INFO: loaded from: classes.dex */
public final class Requirements implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.exoplayer.scheduler.Requirements> CREATOR = new android.os.Parcelable.Creator<androidx.media3.exoplayer.scheduler.Requirements>() { // from class: androidx.media3.exoplayer.scheduler.Requirements.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.exoplayer.scheduler.Requirements createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.exoplayer.scheduler.Requirements(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.exoplayer.scheduler.Requirements[] newArray(int i) {
            return new androidx.media3.exoplayer.scheduler.Requirements[i];
        }
    };
    public static final int DEVICE_CHARGING = 8;
    public static final int DEVICE_IDLE = 4;
    public static final int DEVICE_STORAGE_NOT_LOW = 16;
    public static final int NETWORK = 1;
    public static final int NETWORK_UNMETERED = 2;
    private final int requirements;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RequirementFlags {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Requirements(int i) {
        this.requirements = (i & 2) != 0 ? i | 1 : i;
    }

    public int getRequirements() {
        return this.requirements;
    }

    public androidx.media3.exoplayer.scheduler.Requirements filterRequirements(int i) {
        int i2 = this.requirements;
        int i3 = i & i2;
        return i3 == i2 ? this : new androidx.media3.exoplayer.scheduler.Requirements(i3);
    }

    public boolean isNetworkRequired() {
        return (this.requirements & 1) != 0;
    }

    public boolean isUnmeteredNetworkRequired() {
        return (this.requirements & 2) != 0;
    }

    public boolean isChargingRequired() {
        return (this.requirements & 8) != 0;
    }

    public boolean isIdleRequired() {
        return (this.requirements & 4) != 0;
    }

    public boolean isStorageNotLowRequired() {
        return (this.requirements & 16) != 0;
    }

    public boolean checkRequirements(android.content.Context context) {
        return getNotMetRequirements(context) == 0;
    }

    public int getNotMetRequirements(android.content.Context context) {
        int notMetNetworkRequirements = getNotMetNetworkRequirements(context);
        if (isChargingRequired() && !isDeviceCharging(context)) {
            notMetNetworkRequirements |= 8;
        }
        if (isIdleRequired() && !isDeviceIdle(context)) {
            notMetNetworkRequirements |= 4;
        }
        return (!isStorageNotLowRequired() || isStorageNotLow(context)) ? notMetNetworkRequirements : notMetNetworkRequirements | 16;
    }

    private int getNotMetNetworkRequirements(android.content.Context context) {
        if (!isNetworkRequired()) {
            return 0;
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) androidx.media3.common.util.Assertions.checkNotNull(context.getSystemService("connectivity"));
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && isInternetConnectivityValidated(connectivityManager)) {
            return (isUnmeteredNetworkRequired() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0;
        }
        return this.requirements & 3;
    }

    private boolean isDeviceCharging(android.content.Context context) {
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean isDeviceIdle(android.content.Context context) {
        android.os.PowerManager powerManager = (android.os.PowerManager) androidx.media3.common.util.Assertions.checkNotNull(context.getSystemService("power"));
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        return androidx.media3.common.util.Util.SDK_INT < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
    }

    private boolean isStorageNotLow(android.content.Context context) {
        return context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    private static boolean isInternetConnectivityValidated(android.net.ConnectivityManager connectivityManager) {
        if (androidx.media3.common.util.Util.SDK_INT < 24) {
            return true;
        }
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (java.lang.SecurityException unused) {
            return true;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.requirements == ((androidx.media3.exoplayer.scheduler.Requirements) obj).requirements;
    }

    public int hashCode() {
        return this.requirements;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.requirements);
    }
}
