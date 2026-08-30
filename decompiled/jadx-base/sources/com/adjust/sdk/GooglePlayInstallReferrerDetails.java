package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayInstallReferrerDetails {
    public java.lang.Boolean googlePlayInstant;
    public long installBeginTimestampSeconds;
    public long installBeginTimestampServerSeconds;
    public java.lang.String installReferrer;
    public java.lang.String installVersion;
    public long referrerClickTimestampSeconds;
    public long referrerClickTimestampServerSeconds;

    public GooglePlayInstallReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails) {
        if (referrerDetails == null) {
            return;
        }
        this.installReferrer = referrerDetails.installReferrer;
        this.referrerClickTimestampSeconds = referrerDetails.referrerClickTimestampSeconds;
        this.installBeginTimestampSeconds = referrerDetails.installBeginTimestampSeconds;
        this.referrerClickTimestampServerSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        this.installBeginTimestampServerSeconds = referrerDetails.installBeginTimestampServerSeconds;
        this.installVersion = referrerDetails.installVersion;
        this.googlePlayInstant = referrerDetails.googlePlayInstant;
    }

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString(" installReferrer : %s referrerClickTimestampSeconds : %d installBeginTimestampSeconds : %d referrerClickTimestampServerSeconds : %d installBeginTimestampServerSeconds : %d installVersion : %s googlePlayInstant : %s", this.installReferrer, java.lang.Long.valueOf(this.referrerClickTimestampSeconds), java.lang.Long.valueOf(this.installBeginTimestampSeconds), java.lang.Long.valueOf(this.referrerClickTimestampServerSeconds), java.lang.Long.valueOf(this.installBeginTimestampServerSeconds), this.installVersion, this.googlePlayInstant);
    }
}
