package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements com.five_corp.ad.internal.movie.exoplayer.n, androidx.media3.common.Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.ExoPlayer f1973a;
    public final android.os.Handler b;
    public final com.five_corp.ad.internal.view.D c;
    public final com.five_corp.ad.internal.movie.exoplayer.b d;
    public final java.lang.Long e;
    public com.five_corp.ad.internal.movie.exoplayer.p f;

    public q(androidx.media3.exoplayer.ExoPlayer exoPlayer, com.five_corp.ad.internal.view.D d, java.lang.Long l, com.five_corp.ad.internal.movie.exoplayer.b bVar) {
        this.f1973a = exoPlayer;
        exoPlayer.addListener(this);
        this.b = new android.os.Handler(android.os.Looper.getMainLooper());
        this.c = d;
        this.e = l;
        this.d = bVar;
        this.f = null;
    }

    public final void a() {
        com.five_corp.ad.internal.movie.exoplayer.p pVar = this.f;
        if (pVar != null) {
            this.b.removeCallbacksAndMessages(pVar);
            this.f = null;
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            ((com.five_corp.ad.internal.movie.exoplayer.a) this.d).k();
            return;
        }
        if (i == 3) {
            ((com.five_corp.ad.internal.movie.exoplayer.a) this.d).m();
        } else if (i != 4) {
            java.lang.String.format("onPlaybackStateChanged: %d", java.lang.Integer.valueOf(i));
        } else {
            ((com.five_corp.ad.internal.movie.exoplayer.a) this.d).l();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(androidx.media3.common.PlaybackException playbackException) {
        com.five_corp.ad.internal.t tVar;
        com.five_corp.ad.internal.movie.exoplayer.b bVar = this.d;
        int i = playbackException.errorCode;
        if (i == 5001) {
            tVar = com.five_corp.ad.internal.t.Z5;
        } else if (i != 5002) {
            switch (i) {
                case 1000:
                    tVar = com.five_corp.ad.internal.t.G6;
                    break;
                case 1001:
                    tVar = com.five_corp.ad.internal.t.E6;
                    break;
                case 1002:
                    tVar = com.five_corp.ad.internal.t.b6;
                    break;
                case 1003:
                    tVar = com.five_corp.ad.internal.t.F6;
                    break;
                case 1004:
                    tVar = com.five_corp.ad.internal.t.q6;
                    break;
                default:
                    switch (i) {
                        case 2000:
                            tVar = com.five_corp.ad.internal.t.z6;
                            break;
                        case 2001:
                            tVar = com.five_corp.ad.internal.t.v6;
                            break;
                        case 2002:
                            tVar = com.five_corp.ad.internal.t.w6;
                            break;
                        case 2003:
                            tVar = com.five_corp.ad.internal.t.u6;
                            break;
                        case 2004:
                            tVar = com.five_corp.ad.internal.t.r6;
                            break;
                        case 2005:
                            tVar = com.five_corp.ad.internal.t.t6;
                            break;
                        case 2006:
                            tVar = com.five_corp.ad.internal.t.x6;
                            break;
                        case 2007:
                            tVar = com.five_corp.ad.internal.t.s6;
                            break;
                        case 2008:
                            tVar = com.five_corp.ad.internal.t.y6;
                            break;
                        default:
                            switch (i) {
                                case 3001:
                                    tVar = com.five_corp.ad.internal.t.A6;
                                    break;
                                case 3002:
                                    tVar = com.five_corp.ad.internal.t.C6;
                                    break;
                                case 3003:
                                    tVar = com.five_corp.ad.internal.t.B6;
                                    break;
                                case 3004:
                                    tVar = com.five_corp.ad.internal.t.D6;
                                    break;
                                default:
                                    switch (i) {
                                        case 4001:
                                            tVar = com.five_corp.ad.internal.t.c6;
                                            break;
                                        case 4002:
                                            tVar = com.five_corp.ad.internal.t.d6;
                                            break;
                                        case 4003:
                                            tVar = com.five_corp.ad.internal.t.e6;
                                            break;
                                        case androidx.media3.common.PlaybackException.ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES /* 4004 */:
                                            tVar = com.five_corp.ad.internal.t.f6;
                                            break;
                                        case 4005:
                                            tVar = com.five_corp.ad.internal.t.g6;
                                            break;
                                        default:
                                            switch (i) {
                                                case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_UNSPECIFIED /* 6000 */:
                                                    tVar = com.five_corp.ad.internal.t.p6;
                                                    break;
                                                case 6001:
                                                    tVar = com.five_corp.ad.internal.t.n6;
                                                    break;
                                                case 6002:
                                                    tVar = com.five_corp.ad.internal.t.m6;
                                                    break;
                                                case 6003:
                                                    tVar = com.five_corp.ad.internal.t.h6;
                                                    break;
                                                case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                                                    tVar = com.five_corp.ad.internal.t.k6;
                                                    break;
                                                case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                                                    tVar = com.five_corp.ad.internal.t.j6;
                                                    break;
                                                case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR /* 6006 */:
                                                    tVar = com.five_corp.ad.internal.t.o6;
                                                    break;
                                                case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED /* 6007 */:
                                                    tVar = com.five_corp.ad.internal.t.i6;
                                                    break;
                                                case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED /* 6008 */:
                                                    tVar = com.five_corp.ad.internal.t.l6;
                                                    break;
                                                default:
                                                    tVar = com.five_corp.ad.internal.t.H6;
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            tVar = com.five_corp.ad.internal.t.a6;
        }
        ((com.five_corp.ad.internal.movie.exoplayer.a) bVar).b(new com.five_corp.ad.internal.s(tVar, null, playbackException, null));
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(final com.five_corp.ad.internal.movie.exoplayer.p pVar) {
        if (android.os.SystemClock.uptimeMillis() <= pVar.f1972a) {
            this.b.postAtTime(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.q$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(pVar);
                }
            }, pVar, android.os.SystemClock.uptimeMillis() + 500);
            return;
        }
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.d).b(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.I6, null, null, null));
    }
}
