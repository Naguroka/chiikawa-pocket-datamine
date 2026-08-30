package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTrackNameProvider implements androidx.media3.ui.TrackNameProvider {
    private final android.content.res.Resources resources;

    public DefaultTrackNameProvider(android.content.res.Resources resources) {
        this.resources = (android.content.res.Resources) androidx.media3.common.util.Assertions.checkNotNull(resources);
    }

    @Override // androidx.media3.ui.TrackNameProvider
    public java.lang.String getTrackName(androidx.media3.common.Format format) {
        java.lang.String strBuildLanguageOrLabelString;
        int iInferPrimaryTrackType = inferPrimaryTrackType(format);
        if (iInferPrimaryTrackType == 2) {
            strBuildLanguageOrLabelString = joinWithSeparator(buildRoleString(format), buildResolutionString(format), buildBitrateString(format));
        } else if (iInferPrimaryTrackType == 1) {
            strBuildLanguageOrLabelString = joinWithSeparator(buildLanguageOrLabelString(format), buildAudioChannelString(format), buildBitrateString(format));
        } else {
            strBuildLanguageOrLabelString = buildLanguageOrLabelString(format);
        }
        if (strBuildLanguageOrLabelString.length() != 0) {
            return strBuildLanguageOrLabelString;
        }
        java.lang.String str = format.language;
        return (str == null || str.trim().isEmpty()) ? this.resources.getString(androidx.media3.ui.R.string.exo_track_unknown) : this.resources.getString(androidx.media3.ui.R.string.exo_track_unknown_name, str);
    }

    private java.lang.String buildResolutionString(androidx.media3.common.Format format) {
        int i = format.width;
        int i2 = format.height;
        return (i == -1 || i2 == -1) ? "" : this.resources.getString(androidx.media3.ui.R.string.exo_track_resolution, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }

    private java.lang.String buildBitrateString(androidx.media3.common.Format format) {
        int i = format.bitrate;
        return i == -1 ? "" : this.resources.getString(androidx.media3.ui.R.string.exo_track_bitrate, java.lang.Float.valueOf(i / 1000000.0f));
    }

    private java.lang.String buildAudioChannelString(androidx.media3.common.Format format) {
        int i = format.channelCount;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.resources.getString(androidx.media3.ui.R.string.exo_track_mono);
        }
        if (i == 2) {
            return this.resources.getString(androidx.media3.ui.R.string.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.resources.getString(androidx.media3.ui.R.string.exo_track_surround_5_point_1);
        }
        if (i == 8) {
            return this.resources.getString(androidx.media3.ui.R.string.exo_track_surround_7_point_1);
        }
        return this.resources.getString(androidx.media3.ui.R.string.exo_track_surround);
    }

    private java.lang.String buildLanguageOrLabelString(androidx.media3.common.Format format) {
        java.lang.String strJoinWithSeparator = joinWithSeparator(buildLanguageString(format), buildRoleString(format));
        return android.text.TextUtils.isEmpty(strJoinWithSeparator) ? buildLabelString(format) : strJoinWithSeparator;
    }

    private java.lang.String buildLabelString(androidx.media3.common.Format format) {
        return android.text.TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    private java.lang.String buildLanguageString(androidx.media3.common.Format format) {
        java.lang.String str = format.language;
        if (android.text.TextUtils.isEmpty(str) || androidx.media3.common.C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        java.util.Locale localeForLanguageTag = androidx.media3.common.util.Util.SDK_INT >= 21 ? java.util.Locale.forLanguageTag(str) : new java.util.Locale(str);
        java.util.Locale defaultDisplayLocale = androidx.media3.common.util.Util.getDefaultDisplayLocale();
        java.lang.String displayName = localeForLanguageTag.getDisplayName(defaultDisplayLocale);
        if (android.text.TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(defaultDisplayLocale) + displayName.substring(iOffsetByCodePoints);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private java.lang.String buildRoleString(androidx.media3.common.Format format) {
        java.lang.String string = (format.roleFlags & 2) != 0 ? this.resources.getString(androidx.media3.ui.R.string.exo_track_role_alternate) : "";
        if ((format.roleFlags & 4) != 0) {
            string = joinWithSeparator(string, this.resources.getString(androidx.media3.ui.R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            string = joinWithSeparator(string, this.resources.getString(androidx.media3.ui.R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? joinWithSeparator(string, this.resources.getString(androidx.media3.ui.R.string.exo_track_role_closed_captions)) : string;
    }

    private java.lang.String joinWithSeparator(java.lang.String... strArr) {
        java.lang.String string = "";
        for (java.lang.String str : strArr) {
            if (str.length() > 0) {
                string = android.text.TextUtils.isEmpty(string) ? str : this.resources.getString(androidx.media3.ui.R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    private static int inferPrimaryTrackType(androidx.media3.common.Format format) {
        int trackType = androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (androidx.media3.common.MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (androidx.media3.common.MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }
}
