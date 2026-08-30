package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class ProgramInformation {
    public final java.lang.String copyright;
    public final java.lang.String lang;
    public final java.lang.String moreInformationURL;
    public final java.lang.String source;
    public final java.lang.String title;

    public ProgramInformation(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.title = str;
        this.source = str2;
        this.copyright = str3;
        this.moreInformationURL = str4;
        this.lang = str5;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.exoplayer.dash.manifest.ProgramInformation)) {
            return false;
        }
        androidx.media3.exoplayer.dash.manifest.ProgramInformation programInformation = (androidx.media3.exoplayer.dash.manifest.ProgramInformation) obj;
        return androidx.media3.common.util.Util.areEqual(this.title, programInformation.title) && androidx.media3.common.util.Util.areEqual(this.source, programInformation.source) && androidx.media3.common.util.Util.areEqual(this.copyright, programInformation.copyright) && androidx.media3.common.util.Util.areEqual(this.moreInformationURL, programInformation.moreInformationURL) && androidx.media3.common.util.Util.areEqual(this.lang, programInformation.lang);
    }

    public int hashCode() {
        java.lang.String str = this.title;
        int iHashCode = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.copyright;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        java.lang.String str4 = this.moreInformationURL;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        java.lang.String str5 = this.lang;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
