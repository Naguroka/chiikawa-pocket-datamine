package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device {
    private final java.lang.Double batteryLevel;
    private final int batteryVelocity;
    private final long diskUsed;
    private final int orientation;
    private final boolean proximityOn;
    private final long ramUsed;

    private AutoValue_CrashlyticsReport_Session_Event_Device(java.lang.Double d, int i, boolean z, int i2, long j, long j2) {
        this.batteryLevel = d;
        this.batteryVelocity = i;
        this.proximityOn = z;
        this.orientation = i2;
        this.ramUsed = j;
        this.diskUsed = j2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public java.lang.Double getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getBatteryVelocity() {
        return this.batteryVelocity;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public boolean isProximityOn() {
        return this.proximityOn;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getOrientation() {
        return this.orientation;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getRamUsed() {
        return this.ramUsed;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getDiskUsed() {
        return this.diskUsed;
    }

    public java.lang.String toString() {
        return "Device{batteryLevel=" + this.batteryLevel + ", batteryVelocity=" + this.batteryVelocity + ", proximityOn=" + this.proximityOn + ", orientation=" + this.orientation + ", ramUsed=" + this.ramUsed + ", diskUsed=" + this.diskUsed + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device device = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device) obj;
        java.lang.Double d = this.batteryLevel;
        if (d != null ? d.equals(device.getBatteryLevel()) : device.getBatteryLevel() == null) {
            if (this.batteryVelocity == device.getBatteryVelocity() && this.proximityOn == device.isProximityOn() && this.orientation == device.getOrientation() && this.ramUsed == device.getRamUsed() && this.diskUsed == device.getDiskUsed()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Double d = this.batteryLevel;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.batteryVelocity) * 1000003) ^ (this.proximityOn ? 1231 : 1237)) * 1000003) ^ this.orientation) * 1000003;
        long j = this.ramUsed;
        long j2 = this.diskUsed;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder {
        private java.lang.Double batteryLevel;
        private int batteryVelocity;
        private long diskUsed;
        private int orientation;
        private boolean proximityOn;
        private long ramUsed;
        private byte set$0;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(java.lang.Double d) {
            this.batteryLevel = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i) {
            this.batteryVelocity = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z) {
            this.proximityOn = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i) {
            this.orientation = i;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j) {
            this.ramUsed = j;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j) {
            this.diskUsed = j;
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device build() {
            if (this.set$0 != 31) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if ((this.set$0 & 1) == 0) {
                    sb.append(" batteryVelocity");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" proximityOn");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" orientation");
                }
                if ((this.set$0 & 8) == 0) {
                    sb.append(" ramUsed");
                }
                if ((this.set$0 & 16) == 0) {
                    sb.append(" diskUsed");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device(this.batteryLevel, this.batteryVelocity, this.proximityOn, this.orientation, this.ramUsed, this.diskUsed);
        }
    }
}
