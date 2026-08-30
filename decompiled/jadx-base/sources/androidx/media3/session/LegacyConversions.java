package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class LegacyConversions {
    private static final java.lang.String TAG = "LegacyConversions";
    public static final androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot defaultBrowserRoot = new androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot(androidx.media3.session.MediaLibraryService.SERVICE_INTERFACE, null);
    public static final com.google.common.collect.ImmutableSet<java.lang.String> KNOWN_METADATA_COMPAT_KEYS = com.google.common.collect.ImmutableSet.of("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", androidx.media3.session.MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT);

    private static int convertToFolderType(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    public static int convertToLegacyErrorCode(int i) {
        if (i == -110) {
            return 8;
        }
        if (i == -109) {
            return 11;
        }
        if (i == -6) {
            return 2;
        }
        if (i == -2) {
            return 1;
        }
        if (i == 1) {
            return 10;
        }
        switch (i) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    public static int convertToPlaybackStateCompatShuffleMode(boolean z) {
        return z ? 1 : 0;
    }

    public static long convertToQueueItemId(int i) {
        if (i == -1) {
            return -1L;
        }
        return i;
    }

    private static int convertToSessionErrorCode(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    private static boolean hasAction(long j, long j2) {
        return (j & j2) != 0;
    }

    public static class ConversionException extends java.lang.Exception {
        private ConversionException(java.lang.String str) {
            super(str);
        }

        private ConversionException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    public static androidx.media3.common.PlaybackException convertToPlaybackException(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null || playbackStateCompat.getState() != 7) {
            return null;
        }
        java.lang.CharSequence errorMessage = playbackStateCompat.getErrorMessage();
        android.os.Bundle extras = playbackStateCompat.getExtras();
        java.lang.String string = errorMessage != null ? errorMessage.toString() : null;
        int iConvertToPlaybackExceptionErrorCode = convertToPlaybackExceptionErrorCode(playbackStateCompat.getErrorCode());
        if (extras == null) {
            extras = android.os.Bundle.EMPTY;
        }
        return new androidx.media3.common.PlaybackException(string, null, iConvertToPlaybackExceptionErrorCode, extras);
    }

    public static androidx.media3.session.SessionError convertToSessionError(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, android.content.Context context) {
        if (playbackStateCompat == null) {
            return null;
        }
        return convertToSessionError(playbackStateCompat.getState(), playbackStateCompat.getErrorCode(), playbackStateCompat.getErrorMessage(), playbackStateCompat.getExtras(), context);
    }

    static androidx.media3.session.SessionError convertToSessionError(int i, int i2, java.lang.CharSequence charSequence, android.os.Bundle bundle, android.content.Context context) {
        java.lang.String sessionErrorMessage;
        if (i == 7 || i2 == 0) {
            return null;
        }
        int iConvertToSessionErrorCode = convertToSessionErrorCode(i2);
        if (charSequence != null) {
            sessionErrorMessage = charSequence.toString();
        } else {
            sessionErrorMessage = getSessionErrorMessage(iConvertToSessionErrorCode, context);
        }
        if (bundle == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        return new androidx.media3.session.SessionError(iConvertToSessionErrorCode, sessionErrorMessage, bundle);
    }

    private static java.lang.String getSessionErrorMessage(int i, android.content.Context context) {
        if (i == -100) {
            return context.getString(androidx.media3.session.R.string.error_message_disconnected);
        }
        if (i == 1) {
            return context.getString(androidx.media3.session.R.string.error_message_info_cancelled);
        }
        if (i == -6) {
            return context.getString(androidx.media3.session.R.string.error_message_not_supported);
        }
        if (i == -5) {
            return context.getString(androidx.media3.session.R.string.error_message_io);
        }
        if (i == -4) {
            return context.getString(androidx.media3.session.R.string.error_message_permission_denied);
        }
        if (i == -3) {
            return context.getString(androidx.media3.session.R.string.error_message_bad_value);
        }
        if (i == -2) {
            return context.getString(androidx.media3.session.R.string.error_message_invalid_state);
        }
        switch (i) {
            case -110:
                return context.getString(androidx.media3.session.R.string.error_message_content_already_playing);
            case -109:
                return context.getString(androidx.media3.session.R.string.error_message_end_of_playlist);
            case -108:
                return context.getString(androidx.media3.session.R.string.error_message_setup_required);
            case -107:
                return context.getString(androidx.media3.session.R.string.error_message_skip_limit_reached);
            case -106:
                return context.getString(androidx.media3.session.R.string.error_message_not_available_in_region);
            case -105:
                return context.getString(androidx.media3.session.R.string.error_message_parental_control_restricted);
            case -104:
                return context.getString(androidx.media3.session.R.string.error_message_concurrent_stream_limit);
            case -103:
                return context.getString(androidx.media3.session.R.string.error_message_premium_account_required);
            case -102:
                return context.getString(androidx.media3.session.R.string.error_message_authentication_expired);
            default:
                return context.getString(androidx.media3.session.R.string.error_message_fallback);
        }
    }

    private static int convertToPlaybackExceptionErrorCode(int i) {
        int iConvertToSessionErrorCode = convertToSessionErrorCode(i);
        if (iConvertToSessionErrorCode == -5) {
            return 2000;
        }
        if (iConvertToSessionErrorCode != -1) {
            return iConvertToSessionErrorCode;
        }
        return 1000;
    }

    public static int convertToLegacyErrorCode(androidx.media3.common.PlaybackException playbackException) {
        return convertToLegacyErrorCode(playbackException.errorCode);
    }

    public static androidx.media3.session.legacy.MediaBrowserCompat.MediaItem convertToBrowserItem(androidx.media3.common.MediaItem mediaItem, android.graphics.Bitmap bitmap) {
        androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompatConvertToMediaDescriptionCompat = convertToMediaDescriptionCompat(mediaItem, bitmap);
        androidx.media3.common.MediaMetadata mediaMetadata = mediaItem.mediaMetadata;
        int i = (mediaMetadata.isBrowsable == null || !mediaMetadata.isBrowsable.booleanValue()) ? 0 : 1;
        if (mediaMetadata.isPlayable != null && mediaMetadata.isPlayable.booleanValue()) {
            i |= 2;
        }
        return new androidx.media3.session.legacy.MediaBrowserCompat.MediaItem(mediaDescriptionCompatConvertToMediaDescriptionCompat, i);
    }

    public static androidx.media3.common.MediaItem convertToMediaItem(androidx.media3.session.legacy.MediaBrowserCompat.MediaItem mediaItem) {
        return convertToMediaItem(mediaItem.getDescription(), mediaItem.isBrowsable(), mediaItem.isPlayable());
    }

    public static androidx.media3.common.MediaItem convertToMediaItem(androidx.media3.session.legacy.MediaSessionCompat.QueueItem queueItem) {
        return convertToMediaItem(queueItem.getDescription());
    }

    public static androidx.media3.common.MediaItem convertToMediaItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        androidx.media3.common.util.Assertions.checkNotNull(mediaDescriptionCompat);
        return convertToMediaItem(mediaDescriptionCompat, false, true);
    }

    public static androidx.media3.common.MediaItem convertToMediaItem(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, int i) {
        return convertToMediaItem(mediaMetadataCompat.getString("android.media.metadata.MEDIA_ID"), mediaMetadataCompat, i);
    }

    public static androidx.media3.common.MediaItem convertToMediaItem(java.lang.String str, androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, int i) {
        androidx.media3.common.MediaItem.Builder builder = new androidx.media3.common.MediaItem.Builder();
        if (str != null) {
            builder.setMediaId(str);
        }
        java.lang.String string = mediaMetadataCompat.getString("android.media.metadata.MEDIA_URI");
        if (string != null) {
            builder.setRequestMetadata(new androidx.media3.common.MediaItem.RequestMetadata.Builder().setMediaUri(android.net.Uri.parse(string)).build());
        }
        builder.setMediaMetadata(convertToMediaMetadata(mediaMetadataCompat, i));
        return builder.build();
    }

    private static androidx.media3.common.MediaItem convertToMediaItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, boolean z, boolean z2) {
        java.lang.String mediaId = mediaDescriptionCompat.getMediaId();
        androidx.media3.common.MediaItem.Builder builder = new androidx.media3.common.MediaItem.Builder();
        if (mediaId == null) {
            mediaId = "";
        }
        return builder.setMediaId(mediaId).setRequestMetadata(new androidx.media3.common.MediaItem.RequestMetadata.Builder().setMediaUri(mediaDescriptionCompat.getMediaUri()).build()).setMediaMetadata(convertToMediaMetadata(mediaDescriptionCompat, 0, z, z2)).build();
    }

    public static com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem> convertBrowserItemListToMediaItemList(java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < list.size(); i++) {
            builder.add(convertToMediaItem(list.get(i)));
        }
        return builder.build();
    }

    public static java.util.List<androidx.media3.common.MediaItem> convertToMediaItemList(androidx.media3.common.Timeline timeline) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        for (int i = 0; i < timeline.getWindowCount(); i++) {
            arrayList.add(timeline.getWindow(i, window).mediaItem);
        }
        return arrayList;
    }

    public static androidx.media3.session.legacy.MediaSessionCompat.QueueItem convertToQueueItem(androidx.media3.common.MediaItem mediaItem, int i, android.graphics.Bitmap bitmap) {
        return new androidx.media3.session.legacy.MediaSessionCompat.QueueItem(convertToMediaDescriptionCompat(mediaItem, bitmap), convertToQueueItemId(i));
    }

    public static androidx.media3.common.Timeline.Window convertToWindow(androidx.media3.common.MediaItem mediaItem, int i) {
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        window.set(0, mediaItem, null, 0L, 0L, 0L, true, false, null, 0L, androidx.media3.common.C.TIME_UNSET, i, i, 0L);
        return window;
    }

    public static androidx.media3.common.Timeline.Period convertToPeriod(int i) {
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        period.set(null, null, i, androidx.media3.common.C.TIME_UNSET, 0L, androidx.media3.common.AdPlaybackState.NONE, true);
        return period;
    }

    public static androidx.media3.common.MediaMetadata convertToMediaMetadata(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return androidx.media3.common.MediaMetadata.EMPTY;
        }
        return new androidx.media3.common.MediaMetadata.Builder().setTitle(charSequence).build();
    }

    public static androidx.media3.common.MediaMetadata convertToMediaMetadata(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i) {
        return convertToMediaMetadata(mediaDescriptionCompat, i, false, true);
    }

    private static androidx.media3.common.MediaMetadata convertToMediaMetadata(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i, boolean z, boolean z2) {
        byte[] bArrConvertToByteArray;
        if (mediaDescriptionCompat == null) {
            return androidx.media3.common.MediaMetadata.EMPTY;
        }
        androidx.media3.common.MediaMetadata.Builder builder = new androidx.media3.common.MediaMetadata.Builder();
        builder.setSubtitle(mediaDescriptionCompat.getSubtitle()).setDescription(mediaDescriptionCompat.getDescription()).setArtworkUri(mediaDescriptionCompat.getIconUri()).setUserRating(convertToRating(androidx.media3.session.legacy.RatingCompat.newUnratedRating(i)));
        android.graphics.Bitmap iconBitmap = mediaDescriptionCompat.getIconBitmap();
        if (iconBitmap != null) {
            try {
                bArrConvertToByteArray = convertToByteArray(iconBitmap);
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.w(TAG, "Failed to convert iconBitmap to artworkData", e);
                bArrConvertToByteArray = null;
            }
            builder.setArtworkData(bArrConvertToByteArray, 3);
        }
        android.os.Bundle extras = mediaDescriptionCompat.getExtras();
        android.os.Bundle bundle = extras != null ? new android.os.Bundle(extras) : null;
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            builder.setFolderType(java.lang.Integer.valueOf(convertToFolderType(bundle.getLong("android.media.extra.BT_FOLDER_TYPE"))));
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        builder.setIsBrowsable(java.lang.Boolean.valueOf(z));
        if (bundle != null && bundle.containsKey(androidx.media3.session.MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT)) {
            builder.setMediaType(java.lang.Integer.valueOf((int) bundle.getLong(androidx.media3.session.MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT)));
            bundle.remove(androidx.media3.session.MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT);
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            builder.setTitle(bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title"));
            builder.setDisplayTitle(mediaDescriptionCompat.getTitle());
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            builder.setTitle(mediaDescriptionCompat.getTitle());
        }
        if (bundle != null && !bundle.isEmpty()) {
            builder.setExtras(bundle);
        }
        builder.setIsPlayable(java.lang.Boolean.valueOf(z2));
        return builder.build();
    }

    public static androidx.media3.common.MediaMetadata convertToMediaMetadata(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, int i) {
        if (mediaMetadataCompat == null) {
            return androidx.media3.common.MediaMetadata.EMPTY;
        }
        androidx.media3.common.MediaMetadata.Builder builder = new androidx.media3.common.MediaMetadata.Builder();
        java.lang.CharSequence text = mediaMetadataCompat.getText("android.media.metadata.TITLE");
        java.lang.CharSequence text2 = mediaMetadataCompat.getText("android.media.metadata.DISPLAY_TITLE");
        androidx.media3.common.MediaMetadata.Builder title = builder.setTitle(text != null ? text : text2);
        if (text == null) {
            text2 = null;
        }
        title.setDisplayTitle(text2).setSubtitle(mediaMetadataCompat.getText("android.media.metadata.DISPLAY_SUBTITLE")).setDescription(mediaMetadataCompat.getText("android.media.metadata.DISPLAY_DESCRIPTION")).setArtist(mediaMetadataCompat.getText("android.media.metadata.ARTIST")).setAlbumTitle(mediaMetadataCompat.getText("android.media.metadata.ALBUM")).setAlbumArtist(mediaMetadataCompat.getText("android.media.metadata.ALBUM_ARTIST")).setOverallRating(convertToRating(mediaMetadataCompat.getRating("android.media.metadata.RATING")));
        if (mediaMetadataCompat.containsKey("android.media.metadata.DURATION")) {
            long j = mediaMetadataCompat.getLong("android.media.metadata.DURATION");
            if (j >= 0) {
                builder.setDurationMs(java.lang.Long.valueOf(j));
            }
        }
        androidx.media3.common.Rating ratingConvertToRating = convertToRating(mediaMetadataCompat.getRating("android.media.metadata.USER_RATING"));
        if (ratingConvertToRating != null) {
            builder.setUserRating(ratingConvertToRating);
        } else {
            builder.setUserRating(convertToRating(androidx.media3.session.legacy.RatingCompat.newUnratedRating(i)));
        }
        if (mediaMetadataCompat.containsKey("android.media.metadata.YEAR")) {
            builder.setRecordingYear(java.lang.Integer.valueOf((int) mediaMetadataCompat.getLong("android.media.metadata.YEAR")));
        }
        java.lang.String firstString = getFirstString(mediaMetadataCompat, "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI");
        if (firstString != null) {
            builder.setArtworkUri(android.net.Uri.parse(firstString));
        }
        android.graphics.Bitmap firstBitmap = getFirstBitmap(mediaMetadataCompat, "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART");
        if (firstBitmap != null) {
            try {
                builder.setArtworkData(convertToByteArray(firstBitmap), 3);
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.w(TAG, "Failed to convert artworkBitmap to artworkData", e);
            }
        }
        boolean zContainsKey = mediaMetadataCompat.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        builder.setIsBrowsable(java.lang.Boolean.valueOf(zContainsKey));
        if (zContainsKey) {
            builder.setFolderType(java.lang.Integer.valueOf(convertToFolderType(mediaMetadataCompat.getLong("android.media.metadata.BT_FOLDER_TYPE"))));
        }
        if (mediaMetadataCompat.containsKey(androidx.media3.session.MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT)) {
            builder.setMediaType(java.lang.Integer.valueOf((int) mediaMetadataCompat.getLong(androidx.media3.session.MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT)));
        }
        builder.setIsPlayable(true);
        android.os.Bundle bundle = mediaMetadataCompat.getBundle();
        com.google.common.collect.UnmodifiableIterator<java.lang.String> it = KNOWN_METADATA_COMPAT_KEYS.iterator();
        while (it.hasNext()) {
            bundle.remove(it.next());
        }
        if (!bundle.isEmpty()) {
            builder.setExtras(bundle);
        }
        return builder.build();
    }

    private static android.graphics.Bitmap getFirstBitmap(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (mediaMetadataCompat.containsKey(str)) {
                return mediaMetadataCompat.getBitmap(str);
            }
        }
        return null;
    }

    private static java.lang.String getFirstString(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (mediaMetadataCompat.containsKey(str)) {
                return mediaMetadataCompat.getString(str);
            }
        }
        return null;
    }

    public static androidx.media3.session.legacy.MediaMetadataCompat convertToMediaMetadataCompat(androidx.media3.common.MediaMetadata mediaMetadata, java.lang.String str, android.net.Uri uri, long j, android.graphics.Bitmap bitmap) {
        androidx.media3.session.legacy.MediaMetadataCompat.Builder builderPutString = new androidx.media3.session.legacy.MediaMetadataCompat.Builder().putString("android.media.metadata.MEDIA_ID", str);
        if (mediaMetadata.title != null) {
            builderPutString.putText("android.media.metadata.TITLE", mediaMetadata.title);
        }
        if (mediaMetadata.displayTitle != null) {
            builderPutString.putText("android.media.metadata.DISPLAY_TITLE", mediaMetadata.displayTitle);
        }
        if (mediaMetadata.subtitle != null) {
            builderPutString.putText("android.media.metadata.DISPLAY_SUBTITLE", mediaMetadata.subtitle);
        }
        if (mediaMetadata.description != null) {
            builderPutString.putText("android.media.metadata.DISPLAY_DESCRIPTION", mediaMetadata.description);
        }
        if (mediaMetadata.artist != null) {
            builderPutString.putText("android.media.metadata.ARTIST", mediaMetadata.artist);
        }
        if (mediaMetadata.albumTitle != null) {
            builderPutString.putText("android.media.metadata.ALBUM", mediaMetadata.albumTitle);
        }
        if (mediaMetadata.albumArtist != null) {
            builderPutString.putText("android.media.metadata.ALBUM_ARTIST", mediaMetadata.albumArtist);
        }
        if (mediaMetadata.recordingYear != null) {
            builderPutString.putLong("android.media.metadata.YEAR", mediaMetadata.recordingYear.intValue());
        }
        if (uri != null) {
            builderPutString.putString("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (mediaMetadata.artworkUri != null) {
            builderPutString.putString("android.media.metadata.DISPLAY_ICON_URI", mediaMetadata.artworkUri.toString());
            builderPutString.putString("android.media.metadata.ALBUM_ART_URI", mediaMetadata.artworkUri.toString());
        }
        if (bitmap != null) {
            builderPutString.putBitmap("android.media.metadata.DISPLAY_ICON", bitmap);
            builderPutString.putBitmap("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (mediaMetadata.folderType != null && mediaMetadata.folderType.intValue() != -1) {
            builderPutString.putLong("android.media.metadata.BT_FOLDER_TYPE", convertToExtraBtFolderType(mediaMetadata.folderType.intValue()));
        }
        if (j == androidx.media3.common.C.TIME_UNSET && mediaMetadata.durationMs != null) {
            j = mediaMetadata.durationMs.longValue();
        }
        if (j != androidx.media3.common.C.TIME_UNSET) {
            builderPutString.putLong("android.media.metadata.DURATION", j);
        }
        androidx.media3.session.legacy.RatingCompat ratingCompatConvertToRatingCompat = convertToRatingCompat(mediaMetadata.userRating);
        if (ratingCompatConvertToRatingCompat != null) {
            builderPutString.putRating("android.media.metadata.USER_RATING", ratingCompatConvertToRatingCompat);
        }
        androidx.media3.session.legacy.RatingCompat ratingCompatConvertToRatingCompat2 = convertToRatingCompat(mediaMetadata.overallRating);
        if (ratingCompatConvertToRatingCompat2 != null) {
            builderPutString.putRating("android.media.metadata.RATING", ratingCompatConvertToRatingCompat2);
        }
        if (mediaMetadata.mediaType != null) {
            builderPutString.putLong(androidx.media3.session.MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT, mediaMetadata.mediaType.intValue());
        }
        if (mediaMetadata.extras != null) {
            for (java.lang.String str2 : mediaMetadata.extras.keySet()) {
                java.lang.Object obj = mediaMetadata.extras.get(str2);
                if (obj == null || (obj instanceof java.lang.CharSequence)) {
                    builderPutString.putText(str2, (java.lang.CharSequence) obj);
                } else if ((obj instanceof java.lang.Byte) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long)) {
                    builderPutString.putLong(str2, ((java.lang.Number) obj).longValue());
                }
            }
        }
        return builderPutString.build();
    }

    public static androidx.media3.session.legacy.MediaDescriptionCompat convertToMediaDescriptionCompat(androidx.media3.common.MediaItem mediaItem, android.graphics.Bitmap bitmap) {
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        androidx.media3.session.legacy.MediaDescriptionCompat.Builder mediaId = new androidx.media3.session.legacy.MediaDescriptionCompat.Builder().setMediaId(mediaItem.mediaId.equals("") ? null : mediaItem.mediaId);
        androidx.media3.common.MediaMetadata mediaMetadata = mediaItem.mediaMetadata;
        if (bitmap != null) {
            mediaId.setIconBitmap(bitmap);
        }
        android.os.Bundle bundle = mediaMetadata.extras;
        if (bundle != null) {
            bundle = new android.os.Bundle(bundle);
        }
        boolean z = (mediaMetadata.folderType == null || mediaMetadata.folderType.intValue() == -1) ? false : true;
        boolean z2 = mediaMetadata.mediaType != null;
        if (z || z2) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            if (z) {
                bundle.putLong("android.media.extra.BT_FOLDER_TYPE", convertToExtraBtFolderType(((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(mediaMetadata.folderType)).intValue()));
            }
            if (z2) {
                bundle.putLong(androidx.media3.session.MediaConstants.EXTRAS_KEY_MEDIA_TYPE_COMPAT, ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(mediaMetadata.mediaType)).intValue());
            }
        }
        if (mediaMetadata.displayTitle != null) {
            charSequence = mediaMetadata.displayTitle;
            charSequence2 = mediaMetadata.subtitle;
            charSequence3 = mediaMetadata.description;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", mediaMetadata.title);
        } else {
            java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
            int i = 0;
            int i2 = 0;
            while (i < 3 && i2 < androidx.media3.session.legacy.MediaMetadataCompat.PREFERRED_DESCRIPTION_ORDER.length) {
                int i3 = i2 + 1;
                java.lang.CharSequence text = getText(androidx.media3.session.legacy.MediaMetadataCompat.PREFERRED_DESCRIPTION_ORDER[i2], mediaMetadata);
                if (!android.text.TextUtils.isEmpty(text)) {
                    charSequenceArr[i] = text;
                    i++;
                }
                i2 = i3;
            }
            charSequence = charSequenceArr[0];
            charSequence2 = charSequenceArr[1];
            charSequence3 = charSequenceArr[2];
        }
        return mediaId.setTitle(charSequence).setSubtitle(charSequence2).setDescription(charSequence3).setIconUri(mediaMetadata.artworkUri).setMediaUri(mediaItem.requestMetadata.mediaUri).setExtras(bundle).build();
    }

    private static java.lang.CharSequence getText(java.lang.String str, androidx.media3.common.MediaMetadata mediaMetadata) {
        str.hashCode();
        switch (str) {
            case "android.media.metadata.ARTIST":
                return mediaMetadata.artist;
            case "android.media.metadata.WRITER":
                return mediaMetadata.writer;
            case "android.media.metadata.COMPOSER":
                return mediaMetadata.composer;
            case "android.media.metadata.ALBUM":
                return mediaMetadata.albumTitle;
            case "android.media.metadata.TITLE":
                return mediaMetadata.title;
            case "android.media.metadata.ALBUM_ARTIST":
                return mediaMetadata.albumArtist;
            default:
                return null;
        }
    }

    private static long convertToExtraBtFolderType(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new java.lang.IllegalArgumentException("Unrecognized FolderType: " + i);
        }
    }

    public static androidx.media3.common.Rating convertToRating(androidx.media3.session.legacy.RatingCompat ratingCompat) {
        if (ratingCompat == null) {
            return null;
        }
        switch (ratingCompat.getRatingStyle()) {
            case 1:
                if (ratingCompat.isRated()) {
                    return new androidx.media3.common.HeartRating(ratingCompat.hasHeart());
                }
                return new androidx.media3.common.HeartRating();
            case 2:
                if (ratingCompat.isRated()) {
                    return new androidx.media3.common.ThumbRating(ratingCompat.isThumbUp());
                }
                return new androidx.media3.common.ThumbRating();
            case 3:
                if (ratingCompat.isRated()) {
                    return new androidx.media3.common.StarRating(3, ratingCompat.getStarRating());
                }
                return new androidx.media3.common.StarRating(3);
            case 4:
                if (ratingCompat.isRated()) {
                    return new androidx.media3.common.StarRating(4, ratingCompat.getStarRating());
                }
                return new androidx.media3.common.StarRating(4);
            case 5:
                if (ratingCompat.isRated()) {
                    return new androidx.media3.common.StarRating(5, ratingCompat.getStarRating());
                }
                return new androidx.media3.common.StarRating(5);
            case 6:
                if (ratingCompat.isRated()) {
                    return new androidx.media3.common.PercentageRating(ratingCompat.getPercentRating());
                }
                return new androidx.media3.common.PercentageRating();
            default:
                return null;
        }
    }

    public static androidx.media3.session.legacy.RatingCompat convertToRatingCompat(androidx.media3.common.Rating rating) {
        if (rating == null) {
            return null;
        }
        int ratingCompatStyle = getRatingCompatStyle(rating);
        if (!rating.isRated()) {
            return androidx.media3.session.legacy.RatingCompat.newUnratedRating(ratingCompatStyle);
        }
        switch (ratingCompatStyle) {
            case 1:
                return androidx.media3.session.legacy.RatingCompat.newHeartRating(((androidx.media3.common.HeartRating) rating).isHeart());
            case 2:
                return androidx.media3.session.legacy.RatingCompat.newThumbRating(((androidx.media3.common.ThumbRating) rating).isThumbsUp());
            case 3:
            case 4:
            case 5:
                return androidx.media3.session.legacy.RatingCompat.newStarRating(ratingCompatStyle, ((androidx.media3.common.StarRating) rating).getStarRating());
            case 6:
                return androidx.media3.session.legacy.RatingCompat.newPercentageRating(((androidx.media3.common.PercentageRating) rating).getPercent());
            default:
                return null;
        }
    }

    public static int convertToPlaybackStateCompatState(androidx.media3.common.Player player, boolean z) {
        if (player.getPlayerError() != null) {
            return 7;
        }
        int playbackState = player.getPlaybackState();
        boolean zShouldShowPlayButton = androidx.media3.common.util.Util.shouldShowPlayButton(player, z);
        if (playbackState == 1) {
            return 0;
        }
        if (playbackState == 2) {
            return zShouldShowPlayButton ? 2 : 6;
        }
        if (playbackState == 3) {
            return zShouldShowPlayButton ? 2 : 3;
        }
        if (playbackState == 4) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException("Unrecognized State: " + playbackState);
    }

    public static androidx.media3.common.PlaybackParameters convertToPlaybackParameters(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return androidx.media3.common.PlaybackParameters.DEFAULT;
        }
        return new androidx.media3.common.PlaybackParameters(playbackStateCompat.getPlaybackSpeed());
    }

    public static boolean convertToPlayWhenReady(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return false;
        }
        switch (playbackStateCompat.getState()) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                return true;
            case 7:
            case 8:
            default:
                return false;
        }
    }

    public static int convertToPlaybackState(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, long j) throws androidx.media3.session.LegacyConversions.ConversionException {
        if (playbackStateCompat == null) {
            return 1;
        }
        switch (playbackStateCompat.getState()) {
            case 0:
            case 1:
            case 7:
            case 8:
                return 1;
            case 2:
                long jConvertToDurationMs = convertToDurationMs(mediaMetadataCompat);
                return (jConvertToDurationMs != androidx.media3.common.C.TIME_UNSET && convertToCurrentPositionMs(playbackStateCompat, mediaMetadataCompat, j) >= jConvertToDurationMs) ? 4 : 3;
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                return 2;
            default:
                throw new androidx.media3.session.LegacyConversions.ConversionException("Invalid state of PlaybackStateCompat: " + playbackStateCompat.getState());
        }
    }

    public static boolean convertToIsPlaying(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        return playbackStateCompat != null && playbackStateCompat.getState() == 3;
    }

    public static boolean convertToIsPlayingAd(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
        return (mediaMetadataCompat == null || mediaMetadataCompat.getLong("android.media.metadata.ADVERTISEMENT") == 0) ? false : true;
    }

    public static long convertToCurrentPositionMs(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, long j) {
        long position;
        if (playbackStateCompat == null) {
            return 0L;
        }
        if (playbackStateCompat.getState() == 3) {
            position = getCurrentPosition(playbackStateCompat, j);
        } else {
            position = playbackStateCompat.getPosition();
        }
        long j2 = position;
        long jConvertToDurationMs = convertToDurationMs(mediaMetadataCompat);
        if (jConvertToDurationMs == androidx.media3.common.C.TIME_UNSET) {
            return java.lang.Math.max(0L, j2);
        }
        return androidx.media3.common.util.Util.constrainValue(j2, 0L, jConvertToDurationMs);
    }

    private static long getCurrentPosition(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, long j) {
        return playbackStateCompat.getCurrentPosition(j == androidx.media3.common.C.TIME_UNSET ? null : java.lang.Long.valueOf(j));
    }

    public static long convertToDurationMs(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null || !mediaMetadataCompat.containsKey("android.media.metadata.DURATION")) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j = mediaMetadataCompat.getLong("android.media.metadata.DURATION");
        return j <= 0 ? androidx.media3.common.C.TIME_UNSET : j;
    }

    public static long convertToBufferedPositionMs(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, long j) {
        long bufferedPosition = playbackStateCompat == null ? 0L : playbackStateCompat.getBufferedPosition();
        long jConvertToCurrentPositionMs = convertToCurrentPositionMs(playbackStateCompat, mediaMetadataCompat, j);
        long jConvertToDurationMs = convertToDurationMs(mediaMetadataCompat);
        if (jConvertToDurationMs == androidx.media3.common.C.TIME_UNSET) {
            return java.lang.Math.max(jConvertToCurrentPositionMs, bufferedPosition);
        }
        return androidx.media3.common.util.Util.constrainValue(bufferedPosition, jConvertToCurrentPositionMs, jConvertToDurationMs);
    }

    public static long convertToTotalBufferedDurationMs(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, long j) {
        return convertToBufferedPositionMs(playbackStateCompat, mediaMetadataCompat, j) - convertToCurrentPositionMs(playbackStateCompat, mediaMetadataCompat, j);
    }

    public static int convertToBufferedPercentage(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, long j) {
        return androidx.media3.session.MediaUtils.calculateBufferedPercentage(convertToBufferedPositionMs(playbackStateCompat, mediaMetadataCompat, j), convertToDurationMs(mediaMetadataCompat));
    }

    public static int getRatingCompatStyle(androidx.media3.common.Rating rating) {
        if (rating instanceof androidx.media3.common.HeartRating) {
            return 1;
        }
        if (rating instanceof androidx.media3.common.ThumbRating) {
            return 2;
        }
        if (!(rating instanceof androidx.media3.common.StarRating)) {
            return rating instanceof androidx.media3.common.PercentageRating ? 6 : 0;
        }
        int maxStars = ((androidx.media3.common.StarRating) rating).getMaxStars();
        int i = 3;
        if (maxStars != 3) {
            i = 4;
            if (maxStars != 4) {
                i = 5;
                if (maxStars != 5) {
                    return 0;
                }
            }
        }
        return i;
    }

    public static int convertToRepeatMode(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                androidx.media3.common.util.Log.w(TAG, "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int convertToPlaybackStateCompatRepeatMode(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                androidx.media3.common.util.Log.w(TAG, "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static boolean convertToShuffleModeEnabled(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Unrecognized ShuffleMode: " + i);
    }

    public static androidx.media3.session.MediaLibraryService.LibraryParams convertToLibraryParams(android.content.Context context, android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            int i = bundle.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);
            if (i >= 0) {
                bundle.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bundle.putBoolean(androidx.media3.session.MediaConstants.EXTRA_KEY_ROOT_CHILDREN_BROWSABLE_ONLY, z);
            }
            return new androidx.media3.session.MediaLibraryService.LibraryParams.Builder().setExtras(bundle).setRecent(bundle.getBoolean("android.service.media.extra.RECENT")).setOffline(bundle.getBoolean("android.service.media.extra.OFFLINE")).setSuggested(bundle.getBoolean("android.service.media.extra.SUGGESTED")).build();
        } catch (java.lang.Exception unused) {
            return new androidx.media3.session.MediaLibraryService.LibraryParams.Builder().setExtras(bundle).build();
        }
    }

    public static android.os.Bundle convertToRootHints(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (libraryParams == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle(libraryParams.extras);
        if (libraryParams.extras.containsKey(androidx.media3.session.MediaConstants.EXTRA_KEY_ROOT_CHILDREN_BROWSABLE_ONLY)) {
            boolean z = libraryParams.extras.getBoolean(androidx.media3.session.MediaConstants.EXTRA_KEY_ROOT_CHILDREN_BROWSABLE_ONLY, false);
            bundle.remove(androidx.media3.session.MediaConstants.EXTRA_KEY_ROOT_CHILDREN_BROWSABLE_ONLY);
            bundle.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", z ? 1 : 3);
        }
        bundle.putBoolean("android.service.media.extra.RECENT", libraryParams.isRecent);
        bundle.putBoolean("android.service.media.extra.OFFLINE", libraryParams.isOffline);
        bundle.putBoolean("android.service.media.extra.SUGGESTED", libraryParams.isSuggested);
        return bundle;
    }

    public static androidx.media3.common.Player.Commands convertToPlayerCommands(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, int i, long j, boolean z) {
        androidx.media3.common.Player.Commands.Builder builder = new androidx.media3.common.Player.Commands.Builder();
        long actions = playbackStateCompat == null ? 0L : playbackStateCompat.getActions();
        if ((hasAction(actions, 4L) && hasAction(actions, 2L)) || hasAction(actions, 512L)) {
            builder.add(1);
        }
        if (hasAction(actions, 16384L)) {
            builder.add(2);
        }
        if ((hasAction(actions, 32768L) && hasAction(actions, 1024L)) || ((hasAction(actions, 65536L) && hasAction(actions, 2048L)) || (hasAction(actions, 131072L) && hasAction(actions, 8192L)))) {
            builder.addAll(31, 2);
        }
        if (hasAction(actions, 8L)) {
            builder.add(11);
        }
        if (hasAction(actions, 64L)) {
            builder.add(12);
        }
        if (hasAction(actions, 256L)) {
            builder.addAll(5, 4);
        }
        if (hasAction(actions, 32L)) {
            builder.addAll(9, 8);
        }
        if (hasAction(actions, 16L)) {
            builder.addAll(7, 6);
        }
        if (hasAction(actions, 4194304L)) {
            builder.add(13);
        }
        if (hasAction(actions, 1L)) {
            builder.add(3);
        }
        if (i == 1) {
            builder.addAll(26, 34);
        } else if (i == 2) {
            builder.addAll(26, 34, 25, 33);
        }
        builder.addAll(23, 17, 18, 16, 21, 32);
        if ((j & 4) != 0) {
            builder.add(20);
            if (hasAction(actions, 4096L)) {
                builder.add(10);
            }
        }
        if (z) {
            if (hasAction(actions, 262144L)) {
                builder.add(15);
            }
            if (hasAction(actions, 2097152L)) {
                builder.add(14);
            }
        }
        return builder.build();
    }

    public static androidx.media3.session.SessionCommands convertToSessionCommands(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, boolean z) {
        java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> customActions;
        androidx.media3.session.SessionCommands.Builder builder = new androidx.media3.session.SessionCommands.Builder();
        builder.addAllSessionCommands();
        if (!z) {
            builder.remove(androidx.media3.session.SessionCommand.COMMAND_CODE_SESSION_SET_RATING);
        }
        if (playbackStateCompat != null && (customActions = playbackStateCompat.getCustomActions()) != null) {
            for (androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction : customActions) {
                java.lang.String action = customAction.getAction();
                android.os.Bundle extras = customAction.getExtras();
                if (extras == null) {
                    extras = android.os.Bundle.EMPTY;
                }
                builder.add(new androidx.media3.session.SessionCommand(action, extras));
            }
        }
        return builder.build();
    }

    public static com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> convertToCustomLayout(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return com.google.common.collect.ImmutableList.of();
        }
        java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> customActions = playbackStateCompat.getCustomActions();
        if (customActions == null) {
            return com.google.common.collect.ImmutableList.of();
        }
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction : customActions) {
            java.lang.String action = customAction.getAction();
            android.os.Bundle extras = customAction.getExtras();
            androidx.media3.session.CommandButton.Builder builder2 = new androidx.media3.session.CommandButton.Builder(extras != null ? extras.getInt(androidx.media3.session.MediaConstants.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT, 0) : 0, customAction.getIcon());
            if (extras == null) {
                extras = android.os.Bundle.EMPTY;
            }
            builder.add(builder2.setSessionCommand(new androidx.media3.session.SessionCommand(action, extras)).setDisplayName(customAction.getName()).setEnabled(true).build());
        }
        return builder.build();
    }

    public static androidx.media3.common.AudioAttributes convertToAudioAttributes(androidx.media3.session.legacy.AudioAttributesCompat audioAttributesCompat) {
        if (audioAttributesCompat == null) {
            return androidx.media3.common.AudioAttributes.DEFAULT;
        }
        return new androidx.media3.common.AudioAttributes.Builder().setContentType(audioAttributesCompat.getContentType()).setFlags(audioAttributesCompat.getFlags()).setUsage(audioAttributesCompat.getUsage()).build();
    }

    public static androidx.media3.common.AudioAttributes convertToAudioAttributes(androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfo) {
        if (playbackInfo == null) {
            return androidx.media3.common.AudioAttributes.DEFAULT;
        }
        return convertToAudioAttributes(playbackInfo.getAudioAttributes());
    }

    public static androidx.media3.session.legacy.AudioAttributesCompat convertToAudioAttributesCompat(androidx.media3.common.AudioAttributes audioAttributes) {
        return new androidx.media3.session.legacy.AudioAttributesCompat.Builder().setContentType(audioAttributes.contentType).setFlags(audioAttributes.flags).setUsage(audioAttributes.usage).build();
    }

    public static int getLegacyStreamType(androidx.media3.common.AudioAttributes audioAttributes) {
        int legacyStreamType = convertToAudioAttributesCompat(audioAttributes).getLegacyStreamType();
        if (legacyStreamType == Integer.MIN_VALUE) {
            return 3;
        }
        return legacyStreamType;
    }

    public static <T> T getFutureResult(java.util.concurrent.Future<T> future, long j) throws java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        while (true) {
            try {
                try {
                    T t = future.get(j2, java.util.concurrent.TimeUnit.MILLISECONDS);
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    return t;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= j) {
                        throw new java.util.concurrent.TimeoutException();
                    }
                    j2 = j - jElapsedRealtime2;
                }
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public static androidx.media3.common.DeviceInfo convertToDeviceInfo(androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfo, java.lang.String str) {
        if (playbackInfo == null) {
            return androidx.media3.common.DeviceInfo.UNKNOWN;
        }
        return new androidx.media3.common.DeviceInfo.Builder(playbackInfo.getPlaybackType() == 2 ? 1 : 0).setMaxVolume(playbackInfo.getMaxVolume()).setRoutingControllerId(str).build();
    }

    public static int convertToDeviceVolume(androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfo) {
        if (playbackInfo == null) {
            return 0;
        }
        return playbackInfo.getCurrentVolume();
    }

    public static boolean convertToIsDeviceMuted(androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfo) {
        return playbackInfo != null && playbackInfo.getCurrentVolume() == 0;
    }

    private static byte[] convertToByteArray(android.graphics.Bitmap bitmap) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private LegacyConversions() {
    }
}
