package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class GamesClientStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int ACHIEVEMENT_NOT_INCREMENTAL = 26562;
    public static final int ACHIEVEMENT_UNKNOWN = 26561;
    public static final int ACHIEVEMENT_UNLOCKED = 26563;
    public static final int ACHIEVEMENT_UNLOCK_FAILURE = 26560;
    public static final int APP_MISCONFIGURED = 26508;
    public static final int CONSENT_REQUIRED = 26703;
    public static final int GAME_NOT_FOUND = 26509;
    public static final int LICENSE_CHECK_FAILED = 26507;
    public static final int NETWORK_ERROR_NO_DATA = 26504;
    public static final int NETWORK_ERROR_OPERATION_FAILED = 26506;
    public static final int OPERATION_IN_FLIGHT = 26607;
    public static final int SNAPSHOT_COMMIT_FAILED = 26573;
    public static final int SNAPSHOT_CONFLICT_MISSING = 26576;
    public static final int SNAPSHOT_CONTENTS_UNAVAILABLE = 26572;
    public static final int SNAPSHOT_CREATION_FAILED = 26571;
    public static final int SNAPSHOT_FOLDER_UNAVAILABLE = 26575;
    public static final int SNAPSHOT_NOT_FOUND = 26570;
    public static final int VIDEO_ALREADY_CAPTURING = 26625;
    public static final int VIDEO_NOT_ACTIVE = 26620;
    public static final int VIDEO_OUT_OF_DISK_SPACE = 26626;
    public static final int VIDEO_PERMISSION_ERROR = 26622;
    public static final int VIDEO_STORAGE_ERROR = 26623;
    public static final int VIDEO_UNEXPECTED_CAPTURE_ERROR = 26624;
    public static final int VIDEO_UNSUPPORTED = 26621;

    private GamesClientStatusCodes() {
    }

    public static java.lang.String getStatusCodeString(int i) {
        if (i == 26540) {
            return "PLAYER_OOB_REQUIRED";
        }
        if (i == 26541) {
            return "PLAYER_LEVEL_UP";
        }
        switch (i) {
            case 26502:
                return "CLIENT_RECONNECT_REQUIRED";
            case 26503:
                return "NETWORK_ERROR_STALE_DATA";
            case 26504:
                return "NETWORK_ERROR_NO_DATA";
            case 26505:
                return "NETWORK_ERROR_OPERATION_DEFERRED";
            case NETWORK_ERROR_OPERATION_FAILED /* 26506 */:
                return "NETWORK_ERROR_OPERATION_FAILED";
            case LICENSE_CHECK_FAILED /* 26507 */:
                return "LICENSE_CHECK_FAILED";
            case APP_MISCONFIGURED /* 26508 */:
                return "APP_MISCONFIGURED";
            case GAME_NOT_FOUND /* 26509 */:
                return "GAME_NOT_FOUND";
            case 26520:
                return "RESOLVE_STALE_OR_NO_DATA";
            case VIDEO_NOT_ACTIVE /* 26620 */:
                return "VIDEO_NOT_ACTIVE";
            case VIDEO_UNSUPPORTED /* 26621 */:
                return "VIDEO_UNSUPPORTED";
            case VIDEO_PERMISSION_ERROR /* 26622 */:
                return "VIDEO_PERMISSION_ERROR";
            case VIDEO_STORAGE_ERROR /* 26623 */:
                return "VIDEO_STORAGE_ERROR";
            case VIDEO_UNEXPECTED_CAPTURE_ERROR /* 26624 */:
                return "VIDEO_UNEXPECTED_CAPTURE_ERROR";
            case VIDEO_ALREADY_CAPTURING /* 26625 */:
                return "VIDEO_ALREADY_CAPTURING";
            case VIDEO_OUT_OF_DISK_SPACE /* 26626 */:
                return "VIDEO_OUT_OF_DISK_SPACE";
            case 26627:
                return "VIDEO_NO_MIC";
            case 26628:
                return "VIDEO_NO_CAMERA";
            case 26629:
                return "VIDEO_SCREEN_OFF";
            case 26630:
                return "VIDEO_RELEASE_TIMEOUT";
            case 26631:
                return "VIDEO_CAPTURE_VIDEO_PERMISSION_REQUIRED";
            case 26632:
                return "CAPTURE_ALREADY_PAUSED";
            case 26650:
                return "VIDEO_MISSING_OVERLAY_PERMISSION";
            case 26652:
                return "VIDEO_CAPTURE_OVERLAY_VISIBLE";
            case 26700:
                return "CLIENT_LOADING";
            case 26701:
                return "CLIENT_EMPTY";
            case 26702:
                return "CLIENT_HIDDEN";
            case CONSENT_REQUIRED /* 26703 */:
                return "CONSENT_REQUIRED";
            case 26704:
                return "PLAYER_NOT_FOUND";
            default:
                switch (i) {
                    case 26530:
                        return "AUTH_ERROR_HARD";
                    case 26531:
                        return "AUTH_ERROR_USER_RECOVERABLE";
                    case 26532:
                        return "AUTH_ERROR_UNREGISTERED_CLIENT_ID";
                    case 26533:
                        return "AUTH_ERROR_API_ACCESS_DENIED";
                    case 26534:
                        return "AUTH_ERROR_ACCOUNT_NOT_USABLE";
                    case 26535:
                        return "AUTH_ERROR_ACCOUNT_UNICORN";
                    case 26536:
                        return "AUTH_ERROR_SERVICE_CACHE_MISTAKE";
                    default:
                        switch (i) {
                            case 26550:
                                return "REQUEST_UPDATE_PARTIAL_SUCCESS";
                            case 26551:
                                return "REQUEST_UPDATE_TOTAL_FAILURE";
                            case 26552:
                                return "REQUEST_TOO_MANY_RECIPIENTS";
                            default:
                                switch (i) {
                                    case ACHIEVEMENT_UNLOCK_FAILURE /* 26560 */:
                                        return "ACHIEVEMENT_UNLOCK_FAILURE";
                                    case ACHIEVEMENT_UNKNOWN /* 26561 */:
                                        return "ACHIEVEMENT_UNKNOWN";
                                    case ACHIEVEMENT_NOT_INCREMENTAL /* 26562 */:
                                        return "ACHIEVEMENT_NOT_INCREMENTAL";
                                    case ACHIEVEMENT_UNLOCKED /* 26563 */:
                                        return "ACHIEVEMENT_UNLOCKED";
                                    default:
                                        switch (i) {
                                            case SNAPSHOT_NOT_FOUND /* 26570 */:
                                                return "SNAPSHOT_NOT_FOUND";
                                            case SNAPSHOT_CREATION_FAILED /* 26571 */:
                                                return "SNAPSHOT_CREATION_FAILED";
                                            case SNAPSHOT_CONTENTS_UNAVAILABLE /* 26572 */:
                                                return "SNAPSHOT_CONTENTS_UNAVAILABLE";
                                            case SNAPSHOT_COMMIT_FAILED /* 26573 */:
                                                return "SNAPSHOT_COMMIT_FAILED";
                                            case 26574:
                                                return "SNAPSHOT_CONFLICT";
                                            case SNAPSHOT_FOLDER_UNAVAILABLE /* 26575 */:
                                                return "SNAPSHOT_FOLDER_UNAVAILABLE";
                                            case SNAPSHOT_CONFLICT_MISSING /* 26576 */:
                                                return "SNAPSHOT_CONFLICT_MISSING";
                                            default:
                                                switch (i) {
                                                    case 26580:
                                                        return "MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";
                                                    case 26581:
                                                        return "MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";
                                                    case 26582:
                                                        return "MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";
                                                    case 26583:
                                                        return "MULTIPLAYER_DISABLED";
                                                    case 26584:
                                                        return "MULTIPLAYER_ERROR_INVALID_OPERATION";
                                                    default:
                                                        switch (i) {
                                                            case 26590:
                                                                return "MATCH_ERROR_INVALID_PARTICIPANT_STATE";
                                                            case 26591:
                                                                return "MATCH_ERROR_INACTIVE_MATCH";
                                                            case 26592:
                                                                return "MATCH_ERROR_INVALID_MATCH_STATE";
                                                            case 26593:
                                                                return "MATCH_ERROR_OUT_OF_DATE_VERSION";
                                                            case 26594:
                                                                return "MATCH_ERROR_INVALID_MATCH_RESULTS";
                                                            case 26595:
                                                                return "MATCH_ERROR_ALREADY_REMATCHED";
                                                            case 26596:
                                                                return "MATCH_NOT_FOUND";
                                                            case 26597:
                                                                return "MATCH_ERROR_LOCALLY_MODIFIED";
                                                            default:
                                                                switch (i) {
                                                                    case 26600:
                                                                        return "REAL_TIME_CONNECTION_FAILED";
                                                                    case 26601:
                                                                        return "REAL_TIME_MESSAGE_SEND_FAILED";
                                                                    case 26602:
                                                                        return "INVALID_REAL_TIME_ROOM_ID";
                                                                    case 26603:
                                                                        return "PARTICIPANT_NOT_CONNECTED";
                                                                    case 26604:
                                                                        return "REAL_TIME_ROOM_NOT_JOINED";
                                                                    case 26605:
                                                                        return "REAL_TIME_INACTIVE_ROOM";
                                                                    case 26606:
                                                                        return "REAL_TIME_SERVICE_NOT_CONNECTED";
                                                                    case OPERATION_IN_FLIGHT /* 26607 */:
                                                                        return "OPERATION_IN_FLIGHT";
                                                                    default:
                                                                        switch (i) {
                                                                            case 26610:
                                                                                return "MILESTONE_CLAIMED_PREVIOUSLY";
                                                                            case 26611:
                                                                                return "MILESTONE_CLAIM_FAILED";
                                                                            case 26612:
                                                                                return "QUEST_NO_LONGER_AVAILABLE";
                                                                            case 26613:
                                                                                return "QUEST_NOT_STARTED";
                                                                            default:
                                                                                return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(i);
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static com.google.android.gms.common.api.Status zza(int i) {
        return new com.google.android.gms.common.api.Status(4, getStatusCodeString(4));
    }

    public static com.google.android.gms.common.api.Status zzb(int i, android.app.PendingIntent pendingIntent) {
        return new com.google.android.gms.common.api.Status(i, getStatusCodeString(i), pendingIntent);
    }
}
