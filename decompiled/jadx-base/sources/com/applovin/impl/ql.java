package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.impl.ql f1197a = new com.applovin.impl.ql.a();

    boolean a(com.applovin.impl.e9 e9Var);

    com.applovin.impl.ol b(com.applovin.impl.e9 e9Var);

    class a implements com.applovin.impl.ql {
        a() {
        }

        @Override // com.applovin.impl.ql
        public boolean a(com.applovin.impl.e9 e9Var) {
            java.lang.String str = e9Var.m;
            return androidx.media3.common.MimeTypes.TEXT_VTT.equals(str) || androidx.media3.common.MimeTypes.TEXT_SSA.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_TTML.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_MP4VTT.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_TX3G.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_CEA708.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_PGS.equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // com.applovin.impl.ql
        public com.applovin.impl.ol b(com.applovin.impl.e9 e9Var) {
            java.lang.String str = e9Var.m;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/dvbsubs":
                        return new com.applovin.impl.i7(e9Var.o);
                    case "application/pgs":
                        return new com.applovin.impl.jh();
                    case "application/x-mp4-vtt":
                        return new com.applovin.impl.pf();
                    case "text/vtt":
                        return new com.applovin.impl.yr();
                    case "application/x-quicktime-tx3g":
                        return new com.applovin.impl.lp(e9Var.o);
                    case "text/x-ssa":
                        return new com.applovin.impl.xk(e9Var.o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new com.applovin.impl.y2(str, e9Var.E, androidx.media3.extractor.text.cea.Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
                    case "text/x-exoplayer-cues":
                        return new com.applovin.impl.h8();
                    case "application/cea-708":
                        return new com.applovin.impl.z2(e9Var.E, e9Var.o);
                    case "application/x-subrip":
                        return new com.applovin.impl.jl();
                    case "application/ttml+xml":
                        return new com.applovin.impl.fp();
                }
            }
            throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }
}
