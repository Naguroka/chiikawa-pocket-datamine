package com.bykv.vk.openvk.bg.bg.IL.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg {
    com.bykv.vk.openvk.bg.bg.IL.IL.zx.zx IL;
    java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> bg;

    public abstract boolean IL();

    public abstract java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> bX();

    public abstract int bg();

    protected java.lang.String bg(int i) {
        switch (i) {
            case 200:
                return "OK";
            case com.ironsource.g3.c.b.b /* 201 */:
                return "Created";
            case com.ironsource.g3.c.b.c /* 202 */:
                return "Accepted";
            case com.ironsource.g3.c.b.d /* 203 */:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case com.ironsource.g3.c.b.f /* 205 */:
                return "Reset Content";
            case com.ironsource.g3.c.b.g /* 206 */:
                return "Partial Content";
            default:
                switch (i) {
                    case com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT /* 300 */:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    default:
                        switch (i) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case 404:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case 406:
                                return "Not Acceptable";
                            case 407:
                                return "Proxy Authentication Required";
                            case 408:
                                return "Request Time-Out";
                            case 409:
                                return "Conflict";
                            case 410:
                                return "Gone";
                            case 411:
                                return "Length Required";
                            case com.bytedance.sdk.openadsdk.TTAdConstant.IMAGE_URL_CODE /* 412 */:
                                return "Precondition Failed";
                            case com.bytedance.sdk.openadsdk.TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                                return "Request Entity Too Large";
                            case com.bytedance.sdk.openadsdk.TTAdConstant.VIDEO_URL_CODE /* 414 */:
                                return "Request-URI Too Large";
                            case com.bytedance.sdk.openadsdk.TTAdConstant.VIDEO_COVER_URL_CODE /* 415 */:
                                return "Unsupported Media Type";
                            default:
                                switch (i) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case 504:
                                        return "Gateway Timeout";
                                    case 505:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    public abstract java.lang.String bg(java.lang.String str, java.lang.String str2);

    public abstract java.io.InputStream eqN();

    public abstract java.lang.String ldr();

    public abstract java.lang.String zx();

    public com.bykv.vk.openvk.bg.bg.IL.IL.zx.zx iR() {
        return this.IL;
    }

    protected com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL bg(java.lang.String str) {
        java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> list;
        if (str != null && (list = this.bg) != null && list.size() > 0) {
            for (com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL il : this.bg) {
                if (str.equals(il.bg)) {
                    return il;
                }
            }
        }
        return null;
    }
}
