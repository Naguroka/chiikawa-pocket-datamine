package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device {
    private final int arch;
    private final int cores;
    private final long diskSpace;
    private final java.lang.String manufacturer;
    private final java.lang.String model;
    private final java.lang.String modelClass;
    private final long ram;
    private final boolean simulator;
    private final int state;

    private AutoValue_CrashlyticsReport_Session_Device(int i, java.lang.String str, int i2, long j, long j2, boolean z, int i3, java.lang.String str2, java.lang.String str3) {
        this.arch = i;
        this.model = str;
        this.cores = i2;
        this.ram = j;
        this.diskSpace = j2;
        this.simulator = z;
        this.state = i3;
        this.manufacturer = str2;
        this.modelClass = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getArch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public java.lang.String getModel() {
        return this.model;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getCores() {
        return this.cores;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getRam() {
        return this.ram;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getDiskSpace() {
        return this.diskSpace;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public boolean isSimulator() {
        return this.simulator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getState() {
        return this.state;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public java.lang.String getManufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public java.lang.String getModelClass() {
        return this.modelClass;
    }

    public java.lang.String toString() {
        return "Device{arch=" + this.arch + ", model=" + this.model + ", cores=" + this.cores + ", ram=" + this.ram + ", diskSpace=" + this.diskSpace + ", simulator=" + this.simulator + ", state=" + this.state + ", manufacturer=" + this.manufacturer + ", modelClass=" + this.modelClass + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device device = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device) obj;
        return this.arch == device.getArch() && this.model.equals(device.getModel()) && this.cores == device.getCores() && this.ram == device.getRam() && this.diskSpace == device.getDiskSpace() && this.simulator == device.isSimulator() && this.state == device.getState() && this.manufacturer.equals(device.getManufacturer()) && this.modelClass.equals(device.getModelClass());
    }

    public int hashCode() {
        int iHashCode = (((((this.arch ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.cores) * 1000003;
        long j = this.ram;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.diskSpace;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.simulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.modelClass.hashCode();
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder {
        private int arch;
        private int cores;
        private long diskSpace;
        private java.lang.String manufacturer;
        private java.lang.String model;
        private java.lang.String modelClass;
        private long ram;
        private byte set$0;
        private boolean simulator;
        private int state;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setArch(int i) {
            this.arch = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModel(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null model");
            }
            this.model = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setCores(int i) {
            this.cores = i;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setRam(long j) {
            this.ram = j;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setDiskSpace(long j) {
            this.diskSpace = j;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setSimulator(boolean z) {
            this.simulator = z;
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setState(int i) {
            this.state = i;
            this.set$0 = (byte) (this.set$0 | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setManufacturer(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null manufacturer");
            }
            this.manufacturer = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModelClass(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null modelClass");
            }
            this.modelClass = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device build() {
            if (this.set$0 != 63 || this.model == null || this.manufacturer == null || this.modelClass == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if ((this.set$0 & 1) == 0) {
                    sb.append(" arch");
                }
                if (this.model == null) {
                    sb.append(" model");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" cores");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" ram");
                }
                if ((this.set$0 & 8) == 0) {
                    sb.append(" diskSpace");
                }
                if ((this.set$0 & 16) == 0) {
                    sb.append(" simulator");
                }
                if ((this.set$0 & 32) == 0) {
                    sb.append(" state");
                }
                if (this.manufacturer == null) {
                    sb.append(" manufacturer");
                }
                if (this.modelClass == null) {
                    sb.append(" modelClass");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device(this.arch, this.model, this.cores, this.ram, this.diskSpace, this.simulator, this.state, this.manufacturer, this.modelClass);
        }
    }
}
