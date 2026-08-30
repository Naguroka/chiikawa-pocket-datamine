package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityPackage implements java.io.Serializable {
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = -35935556512024097L;
    private com.adjust.sdk.ActivityKind activityKind;
    private java.util.Map<java.lang.String, java.lang.String> callbackParameters;
    private long clickTimeInMilliseconds;
    private long clickTimeInSeconds;
    private long clickTimeServerInSeconds;
    private java.lang.String clientSdk;
    public transient com.adjust.sdk.AdjustEvent event;
    private int firstErrorCode;
    private java.lang.Boolean googlePlayInstant;
    private transient int hashCode;
    private long installBeginTimeInSeconds;
    private long installBeginTimeServerInSeconds;
    private java.lang.String installVersion;
    private java.lang.Boolean isClick;
    private int lastErrorCode;
    private java.util.Map<java.lang.String, java.lang.String> parameters;
    private java.util.Map<java.lang.String, java.lang.String> partnerParameters;
    private java.lang.String path;
    private com.adjust.sdk.OnPurchaseVerificationFinishedListener purchaseVerificationCallback;
    private int retries;
    private int retryCount;
    private java.lang.String suffix;
    private double waitBeforeSendTimeSeconds;

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        serialPersistentFields = new java.io.ObjectStreamField[]{new java.io.ObjectStreamField("path", java.lang.String.class), new java.io.ObjectStreamField("clientSdk", java.lang.String.class), new java.io.ObjectStreamField("parameters", java.util.Map.class), new java.io.ObjectStreamField("activityKind", com.adjust.sdk.ActivityKind.class), new java.io.ObjectStreamField("suffix", java.lang.String.class), new java.io.ObjectStreamField("callbackParameters", java.util.Map.class), new java.io.ObjectStreamField("partnerParameters", java.util.Map.class), new java.io.ObjectStreamField("retryCount", cls), new java.io.ObjectStreamField("firstErrorCode", cls), new java.io.ObjectStreamField("lastErrorCode", cls), new java.io.ObjectStreamField("waitBeforeSendTimeSeconds", java.lang.Double.TYPE)};
    }

    public ActivityPackage(com.adjust.sdk.ActivityKind activityKind) {
        com.adjust.sdk.ActivityKind activityKind2 = com.adjust.sdk.ActivityKind.UNKNOWN;
        this.activityKind = activityKind;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        java.io.ObjectInputStream.GetField fields = objectInputStream.readFields();
        this.path = com.adjust.sdk.Util.readStringField(fields, "path", null);
        this.clientSdk = com.adjust.sdk.Util.readStringField(fields, "clientSdk", null);
        this.parameters = (java.util.Map) com.adjust.sdk.Util.readObjectField(fields, "parameters", null);
        this.activityKind = (com.adjust.sdk.ActivityKind) com.adjust.sdk.Util.readObjectField(fields, "activityKind", com.adjust.sdk.ActivityKind.UNKNOWN);
        this.suffix = com.adjust.sdk.Util.readStringField(fields, "suffix", null);
        this.callbackParameters = (java.util.Map) com.adjust.sdk.Util.readObjectField(fields, "callbackParameters", null);
        this.partnerParameters = (java.util.Map) com.adjust.sdk.Util.readObjectField(fields, "partnerParameters", null);
        this.retryCount = com.adjust.sdk.Util.readIntField(fields, "errorCount", 0);
        this.firstErrorCode = com.adjust.sdk.Util.readIntField(fields, "firstErrorCode", 0);
        this.lastErrorCode = com.adjust.sdk.Util.readIntField(fields, "lastErrorCode", 0);
        this.waitBeforeSendTimeSeconds = com.adjust.sdk.Util.readDoubleField(fields, "waitBeforeSendTimeSeconds", 0.0d);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
    }

    public void addError(int i) {
        this.retryCount++;
        if (this.firstErrorCode == 0) {
            this.firstErrorCode = i;
        } else {
            this.lastErrorCode = i;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.adjust.sdk.ActivityPackage activityPackage = (com.adjust.sdk.ActivityPackage) obj;
        return com.adjust.sdk.Util.equalString(this.path, activityPackage.path) && com.adjust.sdk.Util.equalString(this.clientSdk, activityPackage.clientSdk) && com.adjust.sdk.Util.equalObject(this.parameters, activityPackage.parameters) && com.adjust.sdk.Util.equalEnum(this.activityKind, activityPackage.activityKind) && com.adjust.sdk.Util.equalString(this.suffix, activityPackage.suffix) && com.adjust.sdk.Util.equalObject(this.callbackParameters, activityPackage.callbackParameters) && com.adjust.sdk.Util.equalObject(this.partnerParameters, activityPackage.partnerParameters) && com.adjust.sdk.Util.equalInt(java.lang.Integer.valueOf(this.retryCount), java.lang.Integer.valueOf(activityPackage.retryCount)) && com.adjust.sdk.Util.equalInt(java.lang.Integer.valueOf(this.firstErrorCode), java.lang.Integer.valueOf(activityPackage.firstErrorCode)) && com.adjust.sdk.Util.equalInt(java.lang.Integer.valueOf(this.lastErrorCode), java.lang.Integer.valueOf(activityPackage.lastErrorCode)) && com.adjust.sdk.Util.equalsDouble(java.lang.Double.valueOf(this.waitBeforeSendTimeSeconds), java.lang.Double.valueOf(activityPackage.waitBeforeSendTimeSeconds));
    }

    public com.adjust.sdk.ActivityKind getActivityKind() {
        return this.activityKind;
    }

    public java.util.Map<java.lang.String, java.lang.String> getCallbackParameters() {
        return this.callbackParameters;
    }

    public long getClickTimeInMilliseconds() {
        return this.clickTimeInMilliseconds;
    }

    public long getClickTimeInSeconds() {
        return this.clickTimeInSeconds;
    }

    public long getClickTimeServerInSeconds() {
        return this.clickTimeServerInSeconds;
    }

    public java.lang.String getClientSdk() {
        return this.clientSdk;
    }

    public java.lang.String getExtendedString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.adjust.sdk.Util.formatString("Path:      %s\n", this.path));
        sb.append(com.adjust.sdk.Util.formatString("ClientSdk: %s\n", this.clientSdk));
        if (this.parameters != null) {
            sb.append("Parameters:");
            java.util.TreeMap treeMap = new java.util.TreeMap(this.parameters);
            java.util.List listAsList = java.util.Arrays.asList("secret_id", "adj_signing_id");
            for (java.util.Map.Entry entry : treeMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (!listAsList.contains(str)) {
                    sb.append(com.adjust.sdk.Util.formatString("\n\t%-16s %s", str, entry.getValue()));
                }
            }
        }
        return sb.toString();
    }

    public java.lang.String getFailureMessage() {
        return com.adjust.sdk.Util.formatString("Failed to track %s%s", this.activityKind.toString(), this.suffix);
    }

    public int getFirstErrorCode() {
        return this.firstErrorCode;
    }

    public java.lang.Boolean getGooglePlayInstant() {
        return this.googlePlayInstant;
    }

    public long getInstallBeginTimeInSeconds() {
        return this.installBeginTimeInSeconds;
    }

    public long getInstallBeginTimeServerInSeconds() {
        return this.installBeginTimeServerInSeconds;
    }

    public java.lang.String getInstallVersion() {
        return this.installVersion;
    }

    public java.lang.Boolean getIsClick() {
        return this.isClick;
    }

    public int getLastErrorCode() {
        return this.lastErrorCode;
    }

    public java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return this.parameters;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPartnerParameters() {
        return this.partnerParameters;
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public com.adjust.sdk.OnPurchaseVerificationFinishedListener getPurchaseVerificationCallback() {
        return this.purchaseVerificationCallback;
    }

    public int getRetries() {
        return this.retries;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public java.lang.String getSuffix() {
        return this.suffix;
    }

    public double getWaitBeforeSendTimeSeconds() {
        return this.waitBeforeSendTimeSeconds;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 17;
            int iHashString = com.adjust.sdk.Util.hashString(this.path, 17);
            this.hashCode = iHashString;
            int iHashString2 = com.adjust.sdk.Util.hashString(this.clientSdk, iHashString);
            this.hashCode = iHashString2;
            int iHashObject = com.adjust.sdk.Util.hashObject(this.parameters, iHashString2);
            this.hashCode = iHashObject;
            int iHashEnum = com.adjust.sdk.Util.hashEnum(this.activityKind, iHashObject);
            this.hashCode = iHashEnum;
            int iHashString3 = com.adjust.sdk.Util.hashString(this.suffix, iHashEnum);
            this.hashCode = iHashString3;
            int iHashObject2 = com.adjust.sdk.Util.hashObject(this.callbackParameters, iHashString3);
            this.hashCode = iHashObject2;
            this.hashCode = (((((com.adjust.sdk.Util.hashObject(this.partnerParameters, iHashObject2) * 37) + this.retryCount) * 37) + this.firstErrorCode) * 37) + this.lastErrorCode;
            this.hashCode = com.adjust.sdk.Util.hashDouble(java.lang.Double.valueOf(this.waitBeforeSendTimeSeconds), this.hashCode);
        }
        return this.hashCode;
    }

    public int increaseRetries() {
        int i = this.retries + 1;
        this.retries = i;
        return i;
    }

    public void setCallbackParameters(java.util.Map<java.lang.String, java.lang.String> map) {
        this.callbackParameters = map;
    }

    public void setClickTimeInMilliseconds(long j) {
        this.clickTimeInMilliseconds = j;
    }

    public void setClickTimeInSeconds(long j) {
        this.clickTimeInSeconds = j;
    }

    public void setClickTimeServerInSeconds(long j) {
        this.clickTimeServerInSeconds = j;
    }

    public void setClientSdk(java.lang.String str) {
        this.clientSdk = str;
    }

    public void setGooglePlayInstant(java.lang.Boolean bool) {
        this.googlePlayInstant = bool;
    }

    public void setInstallBeginTimeInSeconds(long j) {
        this.installBeginTimeInSeconds = j;
    }

    public void setInstallBeginTimeServerInSeconds(long j) {
        this.installBeginTimeServerInSeconds = j;
    }

    public void setInstallVersion(java.lang.String str) {
        this.installVersion = str;
    }

    public void setIsClick(java.lang.Boolean bool) {
        this.isClick = bool;
    }

    public void setParameters(java.util.Map<java.lang.String, java.lang.String> map) {
        this.parameters = map;
    }

    public void setPartnerParameters(java.util.Map<java.lang.String, java.lang.String> map) {
        this.partnerParameters = map;
    }

    public void setPath(java.lang.String str) {
        this.path = str;
    }

    public void setPurchaseVerificationCallback(com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.purchaseVerificationCallback = onPurchaseVerificationFinishedListener;
    }

    public void setSuffix(java.lang.String str) {
        this.suffix = str;
    }

    public void setWaitBeforeSendTimeSeconds(double d) {
        this.waitBeforeSendTimeSeconds = d;
    }

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString("%s%s", this.activityKind.toString(), this.suffix);
    }
}
