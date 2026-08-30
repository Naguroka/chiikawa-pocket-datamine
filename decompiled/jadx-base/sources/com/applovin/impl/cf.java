package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.impl.cf f677a = new com.applovin.impl.cf.a();

    boolean a(com.applovin.impl.e9 e9Var);

    com.applovin.impl.bf b(com.applovin.impl.e9 e9Var);

    class a implements com.applovin.impl.cf {
        a() {
        }

        @Override // com.applovin.impl.cf
        public boolean a(com.applovin.impl.e9 e9Var) {
            java.lang.String str = e9Var.m;
            return androidx.media3.common.MimeTypes.APPLICATION_ID3.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_EMSG.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_SCTE35.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_ICY.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_AIT.equals(str);
        }

        @Override // com.applovin.impl.cf
        public com.applovin.impl.bf b(com.applovin.impl.e9 e9Var) {
            java.lang.String str = e9Var.m;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new com.applovin.impl.a1();
                    case "application/x-icy":
                        return new com.applovin.impl.ta();
                    case "application/id3":
                        return new com.applovin.impl.wa();
                    case "application/x-emsg":
                        return new com.applovin.impl.w7();
                    case "application/x-scte35":
                        return new com.applovin.impl.tk();
                }
            }
            throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }
}
