package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class MediaUtils {
    public static final long POSITION_DIFF_TOLERANCE_MS = 100;
    private static final java.lang.String TAG = "MediaUtils";
    public static final int TRANSACTION_SIZE_LIMIT_IN_BYTES = 262144;
    public static final androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot defaultBrowserRoot = new androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot(androidx.media3.session.MediaLibraryService.SERVICE_INTERFACE, null);

    public static boolean areEqualError(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat2) {
        boolean z = playbackStateCompat != null && playbackStateCompat.getState() == 7;
        boolean z2 = playbackStateCompat2 != null && playbackStateCompat2.getState() == 7;
        if (z && z2) {
            return ((androidx.media3.session.legacy.PlaybackStateCompat) androidx.media3.common.util.Util.castNonNull(playbackStateCompat)).getErrorCode() == ((androidx.media3.session.legacy.PlaybackStateCompat) androidx.media3.common.util.Util.castNonNull(playbackStateCompat2)).getErrorCode() && android.text.TextUtils.equals(((androidx.media3.session.legacy.PlaybackStateCompat) androidx.media3.common.util.Util.castNonNull(playbackStateCompat)).getErrorMessage(), ((androidx.media3.session.legacy.PlaybackStateCompat) androidx.media3.common.util.Util.castNonNull(playbackStateCompat2)).getErrorMessage());
        }
        return z == z2;
    }

    public static <T extends android.os.Parcelable> java.util.List<T> truncateListBySize(java.util.List<T> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                T t = list.get(i2);
                parcelObtain.writeParcelable(t, 0);
                if (parcelObtain.dataSize() >= i) {
                    break;
                }
                arrayList.add(t);
            } catch (java.lang.Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        parcelObtain.recycle();
        return arrayList;
    }

    public static <T> java.util.List<T> removeNullElements(java.util.List<T> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : list) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static androidx.media3.common.Player.Commands createPlayerCommandsWith(int i) {
        return new androidx.media3.common.Player.Commands.Builder().add(i).build();
    }

    public static androidx.media3.common.Player.Commands createPlayerCommandsWithout(int i) {
        return new androidx.media3.common.Player.Commands.Builder().addAllCommands().remove(i).build();
    }

    public static androidx.media3.common.Player.Commands intersect(androidx.media3.common.Player.Commands commands, androidx.media3.common.Player.Commands commands2) {
        if (commands == null || commands2 == null) {
            return androidx.media3.common.Player.Commands.EMPTY;
        }
        androidx.media3.common.Player.Commands.Builder builder = new androidx.media3.common.Player.Commands.Builder();
        for (int i = 0; i < commands.size(); i++) {
            if (commands2.contains(commands.get(i))) {
                builder.add(commands.get(i));
            }
        }
        return builder.build();
    }

    public static android.util.Pair<androidx.media3.session.PlayerInfo, androidx.media3.session.PlayerInfo.BundlingExclusions> mergePlayerInfo(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions, androidx.media3.session.PlayerInfo playerInfo2, androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions2, androidx.media3.common.Player.Commands commands) {
        androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions3;
        if (bundlingExclusions2.isTimelineExcluded && commands.contains(17) && !bundlingExclusions.isTimelineExcluded) {
            playerInfo2 = playerInfo2.copyWithTimeline(playerInfo.timeline);
            bundlingExclusions3 = new androidx.media3.session.PlayerInfo.BundlingExclusions(false, bundlingExclusions2.areCurrentTracksExcluded);
        } else {
            bundlingExclusions3 = bundlingExclusions2;
        }
        if (bundlingExclusions2.areCurrentTracksExcluded && commands.contains(30) && !bundlingExclusions.areCurrentTracksExcluded) {
            playerInfo2 = playerInfo2.copyWithCurrentTracks(playerInfo.currentTracks);
            bundlingExclusions3 = new androidx.media3.session.PlayerInfo.BundlingExclusions(bundlingExclusions3.isTimelineExcluded, false);
        }
        return new android.util.Pair<>(playerInfo2, bundlingExclusions3);
    }

    public static int[] generateUnshuffledIndices(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public static int calculateBufferedPercentage(long j, long j2) {
        if (j == androidx.media3.common.C.TIME_UNSET || j2 == androidx.media3.common.C.TIME_UNSET) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return androidx.media3.common.util.Util.constrainValue((int) ((j * 100) / j2), 0, 100);
    }

    public static void setMediaItemsWithStartIndexAndPosition(androidx.media3.common.Player player, androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
        if (mediaItemsWithStartPosition.startIndex == -1) {
            if (player.isCommandAvailable(20)) {
                player.setMediaItems(mediaItemsWithStartPosition.mediaItems, true);
                return;
            } else {
                if (mediaItemsWithStartPosition.mediaItems.isEmpty()) {
                    return;
                }
                player.setMediaItem(mediaItemsWithStartPosition.mediaItems.get(0), true);
                return;
            }
        }
        if (player.isCommandAvailable(20)) {
            player.setMediaItems(mediaItemsWithStartPosition.mediaItems, mediaItemsWithStartPosition.startIndex, mediaItemsWithStartPosition.startPositionMs);
        } else {
            if (mediaItemsWithStartPosition.mediaItems.isEmpty()) {
                return;
            }
            player.setMediaItem(mediaItemsWithStartPosition.mediaItems.get(0), mediaItemsWithStartPosition.startPositionMs);
        }
    }

    public static boolean areSessionPositionInfosInSamePeriodOrAd(androidx.media3.session.SessionPositionInfo sessionPositionInfo, androidx.media3.session.SessionPositionInfo sessionPositionInfo2) {
        return sessionPositionInfo.positionInfo.mediaItemIndex == sessionPositionInfo2.positionInfo.mediaItemIndex && sessionPositionInfo.positionInfo.periodIndex == sessionPositionInfo2.positionInfo.periodIndex && sessionPositionInfo.positionInfo.adGroupIndex == sessionPositionInfo2.positionInfo.adGroupIndex && sessionPositionInfo.positionInfo.adIndexInAdGroup == sessionPositionInfo2.positionInfo.adIndexInAdGroup;
    }

    public static long getUpdatedCurrentPositionMs(androidx.media3.session.PlayerInfo playerInfo, long j, long j2, long j3) {
        boolean z = playerInfo.sessionPositionInfo.equals(androidx.media3.session.SessionPositionInfo.DEFAULT) || j2 < playerInfo.sessionPositionInfo.eventTimeMs;
        if (!playerInfo.isPlaying) {
            return (z || j == androidx.media3.common.C.TIME_UNSET) ? playerInfo.sessionPositionInfo.positionInfo.positionMs : j;
        }
        if (!z && j != androidx.media3.common.C.TIME_UNSET) {
            return j;
        }
        if (j3 == androidx.media3.common.C.TIME_UNSET) {
            j3 = android.os.SystemClock.elapsedRealtime() - playerInfo.sessionPositionInfo.eventTimeMs;
        }
        long j4 = playerInfo.sessionPositionInfo.positionInfo.positionMs + ((long) (j3 * playerInfo.playbackParameters.speed));
        return playerInfo.sessionPositionInfo.durationMs != androidx.media3.common.C.TIME_UNSET ? java.lang.Math.min(j4, playerInfo.sessionPositionInfo.durationMs) : j4;
    }

    private MediaUtils() {
    }
}
