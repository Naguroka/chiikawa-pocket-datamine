package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ConnectionsStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int API_CONNECTION_FAILED_ALREADY_IN_USE = 8050;
    public static final int MISSING_PERMISSION_ACCESS_COARSE_LOCATION = 8034;
    public static final int MISSING_PERMISSION_ACCESS_FINE_LOCATION = 8036;
    public static final int MISSING_PERMISSION_ACCESS_WIFI_STATE = 8032;
    public static final int MISSING_PERMISSION_BLUETOOTH = 8030;
    public static final int MISSING_PERMISSION_BLUETOOTH_ADMIN = 8031;
    public static final int MISSING_PERMISSION_CHANGE_WIFI_STATE = 8033;
    public static final int MISSING_PERMISSION_RECORD_AUDIO = 8035;

    @java.lang.Deprecated
    public static final int MISSING_SETTING_LOCATION_MUST_BE_ON = 8025;
    public static final int STATUS_ALREADY_ADVERTISING = 8001;
    public static final int STATUS_ALREADY_CONNECTED_TO_ENDPOINT = 8003;
    public static final int STATUS_ALREADY_DISCOVERING = 8002;
    public static final int STATUS_ALREADY_HAVE_ACTIVE_STRATEGY = 8008;

    @java.lang.Deprecated
    public static final int STATUS_BLUETOOTH_ERROR = 8007;
    public static final int STATUS_CONNECTION_REJECTED = 8004;
    public static final int STATUS_ENDPOINT_IO_ERROR = 8012;
    public static final int STATUS_ENDPOINT_UNKNOWN = 8011;
    public static final int STATUS_ERROR = 13;

    @java.lang.Deprecated
    public static final int STATUS_NETWORK_NOT_CONNECTED = 8000;
    public static final int STATUS_NOT_CONNECTED_TO_ENDPOINT = 8005;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OUT_OF_ORDER_API_CALL = 8009;
    public static final int STATUS_PAYLOAD_IO_ERROR = 8013;
    public static final int STATUS_RADIO_ERROR = 8007;

    private ConnectionsStatusCodes() {
    }

    public static java.lang.String getStatusCodeString(int i) {
        if (i == 8025) {
            return "MISSING_SETTING_LOCATION_MUST_BE_ON";
        }
        if (i == 8050) {
            return "API_CONNECTION_FAILED_ALREADY_IN_USE";
        }
        switch (i) {
            case 8000:
                return "STATUS_NETWORK_NOT_CONNECTED";
            case STATUS_ALREADY_ADVERTISING /* 8001 */:
                return "STATUS_ALREADY_ADVERTISING";
            case STATUS_ALREADY_DISCOVERING /* 8002 */:
                return "STATUS_ALREADY_DISCOVERING";
            case STATUS_ALREADY_CONNECTED_TO_ENDPOINT /* 8003 */:
                return "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
            case STATUS_CONNECTION_REJECTED /* 8004 */:
                return "STATUS_CONNECTION_REJECTED";
            case STATUS_NOT_CONNECTED_TO_ENDPOINT /* 8005 */:
                return "STATUS_NOT_CONNECTED_TO_ENDPOINT";
            default:
                switch (i) {
                    case 8007:
                        return "STATUS_RADIO_ERROR";
                    case STATUS_ALREADY_HAVE_ACTIVE_STRATEGY /* 8008 */:
                        return "STATUS_ALREADY_HAVE_ACTIVE_STRATEGY";
                    case STATUS_OUT_OF_ORDER_API_CALL /* 8009 */:
                        return "STATUS_OUT_OF_ORDER_API_CALL";
                    case 8010:
                        return "STATUS_UNSUPPORTED_PAYLOAD_TYPE_FOR_STRATEGY";
                    case STATUS_ENDPOINT_UNKNOWN /* 8011 */:
                        return "STATUS_ENDPOINT_UNKNOWN";
                    case STATUS_ENDPOINT_IO_ERROR /* 8012 */:
                        return "STATUS_ENDPOINT_IO_ERROR";
                    case STATUS_PAYLOAD_IO_ERROR /* 8013 */:
                        return "STATUS_PAYLOAD_IO_ERROR";
                    case 8014:
                        return "STATUS_PAYLOAD_UNKNOWN";
                    default:
                        switch (i) {
                            case MISSING_PERMISSION_BLUETOOTH /* 8030 */:
                                return "MISSING_PERMISSION_BLUETOOTH";
                            case MISSING_PERMISSION_BLUETOOTH_ADMIN /* 8031 */:
                                return "MISSING_PERMISSION_BLUETOOTH_ADMIN";
                            case MISSING_PERMISSION_ACCESS_WIFI_STATE /* 8032 */:
                                return "MISSING_PERMISSION_ACCESS_WIFI_STATE";
                            case MISSING_PERMISSION_CHANGE_WIFI_STATE /* 8033 */:
                                return "MISSING_PERMISSION_CHANGE_WIFI_STATE";
                            case MISSING_PERMISSION_ACCESS_COARSE_LOCATION /* 8034 */:
                                return "MISSING_PERMISSION_ACCESS_COARSE_LOCATION";
                            case MISSING_PERMISSION_RECORD_AUDIO /* 8035 */:
                                return "MISSING_PERMISSION_RECORD_AUDIO";
                            case MISSING_PERMISSION_ACCESS_FINE_LOCATION /* 8036 */:
                                return "MISSING_PERMISSION_ACCESS_FINE_LOCATION";
                            default:
                                return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(i);
                        }
                }
        }
    }
}
