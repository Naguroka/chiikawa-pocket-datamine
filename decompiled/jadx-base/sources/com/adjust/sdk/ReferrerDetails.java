package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class ReferrerDetails {
    public java.lang.Boolean googlePlayInstant;
    public long installBeginTimestampSeconds;
    public long installBeginTimestampServerSeconds;
    public java.lang.String installReferrer;
    public java.lang.String installVersion;
    public java.lang.Boolean isClick;
    public long referrerClickTimestampSeconds;
    public long referrerClickTimestampServerSeconds;

    public ReferrerDetails(java.lang.String str, long j, long j2) {
        this(str, j, j2, -1L, -1L, null, null, null);
    }

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString(" installReferrer : %s referrerClickTimestampSeconds : %d installBeginTimestampSeconds : %d referrerClickTimestampServerSeconds : %d installBeginTimestampServerSeconds : %d installVersion : %s googlePlayInstant : %s isClick: %s", this.installReferrer, java.lang.Long.valueOf(this.referrerClickTimestampSeconds), java.lang.Long.valueOf(this.installBeginTimestampSeconds), java.lang.Long.valueOf(this.referrerClickTimestampServerSeconds), java.lang.Long.valueOf(this.installBeginTimestampServerSeconds), this.installVersion, this.googlePlayInstant, this.isClick);
    }

    public ReferrerDetails(java.lang.String str, long j, long j2, long j3, long j4, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.installReferrer = str;
        this.referrerClickTimestampSeconds = j;
        this.installBeginTimestampSeconds = j2;
        this.referrerClickTimestampServerSeconds = j3;
        this.installBeginTimestampServerSeconds = j4;
        this.installVersion = str2;
        this.googlePlayInstant = bool;
        this.isClick = bool2;
    }

    public ReferrerDetails(java.lang.String str, long j, java.lang.Boolean bool) {
        this(str, j, -1L, -1L, -1L, null, null, bool);
    }
}
